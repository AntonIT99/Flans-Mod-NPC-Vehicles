# Alpha 13 CustomNPC target-search optimization report

## Original acquisition path

CustomNPC+ 1.11.1 installs `EntityAIClosestTarget` at priority 2 for a non-passive NPC. Its `shouldExecute` path uses `targetChance = 4`, temporarily sets follow range to `stats.aggroRange`, creates one AABB expanded by the complete aggro radius horizontally and half that radius vertically, and calls `World.selectEntitiesWithinAABB` for `EntityLivingBase` with `NPCAttackSelector`.

`NPCAttackSelector` checks life/type/range, optionally performs a line-of-sight test, applies return-to-start rules, jobs/roles, player faction rules, NPC faction rules, creative-player rejection, DBC KO state, and Pixelmon compatibility. The returned list is fully sorted with Minecraft's nearest-target comparator and element zero is selected.

While an acquisition task is idle, that makes a full configured-radius query approximately once per four eligibility checks. With a 512-block aggro setting, the original query is `expand(512, 256, 512)`. When the target task owns a valid target, normal `EntityAITarget` continuation maintains it instead of repeatedly entering discovery. The higher-priority `EntityAIHurtByTarget` remains responsible for rapid retaliation.

## New progressive search

Alpha 13 intercepts only the closest-target acquisition attempt and applies to all CustomNPC+ NPCs, as requested. It preserves the existing `NPCAttackSelector`, so faction, role/job, player, NPC, DBC, Pixelmon, invisibility, return-to-start, and LOS eligibility rules are unchanged.

Search bands and default intervals are:

| Band | Interval |
| --- | ---: |
| 0-32 blocks | 5 ticks |
| 32-64 blocks | 10 ticks |
| 64-128 blocks | 20 ticks |
| 128-256 blocks | 40 ticks |
| 256-384 blocks | 80 ticks |
| 384-configured maximum (up to 512) | 160 ticks |

Each AI instance retains a next-due tick for every band. At most one due band is searched by an acquisition check, with closer due bands taking priority. Due times receive a stable entity-ID-derived offset, spreading NPC searches across server ticks.

For bands beyond 32 blocks, six AABB slabs cover only the space between the new outer box and the previously searched inner box. Minecraft therefore does not enumerate the complete inner cube again for every larger band. A cheap inner-box guard runs before the original selector to prevent overlap candidates from repeating faction/LOS work.

Candidates accepted by the original selector are scanned once with squared distance and the closest is retained. The returned list is not fully sorted. No background threads or asynchronous world access are used.

The configured combat range is not reduced. A 512-block target remains discoverable, but the outermost shell normally runs once per 160 ticks rather than a maximum cube approximately once per four idle acquisition checks. Nearby targets retain a five-tick default response band. Hurt-by-target behavior was not changed.

## LOS, budgeting, and profiling

LOS semantics and refresh frequency for plausible acquisition candidates were not changed, because moving LOS behind faction checks would require duplicating and potentially diverging from CustomNPC+'s selector behavior. Shell filtering does prevent already searched inner candidates from reaching that LOS check again during an outer-band query.

No global per-world budget was added in this version. Per-NPC stable staggering plus one-band-per-attempt limits are lower-risk and avoid starvation/fairness issues. A global budget can be considered after measurements from large battles.

Debug counters are present and disabled by default. When enabled, they report aggregated searches per band, selector checks, estimated LOS checks, acquisitions, and search CPU time about once per minute. No before/after runtime profiling numbers are claimed because an instrumented server battle was not available during the build.

## Configuration

Category: `CustomNPC Target Search Optimization`

- `EnableProgressiveTargetSearch=true`
- `NearSearchInterval=5`
- `CloseSearchInterval=10`
- `MediumSearchInterval=20`
- `LongSearchInterval=40`
- `DistantSearchInterval=80`
- `MaximumSearchInterval=160`
- `DebugTargetSearchProfiling=false`

Setting `EnableProgressiveTargetSearch=false` restores CustomNPC+ 1.11.1's original closest-target acquisition path. It does not disable earlier Wolff fixes or Alpha 12 rendering work.

## Files modified

- `src/main/java/com/wolffsmod/WolffNPCMod.java`
- `src/main/java/com/wolffsmod/config/TargetSearchConfig.java`
- `src/main/java/com/wolffsmod/customnpc/TargetSearchProfiler.java`
- `src/main/java/com/wolffsmod/mixin/MixinEntityAIClosestTargetProgressive.java`
- `src/main/resources/wolffsmod.mixins.json`

Alpha 12 rendering source was not modified as part of this task.

## In-game/server validation required

- One NPC and hostile target at 10 blocks: acquisition should occur within roughly 5 ticks plus AI scheduling.
- One NPC and eligible target around 500 blocks: acquisition should eventually occur, normally within the outer-band schedule window.
- 50+ idle NPCs: use debug counters and a server tick profiler to confirm staggered bands and reduced acquisition CPU/spikes.
- 50+ NPCs with distant targets: verify distribution and acquisition fairness.
- Existing-target maintenance and immediate retaliation after damage.
- Every faction, player/NPC target type, direct-LOS setting, tactical variant, return-to-start rule, and mounted/Wolff vehicle behavior used by the server.
- Dedicated server startup with CustomNPC+ 1.11.1 and both supported Flan forks.

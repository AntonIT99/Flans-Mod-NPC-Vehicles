# Alpha 19: search-local NPC ground-path block cache

## Evidence and scope

The supplied ten-minute benchmark shows 625 ground searches, 24.16 ms mean search time and 666.53 ms worst search time. The eight slowest measured ticks spent most of their time inside pathfinding. Pause gaps explain much of the reduced wall-clock TPS, not these within-tick searches.

Inspection of Forge 1.7.10 PathFinder shows repeated world block reads in its collision checks, including a duplicate lookup of the same position and revisiting positions from neighboring candidate nodes. Ranged movement already retries on a staggered ten-tick cadence. This update leaves that cadence and tactical AI alone rather than stacking additional throttling onto it.

## Change

Reuse block-type lookup results during ONE synchronous ground path search for a CustomNPC entity. Both humanoids and Wolff vehicles qualify. The cache uses 8,192 direct-mapped slots with exact XYZ comparisons; collisions cause fresh reads, not wrong-position reuse. It uses bounded primitive arrays and block references, approximately 160–200 KiB per participating thread depending on reference size. There are no per-lookup object allocations. It retains no world/entity reference outside a search.

The original collision logic still executes, including door metadata, movement checks, water/lava handling and entity-size checks. The search algorithm, node order, heuristic, allowed distance and final route are not changed. No complete paths are cached. There are no new node limits, shortened ranges, delayed retries, skipped AI ticks or off-thread searches. Alpha 18 renderer measurements remain included; renderer source is unchanged.

The cache is invalidated on entry and exit. A try/finally scope handles normal results and exceptions. Nested searches bypass caching and invalidate the outer cache. Other entities and flying navigation do not activate the cache. Calls outside an active scope fall through to the original world lookup.

## Compatibility limitation

This assumes block types do not change during one synchronous path search. Normal terrain edits between ticks/searches are observed immediately in the next search. Unusual mods that mutate block types inside collision/path-search callbacks could violate that assumption; turn the option off if their behavior differs. Metadata/movement callbacks themselves are not cached. Other coremods that redirect these exact PathFinder calls can conflict; in-game startup still needs verification. No Flan or CustomNPC jar was edited.

## Configuration and rollback

Existing Wolff config, category `NPC Path Performance`:

`Cache NPC path block reads=true`

Set false and restart for baseline world reads. Use the server's setting on dedicated servers; no client synchronization is needed for this server-side implementation choice. Keep combat/navigation/view settings at their existing values (including 512). The benchmark text records the option value. Alpha 18 jar/source remain untouched. Install only one Wolff jar.

## Testing

Run `/wolffserverbenchmark 60 5 alpha19-cache-on`, without pausing, in the same terrain with the same NPCs/targets. Repeat several times; AI routes make runs variable. Then disable the option, restart and repeat with `alpha19-cache-off`. Compare path searches, mean/worst search time, P99 tick time and ticks over 50 ms, not just wall-clock TPS. Check pursuit around obstacles, target switching, moving targets, doors, water/lava, terrain changes, and Hit & Run/Dodge/Surround/Ambush/Stalk. Repeat in a dedicated-server setup when available.

No speedup is claimed yet. Cache overhead may outweigh savings in easy searches. It avoids repeated world reads, not all collision computations or excessive node expansion, so expensive searches may remain.

Validation performed: Java 8 Gradle build; isolated cache tests for reuse, negative coordinates, hash collisions, world isolation, nested scopes and invalidation between searches; generated mapping inspection. Existing eight NPC Mixin warnings remain. This does not replace live Mixin startup, route-equivalence or dedicated-server testing.

## Source inventory

Added `customnpc/PathBlockCache.java`, `mixin/MixinNPCPathBlockCache.java`, three test files under `tools/path-cache-tests/`, and this guide.

Modified `WolffNPCMod.java` (one option), `benchmark/ServerBenchmark.java` (report option), and `src/main/resources/wolffsmod.mixins.json` (register hook). No existing AI, navigation behavior, rotation, render, network or model source was modified.

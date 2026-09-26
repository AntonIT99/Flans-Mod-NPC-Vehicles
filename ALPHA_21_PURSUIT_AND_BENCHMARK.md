# Alpha 21: conservative pursuit reuse and benchmark clarity

Built on Alpha 20. Keep its jar and source for rollback; install only one Wolff jar. No CustomNPC/Flan/Angelica/compatibility jar modifications. Existing renderer code, gradual aiming, geometry, network and saved-world formats are unchanged. Combat/navigation/view settings remain unchanged, including 512.

## Partial pursuit paths

Only the existing ranged AI's direct entity-pursuit call is affected, and only with Default tactics and the exact vanilla ground PathNavigate implementation. Flying, custom navigator subclasses, melee pursuit, and tactical XYZ destinations are untouched. The diagnostic trace does not identify the requesting AI, so this conservative first change is NOT guaranteed to catch every previously observed slow search.

An accepted, unfinished partial route is eligible only if the previous movement request cost more than 50 ms. On the existing ten-tick retry cadence, it may reuse that same active path if:

- Same target object and same active path object.
- Path is less than 20 simulation ticks old (nominally one second; wall time can be longer during lag).
- Target moved at most four horizontal blocks and four vertical blocks from the previous search destination.
- NPC progressed at least 0.25 horizontal blocks since the last search/reuse check.
- Endpoint is within eight horizontal blocks of the current normalized target destination.

The movement speed remains the original 1.0 value. Expiry, loss of progress, changed/finished path, changed target or exceeded bounds causes the normal retry at the existing cadence. It does not instantly introduce an extra search outside that cadence. Initial searches and complete paths are unchanged; there is no node cap, new global throttle or destination-height adjustment. The routine can skip at most one regular retry for an eligible path under the usual ten-tick cadence. It intentionally does not cache null failures. A moving target can briefly be pursued using the older route; obstruction handling still depends on the existing navigator plus the conservative progress/expiry checks.

Config, existing `NPC Path Performance` category:

`Reuse expensive partial pursuit paths=true`

Set false and restart to restore Alpha 20 pursuit requests. This is server simulation behavior; configure the server when using multiplayer. No client sync is required for this internal server option. The block-cache option remains independent. Server benchmark reports now include the reuse option and number of skipped/reused requests during measurement. Timer overhead: two nanoTime calls per attempted default ground pursuit refresh while enabled, not per path node.

## Benchmark fixes

- Client abort reports include the exact GUI class name, with pause and focus loss distinguished.
- Warmup aborts explicitly say no measurement was collected.
- Cache activity during an aborted warmup is reported as zero measured cache activity.
- Client text reports include measurement-start and stop epoch milliseconds, plus stop phase.
- Server status reports elapsed/requested seconds as well as tick count, instead of just tick count. Client status already uses seconds.
- Existing real-time clocks, GUI abort policy and separate command start times remain unchanged. No arbitrary modded screen is treated as chat merely by its name. These diagnostics will identify any problematic modded chat screen before adding exceptions.

## Test

Run `/wolffserverbenchmark 120 10 alpha21` and `/wolffbenchmark 120 10 alpha21` in sequence; close chat, do not pause or open menus. Commands are independent, not exactly synchronized. During server measurement, reproduce the pursuit problem. Send both text reports. Compare with reuse disabled using the same scenario and unchanged block-cache setting; repeat runs because routes vary. Check initial pursuit, moving/changed targets, doors/obstacles, path completion and default NPC movement. Verify tactical variants remain unchanged. Also deliberately open an inventory during warmup once to verify the explicit abort-screen report and zero measured counters.

Build and policy-boundary tests pass; client/server report regression tests run separately. Existing eight NPC mixin warnings remain. These checks do not establish live route equivalence, compatibility with every navigator/coremod, or dedicated-server startup. FPS/server speedup is unproven until in-game A/B results.

Changed sources: `WolffNPCMod.java`, `mixin/MixinEntityAIRangedAttack.java`, `benchmark/VehicleBenchmark.java`, `benchmark/ServerBenchmark.java`. Added `customnpc/PartialPursuitReuse.java`, `customnpc/PursuitReusePolicy.java`, `tools/PursuitReusePolicyTest.java`, and this guide.

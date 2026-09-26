# Alpha 20: slow ground-path diagnostics

Adds measurement to Alpha 19, not another pathfinding optimization. Existing 512-block settings, block cache, tactical timing, renderer, aiming and AI behavior are unchanged. Keep Alpha 19 jar/source as rollback. Install one Wolff jar only.

Run `/wolffserverbenchmark 120 5 slow-path-test` without pausing. Exercise the problematic pursuit/terrain during measurement. Reports remain under the server's `logs/wolff-benchmarks/` directory (the instance `.minecraft` directory for integrated single-player).

The text report adds `SLOW GROUND PATH SEARCHES (>50 ms)`. For each retained search it records measurement-relative start time, elapsed milliseconds, dimension, NPC display name and entity ID, NPC starting coordinates, requested destination, straight-line distance, supplied search range, dequeued node count, result, final path-point coordinates and recentSameDestination.

Result is `failed-null`, `partial`, or `reached`. Reached compares the final path point with the ground pathfinder's normalized goal: floor(destination X/Z minus half entity width), floor(destination Y). It describes the computed route, not arrival or a guarantee that the NPC can subsequently follow it. Nodes count dequeues, not unique blocks or every neighbor tested. The optional node hook reports unavailable if not observed.

Repeat means the immediately previous measured ground search for that dimension/entity ID requested the same normalized destination within five wall-clock seconds. Fast searches update history too. Only 256 NPC histories are kept, evicting the oldest inserted when full. No entity/world objects are retained. The first 256 slow searches are written; an omitted count reports overflow. Records reset each benchmark. Flying path timing still works but flying searches are not detailed in this update.

No new file writes or console logging occur during searches. Slow-record formatting happens in memory after the existing path timing is captured; it can slightly increase inclusive NPC/tick time. Node instrumentation is a primitive counter and forwarding call, without per-node callback objects. Outside benchmarks it only checks the inactive token and forwards the original dequeue. Benchmark entry/exit hooks remain present; overhead is not zero and is uncalibrated. No search cutoff or heuristic is changed. The text report owns these new fields; existing tick CSV schema is unchanged.

Validation: Java 8 build, bounded-log threshold/repeat/expiry/cap tests, server report regression tests, source-scope comparison and generated mapping checks. Existing eight NPC Mixin warnings remain. Live mixin application, other coremod compatibility and dedicated-server startup need in-game testing. Ground node-hook conflicts may leave the optional count unavailable. Diagnostic extraction errors disable further detailed records for that run and are reported, without intentionally changing the original path result.

Changed source: `benchmark/ServerBenchmark.java`, `benchmark/ServerBenchmarkData.java`, `benchmark/ServerBenchmarkReport.java`, `mixin/MixinBenchmarkPathFinder.java`. Added `benchmark/SlowPathLog.java`, `tools/SlowPathLogTest.java` and this guide. No other gameplay/render source changes.

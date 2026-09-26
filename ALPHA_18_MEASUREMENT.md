# Alpha 18: validation versus drawing measurements

Measurement-only addition to Alpha 17. No cache eligibility, model, texture, animation, aiming, AI, networking, or OpenGL command changes. Replace the Wolff jar; do not install both versions. Alpha 17 and its matching source archive remain rollback copies.

Run `/wolffbenchmark 60 5 alpha18-test` while stationary. This means 60 measured seconds after 5 seconds of warmup. Keep menus closed. Reports remain in `.minecraft/logs/wolff-benchmarks/`.

The text report gains four CPU elapsed totals in milliseconds:

- Cache validation and bookkeeping: cache lookup, eligibility and pose checks, list-state query, invalidation and bookkeeping, excluding timed parent compilation and replay. This is not exclusively reflection time.
- Cached drawing including live state setup: parent-list replay and its blend/matrix setup and restoration. The blend-policy decision immediately before this call remains in validation/bookkeeping.
- Parent cache compilation: creation of the parent display list, separate from replay.
- Original-path drawing: uncached element rendering, including any internal state checks or initial child geometry compilation.

These cover group rendering only, not every operation in the outer vehicle renderer. Driver waiting can occur within these CPU scopes. They do not measure GPU execution directly and introduce no `glFinish`/synchronization. On an aborted run they can include the final incomplete frame, whereas ordinary sampled frame totals exclude it. Prefer completed runs. Divide a phase total by completed frames for an approximate ms/frame comparison on completed runs.

Timers run only during measurement, not warmup or normal gameplay. Counters are primitive, with no per-group allocation or logging. There are approximately four nanoTime calls per cached group (outer scope plus replay), more if compiling. Overhead is uncalibrated and can matter with thousands of group calls per frame; compare phase proportions and do not interpret this instrumented run as a clean Alpha 17 speed comparison.

Existing CSV formats are unchanged; new phase totals are text-report-only. Existing client/server commands still work. No server profiling code changed and the new helper is reached only from existing client renderer/benchmark paths.

Source changes: `render/StaticModelGroupCache.java` timing wrappers, `benchmark/VehicleBenchmark.java` lifecycle/report capture; new `render/RenderPhaseTiming.java`, `tools/RenderPhaseTimingSelfTest.java`, and this guide.

Validation: Java 8 build and phase lifecycle/report self-test. Existing eight NPC mixin target warnings remain. Live rendering under OptiFine, Angelica, and both Flan forks still needs in-game testing. This update intentionally does not optimize anything.

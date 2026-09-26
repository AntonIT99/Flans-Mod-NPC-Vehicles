# Alpha 16 — client humanoid/vehicle and server NPC benchmark

Alpha 16 extends Alpha 15 with **measurement only**. It does not optimize AI/pathfinding/rendering, change ranges or aiming, modify models, or integrate TAP behavior. Use the same single Wolff jar with either supported Flan fork. Keep OptiFine and Angelica in separate installations, never together. Alpha 15's jar and matching source archive remain unchanged for rollback.

## Quick start: measure both sides

Install the Alpha 16 jar in place of the previous Wolff jar on your client and your dedicated server. Do not install two Wolff versions together. In single-player the same jar provides both commands.

Run these commands with a matching scene label:

```text
/wolffserverbenchmark 60 5 scene-A
/wolffbenchmark 30 5 scene-A
```

The longer server run surrounds the client test. These are separate clocks/runs, not automatically synchronized; no profiling samples are sent over the network. To compare server runs fairly, use the same server duration in every test. For closely aligned 30-second measurements, start a 30-second server test from a separate console just before the 30-second client test. Record the labels and timestamps.

The client command requires no permissions. The server command requires operator permission level 2, single-player cheats, or the server console. In the console omit the leading slash.

Both commands accept `[seconds 1-600] [warmup 0-60] [label]`, defaulting to 30 seconds plus 5 seconds warmup. A numeric second argument is warmup, otherwise it starts the label. Both support `stop` (partial report) and `status`. Client-only `mark <label>` remains available.

## Where reports go

- Client: the active instance's `.minecraft/logs/wolff-benchmarks/`.
- Dedicated server: `logs/wolff-benchmarks/` under the **server's** data directory, not the player's computer.
- Single-player server: `logs/wolff-benchmarks/` under the integrated server's data directory, normally the same instance directory.
- Client names start `wolff-benchmark-`; server names start `wolff-server-benchmark-`.
- Both write timestamped text and CSV files. Chat/log output gives the absolute text report path.
- The client summary now uses **`wolff-benchmark-summary-v2.csv`**, adding humanoid columns without changing or appending incompatible rows to Alpha 15's summary. There is no server aggregate summary file; each server run has its own summary text and per-tick CSV.

Report writing happens after recording, on a background worker that owns only finished samples and never accesses Minecraft/world/OpenGL state. Server output is logged even if the requesting player has disconnected. Shutdown saves a partial server report marked ABORTED; its writer is allowed to finish. Filenames cannot traverse directories and existing reports are not overwritten.

## New client humanoid measurements

The report has separate **Wolff vehicle** and **humanoid CustomNPC** sections. Each reports per-frame unique rendered counts and CPU-side model timing; these categories are not mixed. World entity IDs are deduplicated per frame, while repeated model/armor/overlay passes contribute time.

Exact added hook: `MixinBenchmarkHumanoid` observes `ModelMPM.render` / `func_78088_a`, beginning immediately before the native humanoid branch's `setPlayerData(EntityCustomNpc)` call and ending at method return. This is after CustomNPC+'s scripted-invisibility early return and is not reached by the substituted entity/vehicle model branch. Only `EntityCustomNpc` instances in the measured world count. Players, vanilla mobs, substituted creature models and scripted-hidden early returns do not count. "Rendered" means submitted model work, not guaranteed visible pixels; fully hidden body parts, occlusion and extra shader passes are not GPU-tested.

This scope includes native ModelMPM armor/overlay work but **not separately invoked Flan armor, held-item, nametag, or other renderer work outside the native model call**. Vehicle timing still uses the six existing Wolff model wrappers described below. Optional TMT element/display-list counters remain vehicle-only; they do not pretend to count humanoid geometry. Neither category uses GPU timer queries.

Humanoid count/time columns were added to per-frame CSV and the v2 summary. If no humanoid hook was observed, the text says unexercised/unavailable and its CSV columns are blank, not a guessed zero. A humanoid metric failure disables that metric; a vehicle metric failure no longer shuts down humanoid recording.

## New server measurements

`/wolffserverbenchmark` records all loaded dimensions, not merely what one client can see. The included workload covers native humanoids **and vehicle NPCs**. Server NPC update totals are combined across model types, rather than split into rendering categories. Vanilla mobs and players contribute to whole-server tick time but are excluded from NPC/path counters.

Measured:

- Completed ticks, elapsed wall time and observed TPS (capped at the normal 20).
- Mean, p95, p99 and worst server work milliseconds per tick; ticks over the 50 ms budget.
- Largest gap from a completed tick to the next tick start, to expose pauses/scheduling gaps separately from work time.
- Inclusive `EntityCustomNpc.onUpdate` calls/time, including existing NPC AI, navigation, scripts and Wolff vehicle updates.
- Ground path search calls/time through vanilla `PathFinder`'s private `createEntityPathTo(Entity,double,double,double,float)` method. Both public forwarding overloads reach this once.
- Flying path search calls/time through CustomNPC+'s separate `FlyPathFinder` private double-coordinate search, without counting bridge/forwarding methods twice.
- Average and worst path search time, and queries returning null.
- Calls/time for the existing progressive nearest-target search when enabled.
- Minecraft/Forge/Java/OS, dedicated/integrated mode, configured combat/navigation/view ranges, target-search configuration state, start/end used heap and maximum heap.

Tick time is `System.nanoTime()` from FML ServerTick START to END; it includes server work and GC/OS stalls, excludes intentional between-tick sleep, and is not isolated thread CPU time. TPS uses completed ticks divided by elapsed measurement seconds. Path/target timings **overlap inclusive NPC update time**: do not add them together. Zero observed optional path hooks are marked unexercised/unavailable; another mod replacing a pathfinder may bypass the hooks.

Limits: `EntityCustomNpc.onUpdate` timing is not exclusive AI time. Navigator following/cache checks and World path setup outside the measured finder method are excluded from search time but generally remain in inclusive NPC update time. Off-server-thread pathfinding is excluded. Non-null partial paths need not reach their destination, so a null count is not a success rate. Progressive target timing does not cover the original target search when the progressive feature is disabled. No per-NPC identity/type breakdown or server GC attribution is added. This measures cost; it does not prove tactical behavior or path correctness at 512 blocks.

Server CSV has one primitive sample row per completed tick with elapsed/tick time, update/search counts and timings. Time columns are **nanoseconds**, explicitly labeled. Stop during a tick excludes its unfinished row. Warmup is excluded. Server benchmarking continues independently of client focus, menus, dimension changes, and individual disconnects. **Do not pause a single-player test**: server elapsed time includes inter-tick pauses and the largest-gap field exposes them. The server cannot infer client focus/pause from a remote connection. The client retains Alpha 15's abort-on-pause/focus-loss behavior.

## Fair 128–512 block tests

Combat and navigation ranges are independent. This release does not raise either setting: `MaximumNPCCombatRange=512` does not automatically change `NPCNavigationRange` from its existing value (default 128). Record both values and restart after navigation-range changes. A high combat range also does not force unloaded chunks to tick or paths to succeed.

Use the same world, loaded chunks, terrain, NPC count, target placement, tactical variants, NPC movement/ranged settings, players and range configuration for each server comparison. Test stationary/idle, target acquisition, sustained combat and movement separately. Restore the same scene between runs. Compare MSPT/p99/worst and path counts as well as FPS; a run doing fewer searches is not necessarily a faster implementation. A 50 ms server work budget corresponds to 20 TPS. Low FPS and high MSPT are different bottlenecks.

For renderer comparisons, keep the same camera, resolution, graphics, cap, VSync, shader state and visible NPC count. Use the identical Alpha 16 jar with OptiFine, Angelica or plain Forge, changing only the renderer. Repeat runs. In single-player both render and server threads share one machine, so their resource contention is part of the result. Reports with ABORTED/PARTIAL status or different workload are not directly comparable.

## Overhead and validation

No per-frame/tick file writes or logging, global GL hooks, geometry scans, forced GC, AI scheduling changes, or new benchmark packets. Counters are primitive. Client sample storage now uses about 48 bytes per frame (about 2.9 MB allocated for a default 30-second/2,000-FPS-capacity run), plus fixed entity-ID sets. Server storage is bounded, preallocated before warmup, and modest (1,300 rows for a 30-second run). Each measured model/update/search takes two clock reads; path and humanoid Mixin callbacks can allocate small per-call objects, even when inactive. There are no per-element humanoid timers. **Actual FPS/TPS overhead is uncalibrated**, not guaranteed zero. Use matching profiler versions and repeated idle/profiling runs to check it.

Java 8 report tests cover client lows/percentiles, humanoid separation, unavailable metrics, server TPS/MSPT/path totals, empty/partial reports, collision-safe names, CSV alignment and summary preservation. The source-scope test compares against the preserved Alpha 15 archive and verifies that existing model/aiming/AI behavior is unchanged after stripping only the new timing wrapper/counter. Build includes Forge compilation and reobfuscation; the ground-path selector is checked in the generated refmap. Live OptiFine, Angelica, TAP/Ultimate and dedicated-server gameplay must still be tested; no live performance numbers are claimed.

## Alpha 16 files changed

Modified source/resource files (relative to project root):

- `src/main/java/com/wolffsmod/WolffNPCMod.java`: server command, lifecycle and tick-listener registration.
- `src/main/java/com/wolffsmod/mixin/MixinEntityCustomNpc.java`: try/finally update timing only; original body unchanged.
- `src/main/java/com/wolffsmod/mixin/MixinEntityAIClosestTargetProgressive.java`: record the existing elapsed search time only.
- `src/main/java/com/wolffsmod/benchmark/VehicleBenchmark.java`: separate humanoid recording and range/context metadata.
- `src/main/java/com/wolffsmod/benchmark/BenchmarkSamples.java`: primitive humanoid samples.
- `src/main/java/com/wolffsmod/benchmark/BenchmarkRun.java`: humanoid hook/failure state.
- `src/main/java/com/wolffsmod/benchmark/BenchmarkReport.java`: humanoid summary/CSV and safe v2 summary schema.
- `src/main/resources/wolffsmod.mixins.json`: client-only humanoid and common server-path measurement hooks.

Added source files:

- `src/main/java/com/wolffsmod/benchmark/ServerBenchmark.java`
- `src/main/java/com/wolffsmod/benchmark/ServerBenchmarkCommand.java`
- `src/main/java/com/wolffsmod/benchmark/ServerBenchmarkData.java`
- `src/main/java/com/wolffsmod/benchmark/ServerBenchmarkReport.java`
- `src/main/java/com/wolffsmod/mixin/MixinBenchmarkHumanoid.java`
- `src/main/java/com/wolffsmod/mixin/MixinBenchmarkPathFinder.java`
- `src/main/java/com/wolffsmod/mixin/MixinBenchmarkFlyPathFinder.java`

Tests/docs: modified `tools/BenchmarkSelfTest.java` and `BENCHMARK_GUIDE.md`; added `tools/ServerBenchmarkSelfTest.java` and `tools/VerifyBenchmark16Scope.ps1`. No build/config format or mod version changes. Update numbers appear only in release artifact filenames; matching source is archived for rollback.

---

# Alpha 15 reference — inherited vehicle measurement details

The section below documents the retained Alpha 15 implementation. Where it describes vehicle-only measurement, no server command, the old summary filename, older storage size or the Alpha 14 baseline, the Alpha 16 additions above supersede it. Its file list is historical, not an additional set of Alpha 16 edits.

This release adds measurement to Alpha 14. It does not optimize rendering or modify AI, geometry, aiming, networking, graphics options, OptiFine, or Angelica. Use either optional renderer separately. All previous Alpha 14 behavior is retained.

## Commands

- `/wolffbenchmark`: 5-second warmup, then 30 seconds of measurement.
- `/wolffbenchmark 10`, `30`, or `60`: duration in seconds; warmup remains 5 seconds.
- `/wolffbenchmark 30 angelica`: duration plus optional label.
- `/wolffbenchmark 30 5 optifine scene-A`: duration, warmup, and label.
- `/wolffbenchmark stop`: save the completed frame samples as PARTIAL.
- `/wolffbenchmark status`: display warmup/measurement/write status.
- `/wolffbenchmark mark angelica`: set the default label for the next run.

Duration is 1–600 seconds; warmup is 0–60 seconds. A numeric second argument is interpreted as warmup. Labels may contain spaces and are sanitized for filenames. No permissions, server command, benchmark packets, or main-config changes are required.

## Reports

Reports are created in the active Minecraft instance:
`.minecraft/logs/wolff-benchmarks/`

Each run produces:

- `wolff-benchmark-<timestamp>-<label>.txt` — authoritative summary and metric definitions.
- A matching per-frame `.csv`.
- One row appended to `wolff-benchmark-summary.csv`, including COMPLETE/PARTIAL/ABORTED status.

Completion chat prints the absolute text-report path. Files use CREATE_NEW and collision suffixes. Summary appends are serialized with a file lock, validate the existing header and final newline, and preserve incompatible or incomplete files. CSV failures are noted in the surviving text report and in chat. No files are written during warmup or measurement. Afterward an exclusively owned data snapshot is passed to a background writer; that writer never accesses Minecraft, world, or OpenGL state. Chat messages return through a client-tick queue.

## Frame statistics

The profiler takes `System.nanoTime()` readings at consecutive FML `RenderTickEvent.START` events. The interval includes intervening world/client updates, rendering, presentation and frame-cap waits. It is not Minecraft's F3 FPS estimate and is not a GPU timer.

- Total frames = the number of completed sampled intervals.
- Average FPS = frame count / sum of frame durations in seconds.
- Median frame time = the middle sorted duration, averaging the two middle values for an even count.
- Median FPS = reciprocal of median frame duration.
- Minimum/maximum instantaneous FPS = reciprocals of longest/shortest sampled durations.
- 1% low = reciprocal of the mean duration of the slowest `ceil(N × 0.01)` frames.
- 0.1% low = reciprocal of the mean duration of the slowest `ceil(N × 0.001)` frames.
- Each low uses at least one frame; fewer than 1,000 frames gives a particularly noisy 0.1% low.
- p95/p99 frame durations use nearest-rank `ceil(percentile × N)`.
- Worst frame time is the maximum interval.

Warmup is excluded. Timing finishes at a frame boundary, so actual measured duration may be slightly longer than requested. Stops/aborts discard the unfinished transition interval. No fabricated FPS appears for zero-frame runs: unavailable statistics are N/A.

## Exact vehicle hook and counting

CustomNPC+ `RenderCustomNpc` takes the model from the Wolff renderer and invokes that model via its model proxy. Merely timing `RenderFlansModEntity.doRender` would miss this NPC path.

The benchmark therefore wraps the existing `render(Entity, float, float, float, float, float, float)` body with begin/try/finally/end in:

1. `ModelFlanVehicle`
2. `ModelFlanPlane`
3. `ModelFlanMecha`
4. `ModelFlanAAGun`
5. `ModelSdKfz251DManned`
6. `ModelSentryGun`

The last two have their own overrides. Nested subclass-to-super calls share one inclusive timer rather than double-counting. Model statements retain their original order and values, including exceptional control flow.

Only an `EntityFlanDriveableNPC` model entity in the benchmark world is counted. Its associated CustomNPC entity ID is used where available; otherwise its own ID is used. A primitive hash set deduplicates IDs per frame without allocating wrappers. Normal human NPCs, players, vanilla mobs, and unrelated model types never enter these scopes.

“Rendered” means a Wolff model entry was submitted. It does not prove that any pixels survived occlusion. Shadow/extra render passes contribute to CPU time and pass counts but do not multiply the unique vehicle count. Model render passes are reported separately.

The measured time is CPU-side elapsed time inside Wolff model calls, including driver blocking/preemption and repeated passes. Texture binding, NPC decorations, shadows or setup performed outside that scope are excluded. No glFinish, GPU query, forced synchronization, or OpenGL state change is added.

Reported vehicle metrics: unique rendered average/minimum/maximum, model passes, total CPU-side model time, average time per frame, average time per unique rendered vehicle-frame, maximum model time in one frame, and percentage of total sampled frame time.

## Optional counters

A client-only `MixinBenchmarkTurbo` adds observational argument hooks that return the original argument unchanged:

- `ModelRendererTurbo.render(float, boolean)`: entry count, including entries that return because an element is hidden. The ordinary one-float render method delegates here in the inspected Flan implementation.
- Direct `GL11.glCallList(int)` call sites inside `ModelRendererTurbo.callDisplayList()`: Java submissions, not GPU-internal nested display-list execution.
- `ModelRendererTurbo.compileDisplayList(float)`: compilation entries, including its legacy compilation branch. First compilation and recompilation are not distinguished.

These methods/call sites were checked in both supplied Ultimate and TAP jars. The hooks use primitive arguments/counters rather than per-element callback objects or nanoTime reads. Only calls inside an active Wolff model timing scope contribute. They are optional (`require=0`); a hook never observed during measurement is explicitly unconfirmed/unavailable rather than presented as a trustworthy zero.

Unavailable: body/turret/barrel/wheel/track breakdown; texture binds; other matrix/state operations; triangles/vertices; separately loaded or potentially visible vehicle count; per-type breakdown; isolated GPU cost. No world scan, geometry recount, or global GL interception is performed to guess them. Consequently this version cannot directly attribute a difference to texture binds or triangle counts.

## Environment and memory

The report records Minecraft/Forge/Java/OS, display and scaled GUI size, GUI scale, render distance, FPS caps, VSync, fancy/fast graphics, mipmaps, particle setting, FOV and third-person mode, world/dimension, player position/yaw/pitch, end position/yaw/pitch/resolution/render distance, loaded mod versions, and the Flan implementation's source name where available.

OptiFine detection uses Forge's `FMLClientHandler.hasOptifine()`; Angelica uses `Loader.isModLoaded("angelica")`. It reports either, both, neither detected, or Unknown on detection errors. No detection depends solely on filenames. OptiFine shader state is queried through its optional public `Config.isShaders()` method; unsupported/uncertain shader state (including Angelica here) is Unknown. Include the shader state in the label when Unknown.

Used/free/allocated/maximum heap are sampled at start/end. JVM GC collection-count and collection-time deltas are recorded where available. These are process-wide counters, not proof that a particular long frame was caused by GC. No forced collection is performed.

## Lifecycle and overhead

- Pause, focus loss, non-chat GUI, disconnect, world change or dimension change: write ABORTED partial results.
- Chat may remain open for status/stop; affected frames are noted. Keep it closed during fair runs.
- No overlay or countdown logging is enabled.
- No benchmark traffic is sent over the network.
- Client command, event subscription and profiler loading originate in ClientProxy. The optional mixin is only in the JSON client list; common mod initialization contains no benchmark reference.
- Outside a run: model entry/hot-counter guards immediately return. No timers, scans, samples or output run.
- During a run: two nanoTime reads per outer model pass, one frame timestamp, primitive identity checks and counters. Samples use 36 bytes/frame in arrays allocated before warmup, plus a fixed ~512 KiB identity set.
- Default capacity is `duration × 2000 + 1024` samples, capped at 600,000. A 30-second run reserves roughly 2.2 MB for samples; 60 seconds roughly 4.4 MB. Exhaustion writes a PARTIAL result instead of resizing during rendering.
- Actual profiler FPS overhead is uncalibrated and should not be claimed as a measured percentage. Keep this exact profiler build and settings identical on both sides of a comparison.

## Fair A/B procedure

1. Back up the scene. Choose a fixed camera position and direction with the same NPCs visible.
2. Use this same benchmark jar for all runs. Match resolution, render distance, graphics, particles, mipmaps, FOV, view mode, FPS cap, VSync and shaders.
3. Launch with Angelica only and run `/wolffbenchmark 30 5 angelica-no-shaders-scene-A`.
4. Restart the same instance with OptiFine only. Return to the same coordinates/yaw/pitch and run the equivalent OptiFine label.
5. Plain Forge can be tested in another restart without either optional renderer.
6. Repeat each case several times. Compare COMPLETE rows, inspect rendered vehicle counts and p99/worst frames, and retain the per-frame CSVs.
7. For Flan/TAP experiments, change only the intended implementation between otherwise matched runs, and label it. This benchmark does not import TAP behavior or time unrelated player-controlled Flan vehicle renderers.
8. Do not change shader packs or graphics options during measurement. ABORTED/PARTIAL runs are not equivalent to full-duration comparisons.

## Validation and remaining checks

Standalone Java 8 tests cover constant and hitch-heavy frame distributions, low/percentile formulas, empty samples, array limits, unique vehicle IDs across repeated passes/frames, filename sanitation, CSV quoting/columns, collision-safe reports, summary append and preservation of incompatible data.

A source comparison against the archived Alpha 14 checks that the six model method bodies become identical when the timing wrappers are removed and that no other existing gameplay source changed. Full Forge compilation/reobfuscation is run.

Live runs with OptiFine, Angelica, a dedicated server, and both Flan forks have not been executed here. Validate command registration, nonzero vehicle counts/time, optional hook availability, pause/focus/disconnect reports, and each renderer separately in-game. No benchmark result or performance explanation is claimed before those runs.

## Every source file added/modified

Paths below are relative to the project.

Modified:
- `src/main/java/com/wolffsmod/ClientProxy.java`
- `src/main/java/com/wolffsmod/model/ModelFlanVehicle.java`
- `src/main/java/com/wolffsmod/model/ModelFlanPlane.java`
- `src/main/java/com/wolffsmod/model/ModelFlanMecha.java`
- `src/main/java/com/wolffsmod/model/ModelFlanAAGun.java`
- `src/main/java/com/wolffsmod/model/wolff/ModelSdKfz251DManned.java`
- `src/main/java/com/wolffsmod/model/official/mw/ModelSentryGun.java`
- `src/main/resources/wolffsmod.mixins.json`

Added:
- `src/main/java/com/wolffsmod/benchmark/BenchmarkCommand.java`
- `src/main/java/com/wolffsmod/benchmark/VehicleBenchmark.java`
- `src/main/java/com/wolffsmod/benchmark/BenchmarkSamples.java`
- `src/main/java/com/wolffsmod/benchmark/BenchmarkStatistics.java`
- `src/main/java/com/wolffsmod/benchmark/FrameVehicleSet.java`
- `src/main/java/com/wolffsmod/benchmark/BenchmarkRun.java`
- `src/main/java/com/wolffsmod/benchmark/BenchmarkReport.java`
- `src/main/java/com/wolffsmod/mixin/MixinBenchmarkTurbo.java`
- `tools/BenchmarkSelfTest.java`
- `tools/VerifyBenchmarkScope.ps1`
- `BENCHMARK_GUIDE.md` (this guide)

Alpha 14 jar/source remain the rollback. Alpha 15 is delivered with matching source, build scripts, wrapper, libraries, tests and guide.

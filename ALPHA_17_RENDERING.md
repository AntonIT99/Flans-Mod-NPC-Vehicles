# Alpha 17: conservative automatic rendering changes

This update builds on Alpha 16. Install only one Wolff jar. No replacement models or textures are needed. Keep the Alpha 16 jar and source archive for rollback. Neither Flan's Mod nor CustomNPC+ jars are modified.

## Changes

1. Wheels are submitted once instead of twice. Their existing angle updates are retained.
2. Eligible model-part arrays can replay a parent OpenGL display list containing only existing child geometry calls and local transforms. Each group's parts, geometry-list IDs, visibility, materials and transforms are checked before reuse, including between NPCs. A changing group permanently returns to ordinary rendering until cache reset. No geometry simplification, LOD or animation freezing is added.
3. For eligible groups, matching blend setup is performed once around the group rather than per element. Empty default texture-group handling is bypassed; this does not imply that actual texture binds were occurring for every element. Textures, lighting, tint and blend setup are not baked into the parent list.

The cache accepts only reviewed ModelRendererTurbo class fingerprints: Ultimate 1.60 (production and development), the supplied older TAP, and TAP Krishna Mk6C. Unknown implementations fall back to ordinary rendering. This is conservative compatibility, not a promise to accelerate every future fork. Model subclasses, children, glow, special textures, legacy compilation, forced recompilation, changing poses, and groups outside the size limits use the original path. Bounds: 256 groups, 100,000 tracked parts, 8,192 parts per group; at most one group compilation per frame. Existing geometry must already be compiled before parent compilation. Reload/unload/disconnect queue cache deletion on the rendering thread.

## Controls

In the existing mod configuration, under `Client Side Settings`:

- `Enable safe vehicle geometry cache=true`: changes 2 and 3 together. Set false and restart for the original group rendering path.
- `Avoid duplicate vehicle wheel rendering=true`: change 1. Set false and restart to restore the old duplicate wheel submissions.

Both default to true. The older static batching option remains ignored. There are no changes to server simulation, targeting, range limits or saved NPC data. Client-only registration remains in ClientProxy.

## Measurement and testing

Use `/wolffbenchmark 30 5 alpha17` (30 seconds measured, 5 seconds warmup). Text reports now include cache status, group builds, replays, original-path calls and shared blend setups. Cached child display-list calls bypass Java ModelRendererTurbo hooks: lower Java call counts do NOT mean fewer polygons or necessarily fewer GPU draw calls. Vehicle render timing remains the useful comparison. Cache totals cover the measurement interval, including any final incomplete frame.

Compare Alpha 16 and Alpha 17 with identical world, camera, vehicle count, resolution, distance, graphics settings, FPS cap, VSync and shaders. Test OptiFine and Angelica separately, never together. Test Ultimate and TAP separately using the same Wolff jar. Include wheels, moving turrets, firing/reloading, damaged/hurt models, transparent windows, alternate skins, humanoid animations, resource reload and world reconnect. Also test dedicated-server startup with the jar installed.

Validation performed: Java 8 build; client benchmark statistics/report tests; server benchmark statistics/report tests; exact supplied-jar fingerprint tests and unknown-profile fallback; source comparison against Alpha 16. The build retains eight existing Mixin annotation-processor target warnings in unchanged NPC mixins; this update does not resolve or independently validate those runtime targets. These are not live OpenGL, OptiFine, Angelica or dedicated-server integration tests. No FPS improvement is claimed without measurements. Per-part validation uses reflection and can offset savings for some models; compare cache on/off if a scene regresses.

## Source files

Modified:
- `src/main/java/com/wolffsmod/WolffNPCMod.java`: two client options.
- `src/main/java/com/wolffsmod/ClientProxy.java`: render-tick/disconnect/reload registration.
- `src/main/java/com/wolffsmod/model/ModelFlanVehicle.java`: skip duplicate wheel submission.
- `src/main/java/com/wolffsmod/render/StaticModelGroupCache.java`: conservative cache and grouped state handling.
- `src/main/java/com/wolffsmod/benchmark/BenchmarkRun.java`: cache counter baselines.
- `src/main/java/com/wolffsmod/benchmark/VehicleBenchmark.java`: capture cache status/counter deltas.
- `src/main/java/com/wolffsmod/benchmark/BenchmarkReport.java`: explain counter interpretation.

Added:
- `src/main/java/com/wolffsmod/render/TurboRenderProfile.java`: reviewed implementation fingerprints.
- `src/main/java/com/wolffsmod/render/TurboGeometryAccess.java`: read-only geometry/material inspection.
- `src/main/java/com/wolffsmod/render/GeometrySnapshot.java`: pose/identity validation.
- `tools/RenderProfileSelfTest.java`: supplied-jar detection tests.
- `tools/VerifyRender17Scope.ps1`: comparison with Alpha 16 source archive.
- This guide.

No unnecessary rewrite, new assets, AI changes, or TAP renderer replacement was performed.

# Alpha 22: conservative group visibility and track-frame selection

Built on Alpha 21; keep that jar/source for rollback. No new models or textures required. No Flan/CustomNPC/Angelica jars modified. No AI/range/aiming/network or world-save changes.

## Visibility

This is model-GROUP culling, not a replacement of entity collision bounds or a fixed-angle/distance test. Eligible large rigid groups are omitted only if a conservative sphere lies wholly outside a plane of the active projection * model-view matrix. FOV, aspect ratio, outer translation/rotation/scale and current camera transforms are included automatically. Long ships receive bounds from their geometry, not the NPC's small collision box; no maximum ship-length cutoff is imposed. A sphere containing the camera/intersecting the view stays visible. Overlarge conservative bounds intentionally sacrifice some performance to avoid clipping.

Bounds cover each part's vertex distance from its local origin plus its pivot distance, divided by 16, with one extra local unit of padding. This bounds all rotations of the part. All polygon vertices are scanned on first eligible observation, not every frame. Before reuse, the existing verified TMT adapter checks geometry-list IDs, identities, poses and material eligibility. Pose changes permanently fall back until reload. Child models, transformed-vertex subclasses, custom polygons, unknown TMT versions, glow/special materials and other unverified cases are rendered normally. First observation renders; uncompiled geometry gets normal warmup. Cache is limited to 256 groups/100,000 tracked parts. Groups below 128 or above 8,192 parts are not culled. The existing entity frustum bypass remains unchanged, protecting large models before this more precise group check.

The check occurs before the external compatibility mod's StaticModelGroupCache interception. It avoids compiling view-dependent omissions into parent GL lists. Reload/world-disconnect cache cleanup uses the existing render-thread lifecycle. No whole-vehicle scan or geometry simplification is introduced. Small/dynamic groups can still be submitted even when a body is culled. Benchmark vehicle counts remain model-entry counts, not proof that every group produced visible pixels.

Costs include per-part validation and two GL matrix queries per eligible group. Benefit is unproven and may be negative in fully on-screen scenes. Unusual shader vertex displacement or mods mutating model geometry without recompiling display lists require additional validation; disable culling if they cause clipping. OptiFine/Angelica integration and shader/zoom behavior have not been live-tested here.

## Tracks

The current Wolff method renders all alternate-frame arrays. The new path selects one frame per side only for complete nonempty left/right array sets OR complete numbered 1/2/3 sets, never mixed/sparse sets. Static track geometry and fancy track links are unchanged. Selection follows existing per-vehicle wheelsAngle (floor(angle * 3), wrapped for forward/reverse); a parked vehicle retains its selected frame. It does not add independent left/right pivot-turn animation. Wolff does not expose TAP's full original per-side frame controller here, so this is a wheel-motion-derived adaptation, not an exact TAP animation cadence port.

No alternate track-frame assignments were found in the bundled Wolff model source outside the base renderer. Models without those arrays gain nothing from this change. Complete-array structure cannot prove the artistic intent of arbitrary external content: turn the option off for models that use these fields as additive parts. No automatic lower-detail model generation or animation freezing is included.

## Options and test

Existing `Client Side Settings`, both default true:
- `Cull verified offscreen vehicle groups`
- `Select vehicle track animation frames`

Restart after changing. Test options individually using the same scene and `/wolffbenchmark 120 10 alpha22`. Test behind-camera fleets as well as all-on-screen scenes. Verify wide FOV, zoom, third person, camera inside a ship, a long bow/stern visible while its origin is off-screen, turning turrets, alternate skins, resource reload, parked/forward/reverse tracks and fancy links. Test OptiFine and Angelica separately and with the chosen compatibility mod. Report clipping immediately and disable culling for rollback. Alpha 21 remains unchanged.

Validation: Java 8 build; mathematical tests for wide-FOV inclusion, behind-camera rejection, long bounds, camera-inside and invalid-matrix fallback; track-index stationary/wrap/reverse tests. Existing eight NPC Mixin warnings remain. These do not replace live rendering tests or establish FPS gains.

Modified: `WolffNPCMod.java`, `model/ModelFlanVehicle.java`, `render/StaticModelGroupCache.java` (visibility-cache cleanup only).
Added: `render/VehicleGroupVisibility.java`, `render/ClipSphere.java`, `render/TrackFrameIndex.java`, `tools/ClipSphereTest.java`, `tools/TrackFrameIndexTest.java`, this guide.

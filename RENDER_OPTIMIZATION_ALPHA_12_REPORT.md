# Alpha 12 rendering compatibility report

## Existing pipeline

- Flan's `ModelRendererTurbo` already compiles geometry into OpenGL display lists.
- Those lists are per model element and, where used, per texture group inside an element.
- Wolff's model classes still traverse each array and call every element every frame. Large generated models declare thousands of elements; examples found in this source tree include Prinz Eugen (8,015), Divine Maus (4,001), Churchill Gun Carrier (2,570), and Centurion AVRE (2,518).
- `ClientProxy` creates one model for each registered entity renderer. The renderer and its model are shared by all spawned NPC vehicles of that registered type, so Flan's element geometry compiles once per renderer/model type rather than once per entity.
- Remaining repeated work includes Java array traversal, element visibility checks, matrix/state changes, blend-state queries, texture-group handling, child display-list calls, and dynamic turret/gun/wheel/track calculations.
- NPC vehicles currently set `ignoreFrustumCheck` because their visual bounds may be much larger than their entity hitboxes. Vanilla frustum culling therefore cannot be safely re-enabled without reliable content-specific render bounds.

## Alpha 12 change

`StaticModelGroupCache` records an unchanged parent model array as one OpenGL display list. It does not rebuild, merge, omit, or replace the geometry already cached by Flan. The parent list retains all of Flan's child list calls and render state commands while removing repeated Java-to-OpenGL submission overhead.

A group must have the same element identities, positions, rotations, offsets, visibility, glow/compiler flags, children count, and rotation order for four calls before batching. If any monitored value later changes, the parent list is deleted and that array permanently returns to Flan's original per-element path for the session. Dynamic transforms surrounding a group (for example turret yaw applied before `renderPart`) remain outside the cached list and continue to update normally.

AA guns use batching only for the static base and seat arrays. Gun, gunsight, barrel, recoil, and ammo arrays retain their original direct dynamic rendering.

The cache is client-only, is cleared on texture stitching/resource reload, and uses standard legacy OpenGL display-list behavior already required by these Flan renderers. No geometry, content-pack model, texture, NPC AI, vehicle logic, networking, saved data, aiming, firing, or server code was changed.

## Culling decision

No whole-vehicle culling change was made. The current hitboxes are not reliable render bounds for the largest ships and vehicles, and enabling vanilla culling would introduce visible edge-of-screen popping. A later culling pass would require trustworthy per-model bounds or explicit content metadata.

## Configuration and rollback

The new client setting `Enable static vehicle render group batching` defaults to `true`. Setting it to `false` restores Flan's original model-array render path without removing the jar. Alpha 11 remains the binary rollback, and the pre-change Alpha 11 source archive remains in the output folder.

## Validation still required in game

- Compare stationary and moving high-element-count vehicles with batching on/off.
- Exercise turret yaw/pitch, recoil, wheels, tracks, doors, landing gear, propellers/rotors, mounted guns, ammo visibility, damage/death, and content-specific animations.
- Test texture/resource reload and world/server switching.
- Test both Flan's Mod Ultimate Stability Edition and TAP, with and without Angelica.
- Watch the log for OpenGL errors and compare translucent/glowing/multi-texture pieces.
- Confirm dedicated-server startup with the same jar. The cache is referenced only from client model/proxy classes, but an actual server launch is the final class-loading check.

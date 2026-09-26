# Alpha 30 - Flan Vector Compatibility Crash Fix

Alpha 30 fixes the server tick crash reported with the older LabJac/TAP Flan
fork while retaining compatibility with Flan's Mod Ultimate Stability Edition.

## Crash

The reports show:

`NoSuchMethodError: com.flansmod.common.vector.Vector3f.scale(F)Lcom/flansmod/common/vector/Vector3f;`

The crash starts in `EntityFlanDriveableNPC.getPrimaryAimOrigin` when a vehicle
NPC acquires a target and Alpha 27's ballistic solver requests the primary muzzle
position. It was reproduced in the log with more than one NPC/world, including a
Bofors 40 mm AA gun.

## Cause

The newer Flan fork used for compilation declares `Vector3f.scale(float)` as
returning `Vector3f`. The old LabJac/TAP runtime declares the same-looking method
as returning `void`. JVM method linkage includes the return type, so these are
binary-incompatible descriptors even when source code ignores the returned
value.

This was introduced with Alpha 26's actual-muzzle fire-control work. It is not
caused by CustomNPC+ 1.11.1, Angelica, the world, or Alpha 29's GUI changes.

## Fix

All Flan `Vector3f.scale(float)` calls in Wolff's server/client entity and firing
paths were replaced by direct component multiplication through the public `x`,
`y`, and `z` fields shared by the supported Flan forks. The numerical result is
unchanged; only the incompatible method linkage is removed.

Affected paths include:

- primary vehicle and AA muzzle-origin calculation;
- driver position model scaling;
- driveable firing-position scaling;
- driveable shooting-particle position scaling.

The compiled classes were checked and contain no remaining reference to
`Vector3f.scale` in these paths.

## Unrelated log messages

The missing Angelica test texture, xRadar debug texture, and Monoblocks texture
messages are resource warnings. They are not on the crash stack and did not
cause this server failure.

## Test

1. Load the worlds/NPCs that previously crashed immediately.
2. Let the Bofors and other vehicle NPCs acquire targets and fire.
3. Test resized vehicle NPC models so muzzle/model scaling is exercised.
4. Test shooting particles.
5. Repeat with the old LabJac/TAP Flan fork and Ultimate Stability Edition.
6. Confirm gradual aiming, target leading, muzzle origin, and firing remain
   correct on both forks.

## Rollback

Alpha 29 remains the immediate rollback, but it still contains this old-Flan
linkage crash. Remove Alpha 30 and restore Alpha 29 only when testing a runtime
where the crash is not exercised. Never install both Wolff jars together.

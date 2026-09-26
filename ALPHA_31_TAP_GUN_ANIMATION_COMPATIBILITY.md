# Alpha 31 - Newer TAP Gun Animation Compatibility

Alpha 31 fixes the client packet failure that occurs when a CustomNPC using a
Flan gun plays its shoot animation with the May 2026/newer TAP Flan fork.

## Failure

The supplied error is:

`NoSuchMethodError: com.flansmod.client.model.GunAnimations.doShoot(IIIFFI)V`

It occurs after a Wolff `FLAN_SHOOT` animation packet reaches the client. The
NPC and weapon can function on the server, but the client attempts to invoke a
Flan animation method that does not exist with that exact binary signature.

## Cause

Flan's Mod Ultimate Stability Edition exposes:

`doShoot(int, int, int, float, float, int)`

The supplied newer TAP jar exposes:

`doShoot(int, int, int, float, float, int, int)`

The added final value controls recoil time. The newer TAP reload animation also
expanded from seven parameters to ten. Directly compiling against either fork
therefore creates linkage errors on the other.

## Fix

- Removed direct NPC calls to `GunAnimations.doShoot`.
- Added a cached compatibility adapter that discovers the six- or seven-argument
  form at runtime.
- The TAP-only recoil-time parameter uses its normal 20-tick default.
- Added support for the newer TAP ten-argument reload animation while retaining
  the older seven- and five-argument forms.
- If an unknown future animation API is encountered, Wolff logs the problem once
  and disables only that cosmetic animation instead of failing packet handling.
- Melee animation is unchanged because `doMelee(int)` exists in both inspected
  forks.

This does not change shooting, damage, ammunition, AI, sounds, targeting, or
server behavior.

## Unrelated log messages

Missing content-pack textures, Custom Main Menu images, sounds, and invalid CTM
properties are separate resource-pack/content warnings. They do not produce the
`GunAnimations.doShoot` packet exception.

## Test

1. Give humanoid CustomNPCs Flan guns in both hands where supported.
2. Enable Shoot or Shoot & Reload in Flan Gun Animations.
3. Let them fire repeatedly and confirm no packet exception or disconnect.
4. Confirm recoil, pump, hammer, casing and muzzle-flash animation still appears.
5. Test Shoot-only mode and confirm reload sound/animation remains suppressed.
6. Test Shoot & Reload and confirm the reload animation works.
7. Repeat on newer TAP and Flan's Mod Ultimate Stability Edition.
8. Join a dedicated server and observe other NPCs firing to cover networked
   animation packets.

## Rollback

Alpha 30 is retained as rollback but does not contain this newer-TAP animation
fix. Never install multiple Wolff jars together.

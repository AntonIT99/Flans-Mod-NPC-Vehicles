# Alpha 32 - Target Selector Classloading Compatibility

Alpha 32 fixes a server-side crash seen with the supplied modern TAP/LabJac
Flan build while retaining the Alpha 31 behavior and older Flan compatibility.

## Crash

The progressive target-search mixin created an anonymous `IEntitySelector`
inside a method merged into CustomNPC+'s `EntityAIClosestTarget`. Under the
reported Minecraft 1.7.10 transformer stack, the transformed class referenced a
generated `EntityAIClosestTarget$Anonymous$...` class that LaunchClassLoader
could not load. An NPC target search then failed with `NoClassDefFoundError`.

This was a class-generation/loading compatibility failure, not a missing modern
TAP method and not a problem with the affected NPC or saved world.

## Fix

- Replaced the anonymous mixin-local selector with the normal Wolff-owned
  `ProgressiveTargetSelector` class.
- Preserved the same inner-shell exclusion, original CustomNPC selector
  delegation, direct-LOS behavior and profiling counts.
- Did not change search radii, band scheduling, target choice, AI, navigation,
  aiming, firing, models, rendering, NBT or configuration.
- Did not modify CustomNPC+ or any Flan jar.

## Test

1. Load the world that crashed and allow the affected NPC to acquire targets.
2. Test idle scans and target acquisition in every configured range band.
3. Test humanoid, flying and Wolff vehicle NPCs.
4. Repeat with modern TAP/LabJac, older TAP and Flan Ultimate 1.60.
5. Run `/wolffserverbenchmark` and confirm target-search counters still appear.

Alpha 31 remains the rollback build. Never install both jars together.

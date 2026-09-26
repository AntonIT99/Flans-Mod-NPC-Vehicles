# Alpha 33 - Armour Animation Classloading Compatibility

Alpha 33 fixes the client rendering crash reported with modern TAP/LabJac while
retaining Alpha 32 and all earlier behavior.

## Crash

`MixinModelCustomArmour` used a Java enum `switch` to select CustomNPC animation
poses. Java compiles an enum switch through a synthetic companion class. After
the method was merged into TAP's `ModelCustomArmour` under the reported legacy
UniMixins transformer stack, the transformed method referenced a generated
`ModelCustomArmour$Anonymous$...` class that LaunchClassLoader could not load.
Rendering a humanoid NPC wearing Flan armour then failed with
`NoClassDefFoundError`.

This is a transformed-class companion loading problem. The affected NPC, armor
item, texture and saved world are not corrupt.

## Fix

- Replaced the enum switch with equivalent direct enum comparisons.
- Removed the compiler-generated `MixinModelCustomArmour$1` dependency.
- Audited the remaining mixins: the other switch is over integer values and
  compiles directly to bytecode without a synthetic companion class.
- Preserved every pose method, branch order, animation calculation, armor
  transform, texture/render path and supported player animation.
- Did not modify CustomNPC+, modern/older TAP, Flan Ultimate, OptiFine or
  Angelica.

## Test

1. Render the NPC and Flan armor that produced the crash.
2. Test standing, walking, aiming, sitting, sneaking, crawling, hugging, waving,
   crying, dancing and puppet/custom animations.
3. Test Flan armor on both humanoid NPCs and players.
4. Repeat with modern TAP/LabJac, older TAP and Flan Ultimate 1.60.
5. Repeat separately with OptiFine, Angelica and plain Forge where available.

Alpha 32 remains the rollback build. Never install both jars together.

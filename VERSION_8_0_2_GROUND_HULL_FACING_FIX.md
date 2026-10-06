# Version 8.0.2 - Ground Hull Facing Fix

Version 8.0.2 fixes enabled Ground Driving vehicles whose model could become sideways relative to their intended forward motion.

## Cause

The 8.0 ground controller owns the hull heading and creates horizontal motion along that heading. The older vehicle body helper could run later in the same update and replace the rendered hull yaw with a yaw derived from measured displacement. Collision correction, path corners and client interpolation could therefore display a car or tank sideways even though its controller was driving forward.

## Fix

For a Flan vehicle NPC using the **Ground** mobility profile with **Driving Controller: Yes**, the body helper now preserves the controller's gradual `rotationYaw` as the hull's `renderYawOffset`.

- Motion and hull facing use the same controller heading.
- Turret/seat yaw and head aim remain independent.
- Reversing still intentionally moves opposite the hull heading.
- The hull does not snap to the target; steering remains gradual.
- Legacy vehicles and Ground NPCs with the driving controller disabled are unchanged.
- No saved data or configuration format changed.

## Suggested checks

Test cars and tanks on straight paths, sharp corners, around obstacles and while tracking a target to the side. Confirm the hull follows its route, the turret can aim independently, and configured reversing still works.

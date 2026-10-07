# Version 8.0.4 - Same-Tick Ground Driving

Version 8.0.4 corrects a movement/render timing mismatch that could make both wheeled and tracked Ground Driving vehicles appear to travel sideways at an angle.

## Cause

The dedicated ground controller previously ran at the end of Minecraft's movement method. By then the NPC had already changed position using the previous tick's motion. The controller then calculated a new hull heading and motion for the next tick, so the displayed hull direction could lead the entity's real displacement. Faster cars and sharply steering tanks made this mismatch especially visible.

## Fix

- The ground controller now calculates steering and forward/reverse motion at the start of the movement method.
- Minecraft applies that newly calculated motion during the same tick.
- Vanilla NPC strafe/forward acceleration is suppressed for enabled Ground Driving NPCs, leaving the controller as the only source of horizontal drive.
- Motion and the displayed hull therefore use the same heading.
- A non-pivoting vehicle at zero speed clears residual turn rate and cannot rotate in place.
- Tracked vehicles retain stationary pivoting only when **Allow pivot turn** is explicitly enabled.
- Turret/head aim remains independent from the hull.
- No pathfinding, targeting, saved-data or configuration format changed.

## Testing

Test a Car preset Jeep and a Tank preset vehicle on straight routes, broad curves, sharp turns, stopping points and obstacle recovery. For a tank that must never rotate in place, set **Allow pivot turn** to **No**.

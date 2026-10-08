# Version 8.0.5 - Actual Travel Hull Facing

Version 8.0.5 corrects the remaining case where a Ground Driving vehicle followed the correct path but its rendered model appeared to be dragged sideways.

## Cause

CustomNPC renders a selected Flan vehicle through a copied model-entity proxy. The proxy's `rotationYaw` can differ from the final interpolated displacement used to display the NPC. Treating that value as authoritative could leave the model angled relative to the path even when the dedicated controller's motion was correct.

## Fix

- While moving, the vehicle hull faces its actual horizontal displacement for that tick.
- While stopped, it retains its last hull direction and does not follow the target, head or turret.
- Ground Driving already curves displacement through gradual steering, so the hull still rotates gradually while turning.
- Turret/head/seat aim remains independent.
- Vanilla strafe input remains suppressed.
- The tracked **Allow pivot turn** control is relabeled **Allow tight turn** and now performs a very slow forward-moving tight turn instead of rotating at zero speed.
- Existing NBT remains compatible; the underlying saved key is unchanged.

## Testing

Test the Jeep and tanks on a straight path while viewing them from above and from the side. Then test gradual curves, sharp corners, stopping and target tracking. The hull should remain parallel to actual travel, hold its last direction at rest and never be dragged sideways.

# Alpha 24 - Vehicle Movement Facing

Alpha 24 builds on Alpha 23 and fixes non-plane Wolff/Flan NPC vehicles travelling sideways or backwards while pursuing a target. Alpha 23 remains the rollback build.

## Cause

The custom vehicle body helper previously rotated the rendered hull toward the NPC's `rotationYaw`. During combat, CustomNPC look/target AI can use that yaw independently of the navigator's actual horizontal travel direction. The navigator could therefore move one way while the hull faced another.

## Changes

- While moving, a vehicle hull now gradually turns toward its real horizontal displacement rather than combat/look yaw.
- Turret and head aiming remain independent and can stay angled toward the target.
- The configured vehicle turn rate is still used; the hull is not snapped into alignment.
- Non-plane vehicles slow progressively when their requested travel direction is more than 20 degrees away from the hull.
- At 90 degrees or worse, the vehicle retains 15% movement so it can continue turning and avoid deadlock instead of travelling sideways at full speed.
- Flan plane NPCs are excluded from the movement throttle.
- Ordinary humanoid CustomNPC movement is unchanged.
- Alpha 23 terrain profiles, aiming alignment, firing, and renderer behavior are unchanged.

## In-game checks

1. Put a tank opposite a target so it must turn nearly 180 degrees before pursuing.
2. Move a target around the tank and verify the hull slows, turns gradually, then accelerates as it aligns.
3. Test obstacle navigation and sharp path corners; the tank should not deadlock at a turn.
4. Confirm the turret can continue tracking/firing sideways while the hull faces its route.
5. Repeat with wheeled vehicles, ships, fixed-gun vehicles, and a Flan plane NPC.
6. Recheck gradual aim: the turret must not snap immediately before firing.

## Validation status

The Minecraft 1.7.10 / Java 8 offline Gradle build completed successfully. In-game testing remains necessary to tune the 20-degree full-speed threshold or 15% minimum turn movement for unusually slow-turning or very large vehicles.

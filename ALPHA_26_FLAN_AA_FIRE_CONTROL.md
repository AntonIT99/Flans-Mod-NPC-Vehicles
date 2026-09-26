# Alpha 26 - Flan AA Fire Control

Alpha 26 builds on Alpha 25. Alpha 25 remains the rollback build.

## Problems corrected

1. Wolff aimed from the CustomNPC eye height, but Flan AA ammunition spawned from the configured AA barrel. Large vertical muzzle offsets therefore produced systematic high or low shots.
2. Native Flan AA guns launch bullets at `3 × BulletType.speedMultiplier`. Wolff retained the CustomNPC projectile-speed value for AA items, so aiming and actual Flan behavior did not agree.
3. Vehicle aiming used a straight line and did not account for Flan bullet gravity, air drag, or target movement.

## New behavior

- Flan bullet aiming starts from the actual first primary shoot point or AA barrel position.
- AA launch speed matches native Flan behavior: `3 × ammo speedMultiplier`.
- Driveable launch speed includes the ammunition speed multiplier.
- A compact server-side solver uses the bullet's `fallSpeed`, `dragInAir`, and real launch speed.
- Target motion is projected over the estimated flight time for basic aircraft leading.
- The solution is refreshed once every three ticks per attacking vehicle to limit server cost.
- Turrets still rotate gradually and must finish aligning before firing.
- Existing yaw and pitch limits are still enforced.
- If ammunition data or a trajectory is unavailable, aiming falls back to direct line-of-sight from the corrected muzzle rather than failing.

## Compatibility and scope

- Applies automatically only when the NPC projectile is a Flan `ItemBullet`.
- Normal CustomNPC projectiles keep their existing behavior.
- Uses standard Flan 1.7.10 fields shared by the supported Flan Ultimate and TAP-style forks.
- No Flan or CustomNPC JAR is modified.
- No new configuration or assets are required.
- Alpha 25 adaptive path search, Alpha 24 movement-facing, terrain profiles, and the no-snap firing fix remain included.

## Recommended testing

Test one AA weapon at several combinations:

1. Stationary target at the same height.
2. Stationary target high above the gun.
3. Aircraft crossing left/right at constant speed.
4. Aircraft approaching and departing.
5. Targets at short, medium, and maximum combat distance.
6. Ammunition with noticeably different `speedMultiplier`, `fallSpeed`, or `dragInAir` values.
7. Multi-barrel AA weapons and vehicle primary shoot points.
8. Confirm the turret never snaps immediately before firing.

The Minecraft 1.7.10 / Java 8 offline Gradle build completed successfully with only the eight existing overwrite warnings. In-game testing is required because content packs can use unusual projectile physics, homing behavior, or deliberately inaccurate barrel coordinates.

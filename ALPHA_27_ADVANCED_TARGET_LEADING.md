# Alpha 27 - Advanced Target Leading

Alpha 27 builds on Alpha 26's Flan projectile fire-control without changing the
gradual turret rotation or fire-alignment rules. Its purpose is to make sustained
sideways movement a poor way to avoid every shot.

## Changes

- Tracks the selected target's server-side movement every tick.
- Smooths velocity over recent samples so normal network/entity jitter does not
  make the turret shake.
- Seeds a newly acquired target from its current one-tick movement, allowing the
  first ballistic solution to lead immediately.
- Uses a small, conservative acceleration estimate once enough history exists.
- Re-solves projectile flight time and target position up to four times so the
  ballistic arc and interception point converge.
- Aims at a body-size-aware point rather than assuming every target has the same
  eye/body dimensions.
- Rejects stale history, target changes, teleport-sized movement and correction
  spikes.
- Caps prediction at 100 flight ticks, 96 horizontal blocks of lead and 48
  vertical blocks of lead. These safety limits prevent pathological aim points.
- Keeps Alpha 26's three-tick expensive-solver cadence; inexpensive motion
  sampling still occurs every tick.

Flan bullets in this supported code path are launched in world space without
inheriting the firing vehicle's movement. Accordingly, Alpha 27 leads using the
target's world-space velocity rather than subtracting shooter velocity. This
avoids over-leading when the firing vehicle is moving.

## Preserved behavior

- Turrets still rotate gradually at the configured seat yaw/pitch speeds.
- The NPC still waits for alignment before firing; no pre-fire aim snap was added.
- Existing CustomNPC accuracy/spread remains the source of shot randomness.
- Alpha 26 muzzle origins, native Flan projectile speed, drag and gravity remain.
- No CustomNPC+, Flan's Mod, model, texture, save-format or config edits are
  required.

## Recommended tests

1. Walk or fly steadily left/right across an AA gun at short, medium and long
   range. It should visibly aim ahead and should be capable of hitting you.
2. Reverse direction abruptly. The turret should recover without snapping or
   aiming far away for an extended period.
3. Test circling, climbing and diving targets.
4. Test stationary targets and confirm Alpha 26 ballistic accuracy is unchanged.
5. Test while the firing vehicle itself is moving.
6. Test both fast and slow Flan ammunition and both supported Flan forks.
7. Confirm ordinary NPC accuracy settings still cause their expected spread.
8. Run the client and server benchmarks with many active AA NPCs and compare them
   with Alpha 26.

Prediction cannot know a future deliberate direction change. A target that keeps
one direction should no longer be effectively immune, while a target that jukes
can still cause misses as expected.

## Rollback

Remove Alpha 27 and restore the Alpha 26 jar. Do not load both versions together.

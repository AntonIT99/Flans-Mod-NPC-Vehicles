# Alpha 34 - Synchronized Nearby Target Acquisition

Alpha 34 removes the visible near-to-far reaction wave in compact NPC
formations while retaining the progressive long-range target-search
optimization.

## Cause

The progressive search intentionally staggered every NPC's distance-band scan
using its entity ID. This reduced same-tick server load, but it also gave nearby
NPCs different 0-32 block acquisition ticks. In a small formation, some NPCs
could visibly spring into action while otherwise equivalent NPCs stood idle for
several more ticks. Spatially ordered spawning could make the stagger look
related to the player's side of the formation even though the code did not use
player distance.

At the reported approximately 32-block scene size, chunk loading and the
extended view distance were not the cause.

## Fix

- Nearby 0-32 block searches now use a shared world-time cadence.
- A newly initialized NPC receives one immediate nearby acquisition
  opportunity.
- The configured `NearSearchInterval` remains unchanged (default 5 ticks), so
  average nearby search frequency is not increased.
- The 32-512 block bands remain entity-staggered to avoid concentrating the
  expensive long-range searches.
- Added `SynchronizeNearbyTargetAcquisition=true` under
  `CustomNPC Target Search Optimization`. Set it to false and restart to restore
  Alpha 33's fully staggered behavior.

No targeting eligibility, factions, line of sight, target choice, attack AI,
navigation, aiming, firing, rendering, NBT or range values changed.

## Test

1. Arrange two hostile groups about 16-32 blocks apart.
2. Observe the fight from each side without changing NPC settings.
3. Repeat several starts and confirm neither player-facing side receives a
   systematic reaction advantage.
4. Test targets beyond 32, 64, 128 and 256 blocks to confirm long-range searches
   remain spread over time.
5. Compare server benchmark MSPT/p99 and target-search counts with Alpha 33.

Alpha 33 remains the rollback build. Never install both jars together.

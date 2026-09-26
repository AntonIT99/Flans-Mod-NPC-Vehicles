# Alpha 23 - Per-NPC Terrain Mobility

Alpha 23 adds an opt-in terrain-mobility profile to every CustomNPC. Alpha 22 remains the rollback build.

## Editor

Open **AI -> Movement -> Terrain...**.

- **Legacy / Disabled**: exact pre-Alpha-23 behavior. This is the default for old and new NPCs.
- **Ground**: land movement with a configurable land speed and maximum water depth. Set depth to `0` to keep the NPC out of all water; the default `1` permits one-block shallows.
- **Watercraft**: requires continuous water under the NPC footprint, rejects land path nodes, and supports a configurable minimum water depth and water speed.
- **Amphibious**: permits normal land and water routing and uses independent land and water speeds.

Speeds are entered in blocks per second. The existing CustomNPC turning/orientation settings are still used; Alpha 23 does not add or replace turn-speed logic.

## Persistence and authority

The settings are stored in the NPC's existing AI NBT. They therefore travel through normal world saving, cloning, and CustomNPC editor save packets. Missing tags load as Legacy, preserving old worlds. Movement and path restrictions are applied server-side; the client screen only edits the values through CustomNPC's normal AI-data synchronization.

## Implementation notes

- Terrain rules are applied at the vanilla path-node validation point used by CustomNPC ground navigation.
- Watercraft nodes must have water across the NPC pathfinding footprint and meet the minimum configured depth.
- Ground nodes are rejected only when the water column exceeds the configured maximum.
- Water-depth checks stop as soon as the configured threshold is reached and share the existing NPC path block cache when active.
- The water-speed controller targets a bounded horizontal speed. It does not multiply velocity every tick and does not replace vertical swimming/buoyancy behavior.
- Watercraft and Amphibious automatically enable swimming and disable CustomNPC's Avoid Water flag when selected.
- No aiming, ranged attack, target selection, vehicle mounting, renderer, model, or optimization behavior was changed by this update.

## Recommended test matrix

1. Confirm an old NPC loads as Legacy and behaves identically to Alpha 22.
2. Ground depth `0`: command an NPC across a shoreline and confirm it chooses a dry route or stops at the shore.
3. Ground depth `1`: confirm it crosses one-block shallows but avoids a deeper channel.
4. Watercraft: test open water, a shoreline target, an island/peninsula detour, narrow channels, and a minimum-depth restriction.
5. Amphibious: pursue the same target from land to water and back, checking the two configured speeds.
6. Repeat with humanoid NPCs, a Wolff tank/ground vehicle, and a ship-sized vehicle.
7. Save/reload, clone the NPC, unload/reload its chunk, and repeat on a dedicated server with a connected client.
8. Regression-check gradual aim, firing alignment, target switching, mounting, death, and destruction.

## Known validation needs

Minecraft 1.7.10's pathfinder uses passable/blocked nodes rather than modern weighted terrain costs. Alpha 23 uses hard terrain validity rules for Ground and Watercraft and leaves Amphibious routing unchanged. In-game testing is required for unusually large NPC hitboxes, modded liquids, shore elevations, and very narrow waterways.

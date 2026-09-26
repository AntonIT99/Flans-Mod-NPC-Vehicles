# Alpha 35 - Loaded-Edge CustomNPC Ticking

Alpha 35 fixes CustomNPCs that remain completely idle until a player approaches
to roughly 8 blocks in low-view-distance singleplayer worlds.

## Cause

Minecraft/Forge 1.7.10's `World.updateEntityWithOptionalForce` normally requires
a 32-block area around an entity to have loaded chunks before it invokes the
entity update. With a short integrated-server view distance, only a small area
around the player satisfies that margin. Entity Render Distance Extender can
still make NPCs visible outside the fully tickable center, so the NPCs appear
frozen until the player walks close enough to load the required surrounding
chunks.

The supplied video shows this full-tick activation behavior rather than delayed
target acquisition. Creative mode and the two NPC factions are not the cause.

## Fix

- Uses Forge's intended `EntityEvent.CanUpdate` hook.
- Applies server-side to every loaded CustomNPC, including humanoids and Wolff
  vehicle NPCs.
- Permits the NPC to tick when any player is within the server-authoritative
  `NPCViewDistance` (default 256 blocks).
- Does not force-load or retain any chunk.
- Does not apply to vanilla mobs, players or unrelated mod entities.
- Does not change factions, aggro range, target selection, navigation range,
  aiming, firing, rendering, NBT or packet formats.

Because no chunks are force-loaded, an NPC at the actual edge of loaded terrain
can tick but still may not find a path through unavailable chunks. This is safer
than silently making every visible NPC a chunk loader.

## Test

1. Use the same low render-distance singleplayer setup from the supplied video.
2. Place two hostile CustomNPC factions 16-32 blocks apart.
3. Stand at least 16-32 blocks away and confirm both groups begin fighting
   without the player walking within 8 blocks.
4. Repeat with ordinary humanoids and Wolff vehicle NPCs.
5. Repeat on a dedicated server with its normal view distance.
6. Confirm NPCs outside `NPCViewDistance` are not activated by this hook.
7. Run the server benchmark and compare NPC update counts/MSPT with Alpha 34.

Alpha 34 remains the rollback build. Never install both jars together.

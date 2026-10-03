# Version 7.1.0 - Transparent Block Line of Sight

Version 7.1.0 adds optional, per-NPC line-of-sight controls for selected partial or foliage blocks.

## Location

Open an NPC with the wand, then use:

`Display` -> `Flan's Mod Settings` -> `Transparent Block LOS` -> `Configure`

## Modes

- **Normal** keeps standard CustomNPC and Minecraft line-of-sight behavior.
- **See Through** lets the NPC detect targets through eligible blocks, but it still needs a clear firing line.
- **See + Fire Through** lets the NPC both detect targets and fire Flan projectiles through eligible blocks.

The vision and firing limits independently control how many eligible blocks may be crossed by a line trace. The supported range is 0 to 64 blocks.

Eligible blocks are plants and bushes, leaves, webs, fences, fence gates, glass blocks, glass panes and iron bars, vines, and ladders. Other full solid blocks remain blocking.

The firing bypass is intentionally limited to Flan projectiles spawned by CustomNPC ranged attacks. It does not globally alter Minecraft collision, Flan's Mod, player weapons, arrows, or potion projectiles.

Existing NPCs and worlds default to **Normal**, so this feature does not change their behavior until enabled.

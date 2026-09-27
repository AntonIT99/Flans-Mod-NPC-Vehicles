# Alpha 37 - DataStats Mixin Compatibility Fix

## Problem

After Alpha 36 fixed `EntityAIAttackTarget`, creating an NPC could fail with:

`NoClassDefFoundError: noppes/npcs/DataStats`

As with the earlier error, the class was present. The Wolff stats mixin still
targeted the older `readEntityFromNBT` method, while CustomNPC+ 1.11.1 exposes
this operation as `readToNBT`.

## Fix

The stats injection now accepts both names:

- `readEntityFromNBT` for older supported CustomNPC builds
- `readToNBT` for CustomNPC+ 1.11.1

The injected behavior is unchanged: loaded combat ranges are clamped to the
configured server maximum.

## Testing

1. Remove Alpha 36 and install Alpha 37 by itself.
2. Start the affected instance without adding UniMixins.
3. Load a world containing existing NPCs.
4. Place a new NPC with the NPC Wand.
5. Save and reload the world and verify NPC combat ranges persist normally.

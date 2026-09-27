# Alpha 36 - Tactical Target Mixin Compatibility Fix

## Problem

On some production 1.7.10 installations, loading or creating a CustomNPC
failed with:

`NoClassDefFoundError: noppes/npcs/ai/EntityAIAttackTarget`

The class was present. Its transformation had previously failed because the
extended tactical-range injection only named the development method
`continueExecuting`, while that installation exposed the production SRG name
`func_75253_b`.

## Fix

The injection now accepts either method name. Its behavior and injected code
are unchanged.

This makes the mixin work with the Mixin environment supplied by CustomNPC+ or
CoreTweaks and does not require UniMixins to remap the target on its behalf.

## Testing

1. Remove Alpha 35 from the mods folder and install Alpha 36.
2. Start the affected world without adding UniMixins.
3. Confirm existing NPCs load normally.
4. Place a new NPC with the NPC Wand.
5. Verify tactical variants retain targets at extended combat ranges.

# Flan's Mod NPC Vehicles

### Features
[Wiki](https://github.com/AntonIT99/Flans-Mod-NPC-Vehicles/wiki/Flan's-Mod-NPC-Vehicles-Wiki)

### Development
To run in a dev environment, add 
```--tweakClass org.spongepowered.asm.launch.MixinTweaker --mixin wolffsmod.mixins.json```
to the program arguments in the run configuration.
To get more mixin debug output add ```-Dmixin.debug.export=true``` to the VM arguments.

### Modified classes (Mixins) in CustomNPC+

package noppes.npcs:
- DataDisplay
- DataInventory
- DataStats
- Resistances

package noppes.npcs.ai:
- EntityAIAnimation
- EntityAIRangedAttack

package noppes.npcs.client.gui.mainmenu:
- GuiNpcDisplay
- GuiNPCInv

package noppes.npcs.entity:
- EntityCustomNpc
- EntityNPCInterface

### Modified classes (Mixins) in Flan's Mod

package com.flansmod.client.model:
- ModelCustomArmour
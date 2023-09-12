# Flan's Mod NPC Vehicles

### Features
[Wiki](https://github.com/AntonIT99/Flans-Mod-NPC-Vehicles/wiki/Flan's-Mod-NPC-Vehicles-Wiki)

### Development
To run in a dev environment, add 
```--tweakClass org.spongepowered.asm.launch.MixinTweaker --mixin wolffsmod.mixins.json```
to the program arguments in the run configuration.
To get more mixin debug output add ```-Dmixin.debug.export=true``` to the VM arguments.

#### Helper Scripts

- EntityClassGenerator.py allows generating automatically java classes for Entities for each flan's config txt file 
located in the subfolders "vehicles" and "planes" of the current directory: the generated java files are put into
subfolders named after the used model namespace (for example w44 for warfare 44). 
Also, entries (to copy to the actual source code) are generated in ClientProxy.txt and EntityRegistry.txt

- EnumerateTextures.py reads from the subfolders "vehicles" and "planes" and creates a sorted list of planes and vehicles 
with their models, textures and paintjobs in the generated file textures.txt

#### Distribution

Once the source code has been compiled with ```gradlew build```, the JAR to be distributed is located in build/output.

### Modified classes (Mixins) in CustomNPC+

package noppes.npcs:
- DataDisplay
- DataInventory
- DataStats
- Resistances

package noppes.npcs.ai:
- EntityAIAnimation
- EntityAIRangedAttack

package noppes.npcs.client.gui:
- SubGuiNpcResistanceProperties

package noppes.npcs.client.gui.mainmenu:
- GuiNpcDisplay
- GuiNPCInv

package noppes.npcs.entity:
- EntityCustomNpc
- EntityNPCInterface

### Modified classes (Mixins) in Flan's Mod

package com.flansmod.client.model:
- ModelCustomArmour
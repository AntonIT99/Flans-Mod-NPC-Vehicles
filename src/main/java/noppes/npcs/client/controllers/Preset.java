// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.controllers;

import noppes.npcs.ModelPartData;
import java.util.HashMap;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.ModelData;

public class Preset
{
    public ModelData data;
    public String name;
    
    public Preset() {
        this.data = new ModelData();
    }
    
    public NBTTagCompound writeToNBT() {
        final NBTTagCompound compound = new NBTTagCompound();
        compound.setString("PresetName", this.name);
        compound.setTag("PresetData", (NBTBase)this.data.writeToNBT());
        return compound;
    }
    
    public void readFromNBT(final NBTTagCompound compound) {
        this.name = compound.getString("PresetName");
        this.data.readFromNBT(compound.getCompoundTag("PresetData"));
    }
    
    public static void FillDefault(final HashMap<String, Preset> presets) {
        ModelData data = new ModelData();
        Preset preset = new Preset();
        preset.name = "Elf Male";
        preset.data = data;
        data.legs.setScale(0.85f, 1.15f);
        data.arms.setScale(0.85f, 1.15f);
        data.body.setScale(0.85f, 1.15f);
        data.head.setScale(0.85f, 0.95f);
        presets.put("elf male", preset);
        data = new ModelData();
        preset = new Preset();
        preset.name = "Elf Female";
        preset.data = data;
        data.breasts = 2;
        data.legs.setScale(0.8f, 1.05f);
        data.arms.setScale(0.8f, 1.05f);
        data.body.setScale(0.8f, 1.05f);
        data.head.setScale(0.8f, 0.85f);
        presets.put("elf female", preset);
        data = new ModelData();
        preset = new Preset();
        preset.name = "Dwarf Male";
        preset.data = data;
        data.legs.setScale(1.1f, 0.7f, 0.9f);
        data.arms.setScale(0.9f, 0.7f);
        data.body.setScale(1.2f, 0.7f, 1.5f);
        data.head.setScale(0.85f, 0.85f);
        presets.put("dwarf male", preset);
        data = new ModelData();
        preset = new Preset();
        preset.name = "Dwarf Female";
        preset.data = data;
        data.breasts = 2;
        data.legs.setScale(0.9f, 0.65f);
        data.arms.setScale(0.9f, 0.65f);
        data.body.setScale(1.0f, 0.65f, 1.1f);
        data.head.setScale(0.85f, 0.85f);
        presets.put("dwarf female", preset);
        data = new ModelData();
        preset = new Preset();
        preset.name = "Orc Male";
        preset.data = data;
        data.legs.setScale(1.2f, 1.05f);
        data.arms.setScale(1.2f, 1.05f);
        data.body.setScale(1.4f, 1.1f, 1.5f);
        data.head.setScale(1.2f, 1.1f);
        presets.put("orc male", preset);
        data = new ModelData();
        preset = new Preset();
        preset.name = "Orc Female";
        preset.data = data;
        data.breasts = 2;
        data.legs.setScale(1.1f, 1.0f);
        data.arms.setScale(1.1f, 1.0f);
        data.body.setScale(1.1f, 1.0f, 1.25f);
        presets.put("orc female", preset);
        data = new ModelData();
        preset = new Preset();
        preset.name = "Human Male";
        preset.data = data;
        presets.put("human male", preset);
        data = new ModelData();
        preset = new Preset();
        preset.name = "Human Female";
        preset.data = data;
        data.breasts = 2;
        data.head.setScale(0.95f, 0.95f);
        data.legs.setScale(0.92f, 0.92f);
        data.arms.setScale(0.8f, 0.92f);
        data.body.setScale(0.92f, 0.92f);
        presets.put("human female", preset);
        data = new ModelData();
        preset = new Preset();
        preset.name = "Cat Male";
        preset.data = data;
        ModelPartData ears = data.getOrCreatePart("ears");
        ears.setTexture("ears/type1", 0);
        ears.color = 14263886;
        ModelPartData snout = data.getOrCreatePart("snout");
        snout.setTexture("snout/small1", 0);
        snout.color = 14263886;
        ModelPartData tail = data.getOrCreatePart("tail");
        tail.setTexture("tail/tail1", 0);
        tail.color = 14263886;
        presets.put("cat male", preset);
        data = new ModelData();
        preset = new Preset();
        preset.name = "Cat Female";
        preset.data = data;
        ears = data.getOrCreatePart("ears");
        ears.setTexture("ears/type1", 0);
        ears.color = 14263886;
        snout = data.getOrCreatePart("snout");
        snout.setTexture("snout/small1", 0);
        snout.color = 14263886;
        tail = data.getOrCreatePart("tail");
        tail.setTexture("tail/tail1", 0);
        tail.color = 14263886;
        data.breasts = 2;
        data.head.setScale(0.95f, 0.95f);
        data.legs.setScale(0.92f, 0.92f);
        data.arms.setScale(0.8f, 0.92f);
        data.body.setScale(0.92f, 0.92f);
        presets.put("cat female", preset);
        data = new ModelData();
        preset = new Preset();
        preset.name = "Wolf Male";
        preset.data = data;
        ears = data.getOrCreatePart("ears");
        ears.setTexture("ears/type1", 0);
        ears.color = 6182997;
        snout = data.getOrCreatePart("snout");
        snout.setTexture("snout/large1", 2);
        snout.color = 6182997;
        tail = data.getOrCreatePart("tail");
        tail.setTexture("tail/tail2", 0);
        tail.color = 6182997;
        presets.put("wolf male", preset);
        data = new ModelData();
        preset = new Preset();
        preset.name = "Wolf Female";
        preset.data = data;
        ears = data.getOrCreatePart("ears");
        ears.setTexture("ears/type1", 0);
        ears.color = 6182997;
        snout = data.getOrCreatePart("snout");
        snout.setTexture("snout/large1", 2);
        snout.color = 6182997;
        tail = data.getOrCreatePart("tail");
        tail.setTexture("tail/tail2", 0);
        tail.color = 6182997;
        data.breasts = 2;
        data.head.setScale(0.95f, 0.95f);
        data.legs.setScale(0.92f, 0.92f);
        data.arms.setScale(0.8f, 0.92f);
        data.body.setScale(0.92f, 0.92f);
        presets.put("wolf female", preset);
        data = new ModelData();
        preset = new Preset();
        preset.name = "Enderchibi";
        preset.data = data;
        data.legs.setScale(0.65f, 0.75f);
        data.arms.setScale(0.5f, 1.45f);
        final ModelPartData part = data.getOrCreatePart("particles");
        part.setTexture("particle/type1", 1);
        part.color = 16711680;
        presets.put("enderchibi", preset);
    }
}

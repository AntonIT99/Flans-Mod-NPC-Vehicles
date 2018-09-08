// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.scripted.ScriptEntity;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ScriptEntityData implements IExtendedEntityProperties
{
    public ScriptEntity base;
    
    public ScriptEntityData(final ScriptEntity base) {
        this.base = base;
    }
    
    public void saveNBTData(final NBTTagCompound compound) {
    }
    
    public void loadNBTData(final NBTTagCompound compound) {
    }
    
    public void init(final Entity entity, final World world) {
    }
}

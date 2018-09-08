// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.roles.companion;

import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.entity.EntityNPCInterface;

public abstract class CompanionJobInterface
{
    public EntityNPCInterface npc;
    
    public abstract NBTTagCompound getNBT();
    
    public abstract void setNBT(final NBTTagCompound p0);
    
    public void onUpdate() {
    }
    
    public boolean isSelfSufficient() {
        return false;
    }
}

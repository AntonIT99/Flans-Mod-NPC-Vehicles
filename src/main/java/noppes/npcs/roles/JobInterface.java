// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.roles;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import noppes.npcs.entity.EntityNPCInterface;

public abstract class JobInterface
{
    public EntityNPCInterface npc;
    public boolean overrideMainHand;
    public boolean overrideOffHand;
    public ItemStack mainhand;
    public ItemStack offhand;
    
    public JobInterface(final EntityNPCInterface npc) {
        this.overrideMainHand = false;
        this.overrideOffHand = false;
        this.mainhand = null;
        this.offhand = null;
        this.npc = npc;
    }
    
    public abstract NBTTagCompound writeToNBT(final NBTTagCompound p0);
    
    public abstract void readFromNBT(final NBTTagCompound p0);
    
    public void killed() {
    }
    
    public void delete() {
    }
    
    public boolean aiShouldExecute() {
        return false;
    }
    
    public boolean aiContinueExecute() {
        return this.aiShouldExecute();
    }
    
    public void aiStartExecuting() {
    }
    
    public void aiUpdateTask() {
    }
    
    public void reset() {
    }
    
    public void resetTask() {
    }
}

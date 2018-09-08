// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.roles;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import java.util.HashMap;
import noppes.npcs.entity.EntityNPCInterface;

public abstract class RoleInterface
{
    public EntityNPCInterface npc;
    public HashMap<String, String> dataString;
    
    public RoleInterface(final EntityNPCInterface npc) {
        this.dataString = new HashMap<String, String>();
        this.npc = npc;
    }
    
    public abstract NBTTagCompound writeToNBT(final NBTTagCompound p0);
    
    public abstract void readFromNBT(final NBTTagCompound p0);
    
    public abstract void interact(final EntityPlayer p0);
    
    public void killed() {
    }
    
    public void delete() {
    }
    
    public boolean aiShouldExecute() {
        return false;
    }
    
    public boolean aiContinueExecute() {
        return false;
    }
    
    public void aiStartExecuting() {
    }
    
    public void aiUpdateTask() {
    }
    
    public boolean defendOwner() {
        return false;
    }
    
    public void clientUpdate() {
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.roles;

import noppes.npcs.CustomNpcs;
import java.util.Iterator;
import java.util.List;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.entity.EntityNPCInterface;

public class JobFollower extends JobInterface
{
    public EntityNPCInterface following;
    private int ticks;
    private int range;
    public String name;
    
    public JobFollower(final EntityNPCInterface npc) {
        super(npc);
        this.following = null;
        this.ticks = 40;
        this.range = 20;
        this.name = "";
    }
    
    @Override
    public NBTTagCompound writeToNBT(final NBTTagCompound compound) {
        compound.setString("FollowingEntityName", this.name);
        return compound;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound compound) {
        this.name = compound.getString("FollowingEntityName");
    }
    
    @Override
    public boolean aiShouldExecute() {
        if (this.npc.isAttacking()) {
            return false;
        }
        --this.ticks;
        if (this.ticks > 0) {
            return false;
        }
        this.ticks = 10;
        this.following = null;
        final List<EntityNPCInterface> list = (List<EntityNPCInterface>)this.npc.worldObj.getEntitiesWithinAABB((Class)EntityNPCInterface.class, this.npc.boundingBox.expand((double)this.getRange(), (double)this.getRange(), (double)this.getRange()));
        for (final EntityNPCInterface entity : list) {
            if (entity != this.npc) {
                if (entity.isKilled()) {
                    continue;
                }
                if (entity.display.name.equalsIgnoreCase(this.name)) {
                    this.following = entity;
                    break;
                }
                continue;
            }
        }
        return false;
    }
    
    private int getRange() {
        if (this.range > CustomNpcs.NpcNavRange) {
            return CustomNpcs.NpcNavRange;
        }
        return this.range;
    }
    
    public boolean isFollowing() {
        return this.following != null;
    }
    
    @Override
    public void reset() {
    }
    
    @Override
    public void resetTask() {
        this.following = null;
    }
    
    public boolean hasOwner() {
        return !this.name.isEmpty();
    }
}

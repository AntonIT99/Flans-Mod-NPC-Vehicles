// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.roles;

import net.minecraft.entity.Entity;
import noppes.npcs.NoppesUtilServer;
import java.util.Iterator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import java.util.ArrayList;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.EntityLivingBase;
import java.util.List;

public class JobHealer extends JobInterface
{
    private long healTicks;
    public int range;
    public int speed;
    private List<EntityLivingBase> toHeal;
    
    public JobHealer(final EntityNPCInterface npc) {
        super(npc);
        this.healTicks = 0L;
        this.range = 5;
        this.speed = 5;
        this.toHeal = new ArrayList<EntityLivingBase>();
    }
    
    @Override
    public NBTTagCompound writeToNBT(final NBTTagCompound nbttagcompound) {
        nbttagcompound.setInteger("HealerRange", this.range);
        nbttagcompound.setInteger("HealerSpeed", this.speed);
        return nbttagcompound;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound nbttagcompound) {
        this.range = nbttagcompound.getInteger("HealerRange");
        this.speed = nbttagcompound.getInteger("HealerSpeed");
    }
    
    @Override
    public boolean aiShouldExecute() {
        ++this.healTicks;
        if (this.healTicks < this.speed * 10) {
            return false;
        }
        for (final Object plObj : this.npc.worldObj.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.npc.boundingBox.expand((double)this.range, (double)(this.range / 2), (double)this.range))) {
            final EntityLivingBase entity = (EntityLivingBase)plObj;
            if (entity instanceof EntityPlayer) {
                final EntityPlayer player = (EntityPlayer)entity;
                if (player.getHealth() < player.getMaxHealth() && !this.npc.faction.isAggressiveToPlayer(player)) {
                    this.toHeal.add((EntityLivingBase)player);
                }
            }
            if (entity instanceof EntityNPCInterface) {
                final EntityNPCInterface npc = (EntityNPCInterface)entity;
                if (npc.getHealth() >= npc.getMaxHealth() || this.npc.faction.isAggressiveToNpc(npc)) {
                    continue;
                }
                this.toHeal.add((EntityLivingBase)npc);
            }
        }
        this.healTicks = 0L;
        return !this.toHeal.isEmpty();
    }
    
    @Override
    public void aiStartExecuting() {
        for (final EntityLivingBase entity : this.toHeal) {
            final float heal = entity.getMaxHealth() / 20.0f;
            this.heal(entity, (heal > 0.0f) ? heal : 1.0f);
        }
        this.toHeal.clear();
    }
    
    public void heal(final EntityLivingBase entity, final float amount) {
        entity.heal(amount);
        NoppesUtilServer.spawnParticle((Entity)entity, "heal", entity.dimension);
    }
}

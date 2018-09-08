// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.entity;

import net.minecraft.entity.Entity;
import noppes.npcs.ModelPartData;
import noppes.npcs.client.EntityUtil;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.CustomNpcs;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import noppes.npcs.ModelData;

public class EntityCustomNpc extends EntityNPCInterface
{
    public ModelData modelData;
    
    public EntityCustomNpc(final World world) {
        super(world);
        this.modelData = new ModelData();
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound compound) {
        if (compound.hasKey("NpcModelData")) {
            this.modelData.readFromNBT(compound.getCompoundTag("NpcModelData"));
        }
        super.readEntityFromNBT(compound);
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setTag("NpcModelData", (NBTBase)this.modelData.writeToNBT());
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.isRemote()) {
            final ModelPartData particles = this.modelData.getPartData("particles");
            if (particles != null && !this.isKilled()) {
                CustomNpcs.proxy.spawnParticle((EntityLivingBase)this, "ModelData", this.modelData, particles);
            }
            final EntityLivingBase entity = this.modelData.getEntity(this);
            if (entity != null) {
                try {
                    entity.onUpdate();
                }
                catch (Exception ex) {}
                EntityUtil.Copy((EntityLivingBase)this, entity);
            }
        }
    }
    
    public void mountEntity(final Entity par1Entity) {
        super.mountEntity(par1Entity);
        this.updateHitbox();
    }
    
    @Override
    public void updateHitbox() {
        final Entity entity = (Entity)this.modelData.getEntity(this);
        if (this.modelData == null || entity == null) {
            this.baseHeight = 1.9f - this.modelData.getBodyY() + (this.modelData.head.scaleY - 1.0f) / 2.0f;
            super.updateHitbox();
        }
        else {
            if (entity instanceof EntityNPCInterface) {
                ((EntityNPCInterface)entity).updateHitbox();
            }
            this.width = entity.width / 5.0f * this.display.modelSize;
            this.height = entity.height / 5.0f * this.display.modelSize;
            if (this.width < 0.1f) {
                this.width = 0.1f;
            }
            if (this.height < 0.1f) {
                this.height = 0.1f;
            }
            this.setPosition(this.posX, this.posY, this.posZ);
        }
    }
}

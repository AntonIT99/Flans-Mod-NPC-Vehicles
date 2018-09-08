// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.entity.old;

import noppes.npcs.ModelData;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityEnderman;
import noppes.npcs.entity.EntityCustomNpc;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.constants.EnumAnimation;
import net.minecraft.world.World;

public class EntityNPCEnderman extends EntityNpcEnderchibi
{
    public EntityNPCEnderman(final World world) {
        super(world);
        this.display.texture = "customnpcs:textures/entity/enderman/enderman.png";
        this.display.glowTexture = "customnpcs:textures/overlays/ender_eyes.png";
        this.width = 0.6f;
        this.height = 2.9f;
    }
    
    @Override
    public void updateHitbox() {
        if (this.currentAnimation == EnumAnimation.LYING) {
            final float n = 0.2f;
            this.height = n;
            this.width = n;
        }
        else if (this.currentAnimation == EnumAnimation.SITTING) {
            this.width = 0.6f;
            this.height = 2.3f;
        }
        else {
            this.width = 0.6f;
            this.height = 2.9f;
        }
        this.width = this.width / 5.0f * this.display.modelSize;
        this.height = this.height / 5.0f * this.display.modelSize;
    }
    
    @Override
    public void onUpdate() {
        this.isDead = true;
        if (!this.worldObj.isRemote) {
            final NBTTagCompound compound = new NBTTagCompound();
            this.writeToNBT(compound);
            final EntityCustomNpc npc = new EntityCustomNpc(this.worldObj);
            npc.readFromNBT(compound);
            final ModelData data = npc.modelData;
            data.setEntityClass((Class<? extends EntityLivingBase>)EntityEnderman.class);
            this.worldObj.spawnEntityInWorld((Entity)npc);
        }
        super.onUpdate();
    }
}

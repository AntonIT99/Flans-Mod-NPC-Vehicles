// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.entity;

import noppes.npcs.ModelData;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;

public class EntityNpcPony extends EntityNPCInterface
{
    public boolean isPegasus;
    public boolean isUnicorn;
    public boolean isFlying;
    public ResourceLocation checked;
    
    public EntityNpcPony(final World world) {
        super(world);
        this.isPegasus = false;
        this.isUnicorn = false;
        this.isFlying = false;
        this.checked = null;
        this.display.texture = "customnpcs:textures/entity/ponies/MineLP Derpy Hooves.png";
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
            data.setEntityClass((Class<? extends EntityLivingBase>)EntityNpcPony.class);
            this.worldObj.spawnEntityInWorld((Entity)npc);
        }
        super.onUpdate();
    }
}

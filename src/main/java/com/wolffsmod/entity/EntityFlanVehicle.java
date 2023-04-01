package com.wolffsmod.entity;

import noppes.npcs.entity.EntityCustomNpc;

import net.minecraft.client.renderer.entity.NPCRendererHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public abstract class EntityFlanVehicle extends EntityCreature
{
    protected EntityFlanVehicle(World w)
    {
        super(w);
        ignoreFrustumCheck = true;
    }

    @Override
    public void onUpdate()
    {
        isDead = true;

        if(!worldObj.isRemote)
        {
            NBTTagCompound compound = new NBTTagCompound();
            writeToNBT(compound);
            EntityCustomNpc npc = new EntityCustomNpc(worldObj);
            npc.readFromNBT(compound);
            npc.modelData.setEntityClass(getClass());
            npc.display.texture = NPCRendererHelper.getTexture((RendererLivingEntity) RenderManager.instance.getEntityRenderObject(this), this);
            npc.ignoreFrustumCheck = ignoreFrustumCheck;
            worldObj.spawnEntityInWorld(npc);
        }
        super.onUpdate();
    }
}

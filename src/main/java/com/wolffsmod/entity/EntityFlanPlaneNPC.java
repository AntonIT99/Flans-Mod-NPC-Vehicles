package com.wolffsmod.entity;

import noppes.npcs.entity.EntityCustomNpc;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public abstract class EntityFlanPlaneNPC extends EntityFlanDriveableNPC
{
    public boolean propEngineOn = true;
    public float basePropSpeed = 0.1F;
    public float propSpeed;
    public float propAngle;

    public EntityFlanPlaneNPC(World w)
    {
        super(w);
        setupConfig();
    }

    @Override
    public void updateNpc(EntityCustomNpc npc)
    {
        super.updateNpc(npc);
        propSpeed = propEngineOn ? (basePropSpeed + throttle) / (basePropSpeed + 1F) : 0F;
        propAngle += (Math.pow(Math.abs(propSpeed), 0.4F)) * 1.5F;
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound tag)
    {
        super.readEntityFromNBT(tag);
        propEngineOn = tag.getBoolean("PropellerOn");
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound tag)
    {
        super.writeEntityToNBT(tag);
        tag.setBoolean("PropellerOn", propEngineOn);
    }
}

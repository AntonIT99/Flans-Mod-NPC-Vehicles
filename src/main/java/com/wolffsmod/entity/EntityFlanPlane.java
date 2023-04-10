package com.wolffsmod.entity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public abstract class EntityFlanPlane extends EntityFlanVehicle
{
    public boolean propEngineOn = true;

    public EntityFlanPlane(World w)
    {
        super(w);
    }

    public void readEntityFromNBT(NBTTagCompound tag)
    {
        super.readEntityFromNBT(tag);
        propEngineOn = tag.getBoolean("PropellerOn");
    }

    public void writeEntityToNBT(NBTTagCompound tag)
    {
        super.writeEntityToNBT(tag);
        tag.setBoolean("PropellerOn", propEngineOn);
    }
}

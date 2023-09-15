package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityGadfly extends EntityFlanPlaneNPC
{
    public EntityGadfly(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("18 0 0");
        addShootPointPrimary("75 3 15 nose LaserMG");
        addShootPointPrimary("75 3 -15 nose LaserMG");
        
    }
}

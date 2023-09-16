package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityLeviathanIITD extends EntityFlanVehicleNPC
{
    public EntityLeviathanIITD(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("0 34 0 0 0 -5 35");
        setRotatedDriverOffset("12 0 -10");
        addShootPointPrimary("0 34 0 turret");
        addBarrelPosition("0 34 0");
        
    }
}

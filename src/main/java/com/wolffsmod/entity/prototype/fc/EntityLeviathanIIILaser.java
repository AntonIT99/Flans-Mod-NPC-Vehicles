package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityLeviathanIIILaser extends EntityFlanVehicleNPC
{
    public EntityLeviathanIIILaser(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 38 0 -360 360 -7 35");
        setRotatedDriverOffset("12 0 -15");
        addShootPointPrimary("85 41.5 0 turret");
        addShootPointSecondary("57 41.5 -15.5 turret LaserMG");
        
    }
}

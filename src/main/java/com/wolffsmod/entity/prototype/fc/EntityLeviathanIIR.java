package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityLeviathanIIR extends EntityFlanVehicleNPC
{
    public EntityLeviathanIIR(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 34 0 -360 360 -7 35");
        setRotatedDriverOffset("12 0 -10");
        addShootPointPrimary("0 34 0 turret");
        addShootPointSecondary("10 50 8 turret LaserMG");
        addBarrelPosition("0 34 0");
        
    }
}

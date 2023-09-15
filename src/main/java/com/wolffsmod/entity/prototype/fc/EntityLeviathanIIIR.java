package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityLeviathanIIIR extends EntityFlanVehicleNPC
{
    public EntityLeviathanIIIR(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 38 0 -360 360 -7 35");
        setRotatedDriverOffset("12 0 -10");
        addShootPointPrimary("0 42 0 turret");
        addShootPointSecondary("10 58 8 turret LaserMG");
        
    }
}

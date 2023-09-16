package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityLeviathan extends EntityFlanVehicleNPC
{
    public EntityLeviathan(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 38 0 -360 360 0 45");
        setRotatedDriverOffset("12 0 -8");
        addShootPointPrimary("0 34 0 turret");
        addShootPointSecondary("40 20 8 turret LaserMG");
        addBarrelPosition("0 34 0");
        
    }
}

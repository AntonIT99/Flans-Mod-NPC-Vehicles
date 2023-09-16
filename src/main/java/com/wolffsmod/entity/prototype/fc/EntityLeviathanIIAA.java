package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityLeviathanIIAA extends EntityFlanVehicleNPC
{
    public EntityLeviathanIIAA(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 38 0 -360 360 -7 65");
        setRotatedDriverOffset("12 0 -8");
        addShootPointPrimary("80 28.5 3.5 turret LaserMG");
        addShootPointPrimary("80 28.5 -3.5 turret LaserMG");
        addShootPointPrimary("80 35.5 3.5 turret LaserMG");
        addShootPointPrimary("80 35.5 -3.5 turret LaserMG");
        addShootPointSecondary("-11 42 -5 turret");
        addShootPointSecondary("-11 42 0 turret");
        addShootPointSecondary("-11 42 5 turret");
        addShootPointSecondary("-11 47 -5 turret");
        addShootPointSecondary("-11 47 0 turret");
        addShootPointSecondary("-11 47 5 turret");
        addShootPointSecondary("-11 52 -5 turret");
        addShootPointSecondary("-11 52 0 turret");
        addShootPointSecondary("-11 52 5 turret");
        
    }
}

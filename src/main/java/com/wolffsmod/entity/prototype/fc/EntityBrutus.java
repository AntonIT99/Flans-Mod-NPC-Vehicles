package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBrutus extends EntityFlanVehicleNPC
{
    public EntityBrutus(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 51 0 -360 360 -7 35");
        setRotatedDriverOffset("0 0 17");
        addShootPointPrimary("-40 46 0 turret");
        addShootPointSecondary("-40 46 18 turret LaserMG");
        addShootPointSecondary("-34 58 18 turret LaserMG");
        addBarrelPosition("0 34 0");
        
    }
}

package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityTos1a extends EntityFlanVehicleNPC
{
    public EntityTos1a(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("0 7 0 -360 360 0 40");
        setRotatedDriverOffset("8 1 10");
        addShootPointPrimary("-25 35 -2 turret");
        addShootPointPrimary("-25 45 2 turret");
        addShootPointPrimary("-25 35 -5 turret");
        addShootPointPrimary("-25 45 5 turret");
        addShootPointPrimary("-25 35 -8 turret");
        addShootPointPrimary("-25 45 8 turret");
        addShootPointPrimary("-25 35 -12 turret");
        addShootPointPrimary("-25 45 12 turret");
        addShootPointPrimary("-25 35 -15 turret");
        addShootPointPrimary("-25 45 15 turret");
        addShootPointPrimary("-25 35 -18 turret");
        addShootPointPrimary("-25 45 18 turret");
        addShootPointSecondary("40 55 10 turret");
        
    }
}

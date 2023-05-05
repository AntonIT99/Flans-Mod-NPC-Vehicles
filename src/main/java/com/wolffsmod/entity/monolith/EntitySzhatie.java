package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntitySzhatie extends EntityFlanVehicleNPC
{
    public EntitySzhatie(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.14F);
        setDriver("0 45 0 -360 360 -5 5");
        setRotatedDriverOffset("9 1 9");
        addShootPointPrimary("50 40 5 turret");
        addShootPointPrimary("50 30 5 turret");
        addShootPointPrimary("50 40 -5 turret");
        addShootPointPrimary("50 30 -5 turret");
        addShootPointPrimary("50 40 8 turret");
        addShootPointPrimary("50 30 8 turret");
        addShootPointPrimary("50 40 -8 turret");
        addShootPointPrimary("50 30 -8 turret");
        addShootPointPrimary("50 40 13 turret");
        addShootPointPrimary("50 30 13 turret");
        addShootPointPrimary("50 40 -13 turret");
        addShootPointPrimary("50 30 -13 turret");
        addShootPointSecondary("40 55 10 turret twelveMM");
        
    }
}

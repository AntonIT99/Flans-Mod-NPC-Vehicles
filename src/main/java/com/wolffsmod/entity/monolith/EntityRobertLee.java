package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityRobertLee extends EntityFlanVehicleNPC
{
    public EntityRobertLee(World w)
    {
        super(w);
        setSize(3.5F, 3.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("20 0 0 -2 2 -15 50");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 -1 20 -9 core -360 360 -10 30 37MM Turret");
        addShootPointPrimary("22 15 14 turret");
        addGunOrigin("1 -1 8 -12");
        setRotateWheels(false);
        
    }
}

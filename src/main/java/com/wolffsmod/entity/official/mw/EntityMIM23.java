package com.wolffsmod.entity.official.mw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityMIM23 extends EntityFlanVehicleNPC
{
    public EntityMIM23(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 6 0 -360 360 0 75");
        setRotatedDriverOffset("8 0 0");
        addShootPointPrimary("0 32 -12 turret");
        addShootPointPrimary("0 44 0 turret");
        addShootPointPrimary("0 32 12 turret");
        setTurretOrigin("0 32 0");
        
    }
}

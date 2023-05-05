package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entitytype10 extends EntityFlanVehicleNPC
{
    public Entitytype10(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.25F);
        setDriver("0 30 0 -360 360 -10 30");
        setRotatedDriverOffset("-5 0 8");
        addShootPointPrimary("0 32 0 turret");
        addShootPointSecondary("25 50 3 turret twelveMM");
        addShootPointSecondary("40 20 -5 turret sevenMM");
        
    }
}

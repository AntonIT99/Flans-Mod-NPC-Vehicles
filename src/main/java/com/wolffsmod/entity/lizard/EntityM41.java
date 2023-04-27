package com.wolffsmod.entity.lizard;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityM41 extends EntityFlanVehicleNPC
{
    public EntityM41(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.35F);
        setDriver("0 28 0 -360 360 -6 22");
        setRotatedDriverOffset("-10 0 7");
        setDriverAimSpeed("3 2 0");
        addBarrelPosition("-25 25 2");
        addGun("31 27 -2 turret sevenMM");
        addShootParticlesSecondary("crit 0.5 0 0");
        
    }
}

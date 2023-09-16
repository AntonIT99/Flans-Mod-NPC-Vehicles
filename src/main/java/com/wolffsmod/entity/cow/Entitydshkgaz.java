package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entitydshkgaz extends EntityFlanVehicleNPC
{
    public Entitydshkgaz(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.7F);
        setDriver("42 15 -4 -360 360 -10 70");
        setRotatedDriverOffset("0 0 0");
        setDriverAimSpeed("7 5.5 0");
        addBarrelPosition("0 34 0");
        addGun("22.8 50.4 0 turret 50calg");
        addShootParticlesSecondary("crit 0.5 0 0");
        
    }
}

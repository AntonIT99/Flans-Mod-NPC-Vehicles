package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityHellcat extends EntityFlanVehicleNPC
{
    public EntityHellcat(World w)
    {
        super(w);
        this.setSize(3.0F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.25F);
        setDriver("0 16 0 -360 360 -10 20");
        setPassenger("1 0 26 0 turret -360 360 -10 20 50Cal PassengerGun1");
        addBarrelPosition("75 28 0");
        addGunOrigin("1 6 18 -11");
        
    }
}

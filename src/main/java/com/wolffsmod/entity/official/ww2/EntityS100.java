package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanShipNPC;

import net.minecraft.world.World;

public class EntityS100 extends EntityFlanShipNPC
{
    public EntityS100(World w)
    {
        super(w);
        this.setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.25F);
        setDriver("120 47 -8 -360 360 -10 45");
        setPassenger("1 -22 36 -1 core -360 360 0 25 Flak38 PassengerGun1");
        setPassenger("2 -195 35 0 core -360 360 -2 89 Flak42 PassengerGun2");
        setPassenger("3 250 32 0 core -360 360 -2 55 Flak38 PassengerGun3");
        addBarrelPosition("250 0 -20");
        addBarrelPosition("250 0 20");
        addGunOrigin("1 -22 30 0");
        addGunOrigin("1 -22 30 4");
        addGunOrigin("2 -195 25 1");
        addGunOrigin("2 -195 25 1");
        addGunOrigin("3 250 30 0");
        
    }
}

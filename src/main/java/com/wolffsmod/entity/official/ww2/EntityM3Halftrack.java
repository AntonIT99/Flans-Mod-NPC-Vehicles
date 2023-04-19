package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityM3Halftrack extends EntityFlanVehicleNPC
{
    public EntityM3Halftrack(World w)
    {
        super(w);
        this.setSize(3.0F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("6 5 -7 -360 360 -89 89");
        setDriverAimSpeed("3.0f 3.0f 0f");
        setPassenger("1 6 5 7 core");
        setPassenger("2 -37 10 12 core");
        setPassenger("3 -23 10 -12 core");
        setPassenger("4 -7 28 8 core -55 55 -10 45 50Cal PassengerGun4");
        setPassenger("5 -49 18 -7 core 140 220 -10 45 browning PassengerGun5");
        addBarrelPosition("0 0 0");
        addGunOrigin("4 5 19 8");
        addGunOrigin("5 -54 13 -7");
        
    }
}

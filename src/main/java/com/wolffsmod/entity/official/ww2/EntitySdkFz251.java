package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntitySdkFz251 extends EntityFlanVehicleNPC
{
    public EntitySdkFz251(World w)
    {
        super(w);
        this.setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("4 5 -7 -360 360 -89 89");
        setDriverAimSpeed("3.0f 3.0f 0f");
        setPassenger("1 -13 20 0 core -30 30 -10 25 mg42 PassengerGun1");
        setPassenger("2 -49 20 0 core 160 200 -20 20 mg42 PassengerGun2");
        setPassenger("3 -40 6 -10 core -360 360 -89 89");
        setPassenger("4 -21 6 10 core -360 360 -89 89");
        setPassenger("5 2 7 7 core -360 360 -89 89");
        addBarrelPosition("0 0 0");
        addGunOrigin("1 -3 14 0");
        addGunOrigin("2 -58 16 0");
        
    }
}

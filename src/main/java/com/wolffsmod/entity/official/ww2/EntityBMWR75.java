package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBMWR75 extends EntityFlanVehicleNPC
{
    public EntityBMWR75(World w)
    {
        super(w);
        this.setSize(3.0F, 2.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("-11 5 0");
        setDriverAimSpeed("3.0f 3.0f 0f");
        setPassenger("1 -22 7 0 core");
        setPassenger("2 -7 0 18 core -55 55 -5 45 mg42 PassengerGun2");
        addGunOrigin("2 8 -10 23");
        
    }
}

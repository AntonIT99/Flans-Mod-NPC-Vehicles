package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntitySdkFz2 extends EntityFlanVehicleNPC
{
    public EntitySdkFz2(World w)
    {
        super(w);
        this.setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("-11 8 0");
        setDriverAimSpeed("3.0f 3.0f 0f");
        setPassenger("1 -29 6 0 core 140 220 -10 45 mg42 PassengerGun1");
        addGunOrigin("1 -45 0 0");
        
    }
}

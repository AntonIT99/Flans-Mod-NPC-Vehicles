package com.wolffsmod.entity.official.mw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityHumvee extends EntityFlanVehicleNPC
{
    public EntityHumvee(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("0 6 -14");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 0 6 13 core");
        setPassenger("2 -18 6 -14 core");
        setPassenger("3 -18 6 13 core");
        setPassenger("4 -11 26 0 core -35 35 -20 25 50Cal PassengerGun4");
        addGunOrigin("4 13 16 0");
        
    }
}

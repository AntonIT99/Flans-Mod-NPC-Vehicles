package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntitySASJeep extends EntityFlanVehicleNPC
{
    public EntitySASJeep(World w)
    {
        super(w);
        setSize(3.0F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.2F);
        setDriver("-8 5 -7");
        setPassenger("1 -8 7 7 core -45 45 -10 45 vickerskGO PassengerGun1");
        setPassenger("2 -22 19 13 core -45 45 -10 45 browning PassengerGun2");
        setPassenger("3 -20 18 0 core 140 220 -10 45 vickersk PassengerGun3");
        addGunOrigin("1 11 -21 -7");
        addGunOrigin("2 -12 -30 -13");
        addGunOrigin("3 -33 -31 0");
        
    }
}

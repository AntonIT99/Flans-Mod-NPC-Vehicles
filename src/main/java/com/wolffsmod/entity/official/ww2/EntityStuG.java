package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityStuG extends EntityFlanVehicleNPC
{
    public EntityStuG(World w)
    {
        super(w);
        this.setSize(3.5F, 2.2F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("-14 23 -7 -8 8 -6 20");
        setPassenger("1 -18 20 18 core -12 12 -10 12 mg42 PassengerGun1");
        addBarrelPosition("20 25 5");
        addGunOrigin("1 -5 12 15");
        
    }
}

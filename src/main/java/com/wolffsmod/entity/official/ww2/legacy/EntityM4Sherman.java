package com.wolffsmod.entity.official.ww2.legacy;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityM4Sherman extends EntityFlanVehicleNPC
{
    public EntityM4Sherman(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 18 0 -360 360 -4 4");
        setPassenger("1 0 36 0 turret -360 360 -15 60 browning Browning");
        addBarrelPosition("0 34 0");
        addGun("8 34 8 turret browning");
        
    }
}

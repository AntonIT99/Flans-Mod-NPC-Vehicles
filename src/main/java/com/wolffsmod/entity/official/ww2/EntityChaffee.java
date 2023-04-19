package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityChaffee extends EntityFlanVehicleNPC
{
    public EntityChaffee(World w)
    {
        super(w);
        this.setSize(3.5F, 2.8F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.35F);
        setDriver("0 28 0 -360 360 -15 20");
        addBarrelPosition("5 25 2");
        addGun("8 34 8 turret browning");
        
    }
}

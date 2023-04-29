package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityFury extends EntityFlanVehicleNPC
{
    public EntityFury(World w)
    {
        super(w);
        setSize(3.5F, 3.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.55F);
        setDriver("0 36 0 -360 360 -10 25");
        setRotatedDriverOffset("-6 0 7");
        addBarrelPosition("0 34 0");
        addGun("8 34 8 turret browning");
        
    }
}

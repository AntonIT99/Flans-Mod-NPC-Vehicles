package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntitySherman extends EntityFlanVehicleNPC
{
    public EntitySherman(World w)
    {
        super(w);
        setSize(3.5F, 3.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("0 32 0 -360 360 -10 25");
        setDriverAimSpeed("1.0f 0.8f 0f");
        addBarrelPosition("55 30 0");
        addGun("8 30 -8 turret browning");
        
    }
}

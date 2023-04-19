package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityTigerII extends EntityFlanVehicleNPC
{
    public EntityTigerII(World w)
    {
        super(w);
        this.setSize(3.5F, 3.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.25F);
        setDriver("0 34 0 -360 360 -8 15");
        addBarrelPosition("0 34 0");
        addGun("10 32 10 turret mg42");
        
    }
}

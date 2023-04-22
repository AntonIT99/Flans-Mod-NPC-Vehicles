package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityPanzerIV extends EntityFlanVehicleNPC
{
    public EntityPanzerIV(World w)
    {
        super(w);
        setSize(3.5F, 2.8F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.35F);
        setDriver("0 28 0 -360 360 -10 20");
        addBarrelPosition("20 34 0");
        addGun("8 34 8 turret mg42");
        
    }
}

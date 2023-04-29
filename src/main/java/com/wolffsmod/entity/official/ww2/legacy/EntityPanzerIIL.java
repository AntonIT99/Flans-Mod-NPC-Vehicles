package com.wolffsmod.entity.official.ww2.legacy;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityPanzerIIL extends EntityFlanVehicleNPC
{
    public EntityPanzerIIL(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.7F);
        setDriver("0 18 0 -360 360 -2 4");
        addBarrelPosition("5 25 0");
        addGun("8 20 0 turret mg42");
        
    }
}

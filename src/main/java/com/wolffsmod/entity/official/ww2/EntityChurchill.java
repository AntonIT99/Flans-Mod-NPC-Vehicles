package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityChurchill extends EntityFlanVehicleNPC
{
    public EntityChurchill(World w)
    {
        super(w);
        setSize(3.5F, 3.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.35F);
        setDriver("0 23 0 -360 360 -7 20");
        addBarrelPosition("0 34 0");
        addGun("8 34 8 turret bren");
        
    }
}

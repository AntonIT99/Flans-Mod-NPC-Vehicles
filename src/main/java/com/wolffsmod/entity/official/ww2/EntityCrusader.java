package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityCrusader extends EntityFlanVehicleNPC
{
    public EntityCrusader(World w)
    {
        super(w);
        setSize(3.0F, 2.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("0 18 0 -360 360 -15 20");
        setRotatedDriverOffset("-10 0 0");
        addBarrelPosition("5 25 2");
        addGun("8 20 0 turret bren");
        
    }
}

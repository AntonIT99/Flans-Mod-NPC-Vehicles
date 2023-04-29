package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityIS2 extends EntityFlanVehicleNPC
{
    public EntityIS2(World w)
    {
        super(w);
        setSize(3.5F, 3.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.25F);
        setRotatedDriverOffset("-8 0 -9");
        setDriver("0 38 0 -360 360 -6 20");
        addBarrelPosition("0 34 0");
        addGun("8 20 0 turret dp28");
        
    }
}

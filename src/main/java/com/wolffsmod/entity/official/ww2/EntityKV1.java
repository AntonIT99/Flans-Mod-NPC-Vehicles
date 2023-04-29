package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityKV1 extends EntityFlanVehicleNPC
{
    public EntityKV1(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.15F);
        setDriver("0 28 0 -360 360 -10 20");
        setRotatedDriverOffset("-26 0 0");
        addBarrelPosition("0 34 0");
        addGun("8 34 8 turret dp28");
        
    }
}

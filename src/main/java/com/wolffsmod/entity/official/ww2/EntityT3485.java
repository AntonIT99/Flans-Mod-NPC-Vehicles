package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityT3485 extends EntityFlanVehicleNPC
{
    public EntityT3485(World w)
    {
        super(w);
        setSize(3.5F, 3.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("0 32 0 -360 360 -6 17");
        setRotatedDriverOffset("-15 0 -6");
        addBarrelPosition("0 30 0");
        addGun("8 34 8 turret dp28");
        
    }
}

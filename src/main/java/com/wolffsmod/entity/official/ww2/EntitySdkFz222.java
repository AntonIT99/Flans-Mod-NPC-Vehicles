package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntitySdkFz222 extends EntityFlanVehicleNPC
{
    public EntitySdkFz222(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 12 0 -360 360 -5 70");
        setRotatedDriverOffset("-10 0 4");
        setDriverAimSpeed("0.8f 0.6f 0f");
        addBarrelPosition("0 0 0");
        
    }
}

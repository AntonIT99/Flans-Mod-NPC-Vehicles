package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityM45QuadMount extends EntityFlanVehicleNPC
{
    public EntityM45QuadMount(World w)
    {
        super(w);
        setSize(3.0F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 3 0 -360 360 -5 89");
        setRotatedDriverOffset("-6 0 2");
        addShootPointPrimary("-16 17 14 turret 50Cal");
        addShootPointPrimary("-12 12 16 turret 50Cal");
        addShootPointPrimary("-16 17 -15 turret 50Cal");
        addShootPointPrimary("-12 12 -17 turret 50Cal");
        
    }
}

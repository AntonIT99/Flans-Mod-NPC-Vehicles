package com.wolffsmod.entity.official.ww2.legacy;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityPanzer extends EntityFlanVehicleNPC
{
    public EntityPanzer(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("0 14 0 -360 360 0 45");
        setRotatedDriverOffset("12 0 -8");
        setPassenger("1 0 34 0 turret -360 360 -15 60 mg42 MG42");
        addBarrelPosition("0 34 0");
        addGun("8 34 8 turret mg42");
        
    }
}

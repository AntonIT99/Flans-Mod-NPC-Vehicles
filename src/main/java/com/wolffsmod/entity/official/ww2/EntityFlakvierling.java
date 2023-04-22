package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityFlakvierling extends EntityFlanVehicleNPC
{
    public EntityFlakvierling(World w)
    {
        super(w);
        setSize(3.0F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 -1 0 -360 360 0 89");
        addShootPointPrimary("48 6 4 turret");
        addBarrelPosition("30 10 5");
        addBarrelPosition("30 5 5");
        addBarrelPosition("30 10 -5");
        addBarrelPosition("30 5 -5");
        
    }
}

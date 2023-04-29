package com.wolffsmod.entity.official.apocalypse;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBuggy extends EntityFlanVehicleNPC
{
    public EntityBuggy(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("-19 -2 -6 -360 360 -89 89");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 -19 -2 6 core -360 360 -89 89");
        addBarrelPosition("0 0 0");
        
    }
}

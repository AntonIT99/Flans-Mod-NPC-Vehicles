package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityType90 extends EntityFlanVehicleNPC
{
    public EntityType90(World w)
    {
        super(w);
        setSize(4.5F, 3.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("0 30 0 -360 360 -7 10");
        setRotatedDriverOffset("3 0 12");
        setDriverAimSpeed("4 3.5 0");
        addBarrelPosition("50 31 0 -60 0 0");
        addGun("40 49 -4 turret twelveMM");
        
    }
}

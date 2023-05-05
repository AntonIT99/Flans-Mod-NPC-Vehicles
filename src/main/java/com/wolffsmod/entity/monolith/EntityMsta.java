package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityMsta extends EntityFlanVehicleNPC
{
    public EntityMsta(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.15F);
        setDriver("0 45 0 -360 360 -4 68");
        setRotatedDriverOffset("9 1 9");
        addShootPointPrimary("0 35 0 turret");
        addShootPointSecondary("40 55 10 turret twelveMM");
        
    }
}

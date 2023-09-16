package com.wolffsmod.entity.cvts;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11910_12PounderFieldGun extends EntityFlanVehicleNPC
{
    public Entity11910_12PounderFieldGun(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 -4 0 -5 5 -5 10");
        setRotatedDriverOffset("-16 0 8");
        addShootPointPrimary("0 7 0 turret 12pounderfieldgun_parts");
        addShootPointSecondary("");
        
    }
}

package com.wolffsmod.entity.moneybuster;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityMortaio35 extends EntityFlanVehicleNPC
{
    public EntityMortaio35(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 0 0 -360 360 0 89");
        setRotatedDriverOffset("-8 2 -8");
        addShootPointSecondary("48 6 4 mortar");
        addGun("8 34 8 turret mortar");
        
    }
}

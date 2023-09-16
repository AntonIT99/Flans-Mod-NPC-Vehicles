package com.wolffsmod.entity.moneybuster;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityCarroArmato extends EntityFlanVehicleNPC
{
    public EntityCarroArmato(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 28 0 -360 360 -10 20");
        setRotatedDriverOffset("-13 0 0");
        setPassenger("1 0 28 0 turret -360 360 -15 60 mg42 MG42");
        addBarrelPosition("10 34 0");
        addGun("8 34 8 turret mg42");
        
    }
}

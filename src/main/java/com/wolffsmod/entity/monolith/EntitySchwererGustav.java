package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntitySchwererGustav extends EntityFlanVehicleNPC
{
    public EntitySchwererGustav(World w)
    {
        super(w);
        setSize(6F, 8F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 -6 -8");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 -25 120 0 core 0 0 -20 48 GustavGun BigAssGun");
        addGunOrigin("1 -25 100 0");
        setRotateWheels(false);
        
    }
}

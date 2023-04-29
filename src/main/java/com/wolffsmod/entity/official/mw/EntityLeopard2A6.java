package com.wolffsmod.entity.official.mw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityLeopard2A6 extends EntityFlanVehicleNPC
{
    public EntityLeopard2A6(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("0 28 0 -360 360 -9 20");
        setRotatedDriverOffset("-6 0 -11");
        setDriverAimSpeed("2 2 0");
        setPassenger("1 0 20 0 turret -360 360 -15 40 m60 MG3");
        addBarrelPosition("101 26 1");
        addGun("52 28 -2 turret m60");
        addGunOrigin("1 -5 47 -15");
        
    }
}

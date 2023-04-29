package com.wolffsmod.entity.official.mw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityT90 extends EntityFlanVehicleNPC
{
    public EntityT90(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("0 20 0 -360 360 -10 20");
        setRotatedDriverOffset("-5 0 11");
        setPassenger("1 0 15 0 turret -360 360 -15 40 rpd PassengerGun1");
        addBarrelPosition("110 20 0");
        addGun("8 34 8 turret rpd");
        addGunOrigin("1 -10 16 -12");
        
    }
}

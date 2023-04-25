package com.wolffsmod.entity.prototype;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityRatte extends EntityFlanVehicleNPC
{
    public EntityRatte(World w)
    {
        super(w);
        setSize(19F, 18F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.1F);
        setDriver("8 248 0 -360 360 -10 40");
        setDriverAimSpeed("0.25 0.15 0");
        setRotatedDriverOffset("6 0 -12");
        setPassenger("1 216 120 -30 core -12 12 -24 24 128mmGun Mantle");
        setPassenger("2 -386 200 -114 core -360 360 -15 20 128mmGun Left");
        setPassenger("3 -386 200 114 core -360 360 -15 20 128mmGun Right");
        setPassenger("4 -194 178 -124 core -360 360 -30 90 FlakRatte FlakLeft");
        setPassenger("5 -194 178 124 core -360 360 -30 90 FlakRatte FlakRight");
        addShootPointPrimary("89.6 215.8 -47 turret");
        addShootPointPrimary("89.6 215.8 47 turret");
        addGunOrigin("1 216 118 -30");
        addGunOrigin("2 -386 185 -114");
        addGunOrigin("3 -386 185 114");
        addGunOrigin("4 -194 170 -124");
        addGunOrigin("5 -194 170 124");
        
    }
}

package com.wolffsmod.entity.berggeit;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityKV2 extends EntityFlanVehicleNPC
{
    public EntityKV2(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.15F);
        setDriver("0 28 0 -360 360 -10 20");
        setRotatedDriverOffset("-26 0 0");
        setPassenger("1 0 16 0 turret -360 360 -15 60 dp28 DP28");
        addBarrelPosition("0 34 0");
        addGun("8 34 8 turret dp28");
        addGunOrigin("1 0 30 0");
        
    }
}

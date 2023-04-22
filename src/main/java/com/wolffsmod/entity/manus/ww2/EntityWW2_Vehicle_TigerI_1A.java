package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_TigerI_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_TigerI_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.8F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("0 34 0 -360 360 -10 20");
        setPassenger("1 33 12 17 core -30 30 -10 10 WW2_MG_MG42ZB_1A FrontMG");
        addBarrelPosition("0 32 0");
        addGun("30 32 7 turret WW2_MG_MG42ZB_1A");
        addGunOrigin("1 52 18 11");
        
    }
}

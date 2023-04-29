package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_JagdpanzerIV_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_JagdpanzerIV_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.2F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("-4 17 13 0 0 -10 20");
        setPassenger("1 -9 21 -9 turret -50 50 -10 40 WW2_MG_MG42ZB_1A MG42");
        addBarrelPosition("0 34 0");
        addGunOrigin("1 -5 34 -9");
        
    }
}

package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_Arado196_1A extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_Arado196_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("-9 31 0");
        setPassenger("1 -35 30 0 core 150 210 5 50 WW2_MG_MG81ZB_1A Gun0");
        addShootPointPrimary("19 25 -42 leftWing WW2_MG_MGFF_1A");
        addShootPointPrimary("19 25 42 rightWing WW2_MG_MGFF_1A");
        addShootPointPrimary("62 29 0 nose WW2_MG_MG17_1A");
        addShootPointSecondary("0 -10 0");
        addGunOrigin("1 -55 48 0");
        
    }
}

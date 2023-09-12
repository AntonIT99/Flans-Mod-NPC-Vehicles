package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_JU87_2A extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_JU87_2A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.8F);
        setDriver("12 28 0");
        setPassenger("1 -8 27 0 core 140 220 -5 50 WW2_MG_MG81ZB_1A MG81");
        addShootPointSecondary("27 23 -26 leftWing WW2_MG_MG42ZB_1A");
        addShootPointSecondary("27 23 26 rightWing WW2_MG_MG42ZB_1A");
        addShootPointPrimary("60 13 38 rightWing");
        addShootPointPrimary("60 13 -38 leftWing");
        addGunOrigin("1 -30 43 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        
    }
}

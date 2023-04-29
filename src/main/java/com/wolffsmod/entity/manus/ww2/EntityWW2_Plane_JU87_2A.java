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
        setTurnSpeed(2.0F);
        setDriver("7 26 0");
        setPassenger("1 -08 26 0 core 150 210 0 50 WW2_MG_MG81ZB_1A MG81");
        addShootPointPrimary("27 23 -26 leftWing WW2_MG_MG42ZB_1A");
        addShootPointPrimary("27 23 26 rightWing WW2_MG_MG42ZB_1A");
        addShootPointSecondary("60 13 -38 leftWing WW2_MG_BordkanoneBK37_1A");
        addShootPointSecondary("60 13 38 rightWing WW2_MG_BordkanoneBK37_1A");
        addGunOrigin("1 -30 43 0");
        
    }
}

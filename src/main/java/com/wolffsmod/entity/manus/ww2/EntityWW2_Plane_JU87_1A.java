package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_JU87_1A extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_JU87_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.8F);
        setDriver("12 28 0");
        setPassenger("1 -08 26 0 core 150 210 0 50 WW2_MG_MG81ZB_1A MG81");
        addShootPointPrimary("27 23 -26 leftWing WW2_MG_MG42ZB_1A");
        addShootPointPrimary("27 23 26 rightWing WW2_MG_MG42ZB_1A");
        addShootPointSecondary("0 -12 0");
        addGunOrigin("1 -30 43 0");
        
    }
}

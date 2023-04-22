package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_Bf109E_1C extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_Bf109E_1C(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("-21 18 0");
        addShootPointPrimary("47 31 3 core WW2_MG_MG17_1A");
        addShootPointPrimary("47 31 -3 core WW2_MG_MG17_1A");
        addShootPointPrimary("16 19 -43 leftWing WW2_MG_MGFF_1A");
        addShootPointPrimary("16 19 43 rightWing WW2_MG_MGFF_1A");
        addShootPointSecondary("-5 0 0 core");
        
    }
}

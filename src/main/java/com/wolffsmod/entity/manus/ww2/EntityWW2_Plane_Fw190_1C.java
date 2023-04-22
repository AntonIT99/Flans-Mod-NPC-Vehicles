package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_Fw190_1C extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_Fw190_1C(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("-28 32 0");
        addShootPointPrimary("36 48 3 core WW2_MG_MG17_1A");
        addShootPointPrimary("36 48 -3 core WW2_MG_MG17_1A");
        addShootPointPrimary("22 24 19 rightWing WW2_MG_MG151_1A");
        addShootPointPrimary("14 27 50 rightWing WW2_MG_MGFF_1A");
        addShootPointPrimary("22 24 -19 leftWing WW2_MG_MG151_1A");
        addShootPointPrimary("14 27 -50 leftWing WW2_MG_MGFF_1A");
        addShootPointSecondary("-15 0 0 core");
        
    }
}

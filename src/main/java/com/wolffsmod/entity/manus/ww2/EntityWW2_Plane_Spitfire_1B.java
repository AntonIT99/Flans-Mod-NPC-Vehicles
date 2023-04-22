package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_Spitfire_1B extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_Spitfire_1B(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("-14 11 0");
        addShootPointPrimary("35 13 -32 leftWing WW2_MG_BrowningM2_1A");
        addShootPointPrimary("35 13 32 rightWing WW2_MG_BrowningM2_1A");
        addShootPointSecondary("0 -12 0");
        
    }
}

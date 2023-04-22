package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_Hurricane_1A extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_Hurricane_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("-11 14 0");
        addShootPointPrimary("15 13 -40 leftWing WW2_MG_BrowningM2_1A");
        addShootPointPrimary("15 13 40 rightWing WW2_MG_BrowningM2_1A");
        addShootPointSecondary("0 -10 0");
        
    }
}

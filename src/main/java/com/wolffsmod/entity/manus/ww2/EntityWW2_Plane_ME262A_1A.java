package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_ME262A_1A extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_ME262A_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("-38 25 0");
        addShootPointPrimary("52 34 4 core WW2_MG_MK108FF_1A");
        addShootPointPrimary("52 34 -4 core WW2_MG_MK108FF_1A");
        addShootPointPrimary("52 31 8 core WW2_MG_MK108FF_1A");
        addShootPointPrimary("52 31 -8 core WW2_MG_MK108FF_1A");
        addShootPointSecondary("-35 0 0 core");
        
    }
}

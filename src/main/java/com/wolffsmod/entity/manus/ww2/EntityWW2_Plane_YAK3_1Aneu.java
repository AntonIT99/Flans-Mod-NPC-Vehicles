package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_YAK3_1Aneu extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_YAK3_1Aneu(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("-11 21 0");
        addShootPointPrimary("68 34 4 core WW2_MG_MG532_1A");
        addShootPointPrimary("68 34 -4 core WW2_MG_MG532_1A");
        addShootPointPrimary("68 27 0 nose WW2_MG_MKII_1A");
        addShootPointPrimary("0 -10 0");
        
    }
}

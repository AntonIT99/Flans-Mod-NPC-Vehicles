package com.wolffsmod.entity.baf;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityT0FHurricane extends EntityFlanPlaneNPC
{
    public EntityT0FHurricane(World w)
    {
        super(w);
        setSize(4.5F, 3.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.85F);
        setDriver("26 13 0");
        addShootPointPrimary("62 -1 -42 leftWing browning303 0 0 0 0.03");
        addShootPointPrimary("62 -1 42 rightWing browning303 0 0 0 -0.03");
        addShootPointPrimary("62 -1 -40 leftWing browning303 0 0 0 0.03");
        addShootPointPrimary("62 -1 40 rightWing browning303 0 0 0 -0.03");
        addShootPointPrimary("62 -1 -44 leftWing browning303 0 0 0 0.03");
        addShootPointPrimary("62 -1 44 rightWing browning303 0 0 0 -0.03");
        addShootPointPrimary("62 -1 -38 leftWing browning303 0 0 0 0.03");
        addShootPointPrimary("62 -1 38 rightWing browning303 0 0 0 -0.03");
        addShootPointSecondary("0 -10 0");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        
    }
}

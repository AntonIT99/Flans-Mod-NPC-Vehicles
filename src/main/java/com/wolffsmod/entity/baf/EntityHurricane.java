package com.wolffsmod.entity.baf;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityHurricane extends EntityFlanPlaneNPC
{
    public EntityHurricane(World w)
    {
        super(w);
        setSize(4.5F, 3.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.85F);
        addShootPointPrimary("15 13 -42 leftWing browning303");
        addShootPointPrimary("15 13 42 rightWing browning303");
        addShootPointPrimary("15 13 -40 leftWing browning303");
        addShootPointPrimary("15 13 40 rightWing browning303");
        addShootPointPrimary("15 13 -44 leftWing browning303");
        addShootPointPrimary("15 13 44 rightWing browning303");
        addShootPointPrimary("15 13 -38 leftWing browning303");
        addShootPointPrimary("15 13 38 rightWing browning303");
        addShootPointSecondary("0 -10 0");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        
    }
}

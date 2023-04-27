package com.wolffsmod.entity.baf;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityHurricane extends EntityFlanVehicleNPC
{
    public EntityHurricane(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
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

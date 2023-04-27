package com.wolffsmod.entity.newage;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityHurricaneMk2d extends EntityFlanVehicleNPC
{
    public EntityHurricaneMk2d(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.82F);
        addShootPointPrimary("62 -1 50 rightWing browning303");
        addShootPointPrimary("62 -1 -50 leftWing browning303");
        addShootPointSecondary("83 -9 39 rightWing");
        addShootPointSecondary("83 -9 -39 leftWing");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        
    }
}

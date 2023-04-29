package com.wolffsmod.entity.newage;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityHurricaneMk2c extends EntityFlanPlaneNPC
{
    public EntityHurricaneMk2c(World w)
    {
        super(w);
        setSize(4.5F, 3.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.85F);
        setDriver("24 11 0");
        addShootPointPrimary("87 -1 41 rightWing hispano20");
        addShootPointPrimary("87 0 56 rightWing hispano20");
        addShootPointPrimary("87 0 -56 leftWing hispano20");
        addShootPointPrimary("87 -1 -41 rightWing hispano20");
        addShootPointSecondary("0 -10 0");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        
    }
}

package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entity11221_DiveBomber_B7ARyusei extends EntityFlanPlaneNPC
{
    public Entity11221_DiveBomber_B7ARyusei(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.825F);
        setDriver("22 -3 0");
        setPassenger("1 -18 -4 0 core 130 230 -5 35 vg_12.7mm_browningm2 Type3");
        addShootPointPrimary("34 -9 45 rightWing");
        addShootPointPrimary("42 -9 45 rightWing");
        addShootPointPrimary("34 -9 -43 leftWing");
        addShootPointPrimary("42 -9 -43 leftWing");
        addShootPointSecondary("15 -20 0 core");
        addGunOrigin("1 -20 -14 0");
        addShootParticlesPrimary("cloud 0 0 0");
        
    }
}

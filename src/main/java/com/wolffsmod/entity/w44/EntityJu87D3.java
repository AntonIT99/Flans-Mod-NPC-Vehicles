package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityJu87D3 extends EntityFlanPlaneNPC
{
    public EntityJu87D3(World w)
    {
        super(w);
        this.setSize(3.0F, 5.0F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(1F);
        setDriver("-23 33 0");
        setPassenger("1 -41 31 0 core 140 220 -5 45 44_Mg15 PassengerGun1");
        addGunOrigin("1 -51 26 0");

        addShootPointPrimary("5 26 43 core 44_Mg17");
        addShootPointPrimary("5 26 -43 core 44_Mg17");

        addShootPointSecondary("25 -5 0 core");

        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
    }
}

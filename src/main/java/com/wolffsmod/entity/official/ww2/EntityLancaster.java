package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityLancaster extends EntityFlanPlaneNPC
{
    public EntityLancaster(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.55F);
        setDriver("115 20 0");
        setPassenger("1 148 2 0 nose -30 30 -30 30 pg_7.7mm_browning Nose");
        setPassenger("2 90 10 0 core -360 360 -89 89");
        setPassenger("3 70 10 0 core -360 360 -89 89");
        setPassenger("4 -48 36 0 core -360 360 -10 55 pg_7.7mm_browning Dorsal");
        setPassenger("5 -128 20 0 tail 120 240 -35 35 pg_7.7mm_browning Tail");
        addShootPointPrimary("0 16 0 core");
        addShootPointSecondary("48 -19 6 core");
        addShootPointSecondary("48 -19 -6 core");
        addGunOrigin("1 148 -4 0");
        addGunOrigin("4 -48 30 0");
        addGunOrigin("5 -128 14 0");
        addShootParticlesPrimary("note 0 3 0");
        addShootParticlesPrimary("note 0 4 0");
    }
}

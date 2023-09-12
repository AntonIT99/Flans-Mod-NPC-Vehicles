package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entity11202_LightFighterEBiPlane_SPADA2 extends EntityFlanPlaneNPC
{
    public Entity11202_LightFighterEBiPlane_SPADA2(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.65F);
        setDriver("-17 -4 0");
        setPassenger("1 13 -4 0 core -100 100 -10 65 vg_7.62mm_lmg Nose");
        addShootPointPrimary("");
        addShootPointSecondary("");
        addGunOrigin("1 13 -12 0");
        
    }
}

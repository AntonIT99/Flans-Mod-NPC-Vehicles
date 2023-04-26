package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityT35 extends EntityFlanVehicleNPC
{
    public EntityT35(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("0 32 0 -360 360 -5 25");
        setRotatedDriverOffset("-4 0 8");

        //TODO: fix multi turrets tank guns
        /*setPassenger("1 26 17 8 nose -30 135 -5 28 vg_45mm_m1934 Nose");
        setPassenger("2 -26 17 -8 nose 145 310 -5 28 vg_45mm_m1934 Nose2");
        setPassenger("3 22 14 -11 nose -135 20 -10 30 vg_7.62mm_lmg Nose3");
        setPassenger("4 -22 14 11 nose 45 200 -10 30 vg_7.62mm_lmg Nose4");*/

        setPassenger("1 26 17 8 nose 0 0 -5 28 vg_45mm_m1934 Nose");
        setPassenger("2 -26 17 -8 nose 0 0 -5 28 vg_45mm_m1934 Nose2");
        setPassenger("3 22 14 -11 nose 0 0 -10 30 vg_7.62mm_lmg Nose3");
        setPassenger("4 -22 14 11 nose 0 0 -10 30 vg_7.62mm_lmg Nose4");

        addShootPointPrimary("30 38 0 turret");
        addShootPointSecondary("23 35 10 turret");
        addGunOrigin("1 26 8 8");
        addGunOrigin("2 -26 8 -8");
        addGunOrigin("3 22 5 -11");
        addGunOrigin("4 -22 5 11");
        addShootParticlesPrimary("largeexplode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        
    }
}

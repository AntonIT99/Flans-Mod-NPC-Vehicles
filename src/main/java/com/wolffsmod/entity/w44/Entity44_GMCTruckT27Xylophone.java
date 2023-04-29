package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_GMCTruckT27Xylophone extends EntityFlanVehicleNPC
{
    public Entity44_GMCTruckT27Xylophone(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("23 13 -7 -360 360 -89 89");
        setRotatedDriverOffset("0 0 0");
        setDriverAimSpeed("0.6 0.5 0");
        addShootPointPrimary("3 36 26 core");
        addShootPointPrimary("-3 36 26 core");
        addShootPointPrimary("-9 36 26 core");
        addShootPointPrimary("-15 36 26 core");
        addShootPointPrimary("-35 36 26 core");
        addShootPointPrimary("-41 36 26 core");
        addShootPointPrimary("-47 36 26 core");
        addShootPointPrimary("-53 36 26 core");
        addShootParticlesPrimary("largeexplode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        addShootParticlesSecondary("crit 0.5 0 0");
        
    }
}

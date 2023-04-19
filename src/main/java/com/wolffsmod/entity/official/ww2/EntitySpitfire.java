package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntitySpitfire extends EntityFlanPlaneNPC
{
    public EntitySpitfire(World w)
    {
        super(w);
        this.setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.8F);
        setDriver("-4 -4 0");
        addShootPointPrimary("40 -4 44 rightWing browning");
        addShootPointPrimary("40 -4 -44 leftWing browning");
        ShootPointSecondary("-30 -12 0");
        
    }
}

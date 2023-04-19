package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityZero extends EntityFlanPlaneNPC
{
    public EntityZero(World w)
    {
        super(w);
        this.setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("10 2 0");
        addShootPointPrimary("80 11 6 nose type99");
        addShootPointPrimary("80 11 -6 nose type99");
        ShootPointSecondary("-30 -22 0");
        
    }
}

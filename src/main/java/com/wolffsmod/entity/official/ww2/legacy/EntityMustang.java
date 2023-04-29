package com.wolffsmod.entity.official.ww2.legacy;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityMustang extends EntityFlanPlaneNPC
{
    public EntityMustang(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.8F);
        setDriver("-4 -4 0");
        addShootPointSecondary("-30 -12 0");
        addShootPointPrimary("60 3 -5 nose browning");
        addShootPointPrimary("60 3 5 nose browning");
        
    }
}

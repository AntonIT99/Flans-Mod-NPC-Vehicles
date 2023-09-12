package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityCamel extends EntityFlanPlaneNPC
{
    public EntityCamel(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.7F);
        setDriver("0 -4 0");
        addShootPointPrimary("30 4 4 nose");
        addShootPointPrimary("30 4 -4 nose");
        addShootParticlesPrimary("cloud 0 0 0");
        
    }
}

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
        setTurnSpeed(3.0F);
        setDriver("0 -4 0");
        addShootPointPrimary("30 3 5 nose browning");
        addShootPointPrimary("30 3 -5 nose browning");
        
    }
}

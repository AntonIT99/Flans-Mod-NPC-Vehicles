package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityMIG15 extends EntityFlanPlaneNPC
{
    public EntityMIG15(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("-4 7 0");
        addShootPointPrimary("7 -10 0");
        addShootPointSecondary("36 21 2 nose BrowningM2HB");
        addShootPointSecondary("36 21 -2 nose BrowningM2HB");
        
    }
}

package com.wolffsmod.entity.baf;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityT1p5FVickersValiant extends EntityFlanPlaneNPC
{
    public EntityT1p5FVickersValiant(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("227 65 -8");
        setPassenger("1 227 65 8 core");
        addShootPointPrimary("69 6 -9 core");
        addShootPointPrimary("36 6 -9 core");
        addShootPointPrimary("-9 6 -9 core");
        addShootPointPrimary("-9 6 9 core");
        addShootPointPrimary("36 6 9 core");
        addShootPointPrimary("69 6 9 core");
        addShootPointSecondary("169 35 -16 core");
        addShootPointSecondary("169 35 16 core");
        
    }
}

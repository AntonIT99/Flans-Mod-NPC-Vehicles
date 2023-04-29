package com.wolffsmod.entity.official.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityB52 extends EntityFlanPlaneNPC
{
    public EntityB52(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.5F);
        setPassenger("1 412 69 13 core");
        setPassenger("2 385 34 16 core");
        setPassenger("3 385 34 -16 core");
        setPassenger("4 309 60 9 core");
        setPassenger("5 309 60 -9 core");
        addShootPointSecondary("0 16 10 core 0");
        addShootPointSecondary("-47 16 10 core 0");
        addShootPointSecondary("78 16 10 core 0");
        addShootPointSecondary("155 16 10 core 0");
        addShootPointSecondary("207 16 10 core 0");
        addShootPointSecondary("0 16 -10 core 0");
        addShootPointSecondary("-47 16 -10 core 0");
        addShootPointSecondary("78 16 -10 core 0");
        addShootPointSecondary("155 16 -10 core 0");
        addShootPointSecondary("207 16 -10 core 0");
        
    }
}

package com.wolffsmod.entity.official.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityBlackHawk extends EntityFlanPlaneNPC
{
    public EntityBlackHawk(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setPassenger("1 49 13 -14 core");
        setPassenger("2 -14 12 -17 core");
        setPassenger("3 -14 12 -6 core");
        setPassenger("4 -14 12 5 core");
        setPassenger("5 -14 12 16 core");
        setPassenger("6 17 12 16 core");
        setPassenger("7 17 12 5 core");
        setPassenger("8 17 12 -5 core");
        setPassenger("9 17 12 -17 core");
        setPassenger("10 30 12 -10 core");
        setPassenger("11 30 12 10 core");
        
    }
}

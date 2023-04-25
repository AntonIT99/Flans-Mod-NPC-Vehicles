package com.wolffsmod.entity.official.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityLittleBird extends EntityFlanPlaneNPC
{
    public EntityLittleBird(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setPassenger("1 16 7 -6 core");
        setPassenger("2 0 7 -6 core");
        setPassenger("3 0 7 6 core");
        setPassenger("4 15 4 -14 core");
        setPassenger("5 3 4 -14 core");
        setPassenger("6 3 4 14 core");
        setPassenger("7 15 4 14 core");
        
    }
}

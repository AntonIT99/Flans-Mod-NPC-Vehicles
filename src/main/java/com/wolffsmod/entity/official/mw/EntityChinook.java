package com.wolffsmod.entity.official.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityChinook extends EntityFlanPlaneNPC
{
    public EntityChinook(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.25F);
        setPassenger("1 154 17 -10 core");
        setPassenger("2 110 15 18 core");
        setPassenger("3 72 15 18 core");
        setPassenger("4 45 15 18 core");
        setPassenger("5 19 15 18 core");
        setPassenger("6 6 15 18 core");
        setPassenger("7 -20 15 18 core");
        setPassenger("8 -33 15 18 core");
        setPassenger("9 110 15 -18 core");
        setPassenger("10 72 15 -18 core");
        setPassenger("11 45 15 -18 core");
        setPassenger("12 19 15 -18 core");
        setPassenger("13 6 15 -18 core");
        setPassenger("14 -20 15 -18 core");
        setPassenger("15 -33 15 -18 core");
        setPassenger("16 -7 15 -18 core");
        setPassenger("17 32 15 -18 core");
        setPassenger("18 60 15 -18 core");
        setPassenger("19 82 15 -18 core");
        setPassenger("20 95 15 -18 core");
        setPassenger("21 85 15 18 core");
        setPassenger("22 97 15 18 core");
        setPassenger("23 59 15 18 core");
        setPassenger("24 32 15 18 core");
        setPassenger("25 -7 15 18 core");
        
    }
}

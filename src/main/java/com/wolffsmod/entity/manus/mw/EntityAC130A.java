package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityAC130A extends EntityFlanPlaneNPC
{
    public EntityAC130A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("146 24 -9");
        setPassenger("1 146 24 9 core");
        setPassenger("2 -84 9 17 core 60 120 -40 10 HKGMG HKGMG1");
        setPassenger("3 -84 9 -17 core -120 -60 -40 10 HKGMG HKGMG2");
        setPassenger("4 58 9 17 core 60 120 -40 10 M134 M134a");
        setPassenger("5 58 9 -17 core -120 -60 -40 10 M134 M134b");
        setPassenger("6 94 9 17 core 60 120 -40 10 M134 M134c");
        setPassenger("7 94 9 -17 core -120 -60 -40 10 M134 M134d");
        addBombPosition("7 -10 0");
        
    }
}

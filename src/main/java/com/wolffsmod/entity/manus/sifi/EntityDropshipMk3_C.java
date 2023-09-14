package com.wolffsmod.entity.manus.sifi;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityDropshipMk3_C extends EntityFlanPlaneNPC
{
    public EntityDropshipMk3_C(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(3.0F);
        setDriver("55 14 -11 -80 80 -45 45");
        setPassenger("1 55 14 11 core -100 100 -50 10 ColonialBlasterCannon TurretGun");
        setPassenger("2 22 13 -15 core 60 120 -45 45");
        setPassenger("3 22 13 15 core -120 -60 -45 45");
        setPassenger("4 -20 12 -4 core 60 120 -45 45");
        setPassenger("5 -42 12 -4 core 60 120 -45 45");
        addBombPosition("7 -10 0");
        
    }
}

package com.wolffsmod.entity.manus.sifi;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityDropshipMk3_B extends EntityFlanPlaneNPC
{
    public EntityDropshipMk3_B(World w)
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
        setPassenger("2 20 13 -15 core -80 80 -45 45");
        setPassenger("3 20 13 15 core -80 80 -45 45");
        setPassenger("4 -19 13 -15 core -80 80 -45 45");
        setPassenger("5 -19 13 15 core -80 80 -45 45");
        setPassenger("6 -41 13 -15 core -80 80 -45 45");
        setPassenger("7 -41 13 15 core -80 80 -45 45");
        addBombPosition("7 -10 0");
        
    }
}

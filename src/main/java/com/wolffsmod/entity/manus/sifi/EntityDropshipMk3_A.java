package com.wolffsmod.entity.manus.sifi;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityDropshipMk3_A extends EntityFlanPlaneNPC
{
    public EntityDropshipMk3_A(World w)
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
        setPassenger("2 25 13 -15 core 60 120 -45 45");
        setPassenger("3 25 13 15 core -120 -60 -45 45");
        setPassenger("4 -2 7 -18 core -140 -40 -45 45 ColonialBlasterCannon SideGunLeft");
        setPassenger("5 -2 7 18 core 40 140 -45 45 ColonialBlasterCannon SideGunRight");
        setPassenger("6 -26 13 -15 core 60 120 -45 45");
        setPassenger("7 -26 13 15 core -120 -60 -45 45");
        setPassenger("8 -44 13 -15 core 60 120 -45 45");
        setPassenger("9 -44 13 15 core -120 -60 -45 45");
        addBombPosition("7 -10 0");
        
    }
}

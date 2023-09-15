package com.wolffsmod.entity.manus.wh40k;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWH40K_Plane_Vulture_2A extends EntityFlanPlaneNPC
{
    public EntityWH40K_Plane_Vulture_2A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(4.0F);
        setDriver("14 48 0");
        setPassenger("1 53 32 0 core 0 0 0 0 WH40K_MG_HeavyBolter_1A PassengerGun1");
        addShootPointPrimary("40 29 46 rightWing WH40K_MG_LasCannon_2A");
        addShootPointPrimary("40 29 -46 leftWing WH40K_MG_LasCannon_2A");
        addShootPointSecondary("7 23 77 rightWing");
        addShootPointSecondary("7 23 -77 leftWing");
        addGunOrigin("1 -90 -1 0");
        
    }
}

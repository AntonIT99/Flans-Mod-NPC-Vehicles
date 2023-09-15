package com.wolffsmod.entity.manus.wh40k;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWH40K_Plane_Valkyrie_1A extends EntityFlanPlaneNPC
{
    public EntityWH40K_Plane_Valkyrie_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(4.0F);
        setDriver("14 48 0");
        setPassenger("1 53 32 0 core 0 0 0 0");
        setPassenger("2 -20 17 -6 core");
        setPassenger("3 -20 17 6 core");
        setPassenger("4 -37 17 -6 core");
        setPassenger("5 -37 17 6 core");
        setPassenger("6 -54 17 -6 core");
        setPassenger("7 -54 17 6 core");
        setPassenger("8 -71 17 -6 core");
        setPassenger("9 -71 17 6 core");
        addShootPointPrimary("84 28 20 core WH40K_MG_LasCannon_2A");
        addShootPointSecondary("7 23 77 rightWing");
        addShootPointSecondary("7 23 -77 leftWing");
        addGunOrigin("1 -90 -1 0");
        
    }
}

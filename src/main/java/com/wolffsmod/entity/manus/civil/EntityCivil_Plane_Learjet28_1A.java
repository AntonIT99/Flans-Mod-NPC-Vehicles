package com.wolffsmod.entity.manus.civil;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityCivil_Plane_Learjet28_1A extends EntityFlanPlaneNPC
{
    public EntityCivil_Plane_Learjet28_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("72 2 -7 -80 80 -45 45");
        setPassenger("1 72 2 7 core -80 80 -45 45");
        setPassenger("2 50 2 -7 core -80 80 -45 45");
        setPassenger("3 50 2 7 core -80 80 -45 45");
        setPassenger("4 29 2 -7 core -80 80 -45 45");
        setPassenger("5 29 2 7 core -80 80 -45 45");
        setPassenger("6 5 2 -7 core -80 80 -45 45");
        setPassenger("7 5 2 7 core -80 80 -45 45");
        addShootPointSecondary("0 -10 0");
        
    }
}

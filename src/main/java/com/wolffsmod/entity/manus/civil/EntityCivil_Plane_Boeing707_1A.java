package com.wolffsmod.entity.manus.civil;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityCivil_Plane_Boeing707_1A extends EntityFlanPlaneNPC
{
    public EntityCivil_Plane_Boeing707_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("292 71 -12 -80 80 -45 45");
        setPassenger("1 292 71 -12 core -80 80 -45 45");
        setPassenger("2 171 64 -32 core -80 80 -45 45");
        setPassenger("3 147 64 -32 core -80 80 -45 45");
        setPassenger("4 123 64 -32 core -80 80 -45 45");
        setPassenger("5 99 64 -32 core -80 80 -45 45");
        setPassenger("6 75 64 -32 core -80 80 -45 45");
        setPassenger("7 51 64 -32 core -80 80 -45 45");
        setPassenger("8 171 64 32 core -80 80 -45 45");
        setPassenger("9 147 64 32 core -80 80 -45 45");
        setPassenger("10 123 64 32 core -80 80 -45 45");
        setPassenger("11 99 64 32 core -80 80 -45 45");
        setPassenger("12 75 64 32 core -80 80 -45 45");
        setPassenger("13 51 64 32 core -80 80 -45 45");
        addShootPointSecondary("0 -10 0");
        
    }
}

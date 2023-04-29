package com.wolffsmod.entity.lizard;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityM113A3 extends EntityFlanVehicleNPC
{
    public EntityM113A3(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.35F);
        setDriver("1 25 0 -60 60 -20 50");
        setRotatedDriverOffset("-3 0 0");
        setPassenger("1 -12 4 11 core -360 360 -360 360 dummygun CrashPreventer1");
        setPassenger("2 -29 4 11 core -360 360 -360 360 dummygun CrashPreventer2");
        setPassenger("3 -29 4 -12 core -360 360 -360 360 dummygun CrashPreventer3");
        setPassenger("4 -12 4 -12 core -360 360 -360 360 dummygun CrashPreventer4");
        setPassenger("5 5 4 -12 core -360 360 -360 360 dummygun CrashPreventer5");
        setPassenger("6 5 4 11 core -360 360 -360 360 dummygun CrashPreventer6");
        addShootPointPrimary("41 37 0 turret twelveMM");
        
    }
}

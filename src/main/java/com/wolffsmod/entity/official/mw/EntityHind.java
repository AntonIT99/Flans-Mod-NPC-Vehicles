package com.wolffsmod.entity.official.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityHind extends EntityFlanPlaneNPC
{
    public EntityHind(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setPassenger("1 88 4 0 nose -90 90 -90 5 rpd Nose");
        setPassenger("2 -50 6 12 nose -360 30 -360 1");
        setPassenger("3 -50 6 -12 nose -360 30 -360 2");
        setPassenger("4 -40 6 12 nose -360 30 -360 3");
        setPassenger("5 -40 6 -12 nose -360 30 -360 4");
        addShootPointPrimary("-13 7 -53 rightWing");
        addShootPointPrimary("-13 7 53 leftWing");
        addGunOrigin("1 64 -28 0");
        
    }
}

package com.wolffsmod.entity.prototype.bmp;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityTSR2 extends EntityFlanPlaneNPC
{
    public EntityTSR2(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(4.0F);
        setDriver("184 45 0");
        setPassenger("1 149 50 0 core");
        addShootPointPrimary("-17 28 0 core");
        addShootPointSecondary("-26 58 46 rightWing");
        addShootPointSecondary("-62 61 73 rightWing");
        addShootPointSecondary("-62 61 84 rightWing");
        addShootPointSecondary("-26 58 -46 leftWing");
        addShootPointSecondary("-62 61 -73 leftWing");
        addShootPointSecondary("-62 61 -84 leftWing");
        
    }
}

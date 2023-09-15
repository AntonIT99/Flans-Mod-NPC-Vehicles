package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityFang extends EntityFlanPlaneNPC
{
    public EntityFang(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(4.0F);
        setDriver("34 15 0");
        addShootPointPrimary("24 35.5 21.5 core LaserMG");
        addShootPointPrimary("24 35.5 -21.5 core LaserMG");
        addShootPointPrimary("24 35.5 28.5 core LaserMG");
        addShootPointPrimary("24 35.5 -28.5 core LaserMG");
        addShootPointSecondary("-65 6 0 rightWing");
        
    }
}

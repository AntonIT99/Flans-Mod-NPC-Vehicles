package com.wolffsmod.entity.manus.sifi;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityTIEFighter extends EntityFlanPlaneNPC
{
    public EntityTIEFighter(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("4 47 0");
        addBombPosition("7 -10 0");
        addGun("30 50 5 core ImperialLaserCannon");
        addGun("30 50 -5 core ImperialLaserCannon");
        
    }
}

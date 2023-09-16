package com.wolffsmod.entity.manus.sifi;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityTIEInterceptor extends EntityFlanPlaneNPC
{
    public EntityTIEInterceptor(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("4 45 0");
        addBombPosition("7 -10 0");
        addGun("140 79 50 leftWing ImperialLaserCannon");
        addGun("140 46 50 leftWing ImperialLaserCannon");
        addGun("140 79 -50 rightWing ImperialLaserCannon");
        addGun("140 46 -50 rightWing ImperialLaserCannon");
        
    }
}

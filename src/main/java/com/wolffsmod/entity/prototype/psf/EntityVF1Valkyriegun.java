package com.wolffsmod.entity.prototype.psf;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityVF1Valkyriegun extends EntityFlanPlaneNPC
{
    public EntityVF1Valkyriegun(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(4.0F);
        setDriver("78 34 0");
        addShootPointPrimary("25 10.5 0 core gau36");
        addShootPointSecondary("-60 16 -58 leftWing");
        addShootPointSecondary("-60 16 58 rightWing");
        
    }
}

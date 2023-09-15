package com.wolffsmod.entity.prototype.psf;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityVF1Valkyrie extends EntityFlanPlaneNPC
{
    public EntityVF1Valkyrie(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("78 34 0");
        addBombPosition("-30 -12 0");
        
    }
}

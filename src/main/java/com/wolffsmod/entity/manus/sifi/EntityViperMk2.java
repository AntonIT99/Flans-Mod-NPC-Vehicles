package com.wolffsmod.entity.manus.sifi;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityViperMk2 extends EntityFlanPlaneNPC
{
    public EntityViperMk2(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("6 8 0 -80 80 -45 45");
        addBombPosition("7 -10 0");
        addGun("22 5 19 core ColonialBlasterCannon");
        addGun("22 5 -19 core ColonialBlasterCannon");
        
    }
}

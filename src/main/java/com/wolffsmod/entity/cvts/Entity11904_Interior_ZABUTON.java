package com.wolffsmod.entity.cvts;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11904_Interior_ZABUTON extends EntityFlanVehicleNPC
{
    public Entity11904_Interior_ZABUTON(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 -7 0 -360 360 -89 89");
        setRotatedDriverOffset("0 0 0");
        addShootPointPrimary("");
        addShootPointSecondary("");
        setRotateWheels(false);
        
    }
}

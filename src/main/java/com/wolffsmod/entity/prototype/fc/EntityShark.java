package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityShark extends EntityFlanPlaneNPC
{
    public EntityShark(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("50 24 0");
        addShootPointPrimary("81 9 0 nose gau36");
        addShootPointSecondary("-9 18.5 94.5 rightWing");
        addShootPointSecondary("-9 18.5 114.5 rightWing");
        addShootPointSecondary("-9 18.5 134.5 rightWing");
        addShootPointSecondary("-9 18.5 -94.5 leftWing");
        addShootPointSecondary("-9 18.5 -114.5 leftWing");
        addShootPointSecondary("-9 18.5 -134.5 leftWing");
        
    }
}

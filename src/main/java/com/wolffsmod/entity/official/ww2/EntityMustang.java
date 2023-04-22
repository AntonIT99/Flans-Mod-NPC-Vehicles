package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityMustang extends EntityFlanPlaneNPC
{
    public EntityMustang(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.6F);
        setDriver("9 23 0");
        addShootPointPrimary("44 19 40 rightWing 50Cal");
        addShootPointPrimary("43 20 44 rightWing 50Cal");
        addShootPointPrimary("43 20 48 rightWing 50Cal");
        addShootPointPrimary("43 19 -40 leftWing 50Cal");
        addShootPointPrimary("42 20 -44 leftWing 50Cal");
        addShootPointPrimary("42 20 -49 leftWing 50Cal");
        addShootPointSecondary("-30 -12 0");
    }
}

package com.wolffsmod.entity.prototype.bmp;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityApache extends EntityFlanPlaneNPC
{
    public EntityApache(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("54 32 0");
        setPassenger("1 83 24 0 core -360 360 -90 5 ADEN Nose");
        addShootPointPrimary("45 22 55 rightWing CRV7");
        addShootPointPrimary("45 22 -55 rightWing CRV7");
        addShootPointSecondary("45 22 37 rightWing");
        addShootPointSecondary("45 22 -37 rightWing");
        addGunOrigin("1 73 6 0");
        
    }
}

package com.wolffsmod.entity.official.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityCobra extends EntityFlanPlaneNPC
{
    public EntityCobra(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setPassenger("1 52 -8 0 nose -30 30 -30 0 minigun Nose");
        addShootPointPrimary("12 -4 -29 rightWing");
        addShootPointPrimary("12 -4 29 leftWing");
        addGunOrigin("1 64 -28 0");
        
    }
}

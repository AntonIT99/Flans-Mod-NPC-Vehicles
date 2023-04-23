package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityAH1Z extends EntityFlanPlaneNPC
{
    public EntityAH1Z(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(10.0F);
        setDriver("13 7 0");
        setPassenger("1 32 2 0 nose -100 100 -50 10 M134 TURRET");
        addBombPosition("7 -10 0");
        addGun("13 1 -27 leftWing M148JavelinDep");
        addGun("13 1 27 rightWing M148JavelinDep");
        
    }
}

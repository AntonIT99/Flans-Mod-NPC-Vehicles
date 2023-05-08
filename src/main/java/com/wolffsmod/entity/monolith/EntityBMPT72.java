package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBMPT72 extends EntityFlanVehicleNPC
{
    public EntityBMPT72(World w)
    {
        super(w);
        setSize(3.5F, 3F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 10 0 -360 360 -10 450");
        setRotatedDriverOffset("6 0 0");
        addShootPointPrimary("-25 37 3 turret thirtyMM");
        addShootPointPrimary("-25 37 -3 turret thirtyMM");
        addShootPointSecondary("-6 36 14 turret");
        addShootPointSecondary("-6 34 16 turret");
        addShootPointSecondary("-6 36 -14 turret");
        addShootPointSecondary("-6 34 -16 turret");
        
    }
}

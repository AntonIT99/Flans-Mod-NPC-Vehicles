package com.wolffsmod.entity.cvts;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11940_AAGun_2cm_Flakvierling38 extends EntityFlanVehicleNPC
{
    public Entity11940_AAGun_2cm_Flakvierling38(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 0 0 -360 360 -10 89");
        setRotatedDriverOffset("-6 0 -10");
        addShootPointPrimary("24 4 -4 turret");
        addShootPointPrimary("24 -4 4 turret");
        addShootPointPrimary("24 4 4 turret");
        addShootPointPrimary("24 -4 -4 turret");
        addShootPointSecondary("");
        setRotateWheels(false);
        
    }
}

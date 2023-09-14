package com.wolffsmod.entity.prototype.bmp;

import com.wolffsmod.entity.EntityFlanShipNPC;
import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityDaring extends EntityFlanShipNPC
{
    public EntityDaring(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.05F);
        setDriver("608 268 0 -360 360 -50 90");
        setRotatedDriverOffset("6 0 -12");
        setPassenger("1 1014 230 0 core -120 120 -15 40 mk8mod1 Main");
        setPassenger("2 -15 226 112 core 10 170 -15 60 CIWS PhalanxRight");
        setPassenger("3 -15 226 -112 core -170 -10 -15 60 CIWS PhalanxLeft");
        addShootPointPrimary("804 208 -53 core");
        addShootPointPrimary("804 208 -23 core");
        addShootPointPrimary("804 208 0 core");
        addShootPointPrimary("804 208 53 core");
        addShootPointPrimary("824 208 23 core");
        addShootPointPrimary("824 208 -53 core");
        addShootPointPrimary("824 208 -23 core");
        addShootPointPrimary("824 208 0 core");
        addShootPointPrimary("824 208 53 core");
        addShootPointPrimary("824 208 23 core");
        addShootPointPrimary("814 208 -53 core");
        addShootPointPrimary("814 208 -23 core");
        addShootPointPrimary("814 208 0 core");
        addShootPointPrimary("814 208 53 core");
        addShootPointPrimary("814 208 23 core");
        addGunOrigin("1 1000 204 0");
        addGunOrigin("2 -12 256 112");
        addGunOrigin("3 -12 256 -112");
        
    }
}

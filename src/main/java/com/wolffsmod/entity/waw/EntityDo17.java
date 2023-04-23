package com.wolffsmod.entity.waw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityDo17 extends EntityFlanPlaneNPC
{
    public EntityDo17(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("115 20 0");
        setPassenger("1 148 2 0 nose -30 30 -25 25 browning30Cal Nose");
        setPassenger("2 90 10 0 core");
        setPassenger("3 70 10 0 core");
        setPassenger("4 -48 36 0 tail -360 360 0 45 browning30Cal Dorsal");
        setPassenger("5 -128 20 0 tail 135 225 -30 30 browning30Cal Tail");
        addShootPointPrimary("0 -32 0");
        addGunOrigin("1 148 -2 0");
        addGunOrigin("4 -48 32 0");
        addGunOrigin("5 -128 16 0");

    }
}

package com.wolffsmod.entity.akaku;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityMeillerwagen extends EntityFlanVehicleNPC
{
    public EntityMeillerwagen(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("-27 8 -6");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 -27 8 6 core");
        setPassenger("2 -41 8 -6 core");
        setPassenger("3 -41 8 6 core");
        
    }
}

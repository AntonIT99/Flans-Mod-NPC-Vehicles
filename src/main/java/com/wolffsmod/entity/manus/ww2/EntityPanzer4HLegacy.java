package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityPanzer4HLegacy extends EntityFlanVehicleNPC
{
    public EntityPanzer4HLegacy(World w)
    {
        super(w);
        this.setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(1F);
        setDriver("0 21 0 -360 360 -5 45");
        addBarrelPosition("0 31 0");
        
    }
}

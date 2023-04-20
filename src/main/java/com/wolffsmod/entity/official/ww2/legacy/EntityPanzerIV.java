package com.wolffsmod.entity.official.ww2.legacy;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityPanzerIV extends EntityFlanVehicleNPC
{
    public EntityPanzerIV(World w)
    {
        super(w);
        this.setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 9 0 -360 360 -2.5 3");
        setPassenger("1 0 28 0 turret -360 360 -15 60 mg42 MG42");
        addBarrelPosition("0 34 0");
        addGun("8 34 8 turret mg42");
        
    }
}

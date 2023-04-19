package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityChiNu extends EntityFlanVehicleNPC
{
    public EntityChiNu(World w)
    {
        super(w);
        this.setSize(3.0F, 2.9F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("0 32 0 -360 360 -7 20");
        addBarrelPosition("0 30 0");
        addGun("8 34 8 turret type99");
        
    }
}

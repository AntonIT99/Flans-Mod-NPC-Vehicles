package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_StudebackerUS6 extends EntityFlanVehicleNPC
{
    public Entity44_StudebackerUS6(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("16 14 -8");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 16 14 8 core");
        setPassenger("2 -23 18 -17 core");
        setPassenger("3 -11 18 17 core");
        setPassenger("4 -37 18 17 core");
        setPassenger("5 -58 18 -17 core");
        setPassenger("6 -63 18 17 core");
        
    }
}

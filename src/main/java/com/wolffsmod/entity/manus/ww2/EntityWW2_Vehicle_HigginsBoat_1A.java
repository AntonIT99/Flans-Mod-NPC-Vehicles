package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_HigginsBoat_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_HigginsBoat_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("-63 14 -19");
        setPassenger("1 -111 18 -22 core -50 50 0 45 WW2_MG_BrowningM1919_1A Gun0");
        setPassenger("2 -111 18 22 core -50 50 0 45 WW2_MG_BrowningM1919_1A Gun1");
        setPassenger("3 -28 0 16 core");
        setPassenger("4 -12 0 16 core");
        setPassenger("5 4 0 16 core");
        setPassenger("6 20 0 16 core");
        setPassenger("7 36 0 16 core");
        setPassenger("8 52 0 16 core");
        setPassenger("9 68 0 16 core");
        setPassenger("10 84 0 16 core");
        setPassenger("11 100 0 16 core");
        setPassenger("12 -28 0 -16 core");
        setPassenger("13 -12 0 -16 core");
        setPassenger("14 4 0 -16 core");
        setPassenger("15 20 0 -16 core");
        setPassenger("16 36 0 -16 core");
        setPassenger("17 52 0 -16 core");
        setPassenger("18 68 0 -16 core");
        setPassenger("19 84 0 -16 core");
        setPassenger("20 100 0 -16 core");
        addGunOrigin("1 -87 32 -23");
        addGunOrigin("2 -87 32 23");
        
    }
}

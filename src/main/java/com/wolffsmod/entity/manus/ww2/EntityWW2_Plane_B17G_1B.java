package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_B17G_1B extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_B17G_1B(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("70 55 -7");
        setPassenger("1 70 55 7 core");
        setPassenger("2 127 38 0 nose -45 45 -45 25 WW2_MG_BrowningM2_1A PassengerGun2");
        setPassenger("3 45 68 0 core -360 360 0 70 WW2_MG_BrowningM2_1A PassengerGun3");
        setPassenger("4 -78 15 0 core -360 360 -70 0 WW2_MG_BrowningM2_1A PassengerGun4");
        setPassenger("5 -132 41 -5 tail 235 305 -35 35 WW2_MG_BrowningM2_1A PassengerGun5");
        setPassenger("6 -132 41 5 tail 55 125 -35 35 WW2_MG_BrowningM2_1A PassengerGun6");
        setPassenger("7 -275 52 0 tail 135 225 -45 45 WW2_MG_BrowningM2_1A PassengerGun7");
        addShootPointSecondary("0 -10 0");
        addGunOrigin("2 -125 28 0");
        addGunOrigin("3 -45 84 0");
        addGunOrigin("4 78 25 0");
        addGunOrigin("5 132 53 -19");
        addGunOrigin("6 132 53 19");
        addGunOrigin("7 294 57 0");
        
    }
}

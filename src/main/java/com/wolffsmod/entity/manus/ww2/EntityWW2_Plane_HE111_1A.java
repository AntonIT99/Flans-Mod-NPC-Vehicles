package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_HE111_1A extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_HE111_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("24 23 -4");
        setPassenger("1 48 23 3 nose -50 50 -30 30 WW2_MG_MG81ZB_1A MG81Front");
        setPassenger("2 -32 33 0 core 150 210 5 50 WW2_MG_MG81ZB_1A MG81Top");
        setPassenger("3 -59 12 0 core 150 210 -40 -10 WW2_MG_MG81ZB_1A MG81Bottom");
        addShootPointSecondary("0 -10 0");
        addGunOrigin("1 68 35 3");
        addGunOrigin("2 -46 52 0");
        addGunOrigin("3 -84 11 0");
        
    }
}

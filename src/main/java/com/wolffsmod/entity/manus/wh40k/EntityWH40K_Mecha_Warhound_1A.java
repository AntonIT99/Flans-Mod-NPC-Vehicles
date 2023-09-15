package com.wolffsmod.entity.manus.wh40k;

import com.wolffsmod.entity.EntityFlanMechaNPC;

import net.minecraft.world.World;

public class EntityWH40K_Mecha_Warhound_1A extends EntityFlanMechaNPC
{
    public EntityWH40K_Mecha_Warhound_1A(World w)
    {
        super(w);
        setSize(3.5F, 6F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 216 0");
        setYOffset(0F);
        setLeftArmOrigin("25.5 222 -77");
        setRightArmOrigin("25.5 222 77");
        setArmLength(0.1F);
        setLegLength(161F);
        setUpperArmLimit(20F);
        setLowerArmLimit(60F);
        setLegSwingLimit(5F);
    }
}

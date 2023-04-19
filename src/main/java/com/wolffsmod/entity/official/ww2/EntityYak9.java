package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityYak9 extends EntityFlanPlaneNPC
{
    public EntityYak9(World w)
    {
        super(w);
        this.setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.5F);
        setDriver("12 4 0");
        addShootPointPrimary("60 3 5 nose dp28");
        addShootPointPrimary("60 3 -5 nose dp28");
        ShootPointSecondary("-30 -12 0");
        
    }
}

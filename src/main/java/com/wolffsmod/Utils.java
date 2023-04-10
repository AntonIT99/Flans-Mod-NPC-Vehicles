package com.wolffsmod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.Vec3;

public class Utils
{
    private Utils() {}
    public static float getYawVelocity(EntityLivingBase entity)
    {
        return entity.renderYawOffset - entity.prevRenderYawOffset;
    }

    public static double getMovementVelocity(Entity entity)
    {
        return Vec3.createVectorHelper((entity.posX - entity.prevPosX), (entity.posY - entity.prevPosY), (entity.posZ - entity.prevPosZ)).lengthVector();
    }
}

package com.wolffsmod.entity.helper;

import com.wolffsmod.entity.EntityFlanDriveableNPC;
import com.wolffsmod.mixin.IMixinEntityNPCInterface;
import noppes.npcs.entity.EntityCustomNpc;

import net.minecraft.entity.EntityBodyHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

public class EntityNPCBodyHelper extends EntityBodyHelper
{
    protected EntityLivingBase theLiving;
    protected float prevRenderYawHead;
    protected int rotationTickCounter;
    protected float targetYaw;
    protected float yawSpeed = 1F;
    
    public EntityNPCBodyHelper(EntityLivingBase entity)
    {
        super(entity);
        theLiving = entity;
        if (theLiving instanceof EntityCustomNpc && ((IMixinEntityNPCInterface)theLiving).getFlanDriveableEntity().isPresent())
            yawSpeed *= ((IMixinEntityNPCInterface)theLiving).getFlanDriveableEntity().get().turnSpeed;
    }

    @Override
    public void func_75664_a()
    {
        if ((theLiving instanceof EntityCustomNpc && ((IMixinEntityNPCInterface)theLiving).isFlanDriveable()) || theLiving instanceof EntityFlanDriveableNPC)
        {
            if (isMovingXZ())
            {
                theLiving.renderYawOffset = theLiving.rotationYaw;
                theLiving.rotationYawHead = computeAngleWithBound(theLiving.renderYawOffset, theLiving.rotationYawHead, 75.0F);
                prevRenderYawHead = theLiving.rotationYawHead;
                rotationTickCounter = 0;
            }
            else
            {
                float f = 75.0F;

                if (Math.abs(theLiving.rotationYawHead - prevRenderYawHead) > 15.0F)
                {
                    rotationTickCounter = 0;
                    prevRenderYawHead = theLiving.rotationYawHead;
                }
                else
                {
                    rotationTickCounter++;

                    if (rotationTickCounter > 10)
                    {
                        f = Math.max(1.0F - (float)(rotationTickCounter - 10) / 10.0F, 0.0F) * 75.0F;
                    }
                }

                targetYaw = computeAngleWithBound(theLiving.rotationYawHead, theLiving.renderYawOffset, f);

                if (theLiving.renderYawOffset < targetYaw)
                    theLiving.renderYawOffset += Math.min(yawSpeed, targetYaw - theLiving.renderYawOffset);
                if (theLiving.renderYawOffset > targetYaw)
                    theLiving.renderYawOffset -= Math.min(yawSpeed, theLiving.renderYawOffset - targetYaw);
            }
        }
        else
        {
            super.func_75664_a();
        }
    }

    protected boolean isMovingXZ()
    {
        double d0 = theLiving.posX - theLiving.prevPosX;
        double d1 = theLiving.posZ - theLiving.prevPosZ;
        return (d0 * d0 + d1 * d1 > 2.500000277905201E-7D);
    }
    
    protected float computeAngleWithBound(float angle1, float angle2, float factor)
    {
        float delta = MathHelper.wrapAngleTo180_float(angle1 - angle2);

        if (delta < -factor)
        {
            delta = -factor;
        }

        if (delta >= factor)
        {
            delta = factor;
        }

        return angle1 - delta;
    }
}

package com.wolffsmod.entity;

import noppes.npcs.entity.EntityCustomNpc;

import net.minecraft.entity.EntityBodyHelper;
import net.minecraft.entity.EntityLivingBase;

public class EntityNPCBodyHelper extends EntityBodyHelper
{
    protected EntityLivingBase theLiving;
    protected float targetYaw;
    protected float yawSpeed = 1F;
    public EntityNPCBodyHelper(EntityLivingBase entity)
    {
        super(entity);
        theLiving = entity;
        if (theLiving instanceof EntityCustomNpc && ((EntityCustomNpc)theLiving).getFlanDriveableEntity().isPresent())
            yawSpeed *= ((EntityCustomNpc)theLiving).getFlanDriveableEntity().get().turnSpeed;
    }

    @Override
    public void func_75664_a()
    {
        /*if ((theLiving instanceof EntityCustomNpc && ((EntityCustomNpc)theLiving).isFlanDriveable()) || theLiving instanceof EntityFlanDriveableNPC)
        {
            float currentYaw = theLiving.renderYawOffset;
            super.func_75664_a();
            targetYaw = theLiving.prevRenderYawOffset + (theLiving.renderYawOffset - theLiving.prevRenderYawOffset) * 0.5F;
            theLiving.renderYawOffset = currentYaw;

            if (theLiving.renderYawOffset < targetYaw)
                theLiving.renderYawOffset += Math.min(yawSpeed, targetYaw - theLiving.renderYawOffset);
            if (theLiving.renderYawOffset > targetYaw)
                theLiving.renderYawOffset -= Math.min(yawSpeed, theLiving.renderYawOffset - targetYaw);
        }
        else*/
        {
            super.func_75664_a();
            theLiving.rotationYaw = 0;
            theLiving.renderYawOffset = theLiving.rotationYaw;
        }

    }
}

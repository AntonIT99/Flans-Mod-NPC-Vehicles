package com.wolffsmod.entity;

import com.flansmod.common.vector.Vector3f;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

public class Seat
{
    public Vector3f gunOrigin = new Vector3f();
    public float yawSpeed = 2F;
    public float pitchSpeed = 2F;
    public float offsetYawAngle;
    public Vector3f position = new Vector3f();

    private float minYaw;
    private float maxYaw;
    private float minPitch;
    private float maxPitch;

    private float pitch;
    private float yaw;

    public Seat() {}

    public void copyYawAndPitch(Seat other)
    {
        yaw = other.yaw;
        pitch = other.pitch;
    }

    public void copyProperties(Seat other)
    {
        position.set(other.position);
        minYaw = other.minYaw;
        maxYaw = other.maxYaw;
        minPitch = other.minPitch;
        maxPitch = other.maxPitch;
        yawSpeed = other.yawSpeed;
        pitchSpeed = other.pitchSpeed;
        offsetYawAngle = other.offsetYawAngle;
        gunOrigin.set(other.gunOrigin);
    }

    public void copy(Seat other)
    {
        yaw = other.yaw;
        pitch = other.pitch;
        position.set(other.position);
        minYaw = other.minYaw;
        maxYaw = other.maxYaw;
        minPitch = other.minPitch;
        maxPitch = other.maxPitch;
        yawSpeed = other.yawSpeed;
        pitchSpeed = other.pitchSpeed;
        offsetYawAngle = other.offsetYawAngle;
        gunOrigin.set(other.gunOrigin);
    }

    public Seat(float x, float y, float z, float minYaw, float maxYaw, float minPitch, float maxPitch)
    {
        position = new Vector3f(x, y, z);
        set(minYaw, maxYaw, minPitch, maxPitch);
    }

    public void set(float minYaw, float maxYaw, float minPitch, float maxPitch)
    {
        this.minYaw = Math.min(minYaw, maxYaw);
        this.maxYaw = Math.max(minYaw, maxYaw);
        this.minPitch = Math.min(minPitch, maxPitch);
        this.maxPitch = Math.max(minPitch, maxPitch);
    }

    public void setOffsetYawAngle(float offsetYawAngle)
    {
        this.offsetYawAngle = MathHelper.wrapAngleTo180_float(offsetYawAngle);
    }

    public void setYawAndPitch(EntityLivingBase entity)
    {
        float seatYaw = MathHelper.wrapAngleTo180_float(entity.prevRotationYawHead + (entity.rotationYawHead - entity.prevRotationYawHead) * 0.5F);
        float seatPitch = MathHelper.wrapAngleTo180_float(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * 0.5F);
        float entityYaw = MathHelper.wrapAngleTo180_float(entity.renderYawOffset);

        float targetYaw = Math.min(Math.max(seatYaw - entityYaw, minYaw), maxYaw);
        float targetPitch = Math.min(Math.max(seatPitch, -maxPitch), -minPitch);

        float newYaw = yaw;
        float newPitch = pitch;

        if (yaw > 0 && targetYaw < 0 && (targetYaw + 360F - yaw) < (yaw - targetYaw))
            targetYaw += 360F;
        if (yaw < 0 && targetYaw > 0 && (yaw + 360F - targetYaw) < (targetYaw - yaw))
            targetYaw -= 360F;
        if (pitch > 0 && targetPitch < 0 && (targetPitch + 360F - pitch) < (pitch - targetPitch))
            targetPitch += 360F;
        if (pitch < 0 && targetPitch > 0 && (pitch + 360F - targetPitch) < (targetPitch - pitch))
            targetPitch -= 360F;

        if (newYaw < targetYaw)
            newYaw += Math.min(yawSpeed, targetYaw - newYaw);
        if (newYaw > targetYaw)
            newYaw -= Math.min(yawSpeed, newYaw - targetYaw);
        if (newPitch < targetPitch)
            newPitch += Math.min(pitchSpeed, targetPitch - newPitch);
        if (newPitch > targetPitch)
            newPitch -= Math.min(pitchSpeed, newPitch - targetPitch);

        yaw = Math.min(Math.max(newYaw, minYaw), maxYaw);
        pitch = Math.min(Math.max(newPitch, -maxPitch), -minPitch);
    }

    public void setPitch(float pitch)
    {
        this.pitch = pitch;
    }

    public void setLocalYaw(float yaw)
    {
        this.yaw = yaw;
    }

    public float getPitch()
    {
        return pitch;
    }

    /** Absolute yaw not depending on the entity rotation **/
    public float getGlobalYaw(float renderYawOffset)
    {
        return yaw + renderYawOffset;
    }


    /** Yaw relative to the entity rotation **/
    public float getLocalYaw()
    {
        return yaw;
    }
}

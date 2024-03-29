package com.wolffsmod.entity;

import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

public class Seat
{
    public Vector3f gunOrigin = new Vector3f();
    public float yawSpeed = 2F;
    public float pitchSpeed = 2F;
    public Vector3f position = new Vector3f();
    public Vector3f rotatedOffset = new Vector3f();
    public String gun = "";
    public EnumDriveablePart part = EnumDriveablePart.core;

    private float minYaw;
    private float maxYaw;
    private float minPitch;
    private float maxPitch;

    private float offsetYawAngle;
    private float pitch;
    private float yaw;

    private float targetYaw;
    private float targetPitch;

    public Seat()
    {
        minYaw = -360F;
        maxYaw = 360F;
        minPitch = -90F;
        maxPitch = 90F;
    }

    public void copyYawAndPitch(Seat other)
    {
        yaw = other.yaw;
        pitch = other.pitch;
    }

    public void copyProperties(Seat other)
    {
        position.set(other.position);
        rotatedOffset.set(other.rotatedOffset);
        minYaw = other.minYaw;
        maxYaw = other.maxYaw;
        minPitch = other.minPitch;
        maxPitch = other.maxPitch;
        yawSpeed = other.yawSpeed;
        pitchSpeed = other.pitchSpeed;
        offsetYawAngle = other.offsetYawAngle;
        gunOrigin.set(other.gunOrigin);
        gun = other.gun;
        part = other.part;
    }

    public void copy(Seat other)
    {
        yaw = other.yaw;
        pitch = other.pitch;
        position.set(other.position);
        rotatedOffset.set(other.rotatedOffset);
        minYaw = other.minYaw;
        maxYaw = other.maxYaw;
        minPitch = other.minPitch;
        maxPitch = other.maxPitch;
        yawSpeed = other.yawSpeed;
        pitchSpeed = other.pitchSpeed;
        offsetYawAngle = other.offsetYawAngle;
        gunOrigin.set(other.gunOrigin);
        gun = other.gun;
        part = other.part;
    }

    public Seat(float x, float y, float z, float minYaw, float maxYaw, float minPitch, float maxPitch, boolean hasOffset)
    {
        position = new Vector3f(x, y, z);
        set(minYaw, maxYaw, minPitch, maxPitch);
        if (hasOffset)
            offsetYawAngle = (this.minYaw + this.maxYaw) / 2F;
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
        this.offsetYawAngle = offsetYawAngle;
    }

    public void setYawAndPitch(EntityLivingBase entity)
    {
        float seatYaw = MathHelper.wrapAngleTo180_float(entity.rotationYawHead);
        float seatPitch = MathHelper.wrapAngleTo180_float(entity.rotationPitch);
        float entityYaw = MathHelper.wrapAngleTo180_float(entity.renderYawOffset);

        targetYaw = Math.min(Math.max((seatYaw - entityYaw + offsetYawAngle) % 360F, minYaw), maxYaw);
        targetPitch = Math.min(Math.max(seatPitch, -maxPitch), -minPitch);

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

    public boolean isRotating()
    {
        return (Math.abs(targetYaw - yaw) >= 1F) || (Math.abs(targetPitch - pitch) >= 1F);
    }
}

package com.wolffsmod.entity;

import com.flansmod.common.vector.Vector3f;

import net.minecraft.util.MathHelper;

public class Seat
{
    public Vector3f gunOrigin = new Vector3f();
    public float yawSpeed = 1F;
    public float pitchSpeed = 1F;
    public float baseYawAngle;
    public Vector3f position = new Vector3f();

    private float minYaw;
    private float maxYaw;
    private float minPitch;
    private float maxPitch;

    private float globalYaw;
    private float pitch;
    private float localYaw;

    public Seat() {}

    public void copyYawAndPitch(Seat other)
    {
        localYaw = other.localYaw;
        globalYaw = other.globalYaw;
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
        baseYawAngle = other.baseYawAngle;
        gunOrigin.set(other.gunOrigin);
    }

    public Seat(float x, float y, float z, float minYaw, float maxYaw, float minPitch, float maxPitch)
    {
        position = new Vector3f(x, y, z);
        set(minYaw, maxYaw, minPitch, maxPitch);
    }

    public void set(float minYaw, float maxYaw, float minPitch, float maxPitch)
    {
        minYaw = (Math.abs(minYaw) < 360F) ? MathHelper.wrapAngleTo180_float(minYaw) : minYaw;
        maxYaw = (Math.abs(maxYaw) < 360F) ? MathHelper.wrapAngleTo180_float(maxYaw) : maxYaw;
        minPitch = (Math.abs(minPitch) < 360F) ? MathHelper.wrapAngleTo180_float(minPitch) : minPitch;
        maxPitch = (Math.abs(maxPitch) < 360F) ? MathHelper.wrapAngleTo180_float(maxPitch) : maxPitch;
        this.minYaw = Math.min(minYaw, maxYaw);
        this.maxYaw = Math.max(minYaw, maxYaw);
        this.minPitch = Math.min(minPitch, maxPitch);
        this.maxPitch = Math.max(minPitch, maxPitch);
    }

    public void setBaseYawAngle(float baseYawAngle)
    {
        this.baseYawAngle = MathHelper.wrapAngleTo180_float(baseYawAngle);
    }

    public void setYawAndPitch(float seatYaw, float seatPitch, float entityYaw)
    {
        seatYaw = MathHelper.wrapAngleTo180_float(seatYaw);
        seatPitch = MathHelper.wrapAngleTo180_float(seatPitch);
        entityYaw = MathHelper.wrapAngleTo180_float(entityYaw);

        float targetYaw = Math.min(Math.max(seatYaw - entityYaw, minYaw), maxYaw);
        float targetPitch = Math.min(Math.max(seatPitch, -maxPitch), -minPitch);

        if (localYaw > 0 && targetYaw < 0 && (targetYaw + 360F - localYaw) < (localYaw - targetYaw))
            targetYaw += 360F;
        if (localYaw < 0 && targetYaw > 0 && (localYaw + 360F - targetYaw) < (targetYaw - localYaw))
            targetYaw -= 360F;
        if (pitch > 0 && targetPitch < 0 && (targetPitch + 360F - pitch) < (pitch - targetPitch))
            targetPitch += 360F;
        if (pitch < 0 && targetPitch > 0 && (pitch + 360F - targetPitch) < (targetPitch - pitch))
            targetPitch -= 360F;

        if (localYaw < targetYaw)
            localYaw += Math.min(yawSpeed, targetYaw - localYaw);
        if (localYaw > targetYaw)
            localYaw -= Math.min(yawSpeed, localYaw - targetYaw);
        if (pitch < targetPitch)
            pitch += Math.min(pitchSpeed, targetPitch - pitch);
        if (pitch > targetPitch)
            pitch -= Math.min(pitchSpeed, pitch - targetPitch);

        globalYaw = localYaw + entityYaw;
    }

    public float getGlobalYaw()
    {
        return globalYaw;
    }

    public float getPitch()
    {
        return pitch;
    }

    public float getLocalYaw()
    {
        return localYaw;
    }
}

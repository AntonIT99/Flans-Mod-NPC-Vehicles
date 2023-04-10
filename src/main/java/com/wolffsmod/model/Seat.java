package com.wolffsmod.model;

import net.minecraft.util.MathHelper;

public class Seat
{
    public float minYaw;
    public float maxYaw;
    public float minPitch;
    public float maxPitch;
    public float yawSpeed = 1F;
    public float pitchSpeed = 1F;

    public float yaw;
    public float pitch;
    public float baseYawAngle;

    public Seat() {}

    public Seat(float minYaw, float maxYaw, float minPitch, float maxPitch, boolean driver)
    {
        set(minYaw, maxYaw, minPitch, maxPitch, driver);
    }

    public void set(float minYaw, float maxYaw, float minPitch, float maxPitch, boolean driver)
    {
        if (driver)
        {
            this.minYaw = minYaw;
            this.maxYaw = maxYaw;
            this.minPitch = minPitch;
            this.maxPitch = maxPitch;
        }
        else
        {
            this.minYaw = Math.min(MathHelper.wrapAngleTo180_float(minYaw), MathHelper.wrapAngleTo180_float(maxYaw));
            this.maxYaw = Math.max(MathHelper.wrapAngleTo180_float(minYaw), MathHelper.wrapAngleTo180_float(maxYaw));
            this.minPitch = Math.min(MathHelper.wrapAngleTo180_float(minPitch), MathHelper.wrapAngleTo180_float(maxPitch));
            this.maxPitch = Math.max(MathHelper.wrapAngleTo180_float(minPitch), MathHelper.wrapAngleTo180_float(maxPitch));
        }

    }

    public void setBaseYawAngle(float baseYawAngle)
    {
        this.baseYawAngle = MathHelper.wrapAngleTo180_float(baseYawAngle);
    }
}

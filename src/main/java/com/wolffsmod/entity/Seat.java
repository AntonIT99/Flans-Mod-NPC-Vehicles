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

    private int ballisticTargetId = Integer.MIN_VALUE;
    private int ballisticSolveTick = Integer.MIN_VALUE;
    private com.wolffsmod.customnpc.FlanBallisticAim.Solution ballisticSolution;
    private final com.wolffsmod.customnpc.FlanBallisticAim.MotionTracker ballisticMotion =
            new com.wolffsmod.customnpc.FlanBallisticAim.MotionTracker();

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
        setYawAndPitch(entity, false);
    }

    public void setYawAndPitch(EntityLivingBase entity, boolean primaryWeaponSeat)
    {
        float seatYaw = MathHelper.wrapAngleTo180_float(entity.rotationYawHead);
        float seatPitch = MathHelper.wrapAngleTo180_float(entity.rotationPitch);
        float entityYaw = MathHelper.wrapAngleTo180_float(entity.renderYawOffset);

        // Track the selected enemy throughout reload/cooldown, independent of look AI.
        if (entity instanceof EntityFlanDriveableNPC)
        {
            EntityFlanDriveableNPC vehicle = (EntityFlanDriveableNPC)entity;
            if (vehicle.npc != null && !vehicle.worldObj.isRemote
                    && !((com.wolffsmod.customnpc.IMixinEntityNPCInterface)vehicle.npc).getNpcAbilities().isRotationLocked())
            {
                EntityLivingBase target = vehicle.npc.getAttackTarget();
                if (target != null && target.isEntityAlive())
                {
                    com.wolffsmod.customnpc.FlanBallisticAim.Solution solution = null;
                    if (primaryWeaponSeat)
                    {
                        int tick = vehicle.npc.ticksExisted;
                        com.wolffsmod.customnpc.FlanBallisticAim.MotionEstimate motion = ballisticMotion.observe(target, tick);
                        if (target.getEntityId() != ballisticTargetId || tick - ballisticSolveTick >= 3
                                || tick < ballisticSolveTick)
                        {
                            ballisticTargetId = target.getEntityId();
                            ballisticSolveTick = tick;
                            ballisticSolution = com.wolffsmod.customnpc.FlanBallisticAim.solve(vehicle, target, motion);
                        }
                        solution = ballisticSolution;
                    }
                    if (solution != null)
                    {
                        seatYaw = solution.yaw;
                        seatPitch = solution.pitch;
                    }
                    else
                    {
                        net.minecraft.util.Vec3 origin = vehicle.getPrimaryAimOrigin();
                        double dx = target.posX - origin.xCoord;
                        double dz = target.posZ - origin.zCoord;
                        double dy = target.posY + target.getEyeHeight() * 0.65D - origin.yCoord;
                        seatYaw = (float)(Math.atan2(dz, dx) * 180.0D / Math.PI) - 90F;
                        seatPitch = (float)(-Math.atan2(dy, Math.sqrt(dx * dx + dz * dz)) * 180.0D / Math.PI);
                    }
                }
            }
        }

        targetYaw = Math.min(Math.max(MathHelper.wrapAngleTo180_float(seatYaw - entityYaw + offsetYawAngle), minYaw), maxYaw);
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

        yaw = maxYaw - minYaw >= 360F ? MathHelper.wrapAngleTo180_float(newYaw)
                : Math.min(Math.max(newYaw, minYaw), maxYaw);
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
        return (Math.abs(MathHelper.wrapAngleTo180_float(targetYaw - yaw)) >= 1F)
                || (Math.abs(targetPitch - pitch) >= 1F);
    }
}

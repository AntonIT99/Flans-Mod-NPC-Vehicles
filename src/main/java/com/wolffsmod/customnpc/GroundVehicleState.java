package com.wolffsmod.customnpc;

import net.minecraft.util.Vec3;

/** Runtime-only state. Configuration remains in DataAI/NBT. */
public final class GroundVehicleState {
    public double currentSpeed;
    public double desiredSpeed;
    public float currentHeading;
    public float desiredHeading;
    public float steeringAngle;
    public float currentTurnRate;
    public boolean reversing;
    public boolean braking;
    public boolean obstacleDetected;
    public int pathNode = -1;
    public int stuckTicks;
    public int recoveryTicks;
    public int collisionTicks;
    public int lastProgressTick;
    public double lastProgressX;
    public double lastProgressZ;
    public Vec3 steeringTarget;
    public int steeringTargetTick;
    public int steeringTargetNode = -1;
    public boolean initialized;
}

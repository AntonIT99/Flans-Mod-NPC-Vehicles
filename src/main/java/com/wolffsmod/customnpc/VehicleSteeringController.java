package com.wolffsmod.customnpc;

import net.minecraft.util.MathHelper;

public final class VehicleSteeringController {
    private VehicleSteeringController() {}

    public static void steer(GroundVehicleState state, IMixinDataAI data, float targetHeading, double speedPerTick, boolean pivot) {
        state.desiredHeading = targetHeading;
        float error = MathHelper.wrapAngleTo180_float(targetHeading - state.currentHeading);
        float maxSteer = (float)data.getGroundMaximumSteeringAngle();
        state.steeringAngle = clamp(error, -maxSteer, maxSteer);

        double speedRatio = Math.min(1.0D, Math.abs(speedPerTick) * 20.0D / Math.max(0.1D, data.getGroundMaxForwardSpeed()));
        double effectiveRadius = data.getGroundMinimumTurnRadius() * (1.0D + speedRatio * speedRatio * 2.0D);
        double radiusRate = Math.toDegrees(Math.max(0.02D, Math.abs(speedPerTick)) / effectiveRadius);
        double allowed = pivot ? data.getGroundMaxTurnRate() / 20.0D
                : Math.min(data.getGroundMaxTurnRate() / 20.0D, Math.max(0.15D, radiusRate));
        double requested = Math.signum(state.steeringAngle) * allowed;
        double response = data.getGroundSteeringRate() / 400.0D;
        double change = Math.max(-response, Math.min(response, requested - state.currentTurnRate));
        state.currentTurnRate += (float)change;
        if (Math.abs(error) < Math.abs(state.currentTurnRate)) state.currentTurnRate = error;
        state.currentHeading = MathHelper.wrapAngleTo180_float(state.currentHeading + state.currentTurnRate);
    }

    private static float clamp(float value, float min, float max) {
        return Math.max(min, Math.min(max, value));
    }
}

package com.wolffsmod.customnpc;

public enum GroundVehiclePreset {
    CUSTOM("Custom"), CAR("Car"), TRUCK("Truck"), BUS("Bus"), LIGHT_TANK("Light Tank"), HEAVY_TANK("Heavy Tank"), APC("APC");

    private final String displayName;
    GroundVehiclePreset(String displayName) { this.displayName = displayName; }
    public String getDisplayName() { return displayName; }
    public static GroundVehiclePreset fromOrdinal(int value) {
        GroundVehiclePreset[] values = values();
        return value < 0 || value >= values.length ? CUSTOM : values[value];
    }

    public void apply(IMixinDataAI d) {
        if (this == CUSTOM) return;
        d.setGroundDrivingEnabled(true);
        boolean tank = this == LIGHT_TANK || this == HEAVY_TANK || this == APC;
        d.setGroundVehicleType(this == HEAVY_TANK ? GroundVehicleType.HEAVY_TRACKED : tank ? GroundVehicleType.TRACKED : GroundVehicleType.WHEELED);
        d.setGroundAllowPivot(tank);
        d.setGroundAllowReversing(true);
        switch (this) {
            case CAR: set(d, 9, 4.5, 8, 1.5, 7, 38, 4, 6, 0.60, 2.0, 12, 5, 2.5); break;
            case TRUCK: set(d, 6, 3, 4, 1.2, 5, 25, 7, 7, 0.72, 2.5, 15, 6, 3.5); break;
            case BUS: set(d, 5, 2.5, 3, 1.0, 4, 18, 10, 8, 0.78, 3, 18, 7, 4); break;
            case LIGHT_TANK: set(d, 6, 4, 3.5, 1.0, 6, 50, 2.5, 5, 0.55, 2, 10, 4, 3); break;
            case HEAVY_TANK: set(d, 4, 3, 2.2, 0.8, 4, 35, 4, 5, 0.68, 2.5, 12, 5, 4); break;
            case APC: set(d, 7, 4, 4, 1.2, 6, 38, 4, 6, 0.60, 2, 12, 5, 3); break;
            default: break;
        }
    }

    private static void set(IMixinDataAI d, double forward, double reverse, double acceleration, double coast,
                            double braking, double turnRate, double radius, double lookahead, double slowdown,
                            double stop, double reverseDistance, double follow, double minimumFollow) {
        d.setGroundMaxForwardSpeed(forward); d.setGroundMaxReverseSpeed(reverse);
        d.setGroundAcceleration(acceleration); d.setGroundCoastDeceleration(coast); d.setGroundBraking(braking);
        d.setGroundMaxTurnRate(turnRate); d.setGroundMinimumTurnRadius(radius);
        d.setGroundSteeringLookahead(lookahead); d.setGroundTurnSlowdown(slowdown);
        d.setGroundStopDistance(stop); d.setGroundMaxReverseDistance(reverseDistance);
        d.setGroundFollowingDistance(follow); d.setGroundMinimumFollowingDistance(minimumFollow);
    }
}

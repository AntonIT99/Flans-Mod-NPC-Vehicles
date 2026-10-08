package com.wolffsmod.customnpc;

public enum AircraftFlightType {
    NORMAL("Normal Fly"),
    PLANE("Plane"),
    HELICOPTER("Helicopter");

    private final String displayName;

    AircraftFlightType(String displayName) { this.displayName = displayName; }
    public String getDisplayName() { return displayName; }
    public static AircraftFlightType fromOrdinal(int value) {
        return value < 0 || value >= values().length ? NORMAL : values()[value];
    }
}

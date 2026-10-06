package com.wolffsmod.customnpc;

public enum GroundVehicleType {
    WHEELED("Wheeled"),
    TRACKED("Tracked"),
    HEAVY_TRACKED("Heavy Tracked");

    private final String displayName;
    GroundVehicleType(String displayName) { this.displayName = displayName; }
    public String getDisplayName() { return displayName; }
    public static GroundVehicleType fromOrdinal(int value) {
        GroundVehicleType[] values = values();
        return value < 0 || value >= values.length ? WHEELED : values[value];
    }
}

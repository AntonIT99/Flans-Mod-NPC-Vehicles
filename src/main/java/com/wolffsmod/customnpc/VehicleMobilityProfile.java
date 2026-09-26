package com.wolffsmod.customnpc;

public enum VehicleMobilityProfile {
    LEGACY("Legacy / Disabled"),
    GROUND("Ground"),
    WATERCRAFT("Watercraft"),
    AMPHIBIOUS("Amphibious");

    private final String displayName;

    VehicleMobilityProfile(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static VehicleMobilityProfile fromOrdinal(int value) {
        VehicleMobilityProfile[] values = values();
        return value < 0 || value >= values.length ? LEGACY : values[value];
    }
}

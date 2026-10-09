package com.wolffsmod.customnpc;

public enum WatercraftType {
    SURFACE("Surface Ship"),
    SUBMARINE("Submarine");

    private final String displayName;
    WatercraftType(String displayName) { this.displayName = displayName; }
    public String getDisplayName() { return displayName; }
    public static WatercraftType fromOrdinal(int value) {
        return value < 0 || value >= values().length ? SURFACE : values()[value];
    }
}

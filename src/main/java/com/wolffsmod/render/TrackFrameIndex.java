package com.wolffsmod.render;
public final class TrackFrameIndex {
    private TrackFrameIndex() {}
    public static int select(float wheelAngle, int count) {
        if (!Float.isFinite(wheelAngle) || count <= 0) return 0;
        return (int)(((Math.floor((double)wheelAngle * 3) % count) + count) % count);
    }
}

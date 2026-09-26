package com.wolffsmod.benchmark;

/** Fixed primitive hash set with generation tags, reused without allocations. */
public final class FrameVehicleSet {
    private final int[] keys = new int[65536];
    private final int[] generations = new int[65536];
    private int generation = 1;
    private int size;

    public void clear() {
        size = 0;
        if (++generation == 0) {
            java.util.Arrays.fill(generations, 0);
            generation = 1;
        }
    }

    public boolean add(int id) {
        int slot = (id * 0x9E3779B9) >>> 16;
        for (int i = 0; i < keys.length; i++) {
            if (generations[slot] != generation) {
                if (size >= 32768) throw new IllegalStateException("More than 32768 vehicles in one frame");
                generations[slot] = generation;
                keys[slot] = id;
                size++;
                return true;
            }
            if (keys[slot] == id) return false;
            slot = (slot + 1) & 65535;
        }
        throw new IllegalStateException("Vehicle count table full");
    }
}

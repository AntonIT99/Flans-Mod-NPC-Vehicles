package com.wolffsmod.benchmark;

/** Primitive storage allocated before warmup; no per-frame sample objects. */
public final class BenchmarkSamples {
    public final long[] frameNs, vehicleNs;
    public final int[] vehicles, passes, elements, dispatches, compilations;
    public int size;
    public final long[] humanoidNs;
    public final int[] humanoids;

    public BenchmarkSamples(int capacity) {
        frameNs = new long[capacity];
        humanoidNs = new long[capacity];
        humanoids = new int[capacity];
        vehicleNs = new long[capacity];
        vehicles = new int[capacity];
        passes = new int[capacity];
        elements = new int[capacity];
        dispatches = new int[capacity];
        compilations = new int[capacity];
    }

    public boolean add(long frame, long vehicle, int count, int pass, int element, int dispatch, int compilation) {
        if (size == frameNs.length) return false;
        frameNs[size] = frame;
        vehicleNs[size] = vehicle;
        vehicles[size] = count;
        passes[size] = pass;
        elements[size] = element;
        dispatches[size] = dispatch;
        compilations[size++] = compilation;
        return true;
    }
}

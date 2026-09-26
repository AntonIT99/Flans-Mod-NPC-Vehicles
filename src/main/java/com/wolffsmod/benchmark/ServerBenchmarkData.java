package com.wolffsmod.benchmark;

import java.io.File;

/** Primitive tick rows, allocated before warmup. No per-tick allocations. */
public final class ServerBenchmarkData {
    public final long[][] rows;
    public final File directory;
    public final String label;
    public final int seconds, warmup;
    public final long createdMillis = System.currentTimeMillis();
    public long measurementMillis, elapsedNs, heapStart, heapEnd;
    public long maxInterTickGapNs, heapMax;
    public int size;
    public boolean groundObserved, flyingObserved;
    public final SlowPathLog slowPaths = new SlowPathLog();
    public String environment = "", outcome = "COMPLETE";

    public ServerBenchmarkData(File directory, String label, int seconds, int warmup) {
        this.directory = directory; this.label = label; this.seconds = seconds; this.warmup = warmup;
        rows = new long[Math.min(30000, seconds * 40 + 100)][12];
    }
}

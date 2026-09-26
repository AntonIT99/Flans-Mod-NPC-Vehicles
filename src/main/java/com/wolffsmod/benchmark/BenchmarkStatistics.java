package com.wolffsmod.benchmark;

import java.util.Arrays;

/** Independent of Minecraft, so calculations can be regression tested. */
public final class BenchmarkStatistics {
    public final int frames;
    public final double seconds, averageFps, medianFps, minimumFps, maximumFps;
    public final double meanMs, medianMs, p95Ms, p99Ms, worstMs, low1, low01;

    public BenchmarkStatistics(BenchmarkSamples samples) {
        frames = samples.size;
        long[] sorted = Arrays.copyOf(samples.frameNs, frames);
        Arrays.sort(sorted);
        double total = 0;
        for (long value : sorted) total += value;
        seconds = total / 1.0e9;
        meanMs = frames == 0 ? Double.NaN : total / frames / 1.0e6;
        medianMs = frames == 0 ? Double.NaN
                : (frames % 2 == 0 ? (sorted[frames / 2 - 1] / 2.0 + sorted[frames / 2] / 2.0)
                : sorted[frames / 2]) / 1.0e6;
        averageFps = seconds > 0 ? frames / seconds : Double.NaN;
        medianFps = 1000.0 / medianMs;
        minimumFps = frames == 0 ? Double.NaN : 1.0e9 / sorted[frames - 1];
        maximumFps = frames == 0 ? Double.NaN : 1.0e9 / sorted[0];
        p95Ms = percentile(sorted, 0.95) / 1.0e6;
        p99Ms = percentile(sorted, 0.99) / 1.0e6;
        worstMs = frames == 0 ? Double.NaN : sorted[frames - 1] / 1.0e6;
        low1 = slowMeanFps(sorted, 0.01);
        low01 = slowMeanFps(sorted, 0.001);
    }

    private static double percentile(long[] sorted, double fraction) {
        return sorted.length == 0 ? Double.NaN : sorted[(int)Math.ceil(sorted.length * fraction) - 1];
    }

    private static double slowMeanFps(long[] sorted, double fraction) {
        if (sorted.length == 0) return Double.NaN;
        int count = Math.max(1, (int)Math.ceil(sorted.length * fraction));
        double sum = 0;
        for (int i = sorted.length - count; i < sorted.length; i++) sum += sorted[i];
        return 1.0e9 * count / sum;
    }
}

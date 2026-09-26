package com.wolffsmod.benchmark;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/** Owned by the client while recording; ownership transfers to the report worker at finish. */
public final class BenchmarkRun {
    public final BenchmarkSamples samples;
    public final Map<String, String> environment = new LinkedHashMap<String, String>();
    public final String label;
    public final int duration, warmup;
    public final File directory;
    public final long createdMillis = System.currentTimeMillis();
    public String outcome = "COMPLETE";
    public String reason = "Requested duration reached";
    public int observedHooks;
    public boolean humanoidHookObserved;
    public String humanoidFailure = "";
    public int chatFrames;
    public String metricFailure = "";
    public String csvWarning = "";
    public long gcStartCount, gcStartMs;
    public long cacheReplayStart, cacheBuildStart, cacheFallbackStart, cacheStateStart;

    public BenchmarkRun(File directory, String label, int duration, int warmup) {
        this.directory = directory;
        this.label = label;
        this.duration = duration;
        this.warmup = warmup;
        samples = new BenchmarkSamples(Math.min(600000, duration * 2000 + 1024));
    }
}

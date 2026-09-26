package com.wolffsmod.benchmark;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/** Pure Java; no client or server objects are retained by the report. */
public final class ServerBenchmarkReport {
    private ServerBenchmarkReport() {}
    private static String num(double n) { return Double.isNaN(n) || Double.isInfinite(n) ? "N/A" : String.format(Locale.ROOT, "%.4f", n); }
    public static File write(ServerBenchmarkData d) throws IOException {
        Files.createDirectories(d.directory.toPath());
        String base = "wolff-server-benchmark-" + new SimpleDateFormat("yyyy-MM-dd-HHmmss-SSS", Locale.ROOT).format(new Date(d.createdMillis))
                + "-" + BenchmarkReport.safeLabel(d.label);
        String name = base;
        int suffix = 0;
        while (new File(d.directory, name + ".txt").exists() || new File(d.directory, name + ".csv").exists()) name = base + "-" + (++suffix);
        File report = new File(d.directory, name + ".txt");
        long[] totals = new long[12], ticks = new long[d.size];
        int over50 = 0;
        long worstPath = 0;
        for (int i = 0; i < d.size; i++) {
            ticks[i] = d.rows[i][1];
            if (ticks[i] > 50000000L) over50++;
            worstPath = Math.max(worstPath, d.rows[i][9]);
            for (int j = 1; j < totals.length; j++) totals[j] += d.rows[i][j];
        }
        Arrays.sort(ticks);
        double mspt = d.size == 0 ? Double.NaN : totals[1] / 1.0e6 / d.size;
        try (BufferedWriter w = Files.newBufferedWriter(report.toPath(), StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW)) {
            w.write("WOLFF / CUSTOMNPC SERVER BENCHMARK\nLabel: " + d.label + "\nResult: " + d.outcome
                    + "\nRequested seconds: " + d.seconds + "\nWarmup seconds: " + d.warmup
                    + "\nMeasurement start epoch ms: " + d.measurementMillis + "\n" + d.environment);
            w.write("\nSERVER TICKS\nCompleted ticks: " + d.size + "\nElapsed measurement seconds (including inter-tick gaps): " + num(d.elapsedNs / 1.0e9)
                    + "\nObserved ticks/second (capped at 20): " + num(d.elapsedNs == 0 ? Double.NaN : Math.min(20, d.size * 1.0e9 / d.elapsedNs))
                    + "\nMean server work ms/tick: " + num(mspt)
                    + "\nP95 work ms/tick: " + num(d.size == 0 ? Double.NaN : ticks[(int)Math.ceil(d.size * .95) - 1] / 1.0e6)
                    + "\nP99 work ms/tick: " + num(d.size == 0 ? Double.NaN : ticks[(int)Math.ceil(d.size * .99) - 1] / 1.0e6)
                    + "\nWorst work ms/tick: " + num(d.size == 0 ? Double.NaN : ticks[d.size - 1] / 1.0e6)
                    + "\nTicks over 50 ms: " + over50
                    + "\nLargest gap between completed tick and next tick ms: " + num(d.maxInterTickGapNs / 1.0e6) + "\n");
            w.write("\nCUSTOMNPC WORK (ALL MODELS)\nNPC update calls: " + totals[2]
                    + "\nInclusive NPC update ms: " + num(totals[3] / 1.0e6)
                    + "\nNPC update ms/tick: " + num(d.size == 0 ? Double.NaN : totals[3] / 1.0e6 / d.size)
                    + "\nNPC share of measured server work percent: " + num(totals[1] == 0 ? Double.NaN : 100.0 * totals[3] / totals[1])
                    + "\nGround path searches: " + totals[4] + "\nGround path search ms: " + num(totals[5] / 1.0e6)
                    + "\nFlying path searches: " + totals[6] + "\nFlying path search ms: " + num(totals[7] / 1.0e6)
                    + "\nMean path search ms: " + num(totals[4] + totals[6] == 0 ? Double.NaN : (totals[5] + totals[7]) / 1.0e6 / (totals[4] + totals[6]))
                    + "\nWorst path search ms: " + num(worstPath / 1.0e6)
                    + "\nPaths returning null: " + totals[8]
                    + "\nProgressive target searches: " + totals[10] + "\nProgressive target search ms: " + num(totals[11] / 1.0e6) + "\n");
            w.write(d.slowPaths.report());
            w.write("\nUsed heap start/end bytes: " + d.heapStart + " / " + d.heapEnd + "\n");
            w.write("Maximum heap bytes: " + d.heapMax + "\n");
            w.write("Ground search hook: " + (d.groundObserved ? "Observed" : "Unexercised or unavailable (zero totals unconfirmed)") + "\n");
            w.write("Flying search hook: " + (d.flyingObserved ? "Observed" : "Unexercised or unavailable (zero totals unconfirmed)") + "\n");
            w.write("\nMETHOD / LIMITS\nServerTick START to END elapsed wall time measures server work, not sleep between ticks; includes GC/OS stalls.\n"
                    + "Elapsed measurement includes gaps between ticks (including pauses); do not pause single-player tests. Server benchmarking continues independently of client focus/disconnect.\n"
                    + "NPC update wraps EntityCustomNpc.onUpdate; includes AI, navigation, scripts and vehicle update. Not exclusive AI time.\n"
                    + "Ground PathFinder and CustomNPC FlyPathFinder private double-coordinate search entries are measured; cache lookups, navigator following and World path setup outside these calls are not.\n"
                    + "Null paths are not a complete failure test: non-null partial paths may not reach the target. Counts measure searches, not distance reached.\n"
                    + "Target searches measure the existing progressive search implementation only; unavailable when it is disabled.\n"
                    + "Zero calls can mean the path was never exercised or an optional hook was not applied; inspect mixin startup logs if unexpected.\n"
                    + "Path/target timings overlap inclusive NPC update time. Do not add them to NPC time. No AI scheduling or navigation behavior was changed.\n"
                    + "All loaded dimensions and all EntityCustomNpc models are included, not just visible NPCs. Vanilla mobs and players excluded from NPC/path counters.\n"
                    + "Off-server-thread pathfinding is excluded. No samples sent across network; client and server runs are separate, not synchronized.\n"
                    + "No forced GC. Overhead uncalibrated: primitive counters and two nanoTime reads per measured update/search; path mixins add callback objects per query.\n"
                    + "Run matching client/server labels and durations with the same world, NPCs, targets, terrain, loaded chunks, ranges, player count and settings.\n"
                    + "A 50 ms/tick budget sustains 20 TPS; compare P99 and worst spikes, not only averages. This report does not prove pathfinding is optimized.\n");
        }
        try (BufferedWriter w = Files.newBufferedWriter(new File(d.directory, name + ".csv").toPath(), StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW)) {
            w.write("elapsed_ns,tick_work_ns,npc_updates,npc_update_ns,ground_searches,ground_ns,flying_searches,flying_ns,null_paths,max_path_ns,target_searches,target_search_ns\n");
            for (int i = 0; i < d.size; i++) {
                for (int j = 0; j < 12; j++) { if (j != 0) w.write(','); w.write(Long.toString(d.rows[i][j])); }
                w.newLine();
            }
        } catch (IOException failure) {
            try (BufferedWriter w = Files.newBufferedWriter(report.toPath(), StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {
                w.write("\nCSV unavailable: " + failure.getMessage() + "\n");
            }
        }
        return report;
    }
}

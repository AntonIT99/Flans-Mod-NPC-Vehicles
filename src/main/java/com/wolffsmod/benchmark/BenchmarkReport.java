package com.wolffsmod.benchmark;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/** No Minecraft, world, or OpenGL access. All disk work runs after recording stops. */
public final class BenchmarkReport {
    private static final String HEADER = "timestamp,label,outcome,renderer,duration_s,resolution,render_distance,avg_fps,low_1_fps,low_0_1_fps,avg_frame_ms,p99_frame_ms,avg_rendered_vehicles,vehicle_ms_per_frame,element_calls_per_frame,gl_list_calls_per_frame,avg_rendered_humanoids,humanoid_ms_per_frame";
    private BenchmarkReport() {}

    public static String safeLabel(String label) {
        String safe = label.replaceAll("[^a-zA-Z0-9._-]", "_");
        return safe.length() > 48 ? safe.substring(0, 48) : safe;
    }

    public static String csv(String value) {
        return "\"" + value.replace("\"", "\"\"").replace("\r", " ").replace("\n", " ") + "\"";
    }

    private static String number(double n) {
        return Double.isNaN(n) || Double.isInfinite(n) ? "N/A" : String.format(Locale.ROOT, "%.4f", n);
    }

    private static double perFrame(double sum, int count) {
        return count == 0 ? Double.NaN : sum / count;
    }

    public static synchronized File write(BenchmarkRun run) throws IOException {
        Files.createDirectories(run.directory.toPath());
        String stamp = new SimpleDateFormat("yyyy-MM-dd-HHmmss-SSS", Locale.ROOT).format(new Date(run.createdMillis));
        String base = "wolff-benchmark-" + stamp + (run.label.isEmpty() ? "" : "-" + safeLabel(run.label));
        File text = new File(run.directory, base + ".txt");
        int suffix = 0;
        while (text.exists() || new File(run.directory, base + ".csv").exists()) {
            base = "wolff-benchmark-" + stamp + "-" + safeLabel(run.label) + "-" + (++suffix);
            text = new File(run.directory, base + ".txt");
        }
        BenchmarkSamples s = run.samples;
        BenchmarkStatistics stats = new BenchmarkStatistics(s);
        long vehicleTime = 0, elements = 0, dispatches = 0, compilations = 0, vehicles = 0, passes = 0, maxVehicleNs = 0;
        int minVehicles = Integer.MAX_VALUE, maxVehicles = 0;
        long humans = 0, humanTime = 0, maxHumanNs = 0;
        int minHumans = Integer.MAX_VALUE, maxHumans = 0;
        for (int i = 0; i < s.size; i++) {
            humans += s.humanoids[i]; humanTime += s.humanoidNs[i];
            minHumans = Math.min(minHumans, s.humanoids[i]); maxHumans = Math.max(maxHumans, s.humanoids[i]);
            maxHumanNs = Math.max(maxHumanNs, s.humanoidNs[i]);
            vehicleTime += s.vehicleNs[i]; vehicles += s.vehicles[i]; passes += s.passes[i];
            elements += s.elements[i]; dispatches += s.dispatches[i]; compilations += s.compilations[i];
            minVehicles = Math.min(minVehicles, s.vehicles[i]); maxVehicles = Math.max(maxVehicles, s.vehicles[i]);
            maxVehicleNs = Math.max(maxVehicleNs, s.vehicleNs[i]);
        }
        double vehiclePerFrame = perFrame(vehicleTime / 1.0e6, s.size);
        String elementMetric = (run.observedHooks & 1) == 0 ? "Unavailable (hook not observed)" : number(perFrame(elements, s.size));
        String dispatchMetric = (run.observedHooks & 2) == 0 ? "Unavailable (hook not observed)" : number(perFrame(dispatches, s.size));
        try (BufferedWriter w = Files.newBufferedWriter(text.toPath(), StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW)) {
            w.write("WOLFF VEHICLE / HUMANOID NPC CLIENT BENCHMARK\n\n");
            w.write("Label: " + run.label + "\nResult: " + run.outcome + "\nReason: " + run.reason + "\n");
            w.write("Requested measurement: " + run.duration + " s\nWarmup: " + run.warmup + " s\n");
            w.write("Measured duration (sum of sampled frame intervals): " + number(stats.seconds) + " s\n");
            for (Map.Entry<String, String> e : run.environment.entrySet()) w.write(e.getKey() + ": " + e.getValue() + "\n");
            w.write("\nFRAME PERFORMANCE\nFrames: " + stats.frames + "\n");
            w.write("Average FPS: " + number(stats.averageFps) + "\nMedian FPS: " + number(stats.medianFps));
            w.write("\nMinimum instantaneous FPS: " + number(stats.minimumFps) + "\nMaximum instantaneous FPS: " + number(stats.maximumFps));
            w.write("\n1% low FPS: " + number(stats.low1) + "\n0.1% low FPS: " + number(stats.low01));
            w.write("\nAverage frame time ms: " + number(stats.meanMs) + "\nMedian frame time ms: " + number(stats.medianMs));
            w.write("\n95th percentile frame ms: " + number(stats.p95Ms) + "\n99th percentile frame ms: " + number(stats.p99Ms));
            w.write("\nWorst frame ms: " + number(stats.worstMs) + "\n");
            w.write("\nWOLFF VEHICLES\nAverage rendered: " + number(perFrame(vehicles, s.size)));
            w.write("\nMinimum rendered: " + (s.size == 0 ? "N/A" : minVehicles) + "\nMaximum rendered: " + (s.size == 0 ? "N/A" : maxVehicles));
            w.write("\nModel render passes: " + passes + "\nTotal vehicle-model CPU render ms: " + number(vehicleTime / 1.0e6));
            w.write("\nAverage vehicle-model render ms/frame: " + number(vehiclePerFrame));
            w.write("\nAverage model render ms/rendered vehicle-frame: " + number(vehicles == 0 ? Double.NaN : vehicleTime / 1.0e6 / vehicles));
            w.write("\nMaximum vehicle-model render ms/frame: " + number(s.size == 0 ? Double.NaN : maxVehicleNs / 1.0e6));
            w.write("\nVehicle-model rendering percentage: " + number(stats.seconds == 0 ? Double.NaN : 100.0 * vehicleTime / 1.0e9 / stats.seconds));
            w.write("\nLoaded/potentially visible vehicles: Unavailable; no additional world/frustum scans.\n");
            w.write("\nHUMANOID CUSTOMNPC MODELS\nHook observed: " + run.humanoidHookObserved);
            if (run.humanoidHookObserved && run.humanoidFailure.isEmpty()) {
                w.write("\nAverage rendered humanoids: " + number(perFrame(humans, s.size))
                        + "\nMinimum/maximum rendered humanoids: " + (s.size == 0 ? "N/A" : minHumans + " / " + maxHumans)
                        + "\nTotal humanoid-model CPU ms: " + number(humanTime / 1.0e6)
                        + "\nAverage humanoid-model ms/frame: " + number(perFrame(humanTime / 1.0e6, s.size))
                        + "\nAverage humanoid-model ms/rendered humanoid-frame: " + number(humans == 0 ? Double.NaN : humanTime / 1.0e6 / humans)
                        + "\nMaximum humanoid-model ms/frame: " + number(s.size == 0 ? Double.NaN : maxHumanNs / 1.0e6)
                        + "\nHumanoid-model rendering percentage: " + number(stats.seconds == 0 ? Double.NaN : 100.0 * humanTime / 1.0e9 / stats.seconds));
            } else w.write("\nUnavailable: " + (run.humanoidFailure.isEmpty() ? "no native humanoid model hook observed" : run.humanoidFailure));
            w.write("\nNative ModelMPM humanoid branch from setPlayerData to return, including native armor/overlay passes; unique NPC IDs per frame.\n"
                    + "Substituted entity models, players and scripted-hidden early returns excluded. Equipped item/Flan armor renderers outside ModelMPM are not included.\n"
                    + "Server AI/pathfinding is NOT measured by this client report. Run /wolffserverbenchmark on the server separately.\n");
            w.write("\nRENDER OPERATIONS\nModelRendererTurbo entry calls/frame: " + elementMetric);
            w.write("\nTMT Java glCallList submissions/frame: " + dispatchMetric);
            w.write("\ncompileDisplayList entries observed: " + compilations + ((run.observedHooks & 4) == 0 ? " (hook not exercised; availability unconfirmed)" : ""));
            w.write("\nGL counter scope: direct glCallList submissions in TMT.callDisplayList; GPU-internal nested list execution is not counted.");
            w.write("\nSafe group-cache replays bypass Java TMT element/list hooks. See cache replay/build/shared-state counters in the environment section; fewer Java calls do not imply fewer polygons. Those cache totals exclude warmup and include work up to stop (including an unfinished final frame), and are text-report-only.");
            w.write("\nGeometry recompilations versus first compilations: Unavailable.");
            w.write("\nBody/turret/barrel/wheel/track breakdown: Unavailable.");
            w.write("\nTexture binds, matrix/state calls, triangles, vertices: Unavailable.\n");
            w.write("\nMETHOD AND LIMITS\n");
            w.write("Frame time is nanoTime between consecutive FML client RenderTick START events, including intervening update/presentation/FPS-cap waits.\n");
            w.write("Average FPS = frames / summed frame seconds. Median FPS = 1000 / median frame ms.\n");
            w.write("Lows = reciprocal of mean duration of slowest ceil(N*0.01) / ceil(N*0.001) frames, minimum one sample.\n");
            w.write("Percentiles use nearest-rank ceil(p*N). Small samples (especially below 1000 frames) make 0.1% low noisy.\n");
            w.write("Wolff model render() scopes only: CPU elapsed time, not GPU timer queries; includes driver blocking and pass repeats, excludes texture binds/setup outside the model.\n");
            w.write("Unique world entity IDs per frame; a CustomNPC vehicle uses its associated NPC ID. Nested model super calls do not double-count time.\n");
            w.write("Rendered means model submitted, not proven visible pixels. Invisible, shadow and extra passes are not GPU-visibility tested.\n");
            w.write("Chat-open measured frames: " + run.chatFrames + ". Other GUI screens, pause, focus loss, unload/disconnect or dimension changes abort; incomplete transition interval excluded.\n");
            w.write("No forced GC. GC counters are JVM-wide and cannot attribute an individual hitch to vehicle rendering.\n");
            if (!run.metricFailure.isEmpty()) w.write("Metric failure: " + run.metricFailure + "\n");
            w.write("Profiler overhead is uncalibrated: two nanoTime reads per outer model pass, primitive counters per instrumented element/list submission, primitive samples per frame.\n");
            w.write("Humanoid hooks add callback objects per ModelMPM invocation, including when idle; no per-element humanoid hooks.\n");
            w.write("\nFAIR COMPARISON\nUse the same world, camera position/direction, vehicle count, resolution, render distance, graphics settings, FPS cap, VSync, shaders, duration and warmup.\n");
            w.write("Install OptiFine and Angelica separately. Keep the benchmark jar identical for A/B runs; record a useful label.\n");
        }

        // The text report survives independently if a subsequent CSV operation fails.
        try {
            try (BufferedWriter w = Files.newBufferedWriter(new File(run.directory, base + ".csv").toPath(), StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW)) {
                w.write("timestamp_ms,frame_time_ms,fps,rendered_wolff_vehicles,wolff_model_render_time_ms,model_render_passes,model_render_calls,gl_display_list_calls,compilation_entries,texture_binds,rendered_humanoid_npcs,humanoid_model_render_time_ms\n");
                double elapsed = 0;
                for (int i = 0; i < s.size; i++) {
                    elapsed += s.frameNs[i] / 1.0e6;
                    w.write(number(elapsed) + "," + number(s.frameNs[i] / 1.0e6) + "," + number(1.0e9 / s.frameNs[i])
                            + "," + s.vehicles[i] + "," + number(s.vehicleNs[i] / 1.0e6) + "," + s.passes[i]
                            + "," + ((run.observedHooks & 1) == 0 ? "" : s.elements[i])
                            + "," + ((run.observedHooks & 2) == 0 ? "" : s.dispatches[i])
                            + "," + ((run.observedHooks & 4) == 0 ? "" : s.compilations[i]) + ",,"
                            + (run.humanoidHookObserved && run.humanoidFailure.isEmpty() ? s.humanoids[i] + "," + number(s.humanoidNs[i] / 1.0e6) : ",") + "\n");
                }
            }
            File summary = new File(run.directory, "wolff-benchmark-summary-v2.csv");
            appendSummary(summary, csv(stamp) + "," + csv(run.label) + "," + csv(run.outcome) + "," + csv(run.environment.get("Renderer mod detected"))
                        + "," + number(stats.seconds) + "," + csv(run.environment.get("Resolution"))
                        + "," + csv(run.environment.get("Render distance chunks")) + "," + number(stats.averageFps)
                        + "," + number(stats.low1) + "," + number(stats.low01) + "," + number(stats.meanMs)
                        + "," + number(stats.p99Ms) + "," + number(perFrame(vehicles, s.size)) + "," + number(vehiclePerFrame)
                        + "," + csv(elementMetric) + "," + csv(dispatchMetric) + ","
                        + (run.humanoidHookObserved && run.humanoidFailure.isEmpty() ? number(perFrame(humans, s.size)) + "," + number(perFrame(humanTime / 1.0e6, s.size)) : ",") + "\n");
        } catch (IOException failure) {
            run.csvWarning = failure.getMessage();
            try (BufferedWriter w = Files.newBufferedWriter(text.toPath(), StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {
                w.write("\nCSV WRITE WARNING: " + failure.getMessage() + "\n");
            }
        }
        return text;
    }

    private static void appendSummary(File summary, String row) throws IOException {
        try (java.nio.channels.FileChannel channel = java.nio.channels.FileChannel.open(summary.toPath(),
                StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);
                java.nio.channels.FileLock lock = channel.lock()) {
            long size = channel.size();
            byte[] expected = (HEADER + "\n").getBytes(StandardCharsets.UTF_8);
            if (size > 0) {
                java.nio.ByteBuffer header = java.nio.ByteBuffer.allocate(expected.length);
                while (header.hasRemaining() && channel.read(header) >= 0) { }
                if (!java.util.Arrays.equals(expected, header.array()))
                    throw new IOException("Existing summary CSV has a different header; preserved without appending");
                java.nio.ByteBuffer tail = java.nio.ByteBuffer.allocate(1);
                channel.position(size - 1); channel.read(tail);
                if (tail.array()[0] != '\n')
                    throw new IOException("Existing summary ends with an incomplete row; preserved without appending");
            }
            channel.position(size);
            java.nio.ByteBuffer data = java.nio.ByteBuffer.wrap(((size == 0 ? HEADER + "\n" : "") + row).getBytes(StandardCharsets.UTF_8));
            while (data.hasRemaining()) channel.write(data);
            channel.force(false);
        }
    }
}

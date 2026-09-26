import com.wolffsmod.benchmark.*;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

/** Standalone Java 8 tests; does not need a Minecraft instance or an OpenGL context. */
public final class BenchmarkSelfTest {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }
    private static void close(double actual, double expected, String message) {
        check(Math.abs(actual - expected) < 0.000001, message + ": " + actual);
    }
    public static void main(String[] args) throws Exception {
        BenchmarkSamples constant = new BenchmarkSamples(1000);
        for (int i=0; i<1000; i++) check(constant.add(10000000L, 2000000L, 5, 6, 100, 100, 0), "capacity");
        check(!constant.add(1, 0, 0, 0, 0, 0, 0), "bounded buffer");
        BenchmarkStatistics s = new BenchmarkStatistics(constant);
        close(s.averageFps,100,"constant fps"); close(s.low1,100,"constant low1");
        close(s.low01,100,"constant low01"); close(s.p99Ms,10,"constant p99");
        BenchmarkSamples spikes = new BenchmarkSamples(1000);
        for(int i=0;i<990;i++) spikes.add(10000000,0,0,0,0,0,0);
        for(int i=0;i<9;i++) spikes.add(20000000,0,0,0,0,0,0);
        spikes.add(100000000,0,0,0,0,0,0);
        s = new BenchmarkStatistics(spikes);
        close(s.low1,1.0e9/28000000.0,"mean slowest ten frames"); close(s.low01,10,"slowest one frame");
        close(s.p99Ms,10,"nearest-rank p99 boundary"); close(s.worstMs,100,"worst");
        close(s.averageFps,1000/10.18,"duration-weighted FPS");
        check(Double.isNaN(new BenchmarkStatistics(new BenchmarkSamples(1)).averageFps),"empty run N/A");
        BenchmarkSamples pair = new BenchmarkSamples(2); pair.add(10000000,0,0,0,0,0,0); pair.add(30000000,0,0,0,0,0,0);
        close(new BenchmarkStatistics(pair).medianMs,20,"even median");

        FrameVehicleSet set = new FrameVehicleSet();
        for(int i=-10000;i<10000;i++) { check(set.add(i),"unique id"); check(!set.add(i),"repeat pass deduplicated"); }
        set.clear(); check(set.add(1),"new frame resets identity set");
        check(!BenchmarkReport.safeLabel("../../bad/path").contains("/"),"filename sanitation");
        check(BenchmarkReport.csv("a,\"b").equals("\"a,\"\"b\""),"CSV escaping");

        File directory = Files.createTempDirectory("wolff-benchmark-test-").toFile();
        BenchmarkRun run = new BenchmarkRun(directory,"test,quoted",1,5);
        run.environment.put("Renderer mod detected","Test only");
        run.environment.put("Resolution","2560x1440");
        run.environment.put("Render distance chunks","12");
        run.samples.add(10000000,2000000,5,6,100,100,0); run.observedHooks=3;
        File first = BenchmarkReport.write(run);
        File second = BenchmarkReport.write(run);
        check(!first.equals(second),"same timestamp never overwrites");
        check(first.exists(),"text report");
        List<String> summary = Files.readAllLines(new File(directory,"wolff-benchmark-summary-v2.csv").toPath(),StandardCharsets.UTF_8);
        check(summary.size()==3,"one header and two summary rows");
        String report = new String(Files.readAllBytes(first.toPath()),StandardCharsets.UTF_8);
        check(report.contains("Average rendered: 5.0000"),"vehicle summary");
        check(report.contains("Vehicle-model rendering percentage: 20.0000"),"render percentage");
        File csv = new File(first.getParentFile(),first.getName().replace(".txt",".csv"));
        List<String> rows = Files.readAllLines(csv.toPath(),StandardCharsets.UTF_8);
        check(rows.get(0).split(",",-1).length==rows.get(1).split(",",-1).length,"CSV columns align including unavailable values");
        byte[] unfinished = String.join("\n",summary).getBytes(StandardCharsets.UTF_8);
        Files.write(new File(directory,"wolff-benchmark-summary-v2.csv").toPath(),unfinished);
        File interrupted = BenchmarkReport.write(run);
        check(java.util.Arrays.equals(unfinished,Files.readAllBytes(new File(directory,"wolff-benchmark-summary-v2.csv").toPath())),"incomplete summary row preserved");
        check(new String(Files.readAllBytes(interrupted.toPath()),StandardCharsets.UTF_8).contains("incomplete row"),"incomplete summary warning");
        byte[] incompatible = "unrelated_header\nexisting_data\n".getBytes(StandardCharsets.UTF_8);
        Files.write(new File(directory,"wolff-benchmark-summary-v2.csv").toPath(),incompatible);
        File third = BenchmarkReport.write(run);
        check(java.util.Arrays.equals(incompatible,Files.readAllBytes(new File(directory,"wolff-benchmark-summary-v2.csv").toPath())),"incompatible summary preserved");
        check(new String(Files.readAllBytes(third.toPath()),StandardCharsets.UTF_8).contains("CSV WRITE WARNING"),"CSV failure recorded, text survives");
        BenchmarkRun empty = new BenchmarkRun(directory,"aborted warmup",1,5); empty.environment.putAll(run.environment);
        empty.outcome="ABORTED"; empty.reason="Test";
        check(BenchmarkReport.write(empty).exists(),"empty partial report writes safely");
        run.humanoidHookObserved = true;
        run.samples.humanoids[0] = 3;
        run.samples.humanoidNs[0] = 1000000;
        String humanReport = new String(Files.readAllBytes(BenchmarkReport.write(run).toPath()),StandardCharsets.UTF_8);
        check(humanReport.contains("Average rendered humanoids: 3.0000"),"separate humanoid count");
        check(humanReport.contains("Humanoid-model rendering percentage: 10.0000"),"separate humanoid time");
        check(humanReport.contains("Average rendered: 5.0000"),"humanoids do not alter vehicle count");
        run.humanoidFailure = "Test unavailable";
        String failedHuman = new String(Files.readAllBytes(BenchmarkReport.write(run).toPath()),StandardCharsets.UTF_8);
        check(failedHuman.contains("Unavailable: Test unavailable"),"failed humanoid metric marked unavailable");
        System.out.println("PASS: statistics, percentiles/lows, buffer bounds, vehicle deduplication, CSV and report failure handling. Test reports: " + directory);
    }
}

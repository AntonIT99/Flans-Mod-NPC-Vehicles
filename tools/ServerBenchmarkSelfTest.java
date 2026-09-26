import com.wolffsmod.benchmark.ServerBenchmarkData;
import com.wolffsmod.benchmark.ServerBenchmarkReport;
import java.io.File;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.util.List;

/** Synthetic calculations only: not an in-game benchmark. */
public class ServerBenchmarkSelfTest {
    private static void check(boolean value, String message) { if (!value) throw new AssertionError(message); }
    public static void main(String[] args) throws Exception {
        File directory = Files.createTempDirectory("wolff-server-benchmark-test-").toFile();
        ServerBenchmarkData d = new ServerBenchmarkData(directory, "../../test, label", 30, 5);
        d.size = 3; d.elapsedNs = 200000000;
        d.groundObserved = d.flyingObserved = true;
        d.rows[0] = new long[] {10000000,10000000,2,4000000,1,2000000,0,0,0,2000000,1,1000000};
        d.rows[1] = new long[] {70000000,20000000,3,5000000,1,3000000,0,0,1,3000000,2,1000000};
        d.rows[2] = new long[] {200000000,100000000,5,10000000,0,0,1,5000000,0,5000000,1,1000000};
        File first = ServerBenchmarkReport.write(d);
        File second = ServerBenchmarkReport.write(d);
        check(!first.equals(second), "Reports must not overwrite");
        check(first.getCanonicalFile().getParentFile().equals(directory.getCanonicalFile()), "Label cannot escape directory");
        String text = new String(Files.readAllBytes(first.toPath()), StandardCharsets.UTF_8);
        check(text.contains("Observed ticks/second (capped at 20): 15.0000"), "TPS");
        check(text.contains("Mean server work ms/tick: 43.3333"), "MSPT");
        check(text.contains("P99 work ms/tick: 100.0000"), "P99");
        check(text.contains("Ticks over 50 ms: 1"), "Slow tick count");
        check(text.contains("NPC update calls: 10"), "NPC calls");
        check(text.contains("Ground path searches: 2"), "Ground queries");
        check(text.contains("Flying path searches: 1"), "Flying queries");
        check(text.contains("Mean path search ms: 3.3333"), "Path mean not mean of tick means");
        check(text.contains("Worst path search ms: 5.0000"), "Path maximum not summed");
        check(text.contains("Paths returning null: 1"), "Null path count");
        List<String> csv = Files.readAllLines(new File(directory, first.getName().replace(".txt", ".csv")).toPath(), StandardCharsets.UTF_8);
        check(csv.size() == 4, "One row per tick");
        for (String row : csv) check(row.split(",", -1).length == 12, "CSV columns aligned");
        ServerBenchmarkData empty = new ServerBenchmarkData(directory, "warmup stop", 10, 5);
        empty.outcome = "ABORTED";
        String zero = new String(Files.readAllBytes(ServerBenchmarkReport.write(empty).toPath()), StandardCharsets.UTF_8);
        check(zero.contains("Mean server work ms/tick: N/A"), "No divide-by-zero on empty run");
        check(zero.contains("Unexercised or unavailable"), "Optional hook availability explicit");
        System.out.println("PASS: server TPS/MSPT, percentiles, counts, path totals/max, CSV, empty runs and collision-safe files.");
    }
}

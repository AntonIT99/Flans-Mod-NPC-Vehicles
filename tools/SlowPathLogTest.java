import com.wolffsmod.benchmark.SlowPathLog;
public class SlowPathLogTest {
    private static void add(SlowPathLog log, long t, long duration, int id) {
        log.record(t, duration, 0, id, "Test", 0, 0, 0, 10, 0, 0, 9, 0, 0, 512, 100, "partial", "5,0,0");
    }
    public static void main(String[] args) {
        SlowPathLog log = new SlowPathLog();
        add(log, 1, 1000, 1);
        add(log, 1000000000L, 60000000, 1);
        if (log.stored != 1 || !log.report().contains("recentSameDestination=true")) throw new AssertionError();
        for (int i = 0; i < 300; i++) add(log, 2000000000L, 60000000, i);
        if (log.stored != 256 || log.dropped != 45) throw new AssertionError();
        SlowPathLog fresh = new SlowPathLog();
        add(fresh, 1, 50000000, 1);
        if (fresh.stored != 0) throw new AssertionError();
        add(fresh, 6000000001L, 60000000, 1);
        if (!fresh.report().contains("recentSameDestination=false") || !fresh.report().contains("nodes=unavailable")) throw new AssertionError();
        System.out.println("PASS: threshold, repeat detection/expiry, record cap and unavailable node counts");
    }
}

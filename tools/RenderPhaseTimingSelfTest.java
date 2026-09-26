import com.wolffsmod.render.RenderPhaseTiming;
import java.util.LinkedHashMap;
import java.util.Map;

public final class RenderPhaseTimingSelfTest {
    public static void main(String[] args) {
        RenderPhaseTiming.start();
        if (!RenderPhaseTiming.active) throw new AssertionError("Not active");
        RenderPhaseTiming.validation = 1250000;
        RenderPhaseTiming.replay = 2500000;
        RenderPhaseTiming.stop();
        if (RenderPhaseTiming.active) throw new AssertionError("Still active");
        Map<String,String> report = new LinkedHashMap<String,String>();
        RenderPhaseTiming.report(report);
        if (!"1.2500".equals(report.get("Cache validation and bookkeeping total ms"))) throw new AssertionError(report);
        RenderPhaseTiming.reset();
        if (RenderPhaseTiming.active || RenderPhaseTiming.validation != 0 || RenderPhaseTiming.replay != 0)
            throw new AssertionError("Warmup abort would retain previous run");
        System.out.println("PASS: phase lifecycle, reset and millisecond reporting");
    }
}

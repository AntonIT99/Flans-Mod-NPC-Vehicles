import com.wolffsmod.customnpc.AdaptivePathSearchRange;

public class AdaptivePathSearchRangeTest {
    private static void close(float actual, float expected) {
        if (Math.abs(actual - expected) > 0.001F) throw new AssertionError(actual + " != " + expected);
    }
    public static void main(String[] args) {
        close(AdaptivePathSearchRange.effective(256, 5, true, 32, 24), 32);
        close(AdaptivePathSearchRange.effective(256, 40, true, 32, 24), 64);
        close(AdaptivePathSearchRange.effective(256, 240, true, 32, 24), 256);
        close(AdaptivePathSearchRange.effective(128, 100, true, 32, 24), 124);
        close(AdaptivePathSearchRange.effective(256, 5, false, 32, 24), 256);
        close(AdaptivePathSearchRange.effective(256, Float.NaN, true, 32, 24), 256);
        System.out.println("PASS: local searches shrink, distant reach remains, legacy and invalid inputs remain safe");
    }
}

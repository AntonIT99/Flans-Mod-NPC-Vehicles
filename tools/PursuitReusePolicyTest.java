import com.wolffsmod.customnpc.PursuitReusePolicy;
public class PursuitReusePolicyTest {
    private static void check(boolean actual, boolean expected) { if (actual != expected) throw new AssertionError(); }
    public static void main(String[] args) {
        check(PursuitReusePolicy.permits(10, 4, 2, 1, 16), true);
        check(PursuitReusePolicy.permits(20, 4, 2, 1, 16), false);
        check(PursuitReusePolicy.permits(-1, 4, 2, 1, 16), false);
        check(PursuitReusePolicy.permits(10, 16.1, 2, 1, 16), false);
        check(PursuitReusePolicy.permits(10, 4, 4.1, 1, 16), false);
        check(PursuitReusePolicy.permits(10, 4, 2, 0, 16), false);
        check(PursuitReusePolicy.permits(10, 4, 2, 1, 64.1), false);
        check(PursuitReusePolicy.permits(10, Double.NaN, 2, 1, 16), false);
        System.out.println("PASS: reuse expiry, target movement, stuck detection, endpoint bounds and invalid values");
    }
}

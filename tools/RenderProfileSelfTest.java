import com.wolffsmod.render.TurboRenderProfile;
import java.io.InputStream;
import java.util.zip.ZipFile;

/** Tests the actual supplied renderer bytes without requiring an OpenGL context. */
public final class RenderProfileSelfTest {
    public static void main(String[] args) throws Exception {
        if (TurboRenderProfile.identify(null) != 0 || TurboRenderProfile.identifyHash("unknown") != 0)
            throw new AssertionError("Unknown renderers must fall back");
        for (int i = 0; i < args.length; i += 2) {
            try (ZipFile zip = new ZipFile(args[i]); InputStream in = zip.getInputStream(zip.getEntry("com/flansmod/client/tmt/ModelRendererTurbo.class"))) {
                if (TurboRenderProfile.identify(in) != Integer.parseInt(args[i + 1]))
                    throw new AssertionError("Wrong renderer profile: " + args[i]);
            }
        }
        System.out.println("PASS: supplied renderer fingerprints and unknown-renderer fallback");
    }
}

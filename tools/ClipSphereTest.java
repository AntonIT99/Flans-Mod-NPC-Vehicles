import com.wolffsmod.render.ClipSphere;
public class ClipSphereTest {
    private static float[] identity() { return new float[]{1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1}; }
    private static float[] perspective(double fov) {
        float f = (float)(1 / Math.tan(Math.toRadians(fov/2)));
        return new float[]{f/2,0,0,0,0,f,0,0,0,0,-1.0002f,-1,0,0,-0.20002f,0};
    }
    private static void check(boolean b) { if(!b) throw new AssertionError(); }
    public static void main(String[] args) {
        float[] m = identity(), p = perspective(70);
        m[12]=20; m[14]=-10;
        check(ClipSphere.outside(p,m,1));
        check(!ClipSphere.outside(perspective(150),m,1)); // wide FOV includes side object
        m[12]=100; m[14]=-10;
        check(!ClipSphere.outside(p,m,150)); // long ship overlaps view despite distant origin
        m[12]=0; m[14]=100;
        check(ClipSphere.outside(p,m,1));
        check(!ClipSphere.outside(p,m,200)); // camera inside large bounds
        m[0]=Float.NaN;
        check(!ClipSphere.outside(p,m,1));
        System.out.println("PASS: FOV, behind-camera rejection, long models, camera-inside and invalid-matrix fallback");
    }
}

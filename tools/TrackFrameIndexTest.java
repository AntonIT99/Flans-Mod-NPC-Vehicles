import com.wolffsmod.render.TrackFrameIndex;
public class TrackFrameIndexTest {
    public static void main(String[] args) {
        if(TrackFrameIndex.select(0,3)!=0 || TrackFrameIndex.select(1,3)!=0
                || TrackFrameIndex.select(-0.1F,3)!=2 || TrackFrameIndex.select(0.5F,3)!=1
                || TrackFrameIndex.select(Float.NaN,3)!=0) throw new AssertionError();
        System.out.println("PASS: stationary, wrap, reverse, forward and invalid track phases");
    }
}

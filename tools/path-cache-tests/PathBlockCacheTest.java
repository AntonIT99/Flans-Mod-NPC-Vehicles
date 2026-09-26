import com.wolffsmod.customnpc.PathBlockCache;
import net.minecraft.world.World;
import net.minecraft.block.Block;
public class PathBlockCacheTest {
    private static void check(boolean b) { if (!b) throw new AssertionError(); }
    public static void main(String[] args) throws Exception {
        World world = new World(), other = new World();
        PathBlockCache.begin(world);
        try {
            Block first = PathBlockCache.get(world, -1, 20, 100);
            check(first == PathBlockCache.get(world, -1, 20, 100) && world.reads == 1);
            PathBlockCache.get(world, -1 + 8192, 20, 100); // same bucket, different coordinates
            PathBlockCache.get(world, -1, 20, 100);
            check(world.reads == 3);
            PathBlockCache.get(other, -1, 20, 100);
            check(other.reads == 1);
            PathBlockCache.begin(world);
            try {
                PathBlockCache.get(world, -1, 20, 100);
                PathBlockCache.get(world, -1, 20, 100);
                check(world.reads == 5); // nested searches bypass cache
            } finally { PathBlockCache.end(); }
            PathBlockCache.get(world, -1, 20, 100);
            check(world.reads == 6); // outer data invalidated by nested search
        } finally { PathBlockCache.end(); }
        world.block = new Block();
        PathBlockCache.begin(world);
        try { check(PathBlockCache.get(world, -1, 20, 100) == world.block && world.reads == 7); }
        finally { PathBlockCache.end(); }
        PathBlockCache.get(world, -1, 20, 100);
        check(world.reads == 8); // no caching outside search
        System.out.println("PASS: reuse, collisions, negative coordinates, worlds, nested searches and search invalidation");
    }
}

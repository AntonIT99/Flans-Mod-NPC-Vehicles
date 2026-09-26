package com.wolffsmod.customnpc;

import net.minecraft.block.Block;
import net.minecraft.world.World;

/** Bounded block-type lookup cache, discarded logically after each synchronous search. */
public final class PathBlockCache {
    private static final ThreadLocal<PathBlockCache> LOCAL = new ThreadLocal<PathBlockCache>();
    private final int[] xs = new int[8192], ys = new int[8192], zs = new int[8192], stamps = new int[8192];
    private final Block[] blocks = new Block[8192];
    private int generation, depth;
    private World world;
    private PathBlockCache() {}

    public static void begin(World world) {
        PathBlockCache cache = LOCAL.get();
        if (cache == null) { cache = new PathBlockCache(); LOCAL.set(cache); }
        cache.depth++;
        cache.invalidate();
        if (cache.depth == 1) cache.world = world;
    }
    public static void end() {
        PathBlockCache cache = LOCAL.get();
        cache.invalidate();
        if (--cache.depth == 0) cache.world = null;
    }
    private void invalidate() {
        if (++generation == 0) { java.util.Arrays.fill(stamps, 0); generation = 1; }
    }
    public static Block get(World world, int x, int y, int z) {
        PathBlockCache cache = LOCAL.get();
        if (cache == null || cache.depth != 1 || cache.world != world) return world.getBlock(x, y, z);
        int slot = (x * 73428767 ^ y * 912931 ^ z * 438289) & 8191;
        if (cache.stamps[slot] == cache.generation && cache.xs[slot] == x && cache.ys[slot] == y && cache.zs[slot] == z)
            return cache.blocks[slot];
        Block result = world.getBlock(x, y, z);
        cache.xs[slot] = x; cache.ys[slot] = y; cache.zs[slot] = z;
        cache.blocks[slot] = result; cache.stamps[slot] = cache.generation;
        return result;
    }
}

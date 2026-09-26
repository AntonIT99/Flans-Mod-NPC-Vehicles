package net.minecraft.world;
import net.minecraft.block.Block;
public class World {
    public int reads;
    public Block block = new Block();
    public Block getBlock(int x, int y, int z) { reads++; return block; }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer.blocks;

import org.lwjgl.opengl.GL11;
import noppes.npcs.blocks.tiles.TileBorder;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.block.Block;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.RenderingRegistry;
import noppes.npcs.CustomItems;
import noppes.npcs.blocks.BlockBorder;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class BlockBorderRenderer implements ISimpleBlockRenderingHandler
{
    public BlockBorderRenderer() {
        ((BlockBorder)CustomItems.border).renderId = RenderingRegistry.getNextAvailableRenderId();
    }
    
    public boolean renderWorldBlock(final IBlockAccess world, final int x, final int y, final int z, final Block block, final int modelId, final RenderBlocks renderer) {
        final TileBorder tile = (TileBorder)world.getTileEntity(x, y, z);
        GL11.glPushMatrix();
        if (tile.rotation == 1) {
            renderer.uvRotateTop = 1;
        }
        else if (tile.rotation == 3) {
            renderer.uvRotateTop = 2;
        }
        else if (tile.rotation == 2) {
            renderer.uvRotateTop = 3;
        }
        renderer.renderStandardBlock(CustomItems.border, x, y, z);
        renderer.uvRotateTop = 0;
        GL11.glPopMatrix();
        return true;
    }
    
    public boolean shouldRender3DInInventory(final int modelId) {
        return false;
    }
    
    public int getRenderId() {
        return CustomItems.border.getRenderType();
    }
    
    public void renderInventoryBlock(final Block block, final int metadata, final int modelId, final RenderBlocks renderer) {
    }
}

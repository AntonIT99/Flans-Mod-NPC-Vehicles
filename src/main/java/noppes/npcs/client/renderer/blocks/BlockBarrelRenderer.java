// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer.blocks;

import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import noppes.npcs.blocks.tiles.TileColorable;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import noppes.npcs.CustomItems;
import noppes.npcs.blocks.BlockBarrel;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.client.model.blocks.ModelBarrelLit;
import noppes.npcs.client.model.blocks.ModelBarrel;

public class BlockBarrelRenderer extends BlockRendererInterface
{
    private final ModelBarrel model;
    private final ModelBarrelLit modelLit;
    private static final ResourceLocation resource1;
    
    public BlockBarrelRenderer() {
        this.model = new ModelBarrel();
        this.modelLit = new ModelBarrelLit();
        ((BlockBarrel)CustomItems.barrel).renderId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)this);
    }
    
    public void renderTileEntityAt(final TileEntity var1, final double var2, final double var4, final double var6, final float var8) {
        final TileColorable tile = (TileColorable)var1;
        GL11.glDisable(32826);
        GL11.glEnable(3008);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2 + 0.5f, (float)var4 + 1.42f, (float)var6 + 0.5f);
        GL11.glScalef(1.0f, 0.94f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef((float)(45 * tile.rotation), 0.0f, 1.0f, 0.0f);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        GL11.glEnable(2884);
        this.setWoodTexture(var1.getBlockMetadata());
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        Minecraft.getMinecraft().getTextureManager().bindTexture(BlockBarrelRenderer.resource1);
        this.modelLit.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
    
    public void renderInventoryBlock(final Block block, final int metadata, final int modelId, final RenderBlocks renderer) {
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.75f, 0.0f);
        GL11.glScalef(0.7f, 0.7f, 0.7f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        this.setWoodTexture(metadata);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        Minecraft.getMinecraft().getTextureManager().bindTexture(BlockBarrelRenderer.resource1);
        this.modelLit.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
    
    public int getRenderId() {
        return CustomItems.barrel.getRenderType();
    }
    
    static {
        resource1 = new ResourceLocation("customnpcs", "textures/models/Barrel.png");
    }
}

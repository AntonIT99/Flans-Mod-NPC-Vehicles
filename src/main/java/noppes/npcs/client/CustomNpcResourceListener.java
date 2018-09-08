// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client;

import java.awt.Graphics;
import noppes.npcs.LogWriter;
import java.awt.image.RenderedImage;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.util.StatCollector;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.FolderResourcePack;
import java.io.File;
import noppes.npcs.CustomNpcs;
import net.minecraft.client.resources.SimpleReloadableResourceManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;

public class CustomNpcResourceListener implements IResourceManagerReloadListener
{
    public static int DefaultTextColor;
    
    public void onResourceManagerReload(final IResourceManager var1) {
        if (var1 instanceof SimpleReloadableResourceManager) {
            this.createTextureCache(new File(CustomNpcs.Dir, "assets/customnpcs/textures/cache"));
            final SimpleReloadableResourceManager simplemanager = (SimpleReloadableResourceManager)var1;
            final FolderResourcePack pack = new FolderResourcePack(CustomNpcs.Dir);
            simplemanager.reloadResourcePack((IResourcePack)pack);
            try {
                CustomNpcResourceListener.DefaultTextColor = Integer.parseInt(StatCollector.translateToLocal("customnpcs.defaultTextColor"), 16);
            }
            catch (NumberFormatException e) {
                CustomNpcResourceListener.DefaultTextColor = 4210752;
            }
        }
    }
    
    private void createTextureCache(final File dir) {
        if (dir == null) {
            return;
        }
        this.enlargeTexture("planks_oak", dir);
        this.enlargeTexture("planks_big_oak", dir);
        this.enlargeTexture("planks_birch", dir);
        this.enlargeTexture("planks_jungle", dir);
        this.enlargeTexture("planks_spruce", dir);
        this.enlargeTexture("planks_acacia", dir);
        this.enlargeTexture("iron_block", dir);
        this.enlargeTexture("diamond_block", dir);
        this.enlargeTexture("stone", dir);
        this.enlargeTexture("gold_block", dir);
        this.enlargeTexture("wool_colored_white", dir);
    }
    
    private void enlargeTexture(final String texture, final File dir) {
        try {
            final IResourceManager manager = Minecraft.getMinecraft().getResourceManager();
            final ResourceLocation location = new ResourceLocation("textures/blocks/" + texture + ".png");
            final BufferedImage bufferedimage = ImageIO.read(manager.getResource(location).getInputStream());
            final int i = bufferedimage.getWidth();
            final int j = bufferedimage.getHeight();
            final BufferedImage image = new BufferedImage(i * 4, j * 2, 1);
            final Graphics g = image.getGraphics();
            g.drawImage(bufferedimage, 0, 0, null);
            g.drawImage(bufferedimage, i, 0, null);
            g.drawImage(bufferedimage, i * 2, 0, null);
            g.drawImage(bufferedimage, i * 3, 0, null);
            g.drawImage(bufferedimage, 0, i, null);
            g.drawImage(bufferedimage, i, j, null);
            g.drawImage(bufferedimage, i * 2, j, null);
            g.drawImage(bufferedimage, i * 3, j, null);
            ImageIO.write(image, "png", new File(dir, texture + ".png"));
        }
        catch (Exception e) {
            LogWriter.error("Failed caching texture: " + texture, e);
        }
    }
    
    static {
        CustomNpcResourceListener.DefaultTextColor = 4210752;
    }
}

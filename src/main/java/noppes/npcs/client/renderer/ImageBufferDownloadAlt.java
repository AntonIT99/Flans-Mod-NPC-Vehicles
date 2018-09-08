// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer;

import java.awt.Graphics;
import java.awt.image.DataBufferInt;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.BufferedImage;
import net.minecraft.client.renderer.ImageBufferDownload;

public class ImageBufferDownloadAlt extends ImageBufferDownload
{
    private int[] imageData;
    private int imageWidth;
    private int imageHeight;
    
    public BufferedImage parseUserSkin(final BufferedImage bufferedimage) {
        this.imageWidth = bufferedimage.getWidth(null);
        this.imageHeight = this.imageWidth / 2;
        final BufferedImage bufferedimage2 = new BufferedImage(this.imageWidth, this.imageHeight, 2);
        final Graphics g = bufferedimage2.getGraphics();
        g.drawImage(bufferedimage, 0, 0, null);
        g.dispose();
        this.imageData = ((DataBufferInt)bufferedimage2.getRaster().getDataBuffer()).getData();
        this.setAreaTransparent(this.imageWidth / 2, 0, this.imageWidth, this.imageHeight / 2);
        return bufferedimage2;
    }
    
    private void setAreaTransparent(final int par1, final int par2, final int par3, final int par4) {
        if (!this.hasTransparency(par1, par2, par3, par4)) {
            for (int i1 = par1; i1 < par3; ++i1) {
                for (int j1 = par2; j1 < par4; ++j1) {
                    final int[] imageData = this.imageData;
                    final int n = i1 + j1 * this.imageWidth;
                    imageData[n] &= 0xFFFFFF;
                }
            }
        }
    }
    
    private boolean hasTransparency(final int par1, final int par2, final int par3, final int par4) {
        for (int i1 = par1; i1 < par3; ++i1) {
            for (int j1 = par2; j1 < par4; ++j1) {
                final int k1 = this.imageData[i1 + j1 * this.imageWidth];
                if ((k1 >> 24 & 0xFF) < 128) {
                    return true;
                }
            }
        }
        return false;
    }
}

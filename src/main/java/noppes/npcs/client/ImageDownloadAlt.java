// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client;

import org.apache.logging.log4j.LogManager;
import org.apache.commons.io.FileUtils;
import net.minecraft.client.Minecraft;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.util.ResourceLocation;
import java.awt.image.BufferedImage;
import net.minecraft.client.renderer.IImageBuffer;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.Logger;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.SimpleTexture;

@SideOnly(Side.CLIENT)
public class ImageDownloadAlt extends SimpleTexture
{
    private static final Logger logger;
    private static final AtomicInteger threadDownloadCounter;
    private final File cacheFile;
    private final String imageUrl;
    private final IImageBuffer imageBuffer;
    private BufferedImage bufferedImage;
    private Thread imageThread;
    private boolean textureUploaded;
    
    public ImageDownloadAlt(final File file, final String url, final ResourceLocation resource, final IImageBuffer buffer) {
        super(resource);
        this.cacheFile = file;
        this.imageUrl = url;
        this.imageBuffer = buffer;
    }
    
    private void checkTextureUploaded() {
        if (!this.textureUploaded && this.bufferedImage != null) {
            if (this.textureLocation != null) {
                this.deleteGlTexture();
            }
            TextureUtil.uploadTextureImage(super.getGlTextureId(), this.bufferedImage);
            this.textureUploaded = true;
        }
    }
    
    public int getGlTextureId() {
        this.checkTextureUploaded();
        return super.getGlTextureId();
    }
    
    public void setBufferedImage(final BufferedImage p_147641_1_) {
        this.bufferedImage = p_147641_1_;
        if (this.imageBuffer != null) {
            this.imageBuffer.func_152634_a();
        }
    }
    
    public void loadTexture(final IResourceManager resourceManager) throws IOException {
        if (this.bufferedImage == null && this.textureLocation != null) {
            super.loadTexture(resourceManager);
        }
        if (this.imageThread == null) {
            if (this.cacheFile != null && this.cacheFile.isFile()) {
                ImageDownloadAlt.logger.debug("Loading http texture from local cache ({})", new Object[] { this.cacheFile });
                try {
                    this.bufferedImage = ImageIO.read(this.cacheFile);
                    if (this.imageBuffer != null) {
                        this.setBufferedImage(this.imageBuffer.parseUserSkin(this.bufferedImage));
                    }
                }
                catch (IOException ioexception) {
                    ImageDownloadAlt.logger.error("Couldn't load skin " + this.cacheFile, (Throwable)ioexception);
                    this.loadTextureFromServer();
                }
            }
            else {
                this.loadTextureFromServer();
            }
        }
    }
    
    protected void loadTextureFromServer() {
        (this.imageThread = new Thread("Texture Downloader #" + ImageDownloadAlt.threadDownloadCounter.incrementAndGet()) {
            private static final String __OBFID = "CL_00001050";
            
            @Override
            public void run() {
                HttpURLConnection connection = null;
                ImageDownloadAlt.logger.debug("Downloading http texture from {} to {}", new Object[] { ImageDownloadAlt.this.imageUrl, ImageDownloadAlt.this.cacheFile });
                try {
                    connection = (HttpURLConnection)new URL(ImageDownloadAlt.this.imageUrl).openConnection(Minecraft.getMinecraft().getProxy());
                    connection.setDoInput(true);
                    connection.setDoOutput(false);
                    connection.setRequestProperty("Content-Type", "image/png");
                    connection.setRequestProperty("Expect", "100-continue");
                    connection.setRequestProperty("User-Agent", "Mozilla/5.0");
                    connection.connect();
                    if (connection.getResponseCode() / 100 != 2) {
                        return;
                    }
                    BufferedImage bufferedimage;
                    if (ImageDownloadAlt.this.cacheFile != null) {
                        FileUtils.copyInputStreamToFile(connection.getInputStream(), ImageDownloadAlt.this.cacheFile);
                        bufferedimage = ImageIO.read(ImageDownloadAlt.this.cacheFile);
                    }
                    else {
                        bufferedimage = ImageIO.read(connection.getInputStream());
                    }
                    if (ImageDownloadAlt.this.imageBuffer != null) {
                        bufferedimage = ImageDownloadAlt.this.imageBuffer.parseUserSkin(bufferedimage);
                    }
                    ImageDownloadAlt.this.setBufferedImage(bufferedimage);
                }
                catch (Exception exception) {
                    ImageDownloadAlt.logger.error("Couldn't download http texture", (Throwable)exception);
                }
                finally {
                    if (connection != null) {
                        connection.disconnect();
                    }
                }
            }
        }).setDaemon(true);
        this.imageThread.start();
    }
    
    static {
        logger = LogManager.getLogger();
        threadDownloadCounter = new AtomicInteger(0);
    }
}

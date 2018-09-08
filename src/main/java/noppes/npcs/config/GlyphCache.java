// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.config;

import java.awt.RenderingHints;
import java.awt.Paint;
import org.lwjgl.opengl.GL11;
import java.awt.geom.Point2D;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.util.Iterator;
import java.awt.font.GlyphVector;
import java.io.InputStream;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import java.awt.Composite;
import java.awt.AlphaComposite;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.GraphicsEnvironment;
import net.minecraft.client.renderer.GLAllocation;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.awt.Font;
import java.util.List;
import java.nio.IntBuffer;
import java.awt.font.FontRenderContext;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class GlyphCache
{
    private static final int TEXTURE_WIDTH = 256;
    private static final int TEXTURE_HEIGHT = 256;
    private static final int STRING_WIDTH = 256;
    private static final int STRING_HEIGHT = 64;
    private static final int GLYPH_BORDER = 1;
    private static Color BACK_COLOR;
    private int fontSize;
    private boolean antiAliasEnabled;
    private BufferedImage stringImage;
    private Graphics2D stringGraphics;
    private BufferedImage glyphCacheImage;
    private Graphics2D glyphCacheGraphics;
    private FontRenderContext fontRenderContext;
    private int[] imageData;
    private IntBuffer imageBuffer;
    private IntBuffer singleIntBuffer;
    private List<Font> allFonts;
    protected List<Font> usedFonts;
    private int textureName;
    private LinkedHashMap<Font, Integer> fontCache;
    private LinkedHashMap<Long, Entry> glyphCache;
    private int cachePosX;
    private int cachePosY;
    private int cacheLineHeight;
    
    public GlyphCache() {
        this.fontSize = 18;
        this.antiAliasEnabled = false;
        this.glyphCacheImage = new BufferedImage(256, 256, 2);
        this.glyphCacheGraphics = this.glyphCacheImage.createGraphics();
        this.fontRenderContext = this.glyphCacheGraphics.getFontRenderContext();
        this.imageData = new int[65536];
        this.imageBuffer = ByteBuffer.allocateDirect(262144).order(ByteOrder.BIG_ENDIAN).asIntBuffer();
        this.singleIntBuffer = GLAllocation.createDirectIntBuffer(1);
        this.allFonts = Arrays.asList(GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts());
        this.usedFonts = new ArrayList<Font>();
        this.fontCache = new LinkedHashMap<Font, Integer>();
        this.glyphCache = new LinkedHashMap<Long, Entry>();
        this.cachePosX = 1;
        this.cachePosY = 1;
        this.cacheLineHeight = 0;
        this.glyphCacheGraphics.setBackground(GlyphCache.BACK_COLOR);
        this.glyphCacheGraphics.setComposite(AlphaComposite.Src);
        this.allocateGlyphCacheTexture();
        this.allocateStringImage(256, 64);
        GraphicsEnvironment.getLocalGraphicsEnvironment().preferLocaleFonts();
        this.usedFonts.add(new Font("SansSerif", 0, 72));
    }
    
    void setDefaultFont(final String name, final int size, final boolean antiAlias) {
        this.usedFonts.clear();
        this.usedFonts.add(new Font(name, 0, 72));
        this.fontSize = size;
        this.antiAliasEnabled = antiAlias;
        this.setRenderingHints();
    }
    
    void setCustomFont(final ResourceLocation location, final int size, final boolean antiAlias) throws Exception {
        final InputStream stream = Minecraft.getMinecraft().getResourceManager().getResource(location).getInputStream();
        final GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font font = Font.createFont(0, stream);
        ge.registerFont(font);
        font = font.deriveFont(0, 72.0f);
        this.usedFonts.clear();
        this.usedFonts.add(font);
        this.fontSize = size;
        this.antiAliasEnabled = antiAlias;
        this.setRenderingHints();
    }
    
    int fontHeight(final String s) {
        final Font font = this.lookupFont(s.toCharArray(), 0, s.length(), 0);
        return (int)font.getLineMetrics(s, this.fontRenderContext).getHeight();
    }
    
    GlyphVector layoutGlyphVector(final Font font, final char[] text, final int start, final int limit, final int layoutFlags) {
        if (!this.fontCache.containsKey(font)) {
            this.fontCache.put(font, this.fontCache.size());
        }
        return font.layoutGlyphVector(this.fontRenderContext, text, start, limit, layoutFlags);
    }
    
    Font lookupFont(final char[] text, final int start, final int limit, final int style) {
        for (final Font font : this.usedFonts) {
            if (font.canDisplayUpTo(text, start, limit) != start) {
                return font.deriveFont(style, this.fontSize);
            }
        }
        for (final Font font : this.allFonts) {
            if (font.canDisplayUpTo(text, start, limit) != start) {
                this.usedFonts.add(font);
                return font.deriveFont(style, this.fontSize);
            }
        }
        Font font = this.usedFonts.get(0);
        return font.deriveFont(style, this.fontSize);
    }
    
    Entry lookupGlyph(final Font font, final int glyphCode) {
        final long fontKey = this.fontCache.get(font) << 32;
        return this.glyphCache.get(fontKey | glyphCode);
    }
    
    void cacheGlyphs(final Font font, final char[] text, final int start, final int limit, final int layoutFlags) {
        final GlyphVector vector = this.layoutGlyphVector(font, text, start, limit, layoutFlags);
        Rectangle vectorBounds = null;
        final long fontKey = this.fontCache.get(font) << 32;
        final int numGlyphs = vector.getNumGlyphs();
        Rectangle dirty = null;
        boolean vectorRendered = false;
        for (int index = 0; index < numGlyphs; ++index) {
            final int glyphCode = vector.getGlyphCode(index);
            if (!this.glyphCache.containsKey(fontKey | glyphCode)) {
                if (!vectorRendered) {
                    vectorRendered = true;
                    for (int i = 0; i < numGlyphs; ++i) {
                        final Point2D pos = vector.getGlyphPosition(i);
                        pos.setLocation(pos.getX() + 2 * i, pos.getY());
                        vector.setGlyphPosition(i, pos);
                    }
                    vectorBounds = vector.getPixelBounds(this.fontRenderContext, 0.0f, 0.0f);
                    if (this.stringImage == null || vectorBounds.width > this.stringImage.getWidth() || vectorBounds.height > this.stringImage.getHeight()) {
                        final int width = Math.max(vectorBounds.width, this.stringImage.getWidth());
                        final int height = Math.max(vectorBounds.height, this.stringImage.getHeight());
                        this.allocateStringImage(width, height);
                    }
                    this.stringGraphics.clearRect(0, 0, vectorBounds.width, vectorBounds.height);
                    this.stringGraphics.drawGlyphVector(vector, -vectorBounds.x, -vectorBounds.y);
                }
                final Rectangle rect = vector.getGlyphPixelBounds(index, null, -vectorBounds.x, -vectorBounds.y);
                if (this.cachePosX + rect.width + 1 > 256) {
                    this.cachePosX = 1;
                    this.cachePosY += this.cacheLineHeight + 1;
                    this.cacheLineHeight = 0;
                }
                if (this.cachePosY + rect.height + 1 > 256) {
                    this.updateTexture(dirty);
                    dirty = null;
                    this.allocateGlyphCacheTexture();
                    final boolean b = true;
                    this.cachePosX = (b ? 1 : 0);
                    this.cachePosY = (b ? 1 : 0);
                    this.cacheLineHeight = 0;
                }
                if (rect.height > this.cacheLineHeight) {
                    this.cacheLineHeight = rect.height;
                }
                this.glyphCacheGraphics.drawImage(this.stringImage, this.cachePosX, this.cachePosY, this.cachePosX + rect.width, this.cachePosY + rect.height, rect.x, rect.y, rect.x + rect.width, rect.y + rect.height, null);
                rect.setLocation(this.cachePosX, this.cachePosY);
                final Entry entry = new Entry();
                entry.textureName = this.textureName;
                entry.width = rect.width;
                entry.height = rect.height;
                entry.u1 = rect.x / 256.0f;
                entry.v1 = rect.y / 256.0f;
                entry.u2 = (rect.x + rect.width) / 256.0f;
                entry.v2 = (rect.y + rect.height) / 256.0f;
                this.glyphCache.put(fontKey | glyphCode, entry);
                if (dirty == null) {
                    dirty = new Rectangle(this.cachePosX, this.cachePosY, rect.width, rect.height);
                }
                else {
                    dirty.add(rect);
                }
                this.cachePosX += rect.width + 1;
            }
        }
        this.updateTexture(dirty);
    }
    
    private void updateTexture(final Rectangle dirty) {
        if (dirty != null) {
            this.updateImageBuffer(dirty.x, dirty.y, dirty.width, dirty.height);
            GL11.glBindTexture(3553, this.textureName);
            GL11.glTexSubImage2D(3553, 0, dirty.x, dirty.y, dirty.width, dirty.height, 6408, 5121, this.imageBuffer);
        }
    }
    
    private void allocateStringImage(final int width, final int height) {
        this.stringImage = new BufferedImage(width, height, 2);
        this.stringGraphics = this.stringImage.createGraphics();
        this.setRenderingHints();
        this.stringGraphics.setBackground(GlyphCache.BACK_COLOR);
        this.stringGraphics.setPaint(Color.WHITE);
    }
    
    private void setRenderingHints() {
        this.stringGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, this.antiAliasEnabled ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
        this.stringGraphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, this.antiAliasEnabled ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        this.stringGraphics.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
    }
    
    private void allocateGlyphCacheTexture() {
        this.glyphCacheGraphics.clearRect(0, 0, 256, 256);
        this.singleIntBuffer.clear();
        GL11.glGenTextures(this.singleIntBuffer);
        this.textureName = this.singleIntBuffer.get(0);
        this.updateImageBuffer(0, 0, 256, 256);
        GL11.glBindTexture(3553, this.textureName);
        GL11.glTexImage2D(3553, 0, 32828, 256, 256, 0, 6408, 5121, this.imageBuffer);
        GL11.glTexParameteri(3553, 10241, 9728);
        GL11.glTexParameteri(3553, 10240, 9728);
    }
    
    private void updateImageBuffer(final int x, final int y, final int width, final int height) {
        this.glyphCacheImage.getRGB(x, y, width, height, this.imageData, 0, width);
        for (int i = 0; i < width * height; ++i) {
            final int color = this.imageData[i];
            this.imageData[i] = (color << 8 | color >>> 24);
        }
        this.imageBuffer.clear();
        this.imageBuffer.put(this.imageData);
        this.imageBuffer.flip();
    }
    
    static {
        GlyphCache.BACK_COLOR = new Color(255, 255, 255, 0);
    }
    
    static class Entry
    {
        public int textureName;
        public int width;
        public int height;
        public float u1;
        public float v1;
        public float u2;
        public float v2;
    }
}

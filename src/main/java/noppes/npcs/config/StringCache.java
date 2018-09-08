// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.config;

import java.awt.Point;
import java.awt.font.GlyphVector;
import java.awt.font.FontRenderContext;
import java.text.Bidi;
import java.util.List;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.ArrayList;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;
import net.minecraft.util.ResourceLocation;
import java.awt.Font;
import net.minecraft.client.Minecraft;
import java.util.WeakHashMap;

public class StringCache
{
    private static final int BASELINE_OFFSET = 7;
    private static final int UNDERLINE_OFFSET = 1;
    private static final int UNDERLINE_THICKNESS = 2;
    private static final int STRIKETHROUGH_OFFSET = -6;
    private static final int STRIKETHROUGH_THICKNESS = 2;
    private GlyphCache glyphCache;
    private int[] colorTable;
    private WeakHashMap<Key, Entry> stringCache;
    private WeakHashMap<String, Key> weakRefCache;
    private Key lookupKey;
    private Glyph[][] digitGlyphs;
    private boolean digitGlyphsReady;
    private boolean antiAliasEnabled;
    private Thread mainThread;
    public int fontHeight;
    
    public StringCache() {
        this.stringCache = new WeakHashMap<Key, Entry>();
        this.weakRefCache = new WeakHashMap<String, Key>();
        this.lookupKey = new Key();
        this.digitGlyphs = new Glyph[4][];
        this.digitGlyphsReady = false;
        this.antiAliasEnabled = false;
        this.mainThread = Thread.currentThread();
        this.glyphCache = new GlyphCache();
        this.colorTable = new int[32];
        for (int i = 0; i < 32; ++i) {
            final int j = (i >> 3 & 0x1) * 85;
            int k = (i >> 2 & 0x1) * 170 + j;
            int l = (i >> 1 & 0x1) * 170 + j;
            int i2 = (i >> 0 & 0x1) * 170 + j;
            if (i == 6) {
                k += 85;
            }
            if (Minecraft.getMinecraft().gameSettings.anaglyph) {
                final int j2 = (k * 30 + l * 59 + i2 * 11) / 100;
                final int k2 = (k * 30 + l * 70) / 100;
                final int l2 = (k * 30 + i2 * 70) / 100;
                k = j2;
                l = k2;
                i2 = l2;
            }
            if (i >= 16) {
                k /= 4;
                l /= 4;
                i2 /= 4;
            }
            this.colorTable[i] = ((k & 0xFF) << 16 | (l & 0xFF) << 8 | (i2 & 0xFF));
        }
        this.cacheDightGlyphs();
    }
    
    public void setDefaultFont(final String fontName, final int fontSize, final boolean antiAlias) {
        this.glyphCache.setDefaultFont(fontName, fontSize, antiAlias);
        this.antiAliasEnabled = antiAlias;
        this.weakRefCache.clear();
        this.stringCache.clear();
        this.cacheDightGlyphs();
        this.updateHeight();
    }
    
    public Font usedFont() {
        return this.glyphCache.usedFonts.get(0);
    }
    
    public void setCustomFont(final ResourceLocation resource, final int fontSize, final boolean antiAlias) throws Exception {
        this.glyphCache.setCustomFont(resource, fontSize, antiAlias);
        this.antiAliasEnabled = antiAlias;
        this.weakRefCache.clear();
        this.stringCache.clear();
        this.cacheDightGlyphs();
        this.updateHeight();
    }
    
    public void updateHeight() {
        int height = 0;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        for (final Glyph g : this.cacheString("AaBbCcDdEeHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz").glyphs) {
            if (g.texture.height > height) {
                height = g.texture.height;
            }
            if (g.y < minY) {
                minY = g.y;
            }
            if (g.y > maxY) {
                maxY = g.y;
            }
        }
        this.fontHeight = (int)((maxY + height) / 2.0f - minY / 2.0f);
    }
    
    private void cacheDightGlyphs() {
        this.digitGlyphsReady = false;
        this.digitGlyphs[0] = this.cacheString("0123456789").glyphs;
        this.digitGlyphs[1] = this.cacheString("§l0123456789").glyphs;
        this.digitGlyphs[2] = this.cacheString("§o0123456789").glyphs;
        this.digitGlyphs[3] = this.cacheString("§l§o0123456789").glyphs;
        this.digitGlyphsReady = true;
    }
    
    public int renderString(final String str, final int startX, int startY, int initialColor, final boolean shadowFlag) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        final Entry entry = this.cacheString(str);
        startY += 7;
        if ((initialColor >> 24 & 0xFF) == 0x0) {
            initialColor -= 16777216;
        }
        int color = initialColor;
        int boundTextureName = 0;
        GL11.glTexEnvi(8960, 8704, 8448);
        GL11.glColor4f((color >> 16 & 0xFF) / 255.0f, (color >> 8 & 0xFF) / 255.0f, (color & 0xFF) / 255.0f, 1.0f);
        if (this.antiAliasEnabled) {
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
        }
        final Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.setColorRGBA(color >> 16 & 0xFF, color >> 8 & 0xFF, color & 0xFF, color >> 24 & 0xFF);
        int fontStyle = 0;
        int glyphIndex = 0;
        int colorIndex = 0;
        while (glyphIndex < entry.glyphs.length) {
            while (colorIndex < entry.colors.length && entry.glyphs[glyphIndex].stringIndex >= entry.colors[colorIndex].stringIndex) {
                color = this.applyColorCode(entry.colors[colorIndex].colorCode, initialColor, shadowFlag);
                fontStyle = entry.colors[colorIndex].fontStyle;
                ++colorIndex;
            }
            final Glyph glyph = entry.glyphs[glyphIndex];
            GlyphCache.Entry texture = glyph.texture;
            int glyphX = glyph.x;
            final char c = str.charAt(glyph.stringIndex);
            if (c >= '0' && c <= '9') {
                final int oldWidth = texture.width;
                texture = this.digitGlyphs[fontStyle][c - '0'].texture;
                final int newWidth = texture.width;
                glyphX += oldWidth - newWidth >> 1;
            }
            if (boundTextureName != texture.textureName) {
                tessellator.draw();
                tessellator.startDrawingQuads();
                tessellator.setColorRGBA(color >> 16 & 0xFF, color >> 8 & 0xFF, color & 0xFF, color >> 24 & 0xFF);
                GL11.glBindTexture(3553, texture.textureName);
                boundTextureName = texture.textureName;
            }
            final float x1 = startX + glyphX / 2.0f;
            final float x2 = startX + (glyphX + texture.width) / 2.0f;
            final float y1 = startY + glyph.y / 2.0f;
            final float y2 = startY + (glyph.y + texture.height) / 2.0f;
            tessellator.addVertexWithUV((double)x1, (double)y1, 0.0, (double)texture.u1, (double)texture.v1);
            tessellator.addVertexWithUV((double)x1, (double)y2, 0.0, (double)texture.u1, (double)texture.v2);
            tessellator.addVertexWithUV((double)x2, (double)y2, 0.0, (double)texture.u2, (double)texture.v2);
            tessellator.addVertexWithUV((double)x2, (double)y1, 0.0, (double)texture.u2, (double)texture.v1);
            ++glyphIndex;
        }
        tessellator.draw();
        if (entry.specialRender) {
            int renderStyle = 0;
            color = initialColor;
            GL11.glDisable(3553);
            tessellator.startDrawingQuads();
            tessellator.setColorRGBA(color >> 16 & 0xFF, color >> 8 & 0xFF, color & 0xFF, color >> 24 & 0xFF);
            int glyphIndex2 = 0;
            int colorIndex2 = 0;
            while (glyphIndex2 < entry.glyphs.length) {
                while (colorIndex2 < entry.colors.length && entry.glyphs[glyphIndex2].stringIndex >= entry.colors[colorIndex2].stringIndex) {
                    color = this.applyColorCode(entry.colors[colorIndex2].colorCode, initialColor, shadowFlag);
                    renderStyle = entry.colors[colorIndex2].renderStyle;
                    ++colorIndex2;
                }
                final Glyph glyph2 = entry.glyphs[glyphIndex2];
                final int glyphSpace = glyph2.advance - glyph2.texture.width;
                if ((renderStyle & 0x1) != 0x0) {
                    final float x3 = startX + (glyph2.x - glyphSpace) / 2.0f;
                    final float x4 = startX + (glyph2.x + glyph2.advance) / 2.0f;
                    final float y3 = startY + 0.5f;
                    final float y4 = startY + 1.5f;
                    tessellator.addVertex((double)x3, (double)y3, 0.0);
                    tessellator.addVertex((double)x3, (double)y4, 0.0);
                    tessellator.addVertex((double)x4, (double)y4, 0.0);
                    tessellator.addVertex((double)x4, (double)y3, 0.0);
                }
                if ((renderStyle & 0x2) != 0x0) {
                    final float x3 = startX + (glyph2.x - glyphSpace) / 2.0f;
                    final float x4 = startX + (glyph2.x + glyph2.advance) / 2.0f;
                    final float y3 = startY - 3.0f;
                    final float y4 = startY - 2.0f;
                    tessellator.addVertex((double)x3, (double)y3, 0.0);
                    tessellator.addVertex((double)x3, (double)y4, 0.0);
                    tessellator.addVertex((double)x4, (double)y4, 0.0);
                    tessellator.addVertex((double)x4, (double)y3, 0.0);
                }
                ++glyphIndex2;
            }
            tessellator.draw();
            GL11.glEnable(3553);
        }
        return entry.advance / 2;
    }
    
    public int getStringWidth(final String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        final Entry entry = this.cacheString(str);
        return entry.advance / 2;
    }
    
    private int sizeString(final String str, int width, final boolean breakAtSpaces) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        width += width;
        final Glyph[] glyphs = this.cacheString(str).glyphs;
        int wsIndex = -1;
        int advance;
        int index;
        for (advance = 0, index = 0; index < glyphs.length && advance <= width; advance += glyphs[index].advance, ++index) {
            if (breakAtSpaces) {
                final char c = str.charAt(glyphs[index].stringIndex);
                if (c == ' ') {
                    wsIndex = index;
                }
                else if (c == '\n') {
                    wsIndex = index;
                    break;
                }
            }
        }
        if (index < glyphs.length && wsIndex != -1 && wsIndex < index) {
            index = wsIndex;
        }
        return (index < glyphs.length) ? glyphs[index].stringIndex : str.length();
    }
    
    public int sizeStringToWidth(final String str, final int width) {
        return this.sizeString(str, width, true);
    }
    
    public String trimStringToWidth(String str, final int width, final boolean reverse) {
        final int length = this.sizeString(str, width, false);
        str = str.substring(0, length);
        if (reverse) {
            str = new StringBuilder(str).reverse().toString();
        }
        return str;
    }
    
    private int applyColorCode(int colorCode, int color, final boolean shadowFlag) {
        if (colorCode != -1) {
            colorCode = (shadowFlag ? (colorCode + 16) : colorCode);
            color = ((this.colorTable[colorCode] & 0xFFFFFF) | (color & 0xFF000000));
        }
        Tessellator.instance.setColorRGBA(color >> 16 & 0xFF, color >> 8 & 0xFF, color & 0xFF, color >> 24 & 0xFF);
        return color;
    }
    
    private Entry cacheString(final String str) {
        Entry entry = null;
        if (this.mainThread == Thread.currentThread()) {
            this.lookupKey.str = str;
            entry = this.stringCache.get(this.lookupKey);
        }
        if (entry == null) {
            final char[] text = str.toCharArray();
            entry = new Entry();
            final int length = this.stripColorCodes(entry, str, text);
            final List<Glyph> glyphList = new ArrayList<Glyph>();
            entry.advance = this.layoutBidiString(glyphList, text, 0, length, entry.colors);
            entry.glyphs = new Glyph[glyphList.size()];
            Arrays.sort(entry.glyphs = glyphList.toArray(entry.glyphs));
            int colorIndex = 0;
            int shift = 0;
            for (int glyphIndex = 0; glyphIndex < entry.glyphs.length; ++glyphIndex) {
                Glyph glyph;
                for (glyph = entry.glyphs[glyphIndex]; colorIndex < entry.colors.length && glyph.stringIndex + shift >= entry.colors[colorIndex].stringIndex; shift += 2, ++colorIndex) {}
                final Glyph glyph2 = glyph;
                glyph2.stringIndex += shift;
            }
            if (this.mainThread == Thread.currentThread()) {
                final Key key = new Key();
                key.str = new String(str);
                entry.keyRef = new WeakReference<Key>(key);
                this.stringCache.put(key, entry);
            }
        }
        if (this.mainThread == Thread.currentThread()) {
            final Key oldKey = entry.keyRef.get();
            if (oldKey != null) {
                this.weakRefCache.put(str, oldKey);
            }
            this.lookupKey.str = null;
        }
        return entry;
    }
    
    private int stripColorCodes(final Entry cacheEntry, final String str, final char[] text) {
        final List<ColorCode> colorList = new ArrayList<ColorCode>();
        int start = 0;
        int shift = 0;
        byte fontStyle = 0;
        byte renderStyle = 0;
        byte colorCode = -1;
        int next;
        while ((next = str.indexOf(167, start)) != -1 && next + 1 < str.length()) {
            System.arraycopy(text, next - shift + 2, text, next - shift, text.length - next - 2);
            final int code = "0123456789abcdefklmnor".indexOf(Character.toLowerCase(str.charAt(next + 1)));
            switch (code) {
                case 16: {
                    break;
                }
                case 17: {
                    fontStyle |= 0x1;
                    break;
                }
                case 18: {
                    renderStyle |= 0x2;
                    cacheEntry.specialRender = true;
                    break;
                }
                case 19: {
                    renderStyle |= 0x1;
                    cacheEntry.specialRender = true;
                    break;
                }
                case 20: {
                    fontStyle |= 0x2;
                    break;
                }
                case 21: {
                    fontStyle = 0;
                    renderStyle = 0;
                    colorCode = -1;
                    break;
                }
                default: {
                    if (code >= 0 && code <= 15) {
                        colorCode = (byte)code;
                        fontStyle = 0;
                        renderStyle = 0;
                        break;
                    }
                    break;
                }
            }
            final ColorCode entry = new ColorCode();
            entry.stringIndex = next;
            entry.stripIndex = next - shift;
            entry.colorCode = colorCode;
            entry.fontStyle = fontStyle;
            entry.renderStyle = renderStyle;
            colorList.add(entry);
            start = next + 2;
            shift += 2;
        }
        cacheEntry.colors = new ColorCode[colorList.size()];
        cacheEntry.colors = colorList.toArray(cacheEntry.colors);
        return text.length - shift;
    }
    
    private int layoutBidiString(final List<Glyph> glyphList, final char[] text, final int start, final int limit, final ColorCode[] colors) {
        int advance = 0;
        if (!Bidi.requiresBidi(text, start, limit)) {
            return this.layoutStyle(glyphList, text, start, limit, 0, advance, colors);
        }
        final Bidi bidi = new Bidi(text, start, null, 0, limit - start, -2);
        if (bidi.isRightToLeft()) {
            return this.layoutStyle(glyphList, text, start, limit, 1, advance, colors);
        }
        final int runCount = bidi.getRunCount();
        final byte[] levels = new byte[runCount];
        final Integer[] ranges = new Integer[runCount];
        for (int index = 0; index < runCount; ++index) {
            levels[index] = (byte)bidi.getRunLevel(index);
            ranges[index] = new Integer(index);
        }
        Bidi.reorderVisually(levels, 0, ranges, 0, runCount);
        for (final int logicalIndex : ranges) {
            final int layoutFlag = ((bidi.getRunLevel(logicalIndex) & 0x1) == 0x1) ? 1 : 0;
            advance = this.layoutStyle(glyphList, text, start + bidi.getRunStart(logicalIndex), start + bidi.getRunLimit(logicalIndex), layoutFlag, advance, colors);
        }
        return advance;
    }
    
    private int layoutStyle(final List<Glyph> glyphList, final char[] text, int start, final int limit, final int layoutFlags, int advance, final ColorCode[] colors) {
        int currentFontStyle = 0;
        int colorIndex = Arrays.binarySearch(colors, start);
        if (colorIndex < 0) {
            colorIndex = -colorIndex - 2;
        }
        while (start < limit) {
            int next = limit;
            while (colorIndex >= 0 && colorIndex < colors.length - 1 && colors[colorIndex].stripIndex == colors[colorIndex + 1].stripIndex) {
                ++colorIndex;
            }
            if (colorIndex >= 0 && colorIndex < colors.length) {
                currentFontStyle = colors[colorIndex].fontStyle;
            }
            while (++colorIndex < colors.length) {
                if (colors[colorIndex].fontStyle != currentFontStyle) {
                    next = colors[colorIndex].stripIndex;
                    break;
                }
            }
            advance = this.layoutString(glyphList, text, start, next, layoutFlags, advance, currentFontStyle);
            start = next;
        }
        return advance;
    }
    
    private int layoutString(final List<Glyph> glyphList, final char[] text, int start, final int limit, final int layoutFlags, int advance, final int style) {
        if (this.digitGlyphsReady) {
            for (int index = start; index < limit; ++index) {
                if (text[index] >= '0' && text[index] <= '9') {
                    text[index] = '0';
                }
            }
        }
        while (start < limit) {
            final Font font = this.glyphCache.lookupFont(text, start, limit, style);
            int next = font.canDisplayUpTo(text, start, limit);
            if (next == -1) {
                next = limit;
            }
            if (next == start) {
                ++next;
            }
            advance = this.layoutFont(glyphList, text, start, next, layoutFlags, advance, font);
            start = next;
        }
        return advance;
    }
    
    private int layoutFont(final List<Glyph> glyphList, final char[] text, final int start, final int limit, final int layoutFlags, int advance, final Font font) {
        if (this.mainThread == Thread.currentThread()) {
            this.glyphCache.cacheGlyphs(font, text, start, limit, layoutFlags);
        }
        final GlyphVector vector = this.glyphCache.layoutGlyphVector(font, text, start, limit, layoutFlags);
        Glyph glyph = null;
        final int numGlyphs = vector.getNumGlyphs();
        for (int index = 0; index < numGlyphs; ++index) {
            final Point position = vector.getGlyphPixelBounds(index, null, advance, 0.0f).getLocation();
            if (glyph != null) {
                glyph.advance = position.x - glyph.x;
            }
            glyph = new Glyph();
            glyph.stringIndex = start + vector.getGlyphCharIndex(index);
            glyph.texture = this.glyphCache.lookupGlyph(font, vector.getGlyphCode(index));
            glyph.x = position.x;
            glyph.y = position.y;
            glyphList.add(glyph);
        }
        advance += (int)vector.getGlyphPosition(numGlyphs).getX();
        if (glyph != null) {
            glyph.advance = advance - glyph.x;
        }
        return advance;
    }
    
    private static class Key
    {
        public String str;
        
        @Override
        public int hashCode() {
            int code = 0;
            final int length = this.str.length();
            boolean colorCode = false;
            for (int index = 0; index < length; ++index) {
                char c = this.str.charAt(index);
                if (c >= '0' && c <= '9' && !colorCode) {
                    c = '0';
                }
                code = code * 31 + c;
                colorCode = (c == '�');
            }
            return code;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (o == null) {
                return false;
            }
            final String other = o.toString();
            final int length = this.str.length();
            if (length != other.length()) {
                return false;
            }
            boolean colorCode = false;
            for (int index = 0; index < length; ++index) {
                final char c1 = this.str.charAt(index);
                final char c2 = other.charAt(index);
                if (c1 != c2 && (c1 < '0' || c1 > '9' || c2 < '0' || c2 > '9' || colorCode)) {
                    return false;
                }
                colorCode = (c1 == '�');
            }
            return true;
        }
        
        @Override
        public String toString() {
            return this.str;
        }
    }
    
    private static class Entry
    {
        public WeakReference<Key> keyRef;
        public int advance;
        public Glyph[] glyphs;
        public ColorCode[] colors;
        public boolean specialRender;
    }
    
    private static class ColorCode implements Comparable<Integer>
    {
        public static final byte UNDERLINE = 1;
        public static final byte STRIKETHROUGH = 2;
        public int stringIndex;
        public int stripIndex;
        public byte colorCode;
        public byte fontStyle;
        public byte renderStyle;
        
        @Override
        public int compareTo(final Integer i) {
            return (this.stringIndex == i) ? 0 : ((this.stringIndex < i) ? -1 : 1);
        }
    }
    
    private static class Glyph implements Comparable<Glyph>
    {
        public int stringIndex;
        public GlyphCache.Entry texture;
        public int x;
        public int y;
        public int advance;
        
        @Override
        public int compareTo(final Glyph o) {
            return (this.stringIndex == o.stringIndex) ? 0 : ((this.stringIndex < o.stringIndex) ? -1 : 1);
        }
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.CustomNpcResourceListener;
import net.minecraft.util.StatCollector;

public class GuiNpcLabel
{
    public String label;
    public int x;
    public int y;
    public int color;
    public boolean enabled;
    public int id;
    
    public GuiNpcLabel(final int id, final Object label, final int x, final int y, final int color) {
        this.enabled = true;
        this.id = id;
        this.label = StatCollector.translateToLocal(label.toString());
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    public GuiNpcLabel(final int id, final Object label, final int x, final int y) {
        this(id, label, x, y, CustomNpcResourceListener.DefaultTextColor);
    }
    
    public void drawLabel(final GuiScreen gui, final FontRenderer fontRenderer) {
        if (this.enabled) {
            fontRenderer.drawString(this.label, this.x, this.y, this.color);
        }
    }
    
    public void center(final int width) {
        final int size = Minecraft.getMinecraft().fontRenderer.getStringWidth(this.label);
        this.x += (width - size) / 2;
    }
}

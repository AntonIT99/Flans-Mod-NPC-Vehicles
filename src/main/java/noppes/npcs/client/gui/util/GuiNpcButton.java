// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.util;

import net.minecraft.client.Minecraft;
import net.minecraft.util.StatCollector;
import net.minecraft.client.gui.GuiButton;

public class GuiNpcButton extends GuiButton
{
    protected String[] display;
    private int displayValue;
    public int id;
    
    public GuiNpcButton(final int i, final int j, final int k, final String s) {
        super(i, j, k, StatCollector.translateToLocal(s));
        this.displayValue = 0;
        this.id = i;
    }
    
    public GuiNpcButton(final int i, final int j, final int k, final String[] display, final int val) {
        this(i, j, k, display[val]);
        this.display = display;
        this.displayValue = val;
    }
    
    public GuiNpcButton(final int i, final int j, final int k, final int l, final int m, final String string) {
        super(i, j, k, l, m, StatCollector.translateToLocal(string));
        this.displayValue = 0;
        this.id = i;
    }
    
    public GuiNpcButton(final int i, final int j, final int k, final int l, final int m, final String[] display, final int val) {
        this(i, j, k, l, m, (display.length == 0) ? "" : display[val % display.length]);
        this.display = display;
        this.displayValue = ((display.length == 0) ? 0 : (val % display.length));
    }
    
    public void setDisplayText(final String text) {
        this.displayString = StatCollector.translateToLocal(text);
    }
    
    public int getValue() {
        return this.displayValue;
    }
    
    public void setEnabled(final boolean bo) {
        this.enabled = bo;
    }
    
    public void setVisible(final boolean b) {
        this.visible = b;
    }
    
    public boolean getVisible() {
        return this.visible;
    }
    
    public void setDisplay(final int value) {
        this.displayValue = value;
        this.setDisplayText(this.display[value]);
    }
    
    public void setTextColor(final int color) {
        this.packedFGColour = color;
    }
    
    public boolean mousePressed(final Minecraft minecraft, final int i, final int j) {
        final boolean bo = super.mousePressed(minecraft, i, j);
        if (bo && this.display != null && this.display.length != 0) {
            this.displayValue = (this.displayValue + 1) % this.display.length;
            this.setDisplayText(this.display[this.displayValue]);
        }
        return bo;
    }
    
    public int getWidth() {
        return this.width;
    }
}

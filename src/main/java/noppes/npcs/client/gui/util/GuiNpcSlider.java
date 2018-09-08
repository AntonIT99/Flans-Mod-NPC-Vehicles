// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.util;

import org.lwjgl.opengl.GL11;
import org.lwjgl.input.Mouse;
import net.minecraft.client.Minecraft;
import noppes.npcs.NoppesStringUtils;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiButton;

public class GuiNpcSlider extends GuiButton
{
    private ISliderListener listener;
    public int id;
    public float sliderValue;
    public boolean dragging;
    
    public GuiNpcSlider(final GuiScreen parent, final int id, final int xPos, final int yPos, final String displayString, final float sliderValue) {
        super(id, xPos, yPos, 150, 20, NoppesStringUtils.translate(displayString));
        this.sliderValue = 1.0f;
        this.id = id;
        this.sliderValue = sliderValue;
        if (parent instanceof ISliderListener) {
            this.listener = (ISliderListener)parent;
        }
    }
    
    public GuiNpcSlider(final GuiScreen parent, final int id, final int xPos, final int yPos, final float sliderValue) {
        this(parent, id, xPos, yPos, "", sliderValue);
        if (this.listener != null) {
            this.listener.mouseDragged(this);
        }
    }
    
    public GuiNpcSlider(final GuiScreen parent, final int id, final int xPos, final int yPos, final int width, final int height, final float sliderValue) {
        this(parent, id, xPos, yPos, "", sliderValue);
        this.width = width;
        this.height = height;
        if (this.listener != null) {
            this.listener.mouseDragged(this);
        }
    }
    
    public void mouseDragged(final Minecraft mc, final int par2, final int par3) {
        if (!this.visible) {
            return;
        }
        mc.getTextureManager().bindTexture(GuiNpcSlider.buttonTextures);
        if (this.dragging) {
            this.sliderValue = (par2 - (this.xPosition + 4)) / (this.width - 8);
            if (this.sliderValue < 0.0f) {
                this.sliderValue = 0.0f;
            }
            if (this.sliderValue > 1.0f) {
                this.sliderValue = 1.0f;
            }
            if (this.listener != null) {
                this.listener.mouseDragged(this);
            }
            if (!Mouse.isButtonDown(0)) {
                this.func_146111_b(0, 0);
            }
        }
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.drawTexturedModalRect(this.xPosition + (int)(this.sliderValue * (this.width - 8)), this.yPosition, 0, 66, 4, 20);
        this.drawTexturedModalRect(this.xPosition + (int)(this.sliderValue * (this.width - 8)) + 4, this.yPosition, 196, 66, 4, 20);
    }
    
    public String getDisplayString() {
        return this.displayString;
    }
    
    public void setString(final String str) {
        this.displayString = NoppesStringUtils.translate(str);
    }
    
    public boolean mousePressed(final Minecraft par1Minecraft, final int par2, final int par3) {
        if (this.enabled && this.visible && par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height) {
            this.sliderValue = (par2 - (this.xPosition + 4)) / (this.width - 8);
            if (this.sliderValue < 0.0f) {
                this.sliderValue = 0.0f;
            }
            if (this.sliderValue > 1.0f) {
                this.sliderValue = 1.0f;
            }
            if (this.listener != null) {
                this.listener.mousePressed(this);
            }
            return this.dragging = true;
        }
        return false;
    }
    
    public void func_146111_b(final int par1, final int par2) {
        this.dragging = false;
        if (this.listener != null) {
            this.listener.mouseReleased(this);
        }
    }
    
    public int getHoverState(final boolean par1) {
        return 0;
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.util;

import net.minecraft.client.gui.FontRenderer;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.Minecraft;
import net.minecraft.util.StatCollector;
import net.minecraft.util.ResourceLocation;

public class GuiMenuTopButton extends GuiNpcButton
{
    public static final ResourceLocation resource;
    protected int height;
    public boolean active;
    public boolean hover;
    public boolean rotated;
    public IButtonListener listener;
    
    public GuiMenuTopButton(final int i, final int j, final int k, final String s) {
        super(i, j, k, StatCollector.translateToLocal(s));
        this.hover = false;
        this.rotated = false;
        this.active = false;
        this.width = Minecraft.getMinecraft().fontRenderer.getStringWidth(this.displayString) + 12;
        this.height = 20;
    }
    
    public GuiMenuTopButton(final int i, final GuiButton parent, final String s) {
        this(i, parent.xPosition + parent.width, parent.yPosition, s);
    }
    
    public GuiMenuTopButton(final int i, final GuiButton parent, final String s, final IButtonListener listener) {
        this(i, parent, s);
        this.listener = listener;
    }
    
    public int getHoverState(final boolean flag) {
        byte byte0 = 1;
        if (this.active) {
            byte0 = 0;
        }
        else if (flag) {
            byte0 = 2;
        }
        return byte0;
    }
    
    public void drawButton(final Minecraft minecraft, final int i, final int j) {
        if (!this.getVisible()) {
            return;
        }
        GL11.glPushMatrix();
        minecraft.renderEngine.bindTexture(GuiMenuTopButton.resource);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        final int height = this.height - (this.active ? 0 : 2);
        this.hover = (i >= this.xPosition && j >= this.yPosition && i < this.xPosition + this.getWidth() && j < this.yPosition + height);
        final int k = this.getHoverState(this.hover);
        this.drawTexturedModalRect(this.xPosition, this.yPosition, 0, k * 20, this.getWidth() / 2, height);
        this.drawTexturedModalRect(this.xPosition + this.getWidth() / 2, this.yPosition, 200 - this.getWidth() / 2, k * 20, this.getWidth() / 2, height);
        this.mouseDragged(minecraft, i, j);
        final FontRenderer fontrenderer = minecraft.fontRenderer;
        if (this.rotated) {
            GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
        }
        if (this.active) {
            this.drawCenteredString(fontrenderer, this.displayString, this.xPosition + this.getWidth() / 2, this.yPosition + (height - 8) / 2, 16777120);
        }
        else if (this.hover) {
            this.drawCenteredString(fontrenderer, this.displayString, this.xPosition + this.getWidth() / 2, this.yPosition + (height - 8) / 2, 16777120);
        }
        else {
            this.drawCenteredString(fontrenderer, this.displayString, this.xPosition + this.getWidth() / 2, this.yPosition + (height - 8) / 2, 14737632);
        }
        GL11.glPopMatrix();
    }
    
    protected void mouseDragged(final Minecraft minecraft, final int i, final int j) {
    }
    
    public void mouseReleased(final int i, final int j) {
    }
    
    @Override
    public boolean mousePressed(final Minecraft minecraft, final int i, final int j) {
        final boolean bo = !this.active && this.getVisible() && this.hover;
        if (bo && this.listener != null) {
            this.listener.actionPerformed(this);
            return false;
        }
        return bo;
    }
    
    static {
        resource = new ResourceLocation("customnpcs", "textures/gui/menutopbutton.png");
    }
}

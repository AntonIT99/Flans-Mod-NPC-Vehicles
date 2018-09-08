// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.util;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class GuiButtonBiDirectional extends GuiNpcButton
{
    public static final ResourceLocation resource;
    
    public GuiButtonBiDirectional(final int id, final int x, final int y, final int width, final int height, final String[] arr, final int current) {
        super(id, x, y, width, height, arr, current);
    }
    
    public void drawButton(final Minecraft mc, final int mouseX, final int mouseY) {
        if (!this.visible) {
            return;
        }
        final boolean hover = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
        final boolean hoverL = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + 11 && mouseY < this.yPosition + this.height;
        final boolean hoverR = !hoverL && mouseX >= this.xPosition + this.width - 11 && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        mc.getTextureManager().bindTexture(GuiButtonBiDirectional.resource);
        this.drawTexturedModalRect(this.xPosition, this.yPosition, 0, hoverL ? 40 : 20, 11, 20);
        this.drawTexturedModalRect(this.xPosition + this.width - 11, this.yPosition, 11, hoverR ? 40 : 20, 11, 20);
        int l = 16777215;
        if (this.packedFGColour != 0) {
            l = this.packedFGColour;
        }
        else if (!this.enabled) {
            l = 10526880;
        }
        else if (hover) {
            l = 16777120;
        }
        String text = "";
        final float maxWidth = this.width - 36;
        if (mc.fontRenderer.getStringWidth(this.displayString) > maxWidth) {
            for (int h = 0; h < this.displayString.length(); ++h) {
                final char c = this.displayString.charAt(h);
                text += c;
                if (mc.fontRenderer.getStringWidth(text) > maxWidth) {
                    break;
                }
            }
            text += "...";
        }
        else {
            text = this.displayString;
        }
        if (hover) {
            text = "§n" + text;
        }
        this.drawCenteredString(mc.fontRenderer, text, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, l);
    }
    
    @Override
    public boolean mousePressed(final Minecraft minecraft, final int mouseX, final int mouseY) {
        int value = this.getValue();
        final boolean bo = super.mousePressed(minecraft, mouseX, mouseY);
        if (bo && this.display != null && this.display.length != 0) {
            final boolean hoverL = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + 11 && mouseY < this.yPosition + this.height;
            final boolean hoverR = !hoverL && mouseX >= this.xPosition + 11 && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
            if (hoverR) {
                value = (value + 1) % this.display.length;
            }
            if (hoverL) {
                if (value <= 0) {
                    value = this.display.length;
                }
                --value;
            }
            this.setDisplay(value);
        }
        return bo;
    }
    
    static {
        resource = new ResourceLocation("customnpcs:textures/gui/arrowbuttons.png");
    }
}

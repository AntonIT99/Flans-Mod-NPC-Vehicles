// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.util;

import java.util.List;
import java.util.ArrayList;
import org.lwjgl.opengl.GL11;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.GuiScreen;

public class GuiHoverText extends GuiScreen
{
    private int x;
    private int y;
    public int id;
    protected static final ResourceLocation buttonTextures;
    private String text;
    
    public GuiHoverText(final int id, final String text, final int x, final int y) {
        this.text = text;
        this.id = id;
        this.x = x;
        this.y = y;
    }
    
    public void drawScreen(final int par1, final int par2, final float par3) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiHoverText.buttonTextures);
        this.drawTexturedModalRect(this.x, this.y, 0, 0, 12, 12);
        if (this.inArea(this.x, this.y, 12, 12, par1, par2)) {
            final List<String> lines = new ArrayList<String>();
            lines.add(this.text);
            this.drawHoveringText((List)lines, this.x + 8, this.y + 6, this.fontRendererObj);
            GL11.glDisable(2896);
        }
    }
    
    public boolean inArea(final int x, final int y, final int width, final int height, final int mouseX, final int mouseY) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
    }
    
    static {
        buttonTextures = new ResourceLocation("customnpcs:textures/gui/info.png");
    }
}

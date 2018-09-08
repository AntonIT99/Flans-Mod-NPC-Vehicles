// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.util;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class GuiButtonNextPage extends GuiNpcButton
{
    private final boolean field_146151_o;
    private static final String __OBFID = "CL_00000745";
    private static final ResourceLocation field_110405_a;
    
    public GuiButtonNextPage(final int par1, final int par2, final int par3, final boolean par4) {
        super(par1, par2, par3, 23, 13, "");
        this.field_146151_o = par4;
    }
    
    public void drawButton(final Minecraft p_146112_1_, final int p_146112_2_, final int p_146112_3_) {
        if (this.visible) {
            final boolean flag = p_146112_2_ >= this.xPosition && p_146112_3_ >= this.yPosition && p_146112_2_ < this.xPosition + this.width && p_146112_3_ < this.yPosition + this.height;
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            p_146112_1_.getTextureManager().bindTexture(GuiButtonNextPage.field_110405_a);
            int k = 0;
            int l = 192;
            if (flag) {
                k += 23;
            }
            if (!this.field_146151_o) {
                l += 13;
            }
            this.drawTexturedModalRect(this.xPosition, this.yPosition, k, l, 23, 13);
        }
    }
    
    static {
        field_110405_a = new ResourceLocation("textures/gui/book.png");
    }
}

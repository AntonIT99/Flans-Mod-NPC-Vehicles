// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.model;

import java.awt.image.BufferedImage;
import net.minecraft.client.resources.IResource;
import java.io.InputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.ModelPartData;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.GuiModelInterface;

public class GuiModelColor extends GuiModelInterface implements ITextfieldListener
{
    private GuiScreen parent;
    private static final ResourceLocation color;
    private int colorX;
    private int colorY;
    private GuiNpcTextField textfield;
    private ModelPartData data;
    
    public GuiModelColor(final GuiScreen parent, final ModelPartData data, final EntityCustomNpc npc) {
        super(npc);
        this.parent = parent;
        this.data = data;
        this.xOffset = 60;
        this.ySize = 230;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.colorX = this.guiLeft + 4;
        this.colorY = this.guiTop + 50;
        this.addTextField(this.textfield = new GuiNpcTextField(0, this, this.guiLeft + 25, this.guiTop + 20, 70, 20, this.data.getColor()));
        this.textfield.setTextColor(this.data.color);
    }
    
    @Override
    public void keyTyped(final char c, final int i) {
        final String prev = this.textfield.getText();
        super.keyTyped(c, i);
        final String newText = this.textfield.getText();
        if (newText.equals(prev)) {
            return;
        }
        try {
            final int color = Integer.parseInt(this.textfield.getText(), 16);
            this.data.color = color;
            this.textfield.setTextColor(color);
        }
        catch (NumberFormatException e) {
            this.textfield.setText(prev);
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton btn) {
        super.actionPerformed(btn);
    }
    
    @Override
    public void close() {
        this.mc.displayGuiScreen(this.parent);
    }
    
    @Override
    public void drawScreen(final int par1, final int par2, final float par3) {
        super.drawScreen(par1, par2, par3);
        this.mc.getTextureManager().bindTexture(GuiModelColor.color);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.drawTexturedModalRect(this.colorX, this.colorY, 0, 0, 120, 120);
    }
    
    @Override
    public void mouseClicked(final int i, final int j, final int k) {
        super.mouseClicked(i, j, k);
        if (i < this.colorX || i > this.colorX + 120 || j < this.colorY || j > this.colorY + 120) {
            return;
        }
        InputStream stream = null;
        try {
            final IResource resource = this.mc.getResourceManager().getResource(GuiModelColor.color);
            final BufferedImage bufferedimage = ImageIO.read(stream = resource.getInputStream());
            final int color = bufferedimage.getRGB((i - this.guiLeft - 4) * 4, (j - this.guiTop - 50) * 4) & 0xFFFFFF;
            if (color != 0) {
                this.data.color = color;
                this.textfield.setTextColor(color);
                this.textfield.setText(this.data.getColor());
            }
        }
        catch (IOException e) {}
        finally {
            if (stream != null) {
                try {
                    stream.close();
                }
                catch (IOException ex) {}
            }
        }
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textfield) {
        int color = 0;
        try {
            color = Integer.parseInt(textfield.getText(), 16);
        }
        catch (NumberFormatException e) {
            color = 0;
        }
        textfield.setTextColor(this.data.color = color);
    }
    
    static {
        color = new ResourceLocation("customnpcs:textures/gui/color.png");
    }
}

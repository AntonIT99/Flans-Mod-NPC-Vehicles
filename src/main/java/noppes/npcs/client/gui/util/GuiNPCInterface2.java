// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.util;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.util.ResourceLocation;

public abstract class GuiNPCInterface2 extends GuiNPCInterface
{
    private ResourceLocation background;
    private GuiNpcMenu menu;
    
    public GuiNPCInterface2(final EntityNPCInterface npc) {
        this(npc, -1);
    }
    
    public GuiNPCInterface2(final EntityNPCInterface npc, final int activeMenu) {
        super(npc);
        this.background = new ResourceLocation("customnpcs:textures/gui/menubg.png");
        this.xSize = 420;
        this.ySize = 200;
        this.menu = new GuiNpcMenu(this, activeMenu, npc);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.menu.initGui(this.guiLeft, this.guiTop, this.xSize);
    }
    
    @Override
    public void mouseClicked(final int i, final int j, final int k) {
        super.mouseClicked(i, j, k);
        if (!this.hasSubGui()) {
            this.menu.mouseClicked(i, j, k);
        }
    }
    
    public void delete() {
        this.npc.delete();
        this.displayGuiScreen(null);
        this.mc.setIngameFocus();
    }
    
    @Override
    public abstract void save();
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        if (this.drawDefaultBackground) {
            this.drawDefaultBackground();
        }
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(this.background);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, 200, 220);
        this.drawTexturedModalRect(this.guiLeft + this.xSize - 230, this.guiTop, 26, 0, 230, 220);
        this.menu.drawElements(this.getFontRenderer(), i, j, this.mc, f);
        final boolean bo = this.drawDefaultBackground;
        this.drawDefaultBackground = false;
        super.drawScreen(i, j, f);
        this.drawDefaultBackground = bo;
    }
}

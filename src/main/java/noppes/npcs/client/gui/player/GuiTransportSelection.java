// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.player;

import java.util.List;
import java.util.HashMap;
import java.util.Vector;
import noppes.npcs.NoppesUtilPlayer;
import noppes.npcs.constants.EnumPlayerPacket;
import net.minecraft.client.gui.GuiButton;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.util.StatCollector;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.client.gui.util.IScrollData;
import noppes.npcs.client.gui.util.ITopButtonListener;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiTransportSelection extends GuiNPCInterface implements ITopButtonListener, IScrollData
{
    private final ResourceLocation resource;
    protected int xSize;
    protected int guiLeft;
    protected int guiTop;
    private GuiCustomScroll scroll;
    
    public GuiTransportSelection(final EntityNPCInterface npc) {
        super(npc);
        this.resource = new ResourceLocation("customnpcs", "textures/gui/smallbg.png");
        this.xSize = 176;
        this.drawDefaultBackground = false;
        this.title = "";
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - 222) / 2;
        final String name = "";
        this.addLabel(new GuiNpcLabel(0, name, this.guiLeft + (this.xSize - this.fontRendererObj.getStringWidth(name)) / 2, this.guiTop + 10));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 10, this.guiTop + 192, 156, 20, StatCollector.translateToLocal("transporter.travel")));
        if (this.scroll == null) {
            this.scroll = new GuiCustomScroll(this, 0);
        }
        this.scroll.setSize(156, 165);
        this.scroll.guiLeft = this.guiLeft + 10;
        this.scroll.guiTop = this.guiTop + 20;
        this.addScroll(this.scroll);
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        this.drawDefaultBackground();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(this.resource);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, 176, 222);
        super.drawScreen(i, j, f);
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        final String sel = this.scroll.getSelected();
        if (button.id == 0 && sel != null) {
            this.close();
            NoppesUtilPlayer.sendData(EnumPlayerPacket.Transport, sel);
        }
    }
    
    @Override
    public void mouseClicked(final int i, final int j, final int k) {
        super.mouseClicked(i, j, k);
        this.scroll.mouseClicked(i, j, k);
    }
    
    @Override
    public void keyTyped(final char c, final int i) {
        if (i == 1 || this.isInventoryKey(i)) {
            this.close();
        }
    }
    
    @Override
    public void save() {
    }
    
    @Override
    public void setData(final Vector<String> list, final HashMap<String, Integer> data) {
        this.scroll.setList(list);
    }
    
    @Override
    public void setSelected(final String selected) {
    }
}

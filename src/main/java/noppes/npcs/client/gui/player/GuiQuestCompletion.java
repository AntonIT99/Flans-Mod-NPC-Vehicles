// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.player;

import noppes.npcs.NoppesUtilPlayer;
import noppes.npcs.constants.EnumPlayerPacket;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.IChatComponent;
import noppes.npcs.client.TextBlockClient;
import noppes.npcs.client.CustomNpcResourceListener;
import org.lwjgl.opengl.GL11;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.util.StatCollector;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.controllers.Quest;
import noppes.npcs.client.gui.util.ITopButtonListener;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiQuestCompletion extends GuiNPCInterface implements ITopButtonListener
{
    private Quest quest;
    private final ResourceLocation resource;
    
    public GuiQuestCompletion(final Quest quest) {
        this.resource = new ResourceLocation("customnpcs", "textures/gui/smallbg.png");
        this.xSize = 176;
        this.ySize = 222;
        this.quest = quest;
        this.drawDefaultBackground = false;
        this.title = "";
    }
    
    @Override
    public void initGui() {
        super.initGui();
        final String questTitle = this.quest.title;
        final int left = (this.xSize - this.fontRendererObj.getStringWidth(questTitle)) / 2;
        this.addLabel(new GuiNpcLabel(0, questTitle, this.guiLeft + left, this.guiTop + 4));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 38, this.guiTop + this.ySize - 24, 100, 20, StatCollector.translateToLocal("quest.complete")));
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        this.drawDefaultBackground();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(this.resource);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
        this.drawHorizontalLine(this.guiLeft + 4, this.guiLeft + 170, this.guiTop + 13, -16777216 + CustomNpcResourceListener.DefaultTextColor);
        this.drawQuestText();
        super.drawScreen(i, j, f);
    }
    
    private void drawQuestText() {
        final int xoffset = this.guiLeft + 4;
        final TextBlockClient block = new TextBlockClient(this.quest.completeText, 172, true, new Object[] { this.player });
        final int yoffset = this.guiTop + 20;
        for (int i = 0; i < block.lines.size(); ++i) {
            final String text = block.lines.get(i).getFormattedText();
            this.fontRendererObj.drawString(text, this.guiLeft + 4, this.guiTop + 16 + i * this.fontRendererObj.FONT_HEIGHT, CustomNpcResourceListener.DefaultTextColor);
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        if (guibutton.id == 0) {
            NoppesUtilPlayer.sendData(EnumPlayerPacket.QuestCompletion, this.quest.id);
            this.close();
        }
    }
    
    protected void drawGuiContainerBackgroundLayer(final float f, final int i, final int j) {
    }
    
    @Override
    public void keyTyped(final char c, final int i) {
        if (i == 1 || this.isInventoryKey(i)) {
            this.close();
        }
    }
    
    @Override
    public void save() {
        NoppesUtilPlayer.sendData(EnumPlayerPacket.QuestCompletion, this.quest.id);
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.player;

import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.client.NoppesUtil;
import net.minecraft.util.IChatComponent;
import noppes.npcs.client.TextBlockClient;
import noppes.npcs.client.CustomNpcResourceListener;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.GuiButton;
import java.util.Iterator;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiButtonNextPage;
import java.util.List;
import java.util.Vector;
import net.minecraft.client.gui.GuiScreen;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import tconstruct.client.tabs.InventoryTabQuests;
import tconstruct.client.tabs.TabRegistry;
import noppes.npcs.NoppesUtilPlayer;
import noppes.npcs.constants.EnumPlayerPacket;
import net.minecraft.client.Minecraft;
import noppes.npcs.QuestLogData;
import noppes.npcs.client.gui.util.GuiMenuSideButton;
import java.util.HashMap;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.ICustomScrollListener;
import noppes.npcs.client.gui.util.ITopButtonListener;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiQuestLog extends GuiNPCInterface implements ITopButtonListener, ICustomScrollListener, IGuiData
{
    private final ResourceLocation resource;
    private EntityPlayer player;
    private GuiCustomScroll scroll;
    private HashMap<Integer, GuiMenuSideButton> sideButtons;
    private QuestLogData data;
    private boolean noQuests;
    private boolean questDetails;
    private Minecraft mc;
    
    public GuiQuestLog(final EntityPlayer player) {
        this.resource = new ResourceLocation("customnpcs", "textures/gui/standardbg.png");
        this.sideButtons = new HashMap<Integer, GuiMenuSideButton>();
        this.data = new QuestLogData();
        this.noQuests = false;
        this.questDetails = true;
        this.mc = Minecraft.getMinecraft();
        this.player = player;
        this.xSize = 280;
        this.ySize = 180;
        NoppesUtilPlayer.sendData(EnumPlayerPacket.QuestLog, new Object[0]);
        this.drawDefaultBackground = false;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.sideButtons.clear();
        this.guiTop += 10;
        TabRegistry.addTabsToList(this.buttonList);
        TabRegistry.updateTabValues(this.guiLeft, this.guiTop, InventoryTabQuests.class);
        this.noQuests = false;
        if (this.data.categories.isEmpty()) {
            this.noQuests = true;
            return;
        }
        final List<String> categories = new ArrayList<String>();
        categories.addAll(this.data.categories.keySet());
        Collections.sort(categories, String.CASE_INSENSITIVE_ORDER);
        int i = 0;
        for (final String category : categories) {
            if (this.data.selectedCategory.isEmpty()) {
                this.data.selectedCategory = category;
            }
            this.sideButtons.put(i, new GuiMenuSideButton(i, this.guiLeft - 69, this.guiTop + 2 + i * 21, 70, 22, category));
            ++i;
        }
        this.sideButtons.get(categories.indexOf(this.data.selectedCategory)).active = true;
        if (this.scroll == null) {
            this.scroll = new GuiCustomScroll(this, 0);
        }
        this.scroll.setList(this.data.categories.get(this.data.selectedCategory));
        this.scroll.setSize(134, 174);
        this.scroll.guiLeft = this.guiLeft + 5;
        this.scroll.guiTop = this.guiTop + 15;
        this.addScroll(this.scroll);
        this.addButton(new GuiButtonNextPage(1, this.guiLeft + 286, this.guiTop + 176, true));
        this.addButton(new GuiButtonNextPage(2, this.guiLeft + 144, this.guiTop + 176, false));
        this.getButton(1).visible = (this.questDetails && this.data.hasSelectedQuest());
        this.getButton(2).visible = (!this.questDetails && this.data.hasSelectedQuest());
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        if (!(guibutton instanceof GuiButtonNextPage)) {
            return;
        }
        if (guibutton.id == 1) {
            this.questDetails = false;
            this.initGui();
        }
        if (guibutton.id == 2) {
            this.questDetails = true;
            this.initGui();
        }
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        if (this.scroll != null) {
            this.scroll.visible = !this.noQuests;
        }
        this.drawDefaultBackground();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(this.resource);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, 252, 195);
        this.drawTexturedModalRect(this.guiLeft + 252, this.guiTop, 188, 0, 67, 195);
        super.drawScreen(i, j, f);
        if (this.noQuests) {
            this.mc.fontRenderer.drawString(StatCollector.translateToLocal("quest.noquests"), this.guiLeft + 84, this.guiTop + 80, CustomNpcResourceListener.DefaultTextColor);
            return;
        }
        for (final GuiMenuSideButton button : this.sideButtons.values().toArray(new GuiMenuSideButton[this.sideButtons.size()])) {
            button.drawButton(this.mc, i, j);
        }
        this.mc.fontRenderer.drawString(this.data.selectedCategory, this.guiLeft + 5, this.guiTop + 5, CustomNpcResourceListener.DefaultTextColor);
        if (!this.data.hasSelectedQuest()) {
            return;
        }
        if (this.questDetails) {
            this.drawProgress();
            final String title = StatCollector.translateToLocal("gui.text");
            this.mc.fontRenderer.drawString(title, this.guiLeft + 284 - this.mc.fontRenderer.getStringWidth(title), this.guiTop + 179, CustomNpcResourceListener.DefaultTextColor);
        }
        else {
            this.drawQuestText();
            final String title = StatCollector.translateToLocal("quest.objectives");
            this.mc.fontRenderer.drawString(title, this.guiLeft + 168, this.guiTop + 179, CustomNpcResourceListener.DefaultTextColor);
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.guiLeft + 148), (float)this.guiTop, 0.0f);
        GL11.glScalef(1.24f, 1.24f, 1.24f);
        this.fontRendererObj.drawString(this.data.selectedQuest, (130 - this.fontRendererObj.getStringWidth(this.data.selectedQuest)) / 2, 4, CustomNpcResourceListener.DefaultTextColor);
        GL11.glPopMatrix();
        this.drawHorizontalLine(this.guiLeft + 142, this.guiLeft + 312, this.guiTop + 17, -16777216 + CustomNpcResourceListener.DefaultTextColor);
    }
    
    private void drawQuestText() {
        final TextBlockClient block = new TextBlockClient(this.data.getQuestText(), 174, true, new Object[] { this.player });
        final int yoffset = this.guiTop + 5;
        for (int i = 0; i < block.lines.size(); ++i) {
            final String text = block.lines.get(i).getFormattedText();
            this.fontRendererObj.drawString(text, this.guiLeft + 142, this.guiTop + 20 + i * this.fontRendererObj.FONT_HEIGHT, CustomNpcResourceListener.DefaultTextColor);
        }
    }
    
    private void drawProgress() {
        final String complete = this.data.getComplete();
        if (complete != null && !complete.isEmpty()) {
            this.mc.fontRenderer.drawString(StatCollector.translateToLocalFormatted("quest.completewith", new Object[] { complete }), this.guiLeft + 144, this.guiTop + 105, CustomNpcResourceListener.DefaultTextColor);
        }
        int yoffset = this.guiTop + 22;
        for (String process : this.data.getQuestStatus()) {
            final int index = process.lastIndexOf(":");
            if (index > 0) {
                String name = process.substring(0, index);
                String trans = StatCollector.translateToLocal(name);
                if (!trans.equals(name)) {
                    name = trans;
                }
                trans = StatCollector.translateToLocal("entity." + name + ".name");
                if (!trans.equals("entity." + name + ".name")) {
                    name = trans;
                }
                process = name + process.substring(index);
            }
            this.mc.fontRenderer.drawString("- " + process, this.guiLeft + 144, yoffset, CustomNpcResourceListener.DefaultTextColor);
            yoffset += 10;
        }
    }
    
    protected void drawGuiContainerBackgroundLayer(final float f, final int i, final int j) {
    }
    
    @Override
    public void mouseClicked(final int i, final int j, final int k) {
        super.mouseClicked(i, j, k);
        if (k == 0) {
            if (this.scroll != null) {
                this.scroll.mouseClicked(i, j, k);
            }
            for (final GuiMenuSideButton button : new ArrayList<GuiMenuSideButton>(this.sideButtons.values())) {
                if (button.mousePressed(this.mc, i, j)) {
                    this.sideButtonPressed(button);
                }
            }
        }
    }
    
    private void sideButtonPressed(final GuiMenuSideButton button) {
        if (button.active) {
            return;
        }
        NoppesUtil.clickSound();
        this.data.selectedCategory = button.displayString;
        this.data.selectedQuest = "";
        this.initGui();
    }
    
    @Override
    public void customScrollClicked(final int i, final int j, final int k, final GuiCustomScroll scroll) {
        if (!scroll.hasSelected()) {
            return;
        }
        this.data.selectedQuest = scroll.getSelected();
        this.initGui();
    }
    
    @Override
    public void keyTyped(final char c, final int i) {
        if (i == 1 || i == this.mc.gameSettings.keyBindInventory.getKeyCode()) {
            this.mc.displayGuiScreen((GuiScreen)null);
            this.mc.setIngameFocus();
        }
    }
    
    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        final QuestLogData data = new QuestLogData();
        data.readNBT(compound);
        this.data = data;
        this.initGui();
    }
    
    @Override
    public void save() {
    }
}

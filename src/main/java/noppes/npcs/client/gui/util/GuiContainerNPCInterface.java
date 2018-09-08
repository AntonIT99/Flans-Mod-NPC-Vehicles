// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.util;

import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.RenderHelper;
import org.lwjgl.opengl.GL11;
import noppes.npcs.containers.ContainerEmpty;
import org.lwjgl.input.Mouse;
import net.minecraft.util.StatCollector;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiButton;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import net.minecraft.client.Minecraft;
import net.minecraft.inventory.Container;
import java.util.HashMap;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.inventory.GuiContainer;

public abstract class GuiContainerNPCInterface extends GuiContainer
{
    public boolean drawDefaultBackground;
    public int guiLeft;
    public int guiTop;
    public EntityClientPlayerMP player;
    public EntityNPCInterface npc;
    private HashMap<Integer, GuiNpcButton> buttons;
    private HashMap<Integer, GuiMenuTopButton> topbuttons;
    private HashMap<Integer, GuiNpcTextField> textfields;
    private HashMap<Integer, GuiNpcLabel> labels;
    private HashMap<Integer, GuiCustomScroll> scrolls;
    private HashMap<Integer, GuiNpcSlider> sliders;
    public String title;
    public boolean closeOnEsc;
    private SubGuiInterface subgui;
    public int mouseX;
    public int mouseY;
    
    public GuiContainerNPCInterface(final EntityNPCInterface npc, final Container cont) {
        super(cont);
        this.drawDefaultBackground = false;
        this.buttons = new HashMap<Integer, GuiNpcButton>();
        this.topbuttons = new HashMap<Integer, GuiMenuTopButton>();
        this.textfields = new HashMap<Integer, GuiNpcTextField>();
        this.labels = new HashMap<Integer, GuiNpcLabel>();
        this.scrolls = new HashMap<Integer, GuiCustomScroll>();
        this.sliders = new HashMap<Integer, GuiNpcSlider>();
        this.closeOnEsc = false;
        this.player = Minecraft.getMinecraft().thePlayer;
        this.npc = npc;
        this.title = "Npc Mainmenu";
    }
    
    public void initGui() {
        super.initGui();
        GuiNpcTextField.unfocus();
        this.buttonList.clear();
        this.buttons.clear();
        this.topbuttons.clear();
        this.scrolls.clear();
        this.sliders.clear();
        this.labels.clear();
        this.textfields.clear();
        Keyboard.enableRepeatEvents(true);
        if (this.subgui != null) {
            this.subgui.setWorldAndResolution(this.mc, this.width, this.height);
            this.subgui.initGui();
        }
        this.buttonList.clear();
        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
    }
    
    public ResourceLocation getResource(final String texture) {
        return new ResourceLocation("customnpcs", "textures/gui/" + texture);
    }
    
    public void updateScreen() {
        for (final GuiNpcTextField tf : new ArrayList<GuiNpcTextField>(this.textfields.values())) {
            if (tf.enabled) {
                tf.updateCursorCounter();
            }
        }
        super.updateScreen();
    }
    
    protected void mouseClicked(final int i, final int j, final int k) {
        if (this.subgui != null) {
            this.subgui.mouseClicked(i, j, k);
        }
        else {
            for (final GuiNpcTextField tf : new ArrayList<GuiNpcTextField>(this.textfields.values())) {
                if (tf.enabled) {
                    tf.mouseClicked(i, j, k);
                }
            }
            if (k == 0) {
                for (final GuiCustomScroll scroll : new ArrayList<GuiCustomScroll>(this.scrolls.values())) {
                    scroll.mouseClicked(i, j, k);
                }
            }
            this.mouseEvent(i, j, k);
            super.mouseClicked(i, j, k);
        }
    }
    
    public void mouseEvent(final int i, final int j, final int k) {
    }
    
    protected void keyTyped(final char c, final int i) {
        if (this.subgui != null) {
            this.subgui.keyTyped(c, i);
        }
        else {
            for (final GuiNpcTextField tf : new ArrayList<GuiNpcTextField>(this.textfields.values())) {
                tf.textboxKeyTyped(c, i);
            }
            if (this.closeOnEsc && (i == 1 || (i == this.mc.gameSettings.keyBindInventory.getKeyCode() && !GuiNpcTextField.isActive()))) {
                this.close();
            }
        }
    }
    
    protected void actionPerformed(final GuiButton guibutton) {
        if (this.subgui != null) {
            this.subgui.buttonEvent(guibutton);
        }
        else {
            this.buttonEvent(guibutton);
        }
    }
    
    public void buttonEvent(final GuiButton guibutton) {
    }
    
    public void close() {
        GuiNpcTextField.unfocus();
        this.save();
        this.player.closeScreen();
        this.displayGuiScreen(null);
        this.mc.setIngameFocus();
    }
    
    public void addButton(final GuiNpcButton button) {
        this.buttons.put(button.id, button);
        this.buttonList.add(button);
    }
    
    public void addTopButton(final GuiMenuTopButton button) {
        this.topbuttons.put(button.id, button);
        this.buttonList.add(button);
    }
    
    public GuiNpcButton getButton(final int i) {
        return this.buttons.get(i);
    }
    
    public void addTextField(final GuiNpcTextField tf) {
        this.textfields.put(tf.id, tf);
    }
    
    public GuiNpcTextField getTextField(final int i) {
        return this.textfields.get(i);
    }
    
    public void addLabel(final GuiNpcLabel label) {
        this.labels.put(label.id, label);
    }
    
    public GuiNpcLabel getLabel(final int i) {
        return this.labels.get(i);
    }
    
    public GuiMenuTopButton getTopButton(final int i) {
        return this.topbuttons.get(i);
    }
    
    public void addSlider(final GuiNpcSlider slider) {
        this.sliders.put(slider.id, slider);
        this.buttonList.add(slider);
    }
    
    public GuiNpcSlider getSlider(final int i) {
        return this.sliders.get(i);
    }
    
    public void addScroll(final GuiCustomScroll scroll) {
        scroll.setWorldAndResolution(this.mc, 350, 250);
        this.scrolls.put(scroll.id, scroll);
    }
    
    public GuiCustomScroll getScroll(final int id) {
        return this.scrolls.get(id);
    }
    
    protected void drawGuiContainerForegroundLayer(final int par1, final int par2) {
    }
    
    protected void drawGuiContainerBackgroundLayer(final float f, final int i, final int j) {
        this.drawCenteredString(this.fontRendererObj, StatCollector.translateToLocal(this.title), this.width / 2, this.guiTop - 8, 16777215);
        for (final GuiNpcLabel label : new ArrayList<GuiNpcLabel>(this.labels.values())) {
            label.drawLabel((GuiScreen)this, this.fontRendererObj);
        }
        for (final GuiNpcTextField tf : new ArrayList<GuiNpcTextField>(this.textfields.values())) {
            tf.drawTextBox(i, j);
        }
        for (final GuiCustomScroll scroll : new ArrayList<GuiCustomScroll>(this.scrolls.values())) {
            scroll.drawScreen(i, j, f, this.hasSubGui() ? 0 : Mouse.getDWheel());
        }
    }
    
    public abstract void save();
    
    public void drawScreen(final int i, final int j, final float f) {
        this.mouseX = i;
        this.mouseY = j;
        final Container container = this.inventorySlots;
        if (this.subgui != null) {
            this.inventorySlots = new ContainerEmpty();
        }
        super.drawScreen(i, j, f);
        this.zLevel = 0.0f;
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        if (this.subgui != null) {
            this.inventorySlots = container;
            RenderHelper.disableStandardItemLighting();
            this.subgui.drawScreen(i, j, f);
        }
    }
    
    public void drawDefaultBackground() {
        if (this.drawDefaultBackground && this.subgui == null) {
            super.drawDefaultBackground();
        }
    }
    
    public FontRenderer getFontRenderer() {
        return this.fontRendererObj;
    }
    
    public void closeSubGui(final SubGuiInterface gui) {
        this.subgui = null;
    }
    
    public boolean hasSubGui() {
        return this.subgui != null;
    }
    
    public SubGuiInterface getSubGui() {
        if (this.hasSubGui() && this.subgui.hasSubGui()) {
            return this.subgui.getSubGui();
        }
        return this.subgui;
    }
    
    public void displayGuiScreen(final GuiScreen gui) {
        this.mc.displayGuiScreen(gui);
    }
    
    public void setSubGui(final SubGuiInterface gui) {
        (this.subgui = gui).setWorldAndResolution(this.mc, this.width, this.height);
        ((GuiContainerNPCInterface)(this.subgui.parent = (GuiScreen)this)).initGui();
    }
    
    public void drawNpc(final int x, final int y) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glEnable(2903);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.guiLeft + x), (float)(this.guiTop + y), 50.0f);
        float scale = 1.0f;
        if (this.npc.height > 2.4) {
            scale = 2.0f / this.npc.height;
        }
        GL11.glScalef(-30.0f * scale, 30.0f * scale, 30.0f * scale);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        final float f2 = this.npc.renderYawOffset;
        final float f3 = this.npc.rotationYaw;
        final float f4 = this.npc.rotationPitch;
        final float f5 = this.npc.rotationYawHead;
        final float f6 = this.guiLeft + x - this.mouseX;
        final float f7 = this.guiTop + y - 50 - this.mouseY;
        GL11.glRotatef(135.0f, 0.0f, 1.0f, 0.0f);
        RenderHelper.enableStandardItemLighting();
        GL11.glRotatef(-135.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-(float)Math.atan(f7 / 40.0f) * 20.0f, 1.0f, 0.0f, 0.0f);
        this.npc.renderYawOffset = (float)Math.atan(f6 / 40.0f) * 20.0f;
        this.npc.rotationYaw = (float)Math.atan(f6 / 40.0f) * 40.0f;
        this.npc.rotationPitch = -(float)Math.atan(f7 / 40.0f) * 20.0f;
        this.npc.rotationYawHead = this.npc.rotationYaw;
        GL11.glTranslatef(0.0f, this.npc.yOffset, 0.0f);
        RenderManager.instance.playerViewY = 180.0f;
        RenderManager.instance.renderEntityWithPosYaw((Entity)this.npc, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        this.npc.renderYawOffset = f2;
        this.npc.rotationYaw = f3;
        this.npc.rotationPitch = f4;
        this.npc.rotationYawHead = f5;
        GL11.glPopMatrix();
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable(32826);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glDisable(3553);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }
}

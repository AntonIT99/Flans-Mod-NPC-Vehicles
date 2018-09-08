// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.util;

import java.net.URI;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.gui.FontRenderer;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import java.awt.Toolkit;
import org.lwjgl.opengl.Display;
import net.minecraft.client.gui.GuiButton;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import org.lwjgl.input.Keyboard;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import java.util.HashMap;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.client.entity.EntityClientPlayerMP;
import java.awt.Window;
import net.minecraft.client.gui.GuiScreen;

public abstract class GuiNPCInterface extends GuiScreen
{
    public static Window AWTWindow;
    public EntityClientPlayerMP player;
    public boolean drawDefaultBackground;
    public EntityNPCInterface npc;
    private HashMap<Integer, GuiNpcButton> buttons;
    private HashMap<Integer, GuiMenuTopButton> topbuttons;
    private HashMap<Integer, GuiMenuSideButton> sidebuttons;
    private HashMap<Integer, GuiNpcTextField> textfields;
    private HashMap<Integer, GuiNpcLabel> labels;
    private HashMap<Integer, GuiCustomScroll> scrolls;
    private HashMap<Integer, GuiNpcSlider> sliders;
    private HashMap<Integer, GuiScreen> extra;
    public String title;
    private ResourceLocation background;
    public boolean closeOnEsc;
    public int guiLeft;
    public int guiTop;
    public int xSize;
    public int ySize;
    private SubGuiInterface subgui;
    public int mouseX;
    public int mouseY;
    public float bgScale;
    
    public GuiNPCInterface(final EntityNPCInterface npc) {
        this.drawDefaultBackground = true;
        this.buttons = new HashMap<Integer, GuiNpcButton>();
        this.topbuttons = new HashMap<Integer, GuiMenuTopButton>();
        this.sidebuttons = new HashMap<Integer, GuiMenuSideButton>();
        this.textfields = new HashMap<Integer, GuiNpcTextField>();
        this.labels = new HashMap<Integer, GuiNpcLabel>();
        this.scrolls = new HashMap<Integer, GuiCustomScroll>();
        this.sliders = new HashMap<Integer, GuiNpcSlider>();
        this.extra = new HashMap<Integer, GuiScreen>();
        this.background = null;
        this.closeOnEsc = false;
        this.bgScale = 1.0f;
        this.player = Minecraft.getMinecraft().thePlayer;
        this.npc = npc;
        this.title = "";
        this.xSize = 200;
        this.ySize = 222;
    }
    
    public GuiNPCInterface() {
        this(null);
    }
    
    public void setBackground(final String texture) {
        this.background = new ResourceLocation("customnpcs", "textures/gui/" + texture);
    }
    
    public ResourceLocation getResource(final String texture) {
        return new ResourceLocation("customnpcs", "textures/gui/" + texture);
    }
    
    public void initGui() {
        super.initGui();
        GuiNpcTextField.unfocus();
        if (this.subgui != null) {
            this.subgui.setWorldAndResolution(this.mc, this.width, this.height);
            this.subgui.initGui();
        }
        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
        this.buttonList.clear();
        this.labels.clear();
        this.textfields.clear();
        this.buttons.clear();
        this.sidebuttons.clear();
        this.topbuttons.clear();
        this.scrolls.clear();
        this.sliders.clear();
        Keyboard.enableRepeatEvents(true);
    }
    
    public void updateScreen() {
        if (this.subgui != null) {
            this.subgui.updateScreen();
        }
        else {
            for (final GuiNpcTextField tf : this.textfields.values()) {
                if (tf.enabled) {
                    tf.updateCursorCounter();
                }
            }
            super.updateScreen();
        }
    }
    
    public void addExtra(final GuiHoverText gui) {
        gui.setWorldAndResolution(this.mc, 350, 250);
        this.extra.put(gui.id, gui);
    }
    
    public void mouseClicked(final int i, final int j, final int k) {
        if (GuiNPCInterface.AWTWindow != null) {
            return;
        }
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
    
    public void keyTyped(final char c, final int i) {
        if (GuiNPCInterface.AWTWindow != null) {
            return;
        }
        if (this.subgui != null) {
            this.subgui.keyTyped(c, i);
        }
        for (final GuiNpcTextField tf : this.textfields.values()) {
            tf.textboxKeyTyped(c, i);
        }
        if (this.closeOnEsc && (i == 1 || (!GuiNpcTextField.isActive() && this.isInventoryKey(i)))) {
            this.close();
        }
    }
    
    public void onGuiClosed() {
        GuiNpcTextField.unfocus();
    }
    
    public void close() {
        this.displayGuiScreen(null);
        this.mc.setIngameFocus();
        this.save();
    }
    
    public void addButton(final GuiNpcButton button) {
        this.buttons.put(button.id, button);
        this.buttonList.add(button);
    }
    
    public void addTopButton(final GuiMenuTopButton button) {
        this.topbuttons.put(button.id, button);
        this.buttonList.add(button);
    }
    
    public void addSideButton(final GuiMenuSideButton button) {
        this.sidebuttons.put(button.id, button);
        this.buttonList.add(button);
    }
    
    public GuiNpcButton getButton(final int i) {
        return this.buttons.get(i);
    }
    
    public GuiMenuSideButton getSideButton(final int i) {
        return this.sidebuttons.get(i);
    }
    
    public GuiMenuTopButton getTopButton(final int i) {
        return this.topbuttons.get(i);
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
    
    public abstract void save();
    
    public void drawScreen(final int i, final int j, final float f) {
        if (GuiNPCInterface.AWTWindow != null) {
            if (!GuiNPCInterface.AWTWindow.isVisible()) {
                GuiNPCInterface.AWTWindow.dispose();
                GuiNPCInterface.AWTWindow = null;
            }
            else if (Display.isActive()) {
                Toolkit.getDefaultToolkit().beep();
                GuiNPCInterface.AWTWindow.setVisible(true);
            }
        }
        this.mouseX = i;
        this.mouseY = j;
        if (this.drawDefaultBackground && this.subgui == null) {
            this.drawDefaultBackground();
        }
        if (this.background != null && this.mc.renderEngine != null) {
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glPushMatrix();
            GL11.glTranslatef((float)this.guiLeft, (float)this.guiTop, 0.0f);
            GL11.glScalef(this.bgScale, this.bgScale, this.bgScale);
            this.mc.renderEngine.bindTexture(this.background);
            if (this.xSize > 256) {
                this.drawTexturedModalRect(0, 0, 0, 0, 250, this.ySize);
                this.drawTexturedModalRect(250, 0, 256 - (this.xSize - 250), 0, this.xSize - 250, this.ySize);
            }
            else {
                this.drawTexturedModalRect(0, 0, 0, 0, this.xSize, this.ySize);
            }
            GL11.glPopMatrix();
        }
        this.drawCenteredString(this.fontRendererObj, this.title, this.width / 2, this.guiTop + 4, 16777215);
        for (final GuiNpcLabel label : this.labels.values()) {
            label.drawLabel(this, this.fontRendererObj);
        }
        for (final GuiNpcTextField tf : this.textfields.values()) {
            tf.drawTextBox(i, j);
        }
        for (final GuiCustomScroll scroll : this.scrolls.values()) {
            scroll.drawScreen(i, j, f, this.hasSubGui() ? 0 : Mouse.getDWheel());
        }
        for (final GuiScreen gui : this.extra.values()) {
            gui.drawScreen(i, j, f);
        }
        super.drawScreen(i, j, f);
        if (this.subgui != null) {
            this.subgui.drawScreen(i, j, f);
        }
    }
    
    public FontRenderer getFontRenderer() {
        return this.fontRendererObj;
    }
    
    public void elementClicked() {
        if (this.subgui != null) {
            this.subgui.elementClicked();
        }
    }
    
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    public void doubleClicked() {
    }
    
    public boolean isInventoryKey(final int i) {
        return i == this.mc.gameSettings.keyBindInventory.getKeyCode();
    }
    
    public void drawDefaultBackground() {
        super.drawDefaultBackground();
    }
    
    public void displayGuiScreen(final GuiScreen gui) {
        this.mc.displayGuiScreen(gui);
    }
    
    public void setSubGui(final SubGuiInterface gui) {
        (this.subgui = gui).setWorldAndResolution(this.mc, this.width, this.height);
        ((GuiNPCInterface)(this.subgui.parent = this)).initGui();
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
    
    public void openLink(final String link) {
        try {
            final Class oclass = Class.forName("java.awt.Desktop");
            final Object object = oclass.getMethod("getDesktop", (Class[])new Class[0]).invoke(null, new Object[0]);
            oclass.getMethod("browse", URI.class).invoke(object, new URI(link));
        }
        catch (Throwable t) {}
    }
}

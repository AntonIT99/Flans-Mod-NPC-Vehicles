// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.player;

import net.minecraft.command.ICommandSender;
import net.minecraft.client.entity.EntityPlayerSP;
import noppes.npcs.client.controllers.MusicController;
import noppes.npcs.client.NoppesUtil;
import noppes.npcs.NoppesUtilPlayer;
import noppes.npcs.constants.EnumPlayerPacket;
import net.minecraft.client.gui.FontRenderer;
import noppes.npcs.NoppesStringUtils;
import noppes.npcs.constants.EnumOptionType;
import noppes.npcs.controllers.DialogOption;
import org.lwjgl.input.Mouse;
import java.util.Iterator;
import net.minecraft.util.IChatComponent;
import noppes.npcs.client.ClientProxy;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.RenderHelper;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.Minecraft;
import java.util.ArrayList;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.client.TextBlockClient;
import java.util.List;
import noppes.npcs.controllers.Dialog;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiDialogInteract extends GuiNPCInterface
{
    private Dialog dialog;
    private int selected;
    private List<TextBlockClient> lines;
    private List<Integer> options;
    private int rowStart;
    private int rowTotal;
    private int dialogHeight;
    private ResourceLocation wheel;
    private ResourceLocation[] wheelparts;
    private ResourceLocation indicator;
    private boolean isGrabbed;
    private int selectedX;
    private int selectedY;
    
    public GuiDialogInteract(final EntityNPCInterface npc, final Dialog dialog) {
        super(npc);
        this.selected = 0;
        this.lines = new ArrayList<TextBlockClient>();
        this.options = new ArrayList<Integer>();
        this.rowStart = 0;
        this.rowTotal = 0;
        this.dialogHeight = 180;
        this.isGrabbed = false;
        this.selectedX = 0;
        this.selectedY = 0;
        this.appendDialog(this.dialog = dialog);
        this.ySize = 238;
        this.wheel = this.getResource("wheel.png");
        this.indicator = this.getResource("indicator.png");
        this.wheelparts = new ResourceLocation[] { this.getResource("wheel1.png"), this.getResource("wheel2.png"), this.getResource("wheel3.png"), this.getResource("wheel4.png"), this.getResource("wheel5.png"), this.getResource("wheel6.png") };
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.isGrabbed = false;
        this.grabMouse(this.dialog.showWheel);
        this.guiTop = this.height - this.ySize;
        this.calculateRowHeight();
    }
    
    public void grabMouse(final boolean grab) {
        if (grab && !this.isGrabbed) {
            Minecraft.getMinecraft().mouseHelper.grabMouseCursor();
            this.isGrabbed = true;
        }
        else if (!grab && this.isGrabbed) {
            Minecraft.getMinecraft().mouseHelper.ungrabMouseCursor();
            this.isGrabbed = false;
        }
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        if (!this.dialog.hideNPC) {
            final float l = this.guiLeft - 70;
            final float i2 = this.guiTop + this.ySize;
            GL11.glEnable(2903);
            GL11.glPushMatrix();
            GL11.glTranslatef(l, i2, 50.0f);
            float zoomed = this.npc.height;
            if (this.npc.width * 2.0f > zoomed) {
                zoomed = this.npc.width * 2.0f;
            }
            zoomed = 2.0f / zoomed * 40.0f;
            GL11.glScalef(-zoomed, zoomed, zoomed);
            GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
            final float f2 = this.npc.renderYawOffset;
            final float f3 = this.npc.rotationYaw;
            final float f4 = this.npc.rotationPitch;
            final float f5 = this.npc.rotationYawHead;
            final float f6 = l - i;
            final float f7 = i2 - 50.0f - j;
            final int rotation = this.npc.ai.orientation;
            this.npc.ai.orientation = 0;
            GL11.glRotatef(135.0f, 0.0f, 1.0f, 0.0f);
            RenderHelper.enableStandardItemLighting();
            GL11.glRotatef(-135.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-(float)Math.atan(f7 / 80.0f) * 20.0f, 1.0f, 0.0f, 0.0f);
            this.npc.renderYawOffset = 0.0f;
            this.npc.rotationYaw = (float)Math.atan(f6 / 80.0f) * 40.0f;
            this.npc.rotationPitch = -(float)Math.atan(f7 / 80.0f) * 20.0f;
            final EntityNPCInterface npc = this.npc;
            final EntityNPCInterface npc2 = this.npc;
            final float rotationYaw = this.npc.rotationYaw;
            npc2.rotationYawHead = rotationYaw;
            npc.prevRotationYawHead = rotationYaw;
            GL11.glTranslatef(0.0f, this.npc.yOffset, 0.0f);
            RenderManager.instance.playerViewY = 180.0f;
            try {
                RenderManager.instance.renderEntityWithPosYaw((Entity)this.npc, 0.0, 0.0, 0.0, 0.0f, 1.0f);
            }
            catch (Exception ex) {}
            this.npc.ai.orientation = rotation;
            this.npc.renderYawOffset = f2;
            this.npc.rotationYaw = f3;
            this.npc.rotationPitch = f4;
            final EntityNPCInterface npc3 = this.npc;
            final EntityNPCInterface npc4 = this.npc;
            final float n = f5;
            npc4.rotationYawHead = n;
            npc3.prevRotationYawHead = n;
            GL11.glPopMatrix();
            RenderHelper.disableStandardItemLighting();
            GL11.glDisable(32826);
            OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
            GL11.glDisable(3553);
            OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        }
        super.drawScreen(i, j, f);
        GL11.glEnable(3042);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glEnable(3008);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.5f, 100.065f);
        int count = 0;
        for (final TextBlockClient block : this.lines) {
            final int size = ClientProxy.Font.width(block.getName() + ": ");
            this.drawString(block.getName() + ": ", -4 - size, block.color, count);
            for (final IChatComponent line : block.lines) {
                this.drawString(line.getFormattedText(), 0, block.color, count);
                ++count;
            }
            ++count;
        }
        if (!this.options.isEmpty()) {
            if (!this.dialog.showWheel) {
                this.drawLinedOptions(j);
            }
            else {
                this.drawWheel();
            }
        }
        GL11.glPopMatrix();
    }
    
    private void drawWheel() {
        final int yoffset = this.guiTop + this.dialogHeight + 14;
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(this.wheel);
        this.drawTexturedModalRect(this.width / 2 - 31, yoffset, 0, 0, 63, 40);
        this.selectedX += Mouse.getDX();
        this.selectedY += Mouse.getDY();
        final int limit = 80;
        if (this.selectedX > limit) {
            this.selectedX = limit;
        }
        if (this.selectedX < -limit) {
            this.selectedX = -limit;
        }
        if (this.selectedY > limit) {
            this.selectedY = limit;
        }
        if (this.selectedY < -limit) {
            this.selectedY = -limit;
        }
        this.selected = 1;
        if (this.selectedY < -20) {
            ++this.selected;
        }
        if (this.selectedY > 54) {
            --this.selected;
        }
        if (this.selectedX < 0) {
            this.selected += 3;
        }
        this.mc.renderEngine.bindTexture(this.wheelparts[this.selected]);
        this.drawTexturedModalRect(this.width / 2 - 31, yoffset, 0, 0, 85, 55);
        for (final int slot : this.dialog.options.keySet()) {
            final DialogOption option = this.dialog.options.get(slot);
            if (option != null) {
                if (option.optionType == EnumOptionType.Disabled) {
                    continue;
                }
                int color = option.optionColor;
                if (slot == this.selected) {
                    color = 8622040;
                }
                if (slot == 0) {
                    this.drawString(this.fontRendererObj, option.title, this.width / 2 + 13, yoffset - 6, color);
                }
                if (slot == 1) {
                    this.drawString(this.fontRendererObj, option.title, this.width / 2 + 33, yoffset + 12, color);
                }
                if (slot == 2) {
                    this.drawString(this.fontRendererObj, option.title, this.width / 2 + 27, yoffset + 32, color);
                }
                if (slot == 3) {
                    this.drawString(this.fontRendererObj, option.title, this.width / 2 - 13 - ClientProxy.Font.width(option.title), yoffset - 6, color);
                }
                if (slot == 4) {
                    this.drawString(this.fontRendererObj, option.title, this.width / 2 - 33 - ClientProxy.Font.width(option.title), yoffset + 12, color);
                }
                if (slot != 5) {
                    continue;
                }
                this.drawString(this.fontRendererObj, option.title, this.width / 2 - 27 - ClientProxy.Font.width(option.title), yoffset + 32, color);
            }
        }
        this.mc.renderEngine.bindTexture(this.indicator);
        this.drawTexturedModalRect(this.width / 2 + this.selectedX / 4 - 2, yoffset + 16 - this.selectedY / 6, 0, 0, 8, 8);
    }
    
    private void drawLinedOptions(final int j) {
        this.drawHorizontalLine(this.guiLeft - 60, this.guiLeft + this.xSize + 120, this.guiTop + this.dialogHeight, -1);
        final int offset = this.dialogHeight + 4;
        if (j >= this.guiTop + offset) {
            final int selected = (j - (this.guiTop + offset)) / ClientProxy.Font.height();
            if (selected < this.options.size()) {
                this.selected = selected;
            }
        }
        if (this.selected >= this.options.size()) {
            this.selected = 0;
        }
        if (this.selected < 0) {
            this.selected = 0;
        }
        int count = 0;
        for (int k = 0; k < this.options.size(); ++k) {
            final int id = this.options.get(k);
            final DialogOption option = this.dialog.options.get(id);
            final int y = this.guiTop + offset + count * ClientProxy.Font.height();
            if (this.selected == k) {
                this.drawString(this.fontRendererObj, ">", this.guiLeft - 60, y, 14737632);
            }
            this.drawString(this.fontRendererObj, NoppesStringUtils.formatText(option.title, this.player, this.npc), this.guiLeft - 30, y, option.optionColor);
            ++count;
        }
    }
    
    private void drawString(final String text, final int left, final int color, final int count) {
        final int height = count - this.rowStart;
        this.drawString(this.fontRendererObj, text, this.guiLeft + left, this.guiTop + height * ClientProxy.Font.height(), color);
    }
    
    public void drawString(final FontRenderer fontRendererIn, final String text, final int x, final int y, final int color) {
        ClientProxy.Font.drawString(text, x, y, color);
    }
    
    private int getSelected() {
        if (this.selected <= 0) {
            return 0;
        }
        if (this.selected < this.options.size()) {
            return this.selected;
        }
        return this.options.size() - 1;
    }
    
    @Override
    public void keyTyped(final char c, final int i) {
        if (i == this.mc.gameSettings.keyBindForward.getKeyCode() || i == 200) {
            --this.selected;
        }
        if (i == this.mc.gameSettings.keyBindBack.getKeyCode() || i == 208) {
            ++this.selected;
        }
        if (i == 28) {
            this.handleDialogSelection();
        }
        if (this.closeOnEsc && (i == 1 || this.isInventoryKey(i))) {
            NoppesUtilPlayer.sendData(EnumPlayerPacket.Dialog, this.dialog.id, -1);
            this.closed();
            this.close();
        }
        super.keyTyped(c, i);
    }
    
    @Override
    public void mouseClicked(final int i, final int j, final int k) {
        if ((this.selected == -1 && this.options.isEmpty()) || this.selected >= 0) {
            this.handleDialogSelection();
        }
    }
    
    private void handleDialogSelection() {
        int optionId = -1;
        if (this.dialog.showWheel) {
            optionId = this.selected;
        }
        else if (!this.options.isEmpty()) {
            optionId = this.options.get(this.selected);
        }
        NoppesUtilPlayer.sendData(EnumPlayerPacket.Dialog, this.dialog.id, optionId);
        if (this.dialog == null || !this.dialog.hasOtherOptions() || this.options.isEmpty()) {
            this.close();
            this.closed();
            return;
        }
        final DialogOption option = this.dialog.options.get(optionId);
        if (option == null || option.optionType == EnumOptionType.QuitOption || option.optionType == EnumOptionType.Disabled) {
            this.close();
            this.closed();
            return;
        }
        this.lines.add(new TextBlockClient(this.player.getDisplayName(), option.title, 280, option.optionColor, new Object[] { this.player, this.npc }));
        this.calculateRowHeight();
        NoppesUtil.clickSound();
    }
    
    private void closed() {
        NoppesUtilPlayer.sendData(EnumPlayerPacket.CheckQuestCompletion, new Object[0]);
    }
    
    @Override
    public void save() {
    }
    
    public void appendDialog(final Dialog dialog) {
        this.closeOnEsc = !dialog.disableEsc;
        this.dialog = dialog;
        this.options = new ArrayList<Integer>();
        if (dialog.sound != null && !dialog.sound.isEmpty()) {
            MusicController.Instance.stopMusic();
            MusicController.Instance.playSound(dialog.sound, (float)this.npc.posX, (float)this.npc.posY, (float)this.npc.posZ);
        }
        this.lines.add(new TextBlockClient((ICommandSender)this.npc, dialog.text, 280, 14737632, new Object[] { this.player, this.npc }));
        for (final int slot : dialog.options.keySet()) {
            final DialogOption option = dialog.options.get(slot);
            if (option != null) {
                if (option.optionType == EnumOptionType.Disabled) {
                    continue;
                }
                this.options.add(slot);
            }
        }
        this.calculateRowHeight();
        this.grabMouse(dialog.showWheel);
    }
    
    private void calculateRowHeight() {
        if (this.dialog.showWheel) {
            this.dialogHeight = this.ySize - 58;
        }
        else {
            this.dialogHeight = this.ySize - 3 * ClientProxy.Font.height() - 4;
            if (this.dialog.options.size() > 3) {
                this.dialogHeight -= (this.dialog.options.size() - 3) * ClientProxy.Font.height();
            }
        }
        this.rowTotal = 0;
        for (final TextBlockClient block : this.lines) {
            this.rowTotal += block.lines.size() + 1;
        }
        final int max = this.dialogHeight / ClientProxy.Font.height();
        this.rowStart = this.rowTotal - max;
        if (this.rowStart < 0) {
            this.rowStart = 0;
        }
    }
}

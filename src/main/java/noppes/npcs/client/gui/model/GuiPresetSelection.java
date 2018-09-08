// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.model;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.RenderHelper;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.client.EntityUtil;
import noppes.npcs.entity.EntityNPCInterface;
import java.util.Iterator;
import noppes.npcs.client.gui.util.GuiNpcButton;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import noppes.npcs.client.controllers.Preset;
import java.util.Vector;
import noppes.npcs.client.controllers.PresetController;
import net.minecraft.world.World;
import net.minecraft.client.Minecraft;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.ModelData;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.client.gui.util.GuiNPCStringSlot;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiPresetSelection extends GuiNPCInterface
{
    private GuiNPCStringSlot slot;
    private GuiCreationScreen parent;
    private NBTTagCompound prevData;
    private ModelData playerdata;
    private EntityCustomNpc npc;
    
    public GuiPresetSelection(final GuiCreationScreen parent, final ModelData playerdata) {
        this.parent = parent;
        this.playerdata = playerdata;
        this.prevData = playerdata.writeToNBT();
        this.drawDefaultBackground = false;
        this.npc = new EntityCustomNpc((World)Minecraft.getMinecraft().theWorld);
        this.npc.modelData = playerdata.copy();
        PresetController.instance.load();
    }
    
    @Override
    public void initGui() {
        super.initGui();
        final Vector<String> list = new Vector<String>();
        for (final Preset preset : PresetController.instance.presets.values()) {
            list.add(preset.name);
        }
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        (this.slot = new GuiNPCStringSlot(list, this, false, 18)).registerScrollButtons(4, 5);
        this.buttonList.add(new GuiNpcButton(2, this.width / 2 - 100, this.height - 44, 98, 20, "Back"));
        this.buttonList.add(new GuiNpcButton(3, this.width / 2 + 2, this.height - 44, 98, 20, "Load"));
        this.buttonList.add(new GuiNpcButton(4, this.width / 2 - 49, this.height - 22, 98, 20, "Remove"));
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        EntityLivingBase entity = this.npc.modelData.getEntity(this.npc);
        if (entity == null) {
            entity = (EntityLivingBase)this.npc;
        }
        else {
            EntityUtil.Copy((EntityLivingBase)this.npc, entity);
        }
        final int l = this.width / 2 - 180;
        final int i2 = this.height / 2 - 90;
        GL11.glEnable(32826);
        GL11.glEnable(2903);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(l + 33), (float)(i2 + 131), 50.0f);
        GL11.glScalef(-50.0f, 50.0f, 50.0f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        final float f2 = entity.renderYawOffset;
        final float f3 = entity.rotationYaw;
        final float f4 = entity.rotationPitch;
        final float f5 = entity.rotationYawHead;
        final float f6 = l + 33 - i;
        final float f7 = i2 + 131 - 50 - j;
        GL11.glRotatef(135.0f, 0.0f, 1.0f, 0.0f);
        RenderHelper.enableStandardItemLighting();
        GL11.glRotatef(-135.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-(float)Math.atan(f7 / 40.0f) * 20.0f, 1.0f, 0.0f, 0.0f);
        entity.renderYawOffset = (float)Math.atan(f6 / 40.0f) * 20.0f;
        entity.rotationYaw = (float)Math.atan(f6 / 40.0f) * 40.0f;
        entity.rotationPitch = -(float)Math.atan(f7 / 40.0f) * 20.0f;
        entity.rotationYawHead = entity.rotationYaw;
        GL11.glTranslatef(0.0f, entity.yOffset, 0.0f);
        RenderManager.instance.playerViewY = 180.0f;
        RenderManager.instance.renderEntityWithPosYaw((Entity)entity, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        entity.renderYawOffset = f2;
        entity.rotationYaw = f3;
        entity.rotationPitch = f4;
        entity.rotationYawHead = f5;
        GL11.glPopMatrix();
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable(32826);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glDisable(3553);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        this.slot.drawScreen(i, j, f);
        super.drawScreen(i, j, f);
    }
    
    @Override
    public void elementClicked() {
        final Preset preset = PresetController.instance.getPreset(this.slot.selected);
        this.npc.modelData.readFromNBT(preset.data.writeToNBT());
    }
    
    @Override
    public void doubleClicked() {
        this.playerdata.readFromNBT(this.npc.modelData.writeToNBT());
        this.close();
    }
    
    @Override
    public void keyTyped(final char par1, final int par2) {
        if (par2 == 1) {
            this.close();
        }
    }
    
    @Override
    public void close() {
        this.mc.displayGuiScreen((GuiScreen)this.parent);
    }
    
    @Override
    public FontRenderer getFontRenderer() {
        return this.fontRendererObj;
    }
    
    @Override
    protected void actionPerformed(final GuiButton button) {
        final GuiNpcButton guibutton = (GuiNpcButton)button;
        if (guibutton.id == 2) {
            this.close();
        }
        if (guibutton.id == 3) {
            this.playerdata.readFromNBT(this.npc.modelData.writeToNBT());
            this.close();
        }
        if (guibutton.id == 4) {
            PresetController.instance.removePreset(this.slot.selected);
            final Vector<String> list = new Vector<String>();
            for (final Preset preset : PresetController.instance.presets.values()) {
                list.add(preset.name);
            }
            Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
            this.slot.setList(list);
            this.slot.selected = "";
        }
    }
    
    @Override
    public void save() {
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.model;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.entity.NPCRendererHelper;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.RenderHelper;
import org.lwjgl.opengl.GL11;
import noppes.npcs.client.EntityUtil;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.entity.EntityList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.Vector;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.ModelData;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.client.gui.util.GuiNPCStringSlot;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiEntitySelection extends GuiNPCInterface
{
    private GuiNPCStringSlot slot;
    private GuiCreationScreen parent;
    private Class<? extends EntityLivingBase> prevModel;
    private ModelData playerdata;
    private EntityCustomNpc npc;
    
    public GuiEntitySelection(final GuiCreationScreen parent, final ModelData playerdata, final EntityCustomNpc npc) {
        this.parent = parent;
        this.playerdata = playerdata;
        this.npc = npc;
        this.drawDefaultBackground = false;
        this.prevModel = playerdata.getEntityClass();
    }
    
    @Override
    public void initGui() {
        super.initGui();
        final Vector<String> list = new Vector<String>(this.parent.data.keySet());
        list.add("CustomNPC");
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        this.slot = new GuiNPCStringSlot(list, this, false, 18);
        if (this.playerdata.getEntityClass() != null) {
            this.slot.selected = (String) EntityList.classToStringMapping.get(this.playerdata.getEntityClass());
        }
        else {
            this.slot.selected = "CustomNPC";
        }
        this.slot.registerScrollButtons(4, 5);
        this.buttonList.add(new GuiNpcButton(2, this.width / 2 - 100, this.height - 44, 98, 20, "gui.back"));
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        EntityLivingBase entity = this.playerdata.getEntity(this.npc);
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
        float scale = 1.0f;
        if (entity.height > 2.4) {
            scale = 2.0f / entity.height;
        }
        GL11.glScalef(-50.0f * scale, 50.0f * scale, 50.0f * scale);
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
        try {
            RenderManager.instance.renderEntityWithPosYaw((Entity)entity, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        }
        catch (Exception e) {
            this.playerdata.setEntityClass((Class<? extends EntityLivingBase>)null);
        }
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
        try {
            this.playerdata.setEntityClass(this.parent.data.get(this.slot.selected));
            final EntityLivingBase entity = this.playerdata.getEntity(this.npc);
            if (entity != null) {
                final RendererLivingEntity render = (RendererLivingEntity)RenderManager.instance.getEntityRenderObject((Entity)entity);
                this.npc.display.texture = NPCRendererHelper.getTexture(render, (Entity)entity);
            }
            else {
                this.npc.display.texture = "customnpcs:textures/entity/humanmale/Steve.png";
            }
            this.npc.display.glowTexture = "";
            this.npc.textureLocation = null;
            this.npc.textureGlowLocation = null;
            this.npc.updateHitbox();
        }
        catch (Exception ex) {
            this.npc.display.texture = "customnpcs:textures/entity/humanmale/Steve.png";
        }
    }
    
    @Override
    public void doubleClicked() {
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
    protected void actionPerformed(final GuiButton guibutton) {
        this.close();
    }
    
    @Override
    public void save() {
    }
}

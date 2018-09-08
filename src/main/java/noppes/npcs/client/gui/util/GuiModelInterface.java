// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.util;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.client.EntityUtil;
import noppes.npcs.entity.EntityNPCInterface;
import org.lwjgl.opengl.GL11;
import org.lwjgl.input.Mouse;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.ModelData;

public class GuiModelInterface extends GuiNPCInterface
{
    public ModelData playerdata;
    private static float rotation;
    private GuiNpcButton left;
    private GuiNpcButton right;
    private GuiNpcButton zoom;
    private GuiNpcButton unzoom;
    private static float zoomed;
    public int xOffset;
    public EntityCustomNpc npc;
    private long start;
    
    public GuiModelInterface(final EntityCustomNpc npc) {
        this.xOffset = 0;
        this.start = -1L;
        this.npc = npc;
        this.playerdata = npc.modelData;
        this.xSize = 380;
        this.drawDefaultBackground = false;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addButton(this.unzoom = new GuiNpcButton(666, this.guiLeft + 148 + this.xOffset, this.guiTop + 200, 20, 20, "-"));
        this.addButton(this.zoom = new GuiNpcButton(667, this.guiLeft + 214 + this.xOffset, this.guiTop + 200, 20, 20, "+"));
        this.addButton(this.left = new GuiNpcButton(668, this.guiLeft + 170 + this.xOffset, this.guiTop + 200, 20, 20, "<"));
        this.addButton(this.right = new GuiNpcButton(669, this.guiLeft + 192 + this.xOffset, this.guiTop + 200, 20, 20, ">"));
        this.addButton(new GuiNpcButton(66, this.width - 22, 2, 20, 20, "X"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton btn) {
        if (btn.id == 66) {
            this.close();
        }
    }
    
    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    @Override
    public void drawScreen(final int par1, final int par2, final float par3) {
        if (Mouse.isButtonDown(0)) {
            if (this.left.mousePressed(this.mc, par1, par2)) {
                GuiModelInterface.rotation += par3 * 2.0f;
            }
            else if (this.right.mousePressed(this.mc, par1, par2)) {
                GuiModelInterface.rotation -= par3 * 2.0f;
            }
            else if (this.zoom.mousePressed(this.mc, par1, par2)) {
                GuiModelInterface.zoomed += par3 * 2.0f;
            }
            else if (this.unzoom.mousePressed(this.mc, par1, par2) && GuiModelInterface.zoomed > 10.0f) {
                GuiModelInterface.zoomed -= par3 * 2.0f;
            }
        }
        this.drawDefaultBackground();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        EntityLivingBase entity = this.playerdata.getEntity(this.npc);
        if (entity == null) {
            entity = (EntityLivingBase)this.npc;
        }
        EntityUtil.Copy((EntityLivingBase)this.npc, entity);
        final int l = this.guiLeft + 190 + this.xOffset;
        final int i1 = this.guiTop + 180;
        GL11.glEnable(2903);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)l, (float)i1, 60.0f);
        GL11.glScalef(-GuiModelInterface.zoomed, GuiModelInterface.zoomed, GuiModelInterface.zoomed);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        final float f2 = entity.renderYawOffset;
        final float f3 = entity.rotationYaw;
        final float f4 = entity.rotationPitch;
        final float f5 = entity.rotationYawHead;
        final float f6 = l - par1;
        final float f7 = i1 - 50 - par2;
        GL11.glRotatef(135.0f, 0.0f, 1.0f, 0.0f);
        RenderHelper.enableStandardItemLighting();
        GL11.glRotatef(-135.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-(float)Math.atan(f7 / 80.0f) * 20.0f, 1.0f, 0.0f, 0.0f);
        final EntityLivingBase entityLivingBase = entity;
        final EntityLivingBase entityLivingBase2 = entity;
        final float rotation = GuiModelInterface.rotation;
        entityLivingBase2.renderYawOffset = rotation;
        entityLivingBase.prevRenderYawOffset = rotation;
        final EntityLivingBase entityLivingBase3 = entity;
        final EntityLivingBase entityLivingBase4 = entity;
        final float n = (float)Math.atan(f6 / 80.0f) * 40.0f + GuiModelInterface.rotation;
        entityLivingBase4.rotationYaw = n;
        entityLivingBase3.prevRotationYaw = n;
        entity.rotationPitch = -(float)Math.atan(f7 / 80.0f) * 20.0f;
        final EntityLivingBase entityLivingBase5 = entity;
        final EntityLivingBase entityLivingBase6 = entity;
        final float rotationYaw = entity.rotationYaw;
        entityLivingBase6.rotationYawHead = rotationYaw;
        entityLivingBase5.prevRotationYawHead = rotationYaw;
        GL11.glTranslatef(0.0f, entity.yOffset, 0.0f);
        RenderManager.instance.playerViewY = 180.0f;
        try {
            RenderManager.instance.renderEntityWithPosYaw((Entity)entity, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        }
        catch (Exception e) {
            this.playerdata.setEntityClass((Class<? extends EntityLivingBase>)null);
        }
        final EntityLivingBase entityLivingBase7 = entity;
        final EntityLivingBase entityLivingBase8 = entity;
        final float n2 = f2;
        entityLivingBase8.renderYawOffset = n2;
        entityLivingBase7.prevRenderYawOffset = n2;
        final EntityLivingBase entityLivingBase9 = entity;
        final EntityLivingBase entityLivingBase10 = entity;
        final float n3 = f3;
        entityLivingBase10.rotationYaw = n3;
        entityLivingBase9.prevRotationYaw = n3;
        entity.rotationPitch = f4;
        final EntityLivingBase entityLivingBase11 = entity;
        final EntityLivingBase entityLivingBase12 = entity;
        final float n4 = f5;
        entityLivingBase12.rotationYawHead = n4;
        entityLivingBase11.prevRotationYawHead = n4;
        GL11.glPopMatrix();
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable(32826);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glDisable(3553);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.0f, 500.065f);
        super.drawScreen(par1, par2, par3);
        GL11.glPopMatrix();
    }
    
    @Override
    public void keyTyped(final char par1, final int par2) {
        super.keyTyped(par1, par2);
        if (par2 == 1) {
            this.close();
        }
    }
    
    @Override
    public void close() {
        this.mc.displayGuiScreen((GuiScreen)null);
        this.mc.setIngameFocus();
    }
    
    @Override
    public void save() {
    }
    
    static {
        GuiModelInterface.rotation = 0.0f;
        GuiModelInterface.zoomed = 60.0f;
    }
}

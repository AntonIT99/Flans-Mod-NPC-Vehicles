// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.RenderHelper;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.entity.EntityNPCInterface;

public class GuiNPCTextures extends GuiNpcSelectionInterface
{
    public GuiNPCTextures(final EntityNPCInterface npc, final GuiScreen parent) {
        super(npc, parent, npc.display.texture);
        this.title = "Select Texture";
        this.parent = parent;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        final int index = this.npc.display.texture.lastIndexOf("/");
        if (index > 0) {
            final String asset = this.npc.display.texture.substring(index + 1);
            if (this.npc.display.texture.equals(this.assets.getAsset(asset))) {
                this.slot.selected = asset;
            }
        }
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        final int l = this.width / 2 - 180;
        final int i2 = this.height / 2 - 90;
        GL11.glEnable(32826);
        GL11.glEnable(2903);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(l + 33), (float)(i2 + 131), 50.0f);
        final float f2 = 250.0f / this.npc.display.modelSize;
        GL11.glScalef(-f2, f2, f2);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        final float f3 = this.npc.renderYawOffset;
        final float f4 = this.npc.rotationYaw;
        final float f5 = this.npc.rotationPitch;
        final float f6 = this.npc.rotationYawHead;
        final float f7 = l + 33 - i;
        final float f8 = i2 + 131 - 50 - j;
        GL11.glRotatef(135.0f, 0.0f, 1.0f, 0.0f);
        RenderHelper.enableStandardItemLighting();
        GL11.glRotatef(-135.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-(float)Math.atan(f8 / 40.0f) * 20.0f, 1.0f, 0.0f, 0.0f);
        this.npc.renderYawOffset = (float)Math.atan(f7 / 40.0f) * 20.0f;
        this.npc.rotationYaw = (float)Math.atan(f7 / 40.0f) * 40.0f;
        this.npc.rotationPitch = -(float)Math.atan(f8 / 40.0f) * 20.0f;
        this.npc.rotationYawHead = this.npc.rotationYaw;
        this.npc.cloakUpdate();
        GL11.glTranslatef(0.0f, this.npc.yOffset, 0.0f);
        RenderManager.instance.playerViewY = 180.0f;
        RenderManager.instance.renderEntityWithPosYaw((Entity)this.npc, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        this.npc.renderYawOffset = f3;
        this.npc.rotationYaw = f4;
        this.npc.rotationPitch = f5;
        this.npc.rotationYawHead = f6;
        GL11.glPopMatrix();
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable(32826);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glDisable(3553);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        super.drawScreen(i, j, f);
    }
    
    @Override
    public void elementClicked() {
        if (this.dataTextures.contains(this.slot.selected) && this.slot.selected != null) {
            this.npc.display.texture = this.assets.getAsset(this.slot.selected);
            this.npc.textureLocation = null;
        }
    }
    
    @Override
    public void save() {
    }
    
    @Override
    public String[] getExtension() {
        return new String[] { "png" };
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GLAllocation;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class Model2DRenderer extends ModelRenderer
{
    private boolean compiled;
    private int displayList;
    private float x1;
    private float x2;
    private float y1;
    private float y2;
    private int width;
    private int height;
    private float rotationOffsetX;
    private float rotationOffsetY;
    private float scaleX;
    private float scaleY;
    private float thickness;
    
    public Model2DRenderer(final ModelBase par1ModelBase, final float x, final float y, final int width, final int height, final float textureWidth, final float textureHeight) {
        super(par1ModelBase);
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.thickness = 1.0f;
        this.width = width;
        this.height = height;
        this.textureWidth = textureWidth;
        this.textureHeight = textureHeight;
        this.x1 = x / textureWidth;
        this.y1 = y / textureHeight;
        this.x2 = (x + width) / textureWidth;
        this.y2 = (y + height) / textureHeight;
    }
    
    public Model2DRenderer(final ModelBase base, final int x, final int y, final int width, final int height) {
        this(base, x, y, width, height, width, height);
    }
    
    public void render(final float par1) {
        if (!this.showModel || this.isHidden) {
            return;
        }
        if (!this.compiled) {
            this.compileDisplayList(par1);
        }
        GL11.glPushMatrix();
        this.postRender(par1);
        GL11.glCallList(this.displayList);
        GL11.glPopMatrix();
    }
    
    public void setRotationOffset(final float x, final float y) {
        this.rotationOffsetX = x;
        this.rotationOffsetY = y;
    }
    
    public void setScale(final float scale) {
        this.scaleX = scale;
        this.scaleY = scale;
    }
    
    public void setScale(final float x, final float y) {
        this.scaleX = x;
        this.scaleY = y;
    }
    
    public void setThickness(final float thickness) {
        this.thickness = thickness;
    }
    
    @SideOnly(Side.CLIENT)
    private void compileDisplayList(final float par1) {
        GL11.glNewList(this.displayList = GLAllocation.generateDisplayLists(1), 4864);
        GL11.glScalef(this.scaleX * this.width / this.height, this.scaleY, this.thickness);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        if (this.mirror) {
            GL11.glTranslatef(0.0f, 0.0f, -1.0f * par1);
            GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        }
        GL11.glTranslated((double)(this.rotationOffsetX * par1), (double)(this.rotationOffsetY * par1), 0.0);
        ItemRenderer.renderItemIn2D(Tessellator.instance, this.x1, this.y1, this.x2, this.y2, this.width, this.height, par1);
        GL11.glEndList();
        this.compiled = true;
    }
}

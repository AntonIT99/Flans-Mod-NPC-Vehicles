// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.util;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GLAllocation;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.ModelPartConfig;
import net.minecraft.client.model.ModelRenderer;

public class ModelScaleRenderer extends ModelRenderer
{
    public boolean compiled;
    public int displayList;
    protected ModelPartConfig config;
    public float x;
    public float y;
    public float z;
    
    public ModelScaleRenderer(final ModelBase par1ModelBase) {
        super(par1ModelBase);
    }
    
    public ModelScaleRenderer(final ModelBase par1ModelBase, final int par2, final int par3) {
        this(par1ModelBase);
        this.setTextureOffset(par2, par3);
    }
    
    public void setConfig(final ModelPartConfig config, final float x, final float y, final float z) {
        this.config = config;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void renderChilderen(final float par1) {
        if (!this.showModel || this.isHidden) {
            return;
        }
        if (!this.compiled) {
            this.compileDisplayList(par1);
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(this.x, this.y, this.z);
        if (this.config != null) {
            GL11.glTranslatef(this.config.transX, this.config.transY, this.config.transZ);
        }
        this.postRender(par1);
        if (this.config != null) {
            GL11.glScalef(this.config.scaleX, this.config.scaleY, this.config.scaleZ);
        }
        GL11.glCallList(this.displayList);
        if (this.childModels != null) {
            for (int i = 0; i < this.childModels.size(); ++i) {
                ((ModelRenderer) this.childModels.get(i)).render(par1);
            }
        }
        GL11.glPopMatrix();
    }
    
    public void renderChild(final float par1, final ModelRenderer model) {
        if (!this.showModel || this.isHidden) {
            return;
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(this.x, this.y, this.z);
        if (this.config != null) {
            GL11.glTranslatef(this.config.transX, this.config.transY, this.config.transZ);
        }
        this.postRender(par1);
        if (this.config != null) {
            GL11.glScalef(this.config.scaleX, this.config.scaleY, this.config.scaleZ);
        }
        model.render(par1);
        GL11.glPopMatrix();
    }
    
    public void render(final float par1) {
        if (!this.showModel || this.isHidden) {
            return;
        }
        if (!this.compiled) {
            this.compileDisplayList(par1);
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(this.x, this.y, this.z);
        if (this.config != null) {
            GL11.glTranslatef(this.config.transX, this.config.transY, this.config.transZ);
        }
        this.postRender(par1);
        if (this.config != null) {
            GL11.glScalef(this.config.scaleX, this.config.scaleY, this.config.scaleZ);
        }
        GL11.glCallList(this.displayList);
        if (this.childModels != null) {
            for (int i = 0; i < this.childModels.size(); ++i) {
                ((ModelRenderer) this.childModels.get(i)).render(par1);
            }
        }
        GL11.glPopMatrix();
    }
    
    public void parentRender(final float par1) {
        super.render(par1);
    }
    
    public void compileDisplayList(final float par1) {
        GL11.glNewList(this.displayList = GLAllocation.generateDisplayLists(1), 4864);
        final Tessellator tessellator = Tessellator.instance;
        for (int i = 0; i < this.cubeList.size(); ++i) {
            ((ModelBox) this.cubeList.get(i)).render(tessellator, par1);
        }
        GL11.glEndList();
        this.compiled = true;
    }
}

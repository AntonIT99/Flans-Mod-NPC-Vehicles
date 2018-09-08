// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.util;

import org.lwjgl.opengl.GL11;
import noppes.npcs.client.ClientProxy;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.ModelPartData;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.model.ModelMPM;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.ModelData;
import net.minecraft.client.model.ModelRenderer;

public abstract class ModelPartInterface extends ModelRenderer
{
    public ModelData data;
    private EntityCustomNpc entity;
    public float scale;
    protected ResourceLocation location;
    public int color;
    public ModelMPM base;
    
    public ModelPartInterface(final ModelMPM par1ModelBase) {
        super((ModelBase)par1ModelBase);
        this.scale = 1.0f;
        this.color = 16777215;
        this.base = par1ModelBase;
        this.setTextureSize(0, 0);
    }
    
    public void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity) {
    }
    
    public void setLivingAnimations(final ModelPartData data, final EntityLivingBase entityliving, final float f, final float f1, final float f2) {
    }
    
    public void setData(final ModelData data, final EntityCustomNpc entity) {
        this.data = data;
        this.entity = entity;
        this.initData(data);
    }
    
    public void render(final float par1) {
        if (!this.base.isArmor) {
            if (this.location != null) {
                ClientProxy.bindTexture(this.location);
                this.base.currentlyPlayerTexture = false;
            }
            else if (!this.base.currentlyPlayerTexture) {
                ClientProxy.bindTexture(this.entity.textureLocation);
                this.base.currentlyPlayerTexture = true;
            }
        }
        final boolean bo = this.entity.hurtTime <= 0 && this.entity.deathTime <= 0 && !this.base.isArmor;
        if (bo) {
            final float red = (this.color >> 16 & 0xFF) / 255.0f;
            final float green = (this.color >> 8 & 0xFF) / 255.0f;
            final float blue = (this.color & 0xFF) / 255.0f;
            GL11.glColor4f(red, green, blue, this.base.alpha);
        }
        super.render(par1);
        if (bo) {
            GL11.glColor4f(1.0f, 1.0f, 1.0f, this.base.alpha);
        }
    }
    
    public abstract void initData(final ModelData p0);
}

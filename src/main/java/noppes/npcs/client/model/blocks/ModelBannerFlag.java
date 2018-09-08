// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelBannerFlag extends ModelBase
{
    ModelRenderer Flag;
    
    public ModelBannerFlag() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        (this.Flag = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 15, 27, 0);
        this.Flag.setRotationPoint(-7.5f, -7.0f, -2.0f);
        this.Flag.setTextureSize(32, 32);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Flag.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

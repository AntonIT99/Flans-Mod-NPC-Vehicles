// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelTallLampTop extends ModelBase
{
    ModelRenderer LampShade1;
    ModelRenderer LampShade3;
    ModelRenderer LampShade2;
    ModelRenderer LampShade4;
    
    public ModelTallLampTop() {
        (this.LampShade1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-0.5f, -6.0f, -6.0f, 1, 12, 12);
        this.LampShade1.setRotationPoint(6.0f, -1.0f, 0.0f);
        (this.LampShade3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-6.0f, -6.0f, -0.5f, 12, 12, 1);
        this.LampShade3.setRotationPoint(0.0f, -1.0f, -6.0f);
        (this.LampShade2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-0.5f, -6.0f, -6.0f, 1, 12, 12);
        this.LampShade2.setRotationPoint(-6.0f, -1.0f, 0.0f);
        (this.LampShade4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-6.0f, -6.0f, -0.5f, 12, 12, 1);
        this.LampShade4.setRotationPoint(0.0f, -1.0f, 6.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.LampShade1.render(f5);
        this.LampShade3.render(f5);
        this.LampShade2.render(f5);
        this.LampShade4.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

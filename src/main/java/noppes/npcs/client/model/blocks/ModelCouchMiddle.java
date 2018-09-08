// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelCouchMiddle extends ModelBase
{
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Bottom;
    ModelRenderer Back;
    
    public ModelCouchMiddle() {
        (this.Leg1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2);
        this.Leg1.setRotationPoint(7.0f, 23.0f, 6.0f);
        (this.Leg2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2);
        this.Leg2.setRotationPoint(7.0f, 23.0f, -6.0f);
        (this.Leg3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2);
        this.Leg3.setRotationPoint(-8.0f, 23.0f, -6.0f);
        (this.Leg4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2);
        this.Leg4.setRotationPoint(-8.0f, 23.0f, 6.0f);
        (this.Bottom = new ModelRenderer((ModelBase)this, 2, 0)).addBox(0.0f, 0.0f, 0.0f, 16, 2, 14);
        this.Bottom.setRotationPoint(-8.0f, 21.0f, -6.0f);
        (this.Back = new ModelRenderer((ModelBase)this, 14, 15)).addBox(0.0f, 0.0f, 0.0f, 16, 15, 1);
        this.Back.setRotationPoint(-8.0f, 6.0f, 7.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Leg1.render(f5);
        this.Leg2.render(f5);
        this.Leg3.render(f5);
        this.Leg4.render(f5);
        this.Bottom.render(f5);
        this.Back.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

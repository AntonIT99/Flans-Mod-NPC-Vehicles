// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelStool extends ModelBase
{
    ModelRenderer Base;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    
    public ModelStool() {
        (this.Base = new ModelRenderer((ModelBase)this, 9, 3)).addBox(-5.0f, 0.0f, -5.0f, 10, 1, 10);
        this.Base.setRotationPoint(0.0f, 16.0f, 0.0f);
        (this.Leg1 = new ModelRenderer((ModelBase)this, 0, 12)).addBox(-1.0f, 0.0f, 0.0f, 2, 8, 1);
        this.Leg1.setRotationPoint(2.0f, 17.0f, 2.0f);
        this.setRotation(this.Leg1, 0.3316126f, 0.7853982f, 0.0f);
        (this.Leg2 = new ModelRenderer((ModelBase)this, 0, 12)).addBox(-1.0f, 0.0f, 0.0f, 2, 8, 1);
        this.Leg2.setRotationPoint(2.0f, 17.0f, -2.0f);
        this.setRotation(this.Leg2, 0.3316126f, 2.356194f, -0.0081449f);
        (this.Leg3 = new ModelRenderer((ModelBase)this, 0, 12)).addBox(-1.0f, 0.0f, 0.0f, 2, 8, 1);
        this.Leg3.setRotationPoint(-2.0f, 17.0f, 2.0f);
        this.setRotation(this.Leg3, 0.3316126f, -0.7853982f, 0.0f);
        (this.Leg4 = new ModelRenderer((ModelBase)this, 0, 12)).addBox(-1.0f, 0.0f, 0.0f, 2, 8, 1);
        this.Leg4.setRotationPoint(-2.0f, 17.0f, -2.0f);
        this.setRotation(this.Leg4, 0.3316126f, -2.356194f, 0.0f);
        (this.Shape1 = new ModelRenderer((ModelBase)this, 0, 11)).addBox(-3.0f, 0.0f, 0.0f, 6, 1, 1);
        this.Shape1.setRotationPoint(2.4f, 19.0f, 0.0f);
        this.setRotation(this.Shape1, 0.0f, 1.570796f, 0.0f);
        (this.Shape2 = new ModelRenderer((ModelBase)this, 0, 11)).addBox(-3.0f, 0.0f, 0.0f, 6, 1, 1);
        this.Shape2.setRotationPoint(0.0f, 19.0f, 2.4f);
        (this.Shape3 = new ModelRenderer((ModelBase)this, 0, 11)).addBox(-3.0f, 0.0f, 0.0f, 6, 1, 1);
        this.Shape3.setRotationPoint(0.0f, 19.0f, -3.4f);
        (this.Shape4 = new ModelRenderer((ModelBase)this, 0, 11)).addBox(-3.0f, 0.0f, 0.0f, 6, 1, 1);
        this.Shape4.setRotationPoint(-3.4f, 19.0f, 0.0f);
        this.setRotation(this.Shape4, 0.0f, 1.570796f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Base.render(f5);
        this.Leg1.render(f5);
        this.Leg2.render(f5);
        this.Leg3.render(f5);
        this.Leg4.render(f5);
        this.Shape1.render(f5);
        this.Shape2.render(f5);
        this.Shape3.render(f5);
        this.Shape4.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

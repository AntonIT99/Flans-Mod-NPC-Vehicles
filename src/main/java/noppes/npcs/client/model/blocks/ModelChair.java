// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelChair extends ModelBase
{
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    
    public ModelChair() {
        this.Leg1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Leg1.mirror = true;
        this.Leg1.addBox(0.0f, 0.0f, 0.0f, 1, 18, 1);
        this.Leg1.setRotationPoint(4.01f, 6.0f, 5.01f);
        this.Leg2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Leg2.mirror = true;
        this.Leg2.addBox(0.0f, 0.0f, 0.0f, 1, 9, 1);
        this.Leg2.setRotationPoint(4.01f, 15.5f, -5.01f);
        (this.Leg3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 18, 1);
        this.Leg3.setRotationPoint(-5.01f, 6.0f, 5.01f);
        (this.Leg4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 9, 1);
        this.Leg4.setRotationPoint(-5.01f, 15.5f, -5.01f);
        (this.Shape1 = new ModelRenderer((ModelBase)this, 8, 2)).addBox(0.0f, 0.0f, 0.0f, 10, 1, 11);
        this.Shape1.setRotationPoint(-5.0f, 16.0f, -5.0f);
        (this.Shape2 = new ModelRenderer((ModelBase)this, 4, 4)).addBox(0.0f, 0.0f, 0.0f, 3, 2, 1);
        this.Shape2.setRotationPoint(-1.5f, 6.51f, 5.5f);
        this.Shape3 = new ModelRenderer((ModelBase)this, 4, 4);
        this.Shape3.mirror = true;
        this.Shape3.addBox(-3.0f, 0.0f, 0.0f, 3, 2, 1);
        this.Shape3.setRotationPoint(4.0f, 6.5f, 5.0f);
        this.setRotation(this.Shape3, 0.0f, 0.2094395f, 0.0f);
        (this.Shape4 = new ModelRenderer((ModelBase)this, 4, 4)).addBox(0.0f, 0.0f, 0.0f, 3, 2, 1);
        this.Shape4.setRotationPoint(-4.0f, 6.5f, 5.0f);
        this.setRotation(this.Shape4, 0.0f, -0.2094395f, 0.0f);
        (this.Shape5 = new ModelRenderer((ModelBase)this, 46, 0)).addBox(0.0f, 0.0f, 0.0f, 9, 1, 1);
        this.Shape5.setRotationPoint(-4.0f, 19.0f, 5.0f);
        (this.Shape6 = new ModelRenderer((ModelBase)this, 46, 0)).addBox(0.0f, 0.0f, 0.0f, 8, 1, 1);
        this.Shape6.setRotationPoint(-4.0f, 19.0f, -5.0f);
        (this.Shape7 = new ModelRenderer((ModelBase)this, 11, 13)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 9);
        this.Shape7.setRotationPoint(-5.0f, 20.0f, -4.0f);
        this.Shape8 = new ModelRenderer((ModelBase)this, 11, 13);
        this.Shape8.mirror = true;
        this.Shape8.addBox(0.0f, 0.0f, 0.0f, 1, 1, 9);
        this.Shape8.setRotationPoint(4.0f, 20.0f, -4.0f);
        this.Shape9 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape9.mirror = true;
        this.Shape9.addBox(0.0f, 0.0f, 0.0f, 1, 8, 1);
        this.Shape9.setRotationPoint(2.0f, 8.0f, 5.5f);
        this.setRotation(this.Shape9, -0.0523599f, 0.0f, 0.0f);
        (this.Shape10 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 8, 1);
        this.Shape10.setRotationPoint(-3.0f, 8.0f, 5.5f);
        this.setRotation(this.Shape10, -0.0523599f, 0.0f, 0.0f);
        (this.Shape11 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 8, 1);
        this.Shape11.setRotationPoint(-0.5f, 8.0f, 5.6f);
        this.setRotation(this.Shape11, -0.0698132f, 0.0f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Leg1.render(f5);
        this.Leg2.render(f5);
        this.Leg3.render(f5);
        this.Leg4.render(f5);
        this.Shape1.render(f5);
        this.Shape2.render(f5);
        this.Shape3.render(f5);
        this.Shape4.render(f5);
        this.Shape5.render(f5);
        this.Shape6.render(f5);
        this.Shape7.render(f5);
        this.Shape8.render(f5);
        this.Shape9.render(f5);
        this.Shape10.render(f5);
        this.Shape11.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelCouchWoodLeft extends ModelBase
{
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
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    
    public ModelCouchWoodLeft() {
        this.Shape1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape1.mirror = true;
        this.Shape1.addBox(0.0f, 0.0f, 0.0f, 2, 3, 10);
        this.Shape1.setRotationPoint(-8.0f, 18.0f, -4.0f);
        (this.Shape2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 2);
        this.Shape2.setRotationPoint(7.0f, 21.0f, -6.0f);
        this.Shape3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape3.mirror = true;
        this.Shape3.addBox(0.0f, 0.0f, 0.0f, 2, 4, 1);
        this.Shape3.setRotationPoint(-8.0f, 14.0f, 0.5f);
        this.Shape4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape4.mirror = true;
        this.Shape4.addBox(0.0f, 0.0f, 0.0f, 14, 2, 1);
        this.Shape4.setRotationPoint(-6.0f, 7.0f, 7.0f);
        this.Shape5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape5.mirror = true;
        this.Shape5.addBox(0.0f, 0.0f, 0.0f, 14, 2, 2);
        this.Shape5.setRotationPoint(-6.0f, 19.0f, 6.0f);
        this.Shape6 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape6.mirror = true;
        this.Shape6.addBox(0.0f, 0.0f, 0.0f, 2, 1, 13);
        this.Shape6.setRotationPoint(-8.0f, 13.0f, -7.0f);
        (this.Shape7 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 10);
        this.Shape7.setRotationPoint(-6.0f, 19.0f, -4.0f);
        (this.Shape8 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 2);
        this.Shape8.setRotationPoint(7.0f, 21.0f, 6.0f);
        (this.Shape9 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 1, 10);
        this.Shape9.setRotationPoint(5.0f, 19.0f, -4.0f);
        (this.Shape10 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 10, 1);
        this.Shape10.setRotationPoint(-6.0f, 9.0f, 7.0f);
        this.Shape11 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape11.mirror = true;
        this.Shape11.addBox(0.0f, 0.0f, 0.0f, 14, 2, 2);
        this.Shape11.setRotationPoint(-6.0f, 19.0f, -6.0f);
        (this.Shape12 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 1, 10);
        this.Shape12.setRotationPoint(-3.0f, 19.0f, -4.0f);
        (this.Shape13 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 1, 10);
        this.Shape13.setRotationPoint(1.0f, 19.0f, -4.0f);
        (this.Shape14 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 10, 1);
        this.Shape14.setRotationPoint(-3.0f, 9.0f, 7.0f);
        (this.Shape15 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 10, 1);
        this.Shape15.setRotationPoint(1.0f, 9.0f, 7.0f);
        (this.Shape16 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 10, 1);
        this.Shape16.setRotationPoint(5.0f, 9.0f, 7.0f);
        this.Shape17 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape17.mirror = true;
        this.Shape17.addBox(0.0f, 0.0f, 0.0f, 2, 10, 2);
        this.Shape17.setRotationPoint(-8.0f, 14.0f, -6.0f);
        this.Shape18 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape18.mirror = true;
        this.Shape18.addBox(0.0f, 0.0f, 0.0f, 2, 18, 2);
        this.Shape18.setRotationPoint(-8.0f, 6.0f, 6.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
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
        this.Shape12.render(f5);
        this.Shape13.render(f5);
        this.Shape14.render(f5);
        this.Shape15.render(f5);
        this.Shape16.render(f5);
        this.Shape17.render(f5);
        this.Shape18.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

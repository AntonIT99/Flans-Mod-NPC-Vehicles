// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelLampWall extends ModelBase
{
    ModelRenderer Base;
    ModelRenderer Top1;
    ModelRenderer Top2;
    ModelRenderer Top3;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    
    public ModelLampWall() {
        (this.Base = new ModelRenderer((ModelBase)this, 0, 6)).addBox(0.0f, 0.0f, 0.0f, 4, 7, 4);
        this.Base.setRotationPoint(-2.0f, 14.0f, 1.0f);
        (this.Top1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 5, 1, 5);
        this.Top1.setRotationPoint(-2.5f, 14.0f, 0.5f);
        (this.Top2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 4);
        this.Top2.setRotationPoint(-2.0f, 13.5f, 1.0f);
        (this.Top3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 1, 3);
        this.Top3.setRotationPoint(-1.5f, 13.0f, 1.5f);
        (this.Shape2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3);
        this.Shape2.setRotationPoint(-0.5f, 11.0f, 3.5f);
        (this.Shape3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 3, 1);
        this.Shape3.setRotationPoint(0.0f, 9.5f, 6.5f);
        this.setRotation(this.Shape3, 0.0f, 0.0f, 0.7853982f);
        (this.Shape4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
        this.Shape4.setRotationPoint(-0.5f, 10.5f, 2.5f);
        (this.Shape5 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 4, 1);
        this.Shape5.setRotationPoint(0.0f, 8.7f, 7.0f);
        this.setRotation(this.Shape5, 0.0f, 0.0f, 0.7853982f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Base.render(f5);
        this.Top1.render(f5);
        this.Top2.render(f5);
        this.Top3.render(f5);
        this.Shape2.render(f5);
        this.Shape3.render(f5);
        this.Shape4.render(f5);
        this.Shape5.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

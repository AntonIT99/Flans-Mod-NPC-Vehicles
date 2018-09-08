// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelCrate extends ModelBase
{
    ModelRenderer sticky1;
    ModelRenderer sticky2;
    ModelRenderer sticky3;
    ModelRenderer sticky4;
    ModelRenderer core;
    ModelRenderer sticky1top;
    ModelRenderer sticky2top;
    ModelRenderer sticky3top;
    ModelRenderer sticky4top;
    ModelRenderer sidestick2;
    ModelRenderer sidestick3;
    ModelRenderer sidestick1;
    ModelRenderer sidestick4;
    ModelRenderer sidestuff2;
    ModelRenderer sidestuff1;
    ModelRenderer sidestuff3;
    ModelRenderer sidestuff4;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    
    public ModelCrate() {
        (this.sticky1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 2, 12);
        this.sticky1.setRotationPoint(6.0f, 22.0f, -6.0f);
        (this.sticky2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 12, 2, 2);
        this.sticky2.setRotationPoint(-6.0f, 22.0f, -8.0f);
        (this.sticky3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 2, 12);
        this.sticky3.setRotationPoint(-8.0f, 22.0f, -6.0f);
        (this.sticky4 = new ModelRenderer((ModelBase)this, 32, 0)).addBox(0.0f, 0.0f, 0.0f, 12, 2, 2);
        this.sticky4.setRotationPoint(-6.0f, 22.0f, 6.0f);
        (this.core = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-8.0f, 0.0f, -8.0f, 16, 16, 16, -1.0f);
        this.core.setRotationPoint(0.0f, 8.0f, 0.0f);
        (this.sticky1top = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 2, 12);
        this.sticky1top.setRotationPoint(6.0f, 8.0f, -6.0f);
        (this.sticky2top = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 12, 2, 2);
        this.sticky2top.setRotationPoint(-6.0f, 8.0f, 6.0f);
        (this.sticky3top = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 2, 12);
        this.sticky3top.setRotationPoint(-8.0f, 8.0f, -6.0f);
        (this.sticky4top = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 12, 2, 2);
        this.sticky4top.setRotationPoint(-6.0f, 8.0f, -8.0f);
        (this.sidestick1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 16, 2);
        this.sidestick1.setRotationPoint(-8.0f, 8.0f, 6.0f);
        (this.sidestick2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 16, 2);
        this.sidestick2.setRotationPoint(6.0f, 8.0f, 6.0f);
        (this.sidestick3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 16, 2);
        this.sidestick3.setRotationPoint(-8.0f, 8.0f, -8.0f);
        (this.sidestick4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 16, 2);
        this.sidestick4.setRotationPoint(6.0f, 8.0f, -8.0f);
        (this.sidestuff1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 1.0f, 0.0f, 1, 18, 2);
        this.sidestuff1.setRotationPoint(6.0f, 8.5f, -6.5f);
        this.setRotation(this.sidestuff1, -0.7853982f, 1.570796f, 0.0f);
        (this.sidestuff2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, -1.0f, 0.0f, 1, 18, 2);
        this.sidestuff2.setRotationPoint(-7.5f, 9.5f, 5.0f);
        this.setRotation(this.sidestuff2, -0.7853982f, 0.0f, 0.0f);
        (this.sidestuff3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 1.0f, 0.0f, 1, 18, 2);
        this.sidestuff3.setRotationPoint(7.5f, 8.5f, -6.0f);
        this.setRotation(this.sidestuff3, -0.7853982f, 3.141593f, 0.0f);
        (this.sidestuff4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 1.0f, 0.0f, 1, 18, 2);
        this.sidestuff4.setRotationPoint(-6.0f, 8.5f, 6.5f);
        this.setRotation(this.sidestuff4, -0.7853982f, -1.570796f, 0.0f);
        (this.Shape1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 18, 1, 2);
        this.Shape1.setRotationPoint(-5.5f, 22.5f, -7.0f);
        this.setRotation(this.Shape1, 0.0f, -0.7853982f, 0.0f);
        (this.Shape2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 18, 1, 2);
        this.Shape2.setRotationPoint(-5.5f, 8.5f, -7.0f);
        this.setRotation(this.Shape2, 0.0f, -0.7853982f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.sticky1.render(f5);
        this.sticky2.render(f5);
        this.sticky3.render(f5);
        this.sticky4.render(f5);
        this.core.render(f5);
        this.sticky1top.render(f5);
        this.sticky2top.render(f5);
        this.sticky3top.render(f5);
        this.sticky4top.render(f5);
        this.sidestick1.render(f5);
        this.sidestick2.render(f5);
        this.sidestick3.render(f5);
        this.sidestick4.render(f5);
        this.sidestuff1.render(f5);
        this.sidestuff2.render(f5);
        this.sidestuff3.render(f5);
        this.sidestuff4.render(f5);
        this.Shape1.render(f5);
        this.Shape2.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

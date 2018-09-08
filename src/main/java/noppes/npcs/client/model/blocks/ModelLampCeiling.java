// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelLampCeiling extends ModelBase
{
    ModelRenderer Base;
    ModelRenderer Top1;
    ModelRenderer Top2;
    ModelRenderer Top3;
    ModelRenderer Chain8;
    ModelRenderer Chain1;
    ModelRenderer Chain2;
    ModelRenderer Chain3;
    ModelRenderer Chain4;
    ModelRenderer Chain5;
    ModelRenderer Chain6;
    ModelRenderer Chain7;
    ModelRenderer TippyTop1;
    ModelRenderer TippyTop2;
    ModelRenderer Shape3;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    
    public ModelLampCeiling() {
        (this.Base = new ModelRenderer((ModelBase)this, 0, 6)).addBox(0.0f, 0.0f, 0.0f, 4, 7, 4);
        this.Base.setRotationPoint(-2.0f, 17.0f, -2.0f);
        (this.Top1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 5, 1, 5);
        this.Top1.setRotationPoint(-2.5f, 17.0f, -2.5f);
        (this.Top2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 4);
        this.Top2.setRotationPoint(-2.0f, 16.5f, -2.0f);
        (this.Top3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 1, 3);
        this.Top3.setRotationPoint(-1.5f, 16.0f, -1.5f);
        (this.Chain8 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
        this.Chain8.setRotationPoint(-0.5f, 14.0f, -1.5f);
        (this.Chain1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
        this.Chain1.setRotationPoint(0.5f, 8.0f, -0.5f);
        (this.Chain2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
        this.Chain2.setRotationPoint(-1.5f, 8.0f, -0.5f);
        (this.Chain3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
        this.Chain3.setRotationPoint(-0.5f, 10.0f, 0.5f);
        (this.Chain4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
        this.Chain4.setRotationPoint(-0.5f, 10.0f, -1.5f);
        (this.Chain5 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
        this.Chain5.setRotationPoint(-1.5f, 12.0f, -0.5f);
        (this.Chain6 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
        this.Chain6.setRotationPoint(0.5f, 12.0f, -0.5f);
        (this.Chain7 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
        this.Chain7.setRotationPoint(-0.5f, 14.0f, 0.5f);
        (this.TippyTop1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 4);
        this.TippyTop1.setRotationPoint(-2.8f, 8.0f, 0.0f);
        this.setRotation(this.TippyTop1, 0.0f, 0.7853982f, 0.0f);
        (this.TippyTop2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 1, 3);
        this.TippyTop2.setRotationPoint(-2.1f, 8.5f, 0.0f);
        this.setRotation(this.TippyTop2, 0.0f, 0.7853982f, 0.0f);
        (this.Shape3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.Shape3.setRotationPoint(-0.5f, 14.0f, -0.5f);
        (this.Shape1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.Shape1.setRotationPoint(-0.5f, 10.0f, -0.5f);
        (this.Shape2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.Shape2.setRotationPoint(-0.5f, 12.0f, -0.5f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Base.render(f5);
        this.Top1.render(f5);
        this.Top2.render(f5);
        this.Top3.render(f5);
        this.Chain8.render(f5);
        this.Chain1.render(f5);
        this.Chain2.render(f5);
        this.Chain3.render(f5);
        this.Chain4.render(f5);
        this.Chain5.render(f5);
        this.Chain6.render(f5);
        this.Chain7.render(f5);
        this.TippyTop1.render(f5);
        this.TippyTop2.render(f5);
        this.Shape3.render(f5);
        this.Shape1.render(f5);
        this.Shape2.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

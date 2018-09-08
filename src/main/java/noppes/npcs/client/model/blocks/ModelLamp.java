// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelLamp extends ModelBase
{
    ModelRenderer Base;
    ModelRenderer Top1;
    ModelRenderer Top2;
    ModelRenderer Top3;
    ModelRenderer Handle;
    ModelRenderer Shape1;
    
    public ModelLamp() {
        (this.Base = new ModelRenderer((ModelBase)this, 0, 6)).addBox(0.0f, 0.0f, 0.0f, 4, 7, 4);
        this.Base.setRotationPoint(-2.0f, 16.0f, -2.0f);
        (this.Top1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 5, 1, 5);
        this.Top1.setRotationPoint(-2.5f, 16.0f, -2.5f);
        (this.Top2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 4);
        this.Top2.setRotationPoint(-2.0f, 15.5f, -2.0f);
        (this.Top3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 1, 3);
        this.Top3.setRotationPoint(-1.5f, 15.0f, -1.5f);
        (this.Handle = new ModelRenderer((ModelBase)this, 24, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 0, 3);
        this.Handle.setRotationPoint(0.0f, 15.0f, 0.0f);
        this.setRotation(this.Handle, 0.296706f, 0.1745329f, 0.0f);
        (this.Shape1 = new ModelRenderer((ModelBase)this, 0, 17)).addBox(-2.0f, 0.0f, -2.0f, 4, 1, 4);
        this.Shape1.setRotationPoint(0.0f, 23.0f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Base.render(f5);
        this.Top1.render(f5);
        this.Top2.render(f5);
        this.Top3.render(f5);
        this.Handle.render(f5);
        this.Shape1.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

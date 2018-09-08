// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelCandleWall extends ModelBase
{
    ModelRenderer Base;
    ModelRenderer Bar1;
    ModelRenderer Bar2;
    ModelRenderer Bar3;
    ModelRenderer Bar4;
    ModelRenderer Wax;
    ModelRenderer Wall2;
    ModelRenderer Wall1;
    ModelRenderer Bar5;
    ModelRenderer Bar6;
    
    public ModelCandleWall() {
        (this.Base = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 4);
        this.Base.setRotationPoint(-2.0f, 13.0f, -4.0f);
        (this.Bar1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 6);
        this.Bar1.setRotationPoint(-3.0f, 12.0f, -5.0f);
        (this.Bar2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 6);
        this.Bar2.setRotationPoint(2.0f, 12.0f, -5.0f);
        (this.Bar3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 1);
        this.Bar3.setRotationPoint(-2.0f, 12.0f, -5.0f);
        (this.Bar4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 1);
        this.Bar4.setRotationPoint(-2.0f, 12.0f, 0.0f);
        (this.Wax = new ModelRenderer((ModelBase)this, 16, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 4, 2);
        this.Wax.setRotationPoint(-1.0f, 9.0f, -3.0f);
        (this.Wall2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 3, 1);
        this.Wall2.setRotationPoint(0.0f, 13.7f, -7.5f);
        this.setRotation(this.Wall2, 0.0f, 0.0f, 0.7853982f);
        (this.Wall1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 4, 1);
        this.Wall1.setRotationPoint(0.0f, 13.0f, -8.0f);
        this.setRotation(this.Wall1, 0.0f, 0.0f, 0.7853982f);
        (this.Bar5 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
        this.Bar5.setRotationPoint(-0.5f, 13.5f, -2.5f);
        (this.Bar6 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 5);
        this.Bar6.setRotationPoint(-0.5f, 15.5f, -6.5f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Base.render(f5);
        this.Bar1.render(f5);
        this.Bar2.render(f5);
        this.Bar3.render(f5);
        this.Bar4.render(f5);
        this.Wax.render(f5);
        this.Wall2.render(f5);
        this.Wall1.render(f5);
        this.Bar5.render(f5);
        this.Bar6.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

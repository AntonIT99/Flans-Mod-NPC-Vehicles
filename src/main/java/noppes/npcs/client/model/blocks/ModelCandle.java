// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelCandle extends ModelBase
{
    ModelRenderer Base;
    ModelRenderer Bar1;
    ModelRenderer Bar2;
    ModelRenderer Bar3;
    ModelRenderer Bar4;
    ModelRenderer Wax;
    
    public ModelCandle() {
        (this.Base = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 4);
        this.Base.setRotationPoint(-2.0f, 23.0f, -2.0f);
        (this.Bar1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 6);
        this.Bar1.setRotationPoint(-3.0f, 22.0f, -3.0f);
        (this.Bar2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 6);
        this.Bar2.setRotationPoint(2.0f, 22.0f, -3.0f);
        (this.Bar3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 1);
        this.Bar3.setRotationPoint(-2.0f, 22.0f, -3.0f);
        (this.Bar4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 1);
        this.Bar4.setRotationPoint(-2.0f, 22.0f, 2.0f);
        (this.Wax = new ModelRenderer((ModelBase)this, 16, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 4, 2);
        this.Wax.setRotationPoint(-1.0f, 19.0f, -1.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Base.render(f5);
        this.Bar1.render(f5);
        this.Bar2.render(f5);
        this.Bar3.render(f5);
        this.Bar4.render(f5);
        this.Wax.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelCouchCornerWool extends ModelBase
{
    ModelRenderer Wool1;
    ModelRenderer Wool2;
    ModelRenderer Wool3;
    ModelRenderer Wool4;
    
    public ModelCouchCornerWool() {
        (this.Wool1 = new ModelRenderer((ModelBase)this, 11, 3)).addBox(0.0f, 0.0f, 0.0f, 13, 5, 2);
        this.Wool1.setRotationPoint(-7.0f, 16.0f, -8.0f);
        (this.Wool2 = new ModelRenderer((ModelBase)this, 2, 4)).addBox(0.0f, 0.0f, 0.0f, 2, 10, 13);
        this.Wool2.setRotationPoint(-7.0f, 6.0f, -8.0f);
        (this.Wool3 = new ModelRenderer((ModelBase)this, 14, 15)).addBox(0.0f, 0.0f, 0.0f, 15, 10, 2);
        this.Wool3.setRotationPoint(-7.0f, 6.0f, 5.0f);
        (this.Wool4 = new ModelRenderer((ModelBase)this, 0, 45)).addBox(0.0f, 0.0f, 0.0f, 15, 5, 13);
        this.Wool4.setRotationPoint(-7.0f, 16.0f, -6.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Wool1.render(f5);
        this.Wool2.render(f5);
        this.Wool3.render(f5);
        this.Wool4.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

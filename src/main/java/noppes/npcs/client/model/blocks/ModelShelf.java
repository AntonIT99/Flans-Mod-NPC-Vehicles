// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelShelf extends ModelBase
{
    public ModelRenderer SupportLeft2;
    ModelRenderer Top;
    public ModelRenderer SupportLeft1;
    public ModelRenderer SupportRight1;
    public ModelRenderer SupportRight2;
    
    public ModelShelf() {
        this.SupportLeft2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.SupportLeft2.mirror = true;
        this.SupportLeft2.addBox(0.0f, 0.0f, 0.0f, 2, 10, 2);
        this.SupportLeft2.setRotationPoint(-7.498f, 9.5f, -0.5f);
        this.setRotation(this.SupportLeft2, 0.7853982f, 0.0f, 0.0f);
        (this.Top = new ModelRenderer((ModelBase)this, 5, 0)).addBox(0.0f, 0.0f, 0.0f, 16, 2, 11);
        this.Top.setRotationPoint(-8.0f, 8.0f, -3.0f);
        this.SupportLeft1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.SupportLeft1.mirror = true;
        this.SupportLeft1.addBox(0.0f, 0.0f, 0.0f, 2, 7, 2);
        this.SupportLeft1.setRotationPoint(-7.5f, 10.0f, 6.0f);
        (this.SupportRight1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 7, 2);
        this.SupportRight1.setRotationPoint(5.5f, 10.0f, 6.0f);
        (this.SupportRight2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 10, 2);
        this.SupportRight2.setRotationPoint(5.498f, 9.5f, -0.5f);
        this.setRotation(this.SupportRight2, 0.7853982f, 0.0f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.SupportLeft2.render(f5);
        this.Top.render(f5);
        this.SupportLeft1.render(f5);
        this.SupportRight1.render(f5);
        this.SupportRight2.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

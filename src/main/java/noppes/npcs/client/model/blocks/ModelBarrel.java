// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelBarrel extends ModelBase
{
    ModelRenderer Plank1;
    ModelRenderer Plank2;
    ModelRenderer Plank3;
    ModelRenderer Plank4;
    ModelRenderer Plank5;
    ModelRenderer Plank6;
    ModelRenderer Plank7;
    ModelRenderer Plank8;
    ModelRenderer Plank9;
    ModelRenderer Plank10;
    ModelRenderer Plank11;
    ModelRenderer Plank12;
    
    public ModelBarrel() {
        (this.Plank1 = new ModelRenderer((ModelBase)this, 10, 0)).addBox(0.0f, 6.5f, -2.0f, 17, 1, 4);
        this.Plank1.setRotationPoint(0.0f, 7.01f, 0.0f);
        this.setRotation(this.Plank1, 0.0f, 0.0f, 1.570796f);
        (this.Plank2 = new ModelRenderer((ModelBase)this, 10, 8)).addBox(0.0f, 6.5f, -2.0f, 17, 1, 4);
        this.Plank2.setRotationPoint(0.0f, 7.0f, 0.0f);
        this.setRotation(this.Plank2, 0.0f, 0.5235988f, 1.570796f);
        (this.Plank3 = new ModelRenderer((ModelBase)this, 10, 0)).addBox(0.0f, 6.5f, -2.0f, 17, 1, 4);
        this.Plank3.setRotationPoint(0.0f, 7.01f, 0.0f);
        this.setRotation(this.Plank3, 0.0f, 1.047198f, 1.570796f);
        (this.Plank4 = new ModelRenderer((ModelBase)this, 10, 8)).addBox(0.0f, 6.5f, -2.0f, 17, 1, 4);
        this.Plank4.setRotationPoint(0.0f, 7.0f, 0.0f);
        this.setRotation(this.Plank4, 0.0f, 1.570796f, 1.570796f);
        (this.Plank5 = new ModelRenderer((ModelBase)this, 10, 0)).addBox(0.0f, 6.5f, -2.0f, 17, 1, 4);
        this.Plank5.setRotationPoint(0.0f, 7.01f, 0.0f);
        this.setRotation(this.Plank5, 0.0f, 2.094395f, 1.570796f);
        (this.Plank6 = new ModelRenderer((ModelBase)this, 10, 8)).addBox(0.0f, 6.5f, -2.0f, 17, 1, 4);
        this.Plank6.setRotationPoint(0.0f, 7.0f, 0.0f);
        this.setRotation(this.Plank6, 0.0f, 2.617994f, 1.570796f);
        (this.Plank7 = new ModelRenderer((ModelBase)this, 10, 0)).addBox(0.0f, 6.5f, -2.0f, 17, 1, 4);
        this.Plank7.setRotationPoint(0.0f, 7.01f, 0.0f);
        this.setRotation(this.Plank7, 0.0f, 3.150901f, 1.570796f);
        (this.Plank8 = new ModelRenderer((ModelBase)this, 10, 8)).addBox(0.0f, 6.5f, -2.0f, 17, 1, 4);
        this.Plank8.setRotationPoint(0.0f, 7.0f, 0.0f);
        this.setRotation(this.Plank8, 0.0f, -2.617994f, 1.570796f);
        (this.Plank9 = new ModelRenderer((ModelBase)this, 10, 0)).addBox(0.0f, 6.5f, -2.0f, 17, 1, 4);
        this.Plank9.setRotationPoint(0.0f, 7.01f, 0.0f);
        this.setRotation(this.Plank9, 0.0f, -2.094395f, 1.570796f);
        (this.Plank10 = new ModelRenderer((ModelBase)this, 10, 8)).addBox(0.0f, 6.5f, -2.0f, 17, 1, 4);
        this.Plank10.setRotationPoint(0.0f, 7.0f, 0.0f);
        this.setRotation(this.Plank10, 0.0f, -1.570796f, 1.570796f);
        (this.Plank11 = new ModelRenderer((ModelBase)this, 10, 0)).addBox(0.0f, 6.5f, -2.0f, 17, 1, 4);
        this.Plank11.setRotationPoint(0.0f, 7.01f, 0.0f);
        this.setRotation(this.Plank11, 0.0f, -1.047198f, 1.570796f);
        (this.Plank12 = new ModelRenderer((ModelBase)this, 10, 0)).addBox(0.0f, 6.5f, -2.0f, 17, 1, 4);
        this.Plank12.setRotationPoint(0.0f, 7.0f, 0.0f);
        this.setRotation(this.Plank12, 0.0f, -0.5235988f, 1.570796f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Plank1.render(f5);
        this.Plank2.render(f5);
        this.Plank3.render(f5);
        this.Plank4.render(f5);
        this.Plank5.render(f5);
        this.Plank6.render(f5);
        this.Plank7.render(f5);
        this.Plank8.render(f5);
        this.Plank9.render(f5);
        this.Plank10.render(f5);
        this.Plank11.render(f5);
        this.Plank12.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = y;
        model.rotateAngleY = x;
        model.rotateAngleZ = z;
    }
}

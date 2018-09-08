// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelLongCrate extends ModelBase
{
    ModelRenderer Vertical1;
    ModelRenderer Horizontal1;
    ModelRenderer Cratebody;
    ModelRenderer Horizontal2;
    ModelRenderer Vertical3;
    ModelRenderer Vertical4;
    ModelRenderer Vertical2;
    
    public ModelLongCrate() {
        (this.Vertical1 = new ModelRenderer((ModelBase)this, 80, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 13, 1);
        this.Vertical1.setRotationPoint(-12.0f, 11.0f, 8.0f);
        this.Horizontal1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Horizontal1.mirror = true;
        this.Horizontal1.addBox(0.0f, 0.0f, 0.0f, 4, 1, 18);
        this.Horizontal1.setRotationPoint(8.0f, 10.0f, -9.0f);
        (this.Cratebody = new ModelRenderer((ModelBase)this, 8, 0)).addBox(-16.0f, 0.0f, -8.0f, 32, 13, 16);
        this.Cratebody.setRotationPoint(0.0f, 11.0f, 0.0f);
        (this.Horizontal2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 18);
        this.Horizontal2.setRotationPoint(-12.0f, 10.0f, -9.0f);
        (this.Vertical3 = new ModelRenderer((ModelBase)this, 80, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 13, 1);
        this.Vertical3.setRotationPoint(-12.0f, 11.0f, -9.0f);
        this.Vertical4 = new ModelRenderer((ModelBase)this, 80, 0);
        this.Vertical4.mirror = true;
        this.Vertical4.addBox(0.0f, 0.0f, 0.0f, 4, 13, 1);
        this.Vertical4.setRotationPoint(8.0f, 11.0f, -9.0f);
        this.Vertical2 = new ModelRenderer((ModelBase)this, 80, 0);
        this.Vertical2.mirror = true;
        this.Vertical2.addBox(0.0f, 0.0f, 0.0f, 4, 13, 1);
        this.Vertical2.setRotationPoint(8.0f, 11.0f, 8.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Vertical1.render(f5);
        this.Horizontal1.render(f5);
        this.Cratebody.render(f5);
        this.Horizontal2.render(f5);
        this.Vertical3.render(f5);
        this.Vertical4.render(f5);
        this.Vertical2.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

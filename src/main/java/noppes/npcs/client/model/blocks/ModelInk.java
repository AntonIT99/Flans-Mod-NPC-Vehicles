// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelInk extends ModelBase
{
    ModelRenderer InkMid;
    ModelRenderer InkTop;
    ModelRenderer InkBottom;
    ModelRenderer Shape1;
    ModelRenderer InkBottom2;
    
    public ModelInk() {
        (this.InkMid = new ModelRenderer((ModelBase)this, 0, 25)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.InkMid.setRotationPoint(5.0f, 21.0f, 3.5f);
        (this.InkTop = new ModelRenderer((ModelBase)this, 0, 22)).addBox(0.0f, 0.0f, 0.0f, 2, 1, 2);
        this.InkTop.setRotationPoint(4.5f, 20.0f, 3.0f);
        (this.InkBottom = new ModelRenderer((ModelBase)this, 3, 16)).addBox(0.0f, 0.0f, 0.0f, 3, 1, 3);
        this.InkBottom.setRotationPoint(4.0f, 22.0f, 2.5f);
        (this.Shape1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 0, 13, 3);
        this.Shape1.setRotationPoint(5.5f, 10.0f, 2.5f);
        (this.InkBottom2 = new ModelRenderer((ModelBase)this, 0, 27)).addBox(0.0f, 0.0f, 0.0f, 3, 1, 3);
        this.InkBottom2.setRotationPoint(4.0f, 23.0f, 2.5f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Shape1.render(f5);
        this.InkMid.render(f5);
        this.InkTop.render(f5);
        this.InkBottom2.render(f5);
        this.InkBottom.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

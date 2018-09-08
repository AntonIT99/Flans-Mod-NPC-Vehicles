// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelTombstone3 extends ModelBase
{
    ModelRenderer Bottom;
    ModelRenderer Piece5;
    ModelRenderer Piece2;
    ModelRenderer Piece1;
    ModelRenderer Piece4;
    ModelRenderer Piece3;
    ModelRenderer Piece7;
    
    public ModelTombstone3() {
        (this.Bottom = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 12, 5, 4);
        this.Bottom.setRotationPoint(-6.0f, 19.0f, -2.0f);
        (this.Piece5 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 4);
        this.Piece5.setRotationPoint(-4.0f, 16.0f, -2.0f);
        (this.Piece2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 2, 4);
        this.Piece2.setRotationPoint(2.0f, 17.0f, -2.0f);
        (this.Piece1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 6, 2, 4);
        this.Piece1.setRotationPoint(-5.0f, 17.0f, -2.0f);
        (this.Piece4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 4);
        this.Piece4.setRotationPoint(-5.0f, 14.0f, -2.0f);
        (this.Piece3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 1, 4);
        this.Piece3.setRotationPoint(3.0f, 16.0f, -2.0f);
        (this.Piece7 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 4);
        this.Piece7.setRotationPoint(-4.0f, 15.0f, -2.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Bottom.render(f5);
        this.Piece5.render(f5);
        this.Piece2.render(f5);
        this.Piece1.render(f5);
        this.Piece4.render(f5);
        this.Piece3.render(f5);
        this.Piece7.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

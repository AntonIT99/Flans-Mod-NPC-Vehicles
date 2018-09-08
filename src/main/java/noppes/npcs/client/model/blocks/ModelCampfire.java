// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelCampfire extends ModelBase
{
    ModelRenderer Rock1;
    ModelRenderer Rock2;
    ModelRenderer Rock3;
    ModelRenderer Rock4;
    ModelRenderer Rock5;
    ModelRenderer Rock6;
    ModelRenderer Rock7;
    ModelRenderer Rock8;
    ModelRenderer Log3;
    ModelRenderer Log1;
    ModelRenderer Log4;
    ModelRenderer Log2;
    
    public ModelCampfire() {
        (this.Rock1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 2, 3);
        this.Rock1.setRotationPoint(5.0f, 22.0f, 3.0f);
        this.setRotation(this.Rock1, 0.0f, -0.7435722f, 0.0f);
        (this.Rock2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 3, 6);
        this.Rock2.setRotationPoint(5.0f, 21.0f, -3.0f);
        (this.Rock3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 5, 3, 3);
        this.Rock3.setRotationPoint(2.5f, 21.0f, -8.0f);
        this.setRotation(this.Rock3, 0.0f, -0.5576792f, 0.0f);
        (this.Rock4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 2, 2);
        this.Rock4.setRotationPoint(-2.0f, 22.0f, -7.5f);
        (this.Rock5 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, -2.0f, 7, 2, 2);
        this.Rock5.setRotationPoint(-3.5f, 22.0f, 7.8f);
        (this.Rock6 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 3, 3);
        this.Rock6.setRotationPoint(-5.0f, 21.0f, 3.0f);
        this.setRotation(this.Rock6, 0.0f, -1.003822f, 0.0f);
        (this.Rock7 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 3, 3);
        this.Rock7.setRotationPoint(-7.0f, 21.0f, -4.5f);
        this.setRotation(this.Rock7, 0.0f, 0.8551081f, 0.0f);
        (this.Rock8 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 2, 6);
        this.Rock8.setRotationPoint(-8.0f, 22.0f, -3.0f);
        (this.Log3 = new ModelRenderer((ModelBase)this, 0, 16)).addBox(0.0f, 0.0f, 0.0f, 2, 9, 2);
        this.Log3.setRotationPoint(0.0f, 16.0f, -1.0f);
        this.setRotation(this.Log3, 0.3717861f, -1.487144f, -0.1487144f);
        (this.Log1 = new ModelRenderer((ModelBase)this, 8, 21)).addBox(0.0f, 0.0f, 0.0f, 2, 9, 2);
        this.Log1.setRotationPoint(0.0f, 16.0f, -1.0f);
        this.setRotation(this.Log1, -0.1487144f, 0.0f, -0.3717861f);
        (this.Log4 = new ModelRenderer((ModelBase)this, 0, 16)).addBox(0.0f, 0.0f, -2.0f, 2, 9, 2);
        this.Log4.setRotationPoint(1.0f, 16.0f, 1.0f);
        this.setRotation(this.Log4, -0.3346075f, 3.141593f, 0.0f);
        (this.Log2 = new ModelRenderer((ModelBase)this, 0, 20)).addBox(0.0f, 0.0f, 0.0f, 2, 9, 2);
        this.Log2.setRotationPoint(1.0f, 16.0f, -1.0f);
        this.setRotation(this.Log2, 0.2974289f, 3.141593f, 0.0f);
    }
    
    public void renderRock(final float f5) {
        this.Rock1.render(f5);
        this.Rock2.render(f5);
        this.Rock3.render(f5);
        this.Rock4.render(f5);
        this.Rock5.render(f5);
        this.Rock6.render(f5);
        this.Rock7.render(f5);
        this.Rock8.render(f5);
    }
    
    public void renderLog(final float f5) {
        this.Log3.render(f5);
        this.Log1.render(f5);
        this.Log4.render(f5);
        this.Log2.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

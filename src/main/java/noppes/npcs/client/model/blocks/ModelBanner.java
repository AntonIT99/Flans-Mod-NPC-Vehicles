// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelBanner extends ModelBase
{
    ModelRenderer Base;
    ModelRenderer MiddleStick;
    ModelRenderer StickDecoration;
    ModelRenderer TopDecoration;
    ModelRenderer FlagPole1;
    ModelRenderer FlagPole2;
    ModelRenderer BaseDeco1;
    ModelRenderer BaseDeco2;
    ModelRenderer BaseDeco3;
    ModelRenderer BaseDeco4;
    
    public ModelBanner() {
        (this.Base = new ModelRenderer((ModelBase)this, 3, 1)).addBox(-7.0f, 0.0f, -7.0f, 14, 1, 14);
        this.Base.setRotationPoint(0.0f, 23.0f, 0.0f);
        (this.MiddleStick = new ModelRenderer((ModelBase)this, 12, 2)).addBox(-1.0f, 0.0f, -1.0f, 2, 32, 2);
        this.MiddleStick.setRotationPoint(0.0f, -9.0f, 0.0f);
        (this.StickDecoration = new ModelRenderer((ModelBase)this, 11, 12)).addBox(0.0f, 0.0f, 0.0f, 16, 3, 3);
        this.StickDecoration.setRotationPoint(-8.0f, -7.5f, -1.5f);
        (this.TopDecoration = new ModelRenderer((ModelBase)this, 45, 19)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.TopDecoration.setRotationPoint(-0.5f, -10.0f, -0.5f);
        (this.FlagPole1 = new ModelRenderer((ModelBase)this, 45, 19)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.FlagPole1.setRotationPoint(-7.0f, -6.5f, -2.5f);
        (this.FlagPole2 = new ModelRenderer((ModelBase)this, 45, 19)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.FlagPole2.setRotationPoint(6.0f, -6.5f, -2.5f);
        (this.BaseDeco1 = new ModelRenderer((ModelBase)this, 1, 14)).addBox(0.0f, 0.0f, 0.0f, 12, 1, 1);
        this.BaseDeco1.setRotationPoint(-6.0f, 23.0f, -8.0f);
        (this.BaseDeco2 = new ModelRenderer((ModelBase)this, 1, 14)).addBox(0.0f, 0.0f, 0.0f, 12, 1, 1);
        this.BaseDeco2.setRotationPoint(-6.0f, 23.0f, 7.0f);
        (this.BaseDeco3 = new ModelRenderer((ModelBase)this, 2, 2)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 12);
        this.BaseDeco3.setRotationPoint(-8.0f, 23.0f, -6.0f);
        (this.BaseDeco4 = new ModelRenderer((ModelBase)this, 2, 2)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 12);
        this.BaseDeco4.setRotationPoint(7.0f, 23.0f, -6.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Base.render(f5);
        this.MiddleStick.render(f5);
        this.StickDecoration.render(f5);
        this.TopDecoration.render(f5);
        this.FlagPole1.render(f5);
        this.FlagPole2.render(f5);
        this.BaseDeco1.render(f5);
        this.BaseDeco2.render(f5);
        this.BaseDeco3.render(f5);
        this.BaseDeco4.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelWallBanner extends ModelBase
{
    ModelRenderer MiddleStick;
    ModelRenderer StickDecoration;
    ModelRenderer TopDecoration;
    ModelRenderer FlagPole1;
    ModelRenderer FlagPole2;
    
    public ModelWallBanner() {
        (this.MiddleStick = new ModelRenderer((ModelBase)this, 56, 0)).addBox(-1.0f, 0.0f, -1.0f, 2, 3, 2);
        this.MiddleStick.setRotationPoint(0.0f, -9.0f, 6.5f);
        (this.StickDecoration = new ModelRenderer((ModelBase)this, 11, 12)).addBox(0.0f, 0.0f, 0.0f, 16, 3, 3);
        this.StickDecoration.setRotationPoint(-8.0f, -7.5f, 5.0f);
        (this.TopDecoration = new ModelRenderer((ModelBase)this, 45, 19)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.TopDecoration.setRotationPoint(-0.5f, -10.0f, 6.0f);
        (this.FlagPole1 = new ModelRenderer((ModelBase)this, 45, 19)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.FlagPole1.setRotationPoint(-7.0f, -6.5f, 4.0f);
        (this.FlagPole2 = new ModelRenderer((ModelBase)this, 45, 19)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.FlagPole2.setRotationPoint(6.0f, -6.5f, 4.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.MiddleStick.render(f5);
        this.StickDecoration.render(f5);
        this.TopDecoration.render(f5);
        this.FlagPole1.render(f5);
        this.FlagPole2.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

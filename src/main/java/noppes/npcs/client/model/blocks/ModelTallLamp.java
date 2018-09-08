// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelTallLamp extends ModelBase
{
    ModelRenderer Base;
    ModelRenderer MiddleStick;
    ModelRenderer LampShadeStick1;
    ModelRenderer LampShadeStick2;
    ModelRenderer LampShadeStick3;
    ModelRenderer LampShadeStick4;
    
    public ModelTallLamp() {
        (this.Base = new ModelRenderer((ModelBase)this, 6, 2)).addBox(-6.0f, 0.0f, -6.0f, 12, 1, 12);
        this.Base.setRotationPoint(0.0f, 23.0f, 0.0f);
        (this.MiddleStick = new ModelRenderer((ModelBase)this, 12, 2)).addBox(-1.0f, 0.0f, -1.0f, 2, 28, 2);
        this.MiddleStick.setRotationPoint(0.0f, -5.0f, 0.0f);
        (this.LampShadeStick1 = new ModelRenderer((ModelBase)this, 0, 30)).addBox(0.0f, 0.0f, 0.0f, 5, 1, 1);
        this.LampShadeStick1.setRotationPoint(1.0f, -1.0f, -0.5f);
        (this.LampShadeStick2 = new ModelRenderer((ModelBase)this, 0, 30)).addBox(0.0f, 0.0f, 0.0f, 5, 1, 1);
        this.LampShadeStick2.setRotationPoint(-0.5f, -1.0f, -1.0f);
        this.setRotation(this.LampShadeStick2, 0.0f, 1.570796f, 0.0f);
        (this.LampShadeStick3 = new ModelRenderer((ModelBase)this, 0, 30)).addBox(0.0f, 0.0f, 0.0f, 5, 1, 1);
        this.LampShadeStick3.setRotationPoint(-1.0f, -1.0f, 0.5f);
        this.setRotation(this.LampShadeStick3, 0.0f, 3.141593f, 0.0f);
        (this.LampShadeStick4 = new ModelRenderer((ModelBase)this, 0, 30)).addBox(0.0f, 0.0f, 0.0f, 5, 1, 1);
        this.LampShadeStick4.setRotationPoint(0.5f, -1.0f, 1.0f);
        this.setRotation(this.LampShadeStick4, 0.0f, -1.570796f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Base.render(f5);
        this.MiddleStick.render(f5);
        this.LampShadeStick1.render(f5);
        this.LampShadeStick2.render(f5);
        this.LampShadeStick3.render(f5);
        this.LampShadeStick4.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelCandleCeiling extends ModelBase
{
    ModelRenderer Wax1;
    ModelRenderer Wax2;
    ModelRenderer Wax3;
    ModelRenderer Wax4;
    ModelRenderer TippyTop1;
    ModelRenderer TippyTop2;
    ModelRenderer Middle;
    ModelRenderer BottomBar1;
    ModelRenderer Rod1;
    ModelRenderer Rod2;
    ModelRenderer Rod3;
    ModelRenderer Rod4;
    ModelRenderer Base1;
    ModelRenderer Base2;
    ModelRenderer Base3;
    ModelRenderer Base4;
    ModelRenderer BottomBar3;
    ModelRenderer BottomBar2;
    ModelRenderer BottomBar4;
    
    public ModelCandleCeiling() {
        (this.Wax1 = new ModelRenderer((ModelBase)this, 16, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 4, 2);
        this.Wax1.setRotationPoint(-1.0f, 15.5f, 5.0f);
        (this.Wax2 = new ModelRenderer((ModelBase)this, 16, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 4, 2);
        this.Wax2.setRotationPoint(7.0f, 15.5f, 1.0f);
        this.setRotation(this.Wax2, 0.0f, 3.141593f, 0.0f);
        (this.Wax3 = new ModelRenderer((ModelBase)this, 16, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 4, 2);
        this.Wax3.setRotationPoint(-7.0f, 15.5f, -1.0f);
        (this.Wax4 = new ModelRenderer((ModelBase)this, 16, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 4, 2);
        this.Wax4.setRotationPoint(1.0f, 15.5f, -5.0f);
        this.setRotation(this.Wax4, 0.0f, 3.141593f, 0.0f);
        (this.TippyTop1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 4);
        this.TippyTop1.setRotationPoint(-2.8f, 7.5f, 0.0f);
        this.setRotation(this.TippyTop1, 0.0f, 0.7853982f, 0.0f);
        (this.TippyTop2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 1, 3);
        this.TippyTop2.setRotationPoint(-2.1f, 8.0f, 0.0f);
        this.setRotation(this.TippyTop2, 0.0f, 0.7853982f, 0.0f);
        (this.Middle = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 13, 1);
        this.Middle.setRotationPoint(-0.5f, 9.0f, -0.5f);
        (this.BottomBar1 = new ModelRenderer((ModelBase)this, 0, 4)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 5);
        this.BottomBar1.setRotationPoint(-0.5f, 21.0f, 0.5f);
        (this.Rod1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
        this.Rod1.setRotationPoint(-0.5f, 20.0f, 5.5f);
        (this.Rod2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
        this.Rod2.setRotationPoint(5.5f, 20.0f, -0.5f);
        (this.Rod3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
        this.Rod3.setRotationPoint(-6.5f, 20.0f, -0.5f);
        (this.Rod4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
        this.Rod4.setRotationPoint(-0.5f, 20.0f, -6.5f);
        (this.Base1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 4);
        this.Base1.setRotationPoint(-2.0f, 19.0f, 4.0f);
        (this.Base2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 4);
        this.Base2.setRotationPoint(4.0f, 19.0f, -2.0f);
        (this.Base3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 4);
        this.Base3.setRotationPoint(-8.0f, 19.0f, -2.0f);
        (this.Base4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 4);
        this.Base4.setRotationPoint(-2.0f, 19.0f, -8.0f);
        (this.BottomBar3 = new ModelRenderer((ModelBase)this, 0, 4)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 5);
        this.BottomBar3.setRotationPoint(-0.5f, 21.0f, -0.5f);
        this.setRotation(this.BottomBar3, 0.0f, -1.570796f, 0.0f);
        (this.BottomBar2 = new ModelRenderer((ModelBase)this, 0, 4)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 5);
        this.BottomBar2.setRotationPoint(0.5f, 21.0f, 0.5f);
        this.setRotation(this.BottomBar2, 0.0f, 1.570796f, 0.0f);
        (this.BottomBar4 = new ModelRenderer((ModelBase)this, 0, 4)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 5);
        this.BottomBar4.setRotationPoint(0.4f, 21.0f, -0.5f);
        this.setRotation(this.BottomBar4, 0.0f, 3.141593f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Wax1.render(f5);
        this.Wax2.render(f5);
        this.Wax3.render(f5);
        this.Wax4.render(f5);
        this.TippyTop1.render(f5);
        this.TippyTop2.render(f5);
        this.Middle.render(f5);
        this.BottomBar1.render(f5);
        this.Rod1.render(f5);
        this.Rod2.render(f5);
        this.Rod3.render(f5);
        this.Rod4.render(f5);
        this.Base1.render(f5);
        this.Base2.render(f5);
        this.Base3.render(f5);
        this.Base4.render(f5);
        this.BottomBar3.render(f5);
        this.BottomBar2.render(f5);
        this.BottomBar4.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

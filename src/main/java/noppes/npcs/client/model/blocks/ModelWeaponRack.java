// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelWeaponRack extends ModelBase
{
    ModelRenderer Support_1;
    ModelRenderer Support_2;
    ModelRenderer Support_3;
    ModelRenderer Support_4;
    ModelRenderer Support_5;
    ModelRenderer Support_6;
    ModelRenderer Rung_1_A;
    ModelRenderer Rung_1_B;
    ModelRenderer Rung_1_C;
    ModelRenderer Rung_2_A;
    ModelRenderer Rung_2_B;
    ModelRenderer Rung_2_C;
    ModelRenderer Rung_3_A;
    ModelRenderer Rung_3_B;
    ModelRenderer Rung_3_C;
    ModelRenderer Cross_Top_1;
    ModelRenderer Cross_Top_2;
    ModelRenderer Bottom_Support_1;
    ModelRenderer Bottom_Support_2;
    ModelRenderer Middle_Support_1;
    
    public ModelWeaponRack() {
        (this.Support_1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 30, 2);
        this.Support_1.setRotationPoint(-5.0f, -6.9f, 5.0f);
        (this.Support_2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 30, 2);
        this.Support_2.setRotationPoint(-8.01f, -6.9f, 5.0f);
        (this.Support_3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 30, 2);
        this.Support_3.setRotationPoint(-2.0f, -6.9f, 5.0f);
        (this.Support_4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 30, 2);
        this.Support_4.setRotationPoint(1.0f, -6.9f, 5.0f);
        (this.Support_5 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 30, 2);
        this.Support_5.setRotationPoint(4.0f, -6.9f, 5.0f);
        (this.Support_6 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 30, 2);
        this.Support_6.setRotationPoint(7.01f, -6.9f, 5.0f);
        (this.Rung_1_A = new ModelRenderer((ModelBase)this, 0, 22)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 0);
        this.Rung_1_A.setRotationPoint(-8.0f, 11.0f, 3.99f);
        (this.Rung_1_B = new ModelRenderer((ModelBase)this, 0, 24)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.Rung_1_B.setRotationPoint(-8.0f, 11.0f, 4.0f);
        (this.Rung_1_C = new ModelRenderer((ModelBase)this, 0, 24)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.Rung_1_C.setRotationPoint(-5.0f, 11.0f, 4.0f);
        (this.Rung_2_A = new ModelRenderer((ModelBase)this, 0, 22)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 0);
        this.Rung_2_A.setRotationPoint(-2.0f, 11.0f, 3.99f);
        (this.Rung_2_B = new ModelRenderer((ModelBase)this, 0, 24)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.Rung_2_B.setRotationPoint(-2.0f, 11.0f, 4.0f);
        (this.Rung_2_C = new ModelRenderer((ModelBase)this, 0, 24)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.Rung_2_C.setRotationPoint(1.0f, 11.0f, 4.0f);
        (this.Rung_3_A = new ModelRenderer((ModelBase)this, 0, 22)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 0);
        this.Rung_3_A.setRotationPoint(4.0f, 11.0f, 3.99f);
        (this.Rung_3_B = new ModelRenderer((ModelBase)this, 0, 24)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.Rung_3_B.setRotationPoint(4.0f, 11.0f, 4.0f);
        (this.Rung_3_C = new ModelRenderer((ModelBase)this, 0, 24)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
        this.Rung_3_C.setRotationPoint(7.0f, 11.0f, 4.0f);
        (this.Cross_Top_1 = new ModelRenderer((ModelBase)this, 6, 0)).addBox(0.0f, 0.0f, 0.0f, 16, 2, 1);
        this.Cross_Top_1.setRotationPoint(-8.0f, -8.6f, 6.0f);
        this.setRotation(this.Cross_Top_1, -0.5235988f, 0.0f, 0.0f);
        (this.Cross_Top_2 = new ModelRenderer((ModelBase)this, 6, 0)).addBox(0.0f, 0.0f, 0.0f, 16, 2, 1);
        this.Cross_Top_2.setRotationPoint(-8.0f, -8.6f, 6.01f);
        (this.Bottom_Support_1 = new ModelRenderer((ModelBase)this, 6, 0)).addBox(0.0f, 0.0f, 0.0f, 16, 2, 1);
        this.Bottom_Support_1.setRotationPoint(-8.0f, 23.0f, 6.0f);
        this.setRotation(this.Bottom_Support_1, -1.570796f, 0.0f, 0.0f);
        (this.Bottom_Support_2 = new ModelRenderer((ModelBase)this, 6, 0)).addBox(0.0f, 0.0f, 0.0f, 16, 2, 1);
        this.Bottom_Support_2.setRotationPoint(-8.0f, 23.0f, 8.0f);
        this.setRotation(this.Bottom_Support_2, -1.570796f, 0.0f, 0.0f);
        (this.Middle_Support_1 = new ModelRenderer((ModelBase)this, 6, 3)).addBox(0.0f, 0.0f, 0.0f, 16, 1, 3);
        this.Middle_Support_1.setRotationPoint(-8.0f, 10.0f, 7.01f);
        this.setRotation(this.Middle_Support_1, -1.570796f, 0.0f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Support_1.render(f5);
        this.Support_2.render(f5);
        this.Support_3.render(f5);
        this.Support_4.render(f5);
        this.Support_5.render(f5);
        this.Support_6.render(f5);
        this.Rung_1_A.render(f5);
        this.Rung_1_B.render(f5);
        this.Rung_1_C.render(f5);
        this.Rung_2_A.render(f5);
        this.Rung_2_B.render(f5);
        this.Rung_2_C.render(f5);
        this.Rung_3_A.render(f5);
        this.Rung_3_B.render(f5);
        this.Rung_3_C.render(f5);
        this.Cross_Top_1.render(f5);
        this.Cross_Top_2.render(f5);
        this.Bottom_Support_1.render(f5);
        this.Bottom_Support_2.render(f5);
        this.Middle_Support_1.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

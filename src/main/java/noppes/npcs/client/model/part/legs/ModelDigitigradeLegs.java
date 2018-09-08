// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.part.legs;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.model.ModelMPM;
import net.minecraft.client.model.ModelRenderer;

public class ModelDigitigradeLegs extends ModelRenderer
{
    private ModelRenderer rightleg;
    private ModelRenderer rightleg2;
    private ModelRenderer rightleglow;
    private ModelRenderer rightfoot;
    private ModelRenderer leftleg;
    private ModelRenderer leftleg2;
    private ModelRenderer leftleglow;
    private ModelRenderer leftfoot;
    public boolean isRiding;
    public boolean isSneaking;
    public boolean isSleeping;
    public boolean isCrawling;
    private ModelMPM base;
    
    public ModelDigitigradeLegs(final ModelMPM base) {
        super((ModelBase)base);
        this.isRiding = false;
        this.isSneaking = false;
        this.isSleeping = false;
        this.isCrawling = false;
        this.base = base;
        (this.rightleg = new ModelRenderer((ModelBase)base, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
        this.rightleg.setRotationPoint(-2.1f, 11.0f, 0.0f);
        this.setRotation(this.rightleg, -0.3f, 0.0f, 0.0f);
        this.addChild(this.rightleg);
        (this.rightleg2 = new ModelRenderer((ModelBase)base, 0, 20)).addBox(-1.5f, -1.0f, -2.0f, 3, 7, 3);
        this.rightleg2.setRotationPoint(0.0f, 4.1f, 0.0f);
        this.setRotation(this.rightleg2, 1.1f, 0.0f, 0.0f);
        this.rightleg.addChild(this.rightleg2);
        (this.rightleglow = new ModelRenderer((ModelBase)base, 0, 24)).addBox(-1.5f, 0.0f, -1.0f, 3, 5, 2);
        this.rightleglow.setRotationPoint(0.0f, 5.0f, 0.0f);
        this.setRotation(this.rightleglow, -1.35f, 0.0f, 0.0f);
        this.rightleg2.addChild(this.rightleglow);
        (this.rightfoot = new ModelRenderer((ModelBase)base, 1, 26)).addBox(-1.5f, 0.0f, -5.0f, 3, 2, 4);
        this.rightfoot.setRotationPoint(0.0f, 3.7f, 1.2f);
        this.setRotation(this.rightfoot, 0.55f, 0.0f, 0.0f);
        this.rightleglow.addChild(this.rightfoot);
        this.leftleg = new ModelRenderer((ModelBase)base, 0, 16);
        this.leftleg.mirror = true;
        this.leftleg.addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
        this.leftleg.setRotationPoint(2.1f, 11.0f, 0.0f);
        this.setRotation(this.leftleg, -0.3f, 0.0f, 0.0f);
        this.addChild(this.leftleg);
        this.leftleg2 = new ModelRenderer((ModelBase)base, 0, 20);
        this.leftleg2.mirror = true;
        this.leftleg2.addBox(-1.5f, -1.0f, -2.0f, 3, 7, 3);
        this.leftleg2.setRotationPoint(0.0f, 4.1f, 0.0f);
        this.setRotation(this.leftleg2, 1.1f, 0.0f, 0.0f);
        this.leftleg.addChild(this.leftleg2);
        this.leftleglow = new ModelRenderer((ModelBase)base, 0, 24);
        this.leftleglow.mirror = true;
        this.leftleglow.addBox(-1.5f, 0.0f, -1.0f, 3, 5, 2);
        this.leftleglow.setRotationPoint(0.0f, 5.0f, 0.0f);
        this.setRotation(this.leftleglow, -1.35f, 0.0f, 0.0f);
        this.leftleg2.addChild(this.leftleglow);
        this.leftfoot = new ModelRenderer((ModelBase)base, 1, 26);
        this.leftfoot.mirror = true;
        this.leftfoot.addBox(-1.5f, 0.0f, -5.0f, 3, 2, 4);
        this.leftfoot.setRotationPoint(0.0f, 3.7f, 1.2f);
        this.setRotation(this.leftfoot, 0.55f, 0.0f, 0.0f);
        this.leftleglow.addChild(this.leftfoot);
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity) {
        this.rightleg.rotateAngleX = this.base.bipedRightLeg.rotateAngleX - 0.3f;
        this.leftleg.rotateAngleX = this.base.bipedLeftLeg.rotateAngleX - 0.3f;
        this.rightleg.rotationPointY = this.base.bipedRightLeg.rotationPointY;
        this.leftleg.rotationPointY = this.base.bipedLeftLeg.rotationPointY;
        this.rightleg.rotationPointZ = this.base.bipedRightLeg.rotationPointZ;
        this.leftleg.rotationPointZ = this.base.bipedLeftLeg.rotationPointZ;
        if (!this.base.isSneak) {
            final ModelRenderer leftleg = this.leftleg;
            --leftleg.rotationPointY;
            final ModelRenderer rightleg = this.rightleg;
            --rightleg.rotationPointY;
        }
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.part;

import noppes.npcs.ModelData;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.model.ModelMPM;
import net.minecraft.client.model.ModelRenderer;
import noppes.npcs.client.model.util.Model2DRenderer;
import noppes.npcs.client.model.util.ModelPartInterface;

public class ModelBreasts extends ModelPartInterface
{
    private Model2DRenderer breasts;
    private ModelRenderer breasts2;
    private ModelRenderer breasts3;
    
    public ModelBreasts(final ModelMPM base) {
        super(base);
        (this.breasts = new Model2DRenderer((ModelBase)base, 20.0f, 22.0f, 8, 3, 64.0f, 32.0f)).setRotationPoint(-3.6f, 5.2f, -3.0f);
        this.breasts.setScale(0.17f, 0.19f);
        this.breasts.setThickness(1.0f);
        this.addChild((ModelRenderer)this.breasts);
        this.addChild(this.breasts2 = new ModelRenderer((ModelBase)base));
        final Model2DRenderer bottom = new Model2DRenderer((ModelBase)base, 20.0f, 22.0f, 8, 4, 64.0f, 32.0f);
        bottom.setRotationPoint(-3.6f, 5.0f, -3.1f);
        bottom.setScale(0.225f, 0.2f);
        bottom.setThickness(2.0f);
        bottom.rotateAngleX = -0.31415927f;
        this.breasts2.addChild((ModelRenderer)bottom);
        this.addChild(this.breasts3 = new ModelRenderer((ModelBase)base));
        final Model2DRenderer right = new Model2DRenderer((ModelBase)base, 20.0f, 22.0f, 3, 2, 64.0f, 32.0f);
        right.setRotationPoint(-3.8f, 5.3f, -3.6f);
        right.setScale(0.12f, 0.14f);
        right.setThickness(1.75f);
        this.breasts3.addChild((ModelRenderer)right);
        final Model2DRenderer right2 = new Model2DRenderer((ModelBase)base, 20.0f, 22.0f, 3, 1, 64.0f, 32.0f);
        right2.setRotationPoint(-3.8f, 4.1f, -3.14f);
        right2.setScale(0.06f, 0.07f);
        right2.setThickness(1.75f);
        right2.rotateAngleX = 0.34906584f;
        this.breasts3.addChild((ModelRenderer)right2);
        final Model2DRenderer right3 = new Model2DRenderer((ModelBase)base, 20.0f, 24.0f, 3, 1, 64.0f, 32.0f);
        right3.setRotationPoint(-3.8f, 5.3f, -3.6f);
        right3.setScale(0.06f, 0.07f);
        right3.setThickness(1.75f);
        right3.rotateAngleX = -0.34906584f;
        this.breasts3.addChild((ModelRenderer)right3);
        final Model2DRenderer right4 = new Model2DRenderer((ModelBase)base, 23.0f, 22.0f, 1, 2, 64.0f, 32.0f);
        right4.setRotationPoint(-1.8f, 5.3f, -3.14f);
        right4.setScale(0.12f, 0.14f);
        right4.setThickness(1.75f);
        right4.rotateAngleY = 0.34906584f;
        this.breasts3.addChild((ModelRenderer)right4);
        final Model2DRenderer left = new Model2DRenderer((ModelBase)base, 25.0f, 22.0f, 3, 2, 64.0f, 32.0f);
        left.setRotationPoint(0.8f, 5.3f, -3.6f);
        left.setScale(0.12f, 0.14f);
        left.setThickness(1.75f);
        this.breasts3.addChild((ModelRenderer)left);
        final Model2DRenderer left2 = new Model2DRenderer((ModelBase)base, 25.0f, 22.0f, 3, 1, 64.0f, 32.0f);
        left2.setRotationPoint(0.8f, 4.1f, -3.18f);
        left2.setScale(0.06f, 0.07f);
        left2.setThickness(1.75f);
        left2.rotateAngleX = 0.34906584f;
        this.breasts3.addChild((ModelRenderer)left2);
        final Model2DRenderer left3 = new Model2DRenderer((ModelBase)base, 25.0f, 24.0f, 3, 1, 64.0f, 32.0f);
        left3.setRotationPoint(0.8f, 5.3f, -3.6f);
        left3.setScale(0.06f, 0.07f);
        left3.setThickness(1.75f);
        left3.rotateAngleX = -0.34906584f;
        this.breasts3.addChild((ModelRenderer)left3);
        final Model2DRenderer left4 = new Model2DRenderer((ModelBase)base, 24.0f, 22.0f, 1, 2, 64.0f, 32.0f);
        left4.setRotationPoint(0.8f, 5.3f, -3.6f);
        left4.setScale(0.12f, 0.14f);
        left4.setThickness(1.75f);
        left4.rotateAngleY = -0.34906584f;
        this.breasts3.addChild((ModelRenderer)left4);
    }
    
    @Override
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity) {
    }
    
    @Override
    public void initData(final ModelData data) {
        this.isHidden = (data.breasts == 0);
        this.breasts.isHidden = (data.breasts != 1);
        this.breasts2.isHidden = (data.breasts != 2);
        this.breasts3.isHidden = (data.breasts != 3);
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.part;

import noppes.npcs.ModelPartData;
import noppes.npcs.ModelData;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.model.ModelMPM;
import noppes.npcs.client.model.util.Model2DRenderer;
import noppes.npcs.client.model.util.ModelPartInterface;

public class ModelWings extends ModelPartInterface
{
    private Model2DRenderer lWing;
    private Model2DRenderer rWing;
    
    public ModelWings(final ModelMPM base) {
        super(base);
        this.lWing = new Model2DRenderer((ModelBase)base, 56.0f, 16.0f, 8, 16, 64.0f, 32.0f);
        this.lWing.mirror = true;
        this.lWing.setRotationPoint(2.0f, 4.0f, 2.0f);
        this.lWing.setRotationOffset(-16.0f, -12.0f);
        this.setRotation(this.lWing, 0.7141593f, -0.5235988f, -0.5090659f);
        this.addChild((ModelRenderer)this.lWing);
        (this.rWing = new Model2DRenderer((ModelBase)base, 56.0f, 16.0f, 8, 16, 64.0f, 32.0f)).setRotationPoint(-2.0f, 4.0f, 2.0f);
        this.rWing.setRotationOffset(-16.0f, -12.0f);
        this.setRotation(this.rWing, 0.7141593f, 0.5235988f, 0.5090659f);
        this.addChild((ModelRenderer)this.rWing);
    }
    
    @Override
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity) {
        this.rWing.rotateAngleX = 0.7141593f;
        this.rWing.rotateAngleZ = 0.5090659f;
        this.lWing.rotateAngleX = 0.7141593f;
        this.lWing.rotateAngleZ = -0.5090659f;
        final float motion = Math.abs(MathHelper.sin(par1 * 0.033f + 3.1415927f) * 0.4f) * par2;
        if (!entity.onGround || motion > 0.01) {
            final float speed = 0.55f + 0.5f * motion;
            final float y = MathHelper.sin(par3 * 0.67f);
            final Model2DRenderer rWing = this.rWing;
            rWing.rotateAngleZ += y * 0.5f * speed;
            final Model2DRenderer rWing2 = this.rWing;
            rWing2.rotateAngleX += y * 0.5f * speed;
            final Model2DRenderer lWing = this.lWing;
            lWing.rotateAngleZ -= y * 0.5f * speed;
            final Model2DRenderer lWing2 = this.lWing;
            lWing2.rotateAngleX += y * 0.5f * speed;
        }
        else {
            final Model2DRenderer lWing3 = this.lWing;
            lWing3.rotateAngleZ += MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
            final Model2DRenderer rWing3 = this.rWing;
            rWing3.rotateAngleZ -= MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
            final Model2DRenderer lWing4 = this.lWing;
            lWing4.rotateAngleX += MathHelper.sin(par3 * 0.067f) * 0.05f;
            final Model2DRenderer rWing4 = this.rWing;
            rWing4.rotateAngleX += MathHelper.sin(par3 * 0.067f) * 0.05f;
        }
    }
    
    @Override
    public void initData(final ModelData data) {
        final ModelPartData config = data.getPartData("wings");
        if (config == null) {
            this.isHidden = true;
            return;
        }
        this.color = config.color;
        this.isHidden = false;
        if (!config.playerTexture) {
            this.location = config.getResource();
        }
        else {
            this.location = null;
        }
    }
}

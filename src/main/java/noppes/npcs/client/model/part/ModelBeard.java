// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.part;

import noppes.npcs.ModelPartData;
import noppes.npcs.ModelData;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.model.ModelMPM;
import noppes.npcs.client.model.util.Model2DRenderer;
import noppes.npcs.client.model.util.ModelPartInterface;

public class ModelBeard extends ModelPartInterface
{
    private Model2DRenderer model;
    
    public ModelBeard(final ModelMPM base) {
        super(base);
        (this.model = new Model2DRenderer((ModelBase)base, 56.0f, 20.0f, 8, 12, 64.0f, 32.0f)).setRotationPoint(-3.99f, 11.9f, -4.0f);
        this.model.setScale(0.74f);
        this.addChild((ModelRenderer)this.model);
    }
    
    @Override
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity) {
        if (this.base.bipedHead.rotateAngleX > 0.0f) {
            this.rotateAngleX = -this.base.bipedHead.rotateAngleX;
        }
        else {
            this.rotateAngleX = 0.0f;
        }
    }
    
    @Override
    public void initData(final ModelData data) {
        final ModelPartData config = data.getPartData("beard");
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

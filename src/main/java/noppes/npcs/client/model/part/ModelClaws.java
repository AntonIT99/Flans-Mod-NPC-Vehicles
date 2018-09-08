// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.part;

import noppes.npcs.ModelPartData;
import noppes.npcs.ModelData;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.model.ModelMPM;
import noppes.npcs.client.model.util.Model2DRenderer;
import noppes.npcs.client.model.util.ModelPartInterface;

public class ModelClaws extends ModelPartInterface
{
    private Model2DRenderer model;
    private boolean isRight;
    
    public ModelClaws(final ModelMPM base, final boolean isRight) {
        super(base);
        this.isRight = false;
        this.isRight = isRight;
        this.model = new Model2DRenderer((ModelBase)base, 0.0f, 16.0f, 4, 4, 64.0f, 32.0f);
        if (isRight) {
            this.model.setRotationPoint(-2.0f, 14.0f, -2.0f);
        }
        else {
            this.model.setRotationPoint(3.0f, 14.0f, -2.0f);
        }
        this.model.rotateAngleY = -1.5707964f;
        this.model.setScale(0.25f);
        this.addChild((ModelRenderer)this.model);
    }
    
    @Override
    public void initData(final ModelData data) {
        final ModelPartData config = data.getPartData("claws");
        if (config == null || (this.isRight && config.type == 1) || (!this.isRight && config.type == 2)) {
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

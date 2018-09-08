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

public class ModelFin extends ModelPartInterface
{
    private Model2DRenderer model;
    
    public ModelFin(final ModelMPM base) {
        super(base);
        (this.model = new Model2DRenderer((ModelBase)base, 56.0f, 20.0f, 8, 12, 64.0f, 32.0f)).setRotationPoint(-0.5f, 12.0f, 10.0f);
        this.model.setScale(0.74f);
        this.model.rotateAngleY = 1.5707964f;
        this.addChild((ModelRenderer)this.model);
    }
    
    @Override
    public void initData(final ModelData data) {
        final ModelPartData config = data.getPartData("fin");
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

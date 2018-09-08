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

public class ModelMohawk extends ModelPartInterface
{
    private Model2DRenderer model;
    
    public ModelMohawk(final ModelMPM base) {
        super(base);
        (this.model = new Model2DRenderer((ModelBase)base, 0, 0, 13, 13)).setRotationPoint(-0.5f, 0.0f, 9.0f);
        this.setRotation(this.model, 0.0f, 1.5707964f, 0.0f);
        this.model.setScale(0.825f);
        this.addChild((ModelRenderer)this.model);
    }
    
    @Override
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity) {
    }
    
    @Override
    public void initData(final ModelData data) {
        final ModelPartData config = data.getPartData("mohawk");
        if (config == null) {
            this.isHidden = true;
            return;
        }
        this.color = config.color;
        this.isHidden = false;
        this.location = config.getResource();
    }
}

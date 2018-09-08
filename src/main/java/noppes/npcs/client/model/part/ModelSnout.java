// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.part;

import noppes.npcs.ModelPartData;
import noppes.npcs.ModelData;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.model.ModelMPM;
import net.minecraft.client.model.ModelRenderer;
import noppes.npcs.client.model.util.ModelPartInterface;

public class ModelSnout extends ModelPartInterface
{
    private ModelRenderer small;
    private ModelRenderer medium;
    private ModelRenderer large;
    private ModelRenderer bunny;
    
    public ModelSnout(final ModelMPM base) {
        super(base);
        (this.small = new ModelRenderer((ModelBase)base, 24, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 3, 1);
        this.small.setRotationPoint(-2.0f, -3.0f, -5.0f);
        this.addChild(this.small);
        (this.medium = new ModelRenderer((ModelBase)base, 24, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 3, 2);
        this.medium.setRotationPoint(-2.0f, -3.0f, -6.0f);
        this.addChild(this.medium);
        (this.large = new ModelRenderer((ModelBase)base, 24, 0)).addBox(0.0f, 0.0f, 0.0f, 4, 3, 3);
        this.large.setRotationPoint(-2.0f, -3.0f, -7.0f);
        this.addChild(this.large);
        (this.bunny = new ModelRenderer((ModelBase)base, 24, 0)).addBox(1.0f, 1.0f, 0.0f, 4, 2, 1);
        this.bunny.setRotationPoint(-3.0f, -4.0f, -5.0f);
        this.addChild(this.bunny);
        final ModelRenderer tooth = new ModelRenderer((ModelBase)base, 24, 3);
        tooth.addBox(2.0f, 3.0f, 0.0f, 2, 1, 1);
        tooth.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bunny.addChild(tooth);
    }
    
    @Override
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity) {
    }
    
    @Override
    public void initData(final ModelData data) {
        final ModelPartData config = data.getPartData("snout");
        if (config == null) {
            this.isHidden = true;
            return;
        }
        this.color = config.color;
        this.isHidden = false;
        this.small.isHidden = (config.type != 0);
        this.medium.isHidden = (config.type != 1);
        this.large.isHidden = (config.type != 2);
        this.bunny.isHidden = (config.type != 3);
        if (!config.playerTexture) {
            this.location = config.getResource();
        }
        else {
            this.location = null;
        }
    }
}

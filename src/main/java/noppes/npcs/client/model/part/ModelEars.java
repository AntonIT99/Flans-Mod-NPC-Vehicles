// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.part;

import noppes.npcs.ModelPartData;
import noppes.npcs.ModelData;
import noppes.npcs.client.model.util.Model2DRenderer;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.model.ModelMPM;
import net.minecraft.client.model.ModelRenderer;
import noppes.npcs.client.model.util.ModelPartInterface;

public class ModelEars extends ModelPartInterface
{
    private ModelRenderer ears;
    private ModelRenderer bunny;
    
    public ModelEars(final ModelMPM par1ModelBase) {
        super(par1ModelBase);
        this.addChild(this.ears = new ModelRenderer((ModelBase)this.base));
        final Model2DRenderer right = new Model2DRenderer((ModelBase)this.base, 56.0f, 0.0f, 8, 4, 64.0f, 32.0f);
        right.setRotationPoint(-7.44f, -7.3f, -0.0f);
        right.setScale(0.234f, 0.234f);
        right.setThickness(1.16f);
        this.ears.addChild((ModelRenderer)right);
        final Model2DRenderer left = new Model2DRenderer((ModelBase)this.base, 56.0f, 0.0f, 8, 4, 64.0f, 32.0f);
        left.setRotationPoint(7.44f, -7.3f, 1.15f);
        left.setScale(0.234f, 0.234f);
        this.setRotation(left, 0.0f, 3.1415927f, 0.0f);
        left.setThickness(1.16f);
        this.ears.addChild((ModelRenderer)left);
        final Model2DRenderer right2 = new Model2DRenderer((ModelBase)this.base, 56.0f, 4.0f, 8, 4, 64.0f, 32.0f);
        right2.setRotationPoint(-7.44f, -7.3f, 1.14f);
        right2.setScale(0.234f, 0.234f);
        right2.setThickness(1.16f);
        this.ears.addChild((ModelRenderer)right2);
        final Model2DRenderer left2 = new Model2DRenderer((ModelBase)this.base, 56.0f, 4.0f, 8, 4, 64.0f, 32.0f);
        left2.setRotationPoint(7.44f, -7.3f, 2.31f);
        left2.setScale(0.234f, 0.234f);
        this.setRotation(left2, 0.0f, 3.1415927f, 0.0f);
        left2.setThickness(1.16f);
        this.ears.addChild((ModelRenderer)left2);
        this.addChild(this.bunny = new ModelRenderer((ModelBase)this.base));
        final ModelRenderer earleft = new ModelRenderer((ModelBase)this.base, 56, 0);
        earleft.mirror = true;
        earleft.addBox(-1.466667f, -4.0f, 0.0f, 3, 7, 1);
        earleft.setRotationPoint(2.533333f, -11.0f, 0.0f);
        this.bunny.addChild(earleft);
        final ModelRenderer earright = new ModelRenderer((ModelBase)this.base, 56, 0);
        earright.addBox(-1.5f, -4.0f, 0.0f, 3, 7, 1);
        earright.setRotationPoint(-2.466667f, -11.0f, 0.0f);
        this.bunny.addChild(earright);
    }
    
    @Override
    public void initData(final ModelData data) {
        final ModelPartData config = data.getPartData("ears");
        if (config == null) {
            this.isHidden = true;
            return;
        }
        this.isHidden = false;
        this.color = config.color;
        this.ears.isHidden = (config.type != 0);
        this.bunny.isHidden = (config.type != 1);
        if (!config.playerTexture) {
            this.location = config.getResource();
        }
        else {
            this.location = null;
        }
    }
}

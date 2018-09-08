// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelCouchRightWool extends ModelBase
{
    ModelRenderer Wool1;
    ModelRenderer Wool2;
    
    public ModelCouchRightWool() {
        this.Wool1 = new ModelRenderer((ModelBase)this, 3, 0);
        this.Wool1.mirror = true;
        this.Wool1.addBox(0.0f, 0.0f, 0.0f, 14, 5, 13);
        this.Wool1.setRotationPoint(-8.0f, 16.0f, -6.0f);
        this.Wool2 = new ModelRenderer((ModelBase)this, 14, 0);
        this.Wool2.mirror = true;
        this.Wool2.addBox(0.0f, 0.0f, 0.0f, 14, 10, 2);
        this.Wool2.setRotationPoint(-8.0f, 6.0f, 5.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Wool1.render(f5);
        this.Wool2.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

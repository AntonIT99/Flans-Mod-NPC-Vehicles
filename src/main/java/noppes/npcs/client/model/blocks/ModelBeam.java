// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelBeam extends ModelBase
{
    ModelRenderer Bar;
    
    public ModelBeam() {
        (this.Bar = new ModelRenderer((ModelBase)this, 6, 6)).addBox(0.0f, 0.0f, 0.0f, 5, 5, 12);
        this.Bar.setRotationPoint(-2.5f, 13.5f, -4.0f);
        this.Bar.setTextureSize(64, 32);
        this.Bar.mirror = true;
        this.setRotation(this.Bar, 0.0f, 0.0f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Bar.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

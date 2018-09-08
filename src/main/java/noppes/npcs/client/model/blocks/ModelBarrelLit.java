// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelBarrelLit extends ModelBase
{
    ModelRenderer Top;
    ModelRenderer Bottom;
    
    public ModelBarrelLit() {
        (this.Top = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 16, 0, 16);
        this.Top.setRotationPoint(-8.0f, 9.0f, -8.0f);
        (this.Bottom = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 16, 0, 16);
        this.Bottom.setRotationPoint(-8.0f, 23.0f, -8.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Bottom.render(f5);
        this.Top.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = y;
        model.rotateAngleY = x;
        model.rotateAngleZ = z;
    }
}

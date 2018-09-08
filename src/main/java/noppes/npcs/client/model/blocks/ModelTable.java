// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelTable extends ModelBase
{
    public ModelRenderer Shape1;
    public ModelRenderer Table;
    public ModelRenderer Shape3;
    public ModelRenderer Shape4;
    public ModelRenderer Shape5;
    
    public ModelTable() {
        this.Shape1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape1.mirror = true;
        this.Shape1.addBox(-1.0f, 0.0f, -1.0f, 2, 14, 2);
        this.Shape1.setRotationPoint(-6.0f, 10.0f, 6.0f);
        (this.Table = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, -2.0f, 0.0f, 16, 2, 16);
        this.Table.setRotationPoint(-8.0f, 10.0f, -8.0f);
        (this.Shape3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-1.0f, 0.0f, -1.0f, 2, 14, 2);
        this.Shape3.setRotationPoint(6.0f, 10.0f, -6.0f);
        (this.Shape4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-1.0f, 0.0f, -1.0f, 2, 14, 2);
        this.Shape4.setRotationPoint(6.0f, 10.0f, 6.0f);
        this.Shape5 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape5.mirror = true;
        this.Shape5.addBox(-1.0f, 0.0f, -1.0f, 2, 14, 2);
        this.Shape5.setRotationPoint(-6.0f, 10.0f, -6.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Shape1.render(f5);
        this.Shape3.render(f5);
        this.Shape4.render(f5);
        this.Shape5.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

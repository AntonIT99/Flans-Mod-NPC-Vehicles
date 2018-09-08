// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelTombstone1 extends ModelBase
{
    ModelRenderer Mid;
    ModelRenderer OuterEdge1;
    ModelRenderer OuterEdge2;
    ModelRenderer OuterEdgeTop;
    
    public ModelTombstone1() {
        (this.Mid = new ModelRenderer((ModelBase)this, 36, 0)).addBox(0.0f, 0.0f, 0.0f, 10, 14, 3);
        this.Mid.setRotationPoint(-5.0f, 10.0f, -1.5f);
        (this.OuterEdge1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 16, 4);
        this.OuterEdge1.setRotationPoint(-7.0f, 8.0f, -2.0f);
        this.OuterEdge2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.OuterEdge2.mirror = true;
        this.OuterEdge2.addBox(1.0f, 0.0f, 0.0f, 2, 16, 4);
        this.OuterEdge2.setRotationPoint(4.0f, 8.0f, -2.0f);
        (this.OuterEdgeTop = new ModelRenderer((ModelBase)this, 0, 22)).addBox(0.0f, 0.0f, 0.0f, 10, 2, 4);
        this.OuterEdgeTop.setRotationPoint(-5.0f, 8.0f, -2.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Mid.render(f5);
        this.OuterEdge1.render(f5);
        this.OuterEdge2.render(f5);
        this.OuterEdgeTop.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.part.tails;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.model.ModelMPM;
import net.minecraft.client.model.ModelRenderer;

public class ModelSquirrelTail extends ModelRenderer
{
    private ModelMPM base;
    
    public ModelSquirrelTail(final ModelMPM base) {
        super((ModelBase)base);
        this.base = base;
        this.textureWidth = 64.0f;
        this.textureHeight = 32.0f;
        final ModelRenderer Shape1 = new ModelRenderer((ModelBase)base, 0, 0);
        Shape1.addBox(-1.0f, -1.0f, -1.0f, 2, 2, 3);
        Shape1.setRotationPoint(0.0f, -1.0f, 3.0f);
        this.setRotation(Shape1, 0.0f, 0.0f, 0.0f);
        this.addChild(Shape1);
        final ModelRenderer Shape2 = new ModelRenderer((ModelBase)base, 0, 9);
        Shape2.addBox(-2.0f, -5.0f, -1.0f, 4, 5, 3);
        Shape2.setRotationPoint(0.0f, 0.0f, 1.0f);
        this.setRotation(Shape2, -0.37f, 0.0f, 0.0f);
        Shape1.addChild(Shape2);
        final ModelRenderer Shape3 = new ModelRenderer((ModelBase)base, 0, 18);
        Shape3.addBox(-2.466667f, -6.0f, -1.0f, 5, 7, 3);
        Shape3.setRotationPoint(0.0f, -5.0f, 0.0f);
        this.setRotation(Shape3, 0.3f, 0.0f, 0.0f);
        Shape2.addChild(Shape3);
        final ModelRenderer Shape4 = new ModelRenderer((ModelBase)base, 25, 0);
        Shape4.addBox(-3.0f, -0.6f, -1.0f, 6, 5, 3);
        Shape4.setRotationPoint(0.0f, -5.0f, 1.0f);
        this.setRotation(Shape4, 2.5f, 0.0f, 0.0f);
        Shape3.addChild(Shape4);
        final ModelRenderer Shape5 = new ModelRenderer((ModelBase)base, 25, 10);
        Shape5.addBox(-3.0f, -2.0f, -1.0f, 6, 3, 5);
        Shape5.setRotationPoint(0.0f, 3.5f, 0.0f);
        this.setRotation(Shape5, -2.5f, 0.0f, 0.0f);
        Shape4.addChild(Shape5);
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity) {
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

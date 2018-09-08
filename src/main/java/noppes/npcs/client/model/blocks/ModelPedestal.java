// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelPedestal extends ModelBase
{
    ModelRenderer Main_Block;
    ModelRenderer Front;
    
    public ModelPedestal() {
        (this.Main_Block = new ModelRenderer((ModelBase)this, 1, 0)).addBox(-7.0f, 0.0f, -8.0f, 14, 3, 16);
        this.Main_Block.setRotationPoint(0.0f, 16.0f, 0.0f);
        (this.Front = new ModelRenderer((ModelBase)this, 16, 8)).addBox(-8.0f, 0.0f, -8.0f, 16, 5, 16);
        this.Front.setRotationPoint(0.0f, 19.0f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        GL11.glPushMatrix();
        GL11.glScalef(1.0f, 1.0f, 0.5f);
        this.Main_Block.render(f5);
        GL11.glScalef(1.0f, 1.0f, 1.25f);
        this.Front.render(f5);
        GL11.glPopMatrix();
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

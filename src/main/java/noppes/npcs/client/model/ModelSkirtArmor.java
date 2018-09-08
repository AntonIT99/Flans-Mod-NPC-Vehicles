// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model;

import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.model.util.ModelPlaneRenderer;
import net.minecraft.client.model.ModelBiped;

public class ModelSkirtArmor extends ModelBiped
{
    private ModelPlaneRenderer Shape1;
    
    public ModelSkirtArmor() {
        final float pi = 0.62831855f;
        (this.Shape1 = new ModelPlaneRenderer((ModelBase)this, 4, 20)).addSidePlane(0.0f, 0.0f, 0.0f, 9, 2);
        final ModelPlaneRenderer part1 = new ModelPlaneRenderer((ModelBase)this, 6, 20);
        part1.addSidePlane(2.0f, 0.0f, 0.0f, 9, 2);
        part1.rotateAngleY = -1.5707964f;
        this.Shape1.addChild((ModelRenderer)part1);
        this.Shape1.setRotationPoint(2.4f, 8.8f, 0.0f);
        this.setRotation(this.Shape1, 0.3f, -0.2f, -0.2f);
    }
    
    public void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.0f, this.bipedRightLeg.rotationPointZ * par7);
        GL11.glScalef(1.6f, 1.04f, 1.6f);
        for (int i = 0; i < 10; ++i) {
            GL11.glRotatef(36.0f, 0.0f, 1.0f, 0.0f);
            this.Shape1.render(par7);
        }
        GL11.glPopMatrix();
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        this.setRotation(this.Shape1, 0.3f, -0.2f, -0.2f);
        this.isSneak = par7Entity.isSneaking();
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
        final ModelPlaneRenderer shape1 = this.Shape1;
        shape1.rotateAngleX += this.bipedLeftArm.rotateAngleX * 0.02f;
        final ModelPlaneRenderer shape2 = this.Shape1;
        shape2.rotateAngleZ += this.bipedLeftArm.rotateAngleX * 0.06f;
        final ModelPlaneRenderer shape3 = this.Shape1;
        shape3.rotateAngleZ -= MathHelper.cos(par3 * 0.09f) * 0.02f - 0.05f;
    }
}

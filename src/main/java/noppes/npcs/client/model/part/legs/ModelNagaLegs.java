// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.part.legs;

import org.lwjgl.opengl.GL11;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import noppes.npcs.client.model.util.ModelPlaneRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelNagaLegs extends ModelRenderer
{
    private ModelRenderer nagaPart1;
    private ModelRenderer nagaPart2;
    private ModelRenderer nagaPart3;
    private ModelRenderer nagaPart4;
    private ModelRenderer nagaPart5;
    public boolean isRiding;
    public boolean isSneaking;
    public boolean isSleeping;
    public boolean isCrawling;
    
    public ModelNagaLegs(final ModelBase base) {
        super(base);
        this.isRiding = false;
        this.isSneaking = false;
        this.isSleeping = false;
        this.isCrawling = false;
        this.nagaPart1 = new ModelRenderer(base, 0, 0);
        ModelRenderer legPart = new ModelRenderer(base, 0, 16);
        legPart.addBox(0.0f, -2.0f, -2.0f, 4, 4, 4);
        legPart.setRotationPoint(-4.0f, 0.0f, 0.0f);
        this.nagaPart1.addChild(legPart);
        legPart = new ModelRenderer(base, 0, 16);
        legPart.mirror = true;
        legPart.addBox(0.0f, -2.0f, -2.0f, 4, 4, 4);
        this.nagaPart1.addChild(legPart);
        this.nagaPart2 = new ModelRenderer(base, 0, 0);
        this.nagaPart2.childModels = this.nagaPart1.childModels;
        this.nagaPart3 = new ModelRenderer(base, 0, 0);
        ModelPlaneRenderer plane = new ModelPlaneRenderer(base, 4, 24);
        plane.addBackPlane(0.0f, -2.0f, 0.0f, 4, 4);
        plane.setRotationPoint(-4.0f, 0.0f, 0.0f);
        this.nagaPart3.addChild((ModelRenderer)plane);
        plane = new ModelPlaneRenderer(base, 4, 24);
        plane.mirror = true;
        plane.addBackPlane(0.0f, -2.0f, 0.0f, 4, 4);
        this.nagaPart3.addChild((ModelRenderer)plane);
        plane = new ModelPlaneRenderer(base, 8, 24);
        plane.addBackPlane(0.0f, -2.0f, 6.0f, 4, 4);
        plane.setRotationPoint(-4.0f, 0.0f, 0.0f);
        this.nagaPart3.addChild((ModelRenderer)plane);
        plane = new ModelPlaneRenderer(base, 8, 24);
        plane.mirror = true;
        plane.addBackPlane(0.0f, -2.0f, 6.0f, 4, 4);
        this.nagaPart3.addChild((ModelRenderer)plane);
        plane = new ModelPlaneRenderer(base, 4, 26);
        plane.addTopPlane(0.0f, -2.0f, -6.0f, 4, 6);
        plane.setRotationPoint(-4.0f, 0.0f, 0.0f);
        plane.rotateAngleX = 3.1415927f;
        this.nagaPart3.addChild((ModelRenderer)plane);
        plane = new ModelPlaneRenderer(base, 4, 26);
        plane.mirror = true;
        plane.addTopPlane(0.0f, -2.0f, -6.0f, 4, 6);
        plane.rotateAngleX = 3.1415927f;
        this.nagaPart3.addChild((ModelRenderer)plane);
        plane = new ModelPlaneRenderer(base, 8, 26);
        plane.addTopPlane(0.0f, -2.0f, 0.0f, 4, 6);
        plane.setRotationPoint(-4.0f, 0.0f, 0.0f);
        this.nagaPart3.addChild((ModelRenderer)plane);
        plane = new ModelPlaneRenderer(base, 8, 26);
        plane.mirror = true;
        plane.addTopPlane(0.0f, -2.0f, 0.0f, 4, 6);
        this.nagaPart3.addChild((ModelRenderer)plane);
        plane = new ModelPlaneRenderer(base, 0, 26);
        plane.rotateAngleX = 1.5707964f;
        plane.addSidePlane(0.0f, 0.0f, -2.0f, 6, 4);
        plane.setRotationPoint(-4.0f, 0.0f, 0.0f);
        this.nagaPart3.addChild((ModelRenderer)plane);
        plane = new ModelPlaneRenderer(base, 0, 26);
        plane.rotateAngleX = 1.5707964f;
        plane.addSidePlane(4.0f, 0.0f, -2.0f, 6, 4);
        this.nagaPart3.addChild((ModelRenderer)plane);
        this.nagaPart4 = new ModelRenderer(base, 0, 0);
        this.nagaPart4.childModels = this.nagaPart3.childModels;
        this.nagaPart5 = new ModelRenderer(base, 0, 0);
        legPart = new ModelRenderer(base, 56, 20);
        legPart.addBox(0.0f, 0.0f, -2.0f, 2, 5, 2);
        legPart.setRotationPoint(-2.0f, 0.0f, 0.0f);
        legPart.rotateAngleX = 1.5707964f;
        this.nagaPart5.addChild(legPart);
        legPart = new ModelRenderer(base, 56, 20);
        legPart.mirror = true;
        legPart.addBox(0.0f, 0.0f, -2.0f, 2, 5, 2);
        legPart.rotateAngleX = 1.5707964f;
        this.nagaPart5.addChild(legPart);
        this.addChild(this.nagaPart1);
        this.addChild(this.nagaPart2);
        this.addChild(this.nagaPart3);
        this.addChild(this.nagaPart4);
        this.addChild(this.nagaPart5);
        this.nagaPart1.setRotationPoint(0.0f, 14.0f, 0.0f);
        this.nagaPart2.setRotationPoint(0.0f, 18.0f, 0.6f);
        this.nagaPart3.setRotationPoint(0.0f, 22.0f, -0.3f);
        this.nagaPart4.setRotationPoint(0.0f, 22.0f, 5.0f);
        this.nagaPart5.setRotationPoint(0.0f, 22.0f, 10.0f);
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity) {
        this.nagaPart1.rotateAngleY = MathHelper.cos(par1 * 0.6662f) * 0.26f * par2;
        this.nagaPart2.rotateAngleY = MathHelper.cos(par1 * 0.6662f) * 0.5f * par2;
        this.nagaPart3.rotateAngleY = MathHelper.cos(par1 * 0.6662f) * 0.26f * par2;
        this.nagaPart4.rotateAngleY = -MathHelper.cos(par1 * 0.6662f) * 0.16f * par2;
        this.nagaPart5.rotateAngleY = -MathHelper.cos(par1 * 0.6662f) * 0.3f * par2;
        this.nagaPart1.setRotationPoint(0.0f, 14.0f, 0.0f);
        this.nagaPart2.setRotationPoint(0.0f, 18.0f, 0.6f);
        this.nagaPart3.setRotationPoint(0.0f, 22.0f, -0.3f);
        this.nagaPart4.setRotationPoint(0.0f, 22.0f, 5.0f);
        this.nagaPart5.setRotationPoint(0.0f, 22.0f, 10.0f);
        this.nagaPart1.rotateAngleX = 0.0f;
        this.nagaPart2.rotateAngleX = 0.0f;
        this.nagaPart3.rotateAngleX = 0.0f;
        this.nagaPart4.rotateAngleX = 0.0f;
        this.nagaPart5.rotateAngleX = 0.0f;
        if (this.isSleeping || this.isCrawling) {
            this.nagaPart3.rotateAngleX = -1.5707964f;
            this.nagaPart4.rotateAngleX = -1.5707964f;
            this.nagaPart5.rotateAngleX = -1.5707964f;
            final ModelRenderer nagaPart3 = this.nagaPart3;
            nagaPart3.rotationPointY -= 2.0f;
            this.nagaPart3.rotationPointZ = 0.9f;
            final ModelRenderer nagaPart4 = this.nagaPart4;
            nagaPart4.rotationPointY += 4.0f;
            this.nagaPart4.rotationPointZ = 0.9f;
            final ModelRenderer nagaPart5 = this.nagaPart5;
            nagaPart5.rotationPointY += 7.0f;
            this.nagaPart5.rotationPointZ = 2.9f;
        }
        if (this.isRiding) {
            final ModelRenderer nagaPart6 = this.nagaPart1;
            --nagaPart6.rotationPointY;
            this.nagaPart1.rotateAngleX = -0.19634955f;
            this.nagaPart1.rotationPointZ = -1.0f;
            final ModelRenderer nagaPart7 = this.nagaPart2;
            nagaPart7.rotationPointY -= 4.0f;
            this.nagaPart2.rotationPointZ = -1.0f;
            final ModelRenderer nagaPart8 = this.nagaPart3;
            nagaPart8.rotationPointY -= 9.0f;
            final ModelRenderer nagaPart9 = this.nagaPart3;
            --nagaPart9.rotationPointZ;
            final ModelRenderer nagaPart10 = this.nagaPart4;
            nagaPart10.rotationPointY -= 13.0f;
            final ModelRenderer nagaPart11 = this.nagaPart4;
            --nagaPart11.rotationPointZ;
            final ModelRenderer nagaPart12 = this.nagaPart5;
            nagaPart12.rotationPointY -= 9.0f;
            final ModelRenderer nagaPart13 = this.nagaPart5;
            --nagaPart13.rotationPointZ;
            if (this.isSneaking) {
                final ModelRenderer nagaPart14 = this.nagaPart1;
                nagaPart14.rotationPointZ += 5.0f;
                final ModelRenderer nagaPart15 = this.nagaPart3;
                nagaPart15.rotationPointZ += 5.0f;
                final ModelRenderer nagaPart16 = this.nagaPart4;
                nagaPart16.rotationPointZ += 5.0f;
                final ModelRenderer nagaPart17 = this.nagaPart5;
                nagaPart17.rotationPointZ += 4.0f;
                final ModelRenderer nagaPart18 = this.nagaPart1;
                --nagaPart18.rotationPointY;
                final ModelRenderer nagaPart19 = this.nagaPart2;
                --nagaPart19.rotationPointY;
                final ModelRenderer nagaPart20 = this.nagaPart3;
                --nagaPart20.rotationPointY;
                final ModelRenderer nagaPart21 = this.nagaPart4;
                --nagaPart21.rotationPointY;
                final ModelRenderer nagaPart22 = this.nagaPart5;
                --nagaPart22.rotationPointY;
            }
        }
        else if (this.isSneaking) {
            final ModelRenderer nagaPart23 = this.nagaPart1;
            --nagaPart23.rotationPointY;
            final ModelRenderer nagaPart24 = this.nagaPart2;
            --nagaPart24.rotationPointY;
            final ModelRenderer nagaPart25 = this.nagaPart3;
            --nagaPart25.rotationPointY;
            final ModelRenderer nagaPart26 = this.nagaPart4;
            --nagaPart26.rotationPointY;
            final ModelRenderer nagaPart27 = this.nagaPart5;
            --nagaPart27.rotationPointY;
            this.nagaPart1.rotationPointZ = 5.0f;
            this.nagaPart2.rotationPointZ = 3.0f;
        }
    }
    
    public void render(final float par7) {
        if (this.isHidden || !this.showModel) {
            return;
        }
        this.nagaPart1.render(par7);
        this.nagaPart3.render(par7);
        if (!this.isRiding) {
            this.nagaPart2.render(par7);
        }
        GL11.glPushMatrix();
        GL11.glScalef(0.74f, 0.7f, 0.85f);
        GL11.glTranslatef(this.nagaPart3.rotateAngleY, 0.66f, 0.06f);
        this.nagaPart4.render(par7);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.nagaPart3.rotateAngleY + this.nagaPart4.rotateAngleY, 0.0f, 0.0f);
        this.nagaPart5.render(par7);
        GL11.glPopMatrix();
    }
}

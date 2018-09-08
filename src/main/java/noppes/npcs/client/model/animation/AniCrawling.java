// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.animation;

import net.minecraft.util.MathHelper;
import noppes.npcs.client.model.ModelMPM;
import net.minecraft.entity.Entity;

public class AniCrawling
{
    public static void setRotationAngles(final float par1, float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity, final ModelMPM model) {
        model.bipedHead.rotateAngleZ = -par4 / 57.295776f;
        model.bipedHead.rotateAngleY = 0.0f;
        model.bipedHead.rotateAngleX = -0.95993114f;
        model.bipedHeadwear.rotateAngleX = model.bipedHead.rotateAngleX;
        model.bipedHeadwear.rotateAngleY = model.bipedHead.rotateAngleY;
        model.bipedHeadwear.rotateAngleZ = model.bipedHead.rotateAngleZ;
        if (par2 > 0.25) {
            par2 = 0.25f;
        }
        final float movement = MathHelper.cos(par1 * 0.8f + 3.1415927f) * par2;
        model.bipedLeftArm.rotateAngleX = 3.1415927f - movement * 0.25f;
        model.bipedLeftArm.rotateAngleY = movement * -0.46f;
        model.bipedLeftArm.rotateAngleZ = movement * -0.2f;
        model.bipedLeftArm.rotationPointY = 2.0f - movement * 9.0f;
        model.bipedRightArm.rotateAngleX = 3.1415927f + movement * 0.25f;
        model.bipedRightArm.rotateAngleY = movement * -0.4f;
        model.bipedRightArm.rotateAngleZ = movement * -0.2f;
        model.bipedRightArm.rotationPointY = 2.0f + movement * 9.0f;
        model.bipedBody.rotateAngleY = movement * 0.1f;
        model.bipedBody.rotateAngleX = 0.0f;
        model.bipedBody.rotateAngleZ = movement * 0.1f;
        model.bipedLeftLeg.rotateAngleX = movement * 0.1f;
        model.bipedLeftLeg.rotateAngleY = movement * 0.1f;
        model.bipedLeftLeg.rotateAngleZ = -0.122173056f - movement * 0.25f;
        model.bipedLeftLeg.rotationPointY = 10.4f + movement * 9.0f;
        model.bipedLeftLeg.rotationPointZ = movement * 0.6f - 0.01f;
        model.bipedRightLeg.rotateAngleX = movement * -0.1f;
        model.bipedRightLeg.rotateAngleY = movement * 0.1f;
        model.bipedRightLeg.rotateAngleZ = 0.122173056f - movement * 0.25f;
        model.bipedRightLeg.rotationPointY = 10.4f - movement * 9.0f;
        model.bipedRightLeg.rotationPointZ = movement * -0.6f - 0.01f;
    }
}

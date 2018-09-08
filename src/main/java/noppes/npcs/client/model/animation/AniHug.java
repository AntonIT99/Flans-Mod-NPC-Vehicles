// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.animation;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.MathHelper;
import noppes.npcs.client.model.ModelMPM;
import net.minecraft.entity.Entity;

public class AniHug
{
    public static void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity, final ModelMPM base) {
        final float f6 = MathHelper.sin(base.onGround * 3.141593f);
        final float f7 = MathHelper.sin((1.0f - (1.0f - base.onGround) * (1.0f - base.onGround)) * 3.141593f);
        base.bipedRightArm.rotateAngleZ = 0.0f;
        base.bipedLeftArm.rotateAngleZ = 0.0f;
        base.bipedRightArm.rotateAngleY = -(0.1f - f6 * 0.6f);
        base.bipedLeftArm.rotateAngleY = 0.1f;
        base.bipedRightArm.rotateAngleX = -1.570796f;
        base.bipedLeftArm.rotateAngleX = -1.570796f;
        final ModelRenderer bipedRightArm = base.bipedRightArm;
        bipedRightArm.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
        final ModelRenderer bipedRightArm2 = base.bipedRightArm;
        bipedRightArm2.rotateAngleZ += MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bipedLeftArm = base.bipedLeftArm;
        bipedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bipedRightArm3 = base.bipedRightArm;
        bipedRightArm3.rotateAngleX += MathHelper.sin(par3 * 0.067f) * 0.05f;
        final ModelRenderer bipedLeftArm2 = base.bipedLeftArm;
        bipedLeftArm2.rotateAngleX -= MathHelper.sin(par3 * 0.067f) * 0.05f;
    }
}

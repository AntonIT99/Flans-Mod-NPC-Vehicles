// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model;

import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;

@SideOnly(Side.CLIENT)
public class ModelNpcSlime extends ModelBase
{
    ModelRenderer outerBody;
    ModelRenderer innerBody;
    ModelRenderer slimeRightEye;
    ModelRenderer slimeLeftEye;
    ModelRenderer slimeMouth;
    
    public ModelNpcSlime(final int par1) {
        this.textureHeight = 64;
        this.textureWidth = 64;
        this.outerBody = new ModelRenderer((ModelBase)this, 0, 0);
        (this.outerBody = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-8.0f, 32.0f, -8.0f, 16, 16, 16);
        if (par1 > 0) {
            (this.innerBody = new ModelRenderer((ModelBase)this, 0, 32)).addBox(-3.0f, 17.0f, -3.0f, 6, 6, 6);
            (this.slimeRightEye = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-3.25f, 18.0f, -3.5f, 2, 2, 2);
            (this.slimeLeftEye = new ModelRenderer((ModelBase)this, 0, 4)).addBox(1.25f, 18.0f, -3.5f, 2, 2, 2);
            (this.slimeMouth = new ModelRenderer((ModelBase)this, 0, 8)).addBox(0.0f, 21.0f, -3.5f, 1, 1, 1);
        }
    }
    
    public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
        if (this.innerBody != null) {
            this.innerBody.render(par7);
        }
        else {
            GL11.glPushMatrix();
            GL11.glScalef(0.5f, 0.5f, 0.5f);
            this.outerBody.render(par7);
            GL11.glPopMatrix();
        }
        if (this.slimeRightEye != null) {
            this.slimeRightEye.render(par7);
            this.slimeLeftEye.render(par7);
            this.slimeMouth.render(par7);
        }
    }
}

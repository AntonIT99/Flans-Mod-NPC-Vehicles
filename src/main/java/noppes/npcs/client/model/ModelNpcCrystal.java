// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model;

import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelNpcCrystal extends ModelBase
{
    private ModelRenderer field_41057_g;
    private ModelRenderer field_41058_h;
    private ModelRenderer field_41059_i;
    float ticks;
    
    public ModelNpcCrystal(final float par1) {
        this.field_41058_h = new ModelRenderer((ModelBase)this, "glass");
        this.field_41058_h.setTextureOffset(0, 0).addBox(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        this.field_41057_g = new ModelRenderer((ModelBase)this, "cube");
        this.field_41057_g.setTextureOffset(32, 0).addBox(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        this.field_41059_i = new ModelRenderer((ModelBase)this, "base");
        this.field_41059_i.setTextureOffset(0, 16).addBox(-6.0f, 16.0f, -6.0f, 12, 4, 12);
    }
    
    public void setLivingAnimations(final EntityLivingBase par1EntityLiving, final float f6, final float f5, final float par9) {
        this.ticks = par9;
    }
    
    public void render(final Entity par1Entity, final float par2, float par3, float par4, final float par5, final float par6, final float par7) {
        GL11.glPushMatrix();
        GL11.glScalef(2.0f, 2.0f, 2.0f);
        GL11.glTranslatef(0.0f, -0.5f, 0.0f);
        this.field_41059_i.render(par7);
        final float f = par1Entity.ticksExisted + this.ticks;
        float f2 = MathHelper.sin(f * 0.2f) / 2.0f + 0.5f;
        f2 += f2 * f2;
        par3 = f * 3.0f;
        par4 = f2 * 0.2f;
        GL11.glRotatef(par3, 0.0f, 1.0f, 0.0f);
        GL11.glTranslatef(0.0f, 0.1f + par4, 0.0f);
        GL11.glRotatef(60.0f, 0.7071f, 0.0f, 0.7071f);
        this.field_41058_h.render(par7);
        final float sca = 0.875f;
        GL11.glScalef(sca, sca, sca);
        GL11.glRotatef(60.0f, 0.7071f, 0.0f, 0.7071f);
        GL11.glRotatef(par3, 0.0f, 1.0f, 0.0f);
        this.field_41058_h.render(par7);
        GL11.glScalef(sca, sca, sca);
        GL11.glRotatef(60.0f, 0.7071f, 0.0f, 0.7071f);
        GL11.glRotatef(par3, 0.0f, 1.0f, 0.0f);
        this.field_41057_g.render(par7);
        GL11.glPopMatrix();
    }
}

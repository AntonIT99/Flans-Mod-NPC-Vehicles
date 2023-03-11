package com.wolffsmod.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import com.wolffsmod.Strings;
import com.wolffsmod.entity.EntityBF109G10;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBF109G10 extends RenderLiving
{
    private static final ResourceLocation Texture = new ResourceLocation(Strings.MOD_ID + ":textures/entity/BF109G10/BF109G10.png");

    public RenderBF109G10(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    protected void preRenderCallback(EntityLivingBase entity, float f){
    	GL11.glTranslatef(0F, -2.1F, 0F);
    	GL11.glRotatef(180, 1, 0, 0);
    	GL11.glRotatef(90, 0, 1, 0);
    	GL11.glScalef(1.1f, 1.1f, 1.1f);
    }

    protected ResourceLocation getEntityTexture(EntityBF109G10 par1Entity)
    {
        return Texture;
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityBF109G10)par1Entity);
    }
}

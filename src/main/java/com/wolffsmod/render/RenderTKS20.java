package com.wolffsmod.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import com.wolffsmod.Strings;
import com.wolffsmod.entity.EntityTKS20;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderTKS20 extends RenderLiving
{
    private static final ResourceLocation Texture = new ResourceLocation(Strings.MOD_ID + ":textures/entity/TKS20/TKS20.png");

    public RenderTKS20(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    protected void preRenderCallback(EntityLivingBase entity, float f){
    	GL11.glTranslatef(0F, -2.2F, 0F);
    	GL11.glRotatef(180, 1, 0, 0);
    	GL11.glRotatef(270, 0, 1, 0);
    }

    protected ResourceLocation getEntityTexture(EntityTKS20 par1Entity)
    {
        return Texture;
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityTKS20)par1Entity);
    }
}

package com.wolffsmod.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import com.wolffsmod.Strings;

import com.wolffsmod.entity.EntityM3Halftrack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderM3Halftrack extends RenderLiving
{
    private static final ResourceLocation Texture = new ResourceLocation(Strings.MOD_ID + ":textures/entity/M3Halftrack/M3Halftrack.png");

    public RenderM3Halftrack(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    protected void preRenderCallback(EntityLivingBase entity, float f){
    	GL11.glTranslatef(0F, -2.1F, 0F);
    	GL11.glRotatef(180, 1, 0, 0);
    	GL11.glRotatef(270, 0, 1, 0);
    	GL11.glScalef(1.1f, 1.1f, 1.1f);
    }

    protected ResourceLocation getEntityTexture(EntityM3Halftrack par1Entity)
    {
        return Texture;
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityM3Halftrack)par1Entity);
    }
}

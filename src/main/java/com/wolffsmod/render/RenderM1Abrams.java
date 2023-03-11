package com.wolffsmod.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.wolffsmod.Strings;
import com.wolffsmod.entity.EntityM1Abrams;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderM1Abrams extends RenderLiving
{
    private static final ResourceLocation Texture = new ResourceLocation(Strings.MOD_ID + ":textures/entity/M1Abrams/M1Abrams.png");
    private static final String __OBFID3 = "CL_00000986";

    public RenderM1Abrams(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }
    
    protected void preRenderCallback(EntityLivingBase entity, float f){
    	GL11.glTranslatef(0F, 0.9F, 0F);
    	GL11.glRotatef(90, 0, 1, 0);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityM1Abrams par1Entity)
    {
        return Texture;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityM1Abrams)par1Entity);
    }
}
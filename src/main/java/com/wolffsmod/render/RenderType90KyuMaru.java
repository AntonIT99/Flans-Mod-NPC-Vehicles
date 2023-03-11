package com.wolffsmod.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.wolffsmod.Strings;
import com.wolffsmod.entity.EntityType90KyuMaru;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderType90KyuMaru extends RenderLiving
{
    private static final ResourceLocation Texture = new ResourceLocation(Strings.MOD_ID + ":textures/entity/Type90KyuMaru/Type90KyuMaru.png");
    private static final String __OBFID3 = "CL_00000986";

    public RenderType90KyuMaru(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }
    
    protected void preRenderCallback(EntityLivingBase entity, float f){
    	GL11.glTranslatef(0F, 0.7F, 0F);
    	GL11.glRotatef(90, 0, 1, 0);
    	GL11.glScalef(0.85f, 0.85f, 0.85f);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityType90KyuMaru par1Entity)
    {
        return Texture;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityType90KyuMaru)par1Entity);
    }
}
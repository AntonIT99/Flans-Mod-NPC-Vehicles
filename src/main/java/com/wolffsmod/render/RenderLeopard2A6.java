package com.wolffsmod.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.wolffsmod.Strings;
import com.wolffsmod.entity.EntityLeopard2A6;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderLeopard2A6 extends RenderLiving
{
    private static final ResourceLocation Texture = new ResourceLocation(Strings.MOD_ID + ":textures/entity/Leopard2A6/Leopard2A6.png");
    private static final String __OBFID3 = "CL_00000986";

    public RenderLeopard2A6(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }
    
    protected void preRenderCallback(EntityLivingBase entity, float f){
    	GL11.glTranslatef(0F, 0.5F, 0F);
    	GL11.glRotatef(90, 0, 1, 0);
    	GL11.glScalef(0.77f, 0.77f, 0.77f);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityLeopard2A6 par1Entity)
    {
        return Texture;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityLeopard2A6)par1Entity);
    }
}
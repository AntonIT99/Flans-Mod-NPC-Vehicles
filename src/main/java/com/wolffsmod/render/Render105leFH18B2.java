package com.wolffsmod.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.wolffsmod.Strings;
import com.wolffsmod.entity.Entity105leFH18B2;
import com.wolffsmod.model.Model105leFH18B2;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Render105leFH18B2 extends RenderLiving<Entity105leFH18B2>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/105leFH18B2/105leFH18B2.png");

    public Render105leFH18B2(RenderManager manager)
    {
    	super(manager, new Model105leFH18B2(), 0);
    }
    
    protected ResourceLocation getEntityTexture(Entity105leFH18B2 par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(Entity105leFH18B2 entitylivingbaseIn, float partialTickTime)
    {
    	GL11.glTranslatef(0F, -2.2F, 0F);
    	GL11.glRotatef(180, 1, 0, 0);
    	GL11.glRotatef(270, 0, 1, 0);
    	GL11.glScalef(1.1F, 1.1F, 1.1F);
    }
}
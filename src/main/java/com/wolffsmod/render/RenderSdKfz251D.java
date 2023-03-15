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
import com.wolffsmod.entity.EntitySdKfz251D;
import com.wolffsmod.model.ModelSdKfz251D;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderSdKfz251D extends RenderLiving<EntitySdKfz251D>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/SdKfz251D/SdKfz251D.png");
    public RenderSdKfz251D(RenderManager manager)
    {
        super(manager, new ModelSdKfz251D(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntitySdKfz251D par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntitySdKfz251D entitylivingbaseIn, float partialTickTime)
    {
    	GL11.glTranslatef(0.0f, -2.25f, 0.0f);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(1.1F, 1.1F, 1.1F);
    }
}
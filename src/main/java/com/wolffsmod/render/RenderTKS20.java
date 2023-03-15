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
import com.wolffsmod.entity.EntityTKS20;
import com.wolffsmod.model.ModelTKS20;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderTKS20 extends RenderLiving<EntityTKS20>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/TKS20/TKS20.png");
    public RenderTKS20(RenderManager manager)
    {
        super(manager, new ModelTKS20(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityTKS20 par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityTKS20 entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, -2.2F, 0F);
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(270, 0, 1, 0);
    }
}
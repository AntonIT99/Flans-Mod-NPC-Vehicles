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
import com.wolffsmod.entity.EntityM4A1Calliope;
import com.wolffsmod.model.ModelM4A1Calliope;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderM4A1Calliope extends RenderLiving<EntityM4A1Calliope>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/M4A1Calliope/M4A1Calliope.png");
    public RenderM4A1Calliope(RenderManager manager)
    {
        super(manager, new ModelM4A1Calliope(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityM4A1Calliope par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityM4A1Calliope entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, -2.1F, 0F);
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(270, 0, 1, 0);
    }
}
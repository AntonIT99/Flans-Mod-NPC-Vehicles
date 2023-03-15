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
import com.wolffsmod.entity.EntityM1Abrams;
import com.wolffsmod.model.ModelM1Abrams;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderM1Abrams extends RenderLiving<EntityM1Abrams>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/M1Abrams/M1Abrams.png");
    public RenderM1Abrams(RenderManager manager)
    {
        super(manager, new ModelM1Abrams(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityM1Abrams par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityM1Abrams entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, 0.9F, 0F);
        GL11.glRotatef(90, 0, 1, 0);
    }
}
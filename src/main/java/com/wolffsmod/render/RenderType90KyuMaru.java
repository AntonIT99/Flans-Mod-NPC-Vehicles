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
import com.wolffsmod.entity.EntityType90KyuMaru;
import com.wolffsmod.model.ModelType90KyuMaru;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderType90KyuMaru extends RenderLiving<EntityType90KyuMaru>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/Type90KyuMaru/Type90KyuMaru.png");
    public RenderType90KyuMaru(RenderManager manager)
    {
        super(manager, new ModelType90KyuMaru(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityType90KyuMaru par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityType90KyuMaru entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, 0.7F, 0F);
        GL11.glRotatef(90, 0, 1, 0);
        GL11.glScalef(0.85f, 0.85f, 0.85f);
    }
}
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
import com.wolffsmod.entity.EntityT55A;
import com.wolffsmod.model.ModelT55A;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderT55A extends RenderLiving<EntityT55A>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/T55A/T55A.png");
    public RenderT55A(RenderManager manager)
    {
        super(manager, new ModelT55A(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityT55A par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityT55A entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, 0.9F, 0F);
        GL11.glRotatef(90, 0, 1, 0);
    }
}
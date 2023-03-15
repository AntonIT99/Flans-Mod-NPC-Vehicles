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
import com.wolffsmod.entity.EntityType95;
import com.wolffsmod.model.ModelType95;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderType95 extends RenderLiving<EntityType95>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/Type95/Type95.png");
    public RenderType95(RenderManager manager)
    {
        super(manager, new ModelType95(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityType95 par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityType95 entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, -2.4F, 0F);
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(270, 0, 1, 0);
        GL11.glScalef(1.1F, 1.1F, 1.1F);
    }
}
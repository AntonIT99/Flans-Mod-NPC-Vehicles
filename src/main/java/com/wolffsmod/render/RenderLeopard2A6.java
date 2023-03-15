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
import com.wolffsmod.entity.EntityLeopard2A6;
import com.wolffsmod.model.ModelLeopard2A6;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderLeopard2A6 extends RenderLiving<EntityLeopard2A6>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/Leopard2A6/Leopard2A6.png");
    public RenderLeopard2A6(RenderManager manager)
    {
        super(manager, new ModelLeopard2A6(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityLeopard2A6 par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityLeopard2A6 entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, 0.5F, 0F);
        GL11.glRotatef(90, 0, 1, 0);
        GL11.glScalef(0.77f, 0.77f, 0.77f);
    }
}
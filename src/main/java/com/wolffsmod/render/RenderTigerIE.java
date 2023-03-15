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
import com.wolffsmod.entity.EntityTigerIE;
import com.wolffsmod.model.ModelTigerIE;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderTigerIE extends RenderLiving<EntityTigerIE>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/TigerIE/TigerIE.png");
    public RenderTigerIE(RenderManager manager)
    {
        super(manager, new ModelTigerIE(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityTigerIE par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityTigerIE entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, -2.1F, 0F);
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(270, 0, 1, 0);
    }
}
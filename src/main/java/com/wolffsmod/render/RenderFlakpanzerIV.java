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
import com.wolffsmod.entity.EntityFlakpanzerIV;
import com.wolffsmod.model.ModelFlakpanzerIV;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderFlakpanzerIV extends RenderLiving<EntityFlakpanzerIV>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/FlakpanzerIV/FlakpanzerIV.png");
    public RenderFlakpanzerIV(RenderManager manager)
    {
        super(manager, new ModelFlakpanzerIV(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityFlakpanzerIV par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityFlakpanzerIV entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, -2.1F, 0F);
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(270, 0, 1, 0);
    }
}
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
import com.wolffsmod.entity.EntityPanzerIVH;
import com.wolffsmod.model.ModelPanzerIVH;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderPanzerIVH extends RenderLiving<EntityPanzerIVH>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/PanzerIVH/PanzerIVH.png");
    public RenderPanzerIVH(RenderManager manager)
    {
        super(manager, new ModelPanzerIVH(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityPanzerIVH par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityPanzerIVH entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, -1.9F, 0F);
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(270, 0, 1, 0);
        GL11.glScalef(0.9F, 0.9F, 0.9F);
    }
}
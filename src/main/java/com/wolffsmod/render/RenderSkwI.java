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
import com.wolffsmod.entity.EntitySkwI;
import com.wolffsmod.model.ModelSkwI;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderSkwI extends RenderLiving<EntitySkwI>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/SkwI/SkwI.png");
    public RenderSkwI(RenderManager manager)
    {
        super(manager, new ModelSkwI(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntitySkwI par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntitySkwI entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, -1.5F, 0F);
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(270, 0, 1, 0);
        GL11.glScalef(0.55F, 0.55F, 0.55F);
    }
}
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
import com.wolffsmod.entity.EntityIS2;
import com.wolffsmod.model.ModelIS2;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderIS2 extends RenderLiving<EntityIS2>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/IS2/IS2.png");
    public RenderIS2(RenderManager manager)
    {
        super(manager, new ModelIS2(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityIS2 par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityIS2 entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, -2.6F, 0F);
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(270, 0, 1, 0);
        GL11.glScalef(1.3f, 1.3f, 1.3f);
    }
}
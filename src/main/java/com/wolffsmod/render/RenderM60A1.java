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
import com.wolffsmod.entity.EntityM60A1;
import com.wolffsmod.model.ModelM60A1;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderM60A1 extends RenderLiving<EntityM60A1>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/M60A1/M60A1.png");
    public RenderM60A1(RenderManager manager)
    {
        super(manager, new ModelM60A1(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityM60A1 par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityM60A1 entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, 0.9F, 0F);
        GL11.glRotatef(90, 0, 1, 0);
    }
}
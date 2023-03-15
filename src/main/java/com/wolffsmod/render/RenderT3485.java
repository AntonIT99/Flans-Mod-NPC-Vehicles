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
import com.wolffsmod.entity.EntityT3485;
import com.wolffsmod.model.ModelT3485;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderT3485 extends RenderLiving<EntityT3485>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/T3485/T3485.png");
    public RenderT3485(RenderManager manager)
    {
        super(manager, new ModelT3485(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityT3485 par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityT3485 entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, -2.6F, 0F);
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(270, 0, 1, 0);
        GL11.glScalef(1.3F, 1.3F, 1.3F);
    }
}
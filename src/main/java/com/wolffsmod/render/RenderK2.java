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
import com.wolffsmod.entity.EntityK2;
import com.wolffsmod.model.ModelK2;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderK2 extends RenderLiving<EntityK2>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/K2/K2.png");
    public RenderK2(RenderManager manager)
    {
        super(manager, new ModelK2(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityK2 par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityK2 entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, 0.8F, 0F);
        GL11.glRotatef(90, 0, 1, 0);
    }
}
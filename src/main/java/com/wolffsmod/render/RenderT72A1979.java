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
import com.wolffsmod.entity.EntityT72A1979;
import com.wolffsmod.model.ModelT72A1979;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderT72A1979 extends RenderLiving<EntityT72A1979>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/T72A1979/T72A1979.png");
    public RenderT72A1979(RenderManager manager)
    {
        super(manager, new ModelT72A1979(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityT72A1979 par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityT72A1979 entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, 0.9F, 0F);
        GL11.glRotatef(90, 0, 1, 0);
    }
}
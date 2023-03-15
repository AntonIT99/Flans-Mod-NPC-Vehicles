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
import com.wolffsmod.entity.EntityKubel;
import com.wolffsmod.model.ModelKubel;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderKubel extends RenderLiving<EntityKubel>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/Kubel/Kubel.png");
    public RenderKubel(RenderManager manager)
    {
        super(manager, new ModelKubel(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityKubel par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityKubel entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0.0f, -1.7f, 0.0f);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(0.8f, 0.8f, 0.8f);
    }
}
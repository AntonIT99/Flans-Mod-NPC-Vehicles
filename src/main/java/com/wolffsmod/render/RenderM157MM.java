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
import com.wolffsmod.entity.EntityM157MM;
import com.wolffsmod.model.ModelM157MM;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderM157MM extends RenderLiving<EntityM157MM>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/M157MM/M157MM.png");
    public RenderM157MM(RenderManager manager)
    {
        super(manager, new ModelM157MM(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityM157MM par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityM157MM entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0.0f, -2.3f, 0.0f);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(1.1f, 1.1f, 1.1f);
    }
}
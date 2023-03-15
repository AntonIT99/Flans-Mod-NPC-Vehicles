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
import com.wolffsmod.entity.EntityM3Halftrack;
import com.wolffsmod.model.ModelM3Halftrack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderM3Halftrack extends RenderLiving<EntityM3Halftrack>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/M3Halftrack/M3Halftrack.png");
    public RenderM3Halftrack(RenderManager manager)
    {
        super(manager, new ModelM3Halftrack(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityM3Halftrack par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityM3Halftrack entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0.0f, -2.1f, 0.0f);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
    }
}
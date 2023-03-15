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
import com.wolffsmod.entity.EntityM10;
import com.wolffsmod.model.ModelM10;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderM10 extends RenderLiving<EntityM10>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/M10/M10.png");
    public RenderM10(RenderManager manager)
    {
        super(manager, new ModelM10(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityM10 par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityM10 entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0.0f, -2.35f, 0.0f);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(1.15f, 1.15f, 1.15f);
    }
}
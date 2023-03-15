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
import com.wolffsmod.entity.EntityBMWR75;
import com.wolffsmod.model.ModelBMWR75;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderBMWR75 extends RenderLiving<EntityBMWR75>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/BMWR75/BMWR75.png");
    public RenderBMWR75(RenderManager manager)
    {
        super(manager, new ModelBMWR75(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityBMWR75 par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityBMWR75 entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0.0f, -1.9f, 0.0f);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(0.9f, 0.9f, 0.9f);
    }
}
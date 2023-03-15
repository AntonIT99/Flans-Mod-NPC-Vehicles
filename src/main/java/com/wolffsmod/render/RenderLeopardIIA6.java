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
import com.wolffsmod.entity.EntityLeopardIIA6;
import com.wolffsmod.model.ModelLeopardIIA6;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderLeopardIIA6 extends RenderLiving<EntityLeopardIIA6>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/LeopardIIA6/LeopardIIA6.png");
    public RenderLeopardIIA6(RenderManager manager)
    {
        super(manager, new ModelLeopardIIA6(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityLeopardIIA6 par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityLeopardIIA6 entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0.0f, -2.1f, 0.0f);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
    }
}
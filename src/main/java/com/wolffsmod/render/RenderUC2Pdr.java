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
import com.wolffsmod.entity.EntityUC2Pdr;
import com.wolffsmod.model.ModelUC2Pdr;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderUC2Pdr extends RenderLiving<EntityUC2Pdr>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/UC2Pdr/UC2Pdr.png");
    public RenderUC2Pdr(RenderManager manager)
    {
        super(manager, new ModelUC2Pdr(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityUC2Pdr par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityUC2Pdr entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0.0f, -2.1f, 0.0f);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
    }
}
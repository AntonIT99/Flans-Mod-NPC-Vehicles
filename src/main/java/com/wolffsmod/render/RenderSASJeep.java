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
import com.wolffsmod.entity.EntitySASJeep;
import com.wolffsmod.model.ModelSASJeep;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderSASJeep extends RenderLiving<EntitySASJeep>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/SASJeep/SASJeep.png");
    public RenderSASJeep(RenderManager manager)
    {
        super(manager, new ModelSASJeep(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntitySASJeep par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntitySASJeep entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0.0f, -1.8f, 0.0f);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(0.8f, 0.8f, 0.8f);
    }
}
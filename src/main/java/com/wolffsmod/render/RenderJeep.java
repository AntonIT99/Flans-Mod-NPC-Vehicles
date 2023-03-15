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
import com.wolffsmod.entity.EntityJeep;
import com.wolffsmod.model.ModelJeep;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderJeep extends RenderLiving<EntityJeep>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/Jeep/Jeep.png");
    public RenderJeep(RenderManager manager)
    {
        super(manager, new ModelJeep(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityJeep par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityJeep entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0.0f, -1.75f, 0.0f);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(0.8f, 0.8f, 0.8f);
    }
}
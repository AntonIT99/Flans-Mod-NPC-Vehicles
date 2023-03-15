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
import com.wolffsmod.entity.EntityFlak88;
import com.wolffsmod.model.ModelFlak88;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderFlak88 extends RenderLiving<EntityFlak88>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/Flak88/Flak88.png");
    public RenderFlak88(RenderManager manager)
    {
        super(manager, new ModelFlak88(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityFlak88 par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityFlak88 entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0.0f, -2.4f, 0.0f);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(1.2f, 1.2f, 1.2f);
    }
}
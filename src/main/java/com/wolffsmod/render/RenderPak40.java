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
import com.wolffsmod.entity.EntityPak40;
import com.wolffsmod.model.ModelPak40;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderPak40 extends RenderLiving<EntityPak40>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/Pak40/Pak40.png");
    public RenderPak40(RenderManager manager)
    {
        super(manager, new ModelPak40(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityPak40 par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityPak40 entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0.0f, -2.3f, 0.0f);
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(1.1f, 1.1f, 1.1f);
    }
}
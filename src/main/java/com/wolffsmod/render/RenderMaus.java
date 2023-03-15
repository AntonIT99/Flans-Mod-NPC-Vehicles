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
import com.wolffsmod.entity.EntityMaus;
import com.wolffsmod.model.ModelMaus;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderMaus extends RenderLiving<EntityMaus>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/Maus/Maus.png");
    public RenderMaus(RenderManager manager)
    {
        super(manager, new ModelMaus(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityMaus par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityMaus entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, -2.4F, 0F);
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(270, 0, 1, 0);
        GL11.glScalef(1.1F, 1.1F, 1.1F);
    }
}
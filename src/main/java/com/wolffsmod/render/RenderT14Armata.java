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
import com.wolffsmod.entity.EntityT14Armata;
import com.wolffsmod.model.ModelT14Armata;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderT14Armata extends RenderLiving<EntityT14Armata>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Strings.MODID + ":textures/entity/T14Armata/T14Armata.png");
    public RenderT14Armata(RenderManager manager)
    {
        super(manager, new ModelT14Armata(), 0);
    }
    
    protected ResourceLocation getEntityTexture(EntityT14Armata par1Entity)
    {
        return TEXTURES;
    }
    
    protected void preRenderCallback(EntityT14Armata entitylivingbaseIn, float partialTickTime)
    {
        GL11.glTranslatef(0F, -2.2F, 0F);
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(270, 0, 1, 0);
    }
}
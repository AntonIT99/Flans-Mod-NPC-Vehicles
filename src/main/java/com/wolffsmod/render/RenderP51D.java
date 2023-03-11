package com.wolffsmod.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import com.wolffsmod.Strings;
import com.wolffsmod.entity.EntityP51D;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderP51D extends RenderLiving
{
    private static final ResourceLocation Texture = new ResourceLocation(Strings.MOD_ID + ":textures/entity/P51D/P51D.png");

    public RenderP51D(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    protected void preRenderCallback(EntityLivingBase entity, float f){
    	GL11.glTranslatef(0F, -2.1F, 0F);
    	GL11.glRotatef(180, 1, 0, 0);
    	GL11.glRotatef(90, 0, 1, 0);
    }

    protected ResourceLocation getEntityTexture(EntityP51D par1Entity)
    {
        return Texture;
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityP51D)par1Entity);
    }
}

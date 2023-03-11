package com.wolffsmod.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import com.wolffsmod.Strings;
import com.wolffsmod.entity.EntityRadioStationSmall;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderRadioStationSmall extends RenderLiving
{
    private static final ResourceLocation Texture = new ResourceLocation(Strings.MOD_ID + ":textures/entity/RadioStationSmall/RadioStationSmall.png");

    public RenderRadioStationSmall(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    protected void preRenderCallback(EntityLivingBase entity, float f){
    	GL11.glTranslatef(0F, -2.85F, 0F);
    	GL11.glRotatef(180, 1, 0, 0);
    	GL11.glRotatef(-180, 0, 1, 0);
    	GL11.glScalef(1.1f, 1.1f, 1.1f);
    }
    protected ResourceLocation getEntityTexture(EntityRadioStationSmall par1Entity)
    {
        return Texture;
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityRadioStationSmall)par1Entity);
    }
}

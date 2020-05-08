package com.wolffsmod.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import com.wolffsmod.Strings;
import com.wolffsmod.entity.EntitySturmtiger;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSturmtiger extends RenderLiving
{
    private static final ResourceLocation Texture = new ResourceLocation(Strings.MODID + ":textures/entity/Sturmtiger/Sturmtiger.png");

    public RenderSturmtiger(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    protected void preRenderCallback(EntityLivingBase entity, float f){
    	GL11.glTranslatef(0F, -2.4F, 0F);
    	GL11.glRotatef(180, 1, 0, 0);
    	GL11.glRotatef(270, 0, 1, 0);
    	GL11.glScalef(1.1F, 1.1F, 1.1F);
    }

    protected ResourceLocation getEntityTexture(EntitySturmtiger par1Entity)
    {
        return Texture;
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntitySturmtiger)par1Entity);
    }
}

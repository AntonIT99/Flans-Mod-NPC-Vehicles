package com.wolffsmod.render;

import org.lwjgl.opengl.GL11;

import com.wolffsmod.Strings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;

public class RenderFlansModEntity extends RenderLiving
{
    private final ResourceLocation texture;

    private Vec3 scale = null;
    private Vec3 translation = null;

    public RenderFlansModEntity(ModelBase model, String texturePath)
    {
        super(model, 0F);
        texture = new ResourceLocation(Strings.MOD_ID + ":textures/entity/" + texturePath);
    }

    public RenderFlansModEntity(ModelBase model)
    {
        this(model, model.getClass().getSimpleName().split("Model")[1] + "/" + model.getClass().getSimpleName().split("Model")[1] + ".png");
    }

    public RenderFlansModEntity setScale(float scaleX, float scaleY, float scaleZ)
    {
        scale = Vec3.createVectorHelper(scaleX, scaleY, scaleZ);
        return this;
    }

    public RenderFlansModEntity translate(float translationX, float translationY, float translationZ)
    {
        translation = Vec3.createVectorHelper(translationX, translationY, translationZ);
        return this;
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entity, float f)
    {
        if (translation != null)
            GL11.glTranslatef((float)translation.xCoord, (float)translation.yCoord, (float)translation.zCoord);
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(270, 0, 1, 0);
        if (scale != null)
            GL11.glScalef((float)scale.xCoord, (float)scale.yCoord, (float)scale.zCoord);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return texture;
    }
}

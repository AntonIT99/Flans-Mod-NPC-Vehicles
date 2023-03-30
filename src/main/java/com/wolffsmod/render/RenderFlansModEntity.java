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
    public static final float DEFAULT_Y_TRANSLATION = -2.1F;
    private final ResourceLocation texture;
    private float scaleFactor = 1F;

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

    public RenderFlansModEntity scale(float scale)
    {
        scaleFactor = scale;
        return this;
    }

    public RenderFlansModEntity setScale(float scaleX, float scaleY, float scaleZ)
    {
        scale = Vec3.createVectorHelper(scaleX, scaleY, scaleZ);
        return this;
    }

    public RenderFlansModEntity setTranslation(float translationX, float translationY, float translationZ)
    {
        translation = Vec3.createVectorHelper(translationX, translationY, translationZ);
        return this;
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entity, float f)
    {
        if (translation != null)
            GL11.glTranslatef((float)translation.xCoord, (float)translation.yCoord, (float)translation.zCoord);
        else
            GL11.glTranslatef(0F, DEFAULT_Y_TRANSLATION * scaleFactor, 0F);

        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(270, 0, 1, 0);

        if (scale != null)
            GL11.glScalef((float)scale.xCoord, (float)scale.yCoord, (float)scale.zCoord);
        else if (scaleFactor != 1F)
            GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return texture;
    }
}

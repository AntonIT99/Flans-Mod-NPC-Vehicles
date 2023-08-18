package com.wolffsmod.render;

import org.lwjgl.opengl.GL11;

import com.wolffsmod.ModInfo;
import com.wolffsmod.entity.EntityFlanAAGunNPC;
import com.wolffsmod.entity.EntityFlanDriveableNPC;
import com.wolffsmod.entity.EntityFlanMechaNPC;
import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;

public class RenderFlansModEntity extends RenderLiving
{
    public static final float DEFAULT_Y_TRANSLATION = -2.133F;
    public static final float DEFAULT_Y_TRANSLATION_AAGUN = -1.5F;
    public static final float DEFAULT_Y_TRANSLATION_MECHA = -1.5F;
    private final ResourceLocation texture;
    private float scaleFactor = 1F;
    private Vec3 scale = null;
    private Vec3 translation = null;
    private Vec3 rotation = null;

    public RenderFlansModEntity(ModelBase model, String texturePath)
    {
        super(model, 0F);
        texture = new ResourceLocation(ModInfo.MOD_ID + ":textures/entity/" + texturePath);
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

    public RenderFlansModEntity setRotation(float rotationX, float rotationY, float rotationZ)
    {
        rotation = Vec3.createVectorHelper(rotationX, rotationY, rotationZ);
        return this;
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entity, float f)
    {
        float npcModelScale = 1F;

        if (entity instanceof EntityFlanDriveableNPC && ((EntityFlanDriveableNPC) entity).npc != null)
            npcModelScale = ((EntityFlanDriveableNPC) entity).npc.display.modelSize / 5F;

        if (entity instanceof EntityFlanDriveableNPC)
        {
            float modelScale = (scale != null) ? (float) ((scale.xCoord + scale.yCoord + scale.zCoord) / 3F) : scaleFactor;
            ((EntityFlanDriveableNPC) entity).setModelScale(npcModelScale * modelScale);
        }

        if (translation != null)
        {
            GL11.glTranslatef((float)translation.xCoord, (float)translation.yCoord * scaleFactor * npcModelScale, (float)translation.zCoord);
        }
        else
        {
            if (entity instanceof EntityFlanAAGunNPC)
                GL11.glTranslatef(0F, DEFAULT_Y_TRANSLATION_AAGUN * scaleFactor * npcModelScale, 0F);
            else if (entity instanceof EntityFlanMechaNPC)
                GL11.glTranslatef(0F, DEFAULT_Y_TRANSLATION_MECHA * scaleFactor * npcModelScale, 0F);
            else
                GL11.glTranslatef(0F, DEFAULT_Y_TRANSLATION * scaleFactor * npcModelScale, 0F);
        }

        if (rotation != null)
        {
            GL11.glRotatef((float) rotation.xCoord, 1, 0, 0);
            GL11.glRotatef((float) rotation.yCoord, 0, 1, 0);
            GL11.glRotatef((float) rotation.zCoord, 0, 0, 1);
        }
        else
        {
            GL11.glRotatef(180, 1, 0, 0);

            if (entity instanceof EntityFlanPlaneNPC)
                GL11.glRotatef(90, 0, 1, 0);
            else
                GL11.glRotatef(270, 0, 1, 0);
        }

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

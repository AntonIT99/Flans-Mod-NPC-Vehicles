package com.wolffsmod.mixin;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.teams.ArmourType;
import noppes.npcs.CustomNpcs;
import noppes.npcs.client.ClientCacheHandler;
import noppes.npcs.client.ClientEventHandler;
import noppes.npcs.constants.EnumAnimation;
import noppes.npcs.constants.EnumAnimationPart;
import noppes.npcs.controllers.data.Animation;
import noppes.npcs.controllers.data.AnimationData;
import noppes.npcs.controllers.data.Frame;
import noppes.npcs.controllers.data.FramePart;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

@Mixin(value = ModelCustomArmour.class)
public abstract class MixinModelCustomArmour extends ModelBiped
{
    @Unique
    private static final float PI = (float) Math.PI;
    @Unique
    private float dancingTicks;

    @Shadow(remap = false)
    public ArmourType type;
    @Shadow(remap = false)
    public ModelRendererTurbo[] headModel = new ModelRendererTurbo[0];
    @Shadow(remap = false)
    public ModelRendererTurbo[] bodyModel = new ModelRendererTurbo[0];
    @Shadow(remap = false)
    public ModelRendererTurbo[] leftArmModel = new ModelRendererTurbo[0];
    @Shadow(remap = false)
    public ModelRendererTurbo[] rightArmModel = new ModelRendererTurbo[0];
    @Shadow(remap = false)
    public ModelRendererTurbo[] leftLegModel = new ModelRendererTurbo[0];
    @Shadow(remap = false)
    public ModelRendererTurbo[] rightLegModel = new ModelRendererTurbo[0];
    @Shadow(remap = false)
    public ModelRendererTurbo[] skirtFrontModel = new ModelRendererTurbo[0]; //Acts like a leg piece, but its pitch is set to the maximum of the two legs
    @Shadow(remap = false)
    public ModelRendererTurbo[] skirtRearModel = new ModelRendererTurbo[0]; //Acts like a leg piece, but its pitch is set to the minimum of the two legs

    @Shadow(remap = false)
    public abstract void render(ModelRendererTurbo[] models, ModelRenderer bodyPart, float f5, float scale);
    @Shadow(remap = false)
    public abstract void setBodyPart(ModelRendererTurbo[] models, ModelRenderer bodyPart, float scale);

    /**
     * @author Wolff
     * @reason Compatibility for Custom NPCs
     */
    @Override
    @Overwrite(remap = false)
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        GL11.glPushMatrix();
        if (entity instanceof EntityCustomNpc)
            applyCustomNpcFullModelTransform((EntityCustomNpc) entity);
        GL11.glScalef(type.modelScale, type.modelScale, type.modelScale);
        isSneak = entity.isSneaking();
        ItemStack itemstack = ((EntityLivingBase)entity).getEquipmentInSlot(0);
        heldItemRight = itemstack != null ? 1 : 0;

        aimedBow = false;
        if (itemstack != null && entity instanceof EntityPlayer && ((EntityPlayer)entity).getItemInUseCount() > 0)
        {
            EnumAction enumaction = itemstack.getItemUseAction();
            if (enumaction == EnumAction.block)
            {
                heldItemRight = 3;
            }
            else if (enumaction == EnumAction.bow)
            {
                aimedBow = true;
            }
        }

        boolean customAnimationActive = getActiveCustomAnimationFrame(entity) != null;
        if ((entity instanceof EntityNPCInterface))
        {
            setRotationAnglesCustomNpc(f, f1, f2, f3, f4, f5, (EntityNPCInterface)entity);
            applyCustomAnimationPartTransforms(entity);
            renderHeadNPC((EntityNPCInterface)entity, f5, customAnimationActive);
            renderBodyNPC((EntityNPCInterface)entity, f5, customAnimationActive);
            renderLeftArmNPC((EntityNPCInterface)entity, f5, customAnimationActive);
            renderRightArmNPC((EntityNPCInterface)entity, f5, customAnimationActive);
        }
        else
        {
            setRotationAngles(f, f1, f2, f3, f4, f5, entity);
            applyCustomAnimationPartTransforms(entity);
            renderAnimatedPart(entity, headModel, bipedHead, f5, customAnimationActive);
            renderAnimatedPart(entity, bodyModel, bipedBody, f5, customAnimationActive);
            renderAnimatedPart(entity, leftArmModel, bipedLeftArm, f5, customAnimationActive);
            renderAnimatedPart(entity, rightArmModel, bipedRightArm, f5, customAnimationActive);
        }
        renderAnimatedPart(entity, leftLegModel, bipedLeftLeg, f5, customAnimationActive);
        renderAnimatedPart(entity, rightLegModel, bipedRightLeg, f5, customAnimationActive);

        //Skirt front
        {
            for(ModelRendererTurbo mod : skirtFrontModel)
            {
                mod.rotationPointX = (bipedLeftLeg.rotationPointX + bipedRightLeg.rotationPointX) / 2F / type.modelScale;
                mod.rotationPointY = (bipedLeftLeg.rotationPointY + bipedRightLeg.rotationPointY) / 2F / type.modelScale;
                mod.rotationPointZ = (bipedLeftLeg.rotationPointZ + bipedRightLeg.rotationPointZ) / 2F / type.modelScale;
                mod.rotateAngleX = Math.min(bipedLeftLeg.rotateAngleX, bipedRightLeg.rotateAngleX);
                mod.rotateAngleY = bipedLeftLeg.rotateAngleY;
                mod.rotateAngleZ = bipedLeftLeg.rotateAngleZ;
                renderAnimatedTurbo(entity, mod, f5, customAnimationActive);
            }
        }
        //Skirt back
        {
            for(ModelRendererTurbo mod : skirtRearModel)
            {
                mod.rotationPointX = (bipedLeftLeg.rotationPointX + bipedRightLeg.rotationPointX) / 2F / type.modelScale;
                mod.rotationPointY = (bipedLeftLeg.rotationPointY + bipedRightLeg.rotationPointY) / 2F / type.modelScale;
                mod.rotationPointZ = (bipedLeftLeg.rotationPointZ + bipedRightLeg.rotationPointZ) / 2F / type.modelScale;
                mod.rotateAngleX = Math.max(bipedLeftLeg.rotateAngleX, bipedRightLeg.rotateAngleX);
                mod.rotateAngleY = bipedLeftLeg.rotateAngleY;
                mod.rotateAngleZ = bipedLeftLeg.rotateAngleZ;
                renderAnimatedTurbo(entity, mod, f5, customAnimationActive);
            }
        }
        GL11.glPopMatrix();
    }

    /**
     * CustomNPC+ applies FULL_MODEL directly to the GL matrix while rendering its
     * own model. That matrix is popped before Forge renders Flan armour, so the
     * same scoped transform must be composed into this armour render.
     */
    @Unique
    private void applyCustomNpcFullModelTransform(EntityCustomNpc npc)
    {
        Frame frame = getActiveCustomNpcFrame(npc);
        if (frame == null)
            return;

        FramePart part = frame.frameParts.get(EnumAnimationPart.FULL_MODEL);
        if (part == null)
            return;

        part.interpolateOffset();
        part.interpolateAngles();
        float degrees = 180F / PI;
        GL11.glTranslatef(part.prevPivots[0], -part.prevPivots[1], part.prevPivots[2]);
        GL11.glRotatef(part.prevRotations[0] * degrees, 1F, 0F, 0F);
        GL11.glRotatef(part.prevRotations[1] * degrees, 0F, 1F, 0F);
        GL11.glRotatef(part.prevRotations[2] * degrees, 0F, 0F, 1F);
    }

    /**
     * Flan armour renders ModelRendererTurbo arrays rather than the named biped
     * ModelRenderer fields CustomNPC+ discovers. Apply the final interpolated
     * frame to Flan's proxy biped parts before Flan copies those transforms to
     * its armour geometry.
     */
    @Unique
    private void applyCustomAnimationPartTransforms(Entity entity)
    {
        Frame frame = getActiveCustomAnimationFrame(entity);
        if (frame == null)
            return;

        applyCustomNpcPart(frame, EnumAnimationPart.HEAD, bipedHead);
        applyCustomNpcPart(frame, EnumAnimationPart.BODY, bipedBody);
        applyCustomNpcPart(frame, EnumAnimationPart.LEFT_ARM, bipedLeftArm);
        applyCustomNpcPart(frame, EnumAnimationPart.RIGHT_ARM, bipedRightArm);
        applyCustomNpcPart(frame, EnumAnimationPart.LEFT_LEG, bipedLeftLeg);
        applyCustomNpcPart(frame, EnumAnimationPart.RIGHT_LEG, bipedRightLeg);
    }

    @Unique
    private void renderAnimatedPart(Entity entity, ModelRendererTurbo[] models, ModelRenderer bodyPart,
                                    float scale, boolean customAnimationActive)
    {
        if (!customAnimationActive)
        {
            render(models, bodyPart, scale, type.modelScale);
            return;
        }

        setBodyPart(models, bodyPart, type.modelScale);
        for (ModelRendererTurbo model : models)
        {
            model.rotateAngleX = bodyPart.rotateAngleX;
            model.rotateAngleY = bodyPart.rotateAngleY;
            model.rotateAngleZ = bodyPart.rotateAngleZ;
            renderAnimatedTurbo(entity, model, scale, true);
        }
    }

    /**
     * ModelRenderer uses Z-Y-X, while ModelRendererTurbo uses Y-Z-X. Rendering
     * the animated armour through the vanilla order fixes combined Y+Z poses.
     */
    @Unique
    private void renderAnimatedTurbo(Entity entity, ModelRendererTurbo model, float scale,
                                     boolean customAnimationActive)
    {
        if (!customAnimationActive)
        {
            model.render(scale);
            return;
        }

        float pointX = model.rotationPointX;
        float pointY = model.rotationPointY;
        float pointZ = model.rotationPointZ;
        float angleX = model.rotateAngleX;
        float angleY = model.rotateAngleY;
        float angleZ = model.rotateAngleZ;
        EntityNPCInterface renderingNpc = ClientEventHandler.renderingNpc;
        EntityPlayer renderingPlayer = ClientEventHandler.renderingPlayer;

        GL11.glPushMatrix();
        try
        {
            GL11.glTranslatef(pointX * scale, pointY * scale, pointZ * scale);
            float degrees = 180F / PI;
            GL11.glRotatef(angleZ * degrees, 0F, 0F, 1F);
            GL11.glRotatef(angleY * degrees, 0F, 1F, 0F);
            GL11.glRotatef(angleX * degrees, 1F, 0F, 0F);

            model.rotationPointX = 0F;
            model.rotationPointY = 0F;
            model.rotationPointZ = 0F;
            model.rotateAngleX = 0F;
            model.rotateAngleY = 0F;
            model.rotateAngleZ = 0F;

            // Prevent CustomNPC+'s ModelRenderer hook from trying to classify
            // and animate the already-composed Flan turbo part a second time.
            ClientEventHandler.renderingNpc = null;
            ClientEventHandler.renderingPlayer = null;
            model.render(scale);
        }
        finally
        {
            ClientEventHandler.renderingNpc = renderingNpc;
            ClientEventHandler.renderingPlayer = renderingPlayer;
            model.rotationPointX = pointX;
            model.rotationPointY = pointY;
            model.rotationPointZ = pointZ;
            model.rotateAngleX = angleX;
            model.rotateAngleY = angleY;
            model.rotateAngleZ = angleZ;
            GL11.glPopMatrix();
        }
    }

    @Unique
    private void applyCustomNpcPart(Frame frame, EnumAnimationPart partType, ModelRenderer modelPart)
    {
        FramePart part = frame.frameParts.get(partType);
        if (part == null)
            return;

        part.interpolateAngles();
        part.interpolateOffset();
        modelPart.rotateAngleX = part.prevRotations[0];
        modelPart.rotateAngleY = part.prevRotations[1];
        modelPart.rotateAngleZ = part.prevRotations[2];
        modelPart.rotationPointX += part.prevPivots[0];
        modelPart.rotationPointY += part.prevPivots[1];
        modelPart.rotationPointZ += part.prevPivots[2];
    }

    @Unique
    private Frame getActiveCustomNpcFrame(EntityCustomNpc npc)
    {
        AnimationData animationData = npc.display.animationData;
        if (animationData == null || !animationData.isActive())
            return null;

        Animation animation = animationData.animation;
        if (animation == null || animation.frames == null || animation.frames.isEmpty())
            return null;
        if (animation.currentFrame < 0 || animation.currentFrame >= animation.frames.size())
            return null;
        return animation.frames.get(animation.currentFrame);
    }

    @Unique
    private Frame getActiveCustomAnimationFrame(Entity entity)
    {
        AnimationData animationData = null;
        if (entity instanceof EntityCustomNpc)
            animationData = ((EntityCustomNpc) entity).display.animationData;
        else if (entity instanceof EntityPlayer)
            animationData = ClientCacheHandler.playerAnimations.get(entity.getUniqueID());

        if (animationData == null || !animationData.isActive())
            return null;
        Animation animation = animationData.animation;
        if (animation == null)
            return null;
        return (Frame) animation.currentFrame();
    }

    @Override
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
    {
        setInitialAngles();
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
    }

    @Override
    public void setLivingAnimations(EntityLivingBase par1EntityLiving, float f6, float f5, float par9)
    {
        dancingTicks = CustomNpcs.ticks / 3.978873F;
    }

    @Unique
    private void renderHeadNPC(EntityNPCInterface npc, float f, boolean customAnimationActive)
    {
        if(npc.currentAnimation == EnumAnimation.DANCING)
        {
            float dancing = (npc instanceof EntityCustomNpc) ? npc.ticksExisted / 4f : dancingTicks;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)Math.sin(dancing) * 0.075F, (float)Math.abs(Math.cos(dancing)) * 0.125F - 0.02F, (float)(-Math.abs(Math.cos(dancing))) * 0.075F);
            renderAnimatedPart(npc, headModel, bipedHead, f, customAnimationActive);
            GL11.glPopMatrix();
        }
        else
        {
            renderAnimatedPart(npc, headModel, bipedHead, f, customAnimationActive);
        }
    }

    @Unique
    private void renderLeftArmNPC(EntityNPCInterface npc, float f, boolean customAnimationActive)
    {
        if(npc.currentAnimation == EnumAnimation.DANCING)
        {
            float dancing = (npc instanceof EntityCustomNpc) ? npc.ticksExisted / 4f : dancingTicks;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)Math.sin(dancing) * 0.025F, (float)Math.abs(Math.cos(dancing)) * 0.125F - 0.02F, 0.0F);
            renderAnimatedPart(npc, leftArmModel, bipedLeftArm, f, customAnimationActive);
            GL11.glPopMatrix();
        }
        else
        {
            renderAnimatedPart(npc, leftArmModel, bipedLeftArm, f, customAnimationActive);
        }
    }

    @Unique
    private void renderRightArmNPC(EntityNPCInterface npc, float f, boolean customAnimationActive)
    {
        if(npc.currentAnimation == EnumAnimation.DANCING)
        {
            float dancing = (npc instanceof EntityCustomNpc) ? npc.ticksExisted / 4f : dancingTicks;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)Math.sin(dancing) * 0.025F, (float)Math.abs(Math.cos(dancing)) * 0.125F - 0.02F, 0.0F);
            renderAnimatedPart(npc, rightArmModel, bipedRightArm, f, customAnimationActive);
            GL11.glPopMatrix();
        }
        else
        {
            renderAnimatedPart(npc, rightArmModel, bipedRightArm, f, customAnimationActive);
        }
    }

    @Unique
    private void renderBodyNPC(EntityNPCInterface npc, float f, boolean customAnimationActive)
    {
        if(npc.currentAnimation == EnumAnimation.DANCING)
        {
            float dancing = (npc instanceof EntityCustomNpc) ? npc.ticksExisted / 4f : dancingTicks;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)Math.sin(dancing) * 0.015F, 0.0F, 0.0F);
            renderAnimatedPart(npc, bodyModel, bipedBody, f, customAnimationActive);
            GL11.glPopMatrix();
        }
        else
        {
            renderAnimatedPart(npc, bodyModel, bipedBody, f, customAnimationActive);
        }
    }

    @Unique
    private void setRotationAnglesCustomNpc(float par1, float par2, float par3, float par4, float par5, float par6, EntityNPCInterface entity)
    {
        EnumAnimation currentAnimation = entity.currentAnimation;
        isRiding = entity.isRiding() || (currentAnimation == EnumAnimation.SITTING);
        isSneak = entity.isSneaking() || (currentAnimation == EnumAnimation.SNEAKING);
        heldItemLeft = (entity.getOffHand() != null) ? 1 : 0;

        if(entity.currentAnimation == EnumAnimation.AIMING) aimedBow = true;

        if(isSneak && (entity.currentAnimation == EnumAnimation.CRAWLING || entity.currentAnimation == EnumAnimation.LYING))
            isSneak = false;

        setRotationAngles(par1, par2, par3, par4, par5, par6, entity);

        bipedHead.rotateAngleY = par4 / (180F / PI);
        bipedHead.rotateAngleX = par5 / (180F / PI);
        bipedHeadwear.rotateAngleY = bipedHead.rotateAngleY;
        bipedHeadwear.rotateAngleX = bipedHead.rotateAngleX;
        bipedRightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + PI) * 2.0F * par2 * 0.5F;
        bipedLeftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
        bipedRightArm.rotateAngleZ = 0.0F;
        bipedLeftArm.rotateAngleZ = 0.0F;
        bipedRightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
        bipedLeftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + PI) * 1.4F * par2;
        bipedRightLeg.rotateAngleY = 0.0F;
        bipedLeftLeg.rotateAngleY = 0.0F;

        if (isRiding)
        {
            bipedRightArm.rotateAngleX += -(PI / 5F);
            bipedLeftArm.rotateAngleX += -(PI / 5F);
            bipedRightLeg.rotateAngleX = -(PI * 2F / 5F);
            bipedLeftLeg.rotateAngleX = -(PI * 2F / 5F);
            bipedRightLeg.rotateAngleY = (PI / 10F);
            bipedLeftLeg.rotateAngleY = -(PI / 10F);
        }

        if (heldItemLeft != 0)
        {
            bipedLeftArm.rotateAngleX = bipedLeftArm.rotateAngleX * 0.5F - (PI / 10F) * heldItemLeft;
        }

        if (heldItemRight != 0)
        {
            bipedRightArm.rotateAngleX = bipedRightArm.rotateAngleX * 0.5F - (PI / 10F) * heldItemRight;
        }

        bipedRightArm.rotateAngleY = 0.0F;
        bipedLeftArm.rotateAngleY = 0.0F;

        if (onGround > -9990F)
        {
            float f = onGround;
            bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f) * PI * 2.0F) * 0.2F;
            bipedRightArm.rotationPointZ = MathHelper.sin(bipedBody.rotateAngleY) * 5F;
            bipedRightArm.rotationPointX = -MathHelper.cos(bipedBody.rotateAngleY) * 5F;
            bipedLeftArm.rotationPointZ = -MathHelper.sin(bipedBody.rotateAngleY) * 5F;
            bipedLeftArm.rotationPointX = MathHelper.cos(bipedBody.rotateAngleY) * 5F;
            bipedRightArm.rotateAngleY += bipedBody.rotateAngleY;
            bipedLeftArm.rotateAngleY += bipedBody.rotateAngleY;
            bipedLeftArm.rotateAngleX += bipedBody.rotateAngleY;
            f = 1.0F - onGround;
            f *= f;
            f *= f;
            f = 1.0F - f;
            float f2 = MathHelper.sin(f * PI);
            float f4 = MathHelper.sin(onGround * PI) * -(bipedHead.rotateAngleX - 0.7F) * 0.75F;
            bipedRightArm.rotateAngleX -= f2 * 1.2D + f4;
            bipedRightArm.rotateAngleY += bipedBody.rotateAngleY * 2.0F;
            bipedRightArm.rotateAngleZ = MathHelper.sin(onGround * PI) * -0.4F;
        }

        if (isSneak)
        {
            bipedBody.rotateAngleX = 0.5F;
            if (entity instanceof EntityCustomNpc)
                bipedBody.rotateAngleX /= ((EntityCustomNpc)entity).modelData.modelScale.body.scaleY;
            bipedRightLeg.rotateAngleX -= 0.0F;
            bipedLeftLeg.rotateAngleX -= 0.0F;
            bipedRightArm.rotateAngleX += 0.4F;
            bipedLeftArm.rotateAngleX += 0.4F;
            bipedRightLeg.rotationPointZ = 4F;
            bipedLeftLeg.rotationPointZ = 4F;
            bipedRightLeg.rotationPointY = 9F;
            bipedLeftLeg.rotationPointY = 9F;
            bipedHead.rotationPointY = 1.0F;
        }
        else
        {
            bipedBody.rotateAngleX = 0.0F;
            bipedRightLeg.rotationPointZ = 0.0F;
            bipedLeftLeg.rotationPointZ = 0.0F;
            bipedRightLeg.rotationPointY = 12F;
            bipedLeftLeg.rotationPointY = 12F;
            bipedHead.rotationPointY = 0.0F;
        }

        bipedRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        bipedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        bipedRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
        bipedLeftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;

        if (aimedBow)
        {
            float f1 = 0.0F;
            float f3 = 0.0F;
            bipedRightArm.rotateAngleZ = 0.0F;
            bipedLeftArm.rotateAngleZ = 0.0F;
            bipedRightArm.rotateAngleY = -(0.1F - f1 * 0.6F) + bipedHead.rotateAngleY;
            bipedLeftArm.rotateAngleY = (0.1F - f1 * 0.6F) + bipedHead.rotateAngleY + 0.4F;
            bipedRightArm.rotateAngleX = -(PI / 2F) + bipedHead.rotateAngleX;
            bipedLeftArm.rotateAngleX = -(PI / 2F) + bipedHead.rotateAngleX;
            bipedRightArm.rotateAngleX -= f1 * 1.2F - f3 * 0.4F;
            bipedLeftArm.rotateAngleX -= f1 * 1.2F - f3 * 0.4F;
            bipedRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
            bipedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
            bipedRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
            bipedLeftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
        }

        switch(currentAnimation)
        {
            case CRAWLING:
                setRotationAnglesCrawling(par1, par2, par3, par4, par5, par6, entity);
                break;
            case HUG:
                setRotationAnglesHug(par1, par2, par3, par4, par5, par6, entity);
                break;
            case WAVING:
                setRotationAnglesWaving(par1, par2, par3, par4, par5, par6, entity);
                break;
            case CRY:
                setRotationAnglesCry(par1, par2, par3, par4, par5, par6, entity);
                break;
            default:
                break;
        }

        if (entity instanceof EntityCustomNpc)
            puppetRotate((EntityCustomNpc) entity, par2);
    }

    @Unique
    private void puppetRotate(EntityCustomNpc npc, float f)
    {
        if (npc.modelData.enableRotation && !npc.display.animationData.isActive() && isRotationActive(npc))
        {
            if(!npc.modelData.rotation.head.disabled)
            {
                bipedHeadwear.rotateAngleX = bipedHead.rotateAngleX = npc.modelData.rotation.head.rotationX * PI;
                bipedHeadwear.rotateAngleY = bipedHead.rotateAngleY = npc.modelData.rotation.head.rotationY * PI;
                bipedHeadwear.rotateAngleZ = bipedHead.rotateAngleZ = npc.modelData.rotation.head.rotationZ * PI;
            }
            if(!npc.modelData.rotation.body.disabled)
            {
                bipedBody.rotateAngleX = npc.modelData.rotation.body.rotationX * PI;
                bipedBody.rotateAngleY = npc.modelData.rotation.body.rotationY * PI;
                bipedBody.rotateAngleZ = npc.modelData.rotation.body.rotationZ * PI;
            }
            if(!npc.modelData.rotation.larm.disabled)
            {
                bipedLeftArm.rotateAngleX = npc.modelData.rotation.larm.rotationX * PI;
                bipedLeftArm.rotateAngleY = npc.modelData.rotation.larm.rotationY * PI;
                bipedLeftArm.rotateAngleZ = npc.modelData.rotation.larm.rotationZ * PI;
                if(!npc.display.disableLivingAnimation)
                {
                    bipedLeftArm.rotateAngleZ -= MathHelper.cos(f * 0.09F) * 0.05F + 0.05F;
                    bipedLeftArm.rotateAngleX -= MathHelper.sin(f * 0.067F) * 0.05F;
                }
            }
            if(!npc.modelData.rotation.rarm.disabled)
            {
                bipedRightArm.rotateAngleX = npc.modelData.rotation.rarm.rotationX * PI;
                bipedRightArm.rotateAngleY = npc.modelData.rotation.rarm.rotationY * PI;
                bipedRightArm.rotateAngleZ = npc.modelData.rotation.rarm.rotationZ * PI;
                if(!npc.display.disableLivingAnimation)
                {
                    bipedRightArm.rotateAngleZ += MathHelper.cos(f * 0.09F) * 0.05F + 0.05F;
                    bipedRightArm.rotateAngleX += MathHelper.sin(f * 0.067F) * 0.05F;
                }
            }
            if(!npc.modelData.rotation.rleg.disabled)
            {
                bipedRightLeg.rotateAngleX = npc.modelData.rotation.rleg.rotationX * PI;
                bipedRightLeg.rotateAngleY = npc.modelData.rotation.rleg.rotationY * PI;
                bipedRightLeg.rotateAngleZ = npc.modelData.rotation.rleg.rotationZ * PI;
            }
            if(!npc.modelData.rotation.lleg.disabled)
            {
                bipedLeftLeg.rotateAngleX = npc.modelData.rotation.lleg.rotationX * PI;
                bipedLeftLeg.rotateAngleY = npc.modelData.rotation.lleg.rotationY * PI;
                bipedLeftLeg.rotateAngleZ = npc.modelData.rotation.lleg.rotationZ * PI;
            }
        }
    }

    @Unique
    private static boolean isRotationActive(EntityCustomNpc npc)
    {
        if (!npc.isEntityAlive())
            return false;
        else
            return npc.modelData.rotation.whileAttacking && npc.isAttacking() || npc.modelData.rotation.whileMoving && npc.isWalking() || npc.modelData.rotation.whileStanding && !npc.isWalking();
    }

    @Unique
    private void setInitialAngles()
    {
        // Head
        bipedHead.rotationPointX = 0F;
        bipedHead.rotationPointY = 0F;
        bipedHead.rotationPointZ = 0F;
        bipedHead.rotateAngleZ = 0F;
        bipedHeadwear.rotationPointX = 0F;
        bipedHeadwear.rotationPointY = 0F;
        bipedHeadwear.rotationPointZ = 0F;
        bipedHeadwear.rotateAngleZ = 0F;

        // Body
        bipedBody.rotationPointX = 0F;
        bipedBody.rotationPointY = 0F;
        bipedBody.rotationPointZ = 0F;
        bipedBody.rotateAngleX = 0F;
        bipedBody.rotateAngleY = 0F;
        bipedBody.rotateAngleZ = 0F;

        // Legs
        bipedLeftLeg.rotateAngleX = 0F;
        bipedLeftLeg.rotateAngleY = 0F;
        bipedLeftLeg.rotateAngleZ = 0F;
        bipedRightLeg.rotateAngleX = 0F;
        bipedRightLeg.rotateAngleY = 0F;
        bipedRightLeg.rotateAngleZ = 0F;

        // Arms
        bipedLeftArm.rotationPointY = 2F;
        bipedLeftArm.rotationPointZ = 0F;
        bipedRightArm.rotationPointY = 2F;
        bipedRightArm.rotationPointZ = 0F;
    }

    @Unique
    private void setRotationAnglesHug(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
    {
        final float f6 = MathHelper.sin(onGround * 3.141593F);
        final float f7 = MathHelper.sin((1.0F - (1.0F - onGround) * (1.0F - onGround)) * 3.141593F);
        bipedRightArm.rotateAngleZ = 0.0F;
        bipedLeftArm.rotateAngleZ = 0.0F;
        bipedRightArm.rotateAngleY = -(0.1F - f6 * 0.6F);
        bipedLeftArm.rotateAngleY = 0.1F;
        bipedRightArm.rotateAngleX = -1.570796F;
        bipedLeftArm.rotateAngleX = -1.570796F;
        bipedRightArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        bipedRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        bipedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        bipedRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
        bipedLeftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
    }

    @Unique
    private void setRotationAnglesCrawling(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
    {
        bipedHead.rotateAngleZ = -par4 / (180F / PI);
        bipedHead.rotateAngleY = 0;
        bipedHead.rotateAngleX = -55 / (180F / PI);

        bipedHeadwear.rotateAngleX = bipedHead.rotateAngleX;
        bipedHeadwear.rotateAngleY = bipedHead.rotateAngleY;
        bipedHeadwear.rotateAngleZ = bipedHead.rotateAngleZ;

        if(par2 > 0.25)
            par2 = 0.25f;
        float movement = MathHelper.cos(par1 * 0.8f + PI) * par2;

        bipedLeftArm.rotateAngleX = 180 / (180F / PI) - movement * 0.25f;
        bipedLeftArm.rotateAngleY = movement * -0.46f;
        bipedLeftArm.rotateAngleZ = movement * -0.2f;
        bipedLeftArm.rotationPointY = 2 - movement * 9.0F;

        bipedRightArm.rotateAngleX = 180 / (180F / PI) + movement * 0.25f;
        bipedRightArm.rotateAngleY = movement * -0.4f;
        bipedRightArm.rotateAngleZ = movement * -0.2f;
        bipedRightArm.rotationPointY = 2 + movement * 9.0F;

        bipedBody.rotateAngleY = movement * 0.1f;
        bipedBody.rotateAngleX = 0;
        bipedBody.rotateAngleZ = movement * 0.1f;

        bipedLeftLeg.rotateAngleX = movement * 0.1f;
        bipedLeftLeg.rotateAngleY = movement * 0.1f;
        bipedLeftLeg.rotateAngleZ = -7 / (180F / PI) - movement * 0.25f;
        bipedLeftLeg.rotationPointY = 10.4f + movement * 9.0F;
        bipedLeftLeg.rotationPointZ = movement * 0.6f - 0.01f;

        bipedRightLeg.rotateAngleX = movement * -0.1f;
        bipedRightLeg.rotateAngleY = movement * 0.1f;
        bipedRightLeg.rotateAngleZ = 7 / (180F / PI) - movement * 0.25f;
        bipedRightLeg.rotationPointY = 10.4f - movement * 9.0F;
        bipedRightLeg.rotationPointZ = movement * -0.6f - 0.01f;
    }

    @Unique
    private void setRotationAnglesWaving(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
    {
        bipedRightArm.rotateAngleX = -0.1f;
        bipedRightArm.rotateAngleY = 0;
        bipedRightArm.rotateAngleZ = (float) (Math.PI - 1f  - Math.sin(entity.ticksExisted * 0.27f) * 0.5f);
    }

    @Unique
    private void setRotationAnglesCry(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
    {
        bipedHeadwear.rotateAngleX = bipedHead.rotateAngleX = 0.7f;
    }
}

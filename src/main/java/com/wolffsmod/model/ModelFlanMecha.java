package com.wolffsmod.model;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.driveables.mechas.EnumMechaSlotType;
import com.flansmod.common.vector.Vector3f;
import com.wolffsmod.entity.EntityFlanMechaNPC;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public abstract class ModelFlanMecha extends ModelMecha
{
    public ModelFlanMecha() {}

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        EntityFlanMechaNPC mecha = ((EntityFlanMechaNPC) entity);

        renderPart(bodyModel);
        renderPart(bodyDoorCloseModel);
        for (ModelRendererTurbo[][] gun : gunModels.values())
            for (ModelRendererTurbo[] gunPart : gun)
                renderPart(gunPart);
        renderPart(hipsModel);
        for (ModelRendererTurbo aBarrelModel : barrelModel)
        {
            aBarrelModel.rotateAngleZ = -(mecha.driver.getPitch() * (float)Math.PI / 180F);
            aBarrelModel.render(f5, oldRotateOrder);
        }
        renderPart(headModel);
        renderLeftArm(mecha, f1);
        renderRightArm(mecha, f1);
        renderLegs(mecha, f1);
    }

    protected void renderLegs(EntityFlanMechaNPC mecha, float f1)
    {
        float legLength = mecha.legLength;

        float dLLUR = mecha.leftLegUpperAngle - mecha.prevLeftLegUpperAngle;
        float dLLLR = mecha.leftLegLowerAngle - mecha.prevLeftLegLowerAngle;
        float dLFR = mecha.leftFootAngle - mecha.prevLeftFootAngle;
        float dRLUR = mecha.rightLegUpperAngle - mecha.prevRightLegUpperAngle;
        float dRLLR = mecha.rightLegLowerAngle - mecha.prevRightLegLowerAngle;
        float dRFR = mecha.rightFootAngle - mecha.prevRightFootAngle;

        float leftLegUpperRot = (float)Math.toRadians(mecha.prevLeftLegUpperAngle + dLLUR*f1);
        float rightLegUpperRot = (float)Math.toRadians(mecha.prevRightLegUpperAngle + dRLUR*f1);
        float leftLegLowerRot = (float)Math.toRadians(mecha.prevLeftLegLowerAngle + dLLLR*f1);
        Vector3f leftLegLowerPos;
        float rightLegLowerRot = (float)Math.toRadians(mecha.prevRightLegLowerAngle + dRLLR*f1);
        Vector3f rightLegLowerPos;
        float leftFootRot = (float)Math.toRadians(mecha.prevLeftFootAngle + dLFR*f1);
        Vector3f leftFootPos;
        float rightFootRot = (float)Math.toRadians(mecha.rightFootAngle + dRFR*f1);
        Vector3f rightFootPos;

        float legsYaw = (float)Math.sin(((mecha.ticksExisted) + f1) / mecha.legSwingTime) * mecha.legSwing;
        float footH = (float)Math.sin(legsYaw) * legLength;
        float footV = (float)Math.cos(legsYaw) * legLength;

        GL11.glPushMatrix();
        {
            GL11.glTranslatef(0F, legLength, 0F);

            //Left Foot
            GL11.glPushMatrix();
            GL11.glTranslatef(footH, -footV, 0F);
            renderPart(leftFootModel);
            GL11.glPopMatrix();

            //Right Foot
            GL11.glPushMatrix();
            GL11.glTranslatef(-footH, -footV, 0F);
            renderPart(rightFootModel);
            GL11.glPopMatrix();

            //Left Leg
            GL11.glPushMatrix();
            GL11.glRotatef(legsYaw * 180F / (float)Math.PI, 0F, 0F, 1F);
            GL11.glTranslatef(0F, -legLength, 0F);
            renderPart(leftLegModel);
            GL11.glPopMatrix();

            //Right Leg
            GL11.glPushMatrix();
            GL11.glRotatef(-legsYaw * 180F / (float)Math.PI, 0F, 0F, 1F);
            GL11.glTranslatef(0F, -legLength, 0F);
            renderPart(rightLegModel);
            GL11.glPopMatrix();

            //Left Leg Upper
            GL11.glPushMatrix();
            GL11.glRotatef(leftLegUpperRot * 180F / (float)Math.PI, 0F, 0F, 1F);
            GL11.glTranslatef(0F, -legLength, 0F);
            renderPart(leftAnimLegUpperModel);
            GL11.glPopMatrix();

            //Right Leg Upper
            GL11.glPushMatrix();
            GL11.glRotatef(rightLegUpperRot * 180F / (float)Math.PI, 0F, 0F, 1F);
            GL11.glTranslatef(0F, -legLength, 0F);
            renderPart(rightAnimLegUpperModel);
            GL11.glPopMatrix();

        }
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        {
            //Left Leg Lower
            GL11.glPushMatrix();
            leftLegLowerPos = rotatedChildPosition(leftLegUpperOrigin, leftLegLowerOrigin, leftLegUpperRot);
            GL11.glTranslatef(leftLegUpperOrigin.x, leftLegUpperOrigin.y, leftLegUpperOrigin.z);
            GL11.glTranslatef(leftLegLowerPos.x, -leftLegLowerPos.y, 0F);
            GL11.glRotatef(leftLegLowerRot * 180F / (float)Math.PI, 0F, 0F, 1F);
            renderPart(leftAnimLegLowerModel);
            GL11.glPopMatrix();

            //Right Leg Lower
            GL11.glPushMatrix();
            rightLegLowerPos = rotatedChildPosition(rightLegUpperOrigin, rightLegLowerOrigin, rightLegUpperRot);
            GL11.glTranslatef(rightLegUpperOrigin.x, rightLegUpperOrigin.y, rightLegUpperOrigin.z);
            GL11.glTranslatef(rightLegLowerPos.x, -rightLegLowerPos.y, 0F);
            GL11.glRotatef(rightLegLowerRot * 180F / (float)Math.PI, 0F, 0F, 1F);
            renderPart(rightAnimLegLowerModel);
            GL11.glPopMatrix();


            //Left Foot Anim
            GL11.glPushMatrix();
            leftFootPos = rotatedChildPosition(leftLegLowerOrigin, leftFootOrigin, leftLegLowerRot);
            GL11.glTranslatef(-leftFootOrigin.x, legLength, -leftFootOrigin.z);
            GL11.glTranslatef(leftFootPos.x + leftLegLowerPos.x, -leftFootPos.y - leftLegLowerPos.y, 0F);
            GL11.glRotatef(leftFootRot * 180F / (float)Math.PI, 0F, 0F, 1F);
            renderPart(leftAnimFootModel);
            GL11.glPopMatrix();

            //Right Foot Anim
            GL11.glPushMatrix();
            rightFootPos = rotatedChildPosition(rightLegLowerOrigin, rightFootOrigin, rightLegLowerRot);
            GL11.glTranslatef(-rightFootOrigin.x, legLength, -rightFootOrigin.z);
            GL11.glTranslatef(rightFootPos.x + rightLegLowerPos.x, -rightFootPos.y - rightLegLowerPos.y, 0F);
            GL11.glRotatef(rightFootRot * 180F / (float)Math.PI, 0F, 0F, 1F);
            renderPart(rightAnimFootModel);
            GL11.glPopMatrix();
        }
        GL11.glPopMatrix();
    }

    protected Vector3f rotatedChildPosition (Vector3f parentJoint, Vector3f childJoint, float rotation)
    {
        Vector3f position;
        float initialRot;
        float yDiff = parentJoint.y - childJoint.y;
        float xDiff = parentJoint.x - childJoint.x;
        float length = (float)Math.sqrt((yDiff*yDiff) + (xDiff*xDiff));
        initialRot = (float)Math.atan(xDiff/yDiff);
        float xPos = (float)Math.sin(rotation - initialRot) * length;
        float yPos = (float)Math.cos(rotation - initialRot) * length;
        position = new Vector3f(xPos, yPos, 0f);
        return position;
    }

    public void renderLeftArm(EntityFlanMechaNPC mecha, float f1)
    {
        GL11.glPushMatrix();

        //Get the arm pitch from the mecha entity
        float smoothedPitch = mecha.prevRotationPitch + (mecha.rotationPitch - mecha.prevRotationPitch) * f1;

        //Lower Limit
        if(smoothedPitch > mecha.lowerArmLimit)
            smoothedPitch = mecha.lowerArmLimit;
        //Upper Limit
        if(smoothedPitch < -mecha.upperArmLimit)
            smoothedPitch = -mecha.upperArmLimit;

        //Translate to the arm origin, rotate and render
        GL11.glTranslatef(mecha.leftArmOrigin.x / mecha.getModelScale(), mecha.leftArmOrigin.y / mecha.getModelScale(), mecha.leftArmOrigin.z / mecha.getModelScale());
        GL11.glRotatef(90F - smoothedPitch, 0F, 0F, 1F);
        GL11.glPushMatrix();
        renderPart(leftArmModel);
        GL11.glPopMatrix();

        //Move to the end of the arm and render the held item
        GL11.glTranslatef(0F + mecha.leftHandModifierY, -mecha.armLength - mecha.leftHandModifierX, 0F + mecha.leftHandModifierZ);
        /*ItemStack holdingStack = mecha.npc.getHeldItem();
        if(holdingStack == null)
        {
            model.renderLeftHand(scale, mecha, f1);
        }
        else
        {
            GL11.glScalef(type.heldItemScale, type.heldItemScale, type.heldItemScale);
            renderItem(mecha, holdingStack, 0, true, f1);
        }*/
        renderPart(leftHandModel);
        GL11.glPopMatrix();
    }

    protected void renderRightArm(EntityFlanMechaNPC mecha, float f1)
    {
        GL11.glPushMatrix();

        //Get the arm pitch from the mecha entity
        float smoothedPitch = mecha.prevRotationPitch + (mecha.rotationPitch - mecha.prevRotationPitch) * f1;

        //Lower Limit
        if(smoothedPitch > mecha.lowerArmLimit)
            smoothedPitch = mecha.lowerArmLimit;
        //Upper Limit
        if(smoothedPitch < -mecha.upperArmLimit)
            smoothedPitch = -mecha.upperArmLimit;

        //Translate to the arm origin, rotate and render
        GL11.glTranslatef(mecha.rightArmOrigin.x / mecha.getModelScale(), mecha.rightArmOrigin.y / mecha.getModelScale(), mecha.rightArmOrigin.z / mecha.getModelScale());
        GL11.glRotatef(90F - smoothedPitch, 0F, 0F, 1F);
        GL11.glPushMatrix();
        renderPart(rightArmModel);
        GL11.glPopMatrix();

        //Move to the end of the arm and render the held item
        GL11.glTranslatef(0F + mecha.rightHandModifierY, -mecha.armLength - mecha.rightHandModifierX, 0F + mecha.rightHandModifierZ);
        /*ItemStack holdingStack = mecha.npc.getOffHand();
        if(holdingStack == null)
        {
            model.renderRightHand(scale, mecha, f1);
        }
        else
        {
            GL11.glScalef(type.heldItemScale, type.heldItemScale, type.heldItemScale);
            renderItem(mecha, holdingStack, 0, false, f1);
        }*/
        GL11.glPopMatrix();
    }
}

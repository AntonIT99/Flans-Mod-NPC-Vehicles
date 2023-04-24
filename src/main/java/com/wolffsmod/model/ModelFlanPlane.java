package com.wolffsmod.model;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.wolffsmod.entity.EntityFlanDriveableNPC;
import com.wolffsmod.entity.EntityFlanPlaneNPC;
import com.wolffsmod.entity.Seat;

import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Optional;

public abstract class ModelFlanPlane extends ModelPlane
{
    public ModelFlanPlane() {}

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        EntityFlanPlaneNPC plane = ((EntityFlanPlaneNPC) entity);

        renderPart(bodyModel);
        if (plane.doorsOpen)
            renderPart(bodyDoorOpenModel);
        else
            renderPart(bodyDoorCloseModel);
        renderGuns(plane, plane.vehicleGunModelScale);
        renderPart(noseModel);
        renderPart(bayModel);
        renderPart(tailModel);
        renderPart(leftWingModel);
        renderPart(rightWingModel);
        renderPart(topWingModel);
        renderAnimWings();
        renderPropeller(plane.propAngle);
        for (ModelRendererTurbo[] heliMainRotorModel : heliMainRotorModels) renderPart(heliMainRotorModel);
        for (ModelRendererTurbo[] heliTailRotorModel : heliTailRotorModels) renderPart(heliTailRotorModel);
        for (ModelRendererTurbo[] partModel : valkyrie) renderPart(partModel);
        renderPart(helicopterModeParts);
        renderPart(skidsModel);
        renderPart(yawFlapModel);
        renderPart(pitchFlapLeftModel);
        renderPart(pitchFlapRightModel);
        renderPart(pitchFlapLeftWingModel);
        renderPart(pitchFlapRightWingModel);
        renderPart(hudModel);
        renderPart(tailDoorCloseModel);
        renderPart(rightWingPos1Model);
        renderPart(leftWingPos1Model);
        renderWheels();
        renderAnimDoors();
    }

    protected void renderGuns(EntityFlanDriveableNPC entity, float vehicleGunModelScale)
    {
        float f5 = 0.0625F;

        for (String gunName : gunModels.keySet())
        {
            ModelRendererTurbo[][] gunModel = gunModels.get(gunName);

            if (gunModel.length < 1)
                return;

            Optional<Seat> passenger = entity.getPassengerFromGun(gunName);

            //Yaw only parts
            for (ModelRendererTurbo gunModelPart : gunModel[0])
            {
                //Yaw and render
                GL11.glPushMatrix();
                GL11.glScalef(vehicleGunModelScale, vehicleGunModelScale, vehicleGunModelScale);
                passenger.ifPresent(seat -> gunModelPart.rotateAngleY = (180F - seat.getLocalYaw()) * (float) Math.PI / 180F);
                gunModelPart.render(f5);
                GL11.glPopMatrix();
            }

            if (gunModel.length < 2)
                return;

            //Yaw and pitch, no recoil parts
            for (ModelRendererTurbo gunModelPart : gunModel[1])
            {
                GL11.glPushMatrix();
                GL11.glScalef(vehicleGunModelScale, vehicleGunModelScale, vehicleGunModelScale);
                if (passenger.isPresent())
                {
                    //Yaw, pitch and render
                    gunModelPart.rotateAngleY = (180F - passenger.get().getLocalYaw()) * (float) Math.PI / 180F;
                    gunModelPart.rotateAngleZ = -passenger.get().getPitch() * (float) Math.PI / 180F;
                }
                gunModelPart.render(f5);
                GL11.glPopMatrix();
            }

            if (gunModel.length < 3)
                return;

            //Yaw, pitch and recoil parts
            for (ModelRendererTurbo gunModelPart : gunModel[2])
            {
                GL11.glPushMatrix();
                GL11.glScalef(vehicleGunModelScale, vehicleGunModelScale, vehicleGunModelScale);
                if (passenger.isPresent())
                {
                    //Yaw, pitch, recoil and render
                    gunModelPart.rotateAngleY = (180F - passenger.get().getLocalYaw()) * (float) Math.PI / 180F;
                    gunModelPart.rotateAngleZ = -passenger.get().getPitch() * (float) Math.PI / 180F;
                }
                gunModelPart.render(f5);
                GL11.glPopMatrix();
            }

            if (gunModel.length < 4)
                return;
            
            for(ModelRendererTurbo gunModelPart : gunModel[3])
            {
                GL11.glPushMatrix();
                GL11.glScalef(vehicleGunModelScale, vehicleGunModelScale, vehicleGunModelScale);
                if (passenger.isPresent())
                {
                    //Yaw, pitch, recoil and render
                    gunModelPart.rotateAngleY = (180F - passenger.get().getLocalYaw()) * (float) Math.PI / 180F;
                    gunModelPart.rotateAngleZ = -passenger.get().getPitch() * (float) Math.PI / 180F;
                }
                gunModelPart.render(f5);
                GL11.glPopMatrix();
            }

            for (int i = 4; i < gunModel.length; i++)
            {
                GL11.glPushMatrix();
                GL11.glScalef(vehicleGunModelScale, vehicleGunModelScale, vehicleGunModelScale);
                if (passenger.isPresent())
                {
                    for (ModelRendererTurbo gunModelPart : gunModel[i])
                    {
                        gunModelPart.rotateAngleY = (180F - passenger.get().getLocalYaw()) * (float) Math.PI / 180F;
                        gunModelPart.rotateAngleZ = -passenger.get().getPitch() * (float) Math.PI / 180F;
                    }
                }
                renderPart(gunModel[i]);
                GL11.glPopMatrix();
            }
        }
    }

    protected void renderAnimDoors()
    {
        GL11.glPushMatrix();
        {
            GL11.glTranslatef(doorAttach.x, doorAttach.y, -doorAttach.z);
            renderPart(doorAnimModel);
        }
        GL11.glPopMatrix();
    }

    protected void renderWheels()
    {
        renderPart(bodyWheelModel);
        renderPart(tailWheelModel);
        renderPart(leftWingWheelModel);
        renderPart(rightWingWheelModel);

        GL11.glPushMatrix();
        {
            GL11.glTranslatef(bodyWheelAttach.x, bodyWheelAttach.y, -bodyWheelAttach.z);
            renderPart(bodyAnimWheelModel);
        }
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        {
            GL11.glTranslatef(tailWheelAttach.x, tailWheelAttach.y, -tailWheelAttach.z);
            renderPart(tailAnimWheelModel);
        }
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        {
            GL11.glTranslatef(leftWingWheelAttach.x, leftWingWheelAttach.y, -leftWingWheelAttach.z);
            renderPart(leftAnimWingWheelModel);
        }
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        {
            GL11.glTranslatef(rightWingWheelAttach.x, rightWingWheelAttach.y, -rightWingWheelAttach.z);
            renderPart(rightAnimWingWheelModel);
        }
        GL11.glPopMatrix();
    }

    protected void renderPropeller(float propAngle)
    {
        for(ModelRendererTurbo[] prop : propellerModels)
        {
            for(int i = 0; i < prop.length; i++)
            {
                prop[i].rotateAngleX = propAngle + (i * 2F * (float) Math.PI) / (prop.length);
            }
            renderPart(prop);
        }
    }

    protected void renderAnimWings()
    {
        GL11.glPushMatrix();
        {
            GL11.glTranslatef(leftWingAttach.x, leftWingAttach.y, -leftWingAttach.z);
            renderPart(leftAnimWingModel);
        }
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        {
            GL11.glTranslatef(rightWingAttach.x, rightWingAttach.y, -rightWingAttach.z);
            renderPart(rightAnimWingModel);
        }
        GL11.glPopMatrix();
    }
}

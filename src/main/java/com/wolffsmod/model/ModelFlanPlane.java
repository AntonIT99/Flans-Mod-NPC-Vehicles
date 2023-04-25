package com.wolffsmod.model;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.wolffsmod.entity.EntityFlanDriveableNPC;
import com.wolffsmod.entity.EntityFlanPlaneNPC;
import com.wolffsmod.entity.Seat;

import net.minecraft.entity.Entity;

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
        renderRotor(plane.propAngle);
        for (ModelRendererTurbo[] partModel : valkyrie) renderPart(partModel);
        renderPart(helicopterModeParts);
        renderPart(yawFlapModel);
        renderPart(pitchFlapLeftModel);
        renderPart(pitchFlapRightModel);
        renderPart(pitchFlapLeftWingModel);
        renderPart(pitchFlapRightWingModel);
        renderPart(hudModel);
        renderPart(tailDoorCloseModel);
        if (plane.varWing)
        {
            renderPart(leftWingPos1Model);
            renderPart(rightWingPos1Model);
        }
        else
        {
            renderPart(leftWingPos2Model);
            renderPart(rightWingPos2Model);
        }
        renderLandingGearAndWheels(plane);
        renderAnimDoors();
    }

    protected void renderGuns(EntityFlanDriveableNPC entity, float vehicleGunModelScale)
    {
        float f5 = 0.0625F;

        for (String gunName : gunModels.keySet())
        {
            ModelRendererTurbo[][] gunModel = gunModels.get(gunName);

            if (gunModel.length < 1)
                continue;

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
                continue;

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
                continue;

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
                continue;
            
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

    protected void renderLandingGearAndWheels(EntityFlanPlaneNPC plane)
    {
        if (!plane.gearUp)
        {
            renderPart(skidsModel);
            renderPart(bodyWheelModel);
            renderPart(tailWheelModel);
            renderPart(leftWingWheelModel);
            renderPart(rightWingWheelModel);
        }

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

    protected void renderRotor(float rotorAngle)
    {
        //Render heli main rotors
        for(int i = 0; i < heliMainRotorModels.length; i++)
        {
            GL11.glPushMatrix();
            GL11.glTranslatef(heliMainRotorOrigins[i].x, heliMainRotorOrigins[i].y, heliMainRotorOrigins[i].z);
            GL11.glRotatef(rotorAngle * heliRotorSpeeds[i] * 1440F / (float)Math.PI, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(-heliMainRotorOrigins[i].x, -heliMainRotorOrigins[i].y, -heliMainRotorOrigins[i].z);
            renderPart(heliMainRotorModels[i]);
            GL11.glPopMatrix();
        }
        //Render heli tail rotors
        for(int i = 0; i < heliTailRotorModels.length; i++)
        {
            GL11.glPushMatrix();
            GL11.glTranslatef(heliTailRotorOrigins[i].x, heliTailRotorOrigins[i].y, heliTailRotorOrigins[i].z);
            GL11.glRotatef(rotorAngle * 1440F / (float)Math.PI, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(-heliTailRotorOrigins[i].x, -heliTailRotorOrigins[i].y, -heliTailRotorOrigins[i].z);
            renderPart(heliTailRotorModels[i]);
            GL11.glPopMatrix();
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

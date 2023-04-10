package com.wolffsmod.model;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.wolffsmod.Utils;
import com.wolffsmod.entity.EntityFlanPlane;
import com.wolffsmod.entity.EntityFlanVehicle;
import com.wolffsmod.model.Plane;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;

import java.util.HashMap;
import java.util.Map;

public abstract class ModelFlanPlane extends ModelPlane implements Plane
{
    /** Driveable parameters **/
    public float vehicleGunModelScale = 1F;
    public Seat driver = new Seat();
    public Map<Integer, Seat> passengers = new HashMap<>();
    public boolean doorsOpen;
    public float throttle;

    /** Plane parameters **/
    public float basePropSpeed = 0.1F;
    public float propAngle;

    public ModelFlanPlane()
    {
        setupConfig();
    }


    /**
     * Driveable implementation
     **/

    @Override
    public void setDriver(float minYaw, float maxYaw, float minPitch, float maxPitch)
    {
        driver.set(minYaw, maxYaw, minPitch, maxPitch, true);
    }

    @Override
    public void setDriverAimSpeed(float yawSpeed, float pitchSpeed)
    {
        driver.yawSpeed = yawSpeed;
        driver.pitchSpeed = pitchSpeed;
    }

    @Override
    public void setPassenger(int id, float minYaw, float maxYaw, float minPitch, float maxPitch)
    {
        passengers.put(id, new Seat(minYaw, maxYaw, minPitch, maxPitch, false));
    }

    @Override
    public void setPassengerBaseYaw(int id, float angle)
    {
        if (passengers.get(id) != null)
        {
            passengers.get(id).baseYawAngle = angle;
        }
    }

    @Override
    public void setPassengerAimSpeed(int id, float yawSpeed, float pitchSpeed)
    {
        if (passengers.get(id) != null)
        {
            passengers.get(id).yawSpeed = yawSpeed;
            passengers.get(id).pitchSpeed = pitchSpeed;
        }
    }

    @Override
    public void setVehicleGunModelScale(float scale)
    {
        vehicleGunModelScale = scale;
    }


    /**
     * Rendering
     **/

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        throttle = (float) Utils.getMovementVelocity(entity);
        float propSpeed = (basePropSpeed + throttle) / (basePropSpeed + 1F);
        if (entity instanceof EntityFlanPlane && !((EntityFlanPlane)entity).propEngineOn)
            propSpeed = 0F;

        if (entity instanceof EntityLivingBase)
            throttle /= ((EntityLivingBase)entity).getEntityAttribute(SharedMonsterAttributes.movementSpeed).getBaseValue();
        if (entity instanceof EntityFlanVehicle)
            doorsOpen = ((EntityFlanVehicle)entity).doorsOpen;

        setYawAndPitch(f3, f4);
        setPassengersYawAndPitch(f3, f4);

        renderPart(bodyModel);
        if (doorsOpen)
            renderPart(bodyDoorOpenModel);
        else
            renderPart(bodyDoorCloseModel);
        renderGuns();
        renderPart(noseModel);
        renderPart(bayModel);
        renderPart(tailModel);
        renderPart(leftWingModel);
        renderPart(rightWingModel);
        renderPart(topWingModel);
        renderAnimWings();
        renderPropeller(propSpeed);
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

    protected void setYawAndPitch(float f3, float f4)
    {
        float targetYaw = Math.min(Math.max(f3, -driver.maxYaw), -driver.minYaw);
        float targetPitch = Math.min(Math.max(f4, -driver.maxPitch), -driver.minPitch);

        if (driver.yaw < targetYaw)
            driver.yaw += Math.min(driver.yawSpeed, targetYaw - driver.yaw);
        if (driver.yaw > targetYaw)
            driver.yaw -= Math.min(driver.yawSpeed, driver.yaw - targetYaw);
        if (driver.pitch < targetPitch)
            driver.pitch += Math.min(driver.pitchSpeed, targetPitch - driver.pitch);
        if (driver.pitch > targetPitch)
            driver.pitch -= Math.min(driver.pitchSpeed, driver.pitch - targetPitch);
    }

    protected void setPassengersYawAndPitch(float f3, float f4)
    {
        for(Integer id: passengers.keySet())
        {
            Seat passenger = passengers.get(id);
            float targetPassengerYaw = Math.min(Math.max(f3, -passenger.maxYaw), -passenger.minYaw);
            float targetPassengerPitch = Math.min(Math.max(f4, -passenger.maxPitch), -passenger.minPitch);

            if (passenger.yaw < targetPassengerYaw)
                passenger.yaw += Math.min(passenger.yawSpeed, targetPassengerYaw - passenger.yaw);
            if (passenger.yaw > targetPassengerYaw)
                passenger.yaw -= Math.min(passenger.yawSpeed, passenger.yaw - targetPassengerYaw);
            if (passenger.pitch < targetPassengerPitch)
                passenger.pitch += Math.min(passenger.pitchSpeed, targetPassengerPitch - passenger.pitch);
            if (passenger.pitch > targetPassengerPitch)
                passenger.pitch -= Math.min(passenger.pitchSpeed, passenger.pitch - targetPassengerPitch);
        }
    }

    protected void renderGuns()
    {
        float f5 = 0.0625F;

        for (ModelRendererTurbo[][] gunModel : gunModels.values())
        {
            if (gunModel.length < 1)
                return;

            //Yaw only parts
            for (ModelRendererTurbo gunModelPart : gunModel[0])
            {
                //Yaw and render
                GL11.glPushMatrix();
                GL11.glScalef(vehicleGunModelScale, vehicleGunModelScale, vehicleGunModelScale);
                if (passengers.get(0) != null)
                {
                    gunModelPart.rotateAngleY = (passengers.get(0).baseYawAngle + 180F - passengers.get(0).yaw) * (float) Math.PI / 180F;
                }
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
                if (passengers.get(1) != null)
                {
                    //Yaw, pitch and render
                    gunModelPart.rotateAngleY = (passengers.get(1).baseYawAngle + 180F - passengers.get(1).yaw) * (float) Math.PI / 180F;
                    gunModelPart.rotateAngleZ = -passengers.get(1).pitch * (float) Math.PI / 180F;
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
                if (passengers.get(2) != null)
                {
                    //Yaw, pitch, recoil and render
                    gunModelPart.rotateAngleY = (passengers.get(2).baseYawAngle + 180F - passengers.get(2).yaw) * (float) Math.PI / 180F;
                    gunModelPart.rotateAngleZ = -passengers.get(2).pitch * (float) Math.PI / 180F;
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
                if (passengers.get(3) != null)
                {
                    //Yaw, pitch, recoil and render
                    gunModelPart.rotateAngleY = (passengers.get(3).baseYawAngle + 180F - passengers.get(3).yaw) * (float) Math.PI / 180F;
                    gunModelPart.rotateAngleZ = -passengers.get(3).pitch * (float) Math.PI / 180F;
                }
                gunModelPart.render(f5);
                GL11.glPopMatrix();
            }

            for (int i = 4; i < gunModel.length; i++)
            {
                GL11.glPushMatrix();
                GL11.glScalef(vehicleGunModelScale, vehicleGunModelScale, vehicleGunModelScale);
                if (passengers.get(i) != null)
                {
                    for (ModelRendererTurbo gunModelPart : gunModel[i])
                        gunModelPart.rotateAngleY = passengers.get(i).baseYawAngle * (float) Math.PI / 180F;
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

    protected void renderPropeller(float propSpeed)
    {
        propAngle += (Math.pow(Math.abs(propSpeed), 0.4F)) * 1.5F;
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

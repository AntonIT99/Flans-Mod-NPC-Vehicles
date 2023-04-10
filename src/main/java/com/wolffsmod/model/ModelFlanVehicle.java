package com.wolffsmod.model;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.model.AnimTankTrack;
import com.flansmod.client.model.AnimTrackLink;
import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.vector.Vector3f;
import com.wolffsmod.Utils;
import com.wolffsmod.entity.EntityFlanVehicle;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class ModelFlanVehicle extends ModelVehicle implements Vehicle
{
    /** Driveable parameters **/
    public float vehicleGunModelScale = 1F;
    public Seat driver = new Seat();
    public Map<Integer, Seat> passengers = new HashMap<>();
    public boolean doorsOpen;
    public float throttle;
    
    
    /** Vehicle parameters **/
    public final ArrayList<Vector3f> leftTrackPoints = new ArrayList<>();
    public final ArrayList<Vector3f> rightTrackPoints = new ArrayList<>();
    public final Vector3f turretOrigin = new Vector3f();
    public boolean rotateWheels = true;
    public int trackLinkFix = 5;
    public float trackLinkLength;
    public float wheelsAngle;
    public AnimTankTrack rightTrack;
    public AnimTankTrack leftTrack;
    public AnimTrackLink[] trackLinksLeft = new AnimTrackLink[0];
    public AnimTrackLink[] trackLinksRight = new AnimTrackLink[0];
    public float harvesterAngle;
    public float recoilPos;


    public ModelFlanVehicle(boolean fancyTracks)
    {
        setupConfig();
        if (fancyTracks)
            setupFancyTracks();
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
     * Vehicle implementation
     **/

    @Override
    public void addLeftLinkPoint(String point)
    {
        leftTrackPoints.add(new Vector3f(point, ""));
    }

    @Override
    public void addRightLinkPoint(String point)
    {
        rightTrackPoints.add(new Vector3f(point, ""));
    }

    @Override
    public void setRotateWheels(boolean rotateWheels)
    {
        this.rotateWheels = rotateWheels;
    }

    @Override
    public void setTrackLinkLength(float length)
    {
        trackLinkLength = length;
    }

    @Override
    public void setFixTrackLink(int trackLinkFix)
    {
        this.trackLinkFix = trackLinkFix;
    }

    @Override
    public void setTurretOrigin(float x, float y, float z)
    {
        turretOrigin.set(x/16F, y/16F, z/16F);
    }


    /**
     * Rendering
     **/

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        throttle = (float) Utils.getMovementVelocity(entity);

        if (entity instanceof EntityLivingBase)
        {
            throttle /= ((EntityLivingBase)entity).getEntityAttribute(SharedMonsterAttributes.movementSpeed).getBaseValue();

            float wheelYaw = Math.min(Math.max(Utils.getYawVelocity((EntityLivingBase) entity), -20F), 20F);
            animateFancyTracks(throttle, wheelYaw);
            for (ModelRendererTurbo model: steeringWheelModel)
                model.rotateAngleX = wheelYaw * (float) Math.PI / 180F * 3F;
        }
        if (entity instanceof EntityFlanVehicle)
            doorsOpen = ((EntityFlanVehicle)entity).doorsOpen;

        setYawAndPitch(f3, f4);
        setPassengersYawAndPitch(f3, f4);

        renderPart(steeringWheelModel);
        renderPart(bodyModel);
        if (doorsOpen)
            renderPart(bodyDoorOpenModel);
        else
            renderPart(bodyDoorCloseModel);
        renderWheels();
        renderPart(leftFrontLegModel);
        renderPart(rightFrontLegModel);
        renderPart(leftBackLegModel);
        renderPart(rightBackLegModel);
        renderPart(trailerModel);
        renderTracks();
        renderGuns();
        renderTurretAndBarrel();
        renderDrillHead(throttle);
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
                    gunModelPart.rotateAngleY = passengers.get(0).baseYawAngle - passengers.get(0).yaw * (float) Math.PI / 180F;
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
                //Yaw, pitch and render
                if (passengers.get(1) != null)
                {
                    gunModelPart.rotateAngleY = passengers.get(1).baseYawAngle -passengers.get(1).yaw * (float) Math.PI / 180F;
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
                //Yaw, pitch, recoil and render
                if (passengers.get(2) != null)
                {
                    gunModelPart.rotateAngleY = passengers.get(2).baseYawAngle - passengers.get(2).yaw * (float) Math.PI / 180F;
                    gunModelPart.rotateAngleZ = -passengers.get(2).pitch * (float) Math.PI / 180F;
                }
                gunModelPart.render(f5);
                GL11.glPopMatrix();
            }

            for (int i = 3; i < gunModel.length; i++)
            {
                GL11.glPushMatrix();
                GL11.glScalef(vehicleGunModelScale, vehicleGunModelScale, vehicleGunModelScale);
                if (passengers.get(i) != null)
                {
                    for(ModelRendererTurbo gunModelPart : gunModel[i])
                        gunModelPart.rotateAngleY = passengers.get(i).baseYawAngle * (float) Math.PI / 180F;
                }
                renderPart(gunModel[i]);
                GL11.glPopMatrix();
            }
        }
    }

    protected void renderTurretAndBarrel()
    {
        GL11.glPushMatrix();
        {
            GL11.glTranslatef(turretOrigin.x, turretOrigin.y, turretOrigin.z);
            GL11.glRotatef(-driver.yaw, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(-turretOrigin.x, -turretOrigin.y, -turretOrigin.z);

            GL11.glPushMatrix();
            {
                GL11.glScalef(turretScale.x, turretScale.y, turretScale.z);
                GL11.glTranslatef(turretTrans.x, turretTrans.y, turretTrans.z);
                renderPart(turretModel);

                for (ModelRendererTurbo model: barrelModel)
                    model.rotateAngleZ = -driver.pitch * (float) Math.PI / 180F;
                renderPart(barrelModel);

                GL11.glPushMatrix();
                {
                    GL11.glTranslatef(barrelAttach.x, barrelAttach.y, -barrelAttach.z);
                    GL11.glRotatef(-driver.pitch, 0F, 0F, 1F);
                    renderPart(barrelSpecModel);
                }
                GL11.glPopMatrix();

                for (ModelRendererTurbo[] ammo : ammoModel)
                {
                    for (ModelRendererTurbo model : ammo)
                        model.rotateAngleZ = -driver.pitch * (float) Math.PI / 180F;
                    renderPart(ammo);
                }

                renderDrakon();
            }
            GL11.glPopMatrix();

            GL11.glTranslatef(barrelAttach.x, barrelAttach.y, -barrelAttach.z);
            GL11.glRotatef(-driver.pitch, 0F, 0F, 1F);
            GL11.glTranslatef(recoilPos*-(5F/16F),0F, 0F);
            renderPart(animBarrelModel);
        }
        GL11.glPopMatrix();
    }

    protected void renderTracks()
    {
        renderPart(rightTrackModel);
        renderPart(leftTrackModel);
        for (ModelRendererTurbo[] latm : leftAnimTrackModel)
            renderPart(latm);
        for (ModelRendererTurbo[] ratm : rightAnimTrackModel)
            renderPart(ratm);
        renderPart(rightAnimTrackModel1);
        renderPart(leftAnimTrackModel1);
        renderPart(rightAnimTrackModel2);
        renderPart(leftAnimTrackModel2);
        renderPart(rightAnimTrackModel3);
        renderPart(leftAnimTrackModel3);
        renderFancyTrack();
    }

    protected void renderAnimDoors()
    {
        GL11.glPushMatrix();
        {
            GL11.glTranslatef(doorAttach.x, doorAttach.y, -doorAttach.z);
            renderPart(doorAnimModel);
        }
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        {
            GL11.glTranslatef(door2Attach.x, door2Attach.y, -door2Attach.z);
            renderPart(door2AnimModel);
        }
        GL11.glPopMatrix();
    }

    protected void renderDrillHead(float throttle)
    {
        harvesterAngle += throttle / 5F;
        GL11.glPushMatrix();
        {
            GL11.glTranslatef(drillHeadOrigin.x, drillHeadOrigin.y, drillHeadOrigin.z);
            GL11.glRotatef(harvesterAngle * 50F, 1.0F, 0.0F, 0.0F);
            GL11.glTranslatef(-drillHeadOrigin.x, -drillHeadOrigin.y, -drillHeadOrigin.z);
            renderPart(drillHeadModel);
        }
        GL11.glPopMatrix();
    }

    protected void renderDrakon()
    {
        GL11.glPushMatrix();
        {
            GL11.glTranslatef(drakonArmAttach.x, drakonArmAttach.y, drakonArmAttach.z);
            renderPart(drakonArmModel);
        }
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        {
            GL11.glTranslatef(drakonRailAttach.x, drakonRailAttach.y, drakonRailAttach.z);
            renderPart(drakonRailModel);
            renderPart(drakonModel);
        }
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        {
            GL11.glTranslatef(drakonDoorAttach.x, drakonDoorAttach.y, drakonDoorAttach.z);
            renderPart(drakonDoorModel);
        }
        GL11.glPopMatrix();
    }

    protected void renderWheels()
    {
        wheelsAngle += throttle / 3.25F;
        rotateWheels(leftBackWheelModel, wheelsAngle);
        rotateWheels(rightBackWheelModel, wheelsAngle);
        rotateWheels(leftFrontWheelModel, wheelsAngle);
        rotateWheels(rightFrontWheelModel, wheelsAngle);
        rotateWheels(rightTrackWheelModels, wheelsAngle);
        rotateWheels(leftTrackWheelModels, wheelsAngle);
        renderPart(leftBackWheelModel);
        renderPart(rightBackWheelModel);
        renderPart(leftFrontWheelModel);
        renderPart(rightFrontWheelModel);
        renderPart(rightTrackWheelModels);
        renderPart(leftTrackWheelModels);
    }

    protected void rotateWheels(ModelRendererTurbo[] wheelModels, float wheelsAngle)
    {
        for (ModelRendererTurbo leftTrackWheelModel : wheelModels)
        {
            leftTrackWheelModel.rotateAngleZ = rotateWheels ? -wheelsAngle : 0;
        }
        renderPart(wheelModels);
    }

    protected boolean hasFancyTracks()
    {
        return fancyTrackModel.length > 0;
    }

    protected void setupFancyTracks()
    {
        rightTrack = new AnimTankTrack(rightTrackPoints, trackLinkLength);
        leftTrack = new AnimTankTrack(leftTrackPoints, trackLinkLength);
        int numLinks = Math.round(rightTrack.getTrackLength() / trackLinkLength);
        trackLinksLeft = new AnimTrackLink[numLinks];
        trackLinksRight = new AnimTrackLink[numLinks];
        for (int i = 0; i < numLinks; i++)
        {
            float progress = 0.01F + (trackLinkLength * i);
            int trackPart = leftTrack.getTrackPart(progress);
            trackLinksLeft[i] = new AnimTrackLink(progress);
            trackLinksRight[i] = new AnimTrackLink(progress);
            trackLinksLeft[i].position = leftTrack.getPositionOnTrack(progress);
            trackLinksRight[i].position = rightTrack.getPositionOnTrack(progress);
            trackLinksLeft[i].rot = new RotatedAxes(0, 0, rotateTowards(leftTrack.points.get((trackPart == 0) ? leftTrack.points.size() - 1 : trackPart - 1), trackLinksLeft[i].position));
            trackLinksRight[i].rot = new RotatedAxes(0, 0, rotateTowards(rightTrack.points.get((trackPart == 0) ? rightTrack.points.size() - 1 : trackPart - 1), trackLinksRight[i].position));
            trackLinksLeft[i].zRot = rotateTowards(leftTrack.points.get((trackPart == 0) ? leftTrack.points.size() - 1 : trackPart - 1), trackLinksLeft[i].position);
            trackLinksRight[i].zRot = rotateTowards(rightTrack.points.get((trackPart == 0) ? rightTrack.points.size() - 1 : trackPart - 1), trackLinksRight[i].position);
        }
    }

    protected void animateFancyTracks(float throttle, float wheelsYaw)
    {
        if (!hasFancyTracks())
            return;

        for (AnimTrackLink trackLink : trackLinksLeft)
        {
            trackLink.prevPosition = trackLink.position;
            trackLink.prevZRot = trackLink.zRot;
            float speed = throttle * 1.5F - (wheelsYaw / 12);
            trackLink.progress += speed;
            if (trackLink.progress > leftTrack.getTrackLength())
                trackLink.progress -= leftTrack.getTrackLength();
            if (trackLink.progress < 0) trackLink.progress += leftTrack.getTrackLength();
            trackLink.position = leftTrack.getPositionOnTrack(trackLink.progress);
            for (; trackLink.zRot > 180F; trackLink.zRot -= 360F) {}
            for (; trackLink.zRot <= -180F; trackLink.zRot += 360F) {}
            float newAngle = rotateTowards(leftTrack.points.get(leftTrack.getTrackPart(trackLink.progress)), trackLink.position);
            int part = leftTrack.getTrackPart(trackLink.progress);
            trackLink.zRot = lerp(trackLink.zRot, newAngle, (part != (trackLinkFix + ((speed < 0) ? 0 : 1))) ? 0.5F : 1);
        }

        for (AnimTrackLink animTrackLink : trackLinksRight)
        {
            animTrackLink.prevPosition = animTrackLink.position;
            animTrackLink.prevZRot = animTrackLink.zRot;
            float speed = throttle * 1.5F + (wheelsYaw / 12);
            animTrackLink.progress += speed;
            if (animTrackLink.progress > rightTrack.getTrackLength())
                animTrackLink.progress -= leftTrack.getTrackLength();
            if (animTrackLink.progress < 0) animTrackLink.progress += rightTrack.getTrackLength();
            animTrackLink.position = rightTrack.getPositionOnTrack(animTrackLink.progress);
            float newAngle = rotateTowards(rightTrack.points.get(rightTrack.getTrackPart(animTrackLink.progress)), animTrackLink.position);
            int part = rightTrack.getTrackPart(animTrackLink.progress);
            animTrackLink.zRot = lerp(animTrackLink.zRot, newAngle, (part != (trackLinkFix + ((speed < 0) ? 0 : 1))) ? 0.5F : 1);
        }
    }

    protected float lerp(float start, float end, float percent)
    {
        return (start + percent * (end - start));
    }

    protected void renderFancyTrack()
    {
        if (!hasFancyTracks())
            return;

        for (AnimTrackLink link : trackLinksLeft)
        {
            float rotZ = link.zRot;
            for (; rotZ > 180F; rotZ -= 360F) {}
            for (; rotZ <= -180F; rotZ += 360F) {}
            GL11.glPushMatrix();
            GL11.glTranslatef(link.position.x / 16F, link.position.y / 16F, link.position.z / 16F);
            GL11.glRotatef(rotZ * (float) (180 / Math.PI), 0, 0, 1);
            renderPart(fancyTrackModel);
            GL11.glPopMatrix();
        }

        for (AnimTrackLink link : trackLinksRight)
        {
            float rotZ = link.zRot;
            for (; rotZ > 180F; rotZ -= 360F) {}
            for (; rotZ <= -180F; rotZ += 360F) {}
            GL11.glPushMatrix();
            GL11.glTranslatef(link.position.x / 16F, link.position.y / 16F, link.position.z / 16F);
            GL11.glRotatef(rotZ * (float) (180 / Math.PI), 0, 0, 1);
            renderPart(fancyTrackModel);
            GL11.glPopMatrix();
        }
    }
}

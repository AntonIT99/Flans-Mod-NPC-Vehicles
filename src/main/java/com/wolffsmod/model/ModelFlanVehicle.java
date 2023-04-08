package com.wolffsmod.model;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.model.AnimTankTrack;
import com.flansmod.client.model.AnimTrackLink;
import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.entity.Entity;

import java.util.ArrayList;

public abstract class ModelFlanVehicle extends ModelVehicle
{
    public float minYaw = -360F;
    public float maxYaw = 360F;
    public float minPitch = -360F;
    public float maxPitch = 360F;
    public float yawSpeed = 1F;
    public float pitchSpeed = 1F;
    public float yaw;
    public float pitch;
    public boolean rotateTurret = true;
    public boolean doorsOpen = false;
    private final ArrayList<Vector3f> leftTrackPoints = new ArrayList<>();
    private final ArrayList<Vector3f> rightTrackPoints = new ArrayList<>();
    private float trackLinkLength;

    public void setDriverYawAndPitch(float minYaw, float maxYaw, float minPitch, float maxPitch)
    {
        this.minYaw = minYaw;
        this.maxYaw = maxYaw;
        this.minPitch = minPitch;
        this.maxPitch = maxPitch;
    }

    public void addLeftLinkPoint(String point)
    {
        leftTrackPoints.add(new Vector3f(point, ""));
    }

    public void addRightLinkPoint(String point)
    {
        rightTrackPoints.add(new Vector3f(point, ""));
    }

    public void setTrackLinkLength(float value)
    {
        trackLinkLength = value;
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        f3 = Math.min(Math.max(f3, minYaw), maxYaw);
        f4 = Math.min(Math.max(f4, minPitch), maxPitch);

        if (yaw < f3)
            yaw += Math.min(yawSpeed, f3 - yaw);
        if (yaw > f3)
            yaw -= Math.min(yawSpeed, yaw - f3);
        if (pitch < f4)
            pitch += Math.min(pitchSpeed, f4 - pitch);
        if (pitch > f4)
            pitch -= Math.min(pitchSpeed, pitch - f4);

        renderPart(bodyModel);
        if (doorsOpen)
            renderPart(bodyDoorOpenModel);
        else
            renderPart(bodyDoorCloseModel);
        for (ModelRendererTurbo[][] gun : gunModels.values())
            for (ModelRendererTurbo[] gunPart : gun)
                renderPart(gunPart);

        renderPart(leftBackWheelModel);
        renderPart(rightBackWheelModel);
        renderPart(leftFrontWheelModel);
        renderPart(rightFrontWheelModel);
        renderPart(rightTrackModel);
        renderPart(leftTrackModel);
        renderPart(leftFrontLegModel);
        renderPart(rightFrontLegModel);
        renderPart(leftBackLegModel);
        renderPart(rightBackLegModel);
        renderPart(rightTrackWheelModels);
        renderPart(leftTrackWheelModels);
        renderPart(trailerModel);

        Vector3f turretOrigin = new Vector3f();

        GL11.glPushMatrix();
        {
            GL11.glTranslatef(turretOrigin.x, turretOrigin.y, turretOrigin.z);
            GL11.glRotatef(-yaw, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(-turretOrigin.x, -turretOrigin.y, -turretOrigin.z);
            renderTurret(pitch);

            GL11.glTranslatef(barrelAttach.x, barrelAttach.y, barrelAttach.z);
            GL11.glRotatef(-pitch, 0F, 0F, 1F);
            //GL11.glTranslatef(recoilPos*-(5F/16F),0F, 0F);
            GL11.glTranslatef(0F,0F, 1/16F);
            renderPart(animBarrelModel);
        }
        GL11.glPopMatrix();

        renderPart(drillHeadModel);
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
        renderPart(steeringWheelModel);
        renderPart(steeringWheelModel);
        renderFancyTrack();

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

    public void renderTurret(float pitch)
    {
        GL11.glPushMatrix();
        {
            GL11.glScalef(turretScale.x, turretScale.y, turretScale.z);
            GL11.glTranslatef(turretTrans.x, turretTrans.y, turretTrans.z);
            renderPart(turretModel);

            for (ModelRendererTurbo model: barrelModel)
                model.rotateAngleZ = -pitch * (float) Math.PI / 180F;
            renderPart(barrelModel);

            GL11.glPushMatrix();
            {
                GL11.glTranslatef(barrelAttach.x, barrelAttach.y, -barrelAttach.z);
                GL11.glRotatef(-pitch, 0F, 0F, 1F);
                renderPart(barrelSpecModel);
            }
            GL11.glPopMatrix();

            for (ModelRendererTurbo[] ammo : ammoModel)
            {
                for (ModelRendererTurbo model : ammo)
                {
                    model.rotateAngleZ = -pitch * (float) Math.PI / 180F;
                }
                renderPart(ammo);
            }
        }
        GL11.glPopMatrix();
    }

    public void renderFancyTrack()
    {
        AnimTankTrack rightTrack = new AnimTankTrack(rightTrackPoints, trackLinkLength);
        AnimTankTrack leftTrack = new AnimTankTrack(leftTrackPoints, trackLinkLength);
        AnimTrackLink[] trackLinksLeft;
        AnimTrackLink[] trackLinksRight;
        int numLinks = Math.round(rightTrack.getTrackLength() / trackLinkLength);
        trackLinksLeft = new AnimTrackLink[numLinks];
        trackLinksRight = new AnimTrackLink[numLinks];
        for (int i = 0; i < numLinks; i++) {
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

        for (AnimTrackLink link : trackLinksLeft) {
            float rotZ = link.zRot;
            GL11.glPushMatrix();
            GL11.glTranslatef(link.position.x / 16F, link.position.y / 16F, link.position.z / 16F);
            for (; rotZ > 180F; rotZ -= 360F) {
            }
            for (; rotZ <= -180F; rotZ += 360F) {
            }
            GL11.glRotatef(rotZ * (float) (180 / Math.PI), 0, 0, 1);
            renderPart(fancyTrackModel);
            GL11.glPopMatrix();
        }

        for (AnimTrackLink link : trackLinksRight) {
            float rotZ = link.zRot;
            for (; rotZ > 180F; rotZ -= 360F) {
            }
            for (; rotZ <= -180F; rotZ += 360F) {
            }
            GL11.glPushMatrix();
            GL11.glTranslatef(link.position.x / 16F, link.position.y / 16F, link.position.z / 16F);
            GL11.glRotatef(rotZ * (float) (180 / Math.PI), 0, 0, 1);
            renderPart(fancyTrackModel);
            GL11.glPopMatrix();
        }
    }
}

package com.wolffsmod.model;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.model.AnimTrackLink;
import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.wolffsmod.entity.EntityFlanVehicleNPC;
import com.wolffsmod.entity.Seat;

import net.minecraft.entity.Entity;

import java.util.Map;

public abstract class ModelFlanVehicle extends ModelVehicle
{
    public ModelFlanVehicle() {}

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        EntityFlanVehicleNPC vehicle = ((EntityFlanVehicleNPC) entity);

        renderSteeringWheel(vehicle.wheelYaw);
        renderPart(bodyModel);
        if (vehicle.doorsOpen)
            renderPart(bodyDoorOpenModel);
        else
            renderPart(bodyDoorCloseModel);
        renderWheels(vehicle.wheelsAngle, vehicle.rotateWheels);
        renderPart(leftFrontLegModel);
        renderPart(rightFrontLegModel);
        renderPart(leftBackLegModel);
        renderPart(rightBackLegModel);
        renderPart(trailerModel);
        renderTracks();
        renderFancyTrack(vehicle.trackLinksLeft, vehicle.trackLinksRight);
        renderGuns(vehicle.passengers, vehicle.vehicleGunModelScale);
        renderTurretAndBarrel(vehicle.turretOrigin, vehicle.driver, vehicle.recoilPos);
        renderDrillHead(vehicle.harvesterAngle);
        renderAnimDoors();
    }

    protected void renderGuns(Map<Integer, Seat> passengers, float vehicleGunModelScale)
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
                    gunModelPart.rotateAngleY = passengers.get(0).offsetYawAngle - passengers.get(0).getLocalYaw() * (float) Math.PI / 180F;
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
                    gunModelPart.rotateAngleY = passengers.get(1).offsetYawAngle -passengers.get(1).getLocalYaw() * (float) Math.PI / 180F;
                    gunModelPart.rotateAngleZ = -passengers.get(1).getPitch() * (float) Math.PI / 180F;
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
                    gunModelPart.rotateAngleY = passengers.get(2).offsetYawAngle - passengers.get(2).getLocalYaw() * (float) Math.PI / 180F;
                    gunModelPart.rotateAngleZ = -passengers.get(2).getPitch() * (float) Math.PI / 180F;
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
                        gunModelPart.rotateAngleY = passengers.get(i).offsetYawAngle * (float) Math.PI / 180F;
                }
                renderPart(gunModel[i]);
                GL11.glPopMatrix();
            }
        }
    }

    protected void renderTurretAndBarrel(Vector3f turretOrigin, Seat driver, float recoilPos)
    {
        GL11.glPushMatrix();
        {
            GL11.glTranslatef(turretOrigin.x, turretOrigin.y, turretOrigin.z);
            GL11.glRotatef(-driver.getLocalYaw(), 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(-turretOrigin.x, -turretOrigin.y, -turretOrigin.z);

            GL11.glPushMatrix();
            {
                GL11.glScalef(turretScale.x, turretScale.y, turretScale.z);
                GL11.glTranslatef(turretTrans.x, turretTrans.y, turretTrans.z);
                renderPart(turretModel);

                for (ModelRendererTurbo model: barrelModel)
                    model.rotateAngleZ = -driver.getPitch() * (float) Math.PI / 180F;
                renderPart(barrelModel);

                GL11.glPushMatrix();
                {
                    GL11.glTranslatef(barrelAttach.x, barrelAttach.y, -barrelAttach.z);
                    GL11.glRotatef(-driver.getPitch(), 0F, 0F, 1F);
                    renderPart(barrelSpecModel);
                }
                GL11.glPopMatrix();

                for (ModelRendererTurbo[] ammo : ammoModel)
                {
                    for (ModelRendererTurbo model : ammo)
                        model.rotateAngleZ = -driver.getPitch() * (float) Math.PI / 180F;
                    renderPart(ammo);
                }

                renderDrakon();
            }
            GL11.glPopMatrix();

            GL11.glTranslatef(barrelAttach.x, barrelAttach.y, -barrelAttach.z);
            GL11.glRotatef(-driver.getPitch(), 0F, 0F, 1F);
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

    protected void renderDrillHead(float harvesterAngle)
    {
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

    protected void renderSteeringWheel(float wheelYaw)
    {
        for (ModelRendererTurbo model: steeringWheelModel)
            model.rotateAngleX = wheelYaw * (float) Math.PI / 180F * 3F;
        renderPart(steeringWheelModel);
    }

    protected void renderWheels(float wheelsAngle, boolean rotateWheels)
    {
        if (rotateWheels)
        {
            rotateWheels(leftBackWheelModel, wheelsAngle);
            rotateWheels(rightBackWheelModel, wheelsAngle);
            rotateWheels(leftFrontWheelModel, wheelsAngle);
            rotateWheels(rightFrontWheelModel, wheelsAngle);
            rotateWheels(rightTrackWheelModels, wheelsAngle);
            rotateWheels(leftTrackWheelModels, wheelsAngle);
        }
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
            leftTrackWheelModel.rotateAngleZ = -wheelsAngle;
        }
        renderPart(wheelModels);
    }

    protected boolean hasFancyTracks()
    {
        return fancyTrackModel.length > 0;
    }

    protected void renderFancyTrack(AnimTrackLink[] trackLinksLeft, AnimTrackLink[] trackLinksRight)
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

package com.wolffsmod.entity;

import com.flansmod.client.model.AnimTankTrack;
import com.flansmod.client.model.AnimTrackLink;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.vector.Vector3f;
import com.wolffsmod.entity.config.ConfigVehicle;
import noppes.npcs.entity.EntityCustomNpc;

import net.minecraft.world.World;

import java.util.ArrayList;

public abstract class EntityFlanVehicleNPC extends EntityFlanDriveableNPC implements ConfigVehicle
{
    public final ArrayList<Vector3f> leftTrackPoints = new ArrayList<>();
    public final ArrayList<Vector3f> rightTrackPoints = new ArrayList<>();
    public boolean rotateWheels = true;
    public boolean fancyTracks;
    public int trackLinkFix = 5;
    public float trackLinkLength;
    public float wheelsAngle;
    public AnimTankTrack rightTrack;
    public AnimTankTrack leftTrack;
    public AnimTrackLink[] trackLinksLeft = new AnimTrackLink[0];
    public AnimTrackLink[] trackLinksRight = new AnimTrackLink[0];
    public float harvesterAngle;
    public float recoilPos;
    public float wheelYaw;

    public EntityFlanVehicleNPC(World w)
    {
        super(w);
        setupConfig();
        fancyTracks = (leftTrackPoints.size() > 0 && rightTrackPoints.size() > 0);
        if (fancyTracks)
            setupFancyTracks();
    }

    @Override
    public void updateNpc(EntityCustomNpc npc)
    {
        super.updateNpc(npc);
        wheelYaw = getYawVelocity() * 10F;
        wheelsAngle += throttle / 3.25F;
        harvesterAngle += throttle / 5F;

        if (fancyTracks)
            animateFancyTracks(throttle, wheelYaw);
    }

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

    protected float rotateTowards(Vector3f point, Vector3f original)
    {
        return (float) Math.atan2(point.y - original.y, point.x - original.x);
    }

    protected float lerp(float start, float end, float percent)
    {
        return (start + percent * (end - start));
    }
}

package com.wolffsmod.model;

import com.flansmod.common.vector.Vector3f;

public interface Vehicle extends Driveable
{
    /** LeftLinkPoint [...] **/
    void addLeftLinkPoint(String point);

    /** RightLinkPoint [...] **/
    void addRightLinkPoint(String point);

    /**
     *  RotateWheels [rotateWheels]
     *  Default is true
     **/
    void setRotateWheels(boolean rotateWheels);

    /** TrackLinkLength [length] **/
    void setTrackLinkLength(float length);

    /** FixTrackLink [trackLinkFix] **/
    void setFixTrackLink(int trackLinkFix);

    /** TurretOrigin [x] [y] [z] **/
    void setTurretOrigin(float x, float y, float z);
}

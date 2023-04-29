package com.wolffsmod.entity.config;

public interface ConfigVehicle extends ConfigDriveable
{
    /** LeftLinkPoint [...] **/
    void addLeftLinkPoint(String point);

    /** RightLinkPoint [...] **/
    void addRightLinkPoint(String point);

    /**
     *  RotateWheels [rotateWheels]
     *  Default: true
     **/
    void setRotateWheels(boolean rotateWheels);

    /** TrackLinkLength [length]
     *  Default: 0
     * **/
    void setTrackLinkLength(float length);

    /** FixTrackLink [trackLinkFix]
     *  Default: 5
     * **/
    void setFixTrackLink(int trackLinkFix);

    /** TurretOrigin [...] **/
    void setTurretOrigin(String data);
}

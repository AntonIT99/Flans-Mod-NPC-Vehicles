package com.wolffsmod.entity;

public interface ConfigDriveable
{
    /** Override this for config parameters setup (from Flan's Mod vehicle/plane txt files) **/
    void setupConfig();

    /**
     * TurnLeftSpeed [speed] or TurnRightSpeed [speed]
     * Default: 1
     * **/
    void setTurnSpeed(float speed);

    /**
     * Somehow influenced by WheelPosition
     * Default: 0.625 (usually corresponds to having a wheel y position of -8)
     **/
    void setYOffset(float y);

    /** Driver/Pilot [...] **/
    void setDriver(String data);

    /** DriverAimSpeed [yawSpeed] [pitchSpeed] [-] **/
    void setDriverAimSpeed(float yawSpeed, float pitchSpeed);

    /** Passenger [...] **/
    void setPassenger(String data);

    /**
     * (Not in Flan's files) set the base yaw of the passenger seat
     * 0 is default = looking forward,
     * -90/90 = looking sidewards
     * 180 = looking backward,
     * **/
    void setPassengerBaseYaw(int id, float angle);

    /** PassengerAimSpeed [id] [passengerYawSpeed] [passengerPitchSpeed] [-] **/
    void setPassengerAimSpeed(int id, float yawSpeed, float pitchSpeed);

    /**
     * VehicleGunModelScale [vehicleGunModelScale]
     * Default: 1
     * **/
    void setVehicleGunModelScale(float scale);

    /** BombPosition [x] [y] [z] **/
    void addBombPosition(float x, float y, float z);

    /** BombPosition [x] [y] [z] [xOffset] [yOffset] [zOffset] **/
    void addBombPosition(float x, float y, float z, float xOffset, float yOffset, float zOffset);

    /** BarrelPosition [x] [y] [z] **/
    void addBarrelPosition(float x, float y, float z);

    /** BarrelPosition [x] [y] [z] [xOffset] [yOffset] [zOffset] **/
    void addBarrelPosition(float x, float y, float z, float xOffset, float yOffset, float zOffset);

    /** DriverGunOrigin [x] [y] [z] **/
    void addDriverGunOrigin(float x, float y, float z);

    /** GunOrigin [id] [x] [y] [z]
     * Currently no usage.
     * Will be used to implement secondary gun firing.
     * **/
    void addGunOrigin(int id, float x, float y, float z);

    /** ShootParticlesPrimary [...] **/
    void addShootParticlesPrimary(String data);
}

package com.wolffsmod.entity.config;

public interface ConfigDriveable
{
    /** Override this for config parameters setup (from Flan's Mod vehicle/plane txt files) **/
    void setupConfig();

    /**
     * TurnLeftSpeed [speed] or TurnRightSpeed [speed]
     * Default: 1
     */
    void setTurnSpeed(float speed);

    /**
     * Somehow influenced by WheelPosition
     * Default: 0.625 (usually corresponds to having a wheel y position of -8)
     */
    void setYOffset(float y);

    /** Driver/Pilot [...] **/
    void setDriver(String data);

    /** DriverAimSpeed [...] **/
    void setDriverAimSpeed(String data);

    /** DriverGunOrigin [...] **/
    void addDriverGunOrigin(String data);

    /** Passenger [...] **/
    void setPassenger(String data);

    /**
     * (Not in Flan's files) set the offset yaw of the passenger seat
     * Default: (minYaw + maxYaw) / 2
     * 0 = looking forward when the "head" looks forward,
     * -90/90 = looking sidewards when the "head" looks forward
     * 180 = looking backward when the "head" looks forward,
     */
    void setPassengerOffsetYaw(int id, float angle);

    /** PassengerAimSpeed [...] **/
    void setPassengerAimSpeed(String data);

    /**
     * VehicleGunModelScale [vehicleGunModelScale]
     * Default: 1
     */
    void setVehicleGunModelScale(float scale);

    /** ShootPointPrimary [...] **/
    void addShootPointPrimary(String data);

    /** ShootPointSecondary [...] **/
    void addShootPointSecondary(String data);

    /** BombPosition [...] **/
    void addBombPosition(String data);

    /** BarrelPosition [...] **/
    void addBarrelPosition(String data);

    /** AddGun [...] **/
    void addGun(String data);

    /** GunOrigin [...] **/
    void addGunOrigin(String data);

    /** ShootParticlesPrimary [...] **/
    void addShootParticlesPrimary(String data);

    /** ShootParticlesSecondary [...] **/
    void addShootParticlesSecondary(String data);
}

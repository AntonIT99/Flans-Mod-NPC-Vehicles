package com.wolffsmod.model;

public interface Driveable
{
    /** setup config parameters stored in Flan's Mod vehicle/plane txt files **/
    void setupConfig();

    /** Driver/Pilot [-] [-] [-] [minYaw] [maxYaw] [minPitch] [maxPitch] **/
    void setDriver(float minYaw, float maxYaw, float minPitch, float maxPitch);

    /** DriverAimSpeed [yawSpeed] [pitchSpeed] [-] **/
    void setDriverAimSpeed(float yawSpeed, float pitchSpeed);

    /** Passenger [id] [-] [-] [-] [-] [minPassengerYaw] [maxPassengerYaw] [minPassengerPitch] [maxPassengerPitch] [-] [-] **/
    void setPassenger(int id, float minYaw, float maxYaw, float minPitch, float maxPitch);

    /**
     * (Not in Flan's files) set the base yaw of the passenger seat
     * 0 is default = looking forward,
     * -90/90 = looking sidewards
     * 180 = looking backward,
     * **/
    void setPassengerBaseYaw(int id, float angle);

    /** PassengerAimSpeed [id] [passengerYawSpeed] [passengerPitchSpeed] [-] **/
    void setPassengerAimSpeed(int id, float yawSpeed, float pitchSpeed);

    /** VehicleGunModelScale [vehicleGunModelScale] **/
    void setVehicleGunModelScale(float scale);

}

package com.wolffsmod.customnpc;

import noppes.npcs.entity.EntityNPCInterface;

public interface IMixinDataAI {
    VehicleMobilityProfile getVehicleMobilityProfile();
    void setVehicleMobilityProfile(VehicleMobilityProfile profile);
    double getVehicleLandSpeed();
    void setVehicleLandSpeed(double speed);
    double getVehicleWaterSpeed();
    void setVehicleWaterSpeed(double speed);
    int getVehicleGroundMaxWaterDepth();
    void setVehicleGroundMaxWaterDepth(int depth);
    int getVehicleWatercraftMinDepth();
    void setVehicleWatercraftMinDepth(int depth);
    EntityNPCInterface getMobilityNpc();
}

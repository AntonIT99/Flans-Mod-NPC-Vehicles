package com.wolffsmod.mixin;

import com.wolffsmod.customnpc.IMixinDataAI;
import com.wolffsmod.customnpc.VehicleMobilityProfile;
import com.wolffsmod.customnpc.GroundVehiclePreset;
import com.wolffsmod.customnpc.GroundVehicleType;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.SharedMonsterAttributes;
import noppes.npcs.DataAI;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = DataAI.class, remap = false)
public abstract class MixinDataAI implements IMixinDataAI {
    @Shadow @Final private EntityNPCInterface npc;
    @Shadow public boolean avoidsWater;
    @Shadow public boolean canSwim;

    @Unique private VehicleMobilityProfile wolffsmod$mobilityProfile = VehicleMobilityProfile.LEGACY;
    @Unique private double wolffsmod$landSpeed = 5.0D;
    @Unique private double wolffsmod$waterSpeed = 5.0D;
    @Unique private int wolffsmod$groundMaxWaterDepth = 1;
    @Unique private int wolffsmod$watercraftMinDepth = 1;
    @Unique private GroundVehiclePreset wolffsmod$groundPreset = GroundVehiclePreset.CUSTOM;
    @Unique private boolean wolffsmod$groundDrivingEnabled;
    @Unique private GroundVehicleType wolffsmod$groundType = GroundVehicleType.WHEELED;
    @Unique private boolean wolffsmod$groundAllowPivot;
    @Unique private boolean wolffsmod$groundAllowReversing = true;
    @Unique private boolean wolffsmod$groundDebug;
    @Unique private double wolffsmod$groundMaxForwardSpeed = 5.0D;
    @Unique private double wolffsmod$groundMaxReverseSpeed = 2.5D;
    @Unique private double wolffsmod$groundAcceleration = 3.0D;
    @Unique private double wolffsmod$groundBraking = 5.0D;
    @Unique private double wolffsmod$groundCoastDeceleration = 1.0D;
    @Unique private double wolffsmod$groundSteeringRate = 22.0D;
    @Unique private double wolffsmod$groundMaximumSteeringAngle = 35.0D;
    @Unique private double wolffsmod$groundMinimumTurnRadius = 5.0D;
    @Unique private double wolffsmod$groundMaxTurnRate = 28.0D;
    @Unique private double wolffsmod$groundSteeringLookahead = 6.0D;
    @Unique private double wolffsmod$groundTurnSlowdown = 0.65D;
    @Unique private double wolffsmod$groundStopDistance = 2.0D;
    @Unique private double wolffsmod$groundReverseAngleThreshold = 105.0D;
    @Unique private double wolffsmod$groundMaxReverseDistance = 12.0D;
    @Unique private double wolffsmod$groundFollowingDistance = 5.0D;
    @Unique private double wolffsmod$groundMinimumFollowingDistance = 2.5D;

    @Inject(method = "writeToNBT", at = @At("RETURN"))
    private void wolffsmod$writeMobility(NBTTagCompound compound, CallbackInfoReturnable<NBTTagCompound> ci) {
        compound.setInteger("WolffVehicleMobilityProfile", wolffsmod$mobilityProfile.ordinal());
        compound.setDouble("WolffVehicleLandSpeed", wolffsmod$landSpeed);
        compound.setDouble("WolffVehicleWaterSpeed", wolffsmod$waterSpeed);
        compound.setInteger("WolffVehicleGroundMaxWaterDepth", wolffsmod$groundMaxWaterDepth);
        compound.setInteger("WolffVehicleWatercraftMinDepth", wolffsmod$watercraftMinDepth);
        compound.setInteger("WolffGroundPreset", wolffsmod$groundPreset.ordinal());
        compound.setBoolean("WolffGroundDrivingEnabled", wolffsmod$groundDrivingEnabled);
        compound.setInteger("WolffGroundType", wolffsmod$groundType.ordinal());
        compound.setBoolean("WolffGroundAllowPivot", wolffsmod$groundAllowPivot);
        compound.setBoolean("WolffGroundAllowReversing", wolffsmod$groundAllowReversing);
        compound.setBoolean("WolffGroundDebug", wolffsmod$groundDebug);
        compound.setDouble("WolffGroundMaxForwardSpeed", wolffsmod$groundMaxForwardSpeed);
        compound.setDouble("WolffGroundMaxReverseSpeed", wolffsmod$groundMaxReverseSpeed);
        compound.setDouble("WolffGroundAcceleration", wolffsmod$groundAcceleration);
        compound.setDouble("WolffGroundBraking", wolffsmod$groundBraking);
        compound.setDouble("WolffGroundCoastDeceleration", wolffsmod$groundCoastDeceleration);
        compound.setDouble("WolffGroundSteeringRate", wolffsmod$groundSteeringRate);
        compound.setDouble("WolffGroundMaximumSteeringAngle", wolffsmod$groundMaximumSteeringAngle);
        compound.setDouble("WolffGroundMinimumTurnRadius", wolffsmod$groundMinimumTurnRadius);
        compound.setDouble("WolffGroundMaxTurnRate", wolffsmod$groundMaxTurnRate);
        compound.setDouble("WolffGroundSteeringLookahead", wolffsmod$groundSteeringLookahead);
        compound.setDouble("WolffGroundTurnSlowdown", wolffsmod$groundTurnSlowdown);
        compound.setDouble("WolffGroundStopDistance", wolffsmod$groundStopDistance);
        compound.setDouble("WolffGroundReverseAngleThreshold", wolffsmod$groundReverseAngleThreshold);
        compound.setDouble("WolffGroundMaxReverseDistance", wolffsmod$groundMaxReverseDistance);
        compound.setDouble("WolffGroundFollowingDistance", wolffsmod$groundFollowingDistance);
        compound.setDouble("WolffGroundMinimumFollowingDistance", wolffsmod$groundMinimumFollowingDistance);
    }

    @Inject(method = "readToNBT", at = @At("RETURN"))
    private void wolffsmod$readMobility(NBTTagCompound compound, CallbackInfo ci) {
        if (!compound.hasKey("WolffVehicleMobilityProfile")) {
            wolffsmod$mobilityProfile = VehicleMobilityProfile.LEGACY;
            return;
        }
        wolffsmod$mobilityProfile = VehicleMobilityProfile.fromOrdinal(compound.getInteger("WolffVehicleMobilityProfile"));
        wolffsmod$landSpeed = positive(compound.getDouble("WolffVehicleLandSpeed"), 5.0D);
        wolffsmod$waterSpeed = positive(compound.getDouble("WolffVehicleWaterSpeed"), 5.0D);
        wolffsmod$groundMaxWaterDepth = clampGroundDepth(compound.getInteger("WolffVehicleGroundMaxWaterDepth"));
        wolffsmod$watercraftMinDepth = clampWaterDepth(compound.getInteger("WolffVehicleWatercraftMinDepth"));
        if (compound.hasKey("WolffGroundType")) {
            wolffsmod$groundPreset = GroundVehiclePreset.fromOrdinal(compound.getInteger("WolffGroundPreset"));
            wolffsmod$groundDrivingEnabled = compound.getBoolean("WolffGroundDrivingEnabled");
            wolffsmod$groundType = GroundVehicleType.fromOrdinal(compound.getInteger("WolffGroundType"));
            wolffsmod$groundAllowPivot = compound.getBoolean("WolffGroundAllowPivot");
            wolffsmod$groundAllowReversing = compound.getBoolean("WolffGroundAllowReversing");
            wolffsmod$groundDebug = compound.getBoolean("WolffGroundDebug");
            wolffsmod$groundMaxForwardSpeed = value(compound, "WolffGroundMaxForwardSpeed", 5, 0.1, 100);
            wolffsmod$groundMaxReverseSpeed = value(compound, "WolffGroundMaxReverseSpeed", 2.5, 0.1, 50);
            wolffsmod$groundAcceleration = value(compound, "WolffGroundAcceleration", 3, 0.05, 100);
            wolffsmod$groundBraking = value(compound, "WolffGroundBraking", 5, 0.05, 100);
            wolffsmod$groundCoastDeceleration = value(compound, "WolffGroundCoastDeceleration", 1, 0.01, 50);
            wolffsmod$groundSteeringRate = value(compound, "WolffGroundSteeringRate", 22, 0.1, 180);
            wolffsmod$groundMaximumSteeringAngle = value(compound, "WolffGroundMaximumSteeringAngle", 35, 1, 89);
            wolffsmod$groundMinimumTurnRadius = value(compound, "WolffGroundMinimumTurnRadius", 5, 0.5, 64);
            wolffsmod$groundMaxTurnRate = value(compound, "WolffGroundMaxTurnRate", 28, 0.1, 180);
            wolffsmod$groundSteeringLookahead = value(compound, "WolffGroundSteeringLookahead", 6, 1, 32);
            wolffsmod$groundTurnSlowdown = value(compound, "WolffGroundTurnSlowdown", .65, 0, 1);
            wolffsmod$groundStopDistance = value(compound, "WolffGroundStopDistance", 2, .25, 32);
            wolffsmod$groundReverseAngleThreshold = value(compound, "WolffGroundReverseAngleThreshold", 105, 45, 179);
            wolffsmod$groundMaxReverseDistance = value(compound, "WolffGroundMaxReverseDistance", 12, 1, 64);
            wolffsmod$groundFollowingDistance = value(compound, "WolffGroundFollowingDistance", 5, 1, 64);
            wolffsmod$groundMinimumFollowingDistance = value(compound, "WolffGroundMinimumFollowingDistance", 2.5, .5, 32);
        }
        if (wolffsmod$mobilityProfile == VehicleMobilityProfile.WATERCRAFT
                || wolffsmod$mobilityProfile == VehicleMobilityProfile.AMPHIBIOUS) {
            avoidsWater = false;
            canSwim = true;
            npc.setAvoidWater(false);
        }
        wolffsmod$syncLandSpeed();
    }

    @Unique private static double positive(double value, double fallback) {
        return Double.isNaN(value) || Double.isInfinite(value) || value <= 0.0D ? fallback : Math.min(value, 100.0D);
    }

    @Unique private static int clampGroundDepth(int value) { return Math.max(0, Math.min(value, 64)); }
    @Unique private static int clampWaterDepth(int value) { return value <= 0 ? 1 : Math.min(value, 64); }
    @Unique private static double clamp(double v, double min, double max) {
        return Double.isNaN(v) || Double.isInfinite(v) ? min : Math.max(min, Math.min(max, v));
    }
    @Unique private static double value(NBTTagCompound nbt, String key, double fallback, double min, double max) {
        return nbt.hasKey(key) ? clamp(nbt.getDouble(key), min, max) : fallback;
    }

    @Override public VehicleMobilityProfile getVehicleMobilityProfile() { return wolffsmod$mobilityProfile; }
    @Override public void setVehicleMobilityProfile(VehicleMobilityProfile profile) {
        wolffsmod$mobilityProfile = profile == null ? VehicleMobilityProfile.LEGACY : profile;
        if (wolffsmod$mobilityProfile == VehicleMobilityProfile.WATERCRAFT
                || wolffsmod$mobilityProfile == VehicleMobilityProfile.AMPHIBIOUS) {
            avoidsWater = false;
            canSwim = true;
            npc.setAvoidWater(false);
        }
        wolffsmod$syncLandSpeed();
    }
    @Override public double getVehicleLandSpeed() { return wolffsmod$landSpeed; }
    @Override public void setVehicleLandSpeed(double speed) { wolffsmod$landSpeed = positive(speed, 5.0D); wolffsmod$syncLandSpeed(); }
    @Override public double getVehicleWaterSpeed() { return wolffsmod$waterSpeed; }
    @Override public void setVehicleWaterSpeed(double speed) { wolffsmod$waterSpeed = positive(speed, 5.0D); wolffsmod$syncLandSpeed(); }
    @Override public int getVehicleGroundMaxWaterDepth() { return wolffsmod$groundMaxWaterDepth; }
    @Override public void setVehicleGroundMaxWaterDepth(int depth) { wolffsmod$groundMaxWaterDepth = clampGroundDepth(depth); }
    @Override public int getVehicleWatercraftMinDepth() { return wolffsmod$watercraftMinDepth; }
    @Override public void setVehicleWatercraftMinDepth(int depth) { wolffsmod$watercraftMinDepth = clampWaterDepth(depth); }
    @Override public GroundVehiclePreset getGroundVehiclePreset() { return wolffsmod$groundPreset; }
    @Override public void setGroundVehiclePreset(GroundVehiclePreset v) { wolffsmod$groundPreset = v == null ? GroundVehiclePreset.CUSTOM : v; }
    @Override public boolean getGroundDrivingEnabled() { return wolffsmod$groundDrivingEnabled; }
    @Override public void setGroundDrivingEnabled(boolean v) { wolffsmod$groundDrivingEnabled = v; }
    @Override public GroundVehicleType getGroundVehicleType() { return wolffsmod$groundType; }
    @Override public void setGroundVehicleType(GroundVehicleType v) { wolffsmod$groundType = v == null ? GroundVehicleType.WHEELED : v; }
    @Override public boolean getGroundAllowPivot() { return wolffsmod$groundAllowPivot; }
    @Override public void setGroundAllowPivot(boolean v) { wolffsmod$groundAllowPivot = v; }
    @Override public boolean getGroundAllowReversing() { return wolffsmod$groundAllowReversing; }
    @Override public void setGroundAllowReversing(boolean v) { wolffsmod$groundAllowReversing = v; }
    @Override public boolean getGroundDebug() { return wolffsmod$groundDebug; }
    @Override public void setGroundDebug(boolean v) { wolffsmod$groundDebug = v; }
    @Override public double getGroundMaxForwardSpeed() { return wolffsmod$groundMaxForwardSpeed; }
    @Override public void setGroundMaxForwardSpeed(double v) { wolffsmod$groundMaxForwardSpeed = clamp(v,.1,100); wolffsmod$syncLandSpeed(); }
    @Override public double getGroundMaxReverseSpeed() { return wolffsmod$groundMaxReverseSpeed; }
    @Override public void setGroundMaxReverseSpeed(double v) { wolffsmod$groundMaxReverseSpeed = clamp(v,.1,50); }
    @Override public double getGroundAcceleration() { return wolffsmod$groundAcceleration; }
    @Override public void setGroundAcceleration(double v) { wolffsmod$groundAcceleration = clamp(v,.05,100); }
    @Override public double getGroundBraking() { return wolffsmod$groundBraking; }
    @Override public void setGroundBraking(double v) { wolffsmod$groundBraking = clamp(v,.05,100); }
    @Override public double getGroundCoastDeceleration() { return wolffsmod$groundCoastDeceleration; }
    @Override public void setGroundCoastDeceleration(double v) { wolffsmod$groundCoastDeceleration = clamp(v,.01,50); }
    @Override public double getGroundSteeringRate() { return wolffsmod$groundSteeringRate; }
    @Override public void setGroundSteeringRate(double v) { wolffsmod$groundSteeringRate = clamp(v,.1,180); }
    @Override public double getGroundMaximumSteeringAngle() { return wolffsmod$groundMaximumSteeringAngle; }
    @Override public void setGroundMaximumSteeringAngle(double v) { wolffsmod$groundMaximumSteeringAngle = clamp(v,1,89); }
    @Override public double getGroundMinimumTurnRadius() { return wolffsmod$groundMinimumTurnRadius; }
    @Override public void setGroundMinimumTurnRadius(double v) { wolffsmod$groundMinimumTurnRadius = clamp(v,.5,64); }
    @Override public double getGroundMaxTurnRate() { return wolffsmod$groundMaxTurnRate; }
    @Override public void setGroundMaxTurnRate(double v) { wolffsmod$groundMaxTurnRate = clamp(v,.1,180); }
    @Override public double getGroundSteeringLookahead() { return wolffsmod$groundSteeringLookahead; }
    @Override public void setGroundSteeringLookahead(double v) { wolffsmod$groundSteeringLookahead = clamp(v,1,32); }
    @Override public double getGroundTurnSlowdown() { return wolffsmod$groundTurnSlowdown; }
    @Override public void setGroundTurnSlowdown(double v) { wolffsmod$groundTurnSlowdown = clamp(v,0,1); }
    @Override public double getGroundStopDistance() { return wolffsmod$groundStopDistance; }
    @Override public void setGroundStopDistance(double v) { wolffsmod$groundStopDistance = clamp(v,.25,32); }
    @Override public double getGroundReverseAngleThreshold() { return wolffsmod$groundReverseAngleThreshold; }
    @Override public void setGroundReverseAngleThreshold(double v) { wolffsmod$groundReverseAngleThreshold = clamp(v,45,179); }
    @Override public double getGroundMaxReverseDistance() { return wolffsmod$groundMaxReverseDistance; }
    @Override public void setGroundMaxReverseDistance(double v) { wolffsmod$groundMaxReverseDistance = clamp(v,1,64); }
    @Override public double getGroundFollowingDistance() { return wolffsmod$groundFollowingDistance; }
    @Override public void setGroundFollowingDistance(double v) { wolffsmod$groundFollowingDistance = clamp(v,1,64); }
    @Override public double getGroundMinimumFollowingDistance() { return wolffsmod$groundMinimumFollowingDistance; }
    @Override public void setGroundMinimumFollowingDistance(double v) { wolffsmod$groundMinimumFollowingDistance = clamp(v,.5,32); }
    @Override public EntityNPCInterface getMobilityNpc() { return npc; }

    @Unique private void wolffsmod$syncLandSpeed() {
        if (npc.getEntityAttribute(SharedMonsterAttributes.movementSpeed) != null)
            npc.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(npc.getSpeed());
    }
}

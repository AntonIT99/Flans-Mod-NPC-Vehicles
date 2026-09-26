package com.wolffsmod.mixin;

import com.wolffsmod.customnpc.IMixinDataAI;
import com.wolffsmod.customnpc.VehicleMobilityProfile;
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

    @Inject(method = "writeToNBT", at = @At("RETURN"))
    private void wolffsmod$writeMobility(NBTTagCompound compound, CallbackInfoReturnable<NBTTagCompound> ci) {
        compound.setInteger("WolffVehicleMobilityProfile", wolffsmod$mobilityProfile.ordinal());
        compound.setDouble("WolffVehicleLandSpeed", wolffsmod$landSpeed);
        compound.setDouble("WolffVehicleWaterSpeed", wolffsmod$waterSpeed);
        compound.setInteger("WolffVehicleGroundMaxWaterDepth", wolffsmod$groundMaxWaterDepth);
        compound.setInteger("WolffVehicleWatercraftMinDepth", wolffsmod$watercraftMinDepth);
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
    @Override public EntityNPCInterface getMobilityNpc() { return npc; }

    @Unique private void wolffsmod$syncLandSpeed() {
        if (npc.getEntityAttribute(SharedMonsterAttributes.movementSpeed) != null)
            npc.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(npc.getSpeed());
    }
}

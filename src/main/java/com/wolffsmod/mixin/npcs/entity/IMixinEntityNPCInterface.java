package com.wolffsmod.mixin.npcs.entity;

import com.wolffsmod.entity.EntityFlanDriveableNPC;
import com.wolffsmod.entity.Seat;

import java.util.Map;
import java.util.Optional;

public interface IMixinEntityNPCInterface
{
    boolean isFlanDriveable();
    Optional<EntityFlanDriveableNPC> getFlanDriveableEntity();
    boolean isFlanPlane();

    void reloadGuns();
    void animateFlanGunMelee();
    void animateFlanGunReload();
    void animateFlanGunShoot();

    Seat getDriver();
    Map<Integer, Seat> getPassengers();
    boolean getLastBurst();
    void setLastBurst(boolean lastBurst);
}

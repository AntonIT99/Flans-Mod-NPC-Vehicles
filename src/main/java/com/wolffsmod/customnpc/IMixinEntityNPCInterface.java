package com.wolffsmod.customnpc;

import com.wolffsmod.entity.EntityFlanDriveableNPC;
import com.wolffsmod.entity.Seat;

import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IMixinEntityNPCInterface
{
    boolean isFlanDriveable();
    Optional<EntityFlanDriveableNPC> getFlanDriveableEntity();
    boolean isFlanPlane();

    List<ItemStack> getGuns();
    void reloadGuns();
    void animateFlanGunMelee();
    void animateFlanGunReload();
    void animateFlanGunShoot();

    Seat getDriver();
    Map<Integer, Seat> getPassengers();
    boolean getLastBurst();
    void setLastBurst(boolean lastBurst);
}

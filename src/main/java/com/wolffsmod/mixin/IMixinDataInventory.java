package com.wolffsmod.mixin;

public interface IMixinDataInventory
{
    boolean getUseWeaponMeleeStats();
    boolean getUseWeaponRangedStats();
    boolean getUseArmorStats();
    boolean getUseDriveableStats();

    void setUseWeaponMeleeStats(boolean useWeaponMeleeStats);
    void setUseWeaponRangedStats(boolean useWeaponRangedStats);
    void setUseArmorStats(boolean useArmorStats);
    void setUseDriveableStats(boolean useDriveableStats);
}

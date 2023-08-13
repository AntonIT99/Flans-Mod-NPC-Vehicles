package com.wolffsmod.mixin.npcs;

import noppes.npcs.DataInventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.nbt.NBTTagCompound;

@Mixin(value = DataInventory.class)
public abstract class MixinDataInventory implements IMixinDataInventory
{
    @Unique
    private boolean useWeaponMeleeStats = false;
    @Unique
    private boolean useWeaponRangedStats = false;
    @Unique
    private boolean useArmorStats = false;
    @Unique
    private boolean useDriveableStats = false;

    @Inject(method = "writeEntityToNBT", at = @At(value = "TAIL"))
    private void onWriteEntityToNBT(NBTTagCompound nbttagcompound, CallbackInfoReturnable<NBTTagCompound> cir)
    {
        nbttagcompound.setBoolean("UseWeaponMeleeStats", useWeaponMeleeStats);
        nbttagcompound.setBoolean("UseWeaponRangedStats", useWeaponRangedStats);
        nbttagcompound.setBoolean("UseArmorStats", useArmorStats);
        nbttagcompound.setBoolean("UseDriveableStats", useDriveableStats);
    }

    @Override
    public boolean getUseWeaponMeleeStats()
    {
        return useWeaponMeleeStats;
    }

    @Override
    public boolean getUseWeaponRangedStats()
    {
        return useWeaponRangedStats;
    }

    @Override
    public boolean getUseArmorStats()
    {
        return useArmorStats;
    }

    @Override
    public boolean getUseDriveableStats()
    {
        return useDriveableStats;
    }

    @Override
    public void setUseWeaponMeleeStats(boolean useWeaponMeleeStats)
    {
        this.useWeaponMeleeStats = useWeaponMeleeStats;
    }

    @Override
    public void setUseWeaponRangedStats(boolean useWeaponRangedStats)
    {
        this.useWeaponRangedStats = useWeaponRangedStats;
    }

    @Override
    public void setUseArmorStats(boolean useArmorStats)
    {
        this.useArmorStats = useArmorStats;
    }

    @Override
    public void setUseDriveableStats(boolean useDriveableStats)
    {
        this.useDriveableStats = useDriveableStats;
    }
}

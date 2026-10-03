package com.wolffsmod.mixin;

import com.wolffsmod.customnpc.IMixinDataDisplay;
import noppes.npcs.DataDisplay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.nbt.NBTTagCompound;

@Mixin(value = DataDisplay.class)
public abstract class MixinDataDisplay implements IMixinDataDisplay
{
    @Unique
    private boolean hasFlanShootAnimation = true;
    @Unique
    private boolean hasFlanReloadAnimation = true;
    @Unique
    private boolean hasFlanMeleeAnimation = true;
    @Unique
    private boolean displayHurtEffect = true;
    @Unique
    private int wolffsmod$transparentBlockLosMode;
    @Unique
    private int wolffsmod$transparentBlockVisionLimit = 1;
    @Unique
    private int wolffsmod$transparentBlockFireLimit = 1;

    @Inject(method = "writeToNBT", at = @At(value = "TAIL"), remap = false)
    private void onWriteToNBT(NBTTagCompound nbttagcompound, CallbackInfoReturnable<NBTTagCompound> cir)
    {
        nbttagcompound.setBoolean("FlanShootAnimation", hasFlanShootAnimation);
        nbttagcompound.setBoolean("FlanReloadAnimation", hasFlanReloadAnimation);
        nbttagcompound.setBoolean("FlanMeleeAnimation", hasFlanMeleeAnimation);
        nbttagcompound.setBoolean("DisplayHurt", displayHurtEffect);
        nbttagcompound.setInteger("WolffTransparentBlockLosMode", wolffsmod$transparentBlockLosMode);
        nbttagcompound.setInteger("WolffTransparentBlockVisionLimit", wolffsmod$transparentBlockVisionLimit);
        nbttagcompound.setInteger("WolffTransparentBlockFireLimit", wolffsmod$transparentBlockFireLimit);
    }

    @Inject(method = "readToNBT", at = @At(value = "TAIL"), remap = false)
    public void onReadToNBT(NBTTagCompound nbttagcompound, CallbackInfo callbackInfo)
    {
        hasFlanShootAnimation = nbttagcompound.getBoolean("FlanShootAnimation");
        hasFlanReloadAnimation = nbttagcompound.getBoolean("FlanReloadAnimation");
        hasFlanMeleeAnimation = nbttagcompound.getBoolean("FlanMeleeAnimation");
        displayHurtEffect = nbttagcompound.getBoolean("DisplayHurt");
        if (nbttagcompound.hasKey("WolffTransparentBlockLosMode")) {
            wolffsmod$transparentBlockLosMode = wolffsmod$clampMode(nbttagcompound.getInteger("WolffTransparentBlockLosMode"));
            wolffsmod$transparentBlockVisionLimit = wolffsmod$clampLimit(nbttagcompound.getInteger("WolffTransparentBlockVisionLimit"));
            wolffsmod$transparentBlockFireLimit = wolffsmod$clampLimit(nbttagcompound.getInteger("WolffTransparentBlockFireLimit"));
        }
    }

    @Override
    public boolean getHasFlanShootAnimation()
    {
        return hasFlanShootAnimation;
    }

    @Override
    public boolean getHasFlanReloadAnimation()
    {
        return hasFlanReloadAnimation;
    }

    @Override
    public boolean getHasFlanMeleeAnimation()
    {
        return hasFlanMeleeAnimation;
    }

    @Override
    public boolean getDisplayHurtEffect()
    {
        return displayHurtEffect;
    }

    @Override
    public void setHasFlanShootAnimation(boolean hasFlanShootAnimation)
    {
        this.hasFlanShootAnimation = hasFlanShootAnimation;
    }

    @Override
    public void setHasFlanReloadAnimation(boolean hasFlanReloadAnimation)
    {
        this.hasFlanReloadAnimation = hasFlanReloadAnimation;
    }

    @Override
    public void setHasFlanMeleeAnimation(boolean hasFlanMeleeAnimation)
    {
        this.hasFlanMeleeAnimation = hasFlanMeleeAnimation;
    }

    @Override
    public void setDisplayHurtEffect(boolean displayHurt)
    {
        this.displayHurtEffect = displayHurt;
    }

    @Override public int getTransparentBlockLosMode() { return wolffsmod$transparentBlockLosMode; }
    @Override public int getTransparentBlockVisionLimit() { return wolffsmod$transparentBlockVisionLimit; }
    @Override public int getTransparentBlockFireLimit() { return wolffsmod$transparentBlockFireLimit; }
    @Override public void setTransparentBlockLosMode(int mode) { wolffsmod$transparentBlockLosMode = wolffsmod$clampMode(mode); }
    @Override public void setTransparentBlockVisionLimit(int limit) { wolffsmod$transparentBlockVisionLimit = wolffsmod$clampLimit(limit); }
    @Override public void setTransparentBlockFireLimit(int limit) { wolffsmod$transparentBlockFireLimit = wolffsmod$clampLimit(limit); }

    @Unique private static int wolffsmod$clampMode(int value) { return Math.max(0, Math.min(value, 2)); }
    @Unique private static int wolffsmod$clampLimit(int value) { return Math.max(0, Math.min(value, 64)); }
}

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

    @Inject(method = "writeToNBT", at = @At(value = "TAIL"), remap = false)
    private void onWriteToNBT(NBTTagCompound nbttagcompound, CallbackInfoReturnable<NBTTagCompound> cir)
    {
        nbttagcompound.setBoolean("FlanShootAnimation", hasFlanShootAnimation);
        nbttagcompound.setBoolean("FlanReloadAnimation", hasFlanReloadAnimation);
        nbttagcompound.setBoolean("FlanMeleeAnimation", hasFlanMeleeAnimation);
        nbttagcompound.setBoolean("DisplayHurt", displayHurtEffect);
    }

    @Inject(method = "readToNBT", at = @At(value = "TAIL"), remap = false)
    public void onReadToNBT(NBTTagCompound nbttagcompound, CallbackInfo callbackInfo)
    {
        hasFlanShootAnimation = nbttagcompound.getBoolean("FlanShootAnimation");
        hasFlanReloadAnimation = nbttagcompound.getBoolean("FlanReloadAnimation");
        hasFlanMeleeAnimation = nbttagcompound.getBoolean("FlanMeleeAnimation");
        displayHurtEffect = nbttagcompound.getBoolean("DisplayHurt");
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
}

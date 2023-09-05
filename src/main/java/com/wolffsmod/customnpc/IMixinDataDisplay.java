package com.wolffsmod.customnpc;

public interface IMixinDataDisplay
{
    boolean getHasFlanShootAnimation();
    boolean getHasFlanReloadAnimation();
    boolean getHasFlanMeleeAnimation();
    boolean getDisplayHurtEffect();
    void setHasFlanShootAnimation(boolean hasFlanShootAnimation);
    void setHasFlanReloadAnimation(boolean hasFlanReloadAnimation);
    void setHasFlanMeleeAnimation(boolean hasFlanMeleeAnimation);
    void setDisplayHurtEffect(boolean displayHurtEffect);
}

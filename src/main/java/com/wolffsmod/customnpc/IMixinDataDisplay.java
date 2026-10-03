package com.wolffsmod.customnpc;

public interface IMixinDataDisplay
{
    boolean getHasFlanShootAnimation();
    boolean getHasFlanReloadAnimation();
    boolean getHasFlanMeleeAnimation();
    boolean getDisplayHurtEffect();
    int getTransparentBlockLosMode();
    int getTransparentBlockVisionLimit();
    int getTransparentBlockFireLimit();
    void setHasFlanShootAnimation(boolean hasFlanShootAnimation);
    void setHasFlanReloadAnimation(boolean hasFlanReloadAnimation);
    void setHasFlanMeleeAnimation(boolean hasFlanMeleeAnimation);
    void setDisplayHurtEffect(boolean displayHurtEffect);
    void setTransparentBlockLosMode(int mode);
    void setTransparentBlockVisionLimit(int limit);
    void setTransparentBlockFireLimit(int limit);
}

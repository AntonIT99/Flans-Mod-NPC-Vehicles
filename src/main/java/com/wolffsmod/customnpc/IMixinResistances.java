package com.wolffsmod.customnpc;

public interface IMixinResistances
{
    int getArrowVulnerability();
    int getMeleeVulnerability();
    int getExplosionVulnerability();
    void setArrowVulnerability(int damage);
    void setMeleeVulnerability(int damage);
    void setExplosionVulnerability(int damage);
}

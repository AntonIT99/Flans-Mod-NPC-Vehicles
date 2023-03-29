package com.flansmod.common.driveables;

public class BoxExplosion {

    public float radius = 4F;
    public float power = 1F;
    public boolean breaksBlocks = true;
    public float damageVsLiving = 1F;
    public float damageVsPlayer = 1F;
    public float damageVsPlane = 1F;
    public float damageVsVehicle = 1F;

    public int particles = 1;

    public BoxExplosion(float explosionRadius, float explosionPower, boolean explosionBreaksBlocks) {
        radius = explosionRadius;
        power = explosionPower;
        breaksBlocks = explosionBreaksBlocks;
    }

    public BoxExplosion(float explosionRadius, float explosionPower, boolean explosionBreaksBlocks, float damageLiving, float damagePlayer, float damagePlane, float damageVehicle) {
        this(explosionRadius, explosionPower, explosionBreaksBlocks);

        damageVsLiving = damageLiving;
        damageVsPlayer = damagePlayer;
        damageVsPlane = damagePlane;
        damageVsVehicle = damageVehicle;
    }
}

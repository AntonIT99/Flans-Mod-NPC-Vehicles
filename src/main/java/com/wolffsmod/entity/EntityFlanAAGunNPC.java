package com.wolffsmod.entity;

import com.wolffsmod.entity.config.ConfigAAGun;

import net.minecraft.world.World;

import java.util.Arrays;

public abstract class EntityFlanAAGunNPC extends EntityFlanDriveableNPC implements ConfigAAGun
{
    public int numBarrels;
    public float recoil = 5F;
    public float[] barrelRecoil;
    public boolean[] hasAmmo;

    public EntityFlanAAGunNPC(World w)
    {
        super(w);
        setupConfig();
        hasAmmo = new boolean[numBarrels];
        barrelRecoil = new float[numBarrels];
        Arrays.fill(hasAmmo, true);
        Arrays.fill(barrelRecoil, recoil);
        driver.set(-360F, 360F, 0F, 90F);
    }

    @Override
    public void setNumBarrels(int numBarrels)
    {
        this.numBarrels = numBarrels;
    }

    @Override
    public void setRecoil(float recoil)
    {
        this.recoil = recoil;
    }
}

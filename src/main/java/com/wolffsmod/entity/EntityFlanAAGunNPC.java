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
    public int[] barrelX, barrelY, barrelZ;

    public EntityFlanAAGunNPC(World w)
    {
        super(w);
        //Default driver angle limits
        driver.set(-360F, 360F, 0F, 90F);
        setupConfig();
        hasAmmo = new boolean[numBarrels];
        barrelRecoil = new float[numBarrels];
        barrelX = new int[numBarrels];
        barrelY = new int[numBarrels];
        barrelZ = new int[numBarrels];
        Arrays.fill(hasAmmo, true);
        Arrays.fill(barrelRecoil, recoil);
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

    @Override
    public void addBarrel(String data)
    {
        String[] split = data.split(" ");
        int id = Integer.parseInt(split[0]);
        barrelX[id] = Integer.parseInt(split[1]);
        barrelY[id] = Integer.parseInt(split[2]);
        barrelZ[id] = Integer.parseInt(split[3]);
    }
}

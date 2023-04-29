package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityTiger extends EntityFlanVehicleNPC
{
	public EntityTiger(World w)
	{
		super(w);
		setSize(3.75F, 3.0F);
	}

	@Override
	public void setupConfig()
	{
		setTurnSpeed(0.35F);
		setDriver("0 39 0 -360 360 -8 15");
		setRotatedDriverOffset("-6 0 -14");
		setDriverAimSpeed("0.57 0.47");
		addGun("10 32 10 turret mg42");

		addBarrelPosition("100 34 0");

		addShootParticlesPrimary("largeexplode 0 0 0");
		addShootParticlesPrimary("explode 1.5 0 0");
		addShootParticlesPrimary("largesmoke 0.5 0 0.1");
		addShootParticlesPrimary("largesmoke 0.5 0 -0.1");
		addShootParticlesPrimary("largesmoke 0.5 0.06 0.06");
		addShootParticlesPrimary("largesmoke 0.5 0.06 -0.06");
		addShootParticlesPrimary("largesmoke 0.5 -0.06 0.06");
		addShootParticlesPrimary("largesmoke 0.5 -0.06 -0.06");
		addShootParticlesPrimary("largesmoke 0.5 -0.1 0");
		addShootParticlesPrimary("largesmoke 0.5 0.1 0");
		addShootParticlesPrimary("cloud 0.05 0 0.2");
		addShootParticlesPrimary("cloud 0.05 0 -0.2");
		addShootParticlesPrimary("cloud 0.05 0.13 0.13");
		addShootParticlesPrimary("cloud 0.05 0.13 -0.13");
		addShootParticlesPrimary("cloud 0.05 -0.13 0.13");
		addShootParticlesPrimary("cloud 0.05 -0.13 -0.13");
		addShootParticlesPrimary("cloud 0.05 -0.2 0");
		addShootParticlesPrimary("cloud 0.05 0.2 0");
		addShootParticlesPrimary("flansmod.fmflame 1 0 0");
		addShootParticlesPrimary("flansmod.fmflame 1.75 0 0");
		addShootParticlesPrimary("flansmod.fmflame 1.5 0 0");
		addShootParticlesPrimary("flansmod.fmflame 1.25 0 0");
		addShootParticlesPrimary("flansmod.fmflame 0.75 0 0");
		addShootParticlesPrimary("flansmod.fmflame 0.5 0 0");
		addShootParticlesPrimary("flansmod.fmflame 0.25 0 0");
		addShootParticlesPrimary("flansmod.fmflame 1.5 0 0");
		addShootParticlesPrimary("flansmod.fmflame 0.5 0 0.1");
		addShootParticlesPrimary("flansmod.fmflame 0.5 0 -0.1");
		addShootParticlesPrimary("flansmod.fmflame 0.5 0.06 0.06");
		addShootParticlesPrimary("flansmod.fmflame 0.5 0.06 -0.06");
		addShootParticlesPrimary("flansmod.fmflame 0.5 -0.06 0.06");
		addShootParticlesPrimary("flansmod.fmflame 0.5 -0.06 -0.06");
		addShootParticlesPrimary("flansmod.fmflame 0.5 -0.1 0");
		addShootParticlesPrimary("flansmod.fmflame 0.5 0.1 0");
		addShootParticlesPrimary("flansmod.fmflame 0.05 0 0.2");
		addShootParticlesPrimary("flansmod.fmflame 0.05 0 -0.2");
		addShootParticlesPrimary("flansmod.fmflame 0.05 0.13 0.13");
		addShootParticlesPrimary("flansmod.fmflame 0.05 0.13 -0.13");
		addShootParticlesPrimary("flansmod.fmflame 0.05 -0.13 0.13");
		addShootParticlesPrimary("flansmod.fmflame 0.05 -0.13 -0.13");
		addShootParticlesPrimary("flansmod.fmflame 0.05 -0.2 0");
		addShootParticlesPrimary("flansmod.fmflame 0.05 0.2 0");
		addShootParticlesPrimary("flansmod.fmflame 0.1 0 0.4");
		addShootParticlesPrimary("flansmod.fmflame 0.1 0 -0.4");
		addShootParticlesPrimary("flansmod.fmflame 0.1 0.26 0.26");
		addShootParticlesPrimary("flansmod.fmflame 0.1 0.26 -0.26");
		addShootParticlesPrimary("flansmod.fmflame 0.1 -0.26 0.26");
		addShootParticlesPrimary("flansmod.fmflame 0.1 -0.26 -0.26");
		addShootParticlesPrimary("flansmod.fmflame 0.1 -0.4 0");
		addShootParticlesPrimary("flansmod.fmflame 0.1 0.4 0");
	}
}

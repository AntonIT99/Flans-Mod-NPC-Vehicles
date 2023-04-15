package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityStuG3G extends EntityFlanVehicleNPC
{
	public EntityStuG3G(World w)
	{
		super(w);
		this.setSize(3.5F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setTurnSpeed(0.35F);
		setDriver("-13 24 -15 -6 6 -6 17");
		setDriverAimSpeed("0.7 0.6");
		setPassenger("1 -15 23 6 core -25 25 -15 20 44_Mg34 PassengerGun1");
		addGun("25 29 6 turret 44_Mg34");
		addGunOrigin("1 0 15 5");

		addBarrelPosition("65 21 0");
		setTrackLinkLength(3F);
		setFixTrackLink(4);

		addShootParticlesSecondary("crit 0.5 0 0");

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

		addRightLinkPoint("[47.5,11,-26.1]");
		addRightLinkPoint("[50.5,9,-26.1]");
		addRightLinkPoint("[50.5,3,-26.1]");
		addRightLinkPoint("[35,-9,-26.1]");
		addRightLinkPoint("[-46,-9,-26.1]");
		addRightLinkPoint("[-59.5,2,-26.1]");
		addRightLinkPoint("[-59.5,9,-26.1]");
		addRightLinkPoint("[-53,14,-26.1]");
		addRightLinkPoint("[-45,14,-26.1]");
		addRightLinkPoint("[40,14,-26.1]");
		addRightLinkPoint("[43,14,-26.1]");

		addLeftLinkPoint("[47.5,11,21.1]");
		addLeftLinkPoint("[50.5,9,21.1]");
		addLeftLinkPoint("[50.5,3,21.1]");
		addLeftLinkPoint("[35,-9,21.1]");
		addLeftLinkPoint("[-46,-9,21.1]");
		addLeftLinkPoint("[-59.5,2,21.1]");
		addLeftLinkPoint("[-59.5,9,21.1]");
		addLeftLinkPoint("[-53,14,21.1]");
		addLeftLinkPoint("[-45,14,21.1]");
		addLeftLinkPoint("[40,14,21.1]");
		addLeftLinkPoint("[43,14,21.1]");
	}
}

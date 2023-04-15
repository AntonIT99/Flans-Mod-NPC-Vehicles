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
		setDriver("-13 24 -15 -6 6 -6 17");
		setDriverAimSpeed(0.7F, 0.6F);
		setPassenger("1 -15 23 6 core -25 25 -15 20 44_Mg34 PassengerGun1");

		setTrackLinkLength(3F);

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

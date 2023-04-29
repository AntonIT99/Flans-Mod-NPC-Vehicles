package com.wolffsmod.entity.official.mw;

import com.wolffsmod.entity.EntityFlanAAGunNPC;

import net.minecraft.world.World;
public class EntitySentryGun extends EntityFlanAAGunNPC
{
	public EntitySentryGun(World w)
	{
		super(w);
		setSize(1.0F, 1.8F);
	}

	@Override
	public void setupConfig()
	{
		setDriver("8 28 8 -360 360 -90 90");
		setNumBarrels(4);
		addBarrel("0 40 6 6");
		addBarrel("1 40 6 6");
		addBarrel("2 40 6 6");
		addBarrel("3 40 6 6");
		setRecoil(5);
	}
}
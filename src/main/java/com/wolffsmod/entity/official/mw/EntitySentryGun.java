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
		setNumBarrels(1);
		addBarrel("0 24 23 0");
		setRecoil(5);
	}
}
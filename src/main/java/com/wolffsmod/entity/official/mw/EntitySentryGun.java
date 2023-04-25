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
		setNumBarrels(4);
		setRecoil(5);
	}
}
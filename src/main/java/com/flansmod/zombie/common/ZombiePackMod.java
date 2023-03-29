package com.flansmod.zombie.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansContentProvider;
import cpw.mods.fml.common.Mod;

@Mod(modid = ZombiePackMod.MODID, name = "Zombie Pack", version = ZombiePackMod.VERSION, dependencies = "required-after: simplepartspack; required-after: " + FlansMod.MODID)
public class ZombiePackMod implements IFlansContentProvider {
    public static final String MODID = "zombiepack";
    public static final String VERSION = "@VERSION@";

    @Override
    public String getContentDirectory() {
        return "Zombie Pack";
    }

    @Override
    public void registerModelLocations() {
        FlansMod.registerModelLocation("zombie", "com.flansmod.zombie.client.model");
    }
}

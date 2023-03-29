package com.flansmod.modernweapons.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansContentProvider;
import cpw.mods.fml.common.Mod;

@Mod(modid = ModernWeaponsPackMod.MODID, name = "Modern Weapons Pack", version = ModernWeaponsPackMod.VERSION, dependencies = "required-after: simplepartspack; required-after: " + FlansMod.MODID)
public class ModernWeaponsPackMod implements IFlansContentProvider {
    public static final String MODID = "modernweaponspack";
    public static final String VERSION = "@VERSION@";

    @Override
    public String getContentDirectory() {
        return "Modern Weapons Pack";
    }

    @Override
    public void registerModelLocations() {
        FlansMod.registerModelLocation("mw", "com.flansmod.modernweapons.client.model");
    }
}

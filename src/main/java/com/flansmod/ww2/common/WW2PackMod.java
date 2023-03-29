package com.flansmod.ww2.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansContentProvider;
import cpw.mods.fml.common.Mod;

@Mod(modid = WW2PackMod.MODID, name = WW2PackMod.NAME, version = WW2PackMod.VERSION, dependencies = "required-after: simplepartspack; required-after: " + FlansMod.MODID)
public class WW2PackMod implements IFlansContentProvider {
    public static final String MODID = "ww2pack";
    public static final String VERSION = "@VERSION@";
    public static final String NAME = "WW2 Pack";

    @Override
    public String getContentDirectory() {
        return "WW2 Pack";
    }

    @Override
    public void registerModelLocations() {
        FlansMod.registerModelLocation("ww2", "com.flansmod.ww2.client.model");
    }
}

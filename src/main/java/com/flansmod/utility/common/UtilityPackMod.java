package com.flansmod.utility.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansContentProvider;
import cpw.mods.fml.common.Mod;

@Mod(modid = UtilityPackMod.MODID, name = "Utility Pack", version = UtilityPackMod.VERSION, dependencies = "required-after: simplepartspack; required-after: " + FlansMod.MODID)
public class UtilityPackMod implements IFlansContentProvider {
    public static final String MODID = "flansutilitypack";
    public static final String VERSION = "@VERSION@";

    @Override
    public String getContentDirectory() {
        return "Utility Pack";
    }

    @Override
    public void registerModelLocations() {
        FlansMod.registerModelLocation("utility", "com.flansmod.utility.client.model");
    }
}

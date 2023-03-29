package com.flansmod.titan.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansContentProvider;
import cpw.mods.fml.common.Mod;

@Mod(modid = TitanPackMod.MODID, name = "Titan Pack", version = TitanPackMod.VERSION, dependencies = "required-after: simplepartspack; required-after: " + FlansMod.MODID)
public class TitanPackMod implements IFlansContentProvider {
    public static final String MODID = "titanpack";
    public static final String VERSION = "@VERSION@";

    @Override
    public String getContentDirectory() {
        return "Titan Pack";
    }

    @Override
    public void registerModelLocations() {
        FlansMod.registerModelLocation("titan", "com.flansmod.titan.client.model");
    }
}

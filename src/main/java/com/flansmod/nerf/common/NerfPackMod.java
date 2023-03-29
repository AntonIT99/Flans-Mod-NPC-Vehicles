package com.flansmod.nerf.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansContentProvider;
import cpw.mods.fml.common.Mod;

@Mod(modid = NerfPackMod.MODID, name = "Nerf Pack", version = NerfPackMod.VERSION, dependencies = "required-after: simplepartspack; required-after: " + FlansMod.MODID)
public class NerfPackMod implements IFlansContentProvider {
    public static final String MODID = "nerfpack";
    public static final String VERSION = "@VERSION@";

    @Override
    public String getContentDirectory() {
        return "Nerf Pack";
    }

    @Override
    public void registerModelLocations() {
        FlansMod.registerModelLocation("nerf", "com.flansmod.nerf.client.model");
    }
}

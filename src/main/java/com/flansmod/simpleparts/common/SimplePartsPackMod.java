package com.flansmod.simpleparts.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansContentProvider;
import cpw.mods.fml.common.Mod;

@Mod(modid = SimplePartsPackMod.MODID,
        name = "Simple Parts Pack",
        version = SimplePartsPackMod.VERSION,
        dependencies = "required-after:" + FlansMod.MODID)
public class SimplePartsPackMod implements IFlansContentProvider {
    public static final String MODID = "simplepartspack";
    public static final String VERSION = "@VERSION@";
    public static final String NAME = "Parts Pack";

    @Override
    public String getContentDirectory() {
        return "Parts Pack";
    }

    @Override
    public void registerModelLocations() {
        //No models to register!
    }
}

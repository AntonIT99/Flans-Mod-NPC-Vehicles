package com.flansmod.mechaparts.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansContentProvider;
import cpw.mods.fml.common.Mod;

@Mod(modid = MechaPartsPackMod.MODID, name = "Mecha Parts Pack", version = MechaPartsPackMod.VERSION, dependencies = "required-after: " + FlansMod.MODID)
public class MechaPartsPackMod implements IFlansContentProvider {
    public static final String MODID = "mechapartspack";
    public static final String VERSION = "@VERSION@";

    @Override
    public String getContentDirectory() {
        return "Mecha Parts Pack";
    }

    @Override
    public void registerModelLocations() {
        //No models to register!
    }
}

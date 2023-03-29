package com.flansmod.yeolde.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansContentProvider;
import cpw.mods.fml.common.Mod;

@Mod(modid = YeOldePackMod.MODID, name = "Ye Olde Pack", version = YeOldePackMod.VERSION, dependencies = "required-after: simplepartspack; required-after: " + FlansMod.MODID)
public class YeOldePackMod implements IFlansContentProvider {
    public static final String MODID = "yeoldpack";
    public static final String VERSION = "@VERSION@";

    @Override
    public String getContentDirectory() {
        return "Ye Olde Pack";
    }

    @Override
    public void registerModelLocations() {
        FlansMod.registerModelLocation("yeolde", "com.flansmod.yeolde.client.model");
    }
}

package com.wolffsmod;

import net.minecraftforge.common.config.Configuration;

public class ContentPacks
{
    public static boolean officialWW2 = true;
    public static boolean officialMW = true;
    
    public static boolean manusWW2 = true;
    public static boolean manusMW = true;
    public static boolean manusCivil = true;

    public static boolean warfare44 = true;
    public static boolean worldAtWar = true;
    public static boolean monolithAndTaP = true;
    public static boolean extraZero8 = true;
    public static boolean lizard = true;

    private ContentPacks() {}

    public static void loadPacksConfig(Configuration config)
    {
        officialWW2 = config.getBoolean("Official WW2", "Content Packs", officialWW2, "Enable content pack models");
        officialMW = config.getBoolean("Official Modern Warfare", "Content Packs", officialMW, "Enable content pack models");

        manusWW2 = config.getBoolean("Manus WW2", "Content Packs", manusWW2, "Enable content pack models");
        manusMW = config.getBoolean("Manus Modern Warfare", "Content Packs", manusMW, "Enable content pack models");
        manusCivil = config.getBoolean("Manus Civil", "Content Packs", manusCivil, "Enable content pack models");

        warfare44 = config.getBoolean("Warfare 44", "Content Packs", warfare44, "Enable content pack models");
        worldAtWar = config.getBoolean("World at War", "Content Packs", worldAtWar, "Enable content pack models");
        monolithAndTaP = config.getBoolean("Monolith and Tyrants & Plebeians", "Content Packs", monolithAndTaP, "Enable content pack models");
        extraZero8 = config.getBoolean("Extra Zero 8", "Content Packs", extraZero8, "Enable content pack models");
        lizard = config.getBoolean("Lizard", "Content Packs", lizard, "Enable content pack models");
    }
}

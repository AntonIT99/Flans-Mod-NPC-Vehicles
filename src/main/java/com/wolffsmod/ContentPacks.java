package com.wolffsmod;

import net.minecraftforge.common.config.Configuration;

public class ContentPacks
{
    public static boolean officialWW2 = true;
    public static boolean officialMW = true;
    public static boolean officialYeOlde = true;
    public static boolean officialTitan = true;
    public static boolean officialApocalypse = true;
    public static boolean officialUtility = true;
    
    public static boolean manusWW2 = true;
    public static boolean manusMW = true;
    public static boolean manusCivil = true;
    public static boolean manusDayZ = true;

    public static boolean warfare44 = true;
    public static boolean worldAtWar = true;
    public static boolean monolith = true;
    public static boolean tap = true;
    public static boolean extraZero8 = true;
    public static boolean lizard = true;
    public static boolean wolff = true;
    public static boolean kikkoceccato = true;
    public static boolean price = true;
    public static boolean exufo = true;
    public static boolean prototype = true;

    private ContentPacks() {}

    public static void loadPacksConfig(Configuration config)
    {
        officialWW2 = config.getBoolean("Official WW2", "Content Packs", officialWW2, "Enable content pack models");
        officialMW = config.getBoolean("Official Modern Warfare", "Content Packs", officialMW, "Enable content pack models");
        officialYeOlde = config.getBoolean("Official Ye Olde", "Content Packs", officialYeOlde, "Enable content pack models");
        officialTitan = config.getBoolean("Official Titan", "Content Packs", officialTitan, "Enable content pack models");
        officialApocalypse = config.getBoolean("Official Apocalypse", "Content Packs", officialApocalypse, "Enable content pack models");
        officialUtility = config.getBoolean("Utility", "Content Packs", officialUtility, "Enable content pack models");

        manusWW2 = config.getBoolean("Manus WW2", "Content Packs", manusWW2, "Enable content pack models");
        manusMW = config.getBoolean("Manus Modern Warfare", "Content Packs", manusMW, "Enable content pack models");
        manusCivil = config.getBoolean("Manus Civil", "Content Packs", manusCivil, "Enable content pack models");
        manusDayZ = config.getBoolean("Manus DayZ", "Content Packs", manusDayZ, "Enable content pack models");

        warfare44 = config.getBoolean("Warfare 44", "Content Packs", warfare44, "Enable content pack models");
        worldAtWar = config.getBoolean("World at War", "Content Packs", worldAtWar, "Enable content pack models");
        monolith = config.getBoolean("Monolith", "Content Packs", monolith, "Enable content pack models");
        tap = config.getBoolean("Tyrants & Plebeians", "Content Packs", tap, "Enable content pack models");
        extraZero8 = config.getBoolean("Extra Zero 8", "Content Packs", extraZero8, "Enable content pack models");
        lizard = config.getBoolean("Lizard", "Content Packs", lizard, "Enable content pack models");
        wolff = config.getBoolean("Wolff", "Content Packs", wolff, "Enable content pack models");
        kikkoceccato = config.getBoolean("Kikkoceccato", "Content Packs", kikkoceccato, "Enable content pack models");
        price = config.getBoolean("Price additions", "Content Packs", price, "Enable content pack models");
        exufo = config.getBoolean("Exufo's cop cars", "Content Packs", exufo, "Enable content pack models");
        prototype = config.getBoolean("Prototype", "Content Packs", prototype, "Enable content pack models");
    }
}

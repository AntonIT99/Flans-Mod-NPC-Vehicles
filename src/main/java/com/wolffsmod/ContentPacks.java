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
    public static boolean manusSciFi = true;
    public static boolean manusWH40K = true;
    public static boolean manusShips = true;

    public static boolean prototypeRatte = true;
    public static boolean prototypeFC = true;
    public static boolean prototypeSciFi = true;
    public static boolean prototypeBMP = true;

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
    public static boolean sturmgeschuetz = true;
    public static boolean akaku = true;
    public static boolean aoba = true;
    public static boolean cow = true;
    public static boolean moneybuster = true;
    public static boolean wot = true;
    public static boolean berggeit = true;
    public static boolean cvt = true;
    public static boolean mos = true;

    private static String desc = "Enable content pack models";
    private static String category = "Content Packs";

    private ContentPacks() {}

    public static void loadPacksConfig(Configuration config)
    {
        officialWW2 = config.getBoolean("Official WW2", category, officialWW2, desc);
        officialMW = config.getBoolean("Official Modern Warfare", category, officialMW, desc);
        officialYeOlde = config.getBoolean("Official Ye Olde", category, officialYeOlde, desc);
        officialTitan = config.getBoolean("Official Titan", category, officialTitan, desc);
        officialApocalypse = config.getBoolean("Official Apocalypse", category, officialApocalypse, desc);
        officialUtility = config.getBoolean("Utility", category, officialUtility, desc);

        manusWW2 = config.getBoolean("Manus WW2", category, manusWW2, desc);
        manusMW = config.getBoolean("Manus Modern Warfare", category, manusMW, desc);
        manusCivil = config.getBoolean("Manus Civil", category, manusCivil, desc);
        manusDayZ = config.getBoolean("Manus DayZ", category, manusDayZ, desc);
        manusSciFi = config.getBoolean("Manus SciFi", category, manusSciFi, desc);
        manusWH40K = config.getBoolean("Manus WH40K", category, manusWH40K, desc);
        manusShips = config.getBoolean("Manus Ships", category, manusShips, desc);

        prototypeRatte = config.getBoolean("Prototype Landkreuzer Ratte", category, prototypeRatte, desc);
        prototypeFC = config.getBoolean("Prototype Future Craft", category, prototypeFC, desc);
        prototypeSciFi = config.getBoolean("Prototype SciFi", category, prototypeSciFi, desc);
        prototypeBMP = config.getBoolean("Prototype British Military", category, prototypeBMP, desc);

        warfare44 = config.getBoolean("Warfare 44", category, warfare44, desc);
        worldAtWar = config.getBoolean("World at War", category, worldAtWar, desc);
        monolith = config.getBoolean("Monolith", category, monolith, desc);
        tap = config.getBoolean("Tyrants & Plebeians", category, tap, desc);
        extraZero8 = config.getBoolean("Extra Zero 8", category, extraZero8, desc);
        lizard = config.getBoolean("Lizard", category, lizard, desc);
        wolff = config.getBoolean("Wolff", category, wolff, desc);
        kikkoceccato = config.getBoolean("Kikkoceccato", category, kikkoceccato, desc);
        price = config.getBoolean("Price additions", category, price, desc);
        exufo = config.getBoolean("Exufo's cop cars", category, exufo, desc);
        sturmgeschuetz = config.getBoolean("Sturmgeschütz", category, sturmgeschuetz, desc);
        akaku = config.getBoolean("Akaku", category, akaku, desc);
        aoba = config.getBoolean("Aoba", category, aoba, desc);
        cow = config.getBoolean("Cow West", category, cow, desc);
        moneybuster = config.getBoolean("Moneybuster", category, moneybuster, desc);
        wot = config.getBoolean("World of Tanks", category, wot, desc);
        berggeit = config.getBoolean("Berggeit", category, berggeit, desc);
        cvt = config.getBoolean("CVT", category, cvt, desc);
        mos = config.getBoolean("MosPack", category, mos, desc);
    }
}

package com.wolffsmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = Strings.MOD_ID, name = Strings.MOD_NAME, version = Strings.MOD_VERSION, dependencies="after: customnpcs; required-after: flansmod")

public class WolffNPCMod
{
	@SidedProxy(clientSide = "com.wolffsmod.ClientProxy", serverSide = "com.wolffsmod.ServerProxy")
	public static ServerProxy PROXY;
	
	@Instance(Strings.MOD_ID)
	public static WolffNPCMod INSTANCE;

	public static Configuration config;
	public static boolean ignoreFrustumCheckForNpcVehicles = true;
	public static boolean ignoreFrustumCheckForLargeEntities = true;
	public static float largeEntitySize = 5F;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		config = new Configuration(event.getSuggestedConfigurationFile());
		ignoreFrustumCheckForNpcVehicles = config.getBoolean(
				"Ignore frustum check for NPC vehicles",
				"Client Side Settings",
				ignoreFrustumCheckForNpcVehicles,
				"Rendering fix for all NPC vehicles, set to false if you experience performance issues");
		ignoreFrustumCheckForLargeEntities = config.getBoolean(
				"Ignore frustum check for large entities",
				"Client Side Settings",
				ignoreFrustumCheckForLargeEntities,
				"Rendering fix for large NPC entities, set to false if you experience performance issues");
		largeEntitySize = config.getFloat(
				"Large NPC entity size",
				"Client Side Settings",
				largeEntitySize,
				0F,
				64F,
				"Ignore frustum check for entities with a hit box width or height greater than this value");
		if (config.hasChanged())
			config.save();
	}

	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModEntityRegistry.registerEntities();
		PROXY.registerRenderers();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}

	// Only for debug
	/*@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandModelUpdate());
	}*/

}

package com.wolffsmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Strings.MOD_ID, name = Strings.MOD_NAME, version = Strings.MOD_VERSION, dependencies="after: customnpcs; required-after: flansmod")

public class WolffNPCMod
{
	
	@SidedProxy(clientSide = "com.wolffsmod.ClientProxy", serverSide = "com.wolffsmod.ServerProxy")
	public static ServerProxy proxy;
	
	@Instance(Strings.MOD_ID)
	public static WolffNPCMod modInstance;
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent preEvent)
	{
		ModEntityRegistry.registerEntities();
		proxy.registerRenderThings();
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) {}
	
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent postEvent) {}

	// Only for debug
	/*@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandModelUpdate());
	}*/

}

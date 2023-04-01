package com.wolffsmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Strings.MOD_ID, name = Strings.MOD_NAME, version = Strings.MOD_VERSION, dependencies="after: customnpcs; required-after: flansmod")

public class WolffNPCMod
{
	
	@SidedProxy(clientSide = "com.wolffsmod.ClientProxy", serverSide = "com.wolffsmod.ServerProxy")
	public static ServerProxy PROXY;
	
	@Instance(Strings.MOD_ID)
	public static WolffNPCMod INSTANCE;
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent preEvent) {}

	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModEntityRegistry.registerEntities();
		PROXY.registerRenderers();
	}
	
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent postEvent) {}

	// Only for debug
	/*@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandModelUpdate());
	}*/

}

package com.wolffsmod;

import net.minecraft.block.Block;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)

public class Main {
	
	@SidedProxy(clientSide = "com.wolffsmod.ClientProxy", serverSide = "com.wolffsmod.ServerProxy")
	public static ServerProxy proxy;
	
	@Instance(Strings.MODID)
	public static Main modInstance;
	
	
	@EventHandler
	public static void Preinit(FMLPreInitializationEvent PreEvent) {
		ModEntityRegistry.mainRegistry();
		proxy.registerRenderThings();
		
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) {
	}
	
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent PostEvent) {
	
	}

}

package com.wolffsmod;

import net.minecraft.block.Block;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version, dependencies = "required-after:flansmod")
public class Main {
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = "com.wolffsmod.ClientProxy", serverSide = "com.wolffsmod.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public static void Preinit(FMLPreInitializationEvent event) {
		ModEntityRegistry.mainRegistry();
		proxy.registerRenderThings();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent PostEvent) {
	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		//event.registerServerCommand(new CommandModelUpdate());
	}

}

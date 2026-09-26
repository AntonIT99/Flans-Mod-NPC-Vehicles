package com.wolffsmod;

import com.wolffsmod.network.FlanAnimPacket;
import com.wolffsmod.network.FlanEntitySyncPacket;
import com.wolffsmod.network.RangeConfigPacket;
import com.wolffsmod.network.RangeConfigSyncHandler;
import com.wolffsmod.config.RangeConfig;
import com.wolffsmod.config.TargetSearchConfig;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModInfo.MOD_ID,
		name = ModInfo.NAME,
		version = ModInfo.VERSION,
		dependencies="required-after: customnpcs; required-after: flansmod")
public class WolffNPCMod
{
	@SidedProxy(clientSide = "com.wolffsmod.ClientProxy", serverSide = "com.wolffsmod.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(ModInfo.MOD_ID)
	public static WolffNPCMod instance;

	public static Configuration config;

	public static SimpleNetworkWrapper network;

	public static final Logger log = LogManager.getLogger(ModInfo.MOD_ID);

	public static boolean ignoreFrustumCheckForNpcVehicles = true;
	public static boolean ignoreFrustumCheckForLargeEntities = true;
	public static boolean shootingParticles = true;
	public static float entityUpdateRange = 512F;
	public static float largeEntitySize = 5F;
	public static boolean enableStaticRenderGroupBatching = true;
	public static boolean enableSafeVehicleGeometryCache = true;
	public static boolean avoidDuplicateWheelRendering = true;
	public static boolean cacheNPCPathBlockReads = true;
	public static boolean reusePartialPursuitPaths = true;
	public static boolean adaptiveNPCPathSearchRadius = true;
	public static int minimumNPCPathSearchRadius = 32;
	public static int npcPathSearchDetourMargin = 24;
	public static boolean cullSafeVehicleGroups = true;
	public static boolean selectVehicleTrackFrames = true;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		config = new Configuration(event.getSuggestedConfigurationFile());
		cullSafeVehicleGroups = config.getBoolean("Cull verified offscreen vehicle groups", "Client Side Settings", true,
				"Use active camera matrices and conservative geometry bounds, not entity size or fixed FOV. Unknown/dynamic groups remain visible. Restart after changing.");
		selectVehicleTrackFrames = config.getBoolean("Select vehicle track animation frames", "Client Side Settings", true,
				"Select one frame from complete track alternatives using wheel motion. Mixed/sparse sets retain old rendering. Disable for nonstandard models. Restart after changing.");
		reusePartialPursuitPaths = config.getBoolean("Reuse expensive partial pursuit paths", "NPC Path Performance", true,
				"Default ground ranged pursuit only: briefly reuse an expensive partial path while progressing toward a nearby moving target. Does not change tactical XYZ paths or ranges. Restart after changing.");
		adaptiveNPCPathSearchRadius = config.getBoolean("Use adaptive NPC path search radius", "NPC Path Performance", true,
				"Limit each ground pathfinder search sphere to the actual destination distance plus a detour margin. Does not reduce NPCNavigationRange or combat range. Disable for exact legacy search behavior. Restart required.");
		minimumNPCPathSearchRadius = config.getInt("Minimum NPC path search radius", "NPC Path Performance", 32, 8, 256,
				"Minimum per-request ground path search radius in blocks when adaptive search is enabled. Maximum: 256. Restart required.");
		npcPathSearchDetourMargin = config.getInt("NPC path search detour margin", "NPC Path Performance", 24, 4, 256,
				"Extra blocks added beyond the straight-line destination distance for detours. Maximum: 256. This does not cap how far away an NPC can navigate. Restart required.");
		cacheNPCPathBlockReads = config.getBoolean("Cache NPC path block reads", "NPC Path Performance", true,
				"Reuse block-type reads only inside one synchronous NPC ground path search. Does not reduce ranges or delay AI. Disable if another mod changes blocks during path-search callbacks. Restart required.");

		entityUpdateRange = config.getFloat(
				"Entity update range",
				"General Settings",
				entityUpdateRange,
				0F,
				1024F,
				"Range in blocks for NPC vehicles to be updated");
		shootingParticles = config.getBoolean(
				"Shooting particles",
				"General Settings",
				shootingParticles,
				"Enable shooting particles for some vehicles");
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
		enableStaticRenderGroupBatching = config.getBoolean(
				"Enable static vehicle render group batching",
				"Client Side Settings",
				enableStaticRenderGroupBatching,
				"Legacy Alpha 12 setting. Command batching is bypassed to preserve textures and transparency with OptiFine and Angelica; Flan's geometry cache remains active.");

		RangeConfig.load(config);
		enableSafeVehicleGeometryCache = config.getBoolean("Enable safe vehicle geometry cache", "Client Side Settings", true,
				"Automatically cache verified model groups and share their texture/blend setup. Dynamic or unsupported parts use original rendering. Set false for comparison or rollback. The legacy batching setting remains ignored.");
		avoidDuplicateWheelRendering = config.getBoolean("Avoid duplicate vehicle wheel rendering", "Client Side Settings", true,
				"Submit rotating wheel groups once instead of twice. Set false to reproduce the previous rendering for comparison.");
		TargetSearchConfig.load(config);

		ContentPacks.loadPacksConfig(config);

		if (config.hasChanged())
			config.save();

		network = NetworkRegistry.INSTANCE.newSimpleChannel("NPCVehiclesChannel");
		network.registerMessage(FlanEntitySyncPacket.Handler.class, FlanEntitySyncPacket.class, 0, Side.CLIENT);
		network.registerMessage(FlanAnimPacket.Handler.class, FlanAnimPacket.class, 1, Side.CLIENT);
		network.registerMessage(RangeConfigPacket.Handler.class, RangeConfigPacket.class, 2, Side.CLIENT);
		FMLCommonHandler.instance().bus().register(new RangeConfigSyncHandler());
		FMLCommonHandler.instance().bus().register(com.wolffsmod.benchmark.ServerBenchmark.INSTANCE);
		MinecraftForge.EVENT_BUS.register(new com.wolffsmod.customnpc.CustomNpcTickActivation());
	}

	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModEntityRegistry.registerEntities();
		proxy.registerRenderers();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}

	@EventHandler
	public static void benchmarkServerStart(cpw.mods.fml.common.event.FMLServerStartingEvent event) {
		event.registerServerCommand(new com.wolffsmod.benchmark.ServerBenchmarkCommand());
	}

	@EventHandler
	public static void benchmarkServerStop(cpw.mods.fml.common.event.FMLServerStoppingEvent event) {
		com.wolffsmod.benchmark.ServerBenchmark.stop("ABORTED: server stopping");
	}

	// Only for debug
	/*@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandModelUpdate());
	}*/

}

package com.flansmod.common;

import com.flansmod.client.AimType;
import com.flansmod.client.FlanMouseButton;
import com.flansmod.client.FlansCrash;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.driveables.*;
import com.flansmod.common.driveables.mechas.*;
import com.flansmod.common.eventhandlers.*;
import com.flansmod.common.guns.*;
import com.flansmod.common.guns.boxes.BlockGunBox;
import com.flansmod.common.guns.boxes.GunBoxEntry;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.guns.boxes.GunPage;
import com.flansmod.common.network.PacketHandler;
import com.flansmod.common.paintjob.BlockPaintjobTable;
import com.flansmod.common.paintjob.TileEntityPaintjobTable;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.sync.Sync;
import com.flansmod.common.sync.SyncEventHandler;
import com.flansmod.common.teams.*;
import com.flansmod.common.tools.EntityParachute;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.tools.ToolType;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.IGunboxDescriptionable;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.material.Material;
import net.minecraft.command.CommandHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

@SuppressWarnings({"unused", "WeakerAccess"})
@Mod(modid = FlansMod.MODID, name = "Flan's Mod Ultimate (Stability Edition)", version = FlansMod.VERSION, acceptableRemoteVersions = "[" + FlansMod.VERSION + "]", guiFactory = "com.flansmod.client.gui.config.ModGuiFactory")
public class FlansMod {
    //Core mod stuff
    public static Logger logger = LogManager.getLogger("Flan's Mod Ultimate");
    public static boolean DEBUG = false;
    public static Configuration configFile;
    public static final String MODID = "flansmod";
    public static final String VERSION = "@VERSION@";
    @Instance(MODID)
    public static FlansMod INSTANCE;
    public static boolean printDebugLog = true;
    public static boolean printStackTrace = false;
    public static int noticeSpawnKillTime = 10;
    public static boolean enableKillMessages = true;
    public static boolean gunCarryLimitEnable = false;
    public static int gunCarryLimit = 3;
    public static int breakableArmor = 0;
    public static int defaultArmorDurability = 500;
    public static boolean armsEnable = true;
    public static boolean holdingGunsDisablesChests = true;
    public static boolean holdingGunsDisablesAll = false;
    public static boolean casingEnable = true;
    public static boolean crosshairEnable = false;
    public static boolean realisticRecoil = false;
    public static boolean enableSightDownwardMovement = true;
    public static boolean hitCrossHairEnable = true;
    public static boolean hdHitCrosshair = false;
    public static boolean bulletGuiEnable = true;
    public static boolean fancyBulletGui = true;
    public static float[] hitCrossHairColor = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
    public static boolean addGunpowderRecipe = true;
    public static boolean addAllPaintjobsToCreative = false;
    public static int teamsConfigInteger = 32;
    public static boolean teamsConfigBoolean = false;
    @SidedProxy(clientSide = "com.flansmod.client.ClientProxy", serverSide = "com.flansmod.common.CommonProxy")
    public static CommonProxy proxy;
    public static int ticker = 0;
    public static long lastTime;
    public static File flanDir;
    public static final float soundRange = 50F;
    public static float driveableUpdateRange = 400F;
    public static final int numPlayerSnapshots = 20;
    public static int armourEnchantability = 0;
    public static boolean kickNonMatchingHashes = false;
    public static boolean disableSprintHipFireByDefault = false;
    public static boolean useNewPenetrationSystem = false;
    public static boolean gunsInDeadPartsWork = false;
    public static boolean fancyCrosshair = true;
    public static boolean showDistanceInKillMessage = true;
    public static boolean driveableHitboxes = true;
    public static boolean reloadOnRightClick = true;
    public static float defaultADSSpreadMultiplier = 0.2F;
    public static float defaultADSSpreadMultiplierShotgun = 0.8F;
    public static boolean seatCollisions = true;
    public static boolean showItemDescriptions = true;
    public static boolean showMuzzleFlashParticlesDefault = true;
    public static boolean showFlashesWhenWounded = true;
    public static float vehicleWheelSeatExplosionModifier = 1F;
    public static boolean showPackNameInItemDescriptions = true;
    public static float masterDamageModifier = 1.0F;
    public static float masterRecoilModifier = 1.0F;
    public static float masterHeadshotModifier = 2.0F;
    public static float masterLegModifier = 0.5F;
    public static boolean masterDualWieldDisable = false;
    public static boolean gunDevMode = false;

    public static float nameTagRenderRange = 64F;
    public static float nameTagSneakRenderRange = 32F;
    public static float maxHealth = 20;

    public static int armourSpawnRate = 20;

    /**
     * The spectator team. Moved here to avoid a concurrent modification error
     */
    public static Team spectators = new Team("spectators", "Spectators", 0x404040, '7');

    //Handlers
    public static final PacketHandler packetHandler = new PacketHandler();
    public static final PlayerHandler playerHandler = new PlayerHandler();
    public static final TeamsManager teamsManager = new TeamsManager();
    public static final CommonTickHandler tickHandler = new CommonTickHandler();
    public static FlansHooks hooks = new FlansHooks();
    public static final ContentManager contentManager = new ContentManager();

    private static final HashMap<String, String> modelLocations = new HashMap<>();

    public static boolean isInFlash = false;
    public static int flashTime = 10;

    //Items and creative tabs
    public static BlockFlansWorkbench workbench;
    public static BlockPaintjobTable paintjobTable;
    public static BlockSpawner spawner;
    public static ItemOpStick opStick;
    public static ItemFlagpole flag;
    public static Item crosshairsymbol;
    public static ArrayList<BlockGunBox> gunBoxBlocks = new ArrayList<>();
    public static ArrayList<ItemBullet> bulletItems = new ArrayList<>();
    public static ArrayList<ItemGun> gunItems = new ArrayList<>();
    public static ArrayList<ItemAttachment> attachmentItems = new ArrayList<>();
    public static ArrayList<ItemPart> partItems = new ArrayList<>();
    public static ArrayList<ItemPlane> planeItems = new ArrayList<>();
    public static ArrayList<ItemVehicle> vehicleItems = new ArrayList<>();
    public static ArrayList<ItemMechaAddon> mechaToolItems = new ArrayList<>();
    public static ArrayList<ItemMecha> mechaItems = new ArrayList<>();
    public static ArrayList<ItemAAGun> aaGunItems = new ArrayList<>();
    public static ArrayList<ItemGrenade> grenadeItems = new ArrayList<>();
    public static ArrayList<ItemTool> toolItems = new ArrayList<>();
    public static ArrayList<ItemTeamArmour> armourItems = new ArrayList<>();
    public static ArrayList<BlockArmourBox> armourBoxBlocks = new ArrayList<>();
    public static CreativeTabFlan tabFlanGuns = new CreativeTabFlan(0), tabFlanDriveables = new CreativeTabFlan(1),
            tabFlanParts = new CreativeTabFlan(2), tabFlanTeams = new CreativeTabFlan(3), tabFlanMechas = new CreativeTabFlan(4);

    //Gun animations
    /**
     * Gun animation variables for each entity holding a gun. Currently only applicable to the player
     */
    public static HashMap<EntityLivingBase, GunAnimations> gunAnimationsRight = new HashMap<>(), gunAnimationsLeft = new HashMap<>();

    public static boolean debugMode = true;


    /**
     * The mod pre-initializer method
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        log("Pre-initializing Flan's mod.");
        configFile = new Configuration(event.getSuggestedConfigurationFile());
        syncConfig(event.getSide());

        flanDir = new File(event.getModConfigurationDirectory().getParentFile(), "/Flan/");

        if (!flanDir.exists()) {
            log("Flan folder not found. Creating empty folder.");
            log("You should get some content packs and put them in the Flan folder.");
            boolean success = flanDir.mkdirs();
            log("Created Flan directory: " + success);
        }

        //Set up mod blocks and items
	    crosshairsymbol = (new Item()).setUnlocalizedName("crosshairsymbol").setTextureName("FlansMod:" + "crosshairsymbol");
        workbench = (BlockFlansWorkbench) (new BlockFlansWorkbench(1, 0).setBlockName("flansWorkbench").setBlockTextureName("flansWorkbench"));
        GameRegistry.registerBlock(workbench, ItemBlockManyNames.class, "flansWorkbench");
        GameRegistry.addRecipe(new ItemStack(workbench, 1, 0), "BBB", "III", "III", 'B', Items.bowl, 'I', Items.iron_ingot);
        GameRegistry.addRecipe(new ItemStack(workbench, 1, 1), "ICI", "III", 'C', Items.cauldron, 'I', Items.iron_ingot);
        opStick = new ItemOpStick();
        GameRegistry.registerItem(opStick, "opStick", MODID);
        flag = (ItemFlagpole) (new ItemFlagpole().setUnlocalizedName("flagpole"));
        GameRegistry.registerItem(flag, "flagpole", MODID);
        spawner = (BlockSpawner) (new BlockSpawner(Material.iron).setBlockName("teamsSpawner").setBlockUnbreakable().setResistance(1000000F));
        GameRegistry.registerBlock(spawner, ItemBlockManyNames.class, "teamsSpawner");
        GameRegistry.registerTileEntity(TileEntitySpawner.class, "teamsSpawner");
        GameRegistry.registerItem(crosshairsymbol, "crosshairsymbol", MODID);
        paintjobTable = new BlockPaintjobTable();
        GameRegistry.registerBlock(paintjobTable, "paintjobTable");
        GameRegistry.addRecipe(new ItemStack(paintjobTable), "ICI", "III", "DDD", 'C', Items.cauldron, 'I', Items.iron_ingot, 'D', Items.dye);
        GameRegistry.registerTileEntity(TileEntityPaintjobTable.class, MODID);

        proxy.registerRenderers();

        //Read content packs
        contentManager.loadContent();
        proxy.loadFlanAssets();
        contentManager.createItems();

        if (gunItems.size() >= 1) {
            MinecraftForge.EVENT_BUS.register(gunItems.get(0));
        }

        //Do proxy loading
        proxy.load();
        //Force Minecraft to reload all resources in order to load content pack resources.
        if (contentManager.reloadResources()) {
            logger.info("Content packs detected, reload resources");
            proxy.forceReload();
        }

        FMLCommonHandler.instance().registerCrashCallable(new FlansCrash());

        Team.spectators = spectators;
        log("Pre-initializing complete.");
    }

    /**
     * The mod initializer method
     */
    @EventHandler
    public void init(FMLInitializationEvent event) {
        log("Initializing Flan's Mod.");

        //Initialising handlers
        packetHandler.initialise();
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new CommonGuiHandler());

        // Recipes
        for (InfoType type : InfoType.infoTypes) {
            type.addRecipe();
        }
        if (addGunpowderRecipe) {
            ItemStack charcoal = new ItemStack(Items.coal, 1, 1);
            GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowder), charcoal, charcoal, charcoal, new ItemStack(Items.glowstone_dust));
        }
        log("Loaded recipes.");

        //Register teams mod entities
        EntityRegistry.registerGlobalEntityID(EntityFlagpole.class, "Flagpole", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityFlagpole.class, "Flagpole", 93, this, 40, 5, true);
        EntityRegistry.registerGlobalEntityID(EntityFlag.class, "Flag", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityFlag.class, "Flag", 94, this, 40, 5, true);
        EntityRegistry.registerGlobalEntityID(EntityTeamItem.class, "TeamsItem", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityTeamItem.class, "TeamsItem", 97, this, 100, 10000, true);
        EntityRegistry.registerGlobalEntityID(EntityGunItem.class, "GunItem", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityGunItem.class, "GunItem", 98, this, 100, 20, true);

        //Register driveables
        EntityRegistry.registerGlobalEntityID(EntityPlane.class, "Plane", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityPlane.class, "Plane", 90, this, 200, 3, true);
        EntityRegistry.registerGlobalEntityID(EntityVehicle.class, "Vehicle", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityVehicle.class, "Vehicle", 95, this, 400, 10, true);
        EntityRegistry.registerGlobalEntityID(EntitySeat.class, "Seat", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntitySeat.class, "Seat", 99, this, 250, 10, true);
        EntityRegistry.registerGlobalEntityID(EntityWheel.class, "Wheel", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityWheel.class, "Wheel", 103, this, 200, 20, true);
        EntityRegistry.registerGlobalEntityID(EntityParachute.class, "Parachute", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityParachute.class, "Parachute", 101, this, 40, 20, false);
        EntityRegistry.registerGlobalEntityID(EntityMecha.class, "Mecha", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityMecha.class, "Mecha", 102, this, 250, 20, false);

        //Register bullets and grenades
        EntityRegistry.registerGlobalEntityID(EntityBullet.class, "Bullet", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityBullet.class, "Bullet", 96, this, 200, 20, false);
        EntityRegistry.registerGlobalEntityID(EntityGrenade.class, "Grenade", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityGrenade.class, "Grenade", 100, this, 40, 100, true);

        //Register MGs and AA guns
        EntityRegistry.registerGlobalEntityID(EntityMG.class, "MG", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityMG.class, "MG", 91, this, 40, 5, true);
        EntityRegistry.registerGlobalEntityID(EntityAAGun.class, "AAGun", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityAAGun.class, "AAGun", 92, this, 40, 500, false);

        //Register the chunk loader
        //TODO : Re-do chunk loading
        ForgeChunkManager.setForcedChunkLoadingCallback(this, new ChunkLoadingHandler());

        //Config
        FMLCommonHandler.instance().bus().register(INSTANCE);
        //Starting the EventListener
        new PlayerDeathEventListener();
        new PlayerLoginEventListener();
        new PlayerSpawnEventListener();
        MinecraftForge.EVENT_BUS.register(new PlayerDropsEventListener());
        MinecraftForge.EVENT_BUS.register(new LivingSpawnEventListener());
        MinecraftForge.EVENT_BUS.register(new AnvilUpdateEventListener());
        new ServerTickEvent();

        log("Loading complete.");
    }

    /**
     * The mod post-initialisation method
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) throws Exception {
        //Initialize the packet handler
        packetHandler.postInitialise();

        //Perform any necessary hooks
        hooks.hook();

        //Register the event handler for syncing data between client and server
        FMLCommonHandler.instance().bus().register(new SyncEventHandler());

        //Log that the gunbox mapping process is starting
        FlansMod.log("Starting gunbox mapping.");

        //Iterate through all gun box blocks
        for (BlockGunBox box : gunBoxBlocks) {
            //Iterate through all pages of the current gun box
            for (GunPage page : box.type.gunPages) {
                //Iterate through all entries in the current page
                for (GunBoxEntry entry : page.gunList) {
                    try {
                        //Check if the entry has a valid type
                        if (entry.type != null) {
                            //Get the item associated with the entry
                            IGunboxDescriptionable item = getGunBoxItem(entry.type);

                            //If the item exists, set its origin gun box to the current box's name
                            if (item != null) {
                                item.setOriginGunBox(box.getLocalizedName());
                            }
                        }
                        //Check if the entry has any valid ammo
                        if (!entry.isAmmoNullOrEmpty()) {
                            //Iterate through all ammo entries
                            for (GunBoxEntry ammoEntry : entry.ammoEntryList) {
                                //Get the item associated with the ammo entry
                                IGunboxDescriptionable item = getGunBoxItem(ammoEntry.type);

                                //If the item exists, set its origin gun box to the current box's name
                                if (item != null) {
                                    item.setOriginGunBox(box.getLocalizedName());
                                }
                            }
                        }
                    } catch (Exception e) {
                        //If an exception is caught and the debug log is enabled, print the exception and a message
                        if (FlansMod.printDebugLog) {
                            FlansMod.log("A gunbox entry appears to be null");
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        //Log that the gunbox mapping process has finished
        FlansMod.log("Finished gunbox mapping.");
    }

    /**
     * Teams command register method
     */
    @EventHandler
    public void registerCommand(FMLServerStartedEvent e) {
        CommandHandler handler = ((CommandHandler) FMLCommonHandler.instance().getSidedDelegate().getServer().getCommandManager());
	    //handler.registerCommand(new CommandFlans());
        handler.registerCommand(new CommandTeams());
    }

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
        if (eventArgs.modID.equals(MODID))
            syncCommonConfig();
    }

    /**
     * Reads type files from all content packs
     * @deprecated Use {@link ContentManager#loadContent()}.
     */
    @Deprecated
    private void getTypeFiles(List<File> contentPacks) {
        for (File contentPack : contentPacks) {
            if (contentPack.isDirectory()) {
                File mainConfig = new File(contentPack, "pack.txt");
                if (mainConfig.exists()) {
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(mainConfig));

                    } catch (IOException e) {
                        FlansMod.logger.error("Could not read pack configuration", e);
                    }
                }

                for (EnumType typeToCheckFor : EnumType.values()) {
                    for (String folderName : typeToCheckFor.folderNames) {
                        File typesDir = new File(contentPack, "/" + folderName + "/");
                        if (!typesDir.exists())
                            continue;

                        for (File file : typesDir.listFiles()) {
                            try {
                                BufferedReader reader = new BufferedReader(new FileReader(file));
                                String[] splitName = file.getName().split("/");
                                TypeFile typeFile = new TypeFile(typeToCheckFor, splitName[splitName.length - 1].split("\\.")[0], contentPack.getName());
                                for (; ; ) {
                                    String line;
                                    try {
                                        line = reader.readLine();
                                    } catch (Exception e) {
                                        break;
                                    }
                                    if (line == null)
                                        break;
                                    typeFile.lines.add(line);
                                }
                                reader.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            } else {
                try {
                    ZipFile zip = new ZipFile(contentPack);
                    ZipInputStream zipStream = new ZipInputStream(new FileInputStream(contentPack));
                    BufferedReader reader = new BufferedReader(new InputStreamReader(zipStream));
                    ZipEntry zipEntry;
                    do {
                        zipEntry = zipStream.getNextEntry();
                        if (zipEntry == null)
                            continue;
                        TypeFile typeFile = null;
                        for (EnumType type : EnumType.values()) {
                            for (String folderName : type.folderNames) {
                                if (zipEntry.getName().startsWith(folderName + "/") && zipEntry.getName().split(folderName + "/").length > 1 && zipEntry.getName().split(folderName + "/")[1].length() > 0) {
                                    String[] splitName = zipEntry.getName().split("/");
                                    typeFile = new TypeFile(type, splitName[splitName.length - 1].split("\\.")[0], contentPack.getName());
                                }
                            }
                        }
                        if (typeFile == null) {
                            continue;
                        }
                        for (; ; ) {
                            String line;
                            try {
                                line = reader.readLine();
                            } catch (Exception e) {
                                break;
                            }
                            if (line == null)
                                break;
                            typeFile.lines.add(line);
                        }
                    }
                    while (zipEntry != null);
                    reader.close();
                    zip.close();
                    zipStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Reads Flan content packs.
     *
     * @param event Forge PreInitialization event.
     * @deprecated Use {@link ContentManager#loadContent()} instead.
     */
    @Deprecated
    private void readContentPacks(FMLPreInitializationEvent event) {
        // Icons, Skins, Models
        // Get the classloader in order to load the images
        ClassLoader classloader = (net.minecraft.server.MinecraftServer.class).getClassLoader();
        Method method;
        try {
            method = (java.net.URLClassLoader.class).getDeclaredMethod("addURL", java.net.URL.class);
            method.setAccessible(true);
        } catch (Exception e) {
            log("Failed to get class loader. All content loading will now fail.");
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
            return;
        }

        List<File> contentPacks = proxy.getContentList(method, classloader);

        if (!event.getSide().equals(Side.CLIENT)) {
            //Gametypes (Server only)
            // TODO: gametype loader
        }

        getTypeFiles(contentPacks);

        for (EnumType type : EnumType.values()) {
            Class<? extends InfoType> typeClass = type.getTypeClass();
            for (TypeFile typeFile : TypeFile.files.get(type)) {
                try {
                    if (!(typeFile.lines.size() == 0)) {
                        InfoType infoType = (typeClass.getConstructor(TypeFile.class).newInstance(typeFile));
                        infoType.read(typeFile);
                        if (infoType.shortName != null) {
                            switch (type) {
                                case bullet:
                                    bulletItems.add((ItemBullet) new ItemBullet((BulletType) infoType).setUnlocalizedName(infoType.shortName));
                                    break;
                                case attachment:
                                    attachmentItems.add((ItemAttachment) new ItemAttachment((AttachmentType) infoType).setUnlocalizedName(infoType.shortName));
                                    break;
                                case gun:
                                    gunItems.add((ItemGun) new ItemGun((GunType) infoType).setUnlocalizedName(infoType.shortName));
                                    break;
                                case grenade:
                                    grenadeItems.add((ItemGrenade) new ItemGrenade((GrenadeType) infoType).setUnlocalizedName(infoType.shortName));
                                    break;
                                case part:
                                    partItems.add((ItemPart) new ItemPart((PartType) infoType).setUnlocalizedName(infoType.shortName));
                                    break;
                                case plane:
                                    planeItems.add((ItemPlane) new ItemPlane((PlaneType) infoType).setUnlocalizedName(infoType.shortName));
                                    break;
                                case vehicle:
                                    vehicleItems.add((ItemVehicle) new ItemVehicle((VehicleType) infoType).setUnlocalizedName(infoType.shortName));
                                    break;
                                case aa:
                                    aaGunItems.add((ItemAAGun) new ItemAAGun((AAGunType) infoType).setUnlocalizedName(infoType.shortName));
                                    break;
                                case mechaItem:
                                    mechaToolItems.add((ItemMechaAddon) new ItemMechaAddon((MechaItemType) infoType).setUnlocalizedName(infoType.shortName));
                                    break;
                                case mecha:
                                    mechaItems.add((ItemMecha) new ItemMecha((MechaType) infoType).setUnlocalizedName(infoType.shortName));
                                    break;
                                case tool:
                                    toolItems.add((ItemTool) new ItemTool((ToolType) infoType).setUnlocalizedName(infoType.shortName));
                                    break;
                                case box:
                                    gunBoxBlocks.add((BlockGunBox) new BlockGunBox((GunBoxType) infoType).setBlockName(infoType.shortName));
                                    break;
                                case armour:
                                    armourItems.add((ItemTeamArmour) new ItemTeamArmour((ArmourType) infoType).setUnlocalizedName(infoType.shortName));
                                    break;
                                case armourBox:
                                    armourBoxBlocks.add((BlockArmourBox) new BlockArmourBox((ArmourBoxType) infoType).setBlockName(infoType.shortName));
                                    break;
                                case playerClass:
                                case team:
                                    break;
                                default:
                                    log("Unrecognized type for " + infoType.shortName);
                                    break;
                            }
                            Sync.addHash(typeFile.lines.toString(), infoType.shortName);
                        }

                    }
                } catch (Exception e) {
                    log("Failed to add " + type.name() + " : " + typeFile.name);
                    if (FlansMod.printStackTrace) {
                        e.printStackTrace();
                    }
                }
            }
            log("Loaded " + type.name() + ".");
        }
        Sync.getUnifiedHash();
        log("Client Hash: " + Sync.getUnifiedHash());
        Team.spectators = spectators;
    }

    public static IGunboxDescriptionable getGunBoxItem(InfoType item) {
        if (item instanceof GunType) {
            for (ItemGun gitem : gunItems) {
                if (Objects.equals(gitem.type.shortName, item.shortName)) {
                    return gitem;
                }
            }
        } else if (item instanceof BulletType) {
            for (ItemBullet bitem : bulletItems) {
                if (Objects.equals(bitem.type.shortName, item.shortName)) {
                    return bitem;
                }
            }
        }

        return null;
    }

    public static PacketHandler getPacketHandler() {
        return packetHandler;
    }

    /** Sync common and client config if required */
    public static void syncConfig(Side side) {
        syncCommonConfig();

        if (side.isClient()) {
            syncClientConfig();
        }
    }

    /** Handles client/server common configuration */
    public static void syncCommonConfig() {
        //Teams/Advanced Settings
        printDebugLog = configFile.getBoolean("Print Debug Log", "Teams/advanced settings", printDebugLog, "");
        printStackTrace = configFile.getBoolean("Print Stack Trace", "Teams/advanced settings", printStackTrace, "");
        noticeSpawnKillTime = configFile.getInt("NoticeSpawnKillTime", "Teams/advanced settings", 10, 0, 600, "Min");
        TeamsManager.bulletSnapshotMin = configFile.getInt("BltSS_Min", "Teams/advanced settings", 0, 0, 1000, "Min");
        TeamsManager.bulletSnapshotDivisor = configFile.getInt("BltSS_Divisor", "Teams/advanced settings", 50, 0, 1000, "Divisor");

        //Server/Gameplay Settings (Server-client synced)
        enableKillMessages = configFile.getBoolean("enableKillMessages", "Gameplay Settings (synced)", enableKillMessages,"Enable killMessage display");
        gunCarryLimitEnable = configFile.getBoolean("gunCarryLimitEnable", "Gameplay Settings (synced)", gunCarryLimitEnable, "Enable a soft limit to hotbar weapons, applies slowness++ when >= limit");
        gunCarryLimit = configFile.getInt("gunCarryLimit", "Gameplay Settings (synced)", 3, 2, 9, "Set the soft carry limit for guns(2-9)");
        bulletGuiEnable = configFile.getBoolean("Enable bullet HUD", "Gameplay Settings (synced)", bulletGuiEnable, "Enable bullet gui");
        fancyBulletGui = configFile.getBoolean("Enable fancy bullet HUD", "Gameplay Settings (synced)", fancyBulletGui, "Enable fancy bullet gui");
        hitCrossHairEnable = configFile.getBoolean("Enable hitmarkers", "Gameplay Settings (synced)", hitCrossHairEnable, "");
        realisticRecoil = configFile.getBoolean("Enable realistic recoil", "Gameplay Settings (synced)", realisticRecoil, "Changes recoil to be more realistic.");
        enableSightDownwardMovement = configFile.getBoolean("Enable downward movement of the sight after shot", "Gameplay Settings (synced)", enableSightDownwardMovement, "Enable downward movement of the sight after shot.");
	    crosshairEnable = configFile.getBoolean("Enable crosshairs", "Gameplay Settings (synced)", crosshairEnable, "Enable default crosshair");
        breakableArmor = configFile.getInt("breakableArmor", "Gameplay Settings (synced)", 0, 0, 2, "0 = Non-breakable, 1 = All breakable, 2 = Refer to armor config");
        defaultArmorDurability = configFile.getInt("defaultArmorDurability", "Gameplay Settings (synced)", 500, 1, 10000, "Default durability if breakable = 1");
        addGunpowderRecipe = configFile.getBoolean("Gunpowder Recipe", "Gameplay Settings (synced)", addGunpowderRecipe, "Whether or not to add the extra gunpowder recipe (3 charcoal + 1 lightstone)");
        armourSpawnRate = configFile.getInt("ArmourSpawnRate", "Gameplay Settings (synced)", 20, 0, 100, "The rate of Zombie or Skeleton to spawn equipped with armor. [0=0%, 100=100%]");
        armourEnchantability = configFile.getInt("ArmourEnchantability", "Gameplay Settings (synced)", 0, 0, 25, "The quality of enchantments recieved for the same level of XP 0=UnEnchantable 25=Gold armor");
        kickNonMatchingHashes = configFile.getBoolean("KickNonMatchingHashes", "Gameplay Settings (synced)", kickNonMatchingHashes, "Wether to kick clients connected to a dedicated server with non-identical packs.");
        disableSprintHipFireByDefault = configFile.getBoolean("DisableSprintHipFireByDefault", "Gameplay Settings (synced)", disableSprintHipFireByDefault, "Wether to disallow players to fire the gun when sprinting and not aiming by default (content packs override).");
        useNewPenetrationSystem = configFile.getBoolean("UseNewPenetrationSystem", "Gameplay Settings (synced)", useNewPenetrationSystem, "Whether to use new penetration system (only content packs designed to work with this system will work as intended with this on).");
        gunsInDeadPartsWork = configFile.getBoolean("GunsInDeadPartsStillWork", "Gameplay Settings (synced)", gunsInDeadPartsWork, "Wether passenger guns should still work after the part of the vehicle they are on dies.");
        showDistanceInKillMessage = configFile.getBoolean("ShowDistanceInKillMessage", "Gameplay Settings (synced)", showDistanceInKillMessage, "List distance between killer and killed in kill message.");
        driveableHitboxes = configFile.getBoolean("Driveable hitboxes", "Gameplay Settings (synced)", driveableHitboxes, "Make a hitbox for the main driveable entity.");
        driveableUpdateRange = configFile.getFloat("Driveable update range", "Gameplay Settings (synced)", driveableUpdateRange, 0, 1000, "Range in blocks for vehicles and planes to be updated.");
        reloadOnRightClick = configFile.getBoolean("Reload on right click", "Gameplay Settings (synced)", reloadOnRightClick, "Whether to reload a gun using right click, forces use of R.");
        defaultADSSpreadMultiplier = configFile.getFloat("Default ADS Spread Modifier", "Gameplay Settings (synced)", defaultADSSpreadMultiplier, 0, 10, "Modifier for spread when the player is aiming.");
        defaultADSSpreadMultiplierShotgun = configFile.getFloat("Default ADS Spread Modifier (Shotguns)", "Gameplay Settings (synced)", defaultADSSpreadMultiplierShotgun, 0, 10, "Modifier for spread when the player is aiming. (Multishot guns only).");
        seatCollisions = configFile.getBoolean("Seat Collisions", "Gameplay Settings (synced)", seatCollisions, "Whether seats should collide with the world. Prevents plane glitching through walls.");
        showMuzzleFlashParticlesDefault = configFile.getBoolean("Muzzle Flash Particles Default (Synced)", "Gameplay Settings (synced)", showMuzzleFlashParticlesDefault, "Enable muzzle flash particles by default. Gun configs can override.");
        showFlashesWhenWounded = configFile.getBoolean("Flashes when player wounded (Synced)", "Gameplay Settings (synced)", showFlashesWhenWounded, "Should show red overlay when player has been wounded?");
        vehicleWheelSeatExplosionModifier = configFile.getFloat("Explosion Wheel,Seat modifier", "Gameplay Settings (synced)", vehicleWheelSeatExplosionModifier, 0, 1, "Proportion of damage from an explosion when it has hit a wheel or seat.");
        showPackNameInItemDescriptions = configFile.getBoolean("Show pack names in item descriptions", "Gameplay Settings (synced)", showPackNameInItemDescriptions, "Whether to include name of pack in the description for all items from that pack");
        masterDamageModifier = configFile.getFloat("Master Gun Damage Modifier", "Gameplay Settings (synced)", masterDamageModifier, 0, 100, "All gun damage will be modified by this amount");
        masterHeadshotModifier = configFile.getFloat("Headshot damage Modifier", "Gameplay Settings (synced)", masterHeadshotModifier, 0, 100, "All headshot damage will be modified by this amount");
        masterLegModifier = configFile.getFloat("Leg damage Modifier", "Gameplay Settings (synced)", masterLegModifier, 0, 100, "All leg damage will be modified by this amount");
        masterRecoilModifier = configFile.getFloat("Master Gun Recoil Modifier", "Gameplay Settings (synced)", masterRecoilModifier, 0, 100, "All gun recoil will be modified by this amount");
        masterDualWieldDisable = configFile.getBoolean("Master Dual-Wield Toggle", "Gameplay Settings (synced)", masterDualWieldDisable, "Force disable dual wielding for all weapons");
        gunDevMode = configFile.getBoolean("Enable Gun Dev Mode", "Gameplay Settings (synced)", gunDevMode, "This will allow guns to be loaded/used without having ammo in your inventory");
        nameTagRenderRange = configFile.getFloat("Name tag render range", "Gameplay Settings (synced)", nameTagRenderRange, 0, 1000, "Max distance from which name tags can be seen");
        nameTagSneakRenderRange = configFile.getFloat("Name tag sneaking render range", "Gameplay Settings (synced)", nameTagSneakRenderRange, 0, 1000, "Max distance from which name tags can be seen on sneaking players");
        maxHealth = configFile.getFloat("Max Health", "Gameplay Settings (synced)", maxHealth, 0.5F, 100F, "Maximum player health (20 = 10 hearts)");

        //Client Side Settings
        holdingGunsDisablesChests = configFile.getBoolean("Block Chests While Holding Guns", Configuration.CATEGORY_GENERAL, holdingGunsDisablesChests, "Stops right clicking from opening chests, furnaces, etc while holding a gun");
        holdingGunsDisablesAll = configFile.getBoolean("Block All Interactions While Holding Guns", Configuration.CATEGORY_GENERAL, holdingGunsDisablesAll, "Disable all block interactions while holding a gun");
        armsEnable = configFile.getBoolean("Enable Arms", Configuration.CATEGORY_GENERAL, armsEnable, "Enable arms rendering");
        casingEnable = configFile.getBoolean("Enable casings", Configuration.CATEGORY_GENERAL, casingEnable, "Enable bullet casing ejections");
        hdHitCrosshair = configFile.getBoolean("Enable HD hit marker", Configuration.CATEGORY_GENERAL, hdHitCrosshair, "");
        addAllPaintjobsToCreative = configFile.getBoolean("Add All Paintjobs To Creative", Configuration.CATEGORY_GENERAL, addAllPaintjobsToCreative, "Whether to list all available paintjobs in the Creative menu");
        fancyCrosshair = configFile.getBoolean("Fancy Crosshair", Configuration.CATEGORY_GENERAL, fancyCrosshair, "Change colour of crosshair based on hit. (Red = no penetration, green = full damage, light blue = headshot. Overrides normal colour settings.");
        for (int i = 0; i < hitCrossHairColor.length; i++) {
            final String[] COLOR = new String[]{"Alpha", "Red", "Green", "Blue"};
            hitCrossHairColor[i] = configFile.getFloat("HitCrossHairColor" + COLOR[i], Configuration.CATEGORY_GENERAL, hitCrossHairColor[i], 0.0F, 1.0F,
                    "Hit cross hair color " + COLOR[i]);
        }
        showItemDescriptions = configFile.getBoolean("Enable fancy descriptions", Configuration.CATEGORY_GENERAL, showItemDescriptions, "Whether to show fancy item descriptions. These can be shown by pressing shift on an item ingame.");

        if (configFile.hasChanged())
            configFile.save();
    }

    /** Handles client specific configuration */
    public static void syncClientConfig() {
        String aimTypeInput = configFile.getString("Aim Type", "Input Settings", "hold", "The type of aiming that you want to use 'toggle' or 'hold'");
        AimType aimType = AimType.fromString(aimTypeInput);

        if (aimType != null) {
            FlansModClient.aimType = aimType;
        } else {
            log(String.format("The aim type '%s' does not exist.", aimTypeInput));
            FlansModClient.aimType = AimType.TOGGLE;
        }

        String aimButtonInput = configFile.getString("Aim Button", "Input Settings", "right", "The mouse button used to aim a gun 'left' or 'right'");
        FlanMouseButton aimButtonType = FlanMouseButton.fromString(aimButtonInput);

        if (aimButtonType != null) {
            FlansModClient.aimButton = aimButtonType;
        } else {
            log(String.format("The aim button type '%s' does not exist.", aimTypeInput));
            FlansModClient.aimButton = FlanMouseButton.LEFT;
        }

        String shootButtonInput = configFile.getString("Fire Button", "Input Settings", "left", "The mouse button used to fire a gun 'left' or 'right'");
        FlanMouseButton shootButtonType = FlanMouseButton.fromString(shootButtonInput);

        if (shootButtonType != null) {
            FlansModClient.fireButton = shootButtonType;
        } else {
            log(String.format("The fire button type '%s' does not exist.", aimTypeInput));
            FlansModClient.fireButton = FlanMouseButton.RIGHT;
        }

        if (configFile.hasChanged())
            configFile.save();
    }

    public static void updateBltssConfig(int min, int divisor) {
        ConfigCategory category = configFile.getCategory(Configuration.CATEGORY_GENERAL);
        if (category == null) return;
        if (category.containsKey("BltSS_Min")) {
            category.get("BltSS_Min").set(min);
        }
        if (category.containsKey("BltSS_Divisor")) {
            category.get("BltSS_Divisor").set(divisor);
        }

        TeamsManager.bulletSnapshotMin = min;
        TeamsManager.bulletSnapshotDivisor = divisor;
        configFile.save();
    }

    public static void log(Object obj) {
        if (printDebugLog) {
            logger.info(obj.toString());
        }
    }

    public static void log(String format, Object... args) {
        log(String.format(format, args));
    }

    /**
     * Provides a location for a pack name.
     * <p>
     * For example:
     * <code>
     * FlansMod.registerModelLocation("ww2", "com.flansmod.client.model");
     * </code>
     * will set any model name prefixed with "ww2" to be loaded from "com.flansmod.client.model".
     *
     * @param name     Content package name.
     * @param location Fully qualified model location.
     */
    public static void registerModelLocation(String name, String location) {
        modelLocations.put(name, location);
    }

    public static String getModelLocation(String name) {
        return modelLocations.get(name);
    }
}

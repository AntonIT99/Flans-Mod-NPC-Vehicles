// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client;

import noppes.npcs.LogWriter;
import net.minecraft.client.entity.EntityPlayerSP;
import noppes.npcs.config.StringCache;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.particle.EntitySmokeFX;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import net.minecraft.client.particle.EntityFlameFX;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import noppes.npcs.client.renderer.NpcItemRenderer;
import net.minecraft.item.Item;
import net.minecraft.client.model.ModelBiped;
import java.util.Random;
import noppes.npcs.client.fx.EntityRainbowFX;
import noppes.npcs.client.fx.EntityEnderFX;
import noppes.npcs.ModelPartData;
import noppes.npcs.ModelData;
import net.minecraft.client.particle.EntityFX;
import noppes.npcs.client.fx.EntityElementalStaffFX;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.client.gui.player.companion.GuiNpcCompanionInv;
import noppes.npcs.containers.ContainerNPCCompanion;
import noppes.npcs.client.gui.player.companion.GuiNpcCompanionTalents;
import noppes.npcs.client.gui.player.companion.GuiNpcCompanionStats;
import noppes.npcs.client.gui.GuiNpcWaypoint;
import noppes.npcs.client.gui.GuiNpcMobSpawnerMounter;
import noppes.npcs.client.gui.GuiNpcMobSpawner;
import noppes.npcs.client.gui.GuiNpcRedstoneBlock;
import noppes.npcs.client.gui.player.GuiBigSign;
import noppes.npcs.client.gui.GuiBorderBlock;
import noppes.npcs.client.gui.GuiNpcDimension;
import noppes.npcs.client.gui.player.GuiCrate;
import noppes.npcs.containers.ContainerCrate;
import noppes.npcs.client.gui.GuiMerchantAdd;
import noppes.npcs.client.gui.player.GuiMailbox;
import noppes.npcs.client.gui.player.GuiMailmanWrite;
import noppes.npcs.containers.ContainerMail;
import noppes.npcs.client.gui.GuiNpcRemoteEditor;
import noppes.npcs.client.gui.roles.GuiNpcBankSetup;
import noppes.npcs.client.gui.roles.GuiNpcTransporter;
import noppes.npcs.client.gui.roles.GuiNpcTraderSetup;
import noppes.npcs.containers.ContainerNPCTraderSetup;
import noppes.npcs.client.gui.roles.GuiNpcItemGiver;
import noppes.npcs.containers.ContainerNpcItemGiver;
import noppes.npcs.client.gui.roles.GuiNpcFollowerSetup;
import noppes.npcs.containers.ContainerNPCFollowerSetup;
import noppes.npcs.client.gui.player.GuiNpcCarpentryBench;
import noppes.npcs.containers.ContainerCarpentryBench;
import noppes.npcs.client.gui.GuiScript;
import noppes.npcs.client.gui.player.GuiTransportSelection;
import noppes.npcs.client.gui.player.GuiNPCBankChest;
import noppes.npcs.containers.ContainerNPCBankInterface;
import noppes.npcs.client.gui.player.GuiNPCTrader;
import noppes.npcs.containers.ContainerNPCTrader;
import noppes.npcs.client.gui.player.GuiNpcFollower;
import noppes.npcs.containers.ContainerNPCFollower;
import noppes.npcs.client.gui.player.GuiNpcFollowerHire;
import noppes.npcs.containers.ContainerNPCFollowerHire;
import noppes.npcs.client.gui.mainmenu.GuiNpcAI;
import noppes.npcs.client.gui.mainmenu.GuiNPCGlobalMainMenu;
import noppes.npcs.client.gui.global.GuiNPCManageBanks;
import noppes.npcs.containers.ContainerManageBanks;
import noppes.npcs.client.gui.global.GuiNPCManageQuest;
import noppes.npcs.client.gui.global.GuiNPCManageDialogs;
import noppes.npcs.client.gui.global.GuiNpcManageRecipes;
import noppes.npcs.containers.ContainerManageRecipes;
import noppes.npcs.client.gui.global.GuiNPCManageTransporters;
import noppes.npcs.client.gui.global.GuiNPCManageLinkedNpc;
import noppes.npcs.client.gui.global.GuiNPCManageFactions;
import noppes.npcs.client.gui.GuiNpcPather;
import noppes.npcs.client.gui.questtypes.GuiNpcQuestTypeItem;
import noppes.npcs.containers.ContainerNpcQuestTypeItem;
import noppes.npcs.client.gui.global.GuiNpcQuestReward;
import noppes.npcs.containers.ContainerNpcQuestReward;
import noppes.npcs.client.gui.mainmenu.GuiNpcAdvanced;
import noppes.npcs.client.gui.mainmenu.GuiNPCInv;
import noppes.npcs.containers.ContainerNPCInv;
import noppes.npcs.client.gui.mainmenu.GuiNpcStats;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import noppes.npcs.client.gui.mainmenu.GuiNpcDisplay;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.inventory.Container;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.constants.EnumGuiType;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.resources.IReloadableResourceManager;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import tconstruct.client.tabs.InventoryTabQuests;
import tconstruct.client.tabs.InventoryTabFactions;
import tconstruct.client.tabs.AbstractTab;
import tconstruct.client.tabs.InventoryTabVanilla;
import tconstruct.client.tabs.TabRegistry;
import net.minecraftforge.common.MinecraftForge;
import noppes.npcs.client.controllers.ClientCloneController;
import noppes.npcs.client.controllers.PresetController;
import net.minecraft.client.Minecraft;
import noppes.npcs.client.renderer.blocks.BlockBloodRenderer;
import noppes.npcs.client.renderer.blocks.BlockPedestalRenderer;
import noppes.npcs.blocks.tiles.TilePedestal;
import noppes.npcs.client.renderer.blocks.BlockBookRenderer;
import noppes.npcs.blocks.tiles.TileBook;
import noppes.npcs.client.renderer.blocks.BlockBeamRenderer;
import noppes.npcs.blocks.tiles.TileBeam;
import noppes.npcs.client.renderer.blocks.BlockSignRenderer;
import noppes.npcs.blocks.tiles.TileSign;
import noppes.npcs.client.renderer.blocks.BlockShelfRenderer;
import noppes.npcs.blocks.tiles.TileShelf;
import noppes.npcs.client.renderer.blocks.BlockTombstoneRenderer;
import noppes.npcs.blocks.tiles.TileTombstone;
import noppes.npcs.client.renderer.blocks.BlockCampfireRenderer;
import noppes.npcs.blocks.tiles.TileCampfire;
import noppes.npcs.client.renderer.blocks.BlockBarrelRenderer;
import noppes.npcs.blocks.tiles.TileBarrel;
import noppes.npcs.client.renderer.blocks.BlockBigSignRenderer;
import noppes.npcs.blocks.tiles.TileBigSign;
import noppes.npcs.client.renderer.blocks.BlockStoolRenderer;
import noppes.npcs.blocks.tiles.TileStool;
import noppes.npcs.client.renderer.blocks.BlockLampRenderer;
import noppes.npcs.blocks.tiles.TileLamp;
import noppes.npcs.client.renderer.blocks.BlockCandleRenderer;
import noppes.npcs.blocks.tiles.TileCandle;
import noppes.npcs.client.renderer.blocks.BlockTableRenderer;
import noppes.npcs.blocks.tiles.TileTable;
import noppes.npcs.client.renderer.blocks.BlockCouchWoodRenderer;
import noppes.npcs.blocks.tiles.TileCouchWood;
import noppes.npcs.client.renderer.blocks.BlockCouchWoolRenderer;
import noppes.npcs.blocks.tiles.TileCouchWool;
import noppes.npcs.client.renderer.blocks.BlockCrateRenderer;
import noppes.npcs.blocks.tiles.TileCrate;
import noppes.npcs.client.renderer.blocks.BlockWeaponRackRenderer;
import noppes.npcs.blocks.tiles.TileWeaponRack;
import noppes.npcs.client.renderer.blocks.BlockChairRenderer;
import noppes.npcs.blocks.tiles.TileChair;
import noppes.npcs.client.renderer.blocks.BlockTallLampRenderer;
import noppes.npcs.blocks.tiles.TileTallLamp;
import noppes.npcs.client.renderer.blocks.BlockWallBannerRenderer;
import noppes.npcs.blocks.tiles.TileWallBanner;
import noppes.npcs.client.renderer.blocks.BlockBannerRenderer;
import noppes.npcs.blocks.tiles.TileBanner;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import noppes.npcs.client.renderer.blocks.BlockBorderRenderer;
import noppes.npcs.client.renderer.blocks.BlockMailboxRenderer;
import noppes.npcs.blocks.tiles.TileMailbox;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import noppes.npcs.client.renderer.blocks.BlockCarpentryBenchRenderer;
import noppes.npcs.blocks.tiles.TileBlockAnvil;
import cpw.mods.fml.common.FMLCommonHandler;
import noppes.npcs.client.model.ModelNPCMale;
import noppes.npcs.client.renderer.RenderNPCHumanMale;
import noppes.npcs.client.model.ModelNPCGolem;
import noppes.npcs.entity.EntityNPCGolem;
import noppes.npcs.client.renderer.RenderCustomNpc;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.client.renderer.RenderProjectile;
import noppes.npcs.entity.EntityProjectile;
import noppes.npcs.client.renderer.RenderNpcSlime;
import noppes.npcs.client.model.ModelNpcSlime;
import noppes.npcs.entity.EntityNpcSlime;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.renderer.RenderNpcDragon;
import noppes.npcs.client.model.ModelNpcDragon;
import noppes.npcs.entity.EntityNpcDragon;
import noppes.npcs.client.renderer.RenderNpcCrystal;
import noppes.npcs.client.model.ModelNpcCrystal;
import noppes.npcs.entity.EntityNpcCrystal;
import net.minecraft.client.renderer.entity.Render;
import cpw.mods.fml.client.registry.RenderingRegistry;
import noppes.npcs.client.renderer.RenderNPCPony;
import noppes.npcs.entity.EntityNpcPony;
import noppes.npcs.client.controllers.MusicController;
import noppes.npcs.PacketHandlerPlayer;
import noppes.npcs.CustomNpcs;
import noppes.npcs.client.model.ModelSkirtArmor;
import net.minecraft.client.settings.KeyBinding;
import noppes.npcs.CommonProxy;

public class ClientProxy extends CommonProxy
{
    public static KeyBinding QuestLog;
    public static FontContainer Font;
    private ModelSkirtArmor model;
    
    public ClientProxy() {
        this.model = new ModelSkirtArmor();
    }
    
    @Override
    public void load() {
        ClientProxy.Font = new FontContainer(CustomNpcs.FontType, CustomNpcs.FontSize);
        this.createFolders();
        CustomNpcs.Channel.register((Object)new PacketHandlerClient());
        CustomNpcs.ChannelPlayer.register((Object)new PacketHandlerPlayer());
        new MusicController();
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityNpcPony.class, (Render)new RenderNPCPony());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityNpcCrystal.class, (Render)new RenderNpcCrystal(new ModelNpcCrystal(0.5f)));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityNpcDragon.class, (Render)new RenderNpcDragon(new ModelNpcDragon(0.0f), 0.5f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityNpcSlime.class, (Render)new RenderNpcSlime(new ModelNpcSlime(16), new ModelNpcSlime(0), 0.25f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityProjectile.class, (Render)new RenderProjectile());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityCustomNpc.class, (Render)new RenderCustomNpc());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityNPCGolem.class, (Render)new RenderNPCHumanMale(new ModelNPCGolem(0.0f), new ModelNPCGolem(1.0f), new ModelNPCGolem(0.5f)));
        FMLCommonHandler.instance().bus().register((Object)new ClientTickHandler());
        ClientRegistry.bindTileEntitySpecialRenderer((Class)TileBlockAnvil.class, (TileEntitySpecialRenderer)new BlockCarpentryBenchRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer((Class)TileMailbox.class, (TileEntitySpecialRenderer)new BlockMailboxRenderer());
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)new BlockBorderRenderer());
        if (!CustomNpcs.DisableExtraBlock) {
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileBanner.class, (TileEntitySpecialRenderer)new BlockBannerRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileWallBanner.class, (TileEntitySpecialRenderer)new BlockWallBannerRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileTallLamp.class, (TileEntitySpecialRenderer)new BlockTallLampRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileChair.class, (TileEntitySpecialRenderer)new BlockChairRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileWeaponRack.class, (TileEntitySpecialRenderer)new BlockWeaponRackRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileCrate.class, (TileEntitySpecialRenderer)new BlockCrateRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileCouchWool.class, (TileEntitySpecialRenderer)new BlockCouchWoolRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileCouchWood.class, (TileEntitySpecialRenderer)new BlockCouchWoodRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileTable.class, (TileEntitySpecialRenderer)new BlockTableRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileCandle.class, (TileEntitySpecialRenderer)new BlockCandleRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileLamp.class, (TileEntitySpecialRenderer)new BlockLampRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileStool.class, (TileEntitySpecialRenderer)new BlockStoolRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileBigSign.class, (TileEntitySpecialRenderer)new BlockBigSignRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileBarrel.class, (TileEntitySpecialRenderer)new BlockBarrelRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileCampfire.class, (TileEntitySpecialRenderer)new BlockCampfireRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileTombstone.class, (TileEntitySpecialRenderer)new BlockTombstoneRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileShelf.class, (TileEntitySpecialRenderer)new BlockShelfRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileSign.class, (TileEntitySpecialRenderer)new BlockSignRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileBeam.class, (TileEntitySpecialRenderer)new BlockBeamRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TileBook.class, (TileEntitySpecialRenderer)new BlockBookRenderer());
            ClientRegistry.bindTileEntitySpecialRenderer((Class)TilePedestal.class, (TileEntitySpecialRenderer)new BlockPedestalRenderer());
            RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)new BlockBloodRenderer());
        }
        final Minecraft mc = Minecraft.getMinecraft();
        ClientRegistry.registerKeyBinding(ClientProxy.QuestLog = new KeyBinding("Quest Log", 38, "key.categories.gameplay"));
        mc.gameSettings.loadOptions();
        new PresetController(CustomNpcs.Dir);
        if (CustomNpcs.EnableUpdateChecker) {
            final VersionChecker checker = new VersionChecker();
            checker.start();
        }
        ClientCloneController.Instance = new ClientCloneController();
        MinecraftForge.EVENT_BUS.register((Object)new ClientEventHandler());
        if (CustomNpcs.InventoryGuiEnabled) {
            MinecraftForge.EVENT_BUS.register((Object)new TabRegistry());
            if (TabRegistry.getTabList().size() < 2) {
                TabRegistry.registerTab(new InventoryTabVanilla());
            }
            TabRegistry.registerTab(new InventoryTabFactions());
            TabRegistry.registerTab(new InventoryTabQuests());
        }
    }
    
    private void createFolders() {
        final File file = new File(CustomNpcs.Dir, "assets/customnpcs");
        if (!file.exists()) {
            file.mkdirs();
        }
        File check = new File(file, "sounds");
        if (!check.exists()) {
            check.mkdir();
        }
        final File json = new File(file, "sounds.json");
        if (!json.exists()) {
            try {
                json.createNewFile();
                final BufferedWriter writer = new BufferedWriter(new FileWriter(json));
                writer.write("{\n\n}");
                writer.close();
            }
            catch (IOException ex) {}
        }
        check = new File(file, "textures");
        if (!check.exists()) {
            check.mkdir();
        }
        final File cache = new File(check, "cache");
        if (!cache.exists()) {
            cache.mkdir();
        }
        ((IReloadableResourceManager)Minecraft.getMinecraft().getResourceManager()).registerReloadListener((IResourceManagerReloadListener)new CustomNpcResourceListener());
    }
    
    @Override
    public Object getClientGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
        if (ID > EnumGuiType.values().length) {
            return null;
        }
        final EnumGuiType gui = EnumGuiType.values()[ID];
        final EntityNPCInterface npc = NoppesUtil.getLastNpc();
        final Container container = this.getContainer(gui, player, x, y, z, npc);
        return this.getGui(npc, gui, container, x, y, z);
    }
    
    private GuiScreen getGui(final EntityNPCInterface npc, final EnumGuiType gui, final Container container, final int x, final int y, final int z) {
        if (gui == EnumGuiType.MainMenuDisplay) {
            if (npc != null) {
                return new GuiNpcDisplay(npc);
            }
            Minecraft.getMinecraft().thePlayer.addChatMessage((IChatComponent)new ChatComponentText("Unable to find npc"));
        }
        else {
            if (gui == EnumGuiType.MainMenuStats) {
                return new GuiNpcStats(npc);
            }
            if (gui == EnumGuiType.MainMenuInv) {
                return (GuiScreen)new GuiNPCInv(npc, (ContainerNPCInv)container);
            }
            if (gui == EnumGuiType.MainMenuAdvanced) {
                return new GuiNpcAdvanced(npc);
            }
            if (gui == EnumGuiType.QuestReward) {
                return (GuiScreen)new GuiNpcQuestReward(npc, (ContainerNpcQuestReward)container);
            }
            if (gui == EnumGuiType.QuestItem) {
                return (GuiScreen)new GuiNpcQuestTypeItem(npc, (ContainerNpcQuestTypeItem)container);
            }
            if (gui == EnumGuiType.MovingPath) {
                return new GuiNpcPather(npc);
            }
            if (gui == EnumGuiType.ManageFactions) {
                return new GuiNPCManageFactions(npc);
            }
            if (gui == EnumGuiType.ManageLinked) {
                return new GuiNPCManageLinkedNpc(npc);
            }
            if (gui == EnumGuiType.ManageTransport) {
                return new GuiNPCManageTransporters(npc);
            }
            if (gui == EnumGuiType.ManageRecipes) {
                return (GuiScreen)new GuiNpcManageRecipes(npc, (ContainerManageRecipes)container);
            }
            if (gui == EnumGuiType.ManageDialogs) {
                return new GuiNPCManageDialogs(npc);
            }
            if (gui == EnumGuiType.ManageQuests) {
                return new GuiNPCManageQuest(npc);
            }
            if (gui == EnumGuiType.ManageBanks) {
                return (GuiScreen)new GuiNPCManageBanks(npc, (ContainerManageBanks)container);
            }
            if (gui == EnumGuiType.MainMenuGlobal) {
                return new GuiNPCGlobalMainMenu(npc);
            }
            if (gui == EnumGuiType.MainMenuAI) {
                return new GuiNpcAI(npc);
            }
            if (gui == EnumGuiType.PlayerFollowerHire) {
                return (GuiScreen)new GuiNpcFollowerHire(npc, (ContainerNPCFollowerHire)container);
            }
            if (gui == EnumGuiType.PlayerFollower) {
                return (GuiScreen)new GuiNpcFollower(npc, (ContainerNPCFollower)container);
            }
            if (gui == EnumGuiType.PlayerTrader) {
                return (GuiScreen)new GuiNPCTrader(npc, (ContainerNPCTrader)container);
            }
            if (gui == EnumGuiType.PlayerBankSmall || gui == EnumGuiType.PlayerBankUnlock || gui == EnumGuiType.PlayerBankUprade || gui == EnumGuiType.PlayerBankLarge) {
                return (GuiScreen)new GuiNPCBankChest(npc, (ContainerNPCBankInterface)container);
            }
            if (gui == EnumGuiType.PlayerTransporter) {
                return new GuiTransportSelection(npc);
            }
            if (gui == EnumGuiType.Script) {
                return new GuiScript(npc);
            }
            if (gui == EnumGuiType.PlayerAnvil) {
                return (GuiScreen)new GuiNpcCarpentryBench((ContainerCarpentryBench)container);
            }
            if (gui == EnumGuiType.SetupFollower) {
                return (GuiScreen)new GuiNpcFollowerSetup(npc, (ContainerNPCFollowerSetup)container);
            }
            if (gui == EnumGuiType.SetupItemGiver) {
                return (GuiScreen)new GuiNpcItemGiver(npc, (ContainerNpcItemGiver)container);
            }
            if (gui == EnumGuiType.SetupTrader) {
                return (GuiScreen)new GuiNpcTraderSetup(npc, (ContainerNPCTraderSetup)container);
            }
            if (gui == EnumGuiType.SetupTransporter) {
                return new GuiNpcTransporter(npc);
            }
            if (gui == EnumGuiType.SetupBank) {
                return new GuiNpcBankSetup(npc);
            }
            if (gui == EnumGuiType.NpcRemote && Minecraft.getMinecraft().currentScreen == null) {
                return new GuiNpcRemoteEditor();
            }
            if (gui == EnumGuiType.PlayerMailman) {
                return (GuiScreen)new GuiMailmanWrite((ContainerMail)container, x == 1, y == 1);
            }
            if (gui == EnumGuiType.PlayerMailbox) {
                return new GuiMailbox();
            }
            if (gui == EnumGuiType.MerchantAdd) {
                return (GuiScreen)new GuiMerchantAdd();
            }
            if (gui == EnumGuiType.Crate) {
                return (GuiScreen)new GuiCrate((ContainerCrate)container);
            }
            if (gui == EnumGuiType.NpcDimensions) {
                return new GuiNpcDimension();
            }
            if (gui == EnumGuiType.Border) {
                return new GuiBorderBlock(x, y, z);
            }
            if (gui == EnumGuiType.BigSign) {
                return new GuiBigSign(x, y, z);
            }
            if (gui == EnumGuiType.RedstoneBlock) {
                return new GuiNpcRedstoneBlock(x, y, z);
            }
            if (gui == EnumGuiType.MobSpawner) {
                return new GuiNpcMobSpawner(x, y, z);
            }
            if (gui == EnumGuiType.MobSpawnerMounter) {
                return new GuiNpcMobSpawnerMounter(x, y, z);
            }
            if (gui == EnumGuiType.Waypoint) {
                return new GuiNpcWaypoint(x, y, z);
            }
            if (gui == EnumGuiType.Companion) {
                return new GuiNpcCompanionStats(npc);
            }
            if (gui == EnumGuiType.CompanionTalent) {
                return new GuiNpcCompanionTalents(npc);
            }
            if (gui == EnumGuiType.CompanionInv) {
                return (GuiScreen)new GuiNpcCompanionInv(npc, (ContainerNPCCompanion)container);
            }
        }
        return null;
    }
    
    @Override
    public void openGui(final int i, final int j, final int k, final EnumGuiType gui, final EntityPlayer player) {
        final Minecraft minecraft = Minecraft.getMinecraft();
        if (minecraft.thePlayer != player) {
            return;
        }
        final GuiScreen guiscreen = this.getGui(null, gui, null, i, j, k);
        if (guiscreen != null) {
            minecraft.displayGuiScreen(guiscreen);
        }
    }
    
    @Override
    public void openGui(final EntityNPCInterface npc, final EnumGuiType gui) {
        this.openGui(npc, gui, 0, 0, 0);
    }
    
    @Override
    public void openGui(final EntityNPCInterface npc, final EnumGuiType gui, final int x, final int y, final int z) {
        final Minecraft minecraft = Minecraft.getMinecraft();
        final Container container = this.getContainer(gui, (EntityPlayer)minecraft.thePlayer, x, y, z, npc);
        final GuiScreen guiscreen = this.getGui(npc, gui, container, x, y, z);
        if (guiscreen != null) {
            minecraft.displayGuiScreen(guiscreen);
        }
    }
    
    @Override
    public void openGui(final EntityPlayer player, final Object guiscreen) {
        final Minecraft minecraft = Minecraft.getMinecraft();
        if (!player.worldObj.isRemote || !(guiscreen instanceof GuiScreen)) {
            return;
        }
        if (guiscreen != null) {
            minecraft.displayGuiScreen((GuiScreen)guiscreen);
        }
    }
    
    @Override
    public void spawnParticle(final EntityLivingBase player, final String string, final Object... ob) {
        if (string.equals("Spell")) {
            final int color = (Integer) ob[0];
            for (int number = (Integer) ob[1], i = 0; i < number; ++i) {
                final Random rand = player.worldObj.rand;
                final double x = (rand.nextDouble() - 0.5) * player.width;
                final double y = player.getEyeHeight();
                final double z = (rand.nextDouble() - 0.5) * player.width;
                final double f = (rand.nextDouble() - 0.5) * 2.0;
                final double f2 = -rand.nextDouble();
                final double f3 = (rand.nextDouble() - 0.5) * 2.0;
                Minecraft.getMinecraft().effectRenderer.addEffect((EntityFX)new EntityElementalStaffFX(player, x, y, z, f, f2, f3, color));
            }
        }
        else if (string.equals("ModelData")) {
            final ModelData data = (ModelData)ob[0];
            final ModelPartData particles = (ModelPartData)ob[1];
            final EntityCustomNpc npc = (EntityCustomNpc)player;
            final Minecraft minecraft = Minecraft.getMinecraft();
            final double height = npc.getYOffset() + data.getBodyY();
            final Random rand2 = npc.getRNG();
            if (particles.type == 0) {
                for (int j = 0; j < 2; ++j) {
                    final EntityEnderFX fx = new EntityEnderFX(npc, (rand2.nextDouble() - 0.5) * player.width, rand2.nextDouble() * player.height - height - 0.25, (rand2.nextDouble() - 0.5) * player.width, (rand2.nextDouble() - 0.5) * 2.0, -rand2.nextDouble(), (rand2.nextDouble() - 0.5) * 2.0, particles);
                    minecraft.effectRenderer.addEffect((EntityFX)fx);
                }
            }
            else if (particles.type == 1) {
                for (int j = 0; j < 2; ++j) {
                    final double x2 = player.posX + (rand2.nextDouble() - 0.5) * 0.9;
                    final double y2 = player.posY + rand2.nextDouble() * 1.9 - 0.25 - height;
                    final double z2 = player.posZ + (rand2.nextDouble() - 0.5) * 0.9;
                    final double f4 = (rand2.nextDouble() - 0.5) * 2.0;
                    final double f5 = -rand2.nextDouble();
                    final double f6 = (rand2.nextDouble() - 0.5) * 2.0;
                    minecraft.effectRenderer.addEffect((EntityFX)new EntityRainbowFX(player.worldObj, x2, y2, z2, f4, f5, f6));
                }
            }
        }
    }
    
    @Override
    public ModelBiped getSkirtModel() {
        return this.model;
    }
    
    @Override
    public boolean hasClient() {
        return true;
    }
    
    @Override
    public EntityPlayer getPlayer() {
        return (EntityPlayer)Minecraft.getMinecraft().thePlayer;
    }
    
    @Override
    public void registerItem(final Item item) {
        MinecraftForgeClient.registerItemRenderer(item, (IItemRenderer)new NpcItemRenderer());
    }
    
    public static void bindTexture(final ResourceLocation location) {
        try {
            if (location == null) {
                return;
            }
            final TextureManager texturemanager = Minecraft.getMinecraft().getTextureManager();
            if (location != null) {
                texturemanager.bindTexture(location);
            }
        }
        catch (NullPointerException ex) {}
        catch (ReportedException ex2) {}
    }
    
    @Override
    public void spawnParticle(final String particle, final double x, final double y, final double z, final double motionX, final double motionY, final double motionZ, final float scale) {
        final RenderGlobal render = Minecraft.getMinecraft().renderGlobal;
        final EntityFX fx = render.doSpawnParticle(particle, x, y, z, motionX, motionY, motionZ);
        if (fx == null) {
            return;
        }
        if (particle.equals("flame")) {
            ObfuscationReflectionHelper.setPrivateValue((Class)EntityFlameFX.class, (Object)fx, (Object)scale, 0);
        }
        else if (particle.equals("smoke")) {
            ObfuscationReflectionHelper.setPrivateValue((Class)EntitySmokeFX.class, (Object)fx, (Object)scale, 0);
        }
    }
    
    public static class FontContainer
    {
        private StringCache textFont;
        public boolean useCustomFont;
        
        private FontContainer() {
            this.textFont = null;
            this.useCustomFont = true;
        }
        
        public FontContainer(final String fontType, final int fontSize) {
            this.textFont = null;
            this.useCustomFont = true;
            (this.textFont = new StringCache()).setDefaultFont("Arial", fontSize, true);
            this.useCustomFont = !fontType.equalsIgnoreCase("minecraft");
            try {
                if (!this.useCustomFont || fontType.isEmpty() || fontType.equalsIgnoreCase("default")) {
                    this.textFont.setCustomFont(new ResourceLocation("customnpcs", "OpenSans.ttf"), fontSize, true);
                }
                else {
                    this.textFont.setDefaultFont(fontType, fontSize, true);
                }
            }
            catch (Exception e) {
                LogWriter.info("Failed loading font so using Arial");
            }
        }
        
        public int height() {
            if (this.useCustomFont) {
                return this.textFont.fontHeight;
            }
            return Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT;
        }
        
        public int width(final String text) {
            if (this.useCustomFont) {
                return this.textFont.getStringWidth(text);
            }
            return Minecraft.getMinecraft().fontRenderer.getStringWidth(text);
        }
        
        public FontContainer copy() {
            final FontContainer font = new FontContainer();
            font.textFont = this.textFont;
            font.useCustomFont = this.useCustomFont;
            return font;
        }
        
        public void drawString(final String text, final int x, final int y, final int color) {
            if (this.useCustomFont) {
                this.textFont.renderString(text, x, y, color, true);
                this.textFont.renderString(text, x, y, color, false);
            }
            else {
                Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(text, x, y, color);
            }
        }
        
        public String getName() {
            if (!this.useCustomFont) {
                return "Minecraft";
            }
            return this.textFont.usedFont().getFontName();
        }
    }
}

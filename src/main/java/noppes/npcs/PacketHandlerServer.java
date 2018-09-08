// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import noppes.npcs.controllers.PlayerData;
import noppes.npcs.controllers.PlayerDataController;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.entity.EntityList;
import java.util.Set;
import noppes.npcs.controllers.TransportLocation;
import noppes.npcs.controllers.DialogOption;
import net.minecraft.entity.Entity;
import java.util.Iterator;
import foxz.utils.Market;
import noppes.npcs.roles.RoleTrader;
import noppes.npcs.containers.ContainerMail;
import noppes.npcs.controllers.PlayerMail;
import noppes.npcs.entity.EntityCustomNpc;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.network.PacketBuffer;
import net.minecraft.entity.passive.EntityVillager;
import noppes.npcs.constants.EnumCompanionStage;
import noppes.npcs.roles.RoleCompanion;
import net.minecraft.command.ICommandSender;
import noppes.npcs.controllers.ServerCloneController;
import noppes.npcs.roles.JobSpawner;
import noppes.npcs.constants.EnumJobType;
import noppes.npcs.constants.EnumPlayerData;
import noppes.npcs.roles.RoleTransporter;
import noppes.npcs.constants.EnumRoleType;
import noppes.npcs.controllers.TransportController;
import noppes.npcs.controllers.SpawnData;
import noppes.npcs.controllers.SpawnController;
import noppes.npcs.controllers.RecipeCarpentry;
import noppes.npcs.controllers.RecipeController;
import noppes.npcs.constants.EnumGuiType;
import noppes.npcs.controllers.Bank;
import noppes.npcs.controllers.BankController;
import java.util.ArrayList;
import noppes.npcs.controllers.LinkedNpcController;
import noppes.npcs.controllers.Faction;
import net.minecraft.tileentity.TileEntity;
import noppes.npcs.controllers.FactionController;
import noppes.npcs.controllers.QuestCategory;
import noppes.npcs.controllers.QuestController;
import noppes.npcs.controllers.Quest;
import noppes.npcs.controllers.DialogCategory;
import noppes.npcs.controllers.Dialog;
import noppes.npcs.controllers.DialogController;
import java.util.List;
import java.io.IOException;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.WorldServer;
import net.minecraft.world.WorldProvider;
import net.minecraft.server.MinecraftServer;
import java.util.Map;
import net.minecraftforge.common.DimensionManager;
import java.util.HashMap;
import noppes.npcs.constants.EnumPacketClient;
import net.minecraft.nbt.NBTBase;
import noppes.npcs.controllers.ScriptController;
import net.minecraft.nbt.NBTTagCompound;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.item.ItemStack;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import noppes.npcs.constants.EnumPacketServer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.NetHandlerPlayServer;
import cpw.mods.fml.common.network.FMLNetworkEvent;

public class PacketHandlerServer
{
    @SubscribeEvent
    public void onServerPacket(final FMLNetworkEvent.ServerCustomPacketEvent event) {
        final EntityPlayerMP player = ((NetHandlerPlayServer)event.handler).playerEntity;
        if (CustomNpcs.OpsOnly && !NoppesUtilServer.isOp((EntityPlayer)player)) {
            this.warn((EntityPlayer)player, "tried to use custom npcs without being an op");
            return;
        }
        final ByteBuf buffer = event.packet.payload();
        EnumPacketServer type = null;
        try {
            type = EnumPacketServer.values()[buffer.readInt()];
            final ItemStack item = player.inventory.getCurrentItem();
            final EntityNPCInterface npc = NoppesUtilServer.getEditingNpc((EntityPlayer)player);
            if (!type.needsNpc || npc != null) {
                if (type.hasPermission()) {
                    final CustomNpcsPermissions instance = CustomNpcsPermissions.Instance;
                    if (!CustomNpcsPermissions.hasPermission((EntityPlayer)player, type.permission)) {
                        return;
                    }
                }
                if (item == null) {
                    this.warn((EntityPlayer)player, "tried to use custom npcs without a tool in hand, probably a hacker");
                }
                else if (item.getItem() == CustomItems.wand) {
                    this.wandPackets(type, buffer, player, npc);
                }
                else if (item.getItem() == CustomItems.moving) {
                    this.movingPackets(type, buffer, player, npc);
                }
                else if (item.getItem() == CustomItems.mount) {
                    this.mountPackets(type, buffer, player);
                }
                else if (item.getItem() == CustomItems.cloner) {
                    this.clonePackets(type, buffer, player);
                }
                else if (item.getItem() == CustomItems.teleporter) {
                    this.featherPackets(type, buffer, player);
                }
                else if (item.getItem() == CustomItems.scripter) {
                    this.scriptPackets(type, buffer, player, npc);
                }
                else if (item.getItem() == Item.getItemFromBlock(CustomItems.waypoint) || item.getItem() == Item.getItemFromBlock(CustomItems.border) || item.getItem() == Item.getItemFromBlock(CustomItems.redstoneBlock)) {
                    this.blockPackets(type, buffer, player);
                }
            }
        }
        catch (Exception e) {
            LogWriter.error("Error with EnumPacketServer." + type, e);
        }
    }
    
    private void scriptPackets(final EnumPacketServer type, final ByteBuf buffer, final EntityPlayerMP player, final EntityNPCInterface npc) throws Exception {
        if (type == EnumPacketServer.ScriptDataSave) {
            npc.script.readFromNBT(Server.readNBT(buffer));
            npc.updateAI = true;
            npc.script.hasInited = false;
        }
        else if (type == EnumPacketServer.ScriptDataGet) {
            final NBTTagCompound compound = npc.script.writeToNBT(new NBTTagCompound());
            compound.setTag("Languages", (NBTBase)ScriptController.Instance.nbtLanguages());
            Server.sendData(player, EnumPacketClient.GUI_DATA, compound);
        }
    }
    
    private void featherPackets(final EnumPacketServer type, final ByteBuf buffer, final EntityPlayerMP player) throws IOException {
        if (type == EnumPacketServer.DimensionsGet) {
            final HashMap<String, Integer> map = new HashMap<String, Integer>();
            for (final int id : DimensionManager.getStaticDimensionIDs()) {
                final WorldProvider provider = DimensionManager.createProviderFor(id);
                map.put(provider.getDimensionName(), id);
            }
            NoppesUtilServer.sendScrollData(player, map);
        }
        else if (type == EnumPacketServer.DimensionTeleport) {
            final int dimension = buffer.readInt();
            final WorldServer world = MinecraftServer.getServer().worldServerForDimension(dimension);
            ChunkCoordinates coords = world.getEntrancePortalLocation();
            if (coords == null) {
                coords = world.getSpawnPoint();
                if (!world.isAirBlock(coords.posX, coords.posY, coords.posZ)) {
                    coords.posY = world.getTopSolidOrLiquidBlock(coords.posX, coords.posZ);
                }
                else {
                    while (world.isAirBlock(coords.posX, coords.posY - 1, coords.posZ) && coords.posY > 0) {
                        final ChunkCoordinates chunkCoordinates = coords;
                        --chunkCoordinates.posY;
                    }
                    if (coords.posY == 0) {
                        coords.posY = world.getTopSolidOrLiquidBlock(coords.posX, coords.posZ);
                    }
                }
            }
            NoppesUtilPlayer.teleportPlayer(player, coords.posX, coords.posY, coords.posZ, dimension);
        }
    }
    
    private void movingPackets(final EnumPacketServer type, final ByteBuf buffer, final EntityPlayerMP player, final EntityNPCInterface npc) throws IOException {
        if (type == EnumPacketServer.MovingPathGet) {
            Server.sendData(player, EnumPacketClient.GUI_DATA, npc.ai.writeToNBT(new NBTTagCompound()));
        }
        else if (type == EnumPacketServer.MovingPathSave) {
            npc.ai.setMovingPath(NBTTags.getIntegerArraySet(Server.readNBT(buffer).getTagList("MovingPathNew", 10)));
        }
    }
    
    private void blockPackets(final EnumPacketServer type, final ByteBuf buffer, final EntityPlayerMP player) throws IOException {
        if (type == EnumPacketServer.SaveTileEntity) {
            NoppesUtilServer.saveTileEntity(player, Server.readNBT(buffer));
        }
        else if (type == EnumPacketServer.GetTileEntity) {
            final TileEntity tile = player.worldObj.getTileEntity(buffer.readInt(), buffer.readInt(), buffer.readInt());
            final NBTTagCompound compound = new NBTTagCompound();
            tile.writeToNBT(compound);
            Server.sendData(player, EnumPacketClient.GUI_DATA, compound);
        }
        else if (type == EnumPacketServer.DialogCategoriesGet) {
            NoppesUtilServer.sendScrollData(player, DialogController.instance.getScroll());
        }
        else if (type == EnumPacketServer.DialogsGetFromDialog) {
            final Dialog dialog = DialogController.instance.dialogs.get(buffer.readInt());
            if (dialog == null) {
                return;
            }
            NoppesUtilServer.sendDialogData(player, dialog.category);
        }
        else if (type == EnumPacketServer.DialogsGet) {
            NoppesUtilServer.sendDialogData(player, DialogController.instance.categories.get(buffer.readInt()));
        }
        else if (type == EnumPacketServer.QuestsGetFromQuest) {
            final Quest quest = QuestController.instance.quests.get(buffer.readInt());
            if (quest == null) {
                return;
            }
            NoppesUtilServer.sendQuestData(player, quest.category);
        }
        else if (type == EnumPacketServer.QuestCategoriesGet) {
            NoppesUtilServer.sendQuestCategoryData(player);
        }
        else if (type == EnumPacketServer.QuestsGet) {
            final QuestCategory category = QuestController.instance.categories.get(buffer.readInt());
            NoppesUtilServer.sendQuestData(player, category);
        }
        else if (type == EnumPacketServer.FactionsGet) {
            NoppesUtilServer.sendFactionDataAll(player);
        }
        else if (type == EnumPacketServer.DialogGet) {
            final Dialog dialog = DialogController.instance.dialogs.get(buffer.readInt());
            if (dialog != null) {
                final NBTTagCompound compound = dialog.writeToNBT(new NBTTagCompound());
                final Quest quest2 = QuestController.instance.quests.get(dialog.quest);
                if (quest2 != null) {
                    compound.setString("DialogQuestName", quest2.title);
                }
                Server.sendData(player, EnumPacketClient.GUI_DATA, compound);
            }
        }
        else if (type == EnumPacketServer.QuestGet) {
            final Quest quest = QuestController.instance.quests.get(buffer.readInt());
            if (quest != null) {
                final NBTTagCompound compound = new NBTTagCompound();
                if (quest.hasNewQuest()) {
                    compound.setString("NextQuestTitle", quest.getNextQuest().title);
                }
                Server.sendData(player, EnumPacketClient.GUI_DATA, quest.writeToNBT(compound));
            }
        }
        else if (type == EnumPacketServer.FactionGet) {
            final NBTTagCompound compound2 = new NBTTagCompound();
            final Faction faction = FactionController.getInstance().getFaction(buffer.readInt());
            faction.writeNBT(compound2);
            Server.sendData(player, EnumPacketClient.GUI_DATA, compound2);
        }
    }
    
    private void wandPackets(final EnumPacketServer type, final ByteBuf buffer, final EntityPlayerMP player, EntityNPCInterface npc) throws IOException {
        if (type == EnumPacketServer.Delete) {
            npc.delete();
            NoppesUtilServer.deleteNpc(npc, (EntityPlayer)player);
        }
        else if (type == EnumPacketServer.LinkedAdd) {
            LinkedNpcController.Instance.addData(Server.readString(buffer));
            final List<String> list = new ArrayList<String>();
            for (final LinkedNpcController.LinkedData data : LinkedNpcController.Instance.list) {
                list.add(data.name);
            }
            Server.sendData(player, EnumPacketClient.SCROLL_LIST, list);
        }
        else if (type == EnumPacketServer.LinkedRemove) {
            LinkedNpcController.Instance.removeData(Server.readString(buffer));
            final List<String> list = new ArrayList<String>();
            for (final LinkedNpcController.LinkedData data : LinkedNpcController.Instance.list) {
                list.add(data.name);
            }
            Server.sendData(player, EnumPacketClient.SCROLL_LIST, list);
        }
        else if (type == EnumPacketServer.LinkedGetAll) {
            final List<String> list = new ArrayList<String>();
            for (final LinkedNpcController.LinkedData data : LinkedNpcController.Instance.list) {
                list.add(data.name);
            }
            Server.sendData(player, EnumPacketClient.SCROLL_LIST, list);
            if (npc != null) {
                Server.sendData(player, EnumPacketClient.SCROLL_SELECTED, npc.linkedName);
            }
        }
        else if (type == EnumPacketServer.LinkedSet) {
            npc.linkedName = Server.readString(buffer);
            LinkedNpcController.Instance.loadNpcData(npc);
        }
        else if (type == EnumPacketServer.NpcMenuClose) {
            npc.reset();
            if (npc.linkedData != null) {
                LinkedNpcController.Instance.saveNpcData(npc);
            }
            NoppesUtilServer.setEditingNpc((EntityPlayer)player, null);
        }
        else if (type == EnumPacketServer.BanksGet) {
            NoppesUtilServer.sendBankDataAll(player);
        }
        else if (type == EnumPacketServer.BankGet) {
            final Bank bank = BankController.getInstance().getBank(buffer.readInt());
            NoppesUtilServer.sendBank(player, bank);
        }
        else if (type == EnumPacketServer.BankSave) {
            final Bank bank = new Bank();
            bank.readEntityFromNBT(Server.readNBT(buffer));
            BankController.getInstance().saveBank(bank);
            NoppesUtilServer.sendBankDataAll(player);
            NoppesUtilServer.sendBank(player, bank);
        }
        else if (type == EnumPacketServer.BankRemove) {
            BankController.getInstance().removeBank(buffer.readInt());
            NoppesUtilServer.sendBankDataAll(player);
            NoppesUtilServer.sendBank(player, new Bank());
        }
        else if (type == EnumPacketServer.RemoteMainMenu) {
            final Entity entity = player.worldObj.getEntityByID(buffer.readInt());
            if (entity == null || !(entity instanceof EntityNPCInterface)) {
                return;
            }
            NoppesUtilServer.sendOpenGui((EntityPlayer)player, EnumGuiType.MainMenuDisplay, (EntityNPCInterface)entity);
        }
        else if (type == EnumPacketServer.RemoteDelete) {
            final Entity entity = player.worldObj.getEntityByID(buffer.readInt());
            if (entity == null || !(entity instanceof EntityNPCInterface)) {
                return;
            }
            npc = (EntityNPCInterface)entity;
            npc.delete();
            NoppesUtilServer.deleteNpc(npc, (EntityPlayer)player);
            NoppesUtilServer.sendNearbyNpcs(player);
        }
        else if (type == EnumPacketServer.RemoteNpcsGet) {
            NoppesUtilServer.sendNearbyNpcs(player);
            Server.sendData(player, EnumPacketClient.SCROLL_SELECTED, CustomNpcs.FreezeNPCs ? "Unfreeze Npcs" : "Freeze Npcs");
        }
        else if (type == EnumPacketServer.RemoteFreeze) {
            CustomNpcs.FreezeNPCs = !CustomNpcs.FreezeNPCs;
            Server.sendData(player, EnumPacketClient.SCROLL_SELECTED, CustomNpcs.FreezeNPCs ? "Unfreeze Npcs" : "Freeze Npcs");
        }
        else if (type == EnumPacketServer.RemoteReset) {
            final Entity entity = player.worldObj.getEntityByID(buffer.readInt());
            if (entity == null || !(entity instanceof EntityNPCInterface)) {
                return;
            }
            npc = (EntityNPCInterface)entity;
            npc.reset();
        }
        else if (type == EnumPacketServer.RemoteTpToNpc) {
            final Entity entity = player.worldObj.getEntityByID(buffer.readInt());
            if (entity == null || !(entity instanceof EntityNPCInterface)) {
                return;
            }
            npc = (EntityNPCInterface)entity;
            player.playerNetServerHandler.setPlayerLocation(npc.posX, npc.posY, npc.posZ, 0.0f, 0.0f);
        }
        else if (type == EnumPacketServer.Gui) {
            final EnumGuiType gui = EnumGuiType.values()[buffer.readInt()];
            final int i = buffer.readInt();
            final int j = buffer.readInt();
            final int k = buffer.readInt();
            NoppesUtilServer.sendOpenGui((EntityPlayer)player, gui, npc, i, j, k);
        }
        else if (type == EnumPacketServer.RecipesGet) {
            NoppesUtilServer.sendRecipeData(player, buffer.readInt());
        }
        else if (type == EnumPacketServer.RecipeGet) {
            final RecipeCarpentry recipe = RecipeController.instance.getRecipe(buffer.readInt());
            NoppesUtilServer.setRecipeGui(player, recipe);
        }
        else if (type == EnumPacketServer.RecipeRemove) {
            final RecipeCarpentry recipe = RecipeController.instance.removeRecipe(buffer.readInt());
            NoppesUtilServer.sendRecipeData(player, recipe.isGlobal ? 3 : 4);
            NoppesUtilServer.setRecipeGui(player, new RecipeCarpentry(""));
        }
        else if (type == EnumPacketServer.RecipeSave) {
            final RecipeCarpentry recipe = RecipeController.instance.saveRecipe(Server.readNBT(buffer));
            NoppesUtilServer.sendRecipeData(player, recipe.isGlobal ? 3 : 4);
            NoppesUtilServer.setRecipeGui(player, recipe);
        }
        else if (type == EnumPacketServer.NaturalSpawnGetAll) {
            NoppesUtilServer.sendScrollData(player, SpawnController.instance.getScroll());
        }
        else if (type == EnumPacketServer.NaturalSpawnGet) {
            final SpawnData spawn = SpawnController.instance.getSpawnData(buffer.readInt());
            if (spawn != null) {
                Server.sendData(player, EnumPacketClient.GUI_DATA, spawn.writeNBT(new NBTTagCompound()));
            }
        }
        else if (type == EnumPacketServer.NaturalSpawnSave) {
            final SpawnData data2 = new SpawnData();
            data2.readNBT(Server.readNBT(buffer));
            SpawnController.instance.saveSpawnData(data2);
            NoppesUtilServer.sendScrollData(player, SpawnController.instance.getScroll());
        }
        else if (type == EnumPacketServer.NaturalSpawnRemove) {
            SpawnController.instance.removeSpawnData(buffer.readInt());
            NoppesUtilServer.sendScrollData(player, SpawnController.instance.getScroll());
        }
        else if (type == EnumPacketServer.DialogCategorySave) {
            final DialogCategory category = new DialogCategory();
            category.readNBT(Server.readNBT(buffer));
            DialogController.instance.saveCategory(category);
            NoppesUtilServer.sendScrollData(player, DialogController.instance.getScroll());
        }
        else if (type == EnumPacketServer.DialogCategoryRemove) {
            DialogController.instance.removeCategory(buffer.readInt());
            NoppesUtilServer.sendScrollData(player, DialogController.instance.getScroll());
        }
        else if (type == EnumPacketServer.DialogCategoryGet) {
            final DialogCategory category = DialogController.instance.categories.get(buffer.readInt());
            if (category != null) {
                final NBTTagCompound comp = category.writeNBT(new NBTTagCompound());
                comp.removeTag("Dialogs");
                Server.sendData(player, EnumPacketClient.GUI_DATA, comp);
            }
        }
        else if (type == EnumPacketServer.DialogSave) {
            final int category2 = buffer.readInt();
            final Dialog dialog = new Dialog();
            dialog.readNBT(Server.readNBT(buffer));
            DialogController.instance.saveDialog(category2, dialog);
            if (dialog.category != null) {
                NoppesUtilServer.sendDialogData(player, dialog.category);
            }
        }
        else if (type == EnumPacketServer.QuestOpenGui) {
            final Quest quest = new Quest();
            final int gui2 = buffer.readInt();
            quest.readNBT(Server.readNBT(buffer));
            NoppesUtilServer.setEditingQuest((EntityPlayer)player, quest);
            player.openGui((Object)CustomNpcs.instance, gui2, player.worldObj, 0, 0, 0);
        }
        else if (type == EnumPacketServer.DialogRemove) {
            final Dialog dialog2 = DialogController.instance.dialogs.get(buffer.readInt());
            if (dialog2 != null && dialog2.category != null) {
                DialogController.instance.removeDialog(dialog2);
                NoppesUtilServer.sendDialogData(player, dialog2.category);
            }
        }
        else if (type == EnumPacketServer.DialogNpcGet) {
            NoppesUtilServer.sendNpcDialogs((EntityPlayer)player);
        }
        else if (type == EnumPacketServer.DialogNpcSet) {
            final int slot = buffer.readInt();
            final int dialog3 = buffer.readInt();
            final DialogOption option = NoppesUtilServer.setNpcDialog(slot, dialog3, (EntityPlayer)player);
            if (option != null && option.hasDialog()) {
                final NBTTagCompound compound = option.writeNBT();
                compound.setInteger("Position", slot);
                Server.sendData(player, EnumPacketClient.GUI_DATA, compound);
            }
        }
        else if (type == EnumPacketServer.DialogNpcRemove) {
            npc.dialogs.remove(buffer.readInt());
        }
        else if (type == EnumPacketServer.QuestCategoryGet) {
            final QuestCategory category3 = QuestController.instance.categories.get(buffer.readInt());
            if (category3 != null) {
                final NBTTagCompound comp = category3.writeNBT(new NBTTagCompound());
                comp.removeTag("Dialogs");
                Server.sendData(player, EnumPacketClient.GUI_DATA, comp);
            }
        }
        else if (type == EnumPacketServer.QuestCategorySave) {
            final QuestCategory category3 = new QuestCategory();
            category3.readNBT(Server.readNBT(buffer));
            QuestController.instance.saveCategory(category3);
            NoppesUtilServer.sendQuestCategoryData(player);
        }
        else if (type == EnumPacketServer.QuestCategoryRemove) {
            QuestController.instance.removeCategory(buffer.readInt());
            NoppesUtilServer.sendQuestCategoryData(player);
        }
        else if (type == EnumPacketServer.QuestSave) {
            final int category2 = buffer.readInt();
            final Quest quest2 = new Quest();
            quest2.readNBT(Server.readNBT(buffer));
            QuestController.instance.saveQuest(category2, quest2);
            if (quest2.category != null) {
                NoppesUtilServer.sendQuestData(player, quest2.category);
            }
        }
        else if (type == EnumPacketServer.QuestDialogGetTitle) {
            final Dialog quest3 = DialogController.instance.dialogs.get(buffer.readInt());
            final Dialog quest4 = DialogController.instance.dialogs.get(buffer.readInt());
            final Dialog quest5 = DialogController.instance.dialogs.get(buffer.readInt());
            final NBTTagCompound compound = new NBTTagCompound();
            if (quest3 != null) {
                compound.setString("1", quest3.title);
            }
            if (quest4 != null) {
                compound.setString("2", quest4.title);
            }
            if (quest5 != null) {
                compound.setString("3", quest5.title);
            }
            Server.sendData(player, EnumPacketClient.GUI_DATA, compound);
        }
        else if (type == EnumPacketServer.QuestRemove) {
            final Quest quest = QuestController.instance.quests.get(buffer.readInt());
            if (quest != null) {
                QuestController.instance.removeQuest(quest);
                NoppesUtilServer.sendQuestData(player, quest.category);
            }
        }
        else if (type == EnumPacketServer.TransportCategoriesGet) {
            NoppesUtilServer.sendTransportCategoryData(player);
        }
        else if (type == EnumPacketServer.TransportCategorySave) {
            TransportController.getInstance().saveCategory(Server.readString(buffer), buffer.readInt());
        }
        else if (type == EnumPacketServer.TransportCategoryRemove) {
            TransportController.getInstance().removeCategory(buffer.readInt());
            NoppesUtilServer.sendTransportCategoryData(player);
        }
        else if (type == EnumPacketServer.TransportRemove) {
            final int id = buffer.readInt();
            final TransportLocation loc = TransportController.getInstance().removeLocation(id);
            if (loc != null) {
                NoppesUtilServer.sendTransportData(player, loc.category.id);
            }
        }
        else if (type == EnumPacketServer.TransportsGet) {
            NoppesUtilServer.sendTransportData(player, buffer.readInt());
        }
        else if (type == EnumPacketServer.TransportSave) {
            final int cat = buffer.readInt();
            final TransportLocation location = TransportController.getInstance().saveLocation(cat, Server.readNBT(buffer), player, npc);
            if (location != null) {
                if (npc.advanced.role != EnumRoleType.Transporter) {
                    return;
                }
                final RoleTransporter role = (RoleTransporter)npc.roleInterface;
                role.setTransport(location);
            }
        }
        else if (type == EnumPacketServer.TransportGetLocation) {
            if (npc.advanced.role != EnumRoleType.Transporter) {
                return;
            }
            final RoleTransporter role2 = (RoleTransporter)npc.roleInterface;
            if (role2.hasTransport()) {
                Server.sendData(player, EnumPacketClient.GUI_DATA, role2.getLocation().writeNBT());
                Server.sendData(player, EnumPacketClient.SCROLL_SELECTED, role2.getLocation().category.title);
            }
        }
        else if (type == EnumPacketServer.FactionSet) {
            npc.setFaction(buffer.readInt());
        }
        else if (type == EnumPacketServer.FactionSave) {
            final Faction faction = new Faction();
            faction.readNBT(Server.readNBT(buffer));
            FactionController.getInstance().saveFaction(faction);
            NoppesUtilServer.sendFactionDataAll(player);
            final NBTTagCompound compound2 = new NBTTagCompound();
            faction.writeNBT(compound2);
            Server.sendData(player, EnumPacketClient.GUI_DATA, compound2);
        }
        else if (type == EnumPacketServer.FactionRemove) {
            FactionController.getInstance().removeFaction(buffer.readInt());
            NoppesUtilServer.sendFactionDataAll(player);
            final NBTTagCompound compound3 = new NBTTagCompound();
            new Faction().writeNBT(compound3);
            Server.sendData(player, EnumPacketClient.GUI_DATA, compound3);
        }
        else if (type == EnumPacketServer.PlayerDataGet) {
            final int id = buffer.readInt();
            if (EnumPlayerData.values().length <= id) {
                return;
            }
            String name = null;
            final EnumPlayerData datatype = EnumPlayerData.values()[id];
            if (datatype != EnumPlayerData.Players) {
                name = Server.readString(buffer);
            }
            NoppesUtilServer.sendPlayerData(datatype, player, name);
        }
        else if (type == EnumPacketServer.PlayerDataRemove) {
            NoppesUtilServer.removePlayerData(buffer, player);
        }
        else if (type == EnumPacketServer.MainmenuDisplayGet) {
            Server.sendData(player, EnumPacketClient.GUI_DATA, npc.display.writeToNBT(new NBTTagCompound()));
        }
        else if (type == EnumPacketServer.MainmenuDisplaySave) {
            npc.display.readToNBT(Server.readNBT(buffer));
            npc.updateClient = true;
        }
        else if (type == EnumPacketServer.MainmenuStatsGet) {
            Server.sendData(player, EnumPacketClient.GUI_DATA, npc.stats.writeToNBT(new NBTTagCompound()));
        }
        else if (type == EnumPacketServer.MainmenuStatsSave) {
            npc.stats.readToNBT(Server.readNBT(buffer));
            npc.updateClient = true;
        }
        else if (type == EnumPacketServer.MainmenuInvGet) {
            Server.sendData(player, EnumPacketClient.GUI_DATA, npc.inventory.writeEntityToNBT(new NBTTagCompound()));
        }
        else if (type == EnumPacketServer.MainmenuInvSave) {
            npc.inventory.readEntityFromNBT(Server.readNBT(buffer));
            npc.updateAI = true;
            npc.updateClient = true;
        }
        else if (type == EnumPacketServer.MainmenuAIGet) {
            Server.sendData(player, EnumPacketClient.GUI_DATA, npc.ai.writeToNBT(new NBTTagCompound()));
        }
        else if (type == EnumPacketServer.MainmenuAISave) {
            npc.ai.readToNBT(Server.readNBT(buffer));
            npc.setHealth(npc.getMaxHealth());
            npc.updateAI = true;
            npc.updateClient = true;
        }
        else if (type == EnumPacketServer.MainmenuAdvancedGet) {
            Server.sendData(player, EnumPacketClient.GUI_DATA, npc.advanced.writeToNBT(new NBTTagCompound()));
        }
        else if (type == EnumPacketServer.MainmenuAdvancedSave) {
            npc.advanced.readToNBT(Server.readNBT(buffer));
            npc.updateAI = true;
            npc.updateClient = true;
        }
        else if (type == EnumPacketServer.JobSave) {
            final NBTTagCompound original = npc.jobInterface.writeToNBT(new NBTTagCompound());
            final NBTTagCompound compound2 = Server.readNBT(buffer);
            final Set<String> names = (Set<String>)compound2.func_150296_c();
            for (final String name2 : names) {
                original.setTag(name2, compound2.getTag(name2));
            }
            npc.jobInterface.readFromNBT(original);
            npc.updateClient = true;
        }
        else if (type == EnumPacketServer.JobGet) {
            if (npc.jobInterface == null) {
                return;
            }
            final NBTTagCompound compound3 = new NBTTagCompound();
            compound3.setBoolean("JobData", true);
            npc.jobInterface.writeToNBT(compound3);
            if (npc.advanced.job == EnumJobType.Spawner) {
                ((JobSpawner)npc.jobInterface).cleanCompound(compound3);
            }
            Server.sendData(player, EnumPacketClient.GUI_DATA, compound3);
            if (npc.advanced.job == EnumJobType.Spawner) {
                Server.sendData(player, EnumPacketClient.GUI_DATA, ((JobSpawner)npc.jobInterface).getTitles());
            }
        }
        else if (type == EnumPacketServer.JobSpawnerAdd) {
            if (npc.advanced.job != EnumJobType.Spawner) {
                return;
            }
            final JobSpawner job = (JobSpawner)npc.jobInterface;
            if (buffer.readBoolean()) {
                final NBTTagCompound compound2 = ServerCloneController.Instance.getCloneData(null, Server.readString(buffer), buffer.readInt());
                job.setJobCompound(buffer.readInt(), compound2);
            }
            else {
                job.setJobCompound(buffer.readInt(), Server.readNBT(buffer));
            }
            Server.sendData(player, EnumPacketClient.GUI_DATA, job.getTitles());
        }
        else if (type == EnumPacketServer.RoleCompanionUpdate) {
            if (npc.advanced.role != EnumRoleType.Companion) {
                return;
            }
            ((RoleCompanion)npc.roleInterface).matureTo(EnumCompanionStage.values()[buffer.readInt()]);
            npc.updateClient = true;
        }
        else if (type == EnumPacketServer.JobSpawnerRemove) {
            if (npc.advanced.job != EnumJobType.Spawner) {
                return;
            }
        }
        else if (type == EnumPacketServer.RoleSave) {
            npc.roleInterface.readFromNBT(Server.readNBT(buffer));
            npc.updateClient = true;
        }
        else if (type == EnumPacketServer.RoleGet) {
            if (npc.roleInterface == null) {
                return;
            }
            final NBTTagCompound compound3 = new NBTTagCompound();
            compound3.setBoolean("RoleData", true);
            Server.sendData(player, EnumPacketClient.GUI_DATA, npc.roleInterface.writeToNBT(compound3));
        }
        else if (type == EnumPacketServer.MerchantUpdate) {
            final Entity entity = player.worldObj.getEntityByID(buffer.readInt());
            if (entity == null || !(entity instanceof EntityVillager)) {
                return;
            }
            final MerchantRecipeList list2 = MerchantRecipeList.func_151390_b(new PacketBuffer(buffer));
            ((EntityVillager)entity).setRecipes(list2);
        }
        else if (type == EnumPacketServer.ModelDataSave) {
            if (npc instanceof EntityCustomNpc) {
                ((EntityCustomNpc)npc).modelData.readFromNBT(Server.readNBT(buffer));
            }
        }
        else if (type == EnumPacketServer.MailOpenSetup) {
            final PlayerMail mail = new PlayerMail();
            mail.readNBT(Server.readNBT(buffer));
            ContainerMail.staticmail = mail;
            player.openGui((Object)CustomNpcs.instance, EnumGuiType.PlayerMailman.ordinal(), player.worldObj, 1, 0, 0);
        }
        else if (type == EnumPacketServer.TransformSave) {
            final boolean isValid = npc.transform.isValid();
            npc.transform.readOptions(Server.readNBT(buffer));
            if (isValid != npc.transform.isValid()) {
                npc.updateAI = true;
            }
        }
        else if (type == EnumPacketServer.TransformGet) {
            Server.sendData(player, EnumPacketClient.GUI_DATA, npc.transform.writeOptions(new NBTTagCompound()));
        }
        else if (type == EnumPacketServer.TransformLoad) {
            if (npc.transform.isValid()) {
                npc.transform.transform(buffer.readBoolean());
            }
        }
        else if (type == EnumPacketServer.TraderMarketSave) {
            final String market = Server.readString(buffer);
            final boolean bo = buffer.readBoolean();
            if (npc.roleInterface instanceof RoleTrader) {
                if (bo) {
                    Market.setMarket(npc, market);
                }
                else {
                    Market.save((RoleTrader)npc.roleInterface, market);
                }
            }
        }
        else {
            this.blockPackets(type, buffer, player);
        }
    }
    
    private void mountPackets(final EnumPacketServer type, final ByteBuf buffer, final EntityPlayerMP player) throws IOException {
        if (type == EnumPacketServer.SpawnRider) {
            final Entity entity = EntityList.createEntityFromNBT(Server.readNBT(buffer), player.worldObj);
            player.worldObj.spawnEntityInWorld(entity);
            entity.mountEntity(ServerEventsHandler.mounted);
        }
        else if (type == EnumPacketServer.PlayerRider) {
            player.mountEntity(ServerEventsHandler.mounted);
        }
        else if (type == EnumPacketServer.CloneList) {
            final NBTTagList list = new NBTTagList();
            for (final String name : ServerCloneController.Instance.getClones(buffer.readInt())) {
                list.appendTag((NBTBase)new NBTTagString(name));
            }
            final NBTTagCompound compound = new NBTTagCompound();
            compound.setTag("List", (NBTBase)list);
            Server.sendData(player, EnumPacketClient.GUI_DATA, compound);
        }
        else {
            this.warn((EntityPlayer)player, "tried todo something with the wrong tool, probably a hacker");
        }
    }
    
    private void clonePackets(final EnumPacketServer type, final ByteBuf buffer, final EntityPlayerMP player) throws IOException {
        if (type == EnumPacketServer.SpawnMob) {
            final boolean server = buffer.readBoolean();
            final int x = buffer.readInt();
            final int y = buffer.readInt();
            final int z = buffer.readInt();
            NBTTagCompound compound;
            if (server) {
                compound = ServerCloneController.Instance.getCloneData((ICommandSender)player, Server.readString(buffer), buffer.readInt());
            }
            else {
                compound = Server.readNBT(buffer);
            }
            if (compound == null) {
                return;
            }
            final Entity entity = NoppesUtilServer.spawnClone(compound, x, y, z, player.worldObj);
            if (entity == null) {
                player.addChatMessage((IChatComponent)new ChatComponentText("Failed to create an entity out of your clone"));
            }
        }
        else if (type == EnumPacketServer.MobSpawner) {
            final boolean server = buffer.readBoolean();
            final int x = buffer.readInt();
            final int y = buffer.readInt();
            final int z = buffer.readInt();
            NBTTagCompound compound;
            if (server) {
                compound = ServerCloneController.Instance.getCloneData((ICommandSender)player, Server.readString(buffer), buffer.readInt());
            }
            else {
                compound = Server.readNBT(buffer);
            }
            if (compound != null) {
                NoppesUtilServer.createMobSpawner(x, y, z, compound, (EntityPlayer)player);
            }
        }
        else if (type == EnumPacketServer.ClonePreSave) {
            final boolean bo = ServerCloneController.Instance.getCloneData(null, Server.readString(buffer), buffer.readInt()) != null;
            final NBTTagCompound compound2 = new NBTTagCompound();
            compound2.setBoolean("NameExists", bo);
            Server.sendData(player, EnumPacketClient.GUI_DATA, compound2);
        }
        else if (type == EnumPacketServer.CloneSave) {
            final PlayerData data = PlayerDataController.instance.getPlayerData((EntityPlayer)player);
            if (data.cloned == null) {
                return;
            }
            ServerCloneController.Instance.addClone(data.cloned, Server.readString(buffer), buffer.readInt());
        }
        else if (type == EnumPacketServer.CloneRemove) {
            final int tab = buffer.readInt();
            ServerCloneController.Instance.removeClone(Server.readString(buffer), tab);
            final NBTTagList list = new NBTTagList();
            for (final String name : ServerCloneController.Instance.getClones(tab)) {
                list.appendTag((NBTBase)new NBTTagString(name));
            }
            final NBTTagCompound compound3 = new NBTTagCompound();
            compound3.setTag("List", (NBTBase)list);
            Server.sendData(player, EnumPacketClient.GUI_DATA, compound3);
        }
        else if (type == EnumPacketServer.CloneList) {
            final NBTTagList list2 = new NBTTagList();
            for (final String name2 : ServerCloneController.Instance.getClones(buffer.readInt())) {
                list2.appendTag((NBTBase)new NBTTagString(name2));
            }
            final NBTTagCompound compound2 = new NBTTagCompound();
            compound2.setTag("List", (NBTBase)list2);
            Server.sendData(player, EnumPacketClient.GUI_DATA, compound2);
        }
        else {
            this.warn((EntityPlayer)player, "tried todo something with the wrong tool, probably a hacker");
        }
    }
    
    private void warn(final EntityPlayer player, final String warning) {
        MinecraftServer.getServer().logWarning(player.getCommandSenderName() + ": " + warning);
    }
}

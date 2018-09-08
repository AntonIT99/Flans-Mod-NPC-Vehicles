// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import java.util.UUID;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityList;
import net.minecraft.world.World;
import java.util.List;
import java.text.DecimalFormat;
import noppes.npcs.containers.ContainerManageBanks;
import noppes.npcs.containers.ContainerManageRecipes;
import net.minecraft.tileentity.TileEntity;
import noppes.npcs.controllers.DialogOption;
import noppes.npcs.controllers.TransportCategory;
import noppes.npcs.controllers.DialogCategory;
import noppes.npcs.controllers.RecipeCarpentry;
import noppes.npcs.controllers.RecipeController;
import net.minecraft.server.MinecraftServer;
import io.netty.buffer.ByteBuf;
import noppes.npcs.controllers.PlayerFactionData;
import noppes.npcs.controllers.PlayerBankData;
import noppes.npcs.controllers.PlayerQuestData;
import java.io.File;
import noppes.npcs.controllers.DialogController;
import noppes.npcs.constants.EnumPlayerData;
import noppes.npcs.controllers.QuestCategory;
import noppes.npcs.controllers.QuestController;
import net.minecraft.tileentity.MobSpawnerBaseLogic;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.init.Blocks;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import noppes.npcs.controllers.ServerCloneController;
import net.minecraft.entity.Entity;
import noppes.npcs.controllers.PlayerTransportData;
import noppes.npcs.controllers.TransportController;
import noppes.npcs.controllers.TransportLocation;
import noppes.npcs.roles.RoleTransporter;
import java.util.ArrayList;
import noppes.npcs.constants.EnumGuiType;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import net.minecraft.command.server.CommandBlockLogic;
import net.minecraft.util.MathHelper;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.controllers.PlayerDialogData;
import noppes.npcs.scripted.ScriptEventDialog;
import noppes.npcs.constants.EnumScriptType;
import noppes.npcs.controllers.PlayerQuestController;
import noppes.npcs.entity.EntityDialogNpc;
import noppes.npcs.controllers.Dialog;
import net.minecraft.nbt.NBTBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import noppes.npcs.controllers.Bank;
import noppes.npcs.controllers.BankController;
import java.util.Iterator;
import java.util.Map;
import noppes.npcs.controllers.Faction;
import noppes.npcs.controllers.FactionController;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.constants.EnumRoleType;
import noppes.npcs.controllers.PlayerData;
import noppes.npcs.constants.EnumPacketClient;
import net.minecraft.entity.player.EntityPlayerMP;
import noppes.npcs.controllers.PlayerDataController;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.controllers.Quest;
import java.util.HashMap;

public class NoppesUtilServer
{
    private static HashMap<String, Quest> editingQuests;
    
    public static void setEditingNpc(final EntityPlayer player, final EntityNPCInterface npc) {
        final PlayerData data = PlayerDataController.instance.getPlayerData(player);
        data.editingNpc = npc;
        if (npc != null) {
            Server.sendData((EntityPlayerMP)player, EnumPacketClient.EDIT_NPC, npc.getEntityId());
        }
    }
    
    public static EntityNPCInterface getEditingNpc(final EntityPlayer player) {
        final PlayerData data = PlayerDataController.instance.getPlayerData(player);
        return data.editingNpc;
    }
    
    public static void setEditingQuest(final EntityPlayer player, final Quest quest) {
        NoppesUtilServer.editingQuests.put(player.getCommandSenderName(), quest);
    }
    
    public static Quest getEditingQuest(final EntityPlayer player) {
        return NoppesUtilServer.editingQuests.get(player.getCommandSenderName());
    }
    
    public static void sendRoleData(final EntityPlayer player, final EntityNPCInterface npc) {
        if (npc.advanced.role == EnumRoleType.None) {
            return;
        }
        final NBTTagCompound comp = new NBTTagCompound();
        npc.roleInterface.writeToNBT(comp);
        comp.setInteger("EntityId", npc.getEntityId());
        comp.setInteger("Role", npc.advanced.role.ordinal());
        Server.sendData((EntityPlayerMP)player, EnumPacketClient.ROLE, comp);
    }
    
    public static void sendFactionDataAll(final EntityPlayerMP player) {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        for (final Faction faction : FactionController.getInstance().factions.values()) {
            map.put(faction.name, faction.id);
        }
        sendScrollData(player, map);
    }
    
    public static void sendBankDataAll(final EntityPlayerMP player) {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        for (final Bank bank : BankController.getInstance().banks.values()) {
            map.put(bank.name, bank.id);
        }
        sendScrollData(player, map);
    }
    
    public static NBTTagCompound writeItem(final ItemStack item, final NBTTagCompound nbt) {
        final String resourcelocation = Item.itemRegistry.getNameForObject((Object)item.getItem());
        nbt.setString("id", (resourcelocation == null) ? "minecraft:air" : resourcelocation.toString());
        nbt.setByte("Count", (byte)item.stackSize);
        nbt.setShort("Damage", (short)item.getItemDamage());
        if (item.stackTagCompound != null) {
            nbt.setTag("tag", (NBTBase)item.stackTagCompound);
        }
        return nbt;
    }
    
    public static ItemStack readItem(final NBTTagCompound nbt) {
        Item item;
        if (nbt.hasKey("id", 8)) {
            item = getByNameOrId(nbt.getString("id"));
        }
        else {
            item = Item.getItemById((int)nbt.getShort("id"));
        }
        if (item == null) {
            return null;
        }
        final ItemStack itemstack = new ItemStack(item);
        itemstack.stackSize = nbt.getByte("Count");
        itemstack.setItemDamage((int)nbt.getShort("Damage"));
        if (itemstack.getItemDamage() < 0) {
            itemstack.setItemDamage(0);
        }
        if (nbt.hasKey("tag", 10)) {
            itemstack.stackTagCompound = nbt.getCompoundTag("tag");
        }
        return itemstack;
    }
    
    public static Item getByNameOrId(final String id) {
        final Item item = (Item)Item.itemRegistry.getObject(id);
        if (item == null) {
            try {
                return Item.getItemById(Integer.parseInt(id));
            }
            catch (NumberFormatException ex) {}
        }
        return item;
    }
    
    public static void openDialog(final EntityPlayer player, final EntityNPCInterface npc, final Dialog dia) {
        final Dialog dialog = dia.copy(player);
        if (npc instanceof EntityDialogNpc) {
            dialog.hideNPC = true;
            Server.sendData((EntityPlayerMP)player, EnumPacketClient.DIALOG_DUMMY, npc.getCommandSenderName(), dialog.writeToNBT(new NBTTagCompound()));
        }
        else {
            Server.sendData((EntityPlayerMP)player, EnumPacketClient.DIALOG, npc.getEntityId(), dialog.writeToNBT(new NBTTagCompound()));
        }
        dia.factionOptions.addPoints(player);
        if (dialog.hasQuest()) {
            PlayerQuestController.addActiveQuest(dialog.getQuest(), player);
        }
        if (!dialog.command.isEmpty()) {
            runCommand(player, npc.getCommandSenderName(), dialog.command);
        }
        if (dialog.mail.isValid()) {
            PlayerDataController.instance.addPlayerMessage(player.getCommandSenderName(), dialog.mail);
        }
        final PlayerDialogData data = PlayerDataController.instance.getPlayerData(player).dialogData;
        if (!data.dialogsRead.contains(dialog.id)) {
            data.dialogsRead.add(dialog.id);
        }
        setEditingNpc(player, npc);
        npc.script.callScript(EnumScriptType.DIALOG, "event", new ScriptEventDialog(), "player", player, "dialog", dialog.id);
    }
    
    public static void runCommand(final EntityPlayer player, final String name, final String command) {
        runCommand((EntityLivingBase)player, name, command, player);
    }
    
    public static void runCommand(final EntityLivingBase executer, final String name, String command, final EntityPlayer player) {
        if (player != null) {
            command = command.replace("@dp", player.getCommandSenderName());
        }
        command = command.replace("@npc", name);
        final TileEntityCommandBlock tile = new TileEntityCommandBlock();
        tile.setWorldObj(executer.worldObj);
        tile.xCoord = MathHelper.floor_double(executer.posX);
        tile.yCoord = MathHelper.floor_double(executer.posY);
        tile.zCoord = MathHelper.floor_double(executer.posZ);
        final CommandBlockLogic logic = tile.func_145993_a();
        logic.func_145752_a(command);
        logic.func_145754_b("@" + name);
        logic.func_145755_a(executer.worldObj);
    }
    
    public static void consumeItemStack(final int i, final EntityPlayer player) {
        final ItemStack item = player.inventory.getCurrentItem();
        if (player.capabilities.isCreativeMode || item == null) {
            return;
        }
        final ItemStack itemStack = item;
        --itemStack.stackSize;
        if (item.stackSize <= 0) {
            player.destroyCurrentEquippedItem();
        }
    }
    
    public static DataOutputStream getDataOutputStream(final ByteArrayOutputStream stream) throws IOException {
        return new DataOutputStream(new GZIPOutputStream(stream));
    }
    
    public static void sendOpenGui(final EntityPlayer player, final EnumGuiType gui, final EntityNPCInterface npc) {
        sendOpenGui(player, gui, npc, 0, 0, 0);
    }
    
    public static void sendOpenGui(final EntityPlayer player, final EnumGuiType gui, final EntityNPCInterface npc, final int i, final int j, final int k) {
        if (!(player instanceof EntityPlayerMP)) {
            return;
        }
        setEditingNpc(player, npc);
        sendExtraData(player, npc, gui, i, j, k);
        if (CustomNpcs.proxy.getServerGuiElement(gui.ordinal(), player, player.worldObj, i, j, k) != null) {
            player.openGui((Object)CustomNpcs.instance, gui.ordinal(), player.worldObj, i, j, k);
            return;
        }
        Server.sendData((EntityPlayerMP)player, EnumPacketClient.GUI, gui.ordinal(), i, j, k);
        final ArrayList<String> list = getScrollData(player, gui, npc);
        if (list == null || list.isEmpty()) {
            return;
        }
        Server.sendData((EntityPlayerMP)player, EnumPacketClient.SCROLL_LIST, list);
    }
    
    private static void sendExtraData(final EntityPlayer player, final EntityNPCInterface npc, final EnumGuiType gui, final int i, final int j, final int k) {
        if (gui == EnumGuiType.PlayerFollower || gui == EnumGuiType.PlayerFollowerHire || gui == EnumGuiType.PlayerTrader || gui == EnumGuiType.PlayerTransporter) {
            sendRoleData(player, npc);
        }
    }
    
    private static ArrayList<String> getScrollData(final EntityPlayer player, final EnumGuiType gui, final EntityNPCInterface npc) {
        if (gui == EnumGuiType.PlayerTransporter) {
            final RoleTransporter role = (RoleTransporter)npc.roleInterface;
            final ArrayList<String> list = new ArrayList<String>();
            final TransportLocation location = role.getLocation();
            final String name = role.getLocation().name;
            for (final TransportLocation loc : location.category.getDefaultLocations()) {
                if (!list.contains(loc.name)) {
                    list.add(loc.name);
                }
            }
            final PlayerTransportData playerdata = PlayerDataController.instance.getPlayerData(player).transportData;
            for (final int i : playerdata.transports) {
                final TransportLocation loc2 = TransportController.getInstance().getTransport(i);
                if (loc2 != null && location.category.locations.containsKey(loc2.id) && !list.contains(loc2.name)) {
                    list.add(loc2.name);
                }
            }
            list.remove(name);
            return list;
        }
        return null;
    }
    
    public static void spawnParticle(final Entity entity, final String particle, final int dimension) {
        Server.sendAssociatedData(entity, EnumPacketClient.PARTICLE, entity.posX, entity.posY, entity.posZ, entity.height, entity.width, entity.yOffset, particle);
    }
    
    public static void deleteNpc(final EntityNPCInterface npc, final EntityPlayer player) {
        Server.sendAssociatedData((Entity)npc, EnumPacketClient.DELETE_NPC, npc.getEntityId());
    }
    
    public static void createMobSpawner(final int x, final int y, final int z, final NBTTagCompound comp, final EntityPlayer player) {
        comp.removeTag("Pos");
        ServerCloneController.Instance.cleanTags(comp);
        if (comp.getString("id").equalsIgnoreCase("entityhorse")) {
            player.addChatMessage((IChatComponent)new ChatComponentTranslation("Currently you cant create horse spawner, its a minecraft bug", new Object[0]));
            return;
        }
        player.worldObj.setBlock(x, y, z, Blocks.mob_spawner);
        final TileEntityMobSpawner tile = (TileEntityMobSpawner)player.worldObj.getTileEntity(x, y, z);
        final MobSpawnerBaseLogic getSpawnerBaseLogic;
        final MobSpawnerBaseLogic mobSpawnerBaseLogic;
        final MobSpawnerBaseLogic logic = mobSpawnerBaseLogic = (getSpawnerBaseLogic = tile.func_145881_a());
        mobSpawnerBaseLogic.getClass();
        //getSpawnerBaseLogic.setRandomEntity(new MobSpawnerBaseLogic.WeightedRandomMinecart(comp, comp.getString("id")));
    }
    
    public static void sendQuestCategoryData(final EntityPlayerMP player) {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        for (final QuestCategory category : QuestController.instance.categories.values()) {
            map.put(category.title, category.id);
        }
        sendScrollData(player, map);
    }
    
    public static void sendPlayerData(final EnumPlayerData type, final EntityPlayerMP player, final String name) throws IOException {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        if (type == EnumPlayerData.Players) {
            final File loc = PlayerDataController.instance.getSaveDir();
            for (final String username : PlayerDataController.instance.getUsernameData().keySet()) {
                map.put(username, 0);
            }
        }
        else {
            final PlayerData playerdata = PlayerDataController.instance.getDataFromUsername(name);
            if (type == EnumPlayerData.Dialog) {
                final PlayerDialogData data = playerdata.dialogData;
                for (final int questId : data.dialogsRead) {
                    final Dialog dialog = DialogController.instance.dialogs.get(questId);
                    if (dialog == null) {
                        continue;
                    }
                    map.put(dialog.category.title + ": " + dialog.title, questId);
                }
            }
            else if (type == EnumPlayerData.Quest) {
                final PlayerQuestData data2 = playerdata.questData;
                for (final int questId : data2.activeQuests.keySet()) {
                    final Quest quest = QuestController.instance.quests.get(questId);
                    if (quest == null) {
                        continue;
                    }
                    map.put(quest.category.title + ": " + quest.title + "(Active quest)", questId);
                }
                for (final int questId : data2.finishedQuests.keySet()) {
                    final Quest quest = QuestController.instance.quests.get(questId);
                    if (quest == null) {
                        continue;
                    }
                    map.put(quest.category.title + ": " + quest.title + "(Finished quest)", questId);
                }
            }
            else if (type == EnumPlayerData.Transport) {
                final PlayerTransportData data3 = playerdata.transportData;
                for (final int questId : data3.transports) {
                    final TransportLocation location = TransportController.getInstance().getTransport(questId);
                    if (location == null) {
                        continue;
                    }
                    map.put(location.category.title + ": " + location.name, questId);
                }
            }
            else if (type == EnumPlayerData.Bank) {
                final PlayerBankData data4 = playerdata.bankData;
                for (final int bankId : data4.banks.keySet()) {
                    final Bank bank = BankController.getInstance().banks.get(bankId);
                    if (bank == null) {
                        continue;
                    }
                    map.put(bank.name, bankId);
                }
            }
            else if (type == EnumPlayerData.Factions) {
                final PlayerFactionData data5 = playerdata.factionData;
                for (final int factionId : data5.factionData.keySet()) {
                    final Faction faction = FactionController.getInstance().factions.get(factionId);
                    if (faction == null) {
                        continue;
                    }
                    map.put(faction.name + "(" + data5.getFactionPoints(factionId) + ")", factionId);
                }
            }
        }
        sendScrollData(player, map);
    }
    
    public static void removePlayerData(final ByteBuf buffer, final EntityPlayerMP player) throws IOException {
        final int id = buffer.readInt();
        if (EnumPlayerData.values().length <= id) {
            return;
        }
        final String name = Server.readString(buffer);
        final EnumPlayerData type = EnumPlayerData.values()[id];
        final EntityPlayer pl = (EntityPlayer)MinecraftServer.getServer().getConfigurationManager().func_152612_a(name);
        PlayerData playerdata = null;
        if (pl == null) {
            playerdata = PlayerDataController.instance.getDataFromUsername(name);
        }
        else {
            playerdata = PlayerDataController.instance.getPlayerData(pl);
        }
        if (type == EnumPlayerData.Players) {
            final File file = new File(PlayerDataController.instance.getSaveDir(), playerdata.uuid + ".json");
            if (file.exists()) {
                file.delete();
            }
            if (pl != null) {
                playerdata.setNBT(new NBTTagCompound());
                sendPlayerData(type, player, name);
                playerdata.saveNBTData(null);
                return;
            }
        }
        if (type == EnumPlayerData.Quest) {
            final PlayerQuestData data = playerdata.questData;
            final int questId = buffer.readInt();
            data.activeQuests.remove(questId);
            data.finishedQuests.remove(questId);
            playerdata.saveNBTData(null);
        }
        if (type == EnumPlayerData.Dialog) {
            final PlayerDialogData data2 = playerdata.dialogData;
            data2.dialogsRead.remove(buffer.readInt());
            playerdata.saveNBTData(null);
        }
        if (type == EnumPlayerData.Transport) {
            final PlayerTransportData data3 = playerdata.transportData;
            data3.transports.remove(buffer.readInt());
            playerdata.saveNBTData(null);
        }
        if (type == EnumPlayerData.Bank) {
            final PlayerBankData data4 = playerdata.bankData;
            data4.banks.remove(buffer.readInt());
            playerdata.saveNBTData(null);
        }
        if (type == EnumPlayerData.Factions) {
            final PlayerFactionData data5 = playerdata.factionData;
            data5.factionData.remove(buffer.readInt());
            playerdata.saveNBTData(null);
        }
        sendPlayerData(type, player, name);
    }
    
    public static void sendRecipeData(final EntityPlayerMP player, final int size) {
        final HashMap<String, Integer> map = new HashMap<String, Integer>();
        if (size == 3) {
            for (final RecipeCarpentry recipe : RecipeController.instance.globalRecipes.values()) {
                map.put(recipe.name, recipe.id);
            }
        }
        else {
            for (final RecipeCarpentry recipe : RecipeController.instance.anvilRecipes.values()) {
                map.put(recipe.name, recipe.id);
            }
        }
        sendScrollData(player, map);
    }
    
    public static void sendScrollData(final EntityPlayerMP player, final Map<String, Integer> map) {
        Map<String, Integer> send = new HashMap<String, Integer>();
        for (final String key : map.keySet()) {
            send.put(key, map.get(key));
            if (send.size() == 100) {
                Server.sendData(player, EnumPacketClient.SCROLL_DATA_PART, send);
                send = new HashMap<String, Integer>();
            }
        }
        Server.sendData(player, EnumPacketClient.SCROLL_DATA, send);
    }
    
    public static void sendDialogData(final EntityPlayerMP player, final DialogCategory category) {
        if (category == null) {
            return;
        }
        final HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (final Dialog dialog : category.dialogs.values()) {
            map.put(dialog.title, dialog.id);
        }
        sendScrollData(player, map);
    }
    
    public static void sendQuestData(final EntityPlayerMP player, final QuestCategory category) {
        if (category == null) {
            return;
        }
        final HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (final Quest quest : category.quests.values()) {
            map.put(quest.title, quest.id);
        }
        sendScrollData(player, map);
    }
    
    public static void sendTransportCategoryData(final EntityPlayerMP player) {
        final HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (final TransportCategory category : TransportController.getInstance().categories.values()) {
            map.put(category.title, category.id);
        }
        sendScrollData(player, map);
    }
    
    public static void sendTransportData(final EntityPlayerMP player, final int categoryid) {
        final TransportCategory category = TransportController.getInstance().categories.get(categoryid);
        if (category == null) {
            return;
        }
        final HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (final TransportLocation transport : category.locations.values()) {
            map.put(transport.name, transport.id);
        }
        sendScrollData(player, map);
    }
    
    public static void sendNpcDialogs(final EntityPlayer player) {
        final EntityNPCInterface npc = getEditingNpc(player);
        if (npc == null) {
            return;
        }
        for (final int pos : npc.dialogs.keySet()) {
            final DialogOption option = npc.dialogs.get(pos);
            if (option != null) {
                if (!option.hasDialog()) {
                    continue;
                }
                final NBTTagCompound compound = option.writeNBT();
                compound.setInteger("Position", pos);
                Server.sendData((EntityPlayerMP)player, EnumPacketClient.GUI_DATA, compound);
            }
        }
    }
    
    public static DialogOption setNpcDialog(final int slot, final int dialogId, final EntityPlayer player) throws IOException {
        final EntityNPCInterface npc = getEditingNpc(player);
        if (npc == null) {
            return null;
        }
        if (!npc.dialogs.containsKey(slot)) {
            npc.dialogs.put(slot, new DialogOption());
        }
        final DialogOption option = npc.dialogs.get(slot);
        option.dialogId = dialogId;
        if (option.hasDialog()) {
            option.title = option.getDialog().title;
        }
        return option;
    }
    
    public static void saveTileEntity(final EntityPlayerMP player, final NBTTagCompound compound) {
        final int x = compound.getInteger("x");
        final int y = compound.getInteger("y");
        final int z = compound.getInteger("z");
        final TileEntity tile = player.worldObj.getTileEntity(x, y, z);
        if (tile != null) {
            tile.readFromNBT(compound);
        }
    }
    
    public static void setRecipeGui(final EntityPlayerMP player, final RecipeCarpentry recipe) {
        if (recipe == null) {
            return;
        }
        if (!(player.openContainer instanceof ContainerManageRecipes)) {
            return;
        }
        final ContainerManageRecipes container = (ContainerManageRecipes)player.openContainer;
        container.setRecipe(recipe);
        Server.sendData(player, EnumPacketClient.GUI_DATA, recipe.writeNBT());
    }
    
    public static void sendBank(final EntityPlayerMP player, final Bank bank) {
        final NBTTagCompound compound = new NBTTagCompound();
        bank.writeEntityToNBT(compound);
        Server.sendData(player, EnumPacketClient.GUI_DATA, compound);
        if (player.openContainer instanceof ContainerManageBanks) {
            ((ContainerManageBanks)player.openContainer).setBank(bank);
        }
        player.sendContainerAndContentsToPlayer(player.openContainer, player.openContainer.getInventory());
    }
    
    public static void sendNearbyNpcs(final EntityPlayerMP player) {
        final List<EntityNPCInterface> npcs = (List<EntityNPCInterface>)player.worldObj.getEntitiesWithinAABB((Class)EntityNPCInterface.class, player.boundingBox.expand(120.0, 120.0, 120.0));
        final HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (final EntityNPCInterface npc : npcs) {
            if (npc.isDead) {
                continue;
            }
            final float distance = player.getDistanceToEntity((Entity)npc);
            final DecimalFormat df = new DecimalFormat("#.#");
            String s = df.format(distance);
            if (distance < 10.0f) {
                s = "0" + s;
            }
            map.put(s + " : " + npc.display.name, npc.getEntityId());
        }
        sendScrollData(player, map);
    }
    
    public static void sendGuiError(final EntityPlayer player, final int i) {
        Server.sendData((EntityPlayerMP)player, EnumPacketClient.GUI_ERROR, i, new NBTTagCompound());
    }
    
    public static void sendGuiClose(final EntityPlayerMP player, final int i, final NBTTagCompound comp) {
        if (player.openContainer != player.inventoryContainer) {
            player.openContainer = player.inventoryContainer;
        }
        Server.sendData(player, EnumPacketClient.GUI_CLOSE, i, comp);
    }
    
    public static Entity spawnClone(final NBTTagCompound compound, final int x, final int y, final int z, final World worldObj) {
        ServerCloneController.Instance.cleanTags(compound);
        compound.setTag("Pos", (NBTBase)NBTTags.nbtDoubleList(x + 0.5, y + 1, z + 0.5));
        final Entity entity = EntityList.createEntityFromNBT(compound, worldObj);
        if (entity == null) {
            return null;
        }
        if (entity instanceof EntityNPCInterface) {
            final EntityNPCInterface npc = (EntityNPCInterface)entity;
            npc.ai.startPos = new int[] { MathHelper.floor_double(npc.posX), MathHelper.floor_double(npc.posY), MathHelper.floor_double(npc.posZ) };
        }
        worldObj.spawnEntityInWorld(entity);
        return entity;
    }
    
    public static boolean isOp(final EntityPlayer player) {
        return MinecraftServer.getServer().getConfigurationManager().func_152596_g(player.getGameProfile());
    }
    
    public static void GivePlayerItem(final Entity entity, final EntityPlayer player, ItemStack item) {
        if (entity.worldObj.isRemote || item == null) {
            return;
        }
        item = item.copy();
        final float f = 0.7f;
        final double d = entity.worldObj.rand.nextFloat() * f + (1.0f - f);
        final double d2 = entity.worldObj.rand.nextFloat() * f + (1.0f - f);
        final double d3 = entity.worldObj.rand.nextFloat() * f + (1.0f - f);
        final EntityItem entityitem = new EntityItem(entity.worldObj, entity.posX + d, entity.posY + d2, entity.posZ + d3, item);
        entityitem.delayBeforeCanPickup = 2;
        entity.worldObj.spawnEntityInWorld((Entity)entityitem);
        final int i = item.stackSize;
        if (player.inventory.addItemStackToInventory(item)) {
            entity.worldObj.playSoundAtEntity((Entity)entityitem, "random.pop", 0.2f, ((entity.worldObj.rand.nextFloat() - entity.worldObj.rand.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            player.onItemPickup((Entity)entityitem, i);
            if (item.stackSize <= 0) {
                entityitem.setDead();
            }
        }
    }
    
    public static EntityPlayer getPlayer(final UUID id) {
        final List<EntityPlayer> list = (List<EntityPlayer>)MinecraftServer.getServer().getConfigurationManager().playerEntityList;
        for (final EntityPlayer player : list) {
            if (id.equals(player.getUniqueID())) {
                return player;
            }
        }
        return null;
    }
    
    static {
        NoppesUtilServer.editingQuests = new HashMap<String, Quest>();
    }
}

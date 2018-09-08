// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import net.minecraftforge.oredict.OreDictionary;
import java.util.List;
import noppes.npcs.controllers.PlayerQuestData;
import java.util.ArrayList;
import noppes.npcs.controllers.QuestData;
import noppes.npcs.controllers.PlayerQuestController;
import noppes.npcs.constants.EnumPacketClient;
import noppes.npcs.constants.EnumOptionType;
import noppes.npcs.controllers.DialogOption;
import noppes.npcs.constants.EnumScriptType;
import noppes.npcs.controllers.DialogController;
import noppes.npcs.controllers.Dialog;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import io.netty.buffer.Unpooled;
import noppes.npcs.constants.EnumPlayerPacket;
import noppes.npcs.controllers.BankData;
import noppes.npcs.controllers.PlayerBankData;
import noppes.npcs.controllers.Bank;
import noppes.npcs.controllers.BankController;
import noppes.npcs.containers.ContainerNPCBankInterface;
import java.util.Iterator;
import noppes.npcs.controllers.Line;
import net.minecraft.item.ItemStack;
import java.util.HashMap;
import net.minecraft.world.WorldServer;
import net.minecraft.entity.Entity;
import net.minecraft.world.Teleporter;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.server.MinecraftServer;
import noppes.npcs.controllers.PlayerTransportData;
import noppes.npcs.controllers.TransportLocation;
import noppes.npcs.controllers.PlayerDataController;
import noppes.npcs.controllers.TransportController;
import noppes.npcs.containers.ContainerNPCFollower;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import noppes.npcs.containers.ContainerNPCFollowerHire;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.roles.RoleFollower;
import noppes.npcs.constants.EnumRoleType;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.player.EntityPlayerMP;

public class NoppesUtilPlayer
{
    public static void changeFollowerState(final EntityPlayerMP player, final EntityNPCInterface npc) {
        if (npc.advanced.role != EnumRoleType.Follower) {
            return;
        }
        final RoleFollower role = (RoleFollower)npc.roleInterface;
        final EntityPlayer owner = role.owner;
        if (owner == null || !owner.getCommandSenderName().equals(player.getCommandSenderName())) {
            return;
        }
        role.isFollowing = !role.isFollowing;
    }
    
    public static void hireFollower(final EntityPlayerMP player, final EntityNPCInterface npc) {
        if (npc.advanced.role != EnumRoleType.Follower) {
            return;
        }
        final Container con = player.openContainer;
        if (con == null || !(con instanceof ContainerNPCFollowerHire)) {
            return;
        }
        final ContainerNPCFollowerHire container = (ContainerNPCFollowerHire)con;
        final RoleFollower role = (RoleFollower)npc.roleInterface;
        followerBuy(role, (IInventory)container.currencyMatrix, player, npc);
    }
    
    public static void extendFollower(final EntityPlayerMP player, final EntityNPCInterface npc) {
        if (npc.advanced.role != EnumRoleType.Follower) {
            return;
        }
        final Container con = player.openContainer;
        if (con == null || !(con instanceof ContainerNPCFollower)) {
            return;
        }
        final ContainerNPCFollower container = (ContainerNPCFollower)con;
        final RoleFollower role = (RoleFollower)npc.roleInterface;
        followerBuy(role, (IInventory)container.currencyMatrix, player, npc);
    }
    
    public static void transport(final EntityPlayerMP player, final EntityNPCInterface npc, final String location) {
        final TransportLocation loc = TransportController.getInstance().getTransport(location);
        final PlayerTransportData playerdata = PlayerDataController.instance.getPlayerData((EntityPlayer)player).transportData;
        if (loc == null || (!loc.isDefault() && !playerdata.transports.contains(loc.id))) {
            return;
        }
        teleportPlayer(player, loc.posX, loc.posY, loc.posZ, loc.dimension);
    }
    
    public static void teleportPlayer(final EntityPlayerMP player, final double posX, final double posY, final double posZ, final int dimension) {
        if (player.dimension != dimension) {
            final int dim = player.dimension;
            final MinecraftServer server = MinecraftServer.getServer();
            final WorldServer wor = server.worldServerForDimension(dimension);
            if (wor == null) {
                player.addChatMessage((IChatComponent)new ChatComponentText("Broken transporter. Dimenion does not exist"));
                return;
            }
            player.setLocationAndAngles(posX, posY, posZ, player.rotationYaw, player.rotationPitch);
            server.getConfigurationManager().transferPlayerToDimension(player, dimension, (Teleporter)new CustomTeleporter(wor));
            player.playerNetServerHandler.setPlayerLocation(posX, posY, posZ, player.rotationYaw, player.rotationPitch);
            if (!wor.playerEntities.contains(player)) {
                wor.spawnEntityInWorld((Entity)player);
            }
        }
        else {
            player.playerNetServerHandler.setPlayerLocation(posX, posY, posZ, player.rotationYaw, player.rotationPitch);
        }
        player.worldObj.updateEntityWithOptionalForce((Entity)player, false);
    }
    
    private static void followerBuy(final RoleFollower role, final IInventory currencyInv, final EntityPlayerMP player, final EntityNPCInterface npc) {
        ItemStack currency = currencyInv.getStackInSlot(0);
        if (currency == null) {
            return;
        }
        final HashMap<ItemStack, Integer> cd = new HashMap<ItemStack, Integer>();
        for (final int i : role.inventory.items.keySet()) {
            final ItemStack is = role.inventory.items.get(i);
            if (is != null && is.getItem() == currency.getItem()) {
                if (is.getHasSubtypes() && is.getItemDamage() != currency.getItemDamage()) {
                    continue;
                }
                int days = 1;
                if (role.rates.containsKey(i)) {
                    days = role.rates.get(i);
                }
                cd.put(is, days);
            }
        }
        if (cd.size() == 0) {
            return;
        }
        int stackSize = currency.stackSize;
        int days2 = 0;
        int possibleDays = 0;
        int possibleSize = stackSize;
        while (true) {
            for (final ItemStack item : cd.keySet()) {
                final int rDays = cd.get(item);
                final int rValue = item.stackSize;
                if (rValue > stackSize) {
                    continue;
                }
                final int newStackSize = stackSize % rValue;
                final int size = stackSize - newStackSize;
                final int posDays = size / rValue * rDays;
                if (possibleDays > posDays) {
                    continue;
                }
                possibleDays = posDays;
                possibleSize = newStackSize;
            }
            if (stackSize == possibleSize) {
                break;
            }
            stackSize = possibleSize;
            days2 += possibleDays;
            possibleDays = 0;
        }
        if (days2 == 0) {
            return;
        }
        if (stackSize <= 0) {
            currencyInv.setInventorySlotContents(0, (ItemStack)null);
        }
        else {
            currency = currency.splitStack(stackSize);
        }
        npc.say((EntityPlayer)player, new Line(NoppesStringUtils.formatText(role.dialogHire.replace("{days}", days2 + ""), player, npc)));
        role.setOwner((EntityPlayer)player);
        role.addDays(days2);
    }
    
    public static void bankUpgrade(final EntityPlayerMP player, final EntityNPCInterface npc) {
        if (npc.advanced.role != EnumRoleType.Bank) {
            return;
        }
        final Container con = player.openContainer;
        if (con == null || !(con instanceof ContainerNPCBankInterface)) {
            return;
        }
        final ContainerNPCBankInterface container = (ContainerNPCBankInterface)con;
        final Bank bank = BankController.getInstance().getBank(container.bankid);
        final ItemStack item = bank.upgradeInventory.getStackInSlot(container.slot);
        if (item == null) {
            return;
        }
        final int price = item.stackSize;
        ItemStack currency = container.currencyMatrix.getStackInSlot(0);
        if (currency == null || price > currency.stackSize) {
            return;
        }
        if (currency.stackSize - price == 0) {
            container.currencyMatrix.setInventorySlotContents(0, null);
        }
        else {
            currency = currency.splitStack(price);
        }
        player.closeContainer();
        final PlayerBankData data = PlayerDataController.instance.getBankData((EntityPlayer)player, bank.id);
        final BankData bankData = data.getBank(bank.id);
        bankData.upgradedSlots.put(container.slot, true);
        bankData.openBankGui((EntityPlayer)player, npc, bank.id, container.slot);
    }
    
    public static void bankUnlock(final EntityPlayerMP player, final EntityNPCInterface npc) {
        if (npc.advanced.role != EnumRoleType.Bank) {
            return;
        }
        final Container con = player.openContainer;
        if (con == null || !(con instanceof ContainerNPCBankInterface)) {
            return;
        }
        final ContainerNPCBankInterface container = (ContainerNPCBankInterface)con;
        final Bank bank = BankController.getInstance().getBank(container.bankid);
        final ItemStack item = bank.currencyInventory.getStackInSlot(container.slot);
        if (item == null) {
            return;
        }
        final int price = item.stackSize;
        ItemStack currency = container.currencyMatrix.getStackInSlot(0);
        if (currency == null || price > currency.stackSize) {
            return;
        }
        if (currency.stackSize - price == 0) {
            container.currencyMatrix.setInventorySlotContents(0, null);
        }
        else {
            currency = currency.splitStack(price);
        }
        player.closeContainer();
        final PlayerBankData data = PlayerDataController.instance.getBankData((EntityPlayer)player, bank.id);
        final BankData bankData = data.getBank(bank.id);
        if (bankData.unlockedSlots + 1 <= bank.maxSlots) {
            final BankData bankData2 = bankData;
            ++bankData2.unlockedSlots;
        }
        bankData.openBankGui((EntityPlayer)player, npc, bank.id, container.slot);
    }
    
    public static void sendData(final EnumPlayerPacket enu, final Object... obs) {
        final ByteBuf buffer = Unpooled.buffer();
        try {
            if (!Server.fillBuffer(buffer, enu, obs)) {
                return;
            }
            CustomNpcs.ChannelPlayer.sendToServer(new FMLProxyPacket(buffer, "CustomNPCsPlayer"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void dialogSelected(final int dialogId, final int optionId, final EntityPlayerMP player, final EntityNPCInterface npc) {
        final Dialog dialog = DialogController.instance.dialogs.get(dialogId);
        if (dialog == null) {
            return;
        }
        npc.script.callScript(EnumScriptType.DIALOG_OPTION, "player", player, "dialog", dialogId, "option", optionId + 1);
        if (!dialog.hasDialogs((EntityPlayer)player) && !dialog.hasOtherOptions()) {
            return;
        }
        final DialogOption option = dialog.options.get(optionId);
        if (option == null || (option.optionType == EnumOptionType.DialogOption && (!option.isAvailable((EntityPlayer)player) || !option.hasDialog())) || option.optionType == EnumOptionType.Disabled || option.optionType == EnumOptionType.QuitOption) {
            return;
        }
        if (option.optionType == EnumOptionType.RoleOption) {
            if (npc.roleInterface != null) {
                npc.roleInterface.interact((EntityPlayer)player);
            }
            else {
                Server.sendData(player, EnumPacketClient.GUI_CLOSE, new Object[0]);
            }
        }
        else if (option.optionType == EnumOptionType.DialogOption) {
            NoppesUtilServer.openDialog((EntityPlayer)player, npc, option.getDialog());
        }
        else if (option.optionType == EnumOptionType.CommandBlock) {
            Server.sendData(player, EnumPacketClient.GUI_CLOSE, new Object[0]);
            NoppesUtilServer.runCommand((EntityPlayer)player, npc.getCommandSenderName(), option.command);
        }
        else {
            Server.sendData(player, EnumPacketClient.GUI_CLOSE, new Object[0]);
        }
    }
    
    public static void sendQuestLogData(final EntityPlayerMP player) {
        if (!PlayerQuestController.hasActiveQuests((EntityPlayer)player)) {
            return;
        }
        final QuestLogData data = new QuestLogData();
        data.setData((EntityPlayer)player);
        Server.sendData(player, EnumPacketClient.GUI_DATA, data.writeNBT());
    }
    
    public static void questCompletion(final EntityPlayerMP player, final int questId) {
        final PlayerQuestData playerdata = PlayerDataController.instance.getPlayerData((EntityPlayer)player).questData;
        final QuestData data = playerdata.activeQuests.get(questId);
        if (data == null) {
            return;
        }
        if (!data.quest.questInterface.isCompleted((EntityPlayer)player)) {
            return;
        }
        data.quest.questInterface.handleComplete((EntityPlayer)player);
        if (data.quest.rewardExp > 0) {
            player.worldObj.playSoundAtEntity((Entity)player, "random.orb", 0.1f, 0.5f * ((player.worldObj.rand.nextFloat() - player.worldObj.rand.nextFloat()) * 0.7f + 1.8f));
            player.addExperience(data.quest.rewardExp);
        }
        data.quest.factionOptions.addPoints((EntityPlayer)player);
        if (data.quest.mail.isValid()) {
            PlayerDataController.instance.addPlayerMessage(player.getCommandSenderName(), data.quest.mail);
        }
        if (!data.quest.randomReward) {
            for (final ItemStack item : data.quest.rewardItems.items.values()) {
                NoppesUtilServer.GivePlayerItem((Entity)player, (EntityPlayer)player, item);
            }
        }
        else {
            final List<ItemStack> list = new ArrayList<ItemStack>();
            for (final ItemStack item2 : data.quest.rewardItems.items.values()) {
                if (item2 != null && item2.getItem() != null) {
                    list.add(item2);
                }
            }
            if (!list.isEmpty()) {
                NoppesUtilServer.GivePlayerItem((Entity)player, (EntityPlayer)player, list.get(player.getRNG().nextInt(list.size())));
            }
        }
        if (!data.quest.command.isEmpty()) {
            NoppesUtilServer.runCommand((EntityPlayer)player, "QuestCompletion", data.quest.command);
        }
        PlayerQuestController.setQuestFinished(data.quest, (EntityPlayer)player);
        if (data.quest.hasNewQuest()) {
            PlayerQuestController.addActiveQuest(data.quest.getNextQuest(), (EntityPlayer)player);
        }
    }
    
    public static boolean compareItems(final ItemStack item, final ItemStack item2, final boolean ignoreDamage, final boolean ignoreNBT) {
        if (item2 == null || item == null) {
            return false;
        }
        final boolean oreMatched = false;
        OreDictionary.itemMatches(item, item2, false);
        final int[] ids = OreDictionary.getOreIDs(item);
        if (ids.length > 0) {
            for (final int id : ids) {
                boolean match1 = false;
                boolean match2 = false;
                for (final ItemStack is : OreDictionary.getOres(id)) {
                    if (compareItemDetails(item, is, ignoreDamage, ignoreNBT)) {
                        match1 = true;
                    }
                    if (compareItemDetails(item2, is, ignoreDamage, ignoreNBT)) {
                        match2 = true;
                    }
                }
                if (match1 && match2) {
                    return true;
                }
            }
        }
        return compareItemDetails(item, item2, ignoreDamage, ignoreNBT);
    }
    
    private static boolean compareItemDetails(final ItemStack item, final ItemStack item2, final boolean ignoreDamage, final boolean ignoreNBT) {
        return item.getItem() == item2.getItem() && (ignoreDamage || item.getItemDamage() == -1 || item.getItemDamage() == item2.getItemDamage()) && (ignoreNBT || item.stackTagCompound == null || (item2.stackTagCompound != null && item.stackTagCompound.equals((Object)item2.stackTagCompound))) && (ignoreNBT || item2.stackTagCompound == null || item.stackTagCompound != null);
    }
    
    public static boolean compareItems(final EntityPlayer player, final ItemStack item, final boolean ignoreDamage, final boolean ignoreNBT) {
        int size = 0;
        for (final ItemStack is : player.inventory.mainInventory) {
            if (is != null && compareItems(item, is, ignoreDamage, false)) {
                size += is.stackSize;
            }
        }
        return size >= item.stackSize;
    }
    
    public static void consumeItem(final EntityPlayer player, final ItemStack item, final boolean ignoreDamage, final boolean ignoreNBT) {
        if (item == null) {
            return;
        }
        int size = item.stackSize;
        for (int i = 0; i < player.inventory.mainInventory.length; ++i) {
            final ItemStack is = player.inventory.mainInventory[i];
            if (is != null) {
                if (compareItems(item, is, ignoreDamage, ignoreNBT)) {
                    if (size < is.stackSize) {
                        player.inventory.mainInventory[i].splitStack(size);
                        break;
                    }
                    size -= is.stackSize;
                    player.inventory.mainInventory[i] = null;
                }
            }
        }
    }
}

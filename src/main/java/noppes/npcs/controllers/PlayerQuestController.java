// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import java.util.Vector;
import java.util.Iterator;
import noppes.npcs.quests.QuestDialog;
import noppes.npcs.constants.EnumQuestType;
import noppes.npcs.constants.EnumQuestRepeat;
import noppes.npcs.Server;
import noppes.npcs.constants.EnumPacketClient;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;

public class PlayerQuestController
{
    public static boolean hasActiveQuests(final EntityPlayer player) {
        final PlayerQuestData data = PlayerDataController.instance.getPlayerData(player).questData;
        return !data.activeQuests.isEmpty();
    }
    
    public static boolean isQuestActive(final EntityPlayer player, final int quest) {
        final PlayerQuestData data = PlayerDataController.instance.getPlayerData(player).questData;
        return data.activeQuests.containsKey(quest);
    }
    
    public static boolean isQuestFinished(final EntityPlayer player, final int questid) {
        final PlayerQuestData data = PlayerDataController.instance.getPlayerData(player).questData;
        return data.finishedQuests.containsKey(questid);
    }
    
    public static void addActiveQuest(final Quest quest, final EntityPlayer player) {
        final PlayerQuestData data = PlayerDataController.instance.getPlayerData(player).questData;
        if (canQuestBeAccepted(quest, player)) {
            data.activeQuests.put(quest.id, new QuestData(quest));
            Server.sendData((EntityPlayerMP)player, EnumPacketClient.MESSAGE, "quest.newquest", quest.title);
            Server.sendData((EntityPlayerMP)player, EnumPacketClient.CHAT, "quest.newquest", ": ", quest.title);
        }
    }
    
    public static void setQuestFinished(final Quest quest, final EntityPlayer player) {
        final PlayerData playerdata = PlayerDataController.instance.getPlayerData(player);
        final PlayerQuestData data = playerdata.questData;
        data.activeQuests.remove(quest.id);
        if (quest.repeat == EnumQuestRepeat.RLDAILY || quest.repeat == EnumQuestRepeat.RLWEEKLY) {
            data.finishedQuests.put(quest.id, System.currentTimeMillis());
        }
        else {
            data.finishedQuests.put(quest.id, player.worldObj.getTotalWorldTime());
        }
        if (quest.repeat != EnumQuestRepeat.NONE && quest.type == EnumQuestType.Dialog) {
            final QuestDialog questdialog = (QuestDialog)quest.questInterface;
            for (final int dialog : questdialog.dialogs.values()) {
                playerdata.dialogData.dialogsRead.remove(dialog);
            }
        }
    }
    
    public static boolean canQuestBeAccepted(final Quest quest, final EntityPlayer player) {
        if (quest == null) {
            return false;
        }
        final PlayerQuestData data = PlayerDataController.instance.getPlayerData(player).questData;
        if (data.activeQuests.containsKey(quest.id)) {
            return false;
        }
        if (!data.finishedQuests.containsKey(quest.id) || quest.repeat == EnumQuestRepeat.REPEATABLE) {
            return true;
        }
        if (quest.repeat == EnumQuestRepeat.NONE) {
            return false;
        }
        final long questTime = data.finishedQuests.get(quest.id);
        if (quest.repeat == EnumQuestRepeat.MCDAILY) {
            return player.worldObj.getTotalWorldTime() - questTime >= 24000L;
        }
        if (quest.repeat == EnumQuestRepeat.MCWEEKLY) {
            return player.worldObj.getTotalWorldTime() - questTime >= 168000L;
        }
        if (quest.repeat == EnumQuestRepeat.RLDAILY) {
            return System.currentTimeMillis() - questTime >= 86400000L;
        }
        return quest.repeat == EnumQuestRepeat.RLWEEKLY && System.currentTimeMillis() - questTime >= 604800000L;
    }
    
    public static Vector<Quest> getActiveQuests(final EntityPlayer player) {
        final Vector<Quest> quests = new Vector<Quest>();
        final PlayerQuestData data = PlayerDataController.instance.getPlayerData(player).questData;
        for (final QuestData questdata : data.activeQuests.values()) {
            if (questdata.quest == null) {
                continue;
            }
            quests.add(questdata.quest);
        }
        return quests;
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import noppes.npcs.quests.QuestInterface;
import noppes.npcs.Server;
import noppes.npcs.constants.EnumPacketClient;
import net.minecraft.entity.player.EntityPlayerMP;
import noppes.npcs.constants.EnumQuestType;
import noppes.npcs.constants.EnumQuestCompletion;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Iterator;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.util.HashMap;

public class PlayerQuestData
{
    public HashMap<Integer, QuestData> activeQuests;
    public HashMap<Integer, Long> finishedQuests;
    
    public PlayerQuestData() {
        this.activeQuests = new HashMap<Integer, QuestData>();
        this.finishedQuests = new HashMap<Integer, Long>();
    }
    
    public void loadNBTData(final NBTTagCompound mainCompound) {
        if (mainCompound == null) {
            return;
        }
        final NBTTagCompound compound = mainCompound.getCompoundTag("QuestData");
        final NBTTagList list = compound.getTagList("CompletedQuests", 10);
        if (list != null) {
            final HashMap<Integer, Long> finishedQuests = new HashMap<Integer, Long>();
            for (int i = 0; i < list.tagCount(); ++i) {
                final NBTTagCompound nbttagcompound = list.getCompoundTagAt(i);
                finishedQuests.put(nbttagcompound.getInteger("Quest"), nbttagcompound.getLong("Date"));
            }
            this.finishedQuests = finishedQuests;
        }
        final NBTTagList list2 = compound.getTagList("ActiveQuests", 10);
        if (list2 != null) {
            final HashMap<Integer, QuestData> activeQuests = new HashMap<Integer, QuestData>();
            for (int j = 0; j < list2.tagCount(); ++j) {
                final NBTTagCompound nbttagcompound2 = list2.getCompoundTagAt(j);
                final int id = nbttagcompound2.getInteger("Quest");
                final Quest quest = QuestController.instance.quests.get(id);
                if (quest != null) {
                    final QuestData data = new QuestData(quest);
                    data.readEntityFromNBT(nbttagcompound2);
                    activeQuests.put(id, data);
                }
            }
            this.activeQuests = activeQuests;
        }
    }
    
    public void saveNBTData(final NBTTagCompound maincompound) {
        final NBTTagCompound compound = new NBTTagCompound();
        final NBTTagList list = new NBTTagList();
        for (final int quest : this.finishedQuests.keySet()) {
            final NBTTagCompound nbttagcompound = new NBTTagCompound();
            nbttagcompound.setInteger("Quest", quest);
            nbttagcompound.setLong("Date", (long)this.finishedQuests.get(quest));
            list.appendTag((NBTBase)nbttagcompound);
        }
        compound.setTag("CompletedQuests", (NBTBase)list);
        final NBTTagList list2 = new NBTTagList();
        for (final int quest2 : this.activeQuests.keySet()) {
            final NBTTagCompound nbttagcompound2 = new NBTTagCompound();
            nbttagcompound2.setInteger("Quest", quest2);
            this.activeQuests.get(quest2).writeEntityToNBT(nbttagcompound2);
            list2.appendTag((NBTBase)nbttagcompound2);
        }
        compound.setTag("ActiveQuests", (NBTBase)list2);
        maincompound.setTag("QuestData", (NBTBase)compound);
    }
    
    public QuestData getQuestCompletion(final EntityPlayer player, final EntityNPCInterface npc) {
        for (final QuestData data : this.activeQuests.values()) {
            final Quest quest = data.quest;
            if (quest != null && quest.completion == EnumQuestCompletion.Npc && quest.completerNpc.equals(npc.getCommandSenderName()) && quest.questInterface.isCompleted(player)) {
                return data;
            }
        }
        return null;
    }
    
    public boolean checkQuestCompletion(final EntityPlayer player, final EnumQuestType type) {
        boolean bo = false;
        for (final QuestData data : this.activeQuests.values()) {
            if (data.quest.type != type && type != null) {
                continue;
            }
            final QuestInterface inter = data.quest.questInterface;
            if (inter.isCompleted(player)) {
                if (data.isCompleted) {
                    continue;
                }
                if (!data.quest.complete(player, data)) {
                    Server.sendData((EntityPlayerMP)player, EnumPacketClient.MESSAGE, "quest.completed", data.quest.title);
                    Server.sendData((EntityPlayerMP)player, EnumPacketClient.CHAT, "quest.completed", ": ", data.quest.title);
                }
                data.isCompleted = true;
                bo = true;
            }
            else {
                data.isCompleted = false;
            }
        }
        return bo;
    }
}

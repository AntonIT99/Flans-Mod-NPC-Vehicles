// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import noppes.npcs.Server;
import noppes.npcs.constants.EnumPacketClient;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import noppes.npcs.quests.QuestLocation;
import noppes.npcs.quests.QuestKill;
import noppes.npcs.quests.QuestDialog;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.quests.QuestItem;
import noppes.npcs.VersionCompatibility;
import noppes.npcs.NpcMiscInventory;
import noppes.npcs.quests.QuestInterface;
import noppes.npcs.constants.EnumQuestCompletion;
import noppes.npcs.constants.EnumQuestRepeat;
import noppes.npcs.constants.EnumQuestType;
import noppes.npcs.ICompatibilty;

public class Quest implements ICompatibilty
{
    public int version;
    public int id;
    public EnumQuestType type;
    public EnumQuestRepeat repeat;
    public EnumQuestCompletion completion;
    public String title;
    public QuestCategory category;
    public String logText;
    public String completeText;
    public String completerNpc;
    public int nextQuestid;
    public String nextQuestTitle;
    public PlayerMail mail;
    public String command;
    public QuestInterface questInterface;
    public int rewardExp;
    public NpcMiscInventory rewardItems;
    public boolean randomReward;
    public FactionOptions factionOptions;
    
    public Quest() {
        this.version = VersionCompatibility.ModRev;
        this.id = -1;
        this.type = EnumQuestType.Item;
        this.repeat = EnumQuestRepeat.NONE;
        this.completion = EnumQuestCompletion.Npc;
        this.title = "default";
        this.logText = "";
        this.completeText = "";
        this.completerNpc = "";
        this.nextQuestid = -1;
        this.nextQuestTitle = "";
        this.mail = new PlayerMail();
        this.command = "";
        this.questInterface = new QuestItem();
        this.rewardExp = 0;
        this.rewardItems = new NpcMiscInventory(9);
        this.randomReward = false;
        this.factionOptions = new FactionOptions();
    }
    
    public void readNBT(final NBTTagCompound compound) {
        this.id = compound.getInteger("Id");
        this.readNBTPartial(compound);
    }
    
    public void readNBTPartial(final NBTTagCompound compound) {
        this.version = compound.getInteger("ModRev");
        VersionCompatibility.CheckAvailabilityCompatibility(this, compound);
        this.setType(EnumQuestType.values()[compound.getInteger("Type")]);
        this.title = compound.getString("Title");
        this.logText = compound.getString("Text");
        this.completeText = compound.getString("CompleteText");
        this.completerNpc = compound.getString("CompleterNpc");
        this.command = compound.getString("QuestCommand");
        this.nextQuestid = compound.getInteger("NextQuestId");
        this.nextQuestTitle = compound.getString("NextQuestTitle");
        if (this.hasNewQuest()) {
            this.nextQuestTitle = this.getNextQuest().title;
        }
        else {
            this.nextQuestTitle = "";
        }
        this.randomReward = compound.getBoolean("RandomReward");
        this.rewardExp = compound.getInteger("RewardExp");
        this.rewardItems.setFromNBT(compound.getCompoundTag("Rewards"));
        this.completion = EnumQuestCompletion.values()[compound.getInteger("QuestCompletion")];
        this.repeat = EnumQuestRepeat.values()[compound.getInteger("QuestRepeat")];
        this.questInterface.readEntityFromNBT(compound);
        this.factionOptions.readFromNBT(compound.getCompoundTag("QuestFactionPoints"));
        this.mail.readNBT(compound.getCompoundTag("QuestMail"));
    }
    
    public void setType(final EnumQuestType questType) {
        this.type = questType;
        if (this.type == EnumQuestType.Item) {
            this.questInterface = new QuestItem();
        }
        else if (this.type == EnumQuestType.Dialog) {
            this.questInterface = new QuestDialog();
        }
        else if (this.type == EnumQuestType.Kill || this.type == EnumQuestType.AreaKill) {
            this.questInterface = new QuestKill();
        }
        else if (this.type == EnumQuestType.Location) {
            this.questInterface = new QuestLocation();
        }
        if (this.questInterface != null) {
            this.questInterface.questId = this.id;
        }
    }
    
    @Override
    public NBTTagCompound writeToNBT(final NBTTagCompound compound) {
        compound.setInteger("Id", this.id);
        return this.writeToNBTPartial(compound);
    }
    
    public NBTTagCompound writeToNBTPartial(final NBTTagCompound compound) {
        compound.setInteger("ModRev", this.version);
        compound.setInteger("Type", this.type.ordinal());
        compound.setString("Title", this.title);
        compound.setString("Text", this.logText);
        compound.setString("CompleteText", this.completeText);
        compound.setString("CompleterNpc", this.completerNpc);
        compound.setInteger("NextQuestId", this.nextQuestid);
        compound.setString("NextQuestTitle", this.nextQuestTitle);
        compound.setInteger("RewardExp", this.rewardExp);
        compound.setTag("Rewards", (NBTBase)this.rewardItems.getToNBT());
        compound.setString("QuestCommand", this.command);
        compound.setBoolean("RandomReward", this.randomReward);
        compound.setInteger("QuestCompletion", this.completion.ordinal());
        compound.setInteger("QuestRepeat", this.repeat.ordinal());
        this.questInterface.writeEntityToNBT(compound);
        compound.setTag("QuestFactionPoints", (NBTBase)this.factionOptions.writeToNBT(new NBTTagCompound()));
        compound.setTag("QuestMail", (NBTBase)this.mail.writeNBT());
        return compound;
    }
    
    public boolean hasNewQuest() {
        return this.getNextQuest() != null;
    }
    
    public Quest getNextQuest() {
        return (QuestController.instance == null) ? null : QuestController.instance.quests.get(this.nextQuestid);
    }
    
    public boolean complete(final EntityPlayer player, final QuestData data) {
        if (this.completion == EnumQuestCompletion.Instant) {
            Server.sendData((EntityPlayerMP)player, EnumPacketClient.QUEST_COMPLETION, data.quest.writeToNBT(new NBTTagCompound()));
            return true;
        }
        return false;
    }
    
    public Quest copy() {
        final Quest quest = new Quest();
        quest.readNBT(this.writeToNBT(new NBTTagCompound()));
        return quest;
    }
    
    @Override
    public int getVersion() {
        return this.version;
    }
    
    @Override
    public void setVersion(final int version) {
        this.version = version;
    }
}

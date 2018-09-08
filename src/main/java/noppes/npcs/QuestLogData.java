// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import java.util.Iterator;
import noppes.npcs.constants.EnumQuestCompletion;
import noppes.npcs.controllers.Quest;
import noppes.npcs.controllers.PlayerQuestController;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Vector;
import java.util.HashMap;

public class QuestLogData
{
    public HashMap<String, Vector<String>> categories;
    public String selectedQuest;
    public String selectedCategory;
    public HashMap<String, String> questText;
    public HashMap<String, Vector<String>> questStatus;
    public HashMap<String, String> finish;
    
    public QuestLogData() {
        this.categories = new HashMap<String, Vector<String>>();
        this.selectedQuest = "";
        this.selectedCategory = "";
        this.questText = new HashMap<String, String>();
        this.questStatus = new HashMap<String, Vector<String>>();
        this.finish = new HashMap<String, String>();
    }
    
    public NBTTagCompound writeNBT() {
        final NBTTagCompound compound = new NBTTagCompound();
        compound.setTag("Categories", (NBTBase)NBTTags.nbtVectorMap(this.categories));
        compound.setTag("Logs", (NBTBase)NBTTags.nbtStringStringMap(this.questText));
        compound.setTag("Status", (NBTBase)NBTTags.nbtVectorMap(this.questStatus));
        compound.setTag("QuestFinisher", (NBTBase)NBTTags.nbtStringStringMap(this.finish));
        return compound;
    }
    
    public void readNBT(final NBTTagCompound compound) {
        this.categories = NBTTags.getVectorMap(compound.getTagList("Categories", 10));
        this.questText = NBTTags.getStringStringMap(compound.getTagList("Logs", 10));
        this.questStatus = NBTTags.getVectorMap(compound.getTagList("Status", 10));
        this.finish = NBTTags.getStringStringMap(compound.getTagList("QuestFinisher", 10));
    }
    
    public void setData(final EntityPlayer player) {
        for (final Quest quest : PlayerQuestController.getActiveQuests(player)) {
            final String category = quest.category.title;
            if (!this.categories.containsKey(category)) {
                this.categories.put(category, new Vector<String>());
            }
            final Vector<String> list = this.categories.get(category);
            list.add(quest.title);
            this.questText.put(category + ":" + quest.title, quest.logText);
            this.questStatus.put(category + ":" + quest.title, quest.questInterface.getQuestLogStatus(player));
            if (quest.completion == EnumQuestCompletion.Npc && quest.questInterface.isCompleted(player)) {
                this.finish.put(category + ":" + quest.title, quest.completerNpc);
            }
        }
    }
    
    public boolean hasSelectedQuest() {
        return !this.selectedQuest.isEmpty();
    }
    
    public String getQuestText() {
        return this.questText.get(this.selectedCategory + ":" + this.selectedQuest);
    }
    
    public Vector<String> getQuestStatus() {
        return this.questStatus.get(this.selectedCategory + ":" + this.selectedQuest);
    }
    
    public String getComplete() {
        return this.finish.get(this.selectedCategory + ":" + this.selectedQuest);
    }
}

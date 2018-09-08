// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.quests;

import java.util.Vector;
import java.util.Iterator;
import noppes.npcs.controllers.PlayerQuestData;
import noppes.npcs.controllers.QuestData;
import noppes.npcs.controllers.PlayerDataController;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import noppes.npcs.NBTTags;
import net.minecraft.nbt.NBTTagCompound;
import java.util.HashMap;

public class QuestKill extends QuestInterface
{
    public HashMap<String, Integer> targets;
    
    public QuestKill() {
        this.targets = new HashMap<String, Integer>();
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound compound) {
        this.targets = NBTTags.getStringIntegerMap(compound.getTagList("QuestDialogs", 10));
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound compound) {
        compound.setTag("QuestDialogs", (NBTBase)NBTTags.nbtStringIntegerMap(this.targets));
    }
    
    @Override
    public boolean isCompleted(final EntityPlayer player) {
        final PlayerQuestData playerdata = PlayerDataController.instance.getPlayerData(player).questData;
        final QuestData data = playerdata.activeQuests.get(this.questId);
        if (data == null) {
            return false;
        }
        final HashMap<String, Integer> killed = this.getKilled(data);
        if (killed.size() != this.targets.size()) {
            return false;
        }
        for (final String entity : killed.keySet()) {
            if (!this.targets.containsKey(entity) || this.targets.get(entity) > killed.get(entity)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void handleComplete(final EntityPlayer player) {
    }
    
    @Override
    public Vector<String> getQuestLogStatus(final EntityPlayer player) {
        final Vector<String> vec = new Vector<String>();
        final PlayerQuestData playerdata = PlayerDataController.instance.getPlayerData(player).questData;
        final QuestData data = playerdata.activeQuests.get(this.questId);
        if (data == null) {
            return vec;
        }
        final HashMap<String, Integer> killed = this.getKilled(data);
        for (final String entityName : this.targets.keySet()) {
            int amount = 0;
            if (killed.containsKey(entityName)) {
                amount = killed.get(entityName);
            }
            final String state = amount + "/" + this.targets.get(entityName);
            vec.add(entityName + ": " + state);
        }
        return vec;
    }
    
    public HashMap<String, Integer> getKilled(final QuestData data) {
        return NBTTags.getStringIntegerMap(data.extraData.getTagList("Killed", 10));
    }
    
    public void setKilled(final QuestData data, final HashMap<String, Integer> killed) {
        data.extraData.setTag("Killed", (NBTBase)NBTTags.nbtStringIntegerMap(killed));
    }
}

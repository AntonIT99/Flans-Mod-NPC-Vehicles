// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.quests;

import net.minecraft.util.StatCollector;
import java.util.Vector;
import noppes.npcs.controllers.PlayerQuestData;
import noppes.npcs.controllers.QuestData;
import noppes.npcs.controllers.PlayerDataController;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public class QuestLocation extends QuestInterface
{
    public String location;
    public String location2;
    public String location3;
    
    public QuestLocation() {
        this.location = "";
        this.location2 = "";
        this.location3 = "";
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound compound) {
        this.location = compound.getString("QuestLocation");
        this.location2 = compound.getString("QuestLocation2");
        this.location3 = compound.getString("QuestLocation3");
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound compound) {
        compound.setString("QuestLocation", this.location);
        compound.setString("QuestLocation2", this.location2);
        compound.setString("QuestLocation3", this.location3);
    }
    
    @Override
    public boolean isCompleted(final EntityPlayer player) {
        final PlayerQuestData playerdata = PlayerDataController.instance.getPlayerData(player).questData;
        final QuestData data = playerdata.activeQuests.get(this.questId);
        return data != null && this.getFound(data, 0);
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
        final String found = StatCollector.translateToLocal("quest.found");
        final String notfound = StatCollector.translateToLocal("quest.notfound");
        if (!this.location.isEmpty()) {
            vec.add(this.location + ": " + (this.getFound(data, 1) ? found : notfound));
        }
        if (!this.location2.isEmpty()) {
            vec.add(this.location2 + ": " + (this.getFound(data, 2) ? found : notfound));
        }
        if (!this.location3.isEmpty()) {
            vec.add(this.location3 + ": " + (this.getFound(data, 3) ? found : notfound));
        }
        return vec;
    }
    
    public boolean getFound(final QuestData data, final int i) {
        if (i == 1) {
            return data.extraData.getBoolean("LocationFound");
        }
        if (i == 2) {
            return data.extraData.getBoolean("Location2Found");
        }
        if (i == 3) {
            return data.extraData.getBoolean("Location3Found");
        }
        return (this.location.isEmpty() || data.extraData.getBoolean("LocationFound")) && (this.location2.isEmpty() || data.extraData.getBoolean("Location2Found")) && (this.location3.isEmpty() || data.extraData.getBoolean("Location3Found"));
    }
    
    public boolean setFound(final QuestData data, final String location) {
        if (location.equalsIgnoreCase(this.location) && !data.extraData.getBoolean("LocationFound")) {
            data.extraData.setBoolean("LocationFound", true);
            return true;
        }
        if (location.equalsIgnoreCase(this.location2) && !data.extraData.getBoolean("LocationFound2")) {
            data.extraData.setBoolean("Location2Found", true);
            return true;
        }
        if (location.equalsIgnoreCase(this.location3) && !data.extraData.getBoolean("LocationFound3")) {
            data.extraData.setBoolean("Location3Found", true);
            return true;
        }
        return false;
    }
}

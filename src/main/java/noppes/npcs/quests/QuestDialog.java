// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.quests;

import noppes.npcs.controllers.DialogController;
import noppes.npcs.controllers.Dialog;
import java.util.Vector;
import java.util.Iterator;
import noppes.npcs.controllers.PlayerDataController;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import noppes.npcs.NBTTags;
import net.minecraft.nbt.NBTTagCompound;
import java.util.HashMap;

public class QuestDialog extends QuestInterface
{
    public HashMap<Integer, Integer> dialogs;
    
    public QuestDialog() {
        this.dialogs = new HashMap<Integer, Integer>();
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound compound) {
        this.dialogs = NBTTags.getIntegerIntegerMap(compound.getTagList("QuestDialogs", 10));
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound compound) {
        compound.setTag("QuestDialogs", (NBTBase)NBTTags.nbtIntegerIntegerMap(this.dialogs));
    }
    
    @Override
    public boolean isCompleted(final EntityPlayer player) {
        for (final int dialogId : this.dialogs.values()) {
            if (!PlayerDataController.instance.getPlayerData(player).dialogData.dialogsRead.contains(dialogId)) {
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
        for (final int dialogId : this.dialogs.values()) {
            final Dialog dialog = DialogController.instance.dialogs.get(dialogId);
            if (dialog == null) {
                continue;
            }
            String title = dialog.title;
            if (PlayerDataController.instance.getPlayerData(player).dialogData.dialogsRead.contains(dialogId)) {
                title += " (read)";
            }
            else {
                title += " (unread)";
            }
            vec.add(title);
        }
        return vec;
    }
}

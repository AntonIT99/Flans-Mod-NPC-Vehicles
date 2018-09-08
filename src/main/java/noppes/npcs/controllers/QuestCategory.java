// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import java.util.Iterator;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.util.HashMap;

public class QuestCategory
{
    public HashMap<Integer, Quest> quests;
    public int id;
    public String title;
    
    public QuestCategory() {
        this.id = -1;
        this.title = "";
        this.quests = new HashMap<Integer, Quest>();
    }
    
    public void readNBT(final NBTTagCompound nbttagcompound) {
        this.id = nbttagcompound.getInteger("Slot");
        this.title = nbttagcompound.getString("Title");
        final NBTTagList dialogsList = nbttagcompound.getTagList("Dialogs", 10);
        if (dialogsList != null) {
            for (int ii = 0; ii < dialogsList.tagCount(); ++ii) {
                final NBTTagCompound nbttagcompound2 = dialogsList.getCompoundTagAt(ii);
                final Quest quest = new Quest();
                quest.readNBT(nbttagcompound2);
                quest.category = this;
                this.quests.put(quest.id, quest);
            }
        }
    }
    
    public NBTTagCompound writeNBT(final NBTTagCompound nbttagcompound) {
        nbttagcompound.setInteger("Slot", this.id);
        nbttagcompound.setString("Title", this.title);
        final NBTTagList dialogs = new NBTTagList();
        for (final int dialogId : this.quests.keySet()) {
            final Quest quest = this.quests.get(dialogId);
            dialogs.appendTag((NBTBase)quest.writeToNBT(new NBTTagCompound()));
        }
        nbttagcompound.setTag("Dialogs", (NBTBase)dialogs);
        return nbttagcompound;
    }
}

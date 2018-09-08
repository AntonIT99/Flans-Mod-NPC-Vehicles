// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import java.util.Iterator;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.util.HashMap;

public class DialogCategory
{
    public int id;
    public String title;
    public HashMap<Integer, Dialog> dialogs;
    
    public DialogCategory() {
        this.id = -1;
        this.title = "";
        this.dialogs = new HashMap<Integer, Dialog>();
    }
    
    public void readNBT(final NBTTagCompound compound) {
        this.id = compound.getInteger("Slot");
        this.title = compound.getString("Title");
        final NBTTagList dialogsList = compound.getTagList("Dialogs", 10);
        if (dialogsList != null) {
            for (int ii = 0; ii < dialogsList.tagCount(); ++ii) {
                final Dialog dialog = new Dialog();
                dialog.category = this;
                final NBTTagCompound comp = dialogsList.getCompoundTagAt(ii);
                dialog.readNBT(comp);
                dialog.id = comp.getInteger("DialogId");
                this.dialogs.put(dialog.id, dialog);
            }
        }
    }
    
    public NBTTagCompound writeNBT(final NBTTagCompound nbtfactions) {
        nbtfactions.setInteger("Slot", this.id);
        nbtfactions.setString("Title", this.title);
        final NBTTagList dialogs = new NBTTagList();
        for (final Dialog dialog : this.dialogs.values()) {
            dialogs.appendTag((NBTBase)dialog.writeToNBT(new NBTTagCompound()));
        }
        nbtfactions.setTag("Dialogs", (NBTBase)dialogs);
        return nbtfactions;
    }
}

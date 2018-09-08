// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import java.util.Iterator;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.util.ArrayList;

public class PlayerMailData
{
    public ArrayList<PlayerMail> playermail;
    
    public PlayerMailData() {
        this.playermail = new ArrayList<PlayerMail>();
    }
    
    public void loadNBTData(final NBTTagCompound compound) {
        final ArrayList<PlayerMail> newmail = new ArrayList<PlayerMail>();
        final NBTTagList list = compound.getTagList("MailData", 10);
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.tagCount(); ++i) {
            final PlayerMail mail = new PlayerMail();
            mail.readNBT(list.getCompoundTagAt(i));
            newmail.add(mail);
        }
        this.playermail = newmail;
    }
    
    public NBTTagCompound saveNBTData(final NBTTagCompound compound) {
        final NBTTagList list = new NBTTagList();
        for (final PlayerMail mail : this.playermail) {
            list.appendTag((NBTBase)mail.writeNBT());
        }
        compound.setTag("MailData", (NBTBase)list);
        return compound;
    }
    
    public boolean hasMail() {
        for (final PlayerMail mail : this.playermail) {
            if (!mail.beenRead) {
                return true;
            }
        }
        return false;
    }
}

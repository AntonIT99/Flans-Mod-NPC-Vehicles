// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Iterator;
import noppes.npcs.constants.EnumOptionType;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.VersionCompatibility;
import java.util.HashMap;
import noppes.npcs.ICompatibilty;

public class Dialog implements ICompatibilty
{
    public int version;
    public int id;
    public String title;
    public String text;
    public int quest;
    public DialogCategory category;
    public HashMap<Integer, DialogOption> options;
    public Availability availability;
    public FactionOptions factionOptions;
    public String sound;
    public String command;
    public PlayerMail mail;
    public boolean hideNPC;
    public boolean showWheel;
    public boolean disableEsc;
    
    public Dialog() {
        this.version = VersionCompatibility.ModRev;
        this.id = -1;
        this.title = "";
        this.text = "";
        this.quest = -1;
        this.options = new HashMap<Integer, DialogOption>();
        this.availability = new Availability();
        this.factionOptions = new FactionOptions();
        this.command = "";
        this.mail = new PlayerMail();
        this.hideNPC = false;
        this.showWheel = false;
        this.disableEsc = false;
    }
    
    public boolean hasDialogs(final EntityPlayer player) {
        for (final DialogOption option : this.options.values()) {
            if (option != null && option.optionType == EnumOptionType.DialogOption && option.hasDialog() && option.isAvailable(player)) {
                return true;
            }
        }
        return false;
    }
    
    public void readNBT(final NBTTagCompound compound) {
        this.id = compound.getInteger("DialogId");
        this.readNBTPartial(compound);
    }
    
    public void readNBTPartial(final NBTTagCompound compound) {
        this.version = compound.getInteger("ModRev");
        VersionCompatibility.CheckAvailabilityCompatibility(this, compound);
        this.title = compound.getString("DialogTitle");
        this.text = compound.getString("DialogText");
        this.quest = compound.getInteger("DialogQuest");
        this.sound = compound.getString("DialogSound");
        this.command = compound.getString("DialogCommand");
        this.mail.readNBT(compound.getCompoundTag("DialogMail"));
        this.hideNPC = compound.getBoolean("DialogHideNPC");
        if (compound.hasKey("DialogShowWheel")) {
            this.showWheel = compound.getBoolean("DialogShowWheel");
        }
        else {
            this.showWheel = true;
        }
        this.disableEsc = compound.getBoolean("DialogDisableEsc");
        final NBTTagList options = compound.getTagList("Options", 10);
        final HashMap<Integer, DialogOption> newoptions = new HashMap<Integer, DialogOption>();
        for (int iii = 0; iii < options.tagCount(); ++iii) {
            final NBTTagCompound option = options.getCompoundTagAt(iii);
            final int opslot = option.getInteger("OptionSlot");
            final DialogOption dia = new DialogOption();
            dia.readNBT(option.getCompoundTag("Option"));
            newoptions.put(opslot, dia);
        }
        this.options = newoptions;
        this.availability.readFromNBT(compound);
        this.factionOptions.readFromNBT(compound);
    }
    
    @Override
    public NBTTagCompound writeToNBT(final NBTTagCompound compound) {
        compound.setInteger("DialogId", this.id);
        return this.writeToNBTPartial(compound);
    }
    
    public NBTTagCompound writeToNBTPartial(final NBTTagCompound compound) {
        compound.setString("DialogTitle", this.title);
        compound.setString("DialogText", this.text);
        compound.setInteger("DialogQuest", this.quest);
        compound.setString("DialogCommand", this.command);
        compound.setTag("DialogMail", (NBTBase)this.mail.writeNBT());
        compound.setBoolean("DialogHideNPC", this.hideNPC);
        compound.setBoolean("DialogShowWheel", this.showWheel);
        compound.setBoolean("DialogDisableEsc", this.disableEsc);
        if (this.sound != null && !this.sound.isEmpty()) {
            compound.setString("DialogSound", this.sound);
        }
        final NBTTagList options = new NBTTagList();
        for (final int opslot : this.options.keySet()) {
            final NBTTagCompound listcompound = new NBTTagCompound();
            listcompound.setInteger("OptionSlot", opslot);
            listcompound.setTag("Option", (NBTBase)this.options.get(opslot).writeNBT());
            options.appendTag((NBTBase)listcompound);
        }
        compound.setTag("Options", (NBTBase)options);
        this.availability.writeToNBT(compound);
        this.factionOptions.writeToNBT(compound);
        compound.setInteger("ModRev", this.version);
        return compound;
    }
    
    public boolean hasQuest() {
        return this.getQuest() != null;
    }
    
    public Quest getQuest() {
        return QuestController.instance.quests.get(this.quest);
    }
    
    public boolean hasOtherOptions() {
        for (final DialogOption option : this.options.values()) {
            if (option != null && option.optionType != EnumOptionType.Disabled) {
                return true;
            }
        }
        return false;
    }
    
    public Dialog copy(final EntityPlayer player) {
        final Dialog dialog = new Dialog();
        dialog.id = this.id;
        dialog.text = this.text;
        dialog.title = this.title;
        dialog.category = this.category;
        dialog.quest = this.quest;
        dialog.sound = this.sound;
        dialog.mail = this.mail;
        dialog.command = this.command;
        dialog.hideNPC = this.hideNPC;
        dialog.showWheel = this.showWheel;
        dialog.disableEsc = this.disableEsc;
        for (final int slot : this.options.keySet()) {
            final DialogOption option = this.options.get(slot);
            if (option.optionType == EnumOptionType.DialogOption) {
                if (!option.hasDialog()) {
                    continue;
                }
                if (!option.isAvailable(player)) {
                    continue;
                }
            }
            dialog.options.put(slot, option);
        }
        return dialog;
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

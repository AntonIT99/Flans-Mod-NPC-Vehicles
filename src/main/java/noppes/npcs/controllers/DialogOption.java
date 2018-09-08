// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.constants.EnumOptionType;

public class DialogOption
{
    public int dialogId;
    public String title;
    public EnumOptionType optionType;
    public int optionColor;
    public String command;
    
    public DialogOption() {
        this.dialogId = -1;
        this.title = "Talk";
        this.optionType = EnumOptionType.DialogOption;
        this.optionColor = 14737632;
        this.command = "";
    }
    
    public void readNBT(final NBTTagCompound compound) {
        if (compound == null) {
            return;
        }
        this.title = compound.getString("Title");
        this.dialogId = compound.getInteger("Dialog");
        this.optionColor = compound.getInteger("DialogColor");
        this.optionType = EnumOptionType.values()[compound.getInteger("OptionType")];
        this.command = compound.getString("DialogCommand");
        if (this.optionColor == 0) {
            this.optionColor = 14737632;
        }
    }
    
    public NBTTagCompound writeNBT() {
        final NBTTagCompound compound = new NBTTagCompound();
        compound.setString("Title", this.title);
        compound.setInteger("OptionType", this.optionType.ordinal());
        compound.setInteger("Dialog", this.dialogId);
        compound.setInteger("DialogColor", this.optionColor);
        compound.setString("DialogCommand", this.command);
        return compound;
    }
    
    public boolean hasDialog() {
        if (this.dialogId <= 0) {
            return false;
        }
        if (!DialogController.instance.hasDialog(this.dialogId)) {
            this.dialogId = -1;
            return false;
        }
        return true;
    }
    
    public Dialog getDialog() {
        if (!this.hasDialog()) {
            return null;
        }
        return DialogController.instance.dialogs.get(this.dialogId);
    }
    
    public boolean isAvailable(final EntityPlayer player) {
        final Dialog dialog = this.getDialog();
        return dialog != null && dialog.availability.isAvailable(player);
    }
}

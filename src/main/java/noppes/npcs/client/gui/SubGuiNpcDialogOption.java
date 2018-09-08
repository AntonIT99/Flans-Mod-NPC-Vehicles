// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import noppes.npcs.controllers.Dialog;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.constants.EnumOptionType;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.controllers.DialogOption;
import noppes.npcs.client.gui.util.ISubGuiListener;
import noppes.npcs.client.gui.util.GuiSelectionListener;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiNpcDialogOption extends SubGuiInterface implements IGuiData, ITextfieldListener, GuiSelectionListener, ISubGuiListener
{
    private DialogOption option;
    public static int LastColor;
    
    public SubGuiNpcDialogOption(final DialogOption option) {
        this.option = option;
        this.setBackground("menubg.png");
        this.xSize = 256;
        this.ySize = 216;
        this.closeOnEsc = true;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addLabel(new GuiNpcLabel(66, "dialog.editoption", this.guiLeft, this.guiTop + 4));
        this.getLabel(66).center(this.xSize);
        this.addLabel(new GuiNpcLabel(0, "gui.title", this.guiLeft + 4, this.guiTop + 20));
        this.addTextField(new GuiNpcTextField(0, this, this.fontRendererObj, this.guiLeft + 40, this.guiTop + 15, 196, 20, this.option.title));
        String color;
        for (color = Integer.toHexString(this.option.optionColor); color.length() < 6; color = 0 + color) {}
        this.addLabel(new GuiNpcLabel(2, "gui.color", this.guiLeft + 4, this.guiTop + 45));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 62, this.guiTop + 40, 92, 20, color));
        this.getButton(2).setTextColor(this.option.optionColor);
        this.addLabel(new GuiNpcLabel(1, "dialog.optiontype", this.guiLeft + 4, this.guiTop + 67));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 62, this.guiTop + 62, 92, 20, new String[] { "gui.close", "dialog.dialog", "gui.disabled", "menu.role", "tile.commandBlock.name" }, this.option.optionType.ordinal()));
        if (this.option.optionType == EnumOptionType.DialogOption) {
            this.addButton(new GuiNpcButton(3, this.guiLeft + 4, this.guiTop + 84, "availability.selectdialog"));
            if (this.option.dialogId >= 0) {
                Client.sendData(EnumPacketServer.DialogGet, this.option.dialogId);
            }
        }
        if (this.option.optionType == EnumOptionType.CommandBlock) {
            this.addTextField(new GuiNpcTextField(4, this, this.fontRendererObj, this.guiLeft + 4, this.guiTop + 84, 248, 20, this.option.command));
            this.getTextField(4).setMaxStringLength(32767);
            this.addLabel(new GuiNpcLabel(4, "advMode.command", this.guiLeft + 4, this.guiTop + 110));
            this.addLabel(new GuiNpcLabel(5, "advMode.nearestPlayer", this.guiLeft + 4, this.guiTop + 125));
            this.addLabel(new GuiNpcLabel(6, "advMode.randomPlayer", this.guiLeft + 4, this.guiTop + 140));
            this.addLabel(new GuiNpcLabel(7, "advMode.allPlayers", this.guiLeft + 4, this.guiTop + 155));
            this.addLabel(new GuiNpcLabel(8, "dialog.commandoptionplayer", this.guiLeft + 4, this.guiTop + 170));
        }
        this.addButton(new GuiNpcButton(66, this.guiLeft + 82, this.guiTop + 190, 98, 20, "gui.done"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 1) {
            this.option.optionType = EnumOptionType.values()[button.getValue()];
            this.initGui();
        }
        if (button.id == 2) {
            this.setSubGui(new SubGuiColorSelector(this.option.optionColor));
        }
        if (button.id == 3) {
            final GuiNPCDialogSelection gui = new GuiNPCDialogSelection(this.npc, this.getParent(), this.option.dialogId);
            gui.listener = this;
            NoppesUtil.openGUI((EntityPlayer)this.player, gui);
        }
        if (button.id == 66) {
            this.close();
        }
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textfield) {
        if (textfield.id == 0) {
            if (textfield.isEmpty()) {
                textfield.setText(this.option.title);
            }
            else {
                this.option.title = textfield.getText();
            }
        }
        if (textfield.id == 4) {
            this.option.command = textfield.getText();
        }
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        if (compound.hasKey("DialogId")) {
            final Dialog dialog = new Dialog();
            dialog.readNBT(compound);
            this.option.dialogId = dialog.id;
            if (this.getButton(3) != null) {
                this.getButton(3).setDisplayText(dialog.title);
            }
        }
    }
    
    @Override
    public void selected(final int ob, final String name) {
        this.option.dialogId = ob;
    }
    
    @Override
    public void subGuiClosed(final SubGuiInterface subgui) {
        final DialogOption option = this.option;
        final int color = ((SubGuiColorSelector)subgui).color;
        option.optionColor = color;
        SubGuiNpcDialogOption.LastColor = color;
        this.initGui();
    }
    
    static {
        SubGuiNpcDialogOption.LastColor = 14737632;
    }
}

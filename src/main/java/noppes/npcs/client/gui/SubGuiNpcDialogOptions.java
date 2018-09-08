// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.constants.EnumOptionType;
import noppes.npcs.controllers.DialogOption;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.controllers.Dialog;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiNpcDialogOptions extends SubGuiInterface
{
    private Dialog dialog;
    
    public SubGuiNpcDialogOptions(final Dialog dialog) {
        this.dialog = dialog;
        this.setBackground("menubg.png");
        this.xSize = 256;
        this.ySize = 216;
        this.closeOnEsc = true;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addLabel(new GuiNpcLabel(66, "dialog.options", this.guiLeft, this.guiTop + 4));
        this.getLabel(66).center(this.xSize);
        for (int i = 0; i < 6; ++i) {
            String optionString = "";
            final DialogOption option = this.dialog.options.get(i);
            if (option != null && option.optionType != EnumOptionType.Disabled) {
                optionString += option.title;
            }
            this.addLabel(new GuiNpcLabel(i + 10, i + 1 + ": ", this.guiLeft + 4, this.guiTop + 16 + i * 32));
            this.addLabel(new GuiNpcLabel(i, optionString, this.guiLeft + 14, this.guiTop + 12 + i * 32));
            this.addButton(new GuiNpcButton(i, this.guiLeft + 13, this.guiTop + 21 + i * 32, 60, 20, "selectServer.edit"));
        }
        this.addButton(new GuiNpcButton(66, this.guiLeft + 82, this.guiTop + 194, 98, 20, "gui.done"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id < 6) {
            DialogOption option = this.dialog.options.get(id);
            if (option == null) {
                this.dialog.options.put(id, option = new DialogOption());
                option.optionColor = SubGuiNpcDialogOption.LastColor;
            }
            this.setSubGui(new SubGuiNpcDialogOption(option));
        }
        if (id == 66) {
            this.close();
        }
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import noppes.npcs.controllers.PlayerMail;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButtonYesNo;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.controllers.Dialog;
import noppes.npcs.client.gui.util.ISubGuiListener;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiNpcDialogExtra extends SubGuiInterface implements ISubGuiListener
{
    private Dialog dialog;
    private int slot;
    public GuiScreen parent2;
    
    public SubGuiNpcDialogExtra(final Dialog dialog, final GuiScreen parent) {
        this.slot = 0;
        this.parent2 = parent;
        this.dialog = dialog;
        this.setBackground("menubg.png");
        this.xSize = 256;
        this.ySize = 216;
        this.closeOnEsc = true;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        int y = this.guiTop + 4;
        this.addButton(new GuiNpcButton(13, this.guiLeft + 4, y, 164, 20, "mailbox.setup"));
        this.addButton(new GuiNpcButton(14, this.guiLeft + 170, y, 20, 20, "X"));
        if (!this.dialog.mail.subject.isEmpty()) {
            this.getButton(13).setDisplayText(this.dialog.mail.subject);
        }
        final int i = 10;
        final int j = this.guiLeft + 120;
        y += 22;
        this.addButton(new GuiNpcButton(i, j, y, 50, 20, "selectServer.edit"));
        this.addLabel(new GuiNpcLabel(10, "advMode.command", this.guiLeft + 4, y + 5));
        final int id = 11;
        final int x = this.guiLeft + 120;
        y += 22;
        this.addButton(new GuiNpcButtonYesNo(id, x, y, this.dialog.hideNPC));
        this.addLabel(new GuiNpcLabel(11, "dialog.hideNPC", this.guiLeft + 4, y + 5));
        final int id2 = 12;
        final int x2 = this.guiLeft + 120;
        y += 22;
        this.addButton(new GuiNpcButtonYesNo(id2, x2, y, this.dialog.showWheel));
        this.addLabel(new GuiNpcLabel(12, "dialog.showWheel", this.guiLeft + 4, y + 5));
        final int id3 = 15;
        final int x3 = this.guiLeft + 120;
        y += 22;
        this.addButton(new GuiNpcButtonYesNo(id3, x3, y, this.dialog.disableEsc));
        this.addLabel(new GuiNpcLabel(15, "dialog.disableEsc", this.guiLeft + 4, y + 5));
        this.addButton(new GuiNpcButton(66, this.guiLeft + 82, this.guiTop + 192, 98, 20, "gui.done"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 10) {
            this.setSubGui(new SubGuiNpcCommand(this.dialog.command));
        }
        if (button.id == 11) {
            this.dialog.hideNPC = (button.getValue() == 1);
        }
        if (button.id == 12) {
            this.dialog.showWheel = (button.getValue() == 1);
        }
        if (button.id == 15) {
            this.dialog.disableEsc = (button.getValue() == 1);
        }
        if (button.id == 13) {
            this.setSubGui(new SubGuiMailmanSendSetup(this.dialog.mail, this.getParent()));
        }
        if (button.id == 14) {
            this.dialog.mail = new PlayerMail();
            this.initGui();
        }
        if (button.id == 66) {
            this.close();
            if (this.parent2 != null) {
                NoppesUtil.openGUI((EntityPlayer)this.player, this.parent2);
            }
        }
    }
    
    @Override
    public void subGuiClosed(final SubGuiInterface subgui) {
        if (subgui instanceof SubGuiNpcCommand) {
            this.dialog.command = ((SubGuiNpcCommand)subgui).command;
        }
    }
}

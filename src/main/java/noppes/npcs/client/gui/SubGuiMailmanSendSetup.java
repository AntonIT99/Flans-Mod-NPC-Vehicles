// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.client.gui.player.GuiMailmanWrite;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.containers.ContainerMail;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.global.GuiNPCQuestSelection;
import noppes.npcs.controllers.PlayerMail;
import noppes.npcs.client.gui.util.GuiSelectionListener;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiMailmanSendSetup extends SubGuiInterface implements ITextfieldListener, GuiSelectionListener
{
    private PlayerMail mail;
    private GuiNPCQuestSelection questSelection;
    
    public SubGuiMailmanSendSetup(final PlayerMail mail, final GuiScreen parent) {
        this.parent = parent;
        this.xSize = 256;
        this.setBackground("menubg.png");
        this.mail = mail;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addLabel(new GuiNpcLabel(1, "mailbox.subject", this.guiLeft + 4, this.guiTop + 19));
        this.addTextField(new GuiNpcTextField(1, this, this.fontRendererObj, this.guiLeft + 60, this.guiTop + 14, 180, 20, this.mail.subject));
        this.addLabel(new GuiNpcLabel(0, "mailbox.sender", this.guiLeft + 4, this.guiTop + 41));
        this.addTextField(new GuiNpcTextField(0, this, this.fontRendererObj, this.guiLeft + 60, this.guiTop + 36, 180, 20, this.mail.sender));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 29, this.guiTop + 100, "mailbox.write"));
        this.addLabel(new GuiNpcLabel(3, "quest.quest", this.guiLeft + 13, this.guiTop + 135));
        String title = this.mail.questTitle;
        if (title.isEmpty()) {
            title = "gui.select";
        }
        this.addButton(new GuiNpcButton(3, this.guiLeft + 70, this.guiTop + 130, 100, 20, title));
        this.addButton(new GuiNpcButton(4, this.guiLeft + 171, this.guiTop + 130, 20, 20, "X"));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 26, this.guiTop + 190, 100, 20, "gui.done"));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 130, this.guiTop + 190, 100, 20, "gui.cancel"));
        if (this.player.openContainer instanceof ContainerMail) {
            final ContainerMail container = (ContainerMail)this.player.openContainer;
            this.mail.items = container.mail.items;
        }
    }
    
    @Override
    public void buttonEvent(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 0) {
            this.close();
        }
        if (id == 1) {
            this.mail.questId = -1;
            this.mail.questTitle = "";
            this.mail.message = new NBTTagCompound();
            this.close();
        }
        if (id == 2) {
            GuiMailmanWrite.parent = this.parent;
            GuiMailmanWrite.mail = this.mail;
            Client.sendData(EnumPacketServer.MailOpenSetup, this.mail.writeNBT());
        }
        if (id == 3) {
            NoppesUtil.openGUI((EntityPlayer)this.player, this.questSelection = new GuiNPCQuestSelection(this.npc, this.getParent(), this.mail.questId));
            this.questSelection.listener = this;
        }
        if (id == 4) {
            this.mail.questId = -1;
            this.mail.questTitle = "";
            this.initGui();
        }
    }
    
    @Override
    public void selected(final int ob, final String name) {
        this.mail.questId = ob;
        this.mail.questTitle = this.questSelection.getSelected();
        this.initGui();
    }
    
    @Override
    public void save() {
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textField) {
        if (textField.id == 0) {
            this.mail.sender = textField.getText();
        }
        if (textField.id == 1) {
            this.mail.subject = textField.getText();
        }
    }
}

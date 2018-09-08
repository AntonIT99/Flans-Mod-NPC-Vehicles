// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.global;

import noppes.npcs.client.gui.util.GuiNpcTextField;
import net.minecraft.client.entity.EntityPlayerSP;
import noppes.npcs.controllers.PlayerMail;
import noppes.npcs.client.gui.SubGuiMailmanSendSetup;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import noppes.npcs.client.gui.SubGuiNpcFactionOptions;
import noppes.npcs.client.gui.SubGuiNpcCommand;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.controllers.Quest;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiNpcQuestAdvanced extends SubGuiInterface implements ITextfieldListener
{
    private Quest quest;
    private GuiNPCManageQuest parent;
    
    public SubGuiNpcQuestAdvanced(final Quest quest, final GuiNPCManageQuest parent) {
        this.quest = quest;
        this.parent = parent;
        this.setBackground("menubg.png");
        this.xSize = 256;
        this.ySize = 216;
        this.closeOnEsc = true;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addLabel(new GuiNpcLabel(10, "faction.options", this.guiLeft + 4, this.guiTop + 17));
        this.addButton(new GuiNpcButton(10, this.guiLeft + 120, this.guiTop + 12, 50, 20, "selectServer.edit"));
        this.addButton(new GuiNpcButton(13, this.guiLeft + 4, this.guiTop + 35, 164, 20, "mailbox.setup"));
        this.addButton(new GuiNpcButton(14, this.guiLeft + 170, this.guiTop + 35, 20, 20, "X"));
        if (!this.quest.mail.subject.isEmpty()) {
            this.getButton(13).setDisplayText(this.quest.mail.subject);
        }
        this.addButton(new GuiNpcButton(11, this.guiLeft + 4, this.guiTop + 58, 164, 20, "quest.next"));
        this.addButton(new GuiNpcButton(12, this.guiLeft + 170, this.guiTop + 58, 20, 20, "X"));
        if (!this.quest.nextQuestTitle.isEmpty()) {
            this.getButton(11).setDisplayText(this.quest.nextQuestTitle);
        }
        this.addLabel(new GuiNpcLabel(9, "advMode.command", this.guiLeft + 4, this.guiTop + 86));
        this.addButton(new GuiNpcButton(9, this.guiLeft + 120, this.guiTop + 81, 50, 20, "selectServer.edit"));
        this.addButton(new GuiNpcButton(66, this.guiLeft + 190, this.guiTop + 190, 60, 20, "gui.done"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 9) {
            this.parent.setSubGui(new SubGuiNpcCommand(this.quest.command));
        }
        if (button.id == 10) {
            this.parent.setSubGui(new SubGuiNpcFactionOptions(this.quest.factionOptions));
        }
        if (button.id == 11 && this.quest.id >= 0) {
            NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNPCQuestSelection(this.npc, this.getParent(), this.quest.nextQuestid));
        }
        if (button.id == 12 && this.quest.id >= 0) {
            this.quest.nextQuestid = -1;
            this.initGui();
        }
        if (button.id == 13) {
            this.parent.setSubGui(new SubGuiMailmanSendSetup(this.quest.mail, this.getParent()));
        }
        if (button.id == 14) {
            this.quest.mail = new PlayerMail();
            this.initGui();
        }
        if (button.id == 66) {
            this.close();
        }
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textfield) {
    }
}

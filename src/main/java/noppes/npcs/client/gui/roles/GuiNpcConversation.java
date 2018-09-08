// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.roles;

import noppes.npcs.client.Client;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.client.gui.SubGuiNpcAvailability;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import noppes.npcs.client.gui.util.SubGuiInterface;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.client.gui.global.GuiNPCQuestSelection;
import noppes.npcs.roles.JobConversation;
import noppes.npcs.client.gui.util.GuiSelectionListener;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNpcConversation extends GuiNPCInterface2 implements ITextfieldListener, GuiSelectionListener
{
    private JobConversation job;
    private int slot;
    private GuiNPCQuestSelection questSelection;
    
    public GuiNpcConversation(final EntityNPCInterface npc) {
        super(npc);
        this.slot = -1;
        this.job = (JobConversation)npc.jobInterface;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addLabel(new GuiNpcLabel(40, "gui.name", this.guiLeft + 40, this.guiTop + 4));
        this.addLabel(new GuiNpcLabel(41, "gui.name", this.guiLeft + 240, this.guiTop + 4));
        this.addLabel(new GuiNpcLabel(42, "conversation.delay", this.guiLeft + 164, this.guiTop + 4));
        this.addLabel(new GuiNpcLabel(43, "conversation.delay", this.guiLeft + 364, this.guiTop + 4));
        for (int i = 0; i < 14; ++i) {
            final JobConversation.ConversationLine line = this.job.getLine(i);
            final int offset = (i >= 7) ? 200 : 0;
            this.addLabel(new GuiNpcLabel(i, "" + (i + 1), this.guiLeft + 5 + offset - ((i > 8) ? 6 : 0), this.guiTop + 18 + i % 7 * 22));
            this.addTextField(new GuiNpcTextField(i, this, this.fontRendererObj, this.guiLeft + 13 + offset, this.guiTop + 13 + i % 7 * 22, 100, 20, line.npc));
            this.addButton(new GuiNpcButton(i, this.guiLeft + 115 + offset, this.guiTop + 13 + i % 7 * 22, 46, 20, "conversation.line"));
            if (i > 0) {
                this.addTextField(new GuiNpcTextField(i + 14, this, this.fontRendererObj, this.guiLeft + 164 + offset, this.guiTop + 13 + i % 7 * 22, 30, 20, line.delay + ""));
                this.getTextField(i + 14).numbersOnly = true;
                this.getTextField(i + 14).setMinMaxDefault(5, 1000, 40);
            }
        }
        this.addLabel(new GuiNpcLabel(50, "conversation.delay", this.guiLeft + 202, this.guiTop + 175));
        this.addTextField(new GuiNpcTextField(50, this, this.fontRendererObj, this.guiLeft + 260, this.guiTop + 170, 40, 20, this.job.generalDelay + ""));
        this.getTextField(50).numbersOnly = true;
        this.getTextField(50).setMinMaxDefault(10, 1000000, 12000);
        this.addLabel(new GuiNpcLabel(54, "gui.range", this.guiLeft + 202, this.guiTop + 196));
        this.addTextField(new GuiNpcTextField(54, this, this.fontRendererObj, this.guiLeft + 260, this.guiTop + 191, 40, 20, this.job.range + ""));
        this.getTextField(54).numbersOnly = true;
        this.getTextField(54).setMinMaxDefault(4, 60, 20);
        this.addLabel(new GuiNpcLabel(51, "quest.quest", this.guiLeft + 13, this.guiTop + 175));
        String title = this.job.questTitle;
        if (title.isEmpty()) {
            title = "gui.select";
        }
        this.addButton(new GuiNpcButton(51, this.guiLeft + 70, this.guiTop + 170, 100, 20, title));
        this.addButton(new GuiNpcButton(52, this.guiLeft + 171, this.guiTop + 170, 20, 20, "X"));
        this.addLabel(new GuiNpcLabel(53, "availability.name", this.guiLeft + 13, this.guiTop + 196));
        this.addButton(new GuiNpcButton(53, this.guiLeft + 110, this.guiTop + 191, 60, 20, "selectServer.edit"));
        this.addButton(new GuiNpcButton(55, this.guiLeft + 310, this.guiTop + 181, 96, 20, new String[] { "gui.always", "gui.playernearby" }, this.job.mode));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id >= 0 && button.id < 14) {
            this.slot = button.id;
            final JobConversation.ConversationLine line = this.job.getLine(this.slot);
            this.setSubGui(new SubGuiNpcConversationLine(line.text, line.sound));
        }
        if (button.id == 51) {
            NoppesUtil.openGUI((EntityPlayer)this.player, this.questSelection = new GuiNPCQuestSelection(this.npc, this, this.job.quest));
        }
        if (button.id == 52) {
            this.job.quest = -1;
            this.job.questTitle = "";
            this.initGui();
        }
        if (button.id == 53) {
            this.setSubGui(new SubGuiNpcAvailability(this.job.availability));
        }
        if (button.id == 55) {
            this.job.mode = button.getValue();
        }
    }
    
    @Override
    public void selected(final int ob, final String name) {
        this.job.quest = ob;
        this.job.questTitle = this.questSelection.getSelected();
        this.initGui();
    }
    
    @Override
    public void closeSubGui(final SubGuiInterface gui) {
        super.closeSubGui(gui);
        if (gui instanceof SubGuiNpcConversationLine) {
            final SubGuiNpcConversationLine sub = (SubGuiNpcConversationLine)gui;
            final JobConversation.ConversationLine line = this.job.getLine(this.slot);
            line.text = sub.line;
            line.sound = sub.sound;
        }
    }
    
    @Override
    public void save() {
        Client.sendData(EnumPacketServer.JobSave, this.job.writeToNBT(new NBTTagCompound()));
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textfield) {
        if (textfield.id >= 0 && textfield.id < 14) {
            final JobConversation.ConversationLine line = this.job.getLine(textfield.id);
            line.npc = textfield.getText();
        }
        if (textfield.id >= 14 && textfield.id < 28) {
            final JobConversation.ConversationLine line = this.job.getLine(textfield.id - 14);
            line.delay = textfield.getInteger();
        }
        if (textfield.id == 50) {
            this.job.generalDelay = textfield.getInteger();
        }
        if (textfield.id == 54) {
            this.job.range = textfield.getInteger();
        }
    }
}

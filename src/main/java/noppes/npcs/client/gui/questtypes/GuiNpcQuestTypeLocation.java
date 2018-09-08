// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.questtypes;

import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.controllers.Quest;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.quests.QuestLocation;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class GuiNpcQuestTypeLocation extends SubGuiInterface implements ITextfieldListener
{
    private GuiScreen parent;
    private QuestLocation quest;
    
    public GuiNpcQuestTypeLocation(final EntityNPCInterface npc, final Quest q, final GuiScreen parent) {
        this.npc = npc;
        this.parent = parent;
        this.title = "Quest Location Setup";
        this.quest = (QuestLocation)q.questInterface;
        this.setBackground("menubg.png");
        this.xSize = 256;
        this.ySize = 216;
        this.closeOnEsc = true;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addLabel(new GuiNpcLabel(0, "Fill in the name of your Location Quest Block", this.guiLeft + 4, this.guiTop + 50));
        this.addTextField(new GuiNpcTextField(0, this, this.fontRendererObj, this.guiLeft + 4, this.guiTop + 70, 180, 20, this.quest.location));
        this.addTextField(new GuiNpcTextField(1, this, this.fontRendererObj, this.guiLeft + 4, this.guiTop + 92, 180, 20, this.quest.location2));
        this.addTextField(new GuiNpcTextField(2, this, this.fontRendererObj, this.guiLeft + 4, this.guiTop + 114, 180, 20, this.quest.location3));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 150, this.guiTop + 190, 98, 20, "gui.back"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        super.actionPerformed(guibutton);
        if (guibutton.id == 0) {
            this.close();
        }
    }
    
    @Override
    public void save() {
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textfield) {
        if (textfield.id == 0) {
            this.quest.location = textfield.getText();
        }
        if (textfield.id == 1) {
            this.quest.location2 = textfield.getText();
        }
        if (textfield.id == 2) {
            this.quest.location3 = textfield.getText();
        }
    }
}

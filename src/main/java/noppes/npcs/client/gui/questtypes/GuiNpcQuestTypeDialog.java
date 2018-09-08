// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.questtypes;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import noppes.npcs.client.gui.GuiNPCDialogSelection;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.controllers.Quest;
import noppes.npcs.entity.EntityNPCInterface;
import java.util.HashMap;
import noppes.npcs.quests.QuestDialog;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.GuiSelectionListener;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class GuiNpcQuestTypeDialog extends SubGuiInterface implements GuiSelectionListener, IGuiData
{
    private GuiScreen parent;
    private QuestDialog quest;
    private HashMap<Integer, String> data;
    private int selectedSlot;
    
    public GuiNpcQuestTypeDialog(final EntityNPCInterface npc, final Quest q, final GuiScreen parent) {
        this.data = new HashMap<Integer, String>();
        this.npc = npc;
        this.parent = parent;
        this.title = "Quest Dialog Setup";
        this.quest = (QuestDialog)q.questInterface;
        this.setBackground("menubg.png");
        this.xSize = 256;
        this.ySize = 216;
        this.closeOnEsc = true;
        Client.sendData(EnumPacketServer.QuestDialogGetTitle, this.quest.dialogs.containsKey(0) ? this.quest.dialogs.get(0) : -1, this.quest.dialogs.containsKey(1) ? this.quest.dialogs.get(1) : -1, this.quest.dialogs.containsKey(2) ? this.quest.dialogs.get(2) : -1);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        for (int i = 0; i < 3; ++i) {
            String title = "dialog.selectoption";
            if (this.data.containsKey(i)) {
                title = this.data.get(i);
            }
            this.addButton(new GuiNpcButton(i + 9, this.guiLeft + 10, 55 + i * 22, 20, 20, "X"));
            this.addButton(new GuiNpcButton(i + 3, this.guiLeft + 34, 55 + i * 22, 210, 20, title));
        }
        this.addButton(new GuiNpcButton(0, this.guiLeft + 150, this.guiTop + 190, 98, 20, "gui.back"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 0) {
            this.close();
        }
        if (button.id >= 3 && button.id < 9) {
            this.selectedSlot = button.id - 3;
            int id = -1;
            if (this.quest.dialogs.containsKey(this.selectedSlot)) {
                id = this.quest.dialogs.get(this.selectedSlot);
            }
            final GuiNPCDialogSelection gui = new GuiNPCDialogSelection(this.npc, this.parent, id);
            gui.listener = this;
            NoppesUtil.openGUI((EntityPlayer)this.player, gui);
        }
        if (button.id >= 9 && button.id < 15) {
            final int slot = button.id - 9;
            this.quest.dialogs.remove(slot);
            this.data.remove(slot);
            this.save();
            this.initGui();
        }
    }
    
    @Override
    public void save() {
    }
    
    @Override
    public void selected(final int id, final String name) {
        this.quest.dialogs.put(this.selectedSlot, id);
        this.data.put(this.selectedSlot, name);
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        this.data.clear();
        if (compound.hasKey("1")) {
            this.data.put(0, compound.getString("1"));
        }
        if (compound.hasKey("2")) {
            this.data.put(1, compound.getString("2"));
        }
        if (compound.hasKey("3")) {
            this.data.put(2, compound.getString("3"));
        }
        this.initGui();
    }
}

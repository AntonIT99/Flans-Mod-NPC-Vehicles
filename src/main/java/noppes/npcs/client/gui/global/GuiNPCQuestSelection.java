// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.global;

import java.util.Iterator;
import net.minecraft.client.entity.EntityPlayerSP;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import java.util.Collection;
import java.util.Vector;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.client.gui.util.GuiSelectionListener;
import java.util.HashMap;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNPCStringSlot;
import noppes.npcs.client.gui.util.IScrollData;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiNPCQuestSelection extends GuiNPCInterface implements IScrollData
{
    private GuiNPCStringSlot slot;
    private GuiScreen parent;
    private HashMap<String, Integer> data;
    private boolean selectCategory;
    public GuiSelectionListener listener;
    private int quest;
    
    public GuiNPCQuestSelection(final EntityNPCInterface npc, final GuiScreen parent, final int quest) {
        super(npc);
        this.selectCategory = true;
        this.drawDefaultBackground = false;
        this.title = "Select Quest Category";
        this.parent = parent;
        this.data = new HashMap<String, Integer>();
        this.quest = quest;
        if (quest >= 0) {
            Client.sendData(EnumPacketServer.QuestsGetFromQuest, quest);
            this.selectCategory = false;
            this.title = "Select Dialog";
        }
        else {
            Client.sendData(EnumPacketServer.QuestCategoriesGet, quest);
        }
        if (parent instanceof GuiSelectionListener) {
            this.listener = (GuiSelectionListener)parent;
        }
    }
    
    @Override
    public void initGui() {
        super.initGui();
        final Vector<String> list = new Vector<String>();
        (this.slot = new GuiNPCStringSlot(list, this, false, 18)).registerScrollButtons(4, 5);
        this.addButton(new GuiNpcButton(2, this.width / 2 - 100, this.height - 41, 98, 20, "gui.back"));
        this.addButton(new GuiNpcButton(4, this.width / 2 + 2, this.height - 41, 98, 20, "mco.template.button.select"));
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        this.slot.drawScreen(i, j, f);
        super.drawScreen(i, j, f);
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 2) {
            if (this.selectCategory) {
                this.close();
                NoppesUtil.openGUI((EntityPlayer)this.player, this.parent);
            }
            else {
                this.title = "Select Dialog Category";
                this.selectCategory = true;
                Client.sendData(EnumPacketServer.QuestCategoriesGet, this.quest);
            }
        }
        if (id == 4) {
            if (this.slot.selected == null || this.slot.selected.isEmpty()) {
                return;
            }
            this.doubleClicked();
        }
    }
    
    public String getSelected() {
        return this.slot.selected;
    }
    
    @Override
    public void doubleClicked() {
        if (this.slot.selected == null || this.slot.selected.isEmpty()) {
            return;
        }
        if (this.selectCategory) {
            this.selectCategory = false;
            this.title = "Select Quest";
            Client.sendData(EnumPacketServer.QuestsGet, this.data.get(this.slot.selected));
        }
        else {
            this.quest = this.data.get(this.slot.selected);
            this.close();
            NoppesUtil.openGUI((EntityPlayer)this.player, this.parent);
        }
    }
    
    @Override
    public void save() {
        if (this.quest >= 0 && this.listener != null) {
            this.listener.selected(this.quest, this.slot.selected);
        }
    }
    
    @Override
    public void setData(final Vector<String> list, final HashMap<String, Integer> data) {
        this.data = data;
        this.slot.setList(list);
        if (this.quest >= 0) {
            for (final String name : data.keySet()) {
                if (data.get(name) == this.quest) {
                    this.slot.selected = name;
                }
            }
        }
    }
    
    @Override
    public void setSelected(final String selected) {
    }
}

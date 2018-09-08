// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.global;

import java.util.Map;
import java.util.Vector;
import net.minecraft.client.gui.GuiButton;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.constants.EnumPlayerData;
import java.util.HashMap;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import noppes.npcs.client.gui.util.ICustomScrollListener;
import noppes.npcs.client.gui.util.IScrollData;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNpcManagePlayerData extends GuiNPCInterface2 implements IScrollData, ICustomScrollListener
{
    private GuiCustomScroll scroll;
    private String selectedPlayer;
    private String selected;
    private HashMap<String, Integer> data;
    private EnumPlayerData selection;
    private String search;
    
    public GuiNpcManagePlayerData(final EntityNPCInterface npc, final GuiNPCInterface2 parent) {
        super(npc);
        this.selectedPlayer = null;
        this.selected = null;
        this.data = new HashMap<String, Integer>();
        this.selection = EnumPlayerData.Players;
        this.search = "";
        Client.sendData(EnumPacketServer.PlayerDataGet, this.selection);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        (this.scroll = new GuiCustomScroll(this, 0)).setSize(190, 175);
        this.scroll.guiLeft = this.guiLeft + 4;
        this.scroll.guiTop = this.guiTop + 16;
        this.addScroll(this.scroll);
        this.addLabel(new GuiNpcLabel(0, "All Players", this.guiLeft + 10, this.guiTop + 6));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 200, this.guiTop + 10, 98, 20, "selectWorld.deleteButton"));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 200, this.guiTop + 32, 98, 20, "Players"));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 200, this.guiTop + 54, 98, 20, "Quest Data"));
        this.addButton(new GuiNpcButton(3, this.guiLeft + 200, this.guiTop + 76, 98, 20, "Dialog Data"));
        this.addButton(new GuiNpcButton(4, this.guiLeft + 200, this.guiTop + 98, 98, 20, "Transport Data"));
        this.addButton(new GuiNpcButton(5, this.guiLeft + 200, this.guiTop + 120, 98, 20, "Bank Data"));
        this.addButton(new GuiNpcButton(6, this.guiLeft + 200, this.guiTop + 142, 98, 20, "Faction Data"));
        this.addTextField(new GuiNpcTextField(0, this, this.fontRendererObj, this.guiLeft + 4, this.guiTop + 193, 190, 20, this.search));
        this.getTextField(0).enabled = (this.selection == EnumPlayerData.Players);
        this.initButtons();
    }
    
    public void initButtons() {
        this.getButton(1).setEnabled(this.selection != EnumPlayerData.Players);
        this.getButton(2).setEnabled(this.selection != EnumPlayerData.Quest);
        this.getButton(3).setEnabled(this.selection != EnumPlayerData.Dialog);
        this.getButton(4).setEnabled(this.selection != EnumPlayerData.Transport);
        this.getButton(5).setEnabled(this.selection != EnumPlayerData.Bank);
        this.getButton(6).setEnabled(this.selection != EnumPlayerData.Factions);
        if (this.selection == EnumPlayerData.Players) {
            this.getLabel(0).label = "All Players";
        }
        else {
            this.getLabel(0).label = "Selected player: " + this.selectedPlayer;
        }
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        super.drawScreen(i, j, f);
        this.scroll.drawScreen(i, j, f);
    }
    
    @Override
    public void mouseClicked(final int i, final int j, final int k) {
        super.mouseClicked(i, j, k);
        if (k == 0 && this.scroll != null) {
            this.scroll.mouseClicked(i, j, k);
        }
    }
    
    @Override
    public void keyTyped(final char c, final int i) {
        super.keyTyped(c, i);
        if (this.selection != EnumPlayerData.Players) {
            return;
        }
        if (this.search.equals(this.getTextField(0).getText())) {
            return;
        }
        this.search = this.getTextField(0).getText().toLowerCase();
        this.scroll.setList(this.getSearchList());
    }
    
    private List<String> getSearchList() {
        if (this.search.isEmpty() || this.selection != EnumPlayerData.Players) {
            return new ArrayList<String>(this.data.keySet());
        }
        final List<String> list = new ArrayList<String>();
        for (final String name : this.data.keySet()) {
            if (name.toLowerCase().contains(this.search)) {
                list.add(name);
            }
        }
        return list;
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 0) {
            if (this.selected != null) {
                if (this.selection == EnumPlayerData.Players) {
                    Client.sendData(EnumPacketServer.PlayerDataRemove, this.selection, this.selectedPlayer, this.selected);
                }
                else {
                    Client.sendData(EnumPacketServer.PlayerDataRemove, this.selection, this.selectedPlayer, this.data.get(this.selected));
                }
                this.data.clear();
            }
            this.selected = null;
        }
        if (id >= 1 && id <= 6) {
            if (this.selectedPlayer == null && id != 1) {
                return;
            }
            this.selection = EnumPlayerData.values()[id - 1];
            this.initButtons();
            this.scroll.clear();
            this.data.clear();
            Client.sendData(EnumPacketServer.PlayerDataGet, this.selection, this.selectedPlayer);
            this.selected = null;
        }
    }
    
    @Override
    public void save() {
    }
    
    @Override
    public void setData(final Vector<String> list, final HashMap<String, Integer> data) {
        this.data.putAll(data);
        this.scroll.setList(this.getSearchList());
        if (this.selection == EnumPlayerData.Players && this.selectedPlayer != null) {
            this.scroll.setSelected(this.selectedPlayer);
            this.selected = this.selectedPlayer;
        }
    }
    
    @Override
    public void setSelected(final String selected) {
    }
    
    @Override
    public void customScrollClicked(final int i, final int j, final int k, final GuiCustomScroll guiCustomScroll) {
        this.selected = guiCustomScroll.getSelected();
        if (this.selection == EnumPlayerData.Players) {
            this.selectedPlayer = this.selected;
        }
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import java.util.List;
import java.util.Vector;
import net.minecraft.client.gui.GuiButton;
import java.util.Iterator;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.util.StatCollector;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import java.util.HashMap;
import noppes.npcs.controllers.FactionOptions;
import noppes.npcs.client.gui.util.ICustomScrollListener;
import noppes.npcs.client.gui.util.IScrollData;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiNpcFactionOptions extends SubGuiInterface implements IScrollData, ICustomScrollListener
{
    private FactionOptions options;
    private HashMap<String, Integer> data;
    private GuiCustomScroll scrollFactions;
    private int selected;
    
    public SubGuiNpcFactionOptions(final FactionOptions options) {
        this.data = new HashMap<String, Integer>();
        this.selected = -1;
        this.options = options;
        this.setBackground("menubg.png");
        this.xSize = 256;
        this.ySize = 216;
        this.closeOnEsc = true;
        Client.sendData(EnumPacketServer.FactionsGet, new Object[0]);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        if (this.scrollFactions == null) {
            (this.scrollFactions = new GuiCustomScroll(this, 0)).setSize(120, 208);
        }
        this.scrollFactions.guiLeft = this.guiLeft + 130;
        this.scrollFactions.guiTop = this.guiTop + 4;
        this.addScroll(this.scrollFactions);
        this.addLabel(new GuiNpcLabel(0, "1: ", this.guiLeft + 4, this.guiTop + 12));
        if (this.data.containsValue(this.options.factionId)) {
            this.addLabel(new GuiNpcLabel(1, this.getFactionName(this.options.factionId), this.guiLeft + 12, this.guiTop + 8));
            String label = "";
            if (this.options.decreaseFactionPoints) {
                label += StatCollector.translateToLocal("gui.decrease");
            }
            else {
                label += StatCollector.translateToLocal("gui.increase");
            }
            label = label + " " + this.options.factionPoints + " " + StatCollector.translateToLocal("faction.points");
            this.addLabel(new GuiNpcLabel(3, label, this.guiLeft + 12, this.guiTop + 16));
            this.addButton(new GuiNpcButton(0, this.guiLeft + 110, this.guiTop + 7, 20, 20, "X"));
        }
        this.addLabel(new GuiNpcLabel(4, "2: ", this.guiLeft + 4, this.guiTop + 40));
        if (this.data.containsValue(this.options.faction2Id)) {
            this.addLabel(new GuiNpcLabel(5, this.getFactionName(this.options.faction2Id), this.guiLeft + 12, this.guiTop + 36));
            String label = "";
            if (this.options.decreaseFaction2Points) {
                label += StatCollector.translateToLocal("gui.decrease");
            }
            else {
                label += StatCollector.translateToLocal("gui.increase");
            }
            label = label + " " + this.options.faction2Points + " " + StatCollector.translateToLocal("faction.points");
            this.addLabel(new GuiNpcLabel(6, label, this.guiLeft + 12, this.guiTop + 44));
            this.addButton(new GuiNpcButton(1, this.guiLeft + 110, this.guiTop + 35, 20, 20, "X"));
        }
        if (this.selected >= 0 && (!this.data.containsValue(this.options.faction2Id) || !this.data.containsValue(this.options.factionId)) && !this.options.hasFaction(this.selected)) {
            this.addButton(new GuiNpcButton(2, this.guiLeft + 4, this.guiTop + 60, 90, 20, new String[] { "gui.increase", "gui.decrease" }, 0));
            this.addTextField(new GuiNpcTextField(1, this, this.fontRendererObj, this.guiLeft + 4, this.guiTop + 82, 110, 20, "10"));
            this.getTextField(1).numbersOnly = true;
            this.getTextField(1).setMinMaxDefault(1, 100000, 10);
            this.addButton(new GuiNpcButton(3, this.guiLeft + 4, this.guiTop + 104, 60, 20, "gui.add"));
        }
        this.addButton(new GuiNpcButton(66, this.guiLeft + 20, this.guiTop + 192, 90, 20, "gui.done"));
    }
    
    private String getFactionName(final int faction) {
        for (final String s : this.data.keySet()) {
            if (this.data.get(s) == faction) {
                return s;
            }
        }
        return null;
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 0) {
            this.options.factionId = -1;
            this.initGui();
        }
        if (id == 1) {
            this.options.faction2Id = -1;
            this.initGui();
        }
        if (id == 3) {
            if (!this.data.containsValue(this.options.factionId)) {
                this.options.factionId = this.selected;
                this.options.decreaseFactionPoints = (this.getButton(2).getValue() == 1);
                this.options.factionPoints = this.getTextField(1).getInteger();
            }
            else if (!this.data.containsValue(this.options.faction2Id)) {
                this.options.faction2Id = this.selected;
                this.options.decreaseFaction2Points = (this.getButton(2).getValue() == 1);
                this.options.faction2Points = this.getTextField(1).getInteger();
            }
            this.initGui();
        }
        if (id == 66) {
            this.close();
        }
    }
    
    @Override
    public void customScrollClicked(final int i, final int j, final int k, final GuiCustomScroll guiCustomScroll) {
        this.selected = this.data.get(guiCustomScroll.getSelected());
        this.initGui();
    }
    
    @Override
    public void setData(final Vector<String> list, final HashMap<String, Integer> data) {
        final GuiCustomScroll scroll = this.getScroll(0);
        final String name = scroll.getSelected();
        this.data = data;
        scroll.setList(list);
        if (name != null) {
            scroll.setSelected(name);
        }
        this.initGui();
    }
    
    @Override
    public void setSelected(final String selected) {
    }
}

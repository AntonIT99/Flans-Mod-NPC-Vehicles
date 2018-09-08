// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.global;

import java.util.Vector;
import noppes.npcs.client.gui.SubGuiColorSelector;
import noppes.npcs.client.gui.util.SubGuiInterface;
import noppes.npcs.client.gui.SubGuiNpcFactionPoints;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.client.gui.GuiButton;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import java.util.Collection;
import java.util.ArrayList;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.controllers.Faction;
import java.util.HashMap;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import noppes.npcs.client.gui.util.ISubGuiListener;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.ICustomScrollListener;
import noppes.npcs.client.gui.util.IScrollData;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNPCManageFactions extends GuiNPCInterface2 implements IScrollData, ICustomScrollListener, ITextfieldListener, IGuiData, ISubGuiListener
{
    private GuiCustomScroll scrollFactions;
    private HashMap<String, Integer> data;
    private Faction faction;
    private String selected;
    
    public GuiNPCManageFactions(final EntityNPCInterface npc) {
        super(npc);
        this.data = new HashMap<String, Integer>();
        this.faction = new Faction();
        this.selected = null;
        Client.sendData(EnumPacketServer.FactionsGet, new Object[0]);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addButton(new GuiNpcButton(0, this.guiLeft + 368, this.guiTop + 8, 45, 20, "gui.add"));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 368, this.guiTop + 32, 45, 20, "gui.remove"));
        if (this.scrollFactions == null) {
            (this.scrollFactions = new GuiCustomScroll(this, 0)).setSize(143, 208);
        }
        this.scrollFactions.guiLeft = this.guiLeft + 220;
        this.scrollFactions.guiTop = this.guiTop + 4;
        this.addScroll(this.scrollFactions);
        if (this.faction.id == -1) {
            return;
        }
        this.addTextField(new GuiNpcTextField(0, this, this.guiLeft + 40, this.guiTop + 4, 136, 20, this.faction.name));
        this.getTextField(0).setMaxStringLength(20);
        this.addLabel(new GuiNpcLabel(0, "gui.name", this.guiLeft + 8, this.guiTop + 9));
        this.addLabel(new GuiNpcLabel(10, "ID", this.guiLeft + 178, this.guiTop + 4));
        this.addLabel(new GuiNpcLabel(11, this.faction.id + "", this.guiLeft + 178, this.guiTop + 14));
        String color;
        for (color = Integer.toHexString(this.faction.color); color.length() < 6; color = "0" + color) {}
        this.addButton(new GuiNpcButton(10, this.guiLeft + 40, this.guiTop + 26, 60, 20, color));
        this.addLabel(new GuiNpcLabel(1, "gui.color", this.guiLeft + 8, this.guiTop + 31));
        this.getButton(10).setTextColor(this.faction.color);
        this.addLabel(new GuiNpcLabel(2, "faction.points", this.guiLeft + 8, this.guiTop + 53));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 100, this.guiTop + 48, 45, 20, "selectServer.edit"));
        this.addLabel(new GuiNpcLabel(3, "faction.hidden", this.guiLeft + 8, this.guiTop + 75));
        this.addButton(new GuiNpcButton(3, this.guiLeft + 100, this.guiTop + 70, 45, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.faction.hideFaction ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(4, "faction.attacked", this.guiLeft + 8, this.guiTop + 97));
        this.addButton(new GuiNpcButton(4, this.guiLeft + 100, this.guiTop + 92, 45, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.faction.getsAttacked ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(6, "faction.hostiles", this.guiLeft + 8, this.guiTop + 145));
        final ArrayList<String> hostileList = new ArrayList<String>(this.scrollFactions.getList());
        hostileList.remove(this.faction.name);
        final HashSet<String> set = new HashSet<String>();
        for (final String s : this.data.keySet()) {
            if (!s.equals(this.faction.name) && this.faction.attackFactions.contains(this.data.get(s))) {
                set.add(s);
            }
        }
        final GuiCustomScroll scrollHostileFactions = new GuiCustomScroll(this, 1, true);
        scrollHostileFactions.setSize(163, 58);
        scrollHostileFactions.guiLeft = this.guiLeft + 4;
        scrollHostileFactions.guiTop = this.guiTop + 154;
        scrollHostileFactions.setList(hostileList);
        scrollHostileFactions.setSelectedList(set);
        this.addScroll(scrollHostileFactions);
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 0) {
            this.save();
            String name;
            for (name = "New"; this.data.containsKey(name); name += "_") {}
            final Faction faction = new Faction(-1, name, 65280, 1000);
            final NBTTagCompound compound = new NBTTagCompound();
            faction.writeNBT(compound);
            Client.sendData(EnumPacketServer.FactionSave, compound);
        }
        if (button.id == 1 && this.data.containsKey(this.scrollFactions.getSelected())) {
            Client.sendData(EnumPacketServer.FactionRemove, this.data.get(this.selected));
            this.scrollFactions.clear();
            this.faction = new Faction();
            this.initGui();
        }
        if (button.id == 2) {
            this.setSubGui(new SubGuiNpcFactionPoints(this.faction));
        }
        if (button.id == 3) {
            this.faction.hideFaction = (button.getValue() == 1);
        }
        if (button.id == 4) {
            this.faction.getsAttacked = (button.getValue() == 1);
        }
        if (button.id == 10) {
            this.setSubGui(new SubGuiColorSelector(this.faction.color));
        }
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        (this.faction = new Faction()).readNBT(compound);
        this.setSelected(this.faction.name);
        this.initGui();
    }
    
    @Override
    public void setData(final Vector<String> list, final HashMap<String, Integer> data) {
        final String name = this.scrollFactions.getSelected();
        this.data = data;
        this.scrollFactions.setList(list);
        if (name != null) {
            this.scrollFactions.setSelected(name);
        }
    }
    
    @Override
    public void setSelected(final String selected) {
        this.selected = selected;
        this.scrollFactions.setSelected(selected);
    }
    
    @Override
    public void customScrollClicked(final int i, final int j, final int k, final GuiCustomScroll guiCustomScroll) {
        if (guiCustomScroll.id == 0) {
            this.save();
            this.selected = this.scrollFactions.getSelected();
            Client.sendData(EnumPacketServer.FactionGet, this.data.get(this.selected));
        }
        else if (guiCustomScroll.id == 1) {
            final HashSet<Integer> set = new HashSet<Integer>();
            for (final String s : guiCustomScroll.getSelectedList()) {
                if (this.data.containsKey(s)) {
                    set.add(this.data.get(s));
                }
            }
            this.faction.attackFactions = set;
            this.save();
        }
    }
    
    @Override
    public void save() {
        if (this.selected != null && this.data.containsKey(this.selected) && this.faction != null) {
            final NBTTagCompound compound = new NBTTagCompound();
            this.faction.writeNBT(compound);
            Client.sendData(EnumPacketServer.FactionSave, compound);
        }
    }
    
    @Override
    public void unFocused(final GuiNpcTextField guiNpcTextField) {
        if (this.faction.id == -1) {
            return;
        }
        if (guiNpcTextField.id == 0) {
            final String name = guiNpcTextField.getText();
            if (!name.isEmpty() && !this.data.containsKey(name)) {
                final String old = this.faction.name;
                this.data.remove(this.faction.name);
                this.faction.name = name;
                this.data.put(this.faction.name, this.faction.id);
                this.selected = name;
                this.scrollFactions.replace(old, this.faction.name);
            }
        }
        else if (guiNpcTextField.id == 1) {
            int color = 0;
            try {
                color = Integer.parseInt(guiNpcTextField.getText(), 16);
            }
            catch (NumberFormatException e) {
                color = 0;
            }
            guiNpcTextField.setTextColor(this.faction.color = color);
        }
    }
    
    @Override
    public void subGuiClosed(final SubGuiInterface subgui) {
        if (subgui instanceof SubGuiColorSelector) {
            this.faction.color = ((SubGuiColorSelector)subgui).color;
            this.initGui();
        }
    }
}

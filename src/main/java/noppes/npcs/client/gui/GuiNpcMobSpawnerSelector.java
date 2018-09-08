// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagDouble;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.command.ICommandSender;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Iterator;
import java.util.Collection;
import noppes.npcs.client.controllers.ClientCloneController;
import java.util.ArrayList;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.client.gui.util.GuiMenuSideButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import net.minecraft.client.gui.GuiScreen;
import java.util.List;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class GuiNpcMobSpawnerSelector extends SubGuiInterface implements IGuiData
{
    private GuiCustomScroll scroll;
    private List<String> list;
    private static String search;
    public int activeTab;
    public boolean isServer;
    
    public GuiNpcMobSpawnerSelector() {
        this.activeTab = 1;
        this.isServer = false;
        this.xSize = 256;
        this.closeOnEsc = true;
        this.setBackground("menubg.png");
    }
    
    @Override
    public void initGui() {
        super.initGui();
        if (this.scroll == null) {
            (this.scroll = new GuiCustomScroll(this, 0)).setSize(165, 188);
        }
        else {
            this.scroll.clear();
        }
        this.scroll.guiLeft = this.guiLeft + 4;
        this.scroll.guiTop = this.guiTop + 26;
        this.addScroll(this.scroll);
        this.addTextField(new GuiNpcTextField(1, this, this.fontRendererObj, this.guiLeft + 4, this.guiTop + 4, 165, 20, GuiNpcMobSpawnerSelector.search));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 171, this.guiTop + 80, 80, 20, "gui.done"));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 171, this.guiTop + 103, 80, 20, "gui.cancel"));
        this.addSideButton(new GuiMenuSideButton(21, this.guiLeft - 69, this.guiTop + 2, 70, 22, "Tab 1"));
        this.addSideButton(new GuiMenuSideButton(22, this.guiLeft - 69, this.guiTop + 23, 70, 22, "Tab 2"));
        this.addSideButton(new GuiMenuSideButton(23, this.guiLeft - 69, this.guiTop + 44, 70, 22, "Tab 3"));
        this.addSideButton(new GuiMenuSideButton(24, this.guiLeft - 69, this.guiTop + 65, 70, 22, "Tab 4"));
        this.addSideButton(new GuiMenuSideButton(25, this.guiLeft - 69, this.guiTop + 86, 70, 22, "Tab 5"));
        this.addSideButton(new GuiMenuSideButton(26, this.guiLeft - 69, this.guiTop + 107, 70, 22, "Tab 6"));
        this.addSideButton(new GuiMenuSideButton(27, this.guiLeft - 69, this.guiTop + 128, 70, 22, "Tab 7"));
        this.addSideButton(new GuiMenuSideButton(28, this.guiLeft - 69, this.guiTop + 149, 70, 22, "Tab 8"));
        this.addSideButton(new GuiMenuSideButton(29, this.guiLeft - 69, this.guiTop + 170, 70, 22, "Tab 9"));
        this.getSideButton(20 + this.activeTab).active = true;
        this.showClones();
    }
    
    public String getSelected() {
        return this.scroll.getSelected();
    }
    
    private void showClones() {
        if (this.isServer) {
            Client.sendData(EnumPacketServer.CloneList, this.activeTab);
            return;
        }
        final ArrayList<String> list = new ArrayList<String>();
        this.list = new ArrayList<String>(ClientCloneController.Instance.getClones(this.activeTab));
        this.scroll.setList(this.getSearchList());
    }
    
    @Override
    public void keyTyped(final char c, final int i) {
        super.keyTyped(c, i);
        if (GuiNpcMobSpawnerSelector.search.equals(this.getTextField(1).getText())) {
            return;
        }
        GuiNpcMobSpawnerSelector.search = this.getTextField(1).getText().toLowerCase();
        this.scroll.setList(this.getSearchList());
    }
    
    private List<String> getSearchList() {
        if (GuiNpcMobSpawnerSelector.search.isEmpty()) {
            return new ArrayList<String>(this.list);
        }
        final List<String> list = new ArrayList<String>();
        for (final String name : this.list) {
            if (name.toLowerCase().contains(GuiNpcMobSpawnerSelector.search)) {
                list.add(name);
            }
        }
        return list;
    }
    
    public NBTTagCompound getCompound() {
        final String sel = this.scroll.getSelected();
        if (sel == null) {
            return null;
        }
        return ClientCloneController.Instance.getCloneData((ICommandSender)this.player, sel, this.activeTab);
    }
    
    @Override
    public void buttonEvent(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 0) {
            this.close();
        }
        if (id == 1) {
            this.scroll.clear();
            this.close();
        }
        if (id > 20) {
            this.activeTab = id - 20;
            this.initGui();
        }
    }
    
    protected NBTTagList newDoubleNBTList(final double... par1ArrayOfDouble) {
        final NBTTagList nbttaglist = new NBTTagList();
        for (final double d1 : par1ArrayOfDouble) {
            nbttaglist.appendTag((NBTBase)new NBTTagDouble(d1));
        }
        return nbttaglist;
    }
    
    @Override
    public void save() {
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        final NBTTagList nbtlist = compound.getTagList("List", 8);
        final List<String> list = new ArrayList<String>();
        for (int i = 0; i < nbtlist.tagCount(); ++i) {
            list.add(nbtlist.getStringTagAt(i));
        }
        this.list = list;
        this.scroll.setList(this.getSearchList());
    }
    
    static {
        GuiNpcMobSpawnerSelector.search = "";
    }
}

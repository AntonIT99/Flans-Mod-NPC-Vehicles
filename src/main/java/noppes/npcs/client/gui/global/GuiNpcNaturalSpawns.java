// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.global;

import net.minecraft.util.StatCollector;
import java.util.List;
import java.util.Vector;
import noppes.npcs.client.gui.GuiNpcMobSpawnerSelector;
import noppes.npcs.client.gui.util.SubGuiInterface;
import noppes.npcs.client.gui.SubGuiNpcBiomes;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.client.gui.util.GuiNpcSlider;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.controllers.SpawnData;
import java.util.HashMap;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import noppes.npcs.client.gui.util.ISliderListener;
import noppes.npcs.client.gui.util.ICustomScrollListener;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.IScrollData;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNpcNaturalSpawns extends GuiNPCInterface2 implements IGuiData, IScrollData, ITextfieldListener, ICustomScrollListener, ISliderListener
{
    private GuiCustomScroll scroll;
    private HashMap<String, Integer> data;
    private SpawnData spawn;
    
    public GuiNpcNaturalSpawns(final EntityNPCInterface npc) {
        super(npc);
        this.data = new HashMap<String, Integer>();
        this.spawn = new SpawnData();
        Client.sendData(EnumPacketServer.NaturalSpawnGetAll, new Object[0]);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        if (this.scroll == null) {
            (this.scroll = new GuiCustomScroll(this, 0)).setSize(143, 208);
        }
        this.scroll.guiLeft = this.guiLeft + 214;
        this.scroll.guiTop = this.guiTop + 4;
        this.addScroll(this.scroll);
        this.addButton(new GuiNpcButton(1, this.guiLeft + 358, this.guiTop + 38, 58, 20, "gui.add"));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 358, this.guiTop + 61, 58, 20, "gui.remove"));
        if (this.spawn.id >= 0) {
            this.showSpawn();
        }
    }
    
    private void showSpawn() {
        this.addLabel(new GuiNpcLabel(1, "gui.title", this.guiLeft + 4, this.guiTop + 8));
        this.addTextField(new GuiNpcTextField(1, this, this.fontRendererObj, this.guiLeft + 60, this.guiTop + 3, 140, 20, this.spawn.name));
        this.addLabel(new GuiNpcLabel(3, "spawning.biomes", this.guiLeft + 4, this.guiTop + 30));
        this.addButton(new GuiNpcButton(3, this.guiLeft + 120, this.guiTop + 25, 50, 20, "selectServer.edit"));
        this.addSlider(new GuiNpcSlider(this, 4, this.guiLeft + 4, this.guiTop + 47, 180, 20, this.spawn.itemWeight / 100.0f));
        final int y = this.guiTop + 70;
        this.addButton(new GuiNpcButton(25, this.guiLeft + 14, y, 20, 20, "X"));
        this.addLabel(new GuiNpcLabel(5, "1:", this.guiLeft + 4, y + 5));
        this.addButton(new GuiNpcButton(5, this.guiLeft + 36, y, 170, 20, this.getTitle(this.spawn.compound1)));
    }
    
    private String getTitle(final NBTTagCompound compound) {
        if (compound != null && compound.hasKey("ClonedName")) {
            return compound.getString("ClonedName");
        }
        return "gui.selectnpc";
    }
    
    @Override
    public void buttonEvent(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 1) {
            this.save();
            String name;
            for (name = "New"; this.data.containsKey(name); name += "_") {}
            final SpawnData spawn = new SpawnData();
            spawn.name = name;
            Client.sendData(EnumPacketServer.NaturalSpawnSave, spawn.writeNBT(new NBTTagCompound()));
        }
        if (id == 2 && this.data.containsKey(this.scroll.getSelected())) {
            Client.sendData(EnumPacketServer.NaturalSpawnRemove, this.spawn.id);
            this.spawn = new SpawnData();
            this.scroll.clear();
        }
        if (id == 3) {
            this.setSubGui(new SubGuiNpcBiomes(this.spawn));
        }
        if (id == 5) {
            this.setSubGui(new GuiNpcMobSpawnerSelector());
        }
        if (id == 25) {
            this.spawn.compound1 = new NBTTagCompound();
            this.initGui();
        }
    }
    
    @Override
    public void unFocused(final GuiNpcTextField guiNpcTextField) {
        final String name = guiNpcTextField.getText();
        if (name.isEmpty() || this.data.containsKey(name)) {
            guiNpcTextField.setText(this.spawn.name);
        }
        else {
            final String old = this.spawn.name;
            this.data.remove(old);
            this.spawn.name = name;
            this.data.put(this.spawn.name, this.spawn.id);
            this.scroll.replace(old, this.spawn.name);
        }
    }
    
    @Override
    public void setData(final Vector<String> list, final HashMap<String, Integer> data) {
        final String name = this.scroll.getSelected();
        this.data = data;
        this.scroll.setList(list);
        if (name != null) {
            this.scroll.setSelected(name);
        }
        this.initGui();
    }
    
    @Override
    public void customScrollClicked(final int i, final int j, final int k, final GuiCustomScroll guiCustomScroll) {
        if (guiCustomScroll.id == 0) {
            this.save();
            final String selected = this.scroll.getSelected();
            this.spawn = new SpawnData();
            Client.sendData(EnumPacketServer.NaturalSpawnGet, this.data.get(selected));
        }
    }
    
    @Override
    public void save() {
        GuiNpcTextField.unfocus();
        if (this.spawn.id >= 0) {
            Client.sendData(EnumPacketServer.NaturalSpawnSave, this.spawn.writeNBT(new NBTTagCompound()));
        }
    }
    
    @Override
    public void setSelected(final String selected) {
    }
    
    @Override
    public void closeSubGui(final SubGuiInterface gui) {
        super.closeSubGui(gui);
        if (gui instanceof GuiNpcMobSpawnerSelector) {
            final GuiNpcMobSpawnerSelector selector = (GuiNpcMobSpawnerSelector)gui;
            final NBTTagCompound compound = selector.getCompound();
            if (compound != null) {
                this.spawn.compound1 = compound;
            }
            this.initGui();
        }
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        this.spawn.readNBT(compound);
        this.setSelected(this.spawn.name);
        this.initGui();
    }
    
    @Override
    public void mouseDragged(final GuiNpcSlider guiNpcSlider) {
        guiNpcSlider.displayString = StatCollector.translateToLocal("spawning.weightedChance") + ": " + (int)(guiNpcSlider.sliderValue * 100.0f);
    }
    
    @Override
    public void mousePressed(final GuiNpcSlider guiNpcSlider) {
    }
    
    @Override
    public void mouseReleased(final GuiNpcSlider guiNpcSlider) {
        this.spawn.itemWeight = (int)(guiNpcSlider.sliderValue * 100.0f);
    }
}

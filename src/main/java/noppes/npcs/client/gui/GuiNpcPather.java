// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import net.minecraft.nbt.NBTBase;
import noppes.npcs.NBTTags;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.client.gui.GuiButton;
import java.util.Iterator;
import java.util.List;
import noppes.npcs.client.gui.util.GuiNpcButton;
import java.util.ArrayList;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.DataAI;
import java.util.HashMap;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiNpcPather extends GuiNPCInterface implements IGuiData
{
    private GuiCustomScroll scroll;
    private HashMap<String, Integer> data;
    private DataAI ai;
    
    public GuiNpcPather(final EntityNPCInterface npc) {
        this.data = new HashMap<String, Integer>();
        this.drawDefaultBackground = false;
        this.xSize = 176;
        this.title = "Npc Pather";
        this.setBackground("smallbg.png");
        this.ai = npc.ai;
        Client.sendData(EnumPacketServer.MovingPathGet, new Object[0]);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        (this.scroll = new GuiCustomScroll(this, 0)).setSize(160, 164);
        final List<String> list = new ArrayList<String>();
        for (final int[] arr : this.ai.getMovingPath()) {
            list.add("x:" + arr[0] + " y:" + arr[1] + " z:" + arr[2]);
        }
        this.scroll.setUnsortedList(list);
        this.scroll.guiLeft = this.guiLeft + 7;
        this.scroll.guiTop = this.guiTop + 12;
        this.addScroll(this.scroll);
        this.addButton(new GuiNpcButton(0, this.guiLeft + 6, this.guiTop + 178, 52, 20, "gui.down"));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 62, this.guiTop + 178, 52, 20, "gui.up"));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 118, this.guiTop + 178, 52, 20, "selectWorld.deleteButton"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        if (this.scroll.selected < 0) {
            return;
        }
        final int id = guibutton.id;
        if (id == 0) {
            final List<int[]> list = this.ai.getMovingPath();
            final int selected = this.scroll.selected;
            if (list.size() <= selected + 1) {
                return;
            }
            final int[] a = list.get(selected);
            final int[] b = list.get(selected + 1);
            list.set(selected, b);
            list.set(selected + 1, a);
            this.ai.setMovingPath(list);
            this.initGui();
            this.scroll.selected = selected + 1;
        }
        if (id == 1) {
            if (this.scroll.selected - 1 < 0) {
                return;
            }
            final List<int[]> list = this.ai.getMovingPath();
            final int selected = this.scroll.selected;
            final int[] a = list.get(selected);
            final int[] b = list.get(selected - 1);
            list.set(selected, b);
            list.set(selected - 1, a);
            this.ai.setMovingPath(list);
            this.initGui();
            this.scroll.selected = selected - 1;
        }
        if (id == 2) {
            final List<int[]> list = this.ai.getMovingPath();
            if (list.size() <= 1) {
                return;
            }
            list.remove(this.scroll.selected);
            this.ai.setMovingPath(list);
            this.initGui();
        }
    }
    
    protected void drawGuiContainerBackgroundLayer(final float f, final int i, final int j) {
    }
    
    @Override
    public void mouseClicked(final int i, final int j, final int k) {
        super.mouseClicked(i, j, k);
        this.scroll.mouseClicked(i, j, k);
    }
    
    @Override
    public void keyTyped(final char c, final int i) {
        if (i == 1 || this.isInventoryKey(i)) {
            this.close();
        }
    }
    
    @Override
    public void save() {
        final NBTTagCompound compound = new NBTTagCompound();
        compound.setTag("MovingPathNew", (NBTBase)NBTTags.nbtIntegerArraySet(this.ai.getMovingPath()));
        Client.sendData(EnumPacketServer.MovingPathSave, compound);
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        this.ai.readToNBT(compound);
        this.initGui();
    }
}

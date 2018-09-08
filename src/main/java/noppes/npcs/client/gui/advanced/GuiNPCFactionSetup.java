// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.advanced;

import net.minecraft.nbt.NBTTagCompound;
import java.util.List;
import java.util.Vector;
import noppes.npcs.client.gui.util.SubGuiInterface;
import noppes.npcs.client.gui.SubGuiNpcFactionOptions;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.entity.EntityNPCInterface;
import java.util.HashMap;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import noppes.npcs.client.gui.util.ICustomScrollListener;
import noppes.npcs.client.gui.util.IScrollData;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNPCFactionSetup extends GuiNPCInterface2 implements IScrollData, ICustomScrollListener
{
    private GuiCustomScroll scrollFactions;
    private HashMap<String, Integer> data;
    
    public GuiNPCFactionSetup(final EntityNPCInterface npc) {
        super(npc);
        this.data = new HashMap<String, Integer>();
        Client.sendData(EnumPacketServer.FactionsGet, new Object[0]);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addLabel(new GuiNpcLabel(0, "faction.attackHostile", this.guiLeft + 4, this.guiTop + 25));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 144, this.guiTop + 20, 40, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.npc.advanced.attackOtherFactions ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(1, "faction.defend", this.guiLeft + 4, this.guiTop + 47));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 144, this.guiTop + 42, 40, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.npc.advanced.defendFaction ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(12, "faction.ondeath", this.guiLeft + 4, this.guiTop + 69));
        this.addButton(new GuiNpcButton(12, this.guiLeft + 90, this.guiTop + 64, 80, 20, "faction.points"));
        if (this.scrollFactions == null) {
            (this.scrollFactions = new GuiCustomScroll(this, 0)).setSize(180, 200);
        }
        this.scrollFactions.guiLeft = this.guiLeft + 200;
        this.scrollFactions.guiTop = this.guiTop + 4;
        this.addScroll(this.scrollFactions);
    }
    
    @Override
    public void buttonEvent(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 0) {
            this.npc.advanced.attackOtherFactions = (button.getValue() == 1);
        }
        if (button.id == 1) {
            this.npc.advanced.defendFaction = (button.getValue() == 1);
        }
        if (button.id == 12) {
            this.setSubGui(new SubGuiNpcFactionOptions(this.npc.advanced.factions));
        }
    }
    
    @Override
    public void setData(final Vector<String> list, final HashMap<String, Integer> data) {
        final String name = this.npc.getFaction().name;
        this.data = data;
        this.scrollFactions.setList(list);
        if (name != null) {
            this.setSelected(name);
        }
    }
    
    @Override
    public void mouseClicked(final int i, final int j, final int k) {
        super.mouseClicked(i, j, k);
        if (k == 0 && this.scrollFactions != null) {
            this.scrollFactions.mouseClicked(i, j, k);
        }
    }
    
    @Override
    public void setSelected(final String selected) {
        this.scrollFactions.setSelected(selected);
    }
    
    @Override
    public void customScrollClicked(final int i, final int j, final int k, final GuiCustomScroll guiCustomScroll) {
        if (guiCustomScroll.id == 0) {
            Client.sendData(EnumPacketServer.FactionSet, this.data.get(this.scrollFactions.getSelected()));
        }
    }
    
    @Override
    public void save() {
        Client.sendData(EnumPacketServer.MainmenuAdvancedSave, this.npc.advanced.writeToNBT(new NBTTagCompound()));
    }
}

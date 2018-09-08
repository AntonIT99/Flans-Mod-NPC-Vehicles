// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.advanced;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.controllers.TransformData;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNPCNightSetup extends GuiNPCInterface2 implements IGuiData
{
    private TransformData data;
    
    public GuiNPCNightSetup(final EntityNPCInterface npc) {
        super(npc);
        this.data = npc.transform;
        Client.sendData(EnumPacketServer.TransformGet, new Object[0]);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addLabel(new GuiNpcLabel(0, "menu.display", this.guiLeft + 4, this.guiTop + 25));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 104, this.guiTop + 20, 50, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.data.hasDisplay ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(1, "menu.stats", this.guiLeft + 4, this.guiTop + 47));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 104, this.guiTop + 42, 50, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.data.hasStats ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(2, "menu.ai", this.guiLeft + 4, this.guiTop + 69));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 104, this.guiTop + 64, 50, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.data.hasAi ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(3, "menu.inventory", this.guiLeft + 4, this.guiTop + 91));
        this.addButton(new GuiNpcButton(3, this.guiLeft + 104, this.guiTop + 86, 50, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.data.hasInv ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(4, "menu.advanced", this.guiLeft + 4, this.guiTop + 113));
        this.addButton(new GuiNpcButton(4, this.guiLeft + 104, this.guiTop + 108, 50, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.data.hasAdvanced ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(5, "role.name", this.guiLeft + 4, this.guiTop + 135));
        this.addButton(new GuiNpcButton(5, this.guiLeft + 104, this.guiTop + 130, 50, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.data.hasRole ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(6, "job.name", this.guiLeft + 4, this.guiTop + 157));
        this.addButton(new GuiNpcButton(6, this.guiLeft + 104, this.guiTop + 152, 50, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.data.hasJob ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(10, "advanced.editingmode", this.guiLeft + 170, this.guiTop + 9));
        this.addButton(new GuiNpcButton(10, this.guiLeft + 244, this.guiTop + 4, 50, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.data.editingModus ? 1 : 0)));
        if (this.data.editingModus) {
            this.addButton(new GuiNpcButton(11, this.guiLeft + 170, this.guiTop + 34, "advanced.loadday"));
            this.addButton(new GuiNpcButton(12, this.guiLeft + 170, this.guiTop + 56, "advanced.loadnight"));
        }
    }
    
    @Override
    public void buttonEvent(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 0) {
            this.data.hasDisplay = (button.getValue() == 1);
        }
        if (button.id == 1) {
            this.data.hasStats = (button.getValue() == 1);
        }
        if (button.id == 2) {
            this.data.hasAi = (button.getValue() == 1);
        }
        if (button.id == 3) {
            this.data.hasInv = (button.getValue() == 1);
        }
        if (button.id == 4) {
            this.data.hasAdvanced = (button.getValue() == 1);
        }
        if (button.id == 5) {
            this.data.hasRole = (button.getValue() == 1);
        }
        if (button.id == 6) {
            this.data.hasJob = (button.getValue() == 1);
        }
        if (button.id == 10) {
            this.data.editingModus = (button.getValue() == 1);
            this.save();
            this.initGui();
        }
        if (button.id == 11) {
            Client.sendData(EnumPacketServer.TransformLoad, false);
        }
        if (button.id == 12) {
            Client.sendData(EnumPacketServer.TransformLoad, true);
        }
    }
    
    @Override
    public void save() {
        Client.sendData(EnumPacketServer.TransformSave, this.data.writeOptions(new NBTTagCompound()));
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        this.data.readOptions(compound);
        this.initGui();
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.global;

import java.util.List;
import net.minecraft.client.entity.EntityPlayerSP;
import noppes.npcs.client.gui.mainmenu.GuiNPCGlobalMainMenu;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.GuiNPCTransportCategoryEdit;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import java.util.Collection;
import java.util.Vector;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.entity.EntityNPCInterface;
import java.util.HashMap;
import noppes.npcs.client.gui.util.GuiNPCStringSlot;
import noppes.npcs.client.gui.util.IScrollData;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiNPCManageTransporters extends GuiNPCInterface implements IScrollData
{
    private GuiNPCStringSlot slot;
    private HashMap<String, Integer> data;
    private boolean selectCategory;
    
    public GuiNPCManageTransporters(final EntityNPCInterface npc) {
        super(npc);
        this.selectCategory = true;
        Client.sendData(EnumPacketServer.TransportCategoriesGet, new Object[0]);
        this.drawDefaultBackground = false;
        this.title = "Transport Categories";
        this.data = new HashMap<String, Integer>();
    }
    
    @Override
    public void initGui() {
        super.initGui();
        final Vector<String> list = new Vector<String>();
        (this.slot = new GuiNPCStringSlot(list, this, false, 18)).registerScrollButtons(4, 5);
        this.addButton(new GuiNpcButton(0, this.width / 2 - 100, this.height - 52, 65, 20, "gui.add"));
        this.addButton(new GuiNpcButton(1, this.width / 2 - 33, this.height - 52, 65, 20, "selectServer.edit"));
        this.getButton(0).setEnabled(this.selectCategory);
        this.getButton(1).setEnabled(this.selectCategory);
        this.addButton(new GuiNpcButton(3, this.width / 2 + 33, this.height - 52, 65, 20, "gui.remove"));
        this.addButton(new GuiNpcButton(2, this.width / 2 - 100, this.height - 31, 98, 20, "gui.open"));
        this.getButton(2).setEnabled(this.selectCategory);
        this.addButton(new GuiNpcButton(4, this.width / 2 + 2, this.height - 31, 98, 20, "gui.back"));
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        this.slot.drawScreen(i, j, f);
        super.drawScreen(i, j, f);
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 0 && this.selectCategory) {
            NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNPCTransportCategoryEdit(this.npc, this, "", -1));
        }
        if (id == 1) {
            if (this.slot.selected == null || this.slot.selected.isEmpty()) {
                return;
            }
            if (this.selectCategory) {
                NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNPCTransportCategoryEdit(this.npc, this, this.slot.selected, this.data.get(this.slot.selected)));
            }
        }
        if (id == 4) {
            if (this.selectCategory) {
                this.close();
                NoppesUtil.openGUI((EntityPlayer)this.player, new GuiNPCGlobalMainMenu(this.npc));
            }
            else {
                this.title = "Transport Categories";
                this.selectCategory = true;
                Client.sendData(EnumPacketServer.TransportCategoriesGet, new Object[0]);
                this.initGui();
            }
        }
        if (id == 3) {
            if (this.slot.selected == null || this.slot.selected.isEmpty()) {
                return;
            }
            this.save();
            if (this.selectCategory) {
                Client.sendData(EnumPacketServer.TransportCategoryRemove, this.data.get(this.slot.selected));
            }
            else {
                Client.sendData(EnumPacketServer.TransportRemove, this.data.get(this.slot.selected));
            }
            this.initGui();
        }
        if (id == 2) {
            this.doubleClicked();
        }
    }
    
    @Override
    public void doubleClicked() {
        if (this.slot.selected == null || this.slot.selected.isEmpty()) {
            return;
        }
        if (this.selectCategory) {
            this.selectCategory = false;
            this.title = "TransportLocations";
            Client.sendData(EnumPacketServer.TransportsGet, this.data.get(this.slot.selected));
            this.initGui();
        }
    }
    
    @Override
    public void save() {
    }
    
    @Override
    public void setData(final Vector<String> list, final HashMap<String, Integer> data) {
        this.data = data;
        this.slot.setList(list);
    }
    
    @Override
    public void setSelected(final String selected) {
    }
}

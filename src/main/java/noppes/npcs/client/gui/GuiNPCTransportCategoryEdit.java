// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiNPCTransportCategoryEdit extends GuiNPCInterface
{
    private GuiScreen parent;
    private String name;
    private int id;
    
    public GuiNPCTransportCategoryEdit(final EntityNPCInterface npc, final GuiScreen parent, final String name, final int id) {
        super(npc);
        this.parent = parent;
        this.name = name;
        this.id = id;
        this.title = "Npc Transport Category";
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addTextField(new GuiNpcTextField(1, this, this.fontRendererObj, this.width / 2 - 40, 100, 140, 20, this.name));
        this.addLabel(new GuiNpcLabel(1, "Title:", this.width / 2 - 100 + 4, 105, 16777215));
        this.addButton(new GuiNpcButton(2, this.width / 2 - 100, 210, 98, 20, "gui.back"));
        this.addButton(new GuiNpcButton(3, this.width / 2 + 2, 210, 98, 20, "Save"));
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        super.drawScreen(i, j, f);
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 2) {
            NoppesUtil.openGUI((EntityPlayer)this.player, this.parent);
            Client.sendData(EnumPacketServer.TransportCategoriesGet, new Object[0]);
        }
        if (id == 3) {
            this.save();
            NoppesUtil.openGUI((EntityPlayer)this.player, this.parent);
            Client.sendData(EnumPacketServer.TransportCategoriesGet, new Object[0]);
        }
    }
    
    @Override
    public void save() {
        final String name = this.getTextField(1).getText();
        if (name.trim().isEmpty()) {
            return;
        }
        Client.sendData(EnumPacketServer.TransportCategorySave, name, this.id);
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import java.util.HashMap;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.controllers.Line;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.controllers.Lines;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNPCLinesEdit extends GuiNPCInterface2 implements IGuiData
{
    private Lines lines;
    private GuiNpcTextField field;
    private GuiNpcSoundSelection gui;
    
    public GuiNPCLinesEdit(final EntityNPCInterface npc, final Lines lines) {
        super(npc);
        this.lines = lines;
        Client.sendData(EnumPacketServer.MainmenuAdvancedGet, new Object[0]);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        for (int i = 0; i < 8; ++i) {
            String text = "";
            String sound = "";
            if (this.lines.lines.containsKey(i)) {
                final Line line = this.lines.lines.get(i);
                text = line.text;
                sound = line.sound;
            }
            this.addTextField(new GuiNpcTextField(i, this, this.fontRendererObj, this.guiLeft + 4, this.guiTop + 4 + i * 24, 200, 20, text));
            this.addTextField(new GuiNpcTextField(i + 8, this, this.fontRendererObj, this.guiLeft + 208, this.guiTop + 4 + i * 24, 146, 20, sound));
            this.addButton(new GuiNpcButton(i, this.guiLeft + 358, this.guiTop + 4 + i * 24, 60, 20, "mco.template.button.select"));
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        this.field = this.getTextField(button.id + 8);
        NoppesUtil.openGUI((EntityPlayer)this.player, this.gui = new GuiNpcSoundSelection(this.npc, this, this.field.getText()));
    }
    
    @Override
    public void elementClicked() {
        this.field.setText(this.gui.getSelected());
        this.saveLines();
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        this.npc.advanced.readToNBT(compound);
        this.initGui();
    }
    
    private void saveLines() {
        final HashMap<Integer, Line> lines = new HashMap<Integer, Line>();
        for (int i = 0; i < 8; ++i) {
            final GuiNpcTextField tf = this.getTextField(i);
            final GuiNpcTextField tf2 = this.getTextField(i + 8);
            if (!tf.isEmpty()) {
                final Line line = new Line();
                line.text = tf.getText();
                line.sound = tf2.getText();
                lines.put(i, line);
            }
        }
        this.lines.lines = lines;
    }
    
    @Override
    public void save() {
        this.saveLines();
        Client.sendData(EnumPacketServer.MainmenuAdvancedSave, this.npc.advanced.writeToNBT(new NBTTagCompound()));
    }
}

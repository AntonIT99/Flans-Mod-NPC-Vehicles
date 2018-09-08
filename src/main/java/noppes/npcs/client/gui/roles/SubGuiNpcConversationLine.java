// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.roles;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import noppes.npcs.client.NoppesUtil;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.GuiNpcSoundSelection;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiNpcConversationLine extends SubGuiInterface implements ITextfieldListener
{
    public String line;
    public String sound;
    private GuiNpcSoundSelection gui;
    
    public SubGuiNpcConversationLine(final String line, final String sound) {
        this.line = line;
        this.sound = sound;
        this.setBackground("menubg.png");
        this.xSize = 256;
        this.ySize = 216;
        this.closeOnEsc = true;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addLabel(new GuiNpcLabel(0, "Line", this.guiLeft + 4, this.guiTop + 10));
        this.addTextField(new GuiNpcTextField(0, this, this.fontRendererObj, this.guiLeft + 4, this.guiTop + 22, 200, 20, this.line));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 4, this.guiTop + 55, 90, 20, "Select Sound"));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 96, this.guiTop + 55, 20, 20, "X"));
        this.addLabel(new GuiNpcLabel(1, this.sound, this.guiLeft + 4, this.guiTop + 81));
        this.addButton(new GuiNpcButton(66, this.guiLeft + 162, this.guiTop + 192, 90, 20, "gui.done"));
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textfield) {
        this.line = textfield.getText();
    }
    
    @Override
    public void elementClicked() {
        this.sound = this.gui.getSelected();
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 1) {
            NoppesUtil.openGUI((EntityPlayer)this.player, this.gui = new GuiNpcSoundSelection(this.npc, this.parent, this.sound));
        }
        if (id == 2) {
            this.sound = "";
            this.initGui();
        }
        if (id == 66) {
            this.close();
        }
    }
}

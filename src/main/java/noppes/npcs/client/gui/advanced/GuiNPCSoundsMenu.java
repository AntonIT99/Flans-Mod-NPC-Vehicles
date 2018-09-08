// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.advanced;

import noppes.npcs.client.Client;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.constants.EnumPacketServer;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.GuiNpcSoundSelection;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNPCSoundsMenu extends GuiNPCInterface2 implements ITextfieldListener
{
    private GuiNpcSoundSelection gui;
    private GuiNpcTextField selectedField;
    
    public GuiNPCSoundsMenu(final EntityNPCInterface npc) {
        super(npc);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addLabel(new GuiNpcLabel(0, "advanced.idlesound", this.guiLeft + 5, this.guiTop + 20));
        this.addTextField(new GuiNpcTextField(0, this, this.fontRendererObj, this.guiLeft + 80, this.guiTop + 15, 200, 20, this.npc.advanced.idleSound));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 290, this.guiTop + 15, 80, 20, "gui.selectSound"));
        this.addLabel(new GuiNpcLabel(2, "advanced.angersound", this.guiLeft + 5, this.guiTop + 45));
        this.addTextField(new GuiNpcTextField(2, this, this.fontRendererObj, this.guiLeft + 80, this.guiTop + 40, 200, 20, this.npc.advanced.angrySound));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 290, this.guiTop + 40, 80, 20, "gui.selectSound"));
        this.addLabel(new GuiNpcLabel(3, "advanced.hurtsound", this.guiLeft + 5, this.guiTop + 70));
        this.addTextField(new GuiNpcTextField(3, this, this.fontRendererObj, this.guiLeft + 80, this.guiTop + 65, 200, 20, this.npc.advanced.hurtSound));
        this.addButton(new GuiNpcButton(3, this.guiLeft + 290, this.guiTop + 65, 80, 20, "gui.selectSound"));
        this.addLabel(new GuiNpcLabel(4, "advanced.deathsound", this.guiLeft + 5, this.guiTop + 95));
        this.addTextField(new GuiNpcTextField(4, this, this.fontRendererObj, this.guiLeft + 80, this.guiTop + 90, 200, 20, this.npc.advanced.deathSound));
        this.addButton(new GuiNpcButton(4, this.guiLeft + 290, this.guiTop + 90, 80, 20, "gui.selectSound"));
        this.addLabel(new GuiNpcLabel(5, "advanced.stepsound", this.guiLeft + 5, this.guiTop + 120));
        this.addTextField(new GuiNpcTextField(5, this, this.fontRendererObj, this.guiLeft + 80, this.guiTop + 115, 200, 20, this.npc.advanced.stepSound));
        this.addButton(new GuiNpcButton(5, this.guiLeft + 290, this.guiTop + 115, 80, 20, "gui.selectSound"));
        this.addLabel(new GuiNpcLabel(6, "advanced.haspitch", this.guiLeft + 5, this.guiTop + 150));
        this.addButton(new GuiNpcButton(6, this.guiLeft + 120, this.guiTop + 145, 80, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.npc.advanced.disablePitch ? 0 : 1)));
    }
    
    @Override
    public void buttonEvent(final GuiButton button) {
        if (button.id == 6) {
            this.npc.advanced.disablePitch = (((GuiNpcButton)button).getValue() == 0);
        }
        else {
            this.selectedField = this.getTextField(button.id);
            NoppesUtil.openGUI((EntityPlayer)this.player, this.gui = new GuiNpcSoundSelection(this.npc, this, this.selectedField.getText()));
        }
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textfield) {
        if (textfield.id == 0) {
            this.npc.advanced.idleSound = textfield.getText();
        }
        if (textfield.id == 2) {
            this.npc.advanced.angrySound = textfield.getText();
        }
        if (textfield.id == 3) {
            this.npc.advanced.hurtSound = textfield.getText();
        }
        if (textfield.id == 4) {
            this.npc.advanced.deathSound = textfield.getText();
        }
        if (textfield.id == 5) {
            this.npc.advanced.stepSound = textfield.getText();
        }
    }
    
    @Override
    public void elementClicked() {
        this.selectedField.setText(this.gui.getSelected());
        this.unFocused(this.selectedField);
    }
    
    @Override
    public void save() {
        Client.sendData(EnumPacketServer.MainmenuAdvancedSave, this.npc.advanced.writeToNBT(new NBTTagCompound()));
    }
}

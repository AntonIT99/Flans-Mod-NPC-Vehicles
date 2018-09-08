// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.FontRenderer;
import noppes.npcs.client.gui.util.GuiNpcButtonYesNo;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.DataStats;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiNpcRangeProperties extends SubGuiInterface implements ITextfieldListener
{
    private DataStats stats;
    private GuiNpcSoundSelection gui;
    
    public SubGuiNpcRangeProperties(final DataStats stats) {
        this.stats = stats;
        this.setBackground("menubg.png");
        this.xSize = 256;
        this.ySize = 216;
        this.closeOnEsc = true;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        int y = this.guiTop + 4;
        this.addTextField(new GuiNpcTextField(1, this, this.fontRendererObj, this.guiLeft + 85, y, 50, 18, this.stats.accuracy + ""));
        this.addLabel(new GuiNpcLabel(1, "stats.accuracy", this.guiLeft + 5, y + 5));
        this.getTextField(1).numbersOnly = true;
        this.getTextField(1).setMinMaxDefault(0, 100, 90);
        final int id = 2;
        final FontRenderer fontRendererObj = this.fontRendererObj;
        final int i = this.guiLeft + 85;
        y += 22;
        this.addTextField(new GuiNpcTextField(id, this, fontRendererObj, i, y, 50, 18, this.stats.rangedRange + ""));
        this.addLabel(new GuiNpcLabel(2, "stats.rangedrange", this.guiLeft + 5, y + 5));
        this.getTextField(2).numbersOnly = true;
        this.getTextField(2).setMinMaxDefault(1, 64, 2);
        final int id2 = 3;
        final FontRenderer fontRendererObj2 = this.fontRendererObj;
        final int j = this.guiLeft + 85;
        y += 22;
        this.addTextField(new GuiNpcTextField(id2, this, fontRendererObj2, j, y, 50, 18, this.stats.minDelay + ""));
        this.addLabel(new GuiNpcLabel(3, "stats.mindelay", this.guiLeft + 5, y + 5));
        this.getTextField(3).numbersOnly = true;
        this.getTextField(3).setMinMaxDefault(1, 9999, 20);
        final int id3 = 4;
        final FontRenderer fontRendererObj3 = this.fontRendererObj;
        final int k = this.guiLeft + 85;
        y += 22;
        this.addTextField(new GuiNpcTextField(id3, this, fontRendererObj3, k, y, 50, 18, this.stats.maxDelay + ""));
        this.addLabel(new GuiNpcLabel(4, "stats.maxdelay", this.guiLeft + 5, y + 5));
        this.getTextField(4).numbersOnly = true;
        this.getTextField(4).setMinMaxDefault(1, 9999, 20);
        final int id4 = 5;
        final FontRenderer fontRendererObj4 = this.fontRendererObj;
        final int l = this.guiLeft + 85;
        y += 22;
        this.addTextField(new GuiNpcTextField(id4, this, fontRendererObj4, l, y, 50, 18, this.stats.fireRate + ""));
        this.addLabel(new GuiNpcLabel(5, "stats.burstspeed", this.guiLeft + 5, y + 5));
        this.getTextField(5).numbersOnly = true;
        this.getTextField(5).setMinMaxDefault(0, 30, 0);
        final int id5 = 6;
        final FontRenderer fontRendererObj5 = this.fontRendererObj;
        final int m = this.guiLeft + 85;
        y += 22;
        this.addTextField(new GuiNpcTextField(id5, this, fontRendererObj5, m, y, 50, 18, this.stats.burstCount + ""));
        this.addLabel(new GuiNpcLabel(6, "stats.burstcount", this.guiLeft + 5, y + 5));
        this.getTextField(6).numbersOnly = true;
        this.getTextField(6).setMinMaxDefault(1, 100, 20);
        final int id6 = 7;
        final FontRenderer fontRendererObj6 = this.fontRendererObj;
        final int i2 = this.guiLeft + 85;
        y += 22;
        this.addTextField(new GuiNpcTextField(id6, this, fontRendererObj6, i2, y, 100, 20, this.stats.fireSound));
        this.addLabel(new GuiNpcLabel(7, "stats.firesound:", this.guiLeft + 5, y + 5));
        this.addButton(new GuiNpcButton(7, this.guiLeft + 187, y, 60, 20, "mco.template.button.select"));
        final int id7 = 8;
        final FontRenderer fontRendererObj7 = this.fontRendererObj;
        final int i3 = this.guiLeft + 85;
        y += 22;
        this.addTextField(new GuiNpcTextField(id7, this, fontRendererObj7, i3, y, 50, 18, this.stats.shotCount + ""));
        this.addLabel(new GuiNpcLabel(8, "stats.shotcount", this.guiLeft + 5, y + 5));
        this.getTextField(8).numbersOnly = true;
        this.getTextField(8).setMinMaxDefault(1, 10, 1);
        final int id8 = 9;
        final int x = this.guiLeft + 100;
        y += 22;
        this.addButton(new GuiNpcButtonYesNo(id8, x, y, this.stats.aimWhileShooting));
        this.addLabel(new GuiNpcLabel(9, "stats.aimWhileShooting", this.guiLeft + 5, y + 5));
        this.addButton(new GuiNpcButton(66, this.guiLeft + 190, this.guiTop + 190, 60, 20, "gui.done"));
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textfield) {
        if (textfield.id == 1) {
            this.stats.accuracy = textfield.getInteger();
        }
        else if (textfield.id == 2) {
            this.stats.rangedRange = textfield.getInteger();
        }
        else if (textfield.id == 3) {
            if (textfield.getInteger() > this.stats.maxDelay) {
                this.stats.minDelay = this.stats.maxDelay;
                textfield.setText(this.stats.minDelay + "");
            }
            else {
                this.stats.minDelay = textfield.getInteger();
            }
        }
        else if (textfield.id == 4) {
            if (textfield.getInteger() < this.stats.minDelay) {
                this.stats.maxDelay = this.stats.minDelay;
                textfield.setText(this.stats.maxDelay + "");
            }
            else {
                this.stats.maxDelay = textfield.getInteger();
            }
        }
        else if (textfield.id == 5) {
            this.stats.fireRate = textfield.getInteger();
        }
        else if (textfield.id == 6) {
            this.stats.burstCount = textfield.getInteger();
        }
        else if (textfield.id == 7) {
            this.stats.fireSound = textfield.getText();
        }
        else if (textfield.id == 8) {
            this.stats.shotCount = textfield.getInteger();
        }
    }
    
    @Override
    public void elementClicked() {
        this.getTextField(7).setText(this.gui.getSelected());
        this.unFocused(this.getTextField(7));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 7) {
            NoppesUtil.openGUI((EntityPlayer)this.player, this.gui = new GuiNpcSoundSelection(this.npc, this.parent, this.getTextField(7).getText()));
        }
        if (id == 66) {
            this.close();
        }
        else if (id == 9) {
            this.stats.aimWhileShooting = ((GuiNpcButtonYesNo)guibutton).getBoolean();
        }
    }
}

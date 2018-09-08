// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.roles;

import noppes.npcs.client.Client;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.constants.EnumPacketServer;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcSlider;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.roles.JobPuppet;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.ISliderListener;
import noppes.npcs.client.gui.util.GuiModelInterface;

public class GuiNpcPuppet extends GuiModelInterface implements ISliderListener
{
    private GuiScreen parent;
    private int type;
    private JobPuppet job;
    private JobPuppet.PartConfig part;
    
    public GuiNpcPuppet(final GuiScreen parent, final EntityCustomNpc npc) {
        super(npc);
        this.type = 6;
        this.parent = parent;
        this.xOffset = 100;
        this.ySize = 230;
        this.job = (JobPuppet)npc.jobInterface;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        int y = this.guiTop;
        this.addLabel(new GuiNpcLabel(26, "gui.settings", this.guiLeft + 55, y + 5, 16777215));
        if (this.type == 6) {
            final int i = 30;
            final int j = this.guiLeft + 120;
            y += 14;
            this.addButton(new GuiNpcButton(i, j, y, 60, 20, new String[] { "gui.yes", "gui.no" }, (int)(this.job.whileStanding ? 0 : 1)));
            this.addLabel(new GuiNpcLabel(30, "puppet.standing", this.guiLeft + 30, y + 5, 16777215));
            final int k = 31;
            final int l = this.guiLeft + 120;
            y += 22;
            this.addButton(new GuiNpcButton(k, l, y, 60, 20, new String[] { "gui.yes", "gui.no" }, (int)(this.job.whileMoving ? 0 : 1)));
            this.addLabel(new GuiNpcLabel(31, "puppet.walking", this.guiLeft + 30, y + 5, 16777215));
            final int m = 32;
            final int j2 = this.guiLeft + 120;
            y += 22;
            this.addButton(new GuiNpcButton(m, j2, y, 60, 20, new String[] { "gui.yes", "gui.no" }, (int)(this.job.whileAttacking ? 0 : 1)));
            this.addLabel(new GuiNpcLabel(32, "puppet.attacking", this.guiLeft + 30, y + 5, 16777215));
            y += 24;
        }
        else {
            this.addButton(new GuiNpcButton(6, this.guiLeft + 110, y, 60, 20, "selectServer.edit"));
            y += 24;
        }
        this.addLabel(new GuiNpcLabel(20, "model.head", this.guiLeft + 55, y + 5, 16777215));
        if (this.type == 0) {
            this.drawSlider(y, this.job.head);
            y += 90;
        }
        else {
            this.addButton(new GuiNpcButton(0, this.guiLeft + 110, y, 60, 20, "selectServer.edit"));
            y += 24;
        }
        this.addLabel(new GuiNpcLabel(21, "model.body", this.guiLeft + 55, y + 5, 16777215));
        if (this.type == 1) {
            this.drawSlider(y, this.job.body);
            y += 90;
        }
        else {
            this.addButton(new GuiNpcButton(1, this.guiLeft + 110, y, 60, 20, "selectServer.edit"));
            y += 24;
        }
        this.addLabel(new GuiNpcLabel(22, "model.larm", this.guiLeft + 55, y + 5, 16777215));
        if (this.type == 2) {
            this.drawSlider(y, this.job.larm);
            y += 90;
        }
        else {
            this.addButton(new GuiNpcButton(2, this.guiLeft + 110, y, 60, 20, "selectServer.edit"));
            y += 24;
        }
        this.addLabel(new GuiNpcLabel(23, "model.rarm", this.guiLeft + 55, y + 5, 16777215));
        if (this.type == 3) {
            this.drawSlider(y, this.job.rarm);
            y += 90;
        }
        else {
            this.addButton(new GuiNpcButton(3, this.guiLeft + 110, y, 60, 20, "selectServer.edit"));
            y += 24;
        }
        this.addLabel(new GuiNpcLabel(24, "model.lleg", this.guiLeft + 55, y + 5, 16777215));
        if (this.type == 4) {
            this.drawSlider(y, this.job.lleg);
            y += 90;
        }
        else {
            this.addButton(new GuiNpcButton(4, this.guiLeft + 110, y, 60, 20, "selectServer.edit"));
            y += 24;
        }
        this.addLabel(new GuiNpcLabel(25, "model.rleg", this.guiLeft + 55, y + 5, 16777215));
        if (this.type == 5) {
            this.drawSlider(y, this.job.rleg);
            y += 90;
        }
        else {
            this.addButton(new GuiNpcButton(5, this.guiLeft + 110, y, 60, 20, "selectServer.edit"));
            y += 24;
        }
    }
    
    private void drawSlider(int y, final JobPuppet.PartConfig config) {
        this.part = config;
        this.addButton(new GuiNpcButton(29, this.guiLeft + 100, y, 80, 20, new String[] { "gui.enabled", "gui.disabled" }, (int)(config.disabled ? 1 : 0)));
        y += 22;
        this.addLabel(new GuiNpcLabel(10, "X", this.guiLeft, y + 5, 16777215));
        this.addSlider(new GuiNpcSlider(this, 10, this.guiLeft + 50, y, config.rotationX + 0.5f));
        y += 22;
        this.addLabel(new GuiNpcLabel(11, "Y", this.guiLeft, y + 5, 16777215));
        this.addSlider(new GuiNpcSlider(this, 11, this.guiLeft + 50, y, config.rotationY + 0.5f));
        y += 22;
        this.addLabel(new GuiNpcLabel(12, "Z", this.guiLeft, y + 5, 16777215));
        this.addSlider(new GuiNpcSlider(this, 12, this.guiLeft + 50, y, config.rotationZ + 0.5f));
    }
    
    @Override
    protected void actionPerformed(final GuiButton btn) {
        super.actionPerformed(btn);
        if (btn.id < 7) {
            this.type = btn.id;
            this.initGui();
        }
        if (!(btn instanceof GuiNpcButton)) {
            return;
        }
        final GuiNpcButton button = (GuiNpcButton)btn;
        if (btn.id == 29) {
            this.part.disabled = (button.getValue() == 1);
        }
        if (btn.id == 30) {
            this.job.whileStanding = (button.getValue() == 0);
        }
        if (btn.id == 31) {
            this.job.whileMoving = (button.getValue() == 0);
        }
        if (btn.id == 32) {
            this.job.whileAttacking = (button.getValue() == 0);
        }
    }
    
    @Override
    public void close() {
        this.mc.displayGuiScreen(this.parent);
        Client.sendData(EnumPacketServer.JobSave, this.job.writeToNBT(new NBTTagCompound()));
    }
    
    @Override
    public void mouseDragged(final GuiNpcSlider slider) {
        final int percent = (int)(slider.sliderValue * 360.0f);
        slider.setString(percent + "%");
        if (slider.id == 10) {
            this.part.rotationX = slider.sliderValue - 0.5f;
        }
        if (slider.id == 11) {
            this.part.rotationY = slider.sliderValue - 0.5f;
        }
        if (slider.id == 12) {
            this.part.rotationZ = slider.sliderValue - 0.5f;
        }
        this.npc.updateHitbox();
    }
    
    @Override
    public void mousePressed(final GuiNpcSlider slider) {
    }
    
    @Override
    public void mouseReleased(final GuiNpcSlider slider) {
    }
}

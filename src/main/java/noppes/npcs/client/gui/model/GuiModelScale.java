// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.model;

import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcSlider;
import noppes.npcs.ModelPartConfig;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.ModelData;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.ISliderListener;
import noppes.npcs.client.gui.util.GuiModelInterface;

public class GuiModelScale extends GuiModelInterface implements ISliderListener
{
    private GuiScreen parent;
    private int type;
    
    public GuiModelScale(final GuiScreen parent, final ModelData data, final EntityCustomNpc npc) {
        super(npc);
        this.type = 0;
        this.parent = parent;
        this.xOffset = 100;
        this.ySize = 230;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        int y = this.guiTop + 2;
        this.addLabel(new GuiNpcLabel(20, "Head", this.guiLeft + 55, y + 5, 16777215));
        if (this.type == 0) {
            this.drawSlider(y, this.playerdata.head);
            y += 88;
        }
        else {
            this.addButton(new GuiNpcButton(0, this.guiLeft + 110, y, 60, 20, "Edit"));
            y += 24;
        }
        this.addLabel(new GuiNpcLabel(21, "Body", this.guiLeft + 55, y + 5, 16777215));
        if (this.type == 1) {
            this.drawSlider(y, this.playerdata.body);
            y += 88;
        }
        else {
            this.addButton(new GuiNpcButton(1, this.guiLeft + 110, y, 60, 20, "Edit"));
            y += 24;
        }
        this.addLabel(new GuiNpcLabel(22, "Arms", this.guiLeft + 55, y + 5, 16777215));
        if (this.type == 2) {
            this.drawSlider(y, this.playerdata.arms);
            y += 88;
        }
        else {
            this.addButton(new GuiNpcButton(2, this.guiLeft + 110, y, 60, 20, "Edit"));
            y += 24;
        }
        this.addLabel(new GuiNpcLabel(23, "Legs", this.guiLeft + 55, y + 5, 16777215));
        if (this.type == 3) {
            this.drawSlider(y, this.playerdata.legs);
            y += 88;
        }
        else {
            this.addButton(new GuiNpcButton(3, this.guiLeft + 110, y, 60, 20, "Edit"));
            y += 24;
        }
    }
    
    private void drawSlider(int y, final ModelPartConfig config) {
        y += 15;
        this.addLabel(new GuiNpcLabel(10, "Width", this.guiLeft, y + 5, 16777215));
        this.addSlider(new GuiNpcSlider(this, 10, this.guiLeft + 50, y, config.scaleX - 0.5f));
        y += 22;
        this.addLabel(new GuiNpcLabel(11, "Height", this.guiLeft, y + 5, 16777215));
        this.addSlider(new GuiNpcSlider(this, 11, this.guiLeft + 50, y, config.scaleY - 0.5f));
        y += 22;
        this.addLabel(new GuiNpcLabel(12, "Depth", this.guiLeft, y + 5, 16777215));
        this.addSlider(new GuiNpcSlider(this, 12, this.guiLeft + 50, y, config.scaleZ - 0.5f));
    }
    
    @Override
    protected void actionPerformed(final GuiButton btn) {
        super.actionPerformed(btn);
        if (btn.id < 4) {
            this.type = btn.id;
            this.initGui();
        }
    }
    
    @Override
    public void close() {
        this.mc.displayGuiScreen(this.parent);
    }
    
    @Override
    public void mouseDragged(final GuiNpcSlider slider) {
        final int percent = (int)(50.0f + slider.sliderValue * 100.0f);
        slider.setString(percent + "%");
        ModelPartConfig config = this.playerdata.head;
        if (this.type == 1) {
            config = this.playerdata.body;
        }
        else if (this.type == 2) {
            config = this.playerdata.arms;
        }
        else if (this.type == 3) {
            config = this.playerdata.legs;
        }
        if (slider.id == 10) {
            config.scaleX = slider.sliderValue + 0.5f;
        }
        if (slider.id == 11) {
            config.scaleY = slider.sliderValue + 0.5f;
        }
        if (slider.id == 12) {
            config.scaleZ = slider.sliderValue + 0.5f;
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

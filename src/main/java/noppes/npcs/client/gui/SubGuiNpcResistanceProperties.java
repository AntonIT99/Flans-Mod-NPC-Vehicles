// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcSlider;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.Resistances;
import noppes.npcs.client.gui.util.ISliderListener;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiNpcResistanceProperties extends SubGuiInterface implements ISliderListener
{
    private Resistances resistances;
    
    public SubGuiNpcResistanceProperties(final Resistances resistances) {
        this.resistances = resistances;
        this.setBackground("menubg.png");
        this.xSize = 256;
        this.ySize = 216;
        this.closeOnEsc = true;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addLabel(new GuiNpcLabel(0, "enchantment.knockback", this.guiLeft + 4, this.guiTop + 15));
        this.addSlider(new GuiNpcSlider(this, 0, this.guiLeft + 94, this.guiTop + 10, (int)(this.resistances.knockback * 100.0f - 100.0f) + "%", this.resistances.knockback / 2.0f));
        this.addLabel(new GuiNpcLabel(1, "item.arrow.name", this.guiLeft + 4, this.guiTop + 37));
        this.addSlider(new GuiNpcSlider(this, 1, this.guiLeft + 94, this.guiTop + 32, (int)(this.resistances.arrow * 100.0f - 100.0f) + "%", this.resistances.arrow / 2.0f));
        this.addLabel(new GuiNpcLabel(2, "stats.melee", this.guiLeft + 4, this.guiTop + 59));
        this.addSlider(new GuiNpcSlider(this, 2, this.guiLeft + 94, this.guiTop + 54, (int)(this.resistances.playermelee * 100.0f - 100.0f) + "%", this.resistances.playermelee / 2.0f));
        this.addLabel(new GuiNpcLabel(3, "stats.explosion", this.guiLeft + 4, this.guiTop + 81));
        this.addSlider(new GuiNpcSlider(this, 3, this.guiLeft + 94, this.guiTop + 76, (int)(this.resistances.explosion * 100.0f - 100.0f) + "%", this.resistances.explosion / 2.0f));
        this.addButton(new GuiNpcButton(66, this.guiLeft + 190, this.guiTop + 190, 60, 20, "gui.done"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 66) {
            this.close();
        }
    }
    
    @Override
    public void mouseDragged(final GuiNpcSlider slider) {
        slider.displayString = (int)(slider.sliderValue * 200.0f - 100.0f) + "%";
    }
    
    @Override
    public void mousePressed(final GuiNpcSlider slider) {
    }
    
    @Override
    public void mouseReleased(final GuiNpcSlider slider) {
        if (slider.id == 0) {
            this.resistances.knockback = slider.sliderValue * 2.0f;
        }
        if (slider.id == 1) {
            this.resistances.arrow = slider.sliderValue * 2.0f;
        }
        if (slider.id == 2) {
            this.resistances.playermelee = slider.sliderValue * 2.0f;
        }
        if (slider.id == 3) {
            this.resistances.explosion = slider.sliderValue * 2.0f;
        }
    }
}

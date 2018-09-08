// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.model;

import noppes.npcs.client.controllers.PresetController;
import noppes.npcs.client.controllers.Preset;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.ModelData;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiPresetSave extends GuiNPCInterface
{
    private ModelData data;
    private GuiScreen parent;
    
    public GuiPresetSave(final GuiScreen parent, final ModelData data) {
        this.data = data;
        this.parent = parent;
        this.xSize = 200;
        this.drawDefaultBackground = true;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addTextField(new GuiNpcTextField(0, this, this.guiLeft, this.guiTop + 70, 200, 20, ""));
        this.addButton(new GuiNpcButton(0, this.guiLeft, this.guiTop + 100, 98, 20, "Save"));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 100, this.guiTop + 100, 98, 20, "Cancel"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton btn) {
        super.actionPerformed(btn);
        final GuiNpcButton button = (GuiNpcButton)btn;
        if (button.id == 0) {
            final String name = this.getTextField(0).getText().trim();
            if (name.isEmpty()) {
                return;
            }
            final Preset preset = new Preset();
            preset.name = name;
            preset.data = this.data.copy();
            PresetController.instance.addPreset(preset);
        }
        this.mc.displayGuiScreen(this.parent);
    }
    
    @Override
    public void save() {
    }
}

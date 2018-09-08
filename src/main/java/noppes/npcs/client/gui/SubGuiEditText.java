// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiEditText extends SubGuiInterface
{
    public String text;
    public boolean cancelled;
    
    public SubGuiEditText(final String text) {
        this.cancelled = true;
        this.text = text;
        this.setBackground("extrasmallbg.png");
        this.closeOnEsc = true;
        this.xSize = 176;
        this.ySize = 71;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addTextField(new GuiNpcTextField(0, this.parent, this.guiLeft + 4, this.guiTop + 14, 168, 20, this.text));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 4, this.guiTop + 44, 80, 20, "gui.done"));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 90, this.guiTop + 44, 80, 20, "gui.cancel"));
    }
    
    @Override
    public void buttonEvent(final GuiButton button) {
        if (button.id == 0) {
            this.cancelled = false;
            this.text = this.getTextField(0).getText();
        }
        this.close();
    }
    
    @Override
    public void save() {
    }
}

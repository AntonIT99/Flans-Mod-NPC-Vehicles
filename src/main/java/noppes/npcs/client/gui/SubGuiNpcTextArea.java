// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import noppes.npcs.NoppesStringUtils;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextArea;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiNpcTextArea extends SubGuiInterface
{
    public String text;
    private GuiNpcTextArea textarea;
    
    public SubGuiNpcTextArea(final String text) {
        this.text = text;
        this.setBackground("bgfilled.png");
        this.xSize = 256;
        this.ySize = 256;
        this.closeOnEsc = true;
    }
    
    @Override
    public void initGui() {
        this.xSize = (int)(this.width * 0.88);
        this.ySize = (int)(this.xSize * 0.56);
        this.bgScale = this.xSize / 440.0f;
        super.initGui();
        if (this.textarea != null) {
            this.text = this.textarea.getText();
        }
        final int yoffset = (int)(this.ySize * 0.02);
        this.addTextField(this.textarea = new GuiNpcTextArea(2, this, this.guiLeft + yoffset, this.guiTop + yoffset, this.xSize - 100 - yoffset * 2, this.ySize - yoffset * 2, this.text));
        this.buttonList.add(new GuiNpcButton(102, this.guiLeft + this.xSize - 90 - yoffset, this.guiTop + 20, 56, 20, "gui.clear"));
        this.buttonList.add(new GuiNpcButton(101, this.guiLeft + this.xSize - 90 - yoffset, this.guiTop + 43, 56, 20, "gui.paste"));
        this.buttonList.add(new GuiNpcButton(100, this.guiLeft + this.xSize - 90 - yoffset, this.guiTop + 66, 56, 20, "gui.copy"));
        this.buttonList.add(new GuiNpcButton(0, this.guiLeft + this.xSize - 90 - yoffset, this.guiTop + 160, 56, 20, "gui.close"));
        this.xSize = 420;
        this.ySize = 256;
    }
    
    @Override
    public void close() {
        this.text = this.getTextField(2).getText();
        super.close();
    }
    
    @Override
    public void buttonEvent(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 100) {
            NoppesStringUtils.setClipboardContents(this.getTextField(2).getText());
        }
        if (id == 101) {
            this.getTextField(2).setText(NoppesStringUtils.getClipboardContents());
        }
        if (id == 102) {
            this.getTextField(2).setText("");
        }
        if (id == 0) {
            this.close();
        }
    }
}

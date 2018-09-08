// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import java.util.Iterator;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import java.util.Collection;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import net.minecraft.client.gui.GuiScreen;
import java.util.ArrayList;
import java.util.List;
import noppes.npcs.controllers.ScriptContainer;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class GuiScriptList extends SubGuiInterface
{
    private GuiCustomScroll scroll1;
    private GuiCustomScroll scroll2;
    private ScriptContainer container;
    private List<String> scripts;
    
    public GuiScriptList(List<String> scripts, final ScriptContainer container) {
        this.container = container;
        this.setBackground("menubg.png");
        this.xSize = 346;
        this.ySize = 216;
        if (scripts == null) {
            scripts = new ArrayList<String>();
        }
        this.scripts = scripts;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        if (this.scroll1 == null) {
            (this.scroll1 = new GuiCustomScroll(this, 0)).setSize(140, 180);
        }
        this.scroll1.guiLeft = this.guiLeft + 4;
        this.scroll1.guiTop = this.guiTop + 14;
        this.addScroll(this.scroll1);
        this.addLabel(new GuiNpcLabel(1, "script.availableScripts", this.guiLeft + 4, this.guiTop + 4));
        if (this.scroll2 == null) {
            (this.scroll2 = new GuiCustomScroll(this, 1)).setSize(140, 180);
        }
        this.scroll2.guiLeft = this.guiLeft + 200;
        this.scroll2.guiTop = this.guiTop + 14;
        this.addScroll(this.scroll2);
        this.addLabel(new GuiNpcLabel(2, "script.loadedScripts", this.guiLeft + 200, this.guiTop + 4));
        final List<String> temp = new ArrayList<String>(this.scripts);
        temp.removeAll(this.container.scripts);
        this.scroll1.setList(temp);
        this.scroll2.setList(this.container.scripts);
        this.addButton(new GuiNpcButton(1, this.guiLeft + 145, this.guiTop + 40, 55, 20, ">"));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 145, this.guiTop + 62, 55, 20, "<"));
        this.addButton(new GuiNpcButton(3, this.guiLeft + 145, this.guiTop + 90, 55, 20, ">>"));
        this.addButton(new GuiNpcButton(4, this.guiLeft + 145, this.guiTop + 112, 55, 20, "<<"));
        this.addButton(new GuiNpcButton(66, this.guiLeft + 260, this.guiTop + 194, 60, 20, "gui.done"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 1 && this.scroll1.hasSelected()) {
            this.container.scripts.add(this.scroll1.getSelected());
            this.scroll1.selected = -1;
            this.scroll1.selected = -1;
            this.initGui();
        }
        if (button.id == 2 && this.scroll2.hasSelected()) {
            this.container.scripts.remove(this.scroll2.getSelected());
            this.scroll2.selected = -1;
            this.initGui();
        }
        if (button.id == 3) {
            this.container.scripts.clear();
            for (final String script : this.scripts) {
                this.container.scripts.add(script);
            }
            this.scroll1.selected = -1;
            this.scroll1.selected = -1;
            this.initGui();
        }
        if (button.id == 4) {
            this.container.scripts.clear();
            this.scroll1.selected = -1;
            this.scroll1.selected = -1;
            this.initGui();
        }
        if (button.id == 66) {
            this.close();
        }
    }
    
    @Override
    public void save() {
    }
}

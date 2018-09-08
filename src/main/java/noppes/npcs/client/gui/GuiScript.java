// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.client.gui.swing.GuiJTextArea;
import noppes.npcs.client.gui.util.SubGuiInterface;
import noppes.npcs.client.NoppesUtil;
import noppes.npcs.controllers.ScriptController;
import noppes.npcs.NoppesStringUtils;
import net.minecraft.client.gui.GuiConfirmOpenLink;
import java.util.Iterator;
import net.minecraft.server.MinecraftServer;
import java.util.Collection;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcTextArea;
import noppes.npcs.controllers.ScriptContainer;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import java.util.ArrayList;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiMenuTopButton;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import java.util.HashMap;
import noppes.npcs.entity.EntityNPCInterface;
import java.util.List;
import java.util.Map;
import noppes.npcs.DataScript;
import noppes.npcs.client.gui.util.IJTextAreaListener;
import noppes.npcs.client.gui.util.ICustomScrollListener;
import net.minecraft.client.gui.GuiYesNoCallback;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiScript extends GuiNPCInterface implements IGuiData, GuiYesNoCallback, ICustomScrollListener, IJTextAreaListener
{
    public boolean showScript;
    private int activeTab;
    public DataScript script;
    public Map<String, List<String>> languages;
    private static int activeConsole;
    
    public GuiScript(final EntityNPCInterface npc) {
        super(npc);
        this.showScript = false;
        this.activeTab = 0;
        this.languages = new HashMap<String, List<String>>();
        this.script = npc.script;
        this.drawDefaultBackground = true;
        this.closeOnEsc = true;
        this.xSize = 420;
        this.setBackground("menubg.png");
        Client.sendData(EnumPacketServer.ScriptDataGet, new Object[0]);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.guiTop += 10;
        GuiMenuTopButton top;
        this.addTopButton(top = new GuiMenuTopButton(13, this.guiLeft + 4, this.guiTop - 17, "script.scripts"));
        top.active = this.showScript;
        this.addTopButton(top = new GuiMenuTopButton(14, top, "gui.settings"));
        top.active = !this.showScript;
        this.addTopButton(new GuiMenuTopButton(15, top, "gui.website"));
        final List<String> list = new ArrayList<String>();
        list.add("script.init");
        list.add("script.update");
        list.add("script.interact");
        list.add("dialog.dialog");
        list.add("script.damaged");
        list.add("script.killed");
        list.add("script.attack");
        list.add("script.target");
        list.add("script.collide");
        list.add("script.kills");
        list.add("script.dialog_closed");
        if (this.showScript) {
            this.addLabel(new GuiNpcLabel(0, "script.hooks", this.guiLeft + 4, this.guiTop + 5));
            final GuiCustomScroll hooks = new GuiCustomScroll(this, 1);
            hooks.setSize(68, 198);
            hooks.guiLeft = this.guiLeft + 4;
            hooks.guiTop = this.guiTop + 14;
            hooks.setUnsortedList(list);
            hooks.selected = this.activeTab;
            this.addScroll(hooks);
            final ScriptContainer container = this.script.scripts.get(this.activeTab);
            this.addTextField(new GuiNpcTextArea(2, this, this.guiLeft + 74, this.guiTop + 4, 239, 208, (container == null) ? "" : container.script));
            this.addButton(new GuiNpcButton(102, this.guiLeft + 315, this.guiTop + 4, 50, 20, "gui.clear"));
            this.addButton(new GuiNpcButton(101, this.guiLeft + 366, this.guiTop + 4, 50, 20, "gui.paste"));
            this.addButton(new GuiNpcButton(100, this.guiLeft + 315, this.guiTop + 25, 50, 20, "gui.copy"));
            this.addButton(new GuiNpcButton(108, this.guiLeft + 315, this.guiTop + 47, 80, 20, "gui.editor"));
            this.addButton(new GuiNpcButton(107, this.guiLeft + 315, this.guiTop + 70, 80, 20, "script.loadscript"));
            final GuiCustomScroll scroll = new GuiCustomScroll(this, 0).setUnselectable();
            scroll.setSize(100, 120);
            scroll.guiLeft = this.guiLeft + 315;
            scroll.guiTop = this.guiTop + 92;
            if (container != null) {
                scroll.setList(container.scripts);
            }
            this.addScroll(scroll);
        }
        else {
            this.addLabel(new GuiNpcLabel(0, "script.console", this.guiLeft + 4, this.guiTop + 16));
            this.getTopButton(14).active = true;
            this.addTextField(new GuiNpcTextArea(2, this, this.guiLeft + 4, this.guiTop + 26, 226, 186, this.getConsoleText()));
            this.getTextField(2).canEdit = false;
            this.addButton(new GuiNpcButton(100, this.guiLeft + 232, this.guiTop + 170, 56, 20, "gui.copy"));
            this.addButton(new GuiNpcButton(102, this.guiLeft + 232, this.guiTop + 192, 56, 20, "gui.clear"));
            final List<String> l = new ArrayList<String>();
            l.add("All");
            l.addAll(list);
            this.addButton(new GuiNpcButton(105, this.guiLeft + 60, this.guiTop + 4, 80, 20, l.toArray(new String[l.size()]), GuiScript.activeConsole));
            this.addLabel(new GuiNpcLabel(1, "script.language", this.guiLeft + 232, this.guiTop + 30));
            this.addButton(new GuiNpcButton(103, this.guiLeft + 294, this.guiTop + 25, 80, 20, this.languages.keySet().toArray(new String[this.languages.keySet().size()]), this.getScriptIndex()));
            this.getButton(103).enabled = (this.languages.size() > 0);
            this.addLabel(new GuiNpcLabel(2, "gui.enabled", this.guiLeft + 232, this.guiTop + 53));
            this.addButton(new GuiNpcButton(104, this.guiLeft + 294, this.guiTop + 48, 50, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.script.enabled ? 1 : 0)));
            if (MinecraftServer.getServer() != null) {
                this.addButton(new GuiNpcButton(106, this.guiLeft + 232, this.guiTop + 71, 150, 20, "script.openfolder"));
            }
        }
    }
    
    private int getScriptIndex() {
        int i = 0;
        for (final String language : this.languages.keySet()) {
            if (language.equalsIgnoreCase(this.script.scriptLanguage)) {
                return i;
            }
            ++i;
        }
        return 0;
    }
    
    private String getConsoleText() {
        String console = "";
        if (GuiScript.activeConsole == 0) {
            for (final ScriptContainer container : this.script.scripts.values()) {
                if (!container.console.isEmpty()) {
                    console = console + container.console + '\n';
                }
            }
        }
        else {
            final ScriptContainer container2 = this.script.scripts.get(GuiScript.activeConsole - 1);
            if (container2 != null) {
                console = container2.console;
            }
        }
        return console;
    }
    
    public void confirmClicked(final boolean flag, final int i) {
        if (flag) {
            this.openLink("http://www.kodevelopment.nl/minecraft/customnpcs/scripting");
        }
        this.displayGuiScreen(this);
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        if (guibutton.id == 13) {
            this.showScript = true;
            this.initGui();
        }
        if (guibutton.id == 14) {
            this.setScript();
            this.showScript = false;
            this.initGui();
        }
        if (guibutton.id == 15) {
            final GuiConfirmOpenLink guiyesno = new GuiConfirmOpenLink((GuiYesNoCallback)this, "http://www.kodevelopment.nl/minecraft/customnpcs/scripting", 0, true);
            this.mc.displayGuiScreen((GuiScreen)guiyesno);
        }
        if (guibutton.id == 100) {
            NoppesStringUtils.setClipboardContents(this.getTextField(2).getText());
        }
        if (guibutton.id == 101) {
            this.getTextField(2).setText(NoppesStringUtils.getClipboardContents());
        }
        if (guibutton.id == 102) {
            this.getTextField(2).setText("");
            if (!this.showScript) {
                if (GuiScript.activeConsole == 0) {
                    for (final ScriptContainer container : this.script.scripts.values()) {
                        container.console = "";
                    }
                }
                else {
                    final ScriptContainer container2 = this.script.scripts.get(GuiScript.activeConsole - 1);
                    if (container2 != null) {
                        container2.console = "";
                    }
                }
            }
        }
        if (guibutton.id == 103) {
            this.script.scriptLanguage = ((GuiNpcButton)guibutton).displayString;
        }
        if (guibutton.id == 104) {
            this.script.enabled = (((GuiNpcButton)guibutton).getValue() == 1);
        }
        if (guibutton.id == 105) {
            GuiScript.activeConsole = ((GuiNpcButton)guibutton).getValue();
            this.initGui();
        }
        if (guibutton.id == 106) {
            NoppesUtil.openFolder(ScriptController.Instance.dir);
        }
        if (guibutton.id == 107) {
            ScriptContainer container2 = this.script.scripts.get(this.activeTab);
            if (container2 == null) {
                this.script.scripts.put(this.activeTab, container2 = new ScriptContainer());
            }
            this.setSubGui(new GuiScriptList(this.languages.get(this.script.scriptLanguage), container2));
        }
        if (guibutton.id == 108) {
            final ScriptContainer container2 = this.script.scripts.get(this.activeTab);
            if (container2 != null) {
                this.setScript();
                GuiScript.AWTWindow = new GuiJTextArea(container2.script).setListener(this);
            }
        }
    }
    
    private void setScript() {
        if (this.showScript) {
            ScriptContainer container = this.script.scripts.get(this.activeTab);
            if (container == null) {
                this.script.scripts.put(this.activeTab, container = new ScriptContainer());
            }
            String text = this.getTextField(2).getText();
            text = text.replace("\r\n", "\n");
            text = text.replace("\r", "\n");
            container.script = text;
        }
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        this.script.readFromNBT(compound);
        final NBTTagList data = compound.getTagList("Languages", 10);
        final Map<String, List<String>> languages = new HashMap<String, List<String>>();
        for (int i = 0; i < data.tagCount(); ++i) {
            final NBTTagCompound comp = data.getCompoundTagAt(i);
            final List<String> scripts = new ArrayList<String>();
            final NBTTagList list = comp.getTagList("Scripts", 8);
            for (int j = 0; j < list.tagCount(); ++j) {
                scripts.add(list.getStringTagAt(j));
            }
            languages.put(comp.getString("Language"), scripts);
        }
        this.languages = languages;
        this.initGui();
    }
    
    @Override
    public void save() {
        this.setScript();
        Client.sendData(EnumPacketServer.ScriptDataSave, this.script.writeToNBT(new NBTTagCompound()));
    }
    
    public void customScrollClicked(final int i, final int j, final int k, final GuiCustomScroll scroll) {
        if (scroll.id == 1) {
            this.setScript();
            this.activeTab = scroll.selected;
            this.initGui();
        }
    }
    
    public void saveText(final String text) {
        final ScriptContainer container = this.script.scripts.get(this.activeTab);
        if (container != null) {
            container.script = text;
        }
        this.initGui();
    }
    
    static {
        GuiScript.activeConsole = 0;
    }
}

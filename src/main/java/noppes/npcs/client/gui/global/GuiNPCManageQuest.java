// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.global;

import java.util.List;
import java.util.Vector;
import noppes.npcs.client.gui.SubGuiNpcCommand;
import noppes.npcs.client.gui.SubGuiMailmanSendSetup;
import noppes.npcs.client.gui.SubGuiNpcFactionOptions;
import noppes.npcs.constants.EnumQuestRepeat;
import noppes.npcs.client.gui.questtypes.GuiNpcQuestTypeLocation;
import noppes.npcs.client.gui.questtypes.GuiNpcQuestTypeKill;
import noppes.npcs.client.gui.questtypes.GuiNpcQuestTypeDialog;
import noppes.npcs.constants.EnumQuestType;
import noppes.npcs.constants.EnumGuiType;
import noppes.npcs.client.gui.util.SubGuiInterface;
import noppes.npcs.client.gui.SubGuiNpcTextArea;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.constants.EnumQuestCompletion;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.controllers.QuestCategory;
import noppes.npcs.controllers.Quest;
import java.util.HashMap;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.ICustomScrollListener;
import noppes.npcs.client.gui.util.GuiSelectionListener;
import noppes.npcs.client.gui.util.ISubGuiListener;
import noppes.npcs.client.gui.util.IScrollData;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNPCManageQuest extends GuiNPCInterface2 implements IScrollData, ISubGuiListener, GuiSelectionListener, ICustomScrollListener, ITextfieldListener, IGuiData
{
    private GuiCustomScroll scroll;
    private HashMap<String, Integer> data;
    public static Quest quest;
    private QuestCategory category;
    private boolean categorySelection;
    private boolean questlogTA;
    public static GuiScreen Instance;
    
    public GuiNPCManageQuest(final EntityNPCInterface npc) {
        super(npc);
        this.data = new HashMap<String, Integer>();
        this.category = new QuestCategory();
        this.categorySelection = true;
        this.questlogTA = false;
        GuiNPCManageQuest.Instance = this;
        Client.sendData(EnumPacketServer.QuestCategoriesGet, new Object[0]);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addButton(new GuiNpcButton(0, this.guiLeft + 358, this.guiTop + 8, 58, 20, this.categorySelection ? "quest.quests" : "gui.categories"));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 358, this.guiTop + 38, 58, 20, "gui.add"));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 358, this.guiTop + 61, 58, 20, "gui.remove"));
        if (this.scroll == null) {
            (this.scroll = new GuiCustomScroll(this, 0)).setSize(143, 208);
        }
        this.scroll.guiLeft = this.guiLeft + 214;
        this.scroll.guiTop = this.guiTop + 4;
        this.addScroll(this.scroll);
        if (this.categorySelection && this.category.id >= 0) {
            this.categoryGuiInit();
        }
        if (!this.categorySelection && GuiNPCManageQuest.quest.id >= 0) {
            this.dialogGuiInit();
        }
    }
    
    private void dialogGuiInit() {
        this.addLabel(new GuiNpcLabel(1, "gui.title", this.guiLeft + 4, this.guiTop + 8));
        this.addTextField(new GuiNpcTextField(1, this, this.fontRendererObj, this.guiLeft + 36, this.guiTop + 3, 140, 20, GuiNPCManageQuest.quest.title));
        this.addLabel(new GuiNpcLabel(0, "ID", this.guiLeft + 178, this.guiTop + 4));
        this.addLabel(new GuiNpcLabel(2, GuiNPCManageQuest.quest.id + "", this.guiLeft + 178, this.guiTop + 14));
        this.addLabel(new GuiNpcLabel(3, "quest.completedtext", this.guiLeft + 4, this.guiTop + 30));
        this.addButton(new GuiNpcButton(3, this.guiLeft + 120, this.guiTop + 25, 50, 20, "selectServer.edit"));
        this.addLabel(new GuiNpcLabel(4, "quest.questlogtext", this.guiLeft + 4, this.guiTop + 51));
        this.addButton(new GuiNpcButton(4, this.guiLeft + 120, this.guiTop + 46, 50, 20, "selectServer.edit"));
        this.addLabel(new GuiNpcLabel(5, "quest.reward", this.guiLeft + 4, this.guiTop + 72));
        this.addButton(new GuiNpcButton(5, this.guiLeft + 120, this.guiTop + 67, 50, 20, "selectServer.edit"));
        this.addLabel(new GuiNpcLabel(6, "gui.type", this.guiLeft + 4, this.guiTop + 93));
        this.addButton(new GuiNpcButton(6, this.guiLeft + 90, this.guiTop + 88, 70, 20, new String[] { "quest.item", "quest.dialog", "quest.kill", "quest.location", "quest.areakill" }, GuiNPCManageQuest.quest.type.ordinal()));
        this.addButton(new GuiNpcButton(7, this.guiLeft + 162, this.guiTop + 88, 50, 20, "selectServer.edit"));
        this.addLabel(new GuiNpcLabel(8, "quest.repeatable", this.guiLeft + 4, this.guiTop + 114));
        this.addButton(new GuiNpcButton(8, this.guiLeft + 110, this.guiTop + 109, 70, 20, new String[] { "gui.no", "gui.yes", "quest.mcdaily", "quest.mcweekly", "quest.rldaily", "quest.rlweekly" }, GuiNPCManageQuest.quest.repeat.ordinal()));
        this.addButton(new GuiNpcButton(9, this.guiLeft + 4, this.guiTop + 131, 90, 20, new String[] { "quest.npc", "quest.instant" }, GuiNPCManageQuest.quest.completion.ordinal()));
        if (GuiNPCManageQuest.quest.completerNpc.isEmpty()) {
            GuiNPCManageQuest.quest.completerNpc = this.npc.display.name;
        }
        this.addTextField(new GuiNpcTextField(2, this, this.fontRendererObj, this.guiLeft + 96, this.guiTop + 131, 114, 20, GuiNPCManageQuest.quest.completerNpc));
        this.getTextField(2).enabled = (GuiNPCManageQuest.quest.completion == EnumQuestCompletion.Npc);
        this.addLabel(new GuiNpcLabel(10, "menu.advanced", this.guiLeft + 4, this.guiTop + 158));
        this.addButton(new GuiNpcButton(10, this.guiLeft + 120, this.guiTop + 153, 50, 20, "selectServer.edit"));
    }
    
    private void categoryGuiInit() {
        this.addTextField(new GuiNpcTextField(0, this, this.fontRendererObj, this.guiLeft + 8, this.guiTop + 8, 160, 16, this.category.title));
    }
    
    @Override
    public void buttonEvent(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 0) {
            this.save();
            if (this.categorySelection) {
                if (this.category.id < 0) {
                    return;
                }
                GuiNPCManageQuest.quest = new Quest();
                Client.sendData(EnumPacketServer.QuestsGet, this.category.id);
            }
            else if (!this.categorySelection) {
                GuiNPCManageQuest.quest = new Quest();
                this.category = new QuestCategory();
                Client.sendData(EnumPacketServer.QuestCategoriesGet, new Object[0]);
            }
            this.categorySelection = !this.categorySelection;
            this.getButton(0).setEnabled(false);
            this.scroll.clear();
            this.data.clear();
        }
        if (button.id == 1) {
            this.save();
            String name;
            for (name = "New"; this.data.containsKey(name); name += "_") {}
            if (this.categorySelection) {
                final QuestCategory category = new QuestCategory();
                category.title = name;
                Client.sendData(EnumPacketServer.QuestCategorySave, category.writeNBT(new NBTTagCompound()));
            }
            else {
                final Quest quest = new Quest();
                quest.title = name;
                Client.sendData(EnumPacketServer.QuestSave, this.category.id, quest.writeToNBT(new NBTTagCompound()));
            }
        }
        if (button.id == 2 && this.data.containsKey(this.scroll.getSelected())) {
            if (this.categorySelection) {
                Client.sendData(EnumPacketServer.QuestCategoryRemove, this.category.id);
                this.category = new QuestCategory();
            }
            else {
                Client.sendData(EnumPacketServer.QuestRemove, GuiNPCManageQuest.quest.id);
                GuiNPCManageQuest.quest = new Quest();
            }
            this.scroll.clear();
        }
        if (button.id == 3 && GuiNPCManageQuest.quest.id >= 0) {
            this.questlogTA = false;
            this.setSubGui(new SubGuiNpcTextArea(GuiNPCManageQuest.quest.completeText));
        }
        if (button.id == 4 && GuiNPCManageQuest.quest.id >= 0) {
            this.questlogTA = true;
            this.setSubGui(new SubGuiNpcTextArea(GuiNPCManageQuest.quest.logText));
        }
        if (button.id == 5 && GuiNPCManageQuest.quest.id >= 0) {
            Client.sendData(EnumPacketServer.QuestOpenGui, EnumGuiType.QuestReward, GuiNPCManageQuest.quest.writeToNBT(new NBTTagCompound()));
        }
        if (button.id == 6 && GuiNPCManageQuest.quest.id >= 0) {
            GuiNPCManageQuest.quest.setType(EnumQuestType.values()[button.getValue()]);
        }
        if (button.id == 7) {
            if (GuiNPCManageQuest.quest.type == EnumQuestType.Item) {
                Client.sendData(EnumPacketServer.QuestOpenGui, EnumGuiType.QuestItem, GuiNPCManageQuest.quest.writeToNBT(new NBTTagCompound()));
            }
            if (GuiNPCManageQuest.quest.type == EnumQuestType.Dialog) {
                this.setSubGui(new GuiNpcQuestTypeDialog(this.npc, GuiNPCManageQuest.quest, this));
            }
            if (GuiNPCManageQuest.quest.type == EnumQuestType.Kill) {
                this.setSubGui(new GuiNpcQuestTypeKill(this.npc, GuiNPCManageQuest.quest, this));
            }
            if (GuiNPCManageQuest.quest.type == EnumQuestType.Location) {
                this.setSubGui(new GuiNpcQuestTypeLocation(this.npc, GuiNPCManageQuest.quest, this));
            }
            if (GuiNPCManageQuest.quest.type == EnumQuestType.AreaKill) {
                this.setSubGui(new GuiNpcQuestTypeKill(this.npc, GuiNPCManageQuest.quest, this));
            }
        }
        if (button.id == 8) {
            GuiNPCManageQuest.quest.repeat = EnumQuestRepeat.values()[button.getValue()];
        }
        if (button.id == 9) {
            GuiNPCManageQuest.quest.completion = EnumQuestCompletion.values()[button.getValue()];
            this.getTextField(2).enabled = (GuiNPCManageQuest.quest.completion == EnumQuestCompletion.Npc);
        }
        if (button.id == 10) {
            this.setSubGui(new SubGuiNpcQuestAdvanced(GuiNPCManageQuest.quest, this));
        }
    }
    
    @Override
    public void unFocused(final GuiNpcTextField guiNpcTextField) {
        if (guiNpcTextField.id == 0) {
            if (this.category.id < 0) {
                guiNpcTextField.setText("");
            }
            else {
                final String name = guiNpcTextField.getText();
                if (name.isEmpty() || this.data.containsKey(name)) {
                    guiNpcTextField.setText(this.category.title);
                }
                else if (this.categorySelection && this.category.id >= 0) {
                    final String old = this.category.title;
                    this.data.remove(this.category.title);
                    this.category.title = name;
                    this.data.put(this.category.title, this.category.id);
                    this.scroll.replace(old, this.category.title);
                }
            }
        }
        if (guiNpcTextField.id == 1) {
            if (GuiNPCManageQuest.quest.id < 0) {
                guiNpcTextField.setText("");
            }
            else {
                final String name = guiNpcTextField.getText();
                if (name.isEmpty() || this.data.containsKey(name)) {
                    guiNpcTextField.setText(GuiNPCManageQuest.quest.title);
                }
                else if (!this.categorySelection && GuiNPCManageQuest.quest.id >= 0) {
                    final String old = GuiNPCManageQuest.quest.title;
                    this.data.remove(old);
                    GuiNPCManageQuest.quest.title = name;
                    this.data.put(GuiNPCManageQuest.quest.title, GuiNPCManageQuest.quest.id);
                    this.scroll.replace(old, GuiNPCManageQuest.quest.title);
                }
            }
        }
        if (guiNpcTextField.id == 2) {
            GuiNPCManageQuest.quest.completerNpc = guiNpcTextField.getText();
        }
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        if (this.categorySelection) {
            this.category.readNBT(compound);
            this.setSelected(this.category.title);
            this.initGui();
        }
        else {
            GuiNPCManageQuest.quest.readNBT(compound);
            this.setSelected(GuiNPCManageQuest.quest.title);
            this.initGui();
        }
    }
    
    @Override
    public void subGuiClosed(final SubGuiInterface subgui) {
        if (subgui instanceof SubGuiNpcTextArea) {
            final SubGuiNpcTextArea gui = (SubGuiNpcTextArea)subgui;
            if (this.questlogTA) {
                GuiNPCManageQuest.quest.logText = gui.text;
            }
            else {
                GuiNPCManageQuest.quest.completeText = gui.text;
            }
        }
        else if (subgui instanceof SubGuiNpcFactionOptions || subgui instanceof SubGuiMailmanSendSetup) {
            this.setSubGui(new SubGuiNpcQuestAdvanced(GuiNPCManageQuest.quest, this));
        }
        else if (subgui instanceof SubGuiNpcCommand) {
            final SubGuiNpcCommand sub = (SubGuiNpcCommand)subgui;
            GuiNPCManageQuest.quest.command = sub.command;
            this.setSubGui(new SubGuiNpcQuestAdvanced(GuiNPCManageQuest.quest, this));
        }
        else {
            this.initGui();
        }
    }
    
    @Override
    public void setData(final Vector<String> list, final HashMap<String, Integer> data) {
        this.getButton(0).setEnabled(true);
        final String name = this.scroll.getSelected();
        this.data = data;
        this.scroll.setList(list);
        if (name != null) {
            this.scroll.setSelected(name);
        }
        this.initGui();
    }
    
    @Override
    public void selected(final int id, final String name) {
        GuiNPCManageQuest.quest.nextQuestid = id;
        GuiNPCManageQuest.quest.nextQuestTitle = name;
    }
    
    @Override
    public void customScrollClicked(final int i, final int j, final int k, final GuiCustomScroll guiCustomScroll) {
        if (guiCustomScroll.id == 0) {
            this.save();
            final String selected = this.scroll.getSelected();
            if (this.categorySelection) {
                this.category = new QuestCategory();
                Client.sendData(EnumPacketServer.QuestCategoryGet, this.data.get(selected));
            }
            else {
                GuiNPCManageQuest.quest = new Quest();
                Client.sendData(EnumPacketServer.QuestGet, this.data.get(selected));
            }
        }
    }
    
    @Override
    public void close() {
        super.close();
        GuiNPCManageQuest.quest = new Quest();
    }
    
    @Override
    public void save() {
        GuiNpcTextField.unfocus();
        if (!this.categorySelection && GuiNPCManageQuest.quest.id >= 0) {
            Client.sendData(EnumPacketServer.QuestSave, this.category.id, GuiNPCManageQuest.quest.writeToNBT(new NBTTagCompound()));
        }
        else if (this.categorySelection && this.category.id >= 0) {
            Client.sendData(EnumPacketServer.QuestCategorySave, this.category.writeNBT(new NBTTagCompound()));
        }
    }
    
    @Override
    public void setSelected(final String selected) {
    }
    
    static {
        GuiNPCManageQuest.quest = new Quest();
    }
}

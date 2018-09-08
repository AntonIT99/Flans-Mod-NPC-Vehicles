// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.global;

import java.util.List;
import net.minecraft.client.gui.Gui;
import java.util.Vector;
import org.lwjgl.opengl.GL11;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.controllers.RecipeCarpentry;
import noppes.npcs.client.NoppesUtil;
import noppes.npcs.constants.EnumGuiType;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcButtonYesNo;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import net.minecraft.inventory.Container;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.containers.ContainerManageRecipes;
import java.util.HashMap;
import noppes.npcs.client.gui.util.GuiCustomScroll;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.ICustomScrollListener;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.IScrollData;
import noppes.npcs.client.gui.util.GuiContainerNPCInterface2;

public class GuiNpcManageRecipes extends GuiContainerNPCInterface2 implements IScrollData, IGuiData, ICustomScrollListener, ITextfieldListener
{
    private GuiCustomScroll scroll;
    private HashMap<String, Integer> data;
    private ContainerManageRecipes container;
    private String selected;
    private ResourceLocation slot;
    
    public GuiNpcManageRecipes(final EntityNPCInterface npc, final ContainerManageRecipes container) {
        super(npc, container);
        this.data = new HashMap<String, Integer>();
        this.selected = null;
        this.container = container;
        this.drawDefaultBackground = false;
        Client.sendData(EnumPacketServer.RecipesGet, container.width);
        this.setBackground("inventorymenu.png");
        this.slot = this.getResource("slot.png");
        this.ySize = 200;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        if (this.scroll == null) {
            this.scroll = new GuiCustomScroll((GuiScreen)this, 0);
        }
        this.scroll.setSize(130, 180);
        this.scroll.guiLeft = this.guiLeft + 172;
        this.scroll.guiTop = this.guiTop + 8;
        this.addScroll(this.scroll);
        this.addButton(new GuiNpcButton(0, this.guiLeft + 306, this.guiTop + 10, 84, 20, "menu.global"));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 306, this.guiTop + 32, 84, 20, "tile.npcCarpentyBench.name"));
        this.getButton(0).setEnabled(this.container.width == 4);
        this.getButton(1).setEnabled(this.container.width == 3);
        this.addButton(new GuiNpcButton(3, this.guiLeft + 306, this.guiTop + 60, 84, 20, "gui.add"));
        this.addButton(new GuiNpcButton(4, this.guiLeft + 306, this.guiTop + 82, 84, 20, "gui.remove"));
        this.addLabel(new GuiNpcLabel(0, "gui.ignoreDamage", this.guiLeft + 86, this.guiTop + 32));
        this.addButton(new GuiNpcButtonYesNo(5, this.guiLeft + 114, this.guiTop + 40, 50, 20, this.container.recipe.ignoreDamage));
        this.addLabel(new GuiNpcLabel(1, "gui.ignoreNBT", this.guiLeft + 86, this.guiTop + 82));
        this.addButton(new GuiNpcButtonYesNo(6, this.guiLeft + 114, this.guiTop + 90, 50, 20, this.container.recipe.ignoreNBT));
        this.addTextField(new GuiNpcTextField(0, (GuiScreen)this, this.fontRendererObj, this.guiLeft + 8, this.guiTop + 8, 160, 20, this.container.recipe.name));
        this.getTextField(0).enabled = false;
        this.getButton(5).setEnabled(false);
        this.getButton(6).setEnabled(false);
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 0) {
            this.save();
            NoppesUtil.requestOpenGUI(EnumGuiType.ManageRecipes, 3, 0, 0);
        }
        if (button.id == 1) {
            this.save();
            NoppesUtil.requestOpenGUI(EnumGuiType.ManageRecipes, 4, 0, 0);
        }
        if (button.id == 3) {
            this.save();
            this.scroll.clear();
            String name;
            for (name = "New"; this.data.containsKey(name); name += "_") {}
            final RecipeCarpentry recipe = new RecipeCarpentry(name);
            recipe.isGlobal = (this.container.width == 3);
            Client.sendData(EnumPacketServer.RecipeSave, recipe.writeNBT());
        }
        if (button.id == 4 && this.data.containsKey(this.scroll.getSelected())) {
            Client.sendData(EnumPacketServer.RecipeRemove, this.data.get(this.scroll.getSelected()));
            this.scroll.clear();
        }
        if (button.id == 5) {
            this.container.recipe.ignoreDamage = (button.getValue() == 1);
        }
        if (button.id == 6) {
            this.container.recipe.ignoreNBT = (button.getValue() == 1);
        }
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        final RecipeCarpentry recipe = RecipeCarpentry.read(compound);
        this.getTextField(0).setText(recipe.name);
        this.container.setRecipe(recipe);
        this.getTextField(0).enabled = true;
        this.getButton(5).setEnabled(true);
        this.getButton(5).setDisplay(recipe.ignoreDamage ? 1 : 0);
        this.getButton(6).setEnabled(true);
        this.getButton(6).setDisplay(recipe.ignoreNBT ? 1 : 0);
        this.setSelected(recipe.name);
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float f, final int x, final int y) {
        super.drawGuiContainerBackgroundLayer(f, x, y);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(this.slot);
        for (int i = 0; i < this.container.width; ++i) {
            for (int j = 0; j < this.container.width; ++j) {
                this.drawTexturedModalRect(this.guiLeft + i * 18 + 7, this.guiTop + j * 18 + 34, 0, 0, 18, 18);
            }
        }
        this.drawTexturedModalRect(this.guiLeft + 86, this.guiTop + 60, 0, 0, 18, 18);
    }
    
    @Override
    public void setData(final Vector<String> list, final HashMap<String, Integer> data) {
        final String name = this.scroll.getSelected();
        this.data = data;
        this.scroll.setList(list);
        this.getTextField(0).enabled = (name != null);
        this.getButton(5).setEnabled(name != null);
        if (name != null) {
            this.scroll.setSelected(name);
        }
    }
    
    @Override
    public void setSelected(final String selected) {
        this.selected = selected;
        this.scroll.setSelected(selected);
    }
    
    @Override
    public void customScrollClicked(final int i, final int j, final int k, final GuiCustomScroll guiCustomScroll) {
        this.save();
        this.selected = this.scroll.getSelected();
        Client.sendData(EnumPacketServer.RecipeGet, this.data.get(this.selected));
    }
    
    @Override
    public void save() {
        GuiNpcTextField.unfocus();
        if (this.selected != null && this.data.containsKey(this.selected)) {
            this.container.saveRecipe();
            Client.sendData(EnumPacketServer.RecipeSave, this.container.recipe.writeNBT());
        }
    }
    
    @Override
    public void unFocused(final GuiNpcTextField guiNpcTextField) {
        final String name = guiNpcTextField.getText();
        if (!name.isEmpty() && !this.data.containsKey(name)) {
            final String old = this.container.recipe.name;
            this.data.remove(this.container.recipe.name);
            this.container.recipe.name = name;
            this.data.put(this.container.recipe.name, this.container.recipe.id);
            this.selected = name;
            this.scroll.replace(old, this.container.recipe.name);
        }
    }
}

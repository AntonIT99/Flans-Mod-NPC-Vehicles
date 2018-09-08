// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.util;

import java.util.Comparator;
import java.util.Collections;
import net.minecraft.util.StatCollector;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.GuiScreen;

public class GuiCustomScroll extends GuiScreen
{
    public static final ResourceLocation resource;
    private List<String> list;
    public int id;
    public int guiLeft;
    public int guiTop;
    private int xSize;
    private int ySize;
    public int selected;
    private HashSet<String> selectedList;
    private int hover;
    private int listHeight;
    private int scrollY;
    private int maxScrollY;
    private int scrollHeight;
    private boolean isScrolling;
    private boolean multipleSelection;
    private ICustomScrollListener listener;
    private boolean isSorted;
    public boolean visible;
    private boolean selectable;
    
    public GuiCustomScroll(final GuiScreen parent, final int id) {
        this.guiLeft = 0;
        this.guiTop = 0;
        this.multipleSelection = false;
        this.isSorted = true;
        this.visible = true;
        this.selectable = true;
        this.width = 176;
        this.height = 166;
        this.xSize = 176;
        this.ySize = 159;
        this.selected = -1;
        this.hover = -1;
        this.selectedList = new HashSet<String>();
        this.listHeight = 0;
        this.scrollY = 0;
        this.scrollHeight = 0;
        this.isScrolling = false;
        if (parent instanceof ICustomScrollListener) {
            this.listener = (ICustomScrollListener)parent;
        }
        this.list = new ArrayList<String>();
        this.id = id;
    }
    
    public GuiCustomScroll(final GuiScreen parent, final int id, final boolean multipleSelection) {
        this(parent, id);
        this.multipleSelection = multipleSelection;
    }
    
    public void setSize(final int x, final int y) {
        this.ySize = y;
        this.xSize = x;
        this.listHeight = 14 * this.list.size();
        if (this.listHeight > 0) {
            this.scrollHeight = (this.ySize - 8) / this.listHeight * (this.ySize - 8);
        }
        else {
            this.scrollHeight = Integer.MAX_VALUE;
        }
        this.maxScrollY = this.listHeight - (this.ySize - 8) - 1;
    }
    
    public void drawScreen(int i, int j, final float f, final int mouseScrolled) {
        if (!this.visible) {
            return;
        }
        this.drawGradientRect(this.guiLeft, this.guiTop, this.xSize + this.guiLeft, this.ySize + this.guiTop, -1072689136, -804253680);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(GuiCustomScroll.resource);
        if (this.scrollHeight < this.ySize - 8) {
            this.drawScrollBar();
        }
        GL11.glPushMatrix();
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)this.guiLeft, (float)this.guiTop, 0.0f);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        if (this.selectable) {
            this.hover = this.getMouseOver(i, j);
        }
        this.drawItems();
        GL11.glPopMatrix();
        if (this.scrollHeight < this.ySize - 8) {
            i -= this.guiLeft;
            j -= this.guiTop;
            if (Mouse.isButtonDown(0)) {
                if (i >= this.xSize - 11 && i < this.xSize - 6 && j >= 4 && j < this.ySize) {
                    this.isScrolling = true;
                }
            }
            else {
                this.isScrolling = false;
            }
            if (this.isScrolling) {
                this.scrollY = (j - 8) * this.listHeight / (this.ySize - 8) - this.scrollHeight;
                if (this.scrollY < 0) {
                    this.scrollY = 0;
                }
                if (this.scrollY > this.maxScrollY) {
                    this.scrollY = this.maxScrollY;
                }
            }
            if (mouseScrolled != 0) {
                this.scrollY += ((mouseScrolled > 0) ? -14 : 14);
                if (this.scrollY > this.maxScrollY) {
                    this.scrollY = this.maxScrollY;
                }
                if (this.scrollY < 0) {
                    this.scrollY = 0;
                }
            }
        }
    }
    
    public boolean mouseInOption(final int i, final int j, final int k) {
        final int l = 4;
        final int i2 = 14 * k + 4 - this.scrollY;
        return i >= l - 1 && i < l + this.xSize - 11 && j >= i2 - 1 && j < i2 + 8;
    }
    
    protected void drawItems() {
        for (int i = 0; i < this.list.size(); ++i) {
            final int j = 4;
            final int k = 14 * i + 4 - this.scrollY;
            if (k >= 4 && k + 12 < this.ySize) {
                final int xOffset = (this.scrollHeight < this.ySize - 8) ? 0 : 10;
                final String displayString = StatCollector.translateToLocal((String)this.list.get(i));
                String text = "";
                final float maxWidth = (this.xSize + xOffset - 8) * 0.8f;
                if (this.fontRendererObj.getStringWidth(displayString) > maxWidth) {
                    for (int h = 0; h < displayString.length(); ++h) {
                        final char c = displayString.charAt(h);
                        text += c;
                        if (this.fontRendererObj.getStringWidth(text) > maxWidth) {
                            break;
                        }
                    }
                    if (displayString.length() > text.length()) {
                        text += "...";
                    }
                }
                else {
                    text = displayString;
                }
                if ((this.multipleSelection && this.selectedList.contains(text)) || (!this.multipleSelection && this.selected == i)) {
                    this.drawVerticalLine(j - 2, k - 4, k + 10, -1);
                    this.drawVerticalLine(j + this.xSize - 18 + xOffset, k - 4, k + 10, -1);
                    this.drawHorizontalLine(j - 2, j + this.xSize - 18 + xOffset, k - 3, -1);
                    this.drawHorizontalLine(j - 2, j + this.xSize - 18 + xOffset, k + 10, -1);
                    this.fontRendererObj.drawString(text, j, k, 16777215);
                }
                else if (i == this.hover) {
                    this.fontRendererObj.drawString(text, j, k, 65280);
                }
                else {
                    this.fontRendererObj.drawString(text, j, k, 16777215);
                }
            }
        }
    }
    
    public String getSelected() {
        if (this.selected == -1 || this.selected >= this.list.size()) {
            return null;
        }
        return this.list.get(this.selected);
    }
    
    private int getMouseOver(int i, int j) {
        i -= this.guiLeft;
        j -= this.guiTop;
        if (i >= 4 && i < this.xSize - 4 && j >= 4 && j < this.ySize) {
            for (int j2 = 0; j2 < this.list.size(); ++j2) {
                if (this.mouseInOption(i, j, j2)) {
                    return j2;
                }
            }
        }
        return -1;
    }
    
    public void mouseClicked(final int i, final int j, final int k) {
        if (k != 0 || this.hover < 0) {
            return;
        }
        if (this.multipleSelection) {
            if (this.selectedList.contains(this.list.get(this.hover))) {
                this.selectedList.remove(this.list.get(this.hover));
            }
            else {
                this.selectedList.add(this.list.get(this.hover));
            }
        }
        else {
            if (this.hover >= 0) {
                this.selected = this.hover;
            }
            this.hover = -1;
        }
        if (this.listener != null) {
            this.listener.customScrollClicked(i, j, k, this);
        }
    }
    
    private void drawScrollBar() {
        final int i = this.guiLeft + this.xSize - 9;
        int k;
        final int j = k = this.guiTop + this.scrollY / this.listHeight * (this.ySize - 8) + 4;
        this.drawTexturedModalRect(i, k, this.xSize, 9, 5, 1);
        ++k;
        while (k < j + this.scrollHeight - 1) {
            this.drawTexturedModalRect(i, k, this.xSize, 10, 5, 1);
            ++k;
        }
        this.drawTexturedModalRect(i, k, this.xSize, 11, 5, 1);
    }
    
    public boolean hasSelected() {
        return this.selected >= 0;
    }
    
    public void setList(final List<String> list) {
        this.isSorted = true;
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        this.list = list;
        this.setSize(this.xSize, this.ySize);
    }
    
    public void setUnsortedList(final List<String> list) {
        this.isSorted = false;
        this.list = list;
        this.setSize(this.xSize, this.ySize);
    }
    
    public void replace(final String old, final String name) {
        String select = this.getSelected();
        this.list.remove(old);
        this.list.add(name);
        if (this.isSorted) {
            Collections.sort(this.list, String.CASE_INSENSITIVE_ORDER);
        }
        if (old.equals(select)) {
            select = name;
        }
        this.selected = this.list.indexOf(select);
        this.setSize(this.xSize, this.ySize);
    }
    
    public void setSelected(final String name) {
        this.selected = this.list.indexOf(name);
    }
    
    public void clear() {
        this.list = new ArrayList<String>();
        this.selected = -1;
        this.scrollY = 0;
        this.setSize(this.xSize, this.ySize);
    }
    
    public List<String> getList() {
        return this.list;
    }
    
    public HashSet<String> getSelectedList() {
        return this.selectedList;
    }
    
    public void setSelectedList(final HashSet<String> selectedList) {
        this.selectedList = selectedList;
    }
    
    public GuiCustomScroll setUnselectable() {
        this.selectable = false;
        return this;
    }
    
    static {
        resource = new ResourceLocation("customnpcs", "textures/gui/misc.png");
    }
}

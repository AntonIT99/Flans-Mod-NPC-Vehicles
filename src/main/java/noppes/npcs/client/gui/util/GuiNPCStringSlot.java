// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.util;

import net.minecraft.client.renderer.Tessellator;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import net.minecraft.client.gui.GuiSlot;

public class GuiNPCStringSlot extends GuiSlot
{
    private List<String> list;
    public String selected;
    public HashSet<String> selectedList;
    private boolean multiSelect;
    private GuiNPCInterface parent;
    public int size;
    private long prevTime;
    
    public GuiNPCStringSlot(final Collection<String> list, final GuiNPCInterface parent, final boolean multiSelect, final int size) {
        super(Minecraft.getMinecraft(), parent.width, parent.height, 32, parent.height - 64, size);
        this.prevTime = 0L;
        this.selectedList = new HashSet<String>();
        this.parent = parent;
        Collections.sort(this.list = new ArrayList<String>(list), String.CASE_INSENSITIVE_ORDER);
        this.multiSelect = multiSelect;
        this.size = size;
    }
    
    public void setList(final List<String> list) {
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        this.list = list;
        this.selected = "";
    }
    
    protected int getSize() {
        return this.list.size();
    }
    
    protected void elementClicked(final int i, final boolean flag, final int j, final int k) {
        final long time = System.currentTimeMillis();
        if (this.selected != null && this.selected.equals(this.list.get(i)) && time - this.prevTime < 400L) {
            this.parent.doubleClicked();
        }
        this.selected = this.list.get(i);
        if (this.selectedList.contains(this.selected)) {
            this.selectedList.remove(this.selected);
        }
        else {
            this.selectedList.add(this.selected);
        }
        this.parent.elementClicked();
        this.prevTime = time;
    }
    
    protected boolean isSelected(final int i) {
        if (!this.multiSelect) {
            return this.selected != null && this.selected.equals(this.list.get(i));
        }
        return this.selectedList.contains(this.list.get(i));
    }
    
    protected int getContentHeight() {
        return this.list.size() * this.size;
    }
    
    protected void drawBackground() {
        this.parent.drawDefaultBackground();
    }
    
    protected void drawSlot(final int i, final int j, final int k, final int l, final Tessellator tessellator, final int var6, final int var7) {
        final String s = this.list.get(i);
        this.parent.drawString(this.parent.getFontRenderer(), s, j + 50, k + 3, 16777215);
    }
    
    public void clear() {
        this.list.clear();
    }
}

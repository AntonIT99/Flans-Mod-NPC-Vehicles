// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.util;

public class GuiNpcButtonYesNo extends GuiNpcButton
{
    public GuiNpcButtonYesNo(final int id, final int x, final int y, final boolean bo) {
        this(id, x, y, 50, 20, bo);
    }
    
    public GuiNpcButtonYesNo(final int id, final int x, final int y, final int width, final int height, final boolean bo) {
        super(id, x, y, width, height, new String[] { "gui.no", "gui.yes" }, bo ? 1 : 0);
    }
    
    public boolean getBoolean() {
        return this.getValue() == 1;
    }
}

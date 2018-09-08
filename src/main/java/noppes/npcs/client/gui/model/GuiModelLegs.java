// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.model;

import net.minecraft.client.gui.GuiButton;
import noppes.npcs.ModelPartData;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.entity.EntityCustomNpc;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiModelInterface;

public class GuiModelLegs extends GuiModelInterface
{
    private GuiScreen parent;
    private final String[] arrLegs;
    private final String[] arrTail;
    
    public GuiModelLegs(final GuiScreen parent, final EntityCustomNpc npc) {
        super(npc);
        this.arrLegs = new String[] { "gui.no", "Player", "Player Naga", "Spider", "Horse", "Naga", "Mermaid", "Digitigrade" };
        this.arrTail = new String[] { "gui.no", "Player", "Player Dragon", "Cat", "Wolf", "Horse", "Dragon", "Squirrel" };
        this.parent = parent;
        this.xOffset = 60;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        int y = this.guiTop + 20;
        final boolean i = true;
        final int j = this.guiLeft + 50;
        y += 22;
        this.addButton(new GuiNpcButton((int)(i ? 1 : 0), j, y, 70, 20, this.arrLegs, this.getNagaIndex(this.playerdata.legParts)));
        this.addLabel(new GuiNpcLabel(1, "Legs", this.guiLeft, y + 5, 16777215));
        if (this.playerdata.legParts.type > 0) {
            this.addButton(new GuiNpcButton(11, this.guiLeft + 122, y, 40, 20, this.playerdata.legParts.getColor()));
        }
        final ModelPartData tail = this.playerdata.getPartData("tail");
        final int k = 2;
        final int l = this.guiLeft + 50;
        y += 22;
        this.addButton(new GuiNpcButton(k, l, y, 70, 20, this.arrTail, this.getTailIndex(tail)));
        this.addLabel(new GuiNpcLabel(2, "Tail", this.guiLeft, y + 5, 16777215));
        if (tail != null) {
            this.addButton(new GuiNpcButton(12, this.guiLeft + 122, y, 40, 20, tail.getColor()));
        }
    }
    
    private int getNagaIndex(final ModelPartData data) {
        if (!data.playerTexture && data.type == 1) {
            return 5;
        }
        if (data.type == 4) {
            return 6;
        }
        if (data.type == 5) {
            return 7;
        }
        return data.type + 1;
    }
    
    private int getTailIndex(final ModelPartData data) {
        if (data == null) {
            return 0;
        }
        if (data.playerTexture && data.type == 0) {
            return 1;
        }
        if (data.type == 0 && data.texture.contains("tail1")) {
            return 3;
        }
        if (data.type == 0 && data.texture.contains("tail2")) {
            return 4;
        }
        if (data.playerTexture && data.type == 1) {
            return 2;
        }
        if (data.type == 1) {
            return 6;
        }
        if (data.type == 2) {
            return 5;
        }
        if (data.type == 3) {
            return 7;
        }
        return 0;
    }
    
    @Override
    protected void actionPerformed(final GuiButton btn) {
        super.actionPerformed(btn);
        final GuiNpcButton button = (GuiNpcButton)btn;
        if (button.id == 1) {
            final ModelPartData data = this.playerdata.legParts;
            final int value = button.getValue() - 1;
            if (value < 1) {
                data.color = 16777215;
            }
            if (value < 2) {
                data.setTexture("", value);
            }
            if (value == 2) {
                data.setTexture("legs/spider1", 2);
            }
            if (value == 3) {
                data.setTexture("legs/horse1", 3);
            }
            if (value == 4) {
                data.setTexture("legs/naga1", 1);
            }
            if (value == 5) {
                data.setTexture("legs/mermaid1", 4);
            }
            if (value == 6) {
                data.setTexture("", 5);
            }
            this.initGui();
        }
        if (button.id == 2) {
            final int value2 = button.getValue();
            if (value2 == 0) {
                this.playerdata.removePart("tail");
            }
            else {
                final ModelPartData data2 = this.playerdata.getOrCreatePart("tail");
                if (value2 == 1) {
                    data2.setTexture("", 0);
                }
                if (value2 == 2) {
                    data2.setTexture("", 1);
                }
                if (value2 == 3) {
                    data2.setTexture("tail/tail1", 0);
                }
                if (value2 == 4) {
                    data2.setTexture("tail/tail2", 0);
                }
                if (value2 == 5) {
                    data2.setTexture("tail/horse1", 2);
                }
                if (value2 == 6) {
                    data2.setTexture("tail/dragon1", 1);
                }
                if (value2 == 7) {
                    data2.setTexture("tail/squirrel1", 3);
                }
            }
            this.initGui();
        }
        if (button.id == 11) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModelColor(this, this.playerdata.legParts, this.npc));
        }
        if (button.id == 12) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModelColor(this, this.playerdata.getPartData("tail"), this.npc));
        }
    }
    
    @Override
    public void close() {
        this.mc.displayGuiScreen(this.parent);
    }
}

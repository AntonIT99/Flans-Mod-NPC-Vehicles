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

public class GuiModelHead extends GuiModelInterface
{
    private GuiScreen parent;
    private final String[] arrHeadwear;
    private final String[] arrHair;
    private final String[] arrBeard;
    private final String[] arrMohawk;
    private final String[] arrSnout;
    private final String[] arrEars;
    
    public GuiModelHead(final GuiScreen parent, final EntityCustomNpc npc) {
        super(npc);
        this.arrHeadwear = new String[] { "gui.no", "gui.yes", "Solid" };
        this.arrHair = new String[] { "gui.no", "Player", "Long", "Thin", "Stylish", "Ponytail" };
        this.arrBeard = new String[] { "gui.no", "Player", "Standard", "Viking", "Long", "Short" };
        this.arrMohawk = new String[] { "gui.no", "Type1" };
        this.arrSnout = new String[] { "gui.no", "Player Small", "Player Medium", "Player Large", "Player Bunny", "Small1", "Medium1", "Large1", "Bunny1" };
        this.arrEars = new String[] { "gui.no", "Player", "Player Bunny", "Bunny", "Type1" };
        this.parent = parent;
        this.xOffset = 60;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        int y = this.guiTop + 20;
        final boolean i = false;
        final int j = this.guiLeft + 50;
        y += 22;
        this.addButton(new GuiNpcButton((int)(i ? 1 : 0), j, y, 70, 20, this.arrHeadwear, this.playerdata.headwear));
        this.addLabel(new GuiNpcLabel(0, "Headwear", this.guiLeft, y + 5, 16777215));
        final ModelPartData hair = this.playerdata.getPartData("hair");
        final boolean k = true;
        final int l = this.guiLeft + 50;
        y += 22;
        this.addButton(new GuiNpcButton((int)(k ? 1 : 0), l, y, 70, 20, this.arrHair, (hair == null) ? 0 : (hair.type + 1)));
        this.addLabel(new GuiNpcLabel(1, "Hair", this.guiLeft, y + 5, 16777215));
        if (hair != null) {
            this.addButton(new GuiNpcButton(11, this.guiLeft + 122, y, 40, 20, hair.getColor()));
        }
        final ModelPartData mohawk = this.playerdata.getPartData("mohawk");
        final int m = 2;
        final int j2 = this.guiLeft + 50;
        y += 22;
        this.addButton(new GuiNpcButton(m, j2, y, 70, 20, this.arrMohawk, (mohawk == null) ? 0 : mohawk.type));
        this.addLabel(new GuiNpcLabel(2, "Mohawk", this.guiLeft, y + 5, 16777215));
        if (mohawk != null) {
            this.addButton(new GuiNpcButton(12, this.guiLeft + 122, y, 40, 20, mohawk.getColor()));
        }
        final ModelPartData beard = this.playerdata.getPartData("beard");
        final int i2 = 3;
        final int j3 = this.guiLeft + 50;
        y += 22;
        this.addButton(new GuiNpcButton(i2, j3, y, 70, 20, this.arrBeard, (beard == null) ? 0 : (beard.type + 1)));
        this.addLabel(new GuiNpcLabel(3, "Beard", this.guiLeft, y + 5, 16777215));
        if (beard != null) {
            this.addButton(new GuiNpcButton(13, this.guiLeft + 122, y, 40, 20, beard.getColor()));
        }
        final ModelPartData snout = this.playerdata.getPartData("snout");
        final int i3 = 4;
        final int j4 = this.guiLeft + 50;
        y += 22;
        this.addButton(new GuiNpcButton(i3, j4, y, 70, 20, this.arrSnout, (snout == null) ? 0 : (snout.type + (snout.playerTexture ? 1 : 5))));
        this.addLabel(new GuiNpcLabel(4, "Snout", this.guiLeft, y + 5, 16777215));
        if (snout != null) {
            this.addButton(new GuiNpcButton(14, this.guiLeft + 122, y, 40, 20, snout.getColor()));
        }
        final ModelPartData ears = this.playerdata.getPartData("ears");
        final int i4 = 5;
        final int j5 = this.guiLeft + 50;
        y += 22;
        this.addButton(new GuiNpcButton(i4, j5, y, 70, 20, this.arrEars, this.getEars(ears)));
        this.addLabel(new GuiNpcLabel(5, "Ears", this.guiLeft, y + 5, 16777215));
        if (ears != null) {
            this.addButton(new GuiNpcButton(15, this.guiLeft + 122, y, 40, 20, ears.getColor()));
        }
    }
    
    private int getEars(final ModelPartData data) {
        if (data == null) {
            return 0;
        }
        if (data.playerTexture && data.type == 0) {
            return 1;
        }
        if (data.playerTexture && data.type == 1) {
            return 2;
        }
        if (data.type == 0) {
            return 4;
        }
        if (data.type == 1) {
            return 3;
        }
        return 0;
    }
    
    @Override
    protected void actionPerformed(final GuiButton btn) {
        super.actionPerformed(btn);
        final GuiNpcButton button = (GuiNpcButton)btn;
        if (button.id == 0) {
            this.playerdata.headwear = (byte)button.getValue();
        }
        if (button.id == 1) {
            if (button.getValue() == 0) {
                this.playerdata.removePart("hair");
            }
            else {
                final ModelPartData data = this.playerdata.getOrCreatePart("hair");
                if (button.getValue() > 1) {
                    data.setTexture("hair/hair" + (button.getValue() - 1), button.getValue() - 1);
                }
            }
            this.initGui();
        }
        if (button.id == 2) {
            if (button.getValue() == 0) {
                this.playerdata.removePart("mohawk");
            }
            else {
                final ModelPartData data = this.playerdata.getOrCreatePart("mohawk");
                if (button.getValue() > 0) {
                    data.setTexture("hair/mohawk" + button.getValue(), button.getValue());
                }
            }
            this.initGui();
        }
        if (button.id == 3) {
            if (button.getValue() == 0) {
                this.playerdata.removePart("beard");
            }
            else {
                final ModelPartData data = this.playerdata.getOrCreatePart("beard");
                if (button.getValue() > 1) {
                    data.setTexture("beard/beard" + (button.getValue() - 1), button.getValue() - 1);
                }
            }
            this.initGui();
        }
        if (button.id == 4) {
            if (button.getValue() == 0) {
                this.playerdata.removePart("snout");
            }
            else if (button.getValue() < 5) {
                final ModelPartData data = this.playerdata.getOrCreatePart("snout");
                data.type = (byte)(button.getValue() - 1);
            }
            else {
                final ModelPartData data = this.playerdata.getOrCreatePart("snout");
                byte type = 0;
                if (button.displayString.startsWith("Medium")) {
                    type = 1;
                }
                if (button.displayString.startsWith("Large")) {
                    type = 2;
                }
                if (button.displayString.startsWith("Bunny")) {
                    type = 3;
                }
                data.setTexture("snout/" + button.displayString.toLowerCase(), type);
            }
            this.initGui();
        }
        if (button.id == 5) {
            final int value = button.getValue();
            if (value == 0) {
                this.playerdata.removePart("ears");
            }
            else {
                final ModelPartData data2 = this.playerdata.getOrCreatePart("ears");
                if (value == 1) {
                    data2.setTexture("", 0);
                }
                if (value == 2) {
                    data2.setTexture("", 1);
                }
                if (value == 3) {
                    data2.setTexture("ears/bunny1", 1);
                }
                if (value == 4) {
                    data2.setTexture("ears/type1", 0);
                }
            }
            this.initGui();
        }
        if (button.id == 11) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModelColor(this, this.playerdata.getPartData("hair"), this.npc));
        }
        if (button.id == 12) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModelColor(this, this.playerdata.getPartData("mohawk"), this.npc));
        }
        if (button.id == 13) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModelColor(this, this.playerdata.getPartData("beard"), this.npc));
        }
        if (button.id == 14) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModelColor(this, this.playerdata.getPartData("snout"), this.npc));
        }
        if (button.id == 15) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModelColor(this, this.playerdata.getPartData("ears"), this.npc));
        }
    }
    
    @Override
    public void close() {
        this.mc.displayGuiScreen(this.parent);
    }
}

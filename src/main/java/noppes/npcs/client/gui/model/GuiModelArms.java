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

public class GuiModelArms extends GuiModelInterface
{
    private final String[] arrParticles;
    private GuiScreen parent;
    
    public GuiModelArms(final GuiScreen parent, final EntityCustomNpc npc) {
        super(npc);
        this.arrParticles = new String[] { "gui.no", "Both", "Left", "Right" };
        this.parent = parent;
        this.xOffset = 60;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        int y = this.guiTop + 20;
        final ModelPartData claws = this.playerdata.getPartData("claws");
        final boolean i = false;
        final int j = this.guiLeft + 50;
        y += 22;
        this.addButton(new GuiNpcButton((int)(i ? 1 : 0), j, y, 70, 20, this.arrParticles, (claws == null) ? 0 : (claws.type + 1)));
        this.addLabel(new GuiNpcLabel(0, "Claws", this.guiLeft, y + 5, 16777215));
        if (claws != null) {
            this.addButton(new GuiNpcButton(10, this.guiLeft + 122, y, 40, 20, claws.getColor()));
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton btn) {
        super.actionPerformed(btn);
        final GuiNpcButton button = (GuiNpcButton)btn;
        if (button.id == 0) {
            if (button.getValue() == 0) {
                this.playerdata.removePart("claws");
            }
            else {
                final ModelPartData data = this.playerdata.getOrCreatePart("claws");
                data.type = (byte)(button.getValue() - 1);
            }
            this.initGui();
        }
        if (button.id == 10) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModelColor(this, this.playerdata.getPartData("claws"), this.npc));
        }
    }
    
    @Override
    public void close() {
        this.mc.displayGuiScreen(this.parent);
    }
}

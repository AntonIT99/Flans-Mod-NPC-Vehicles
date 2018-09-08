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

public class GuiModelBody extends GuiModelInterface
{
    private GuiScreen parent;
    private final String[] arrWing;
    private final String[] arrBreasts;
    private final String[] arrParticles;
    private final String[] arrfins;
    
    public GuiModelBody(final GuiScreen parent, final EntityCustomNpc npc) {
        super(npc);
        this.arrWing = new String[] { "gui.no", "Player", "Type1", "Type2", "Type3" };
        this.arrBreasts = new String[] { "gui.no", "Type1", "Type2", "Type3" };
        this.arrParticles = new String[] { "gui.no", "Player", "Type1", "Type2", "Rainbow" };
        this.arrfins = new String[] { "gui.no", "Player", "Type1" };
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
        this.addButton(new GuiNpcButton((int)(i ? 1 : 0), j, y, 70, 20, this.arrBreasts, this.playerdata.breasts));
        this.addLabel(new GuiNpcLabel(1, "Breasts", this.guiLeft, y + 5, 16777215));
        final ModelPartData wing = this.playerdata.getPartData("wings");
        final boolean k = false;
        final int l = this.guiLeft + 50;
        y += 22;
        this.addButton(new GuiNpcButton((int)(k ? 1 : 0), l, y, 70, 20, this.arrWing, (wing == null) ? 0 : (wing.type + 1)));
        this.addLabel(new GuiNpcLabel(0, "Wings", this.guiLeft, y + 5, 16777215));
        if (wing != null) {
            this.addButton(new GuiNpcButton(11, this.guiLeft + 122, y, 40, 20, wing.getColor()));
        }
        final ModelPartData particles = this.playerdata.getPartData("particles");
        final int m = 2;
        final int j2 = this.guiLeft + 50;
        y += 22;
        this.addButton(new GuiNpcButton(m, j2, y, 70, 20, this.arrParticles, this.getParticleIndex(particles)));
        this.addLabel(new GuiNpcLabel(2, "Particles", this.guiLeft, y + 5, 16777215));
        if (particles != null && particles.type != 1) {
            this.addButton(new GuiNpcButton(12, this.guiLeft + 122, y, 40, 20, particles.getColor()));
        }
        final ModelPartData fin = this.playerdata.getPartData("fin");
        final int i2 = 3;
        final int j3 = this.guiLeft + 50;
        y += 22;
        this.addButton(new GuiNpcButton(i2, j3, y, 70, 20, this.arrfins, this.getFinIndex(fin)));
        this.addLabel(new GuiNpcLabel(3, "Fin", this.guiLeft, y + 5, 16777215));
        if (fin != null) {
            this.addButton(new GuiNpcButton(13, this.guiLeft + 122, y, 40, 20, fin.getColor()));
        }
    }
    
    private int getFinIndex(final ModelPartData fin) {
        if (fin == null) {
            return 0;
        }
        return fin.playerTexture ? 1 : 2;
    }
    
    private int getParticleIndex(final ModelPartData particles) {
        if (particles == null) {
            return 0;
        }
        if (particles.type == 0) {
            if (particles.playerTexture) {
                return 1;
            }
            if (particles.texture.contains("1")) {
                return 2;
            }
            if (particles.texture.contains("2")) {
                return 3;
            }
        }
        if (particles.type == 1) {
            return 4;
        }
        return 0;
    }
    
    @Override
    protected void actionPerformed(final GuiButton btn) {
        super.actionPerformed(btn);
        final GuiNpcButton button = (GuiNpcButton)btn;
        if (button.id == 0) {
            if (button.getValue() == 0) {
                this.playerdata.removePart("wings");
            }
            else {
                final ModelPartData data = this.playerdata.getOrCreatePart("wings");
                if (button.getValue() > 1) {
                    data.setTexture("wings/wing" + (button.getValue() - 1), button.getValue() - 1);
                }
            }
            this.initGui();
        }
        if (button.id == 1) {
            this.playerdata.breasts = (byte)button.getValue();
        }
        if (button.id == 2) {
            final int value = button.getValue();
            if (value == 0) {
                this.playerdata.removePart("particles");
            }
            else {
                final ModelPartData particles = this.playerdata.getOrCreatePart("particles");
                if (value == 1) {
                    particles.setTexture("", 0);
                }
                if (value == 2) {
                    particles.setTexture("particle/type1", 0);
                }
                if (value == 3) {
                    particles.setTexture("particle/type2", 0);
                }
                if (value == 4) {
                    particles.setTexture("", 1);
                }
            }
            this.initGui();
        }
        if (button.id == 3) {
            final int value = button.getValue();
            if (value == 0) {
                this.playerdata.removePart("fin");
            }
            else {
                final ModelPartData particles = this.playerdata.getOrCreatePart("fin");
                if (value == 1) {
                    particles.setTexture("", 0);
                }
                if (value == 2) {
                    particles.setTexture("fin/fin1", 0);
                }
            }
            this.initGui();
        }
        if (button.id == 11) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModelColor(this, this.playerdata.getPartData("wings"), this.npc));
        }
        if (button.id == 12) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModelColor(this, this.playerdata.getPartData("particles"), this.npc));
        }
        if (button.id == 13) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModelColor(this, this.playerdata.getPartData("fin"), this.npc));
        }
    }
    
    @Override
    public void close() {
        this.mc.displayGuiScreen(this.parent);
    }
}

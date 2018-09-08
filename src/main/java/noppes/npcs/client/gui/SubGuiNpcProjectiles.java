// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import noppes.npcs.constants.EnumParticleType;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.constants.EnumPotionType;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.DataStats;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiNpcProjectiles extends SubGuiInterface implements ITextfieldListener
{
    private DataStats stats;
    private String[] potionNames;
    private String[] trailNames;
    
    public SubGuiNpcProjectiles(final DataStats stats) {
        this.potionNames = new String[] { "gui.none", "tile.fire.name", "potion.poison", "potion.hunger", "potion.weakness", "potion.moveSlowdown", "potion.confusion", "potion.blindness", "potion.wither" };
        this.trailNames = new String[] { "gui.none", "Smoke", "Portal", "Redstone", "Lightning", "LargeSmoke", "Magic", "Enchant" };
        this.stats = stats;
        this.setBackground("menubg.png");
        this.xSize = 256;
        this.ySize = 216;
        this.closeOnEsc = true;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addLabel(new GuiNpcLabel(1, "enchantment.arrowDamage", this.guiLeft + 5, this.guiTop + 15));
        this.addTextField(new GuiNpcTextField(1, this, this.fontRendererObj, this.guiLeft + 45, this.guiTop + 10, 50, 18, this.stats.pDamage + ""));
        this.getTextField(1).numbersOnly = true;
        this.getTextField(1).setMinMaxDefault(0, 9999, 5);
        this.addLabel(new GuiNpcLabel(2, "enchantment.arrowKnockback", this.guiLeft + 110, this.guiTop + 15));
        this.addTextField(new GuiNpcTextField(2, this, this.fontRendererObj, this.guiLeft + 150, this.guiTop + 10, 50, 18, this.stats.pImpact + ""));
        this.getTextField(2).numbersOnly = true;
        this.getTextField(2).setMinMaxDefault(0, 3, 0);
        this.addLabel(new GuiNpcLabel(3, "stats.size", this.guiLeft + 5, this.guiTop + 45));
        this.addTextField(new GuiNpcTextField(3, this, this.fontRendererObj, this.guiLeft + 45, this.guiTop + 40, 50, 18, this.stats.pSize + ""));
        this.getTextField(3).numbersOnly = true;
        this.getTextField(3).setMinMaxDefault(1, 10, 10);
        this.addLabel(new GuiNpcLabel(4, "stats.speed", this.guiLeft + 5, this.guiTop + 75));
        this.addTextField(new GuiNpcTextField(4, this, this.fontRendererObj, this.guiLeft + 45, this.guiTop + 70, 50, 18, this.stats.pSpeed + ""));
        this.getTextField(4).numbersOnly = true;
        this.getTextField(4).setMinMaxDefault(1, 50, 10);
        this.addLabel(new GuiNpcLabel(5, "stats.hasgravity", this.guiLeft + 5, this.guiTop + 105));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 60, this.guiTop + 100, 60, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.stats.pPhysics ? 1 : 0)));
        if (!this.stats.pPhysics) {
            this.addButton(new GuiNpcButton(1, this.guiLeft + 140, this.guiTop + 100, 60, 20, new String[] { "gui.constant", "gui.accelerate" }, (int)(this.stats.pXlr8 ? 1 : 0)));
        }
        this.addLabel(new GuiNpcLabel(6, "stats.explosive", this.guiLeft + 5, this.guiTop + 135));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 60, this.guiTop + 130, 60, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.stats.pExplode ? 1 : 0)));
        if (this.stats.pExplode) {
            this.addButton(new GuiNpcButton(3, this.guiLeft + 140, this.guiTop + 130, 60, 20, new String[] { "gui.none", "gui.small", "gui.medium", "gui.large" }, this.stats.pArea));
        }
        this.addLabel(new GuiNpcLabel(7, "stats.rangedeffect", this.guiLeft + 5, this.guiTop + 165));
        this.addButton(new GuiNpcButton(4, this.guiLeft + 60, this.guiTop + 160, 60, 20, this.potionNames, this.stats.pEffect.ordinal()));
        if (this.stats.pEffect != EnumPotionType.None) {
            this.addTextField(new GuiNpcTextField(5, this, this.fontRendererObj, this.guiLeft + 140, this.guiTop + 160, 60, 18, this.stats.pDur + ""));
            this.getTextField(5).numbersOnly = true;
            this.getTextField(5).setMinMaxDefault(1, 99999, 5);
            if (this.stats.pEffect != EnumPotionType.Fire) {
                this.addButton(new GuiNpcButton(10, this.guiLeft + 210, this.guiTop + 160, 40, 20, new String[] { "stats.regular", "stats.amplified" }, this.stats.pEffAmp));
            }
        }
        this.addLabel(new GuiNpcLabel(8, "stats.trail", this.guiLeft + 5, this.guiTop + 195));
        this.addButton(new GuiNpcButton(5, this.guiLeft + 60, this.guiTop + 190, 60, 20, this.trailNames, this.stats.pTrail.ordinal()));
        this.addButton(new GuiNpcButton(7, this.guiLeft + 220, this.guiTop + 10, 30, 20, new String[] { "2D", "3D" }, (int)(this.stats.pRender3D ? 1 : 0)));
        if (this.stats.pRender3D) {
            this.addLabel(new GuiNpcLabel(10, "stats.spin", this.guiLeft + 160, this.guiTop + 45));
            this.addButton(new GuiNpcButton(8, this.guiLeft + 220, this.guiTop + 40, 30, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.stats.pSpin ? 1 : 0)));
            this.addLabel(new GuiNpcLabel(11, "stats.stick", this.guiLeft + 160, this.guiTop + 75));
            this.addButton(new GuiNpcButton(9, this.guiLeft + 220, this.guiTop + 70, 30, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.stats.pStick ? 1 : 0)));
        }
        this.addButton(new GuiNpcButton(6, this.guiLeft + 140, this.guiTop + 190, 60, 20, new String[] { "stats.noglow", "stats.glows" }, (int)(this.stats.pGlows ? 1 : 0)));
        this.addButton(new GuiNpcButton(66, this.guiLeft + 210, this.guiTop + 190, 40, 20, "gui.done"));
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textfield) {
        if (textfield.id == 1) {
            this.stats.pDamage = textfield.getInteger();
        }
        else if (textfield.id == 2) {
            this.stats.pImpact = textfield.getInteger();
        }
        else if (textfield.id == 3) {
            this.stats.pSize = textfield.getInteger();
        }
        else if (textfield.id == 4) {
            this.stats.pSpeed = textfield.getInteger();
        }
        else if (textfield.id == 5) {
            this.stats.pDur = textfield.getInteger();
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 0) {
            this.stats.pPhysics = (button.getValue() == 1);
            this.initGui();
        }
        if (button.id == 1) {
            this.stats.pXlr8 = (button.getValue() == 1);
        }
        if (button.id == 2) {
            this.stats.pExplode = (button.getValue() == 1);
            this.initGui();
        }
        if (button.id == 3) {
            this.stats.pArea = button.getValue();
        }
        if (button.id == 4) {
            this.stats.pEffect = EnumPotionType.values()[button.getValue()];
            this.initGui();
        }
        if (button.id == 5) {
            this.stats.pTrail = EnumParticleType.values()[button.getValue()];
        }
        if (button.id == 6) {
            this.stats.pGlows = (button.getValue() == 1);
        }
        if (button.id == 7) {
            this.stats.pRender3D = (button.getValue() == 1);
            this.initGui();
        }
        if (button.id == 8) {
            this.stats.pSpin = (button.getValue() == 1);
        }
        if (button.id == 9) {
            this.stats.pStick = (button.getValue() == 1);
        }
        if (button.id == 10) {
            this.stats.pEffAmp = button.getValue();
        }
        if (button.id == 66) {
            this.close();
        }
    }
}

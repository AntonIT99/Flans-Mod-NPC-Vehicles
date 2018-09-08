// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import net.minecraft.client.gui.GuiButton;
import noppes.npcs.constants.EnumStandingType;
import noppes.npcs.constants.EnumAnimation;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.constants.EnumMovingType;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.DataAI;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiNpcMovement extends SubGuiInterface implements ITextfieldListener
{
    private DataAI ai;
    
    public SubGuiNpcMovement(final DataAI ai) {
        this.ai = ai;
        this.setBackground("menubg.png");
        this.xSize = 256;
        this.ySize = 216;
        this.closeOnEsc = true;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        int y = this.guiTop + 4;
        this.addLabel(new GuiNpcLabel(0, "movement.type", this.guiLeft + 4, y + 5));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 80, y, 100, 20, EnumMovingType.names(), this.ai.movingType.ordinal()));
        if (this.ai.movingType == EnumMovingType.Wandering) {
            final int id = 4;
            final int i = this.guiLeft + 100;
            y += 22;
            this.addTextField(new GuiNpcTextField(id, this, i, y, 40, 20, this.ai.walkingRange + ""));
            this.getTextField(4).numbersOnly = true;
            this.getTextField(4).setMinMaxDefault(0, 1000, 5);
            this.addLabel(new GuiNpcLabel(4, "gui.range", this.guiLeft + 4, y + 5));
            final int j = 5;
            final int k = this.guiLeft + 100;
            y += 22;
            this.addButton(new GuiNpcButton(j, k, y, 50, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.ai.npcInteracting ? 1 : 0)));
            this.addLabel(new GuiNpcLabel(5, "movement.wanderinteract", this.guiLeft + 4, y + 5));
        }
        else if (this.ai.movingType == EnumMovingType.Standing) {
            final int id2 = 7;
            final int l = this.guiLeft + 99;
            y += 22;
            this.addTextField(new GuiNpcTextField(id2, this, l, y, 24, 20, (int)this.ai.bodyOffsetX + ""));
            this.addLabel(new GuiNpcLabel(17, "spawner.posoffset", this.guiLeft + 4, y + 5));
            this.addLabel(new GuiNpcLabel(7, "X:", this.guiLeft + 115, y + 5));
            this.getTextField(7).numbersOnly = true;
            this.getTextField(7).setMinMaxDefault(0, 10, 5);
            this.addLabel(new GuiNpcLabel(8, "Y:", this.guiLeft + 125, y + 5));
            this.addTextField(new GuiNpcTextField(8, this, this.guiLeft + 135, y, 24, 20, (int)this.ai.bodyOffsetY + ""));
            this.getTextField(8).numbersOnly = true;
            this.getTextField(8).setMinMaxDefault(0, 10, 5);
            this.addLabel(new GuiNpcLabel(9, "Z:", this.guiLeft + 161, y + 5));
            this.addTextField(new GuiNpcTextField(9, this, this.guiLeft + 171, y, 24, 20, (int)this.ai.bodyOffsetZ + ""));
            this.getTextField(9).numbersOnly = true;
            this.getTextField(9).setMinMaxDefault(0, 10, 5);
            final int m = 3;
            final int j2 = this.guiLeft + 80;
            y += 22;
            this.addButton(new GuiNpcButton(m, j2, y, 100, 20, new String[] { "stats.normal", "movement.sitting", "movement.lying", "movement.sneaking", "movement.dancing", "movement.aiming", "movement.crawling", "movement.hug" }, this.ai.animationType.ordinal()));
            this.addLabel(new GuiNpcLabel(3, "movement.animation", this.guiLeft + 4, y + 5));
            if (this.ai.animationType != EnumAnimation.LYING) {
                final int i2 = 4;
                final int j3 = this.guiLeft + 80;
                y += 22;
                this.addButton(new GuiNpcButton(i2, j3, y, 80, 20, new String[] { "movement.body", "movement.manual", "movement.stalking", "movement.head" }, this.ai.standingType.ordinal()));
                this.addLabel(new GuiNpcLabel(1, "movement.rotation", this.guiLeft + 4, y + 5));
            }
            else {
                final int id3 = 5;
                final int i3 = this.guiLeft + 99;
                y += 22;
                this.addTextField(new GuiNpcTextField(id3, this, i3, y, 40, 20, this.ai.orientation + ""));
                this.getTextField(5).numbersOnly = true;
                this.getTextField(5).setMinMaxDefault(0, 359, 0);
                this.addLabel(new GuiNpcLabel(6, "movement.rotation", this.guiLeft + 4, y + 5));
                this.addLabel(new GuiNpcLabel(5, "(0-359)", this.guiLeft + 142, y + 5));
            }
            if (this.ai.standingType == EnumStandingType.NoRotation || this.ai.standingType == EnumStandingType.HeadRotation) {
                this.addTextField(new GuiNpcTextField(5, this, this.guiLeft + 165, y, 40, 20, this.ai.orientation + ""));
                this.getTextField(5).numbersOnly = true;
                this.getTextField(5).setMinMaxDefault(0, 359, 0);
                this.addLabel(new GuiNpcLabel(5, "(0-359)", this.guiLeft + 207, y + 5));
            }
        }
        if (this.ai.movingType != EnumMovingType.Standing) {
            final int i4 = 12;
            final int j4 = this.guiLeft + 80;
            y += 22;
            this.addButton(new GuiNpcButton(i4, j4, y, 100, 20, new String[] { "stats.normal", "movement.sneaking", "movement.aiming", "movement.dancing", "movement.crawling", "movement.hug" }, this.ai.animationType.getWalkingAnimation()));
            this.addLabel(new GuiNpcLabel(12, "movement.animation", this.guiLeft + 4, y + 5));
        }
        if (this.ai.movingType == EnumMovingType.MovingPath) {
            final int i5 = 8;
            final int j5 = this.guiLeft + 80;
            y += 22;
            this.addButton(new GuiNpcButton(i5, j5, y, 80, 20, new String[] { "ai.looping", "ai.backtracking" }, this.ai.movingPattern));
            this.addLabel(new GuiNpcLabel(8, "movement.name", this.guiLeft + 4, y + 5));
            final int i6 = 9;
            final int j6 = this.guiLeft + 80;
            y += 22;
            this.addButton(new GuiNpcButton(i6, j6, y, 80, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.ai.movingPause ? 1 : 0)));
            this.addLabel(new GuiNpcLabel(9, "movement.pauses", this.guiLeft + 4, y + 5));
        }
        final int i7 = 13;
        final int j7 = this.guiLeft + 100;
        y += 22;
        this.addButton(new GuiNpcButton(i7, j7, y, 50, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.ai.stopAndInteract ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(13, "movement.stopinteract", this.guiLeft + 4, y + 5));
        final int id4 = 14;
        final int i8 = this.guiLeft + 80;
        y += 22;
        this.addTextField(new GuiNpcTextField(id4, this, i8, y, 50, 18, this.ai.getWalkingSpeed() + ""));
        this.getTextField(14).numbersOnly = true;
        this.getTextField(14).setMinMaxDefault(0, 10, 4);
        this.addLabel(new GuiNpcLabel(14, "stats.walkspeed", this.guiLeft + 5, y + 5));
        this.addButton(new GuiNpcButton(66, this.guiLeft + 190, this.guiTop + 190, 60, 20, "gui.done"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 0) {
            this.ai.movingType = EnumMovingType.values()[button.getValue()];
            if (this.ai.movingType != EnumMovingType.Standing) {
                this.ai.animationType = EnumAnimation.NONE;
                this.ai.standingType = EnumStandingType.RotateBody;
                final DataAI ai = this.ai;
                final DataAI ai2 = this.ai;
                final DataAI ai3 = this.ai;
                final float bodyOffsetX = 5.0f;
                ai3.bodyOffsetZ = bodyOffsetX;
                ai2.bodyOffsetY = bodyOffsetX;
                ai.bodyOffsetX = bodyOffsetX;
            }
            this.initGui();
        }
        else if (button.id == 3) {
            this.ai.animationType = EnumAnimation.values()[button.getValue()];
            this.initGui();
        }
        else if (button.id == 4) {
            this.ai.standingType = EnumStandingType.values()[button.getValue()];
            this.initGui();
        }
        else if (button.id == 5) {
            this.ai.npcInteracting = (button.getValue() == 1);
        }
        else if (button.id == 8) {
            this.ai.movingPattern = button.getValue();
        }
        else if (button.id == 9) {
            this.ai.movingPause = (button.getValue() == 1);
        }
        else if (button.id == 12) {
            if (button.getValue() == 0) {
                this.ai.animationType = EnumAnimation.NONE;
            }
            if (button.getValue() == 1) {
                this.ai.animationType = EnumAnimation.SNEAKING;
            }
            if (button.getValue() == 2) {
                this.ai.animationType = EnumAnimation.AIMING;
            }
            if (button.getValue() == 3) {
                this.ai.animationType = EnumAnimation.DANCING;
            }
            if (button.getValue() == 4) {
                this.ai.animationType = EnumAnimation.CRAWLING;
            }
            if (button.getValue() == 5) {
                this.ai.animationType = EnumAnimation.HUG;
            }
        }
        else if (button.id == 13) {
            this.ai.stopAndInteract = (button.getValue() == 1);
        }
        else if (button.id == 66) {
            this.close();
        }
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textfield) {
        if (textfield.id == 7) {
            this.ai.bodyOffsetX = textfield.getInteger();
        }
        else if (textfield.id == 8) {
            this.ai.bodyOffsetY = textfield.getInteger();
        }
        else if (textfield.id == 9) {
            this.ai.bodyOffsetZ = textfield.getInteger();
        }
        else if (textfield.id == 5) {
            this.ai.orientation = textfield.getInteger();
        }
        else if (textfield.id == 4) {
            this.ai.walkingRange = textfield.getInteger();
        }
        else if (textfield.id == 14) {
            this.ai.setWalkingSpeed(textfield.getInteger());
        }
    }
}

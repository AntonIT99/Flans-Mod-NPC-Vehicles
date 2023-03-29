package com.flansmod.client.gui;

import com.flansmod.client.AimType;
import com.flansmod.client.FlanMouseButton;
import com.flansmod.client.FlansModClient;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GuiModOptions extends GuiScreen {

    @Override
    public void initGui() {
        addButtons();
    }

    @Override
    public void drawScreen(int var1, int var2, float var3) {
        this.drawWorldBackground(0);

        FontRenderer fontRenderer = mc.fontRenderer;
        fontRenderer.drawStringWithShadow("Flan's Options", this.width / 2 - (fontRenderer.getStringWidth("Flan's Options") / 2), 10, 16777215);

        super.drawScreen(var1, var2, var3);
    }

    @SuppressWarnings("unchecked")
    private void addButtons() {
        int fireButtonWidth = 132;
        this.buttonList.add(new GuiButton(1, (this.width / 2) - (fireButtonWidth / 2), 60, fireButtonWidth, 20, "Fire Button: " + FlansModClient.fireButton.getName()));

        this.buttonList.add(new GuiButton(2, (this.width / 2) - (fireButtonWidth / 2), 90, fireButtonWidth, 20, "Aim Button: " + FlansModClient.aimButton.getName()));

        this.buttonList.add(new GuiButton(0, (this.width / 2) - (fireButtonWidth / 2), 30, fireButtonWidth, 20, "Aim Type: " + FlansModClient.aimType.getName()));

    }

    protected void actionPerformed(GuiButton button) {
        if (button.id == 0) {
            if (FlansModClient.aimType == AimType.HOLD) {
                FlansModClient.setAimType(AimType.TOGGLE);
            } else {
                FlansModClient.setAimType(AimType.HOLD);
            }
            this.buttonList.clear();
            addButtons();
        }

        if (button.id == 1) {
            if (FlansModClient.fireButton == FlanMouseButton.LEFT) {
                FlansModClient.setFireButton(FlanMouseButton.RIGHT);
            } else {
                FlansModClient.setFireButton(FlanMouseButton.LEFT);
            }
            this.buttonList.clear();
            addButtons();
        }

        if (button.id == 2) {
            if (FlansModClient.aimButton == FlanMouseButton.LEFT) {
                FlansModClient.setAimButton(FlanMouseButton.RIGHT);
            } else {
                FlansModClient.setAimButton(FlanMouseButton.LEFT);
            }
            this.buttonList.clear();
            addButtons();
        }
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

}
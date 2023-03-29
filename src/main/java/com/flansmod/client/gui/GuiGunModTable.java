package com.flansmod.client.gui;

import com.flansmod.client.ClientProxy;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ContainerGunModTable;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketGunPaint;
import com.flansmod.common.paintjob.Paintjob;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.Collections;

public class GuiGunModTable extends GuiContainer {
    private static final ResourceLocation texture = new ResourceLocation(FlansMod.MODID, "gui/gunTableNew.png");
    private Paintjob hoveringOver = null;
    private String hoveringOverModSlots = null;
    private int mouseX, mouseY;
    private InventoryPlayer inventory;
    private boolean flipGunModel = false;

    //Smoothing
    private int[] lastStats = {0, 0, 0, 0};

    public GuiGunModTable(InventoryPlayer inv, World w) {
        super(new ContainerGunModTable(inv, w));
        inventory = inv;
        xSize = 331;
        ySize = 236;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y) {
        //Draw titles
        fontRendererObj.drawString("Gun Modification Table", 6, 6, 0x404040);
        fontRendererObj.drawString("Inventory", 7, 142, 0x404040);
        fontRendererObj.drawString("Gun Information", 179, 22, 0x404040);
        fontRendererObj.drawString("Paint Jobs", 179, 128, 0x404040);

        //If a gun is in the table, display gun and its values.
        ItemStack gunStack = inventorySlots.getSlot(0).getStack();
        if (gunStack != null && gunStack.getItem() instanceof ItemGun) {
            GunType gunType = ((ItemGun) gunStack.getItem()).type;
            int reload = Math.round(gunType.getReloadTime(gunStack));

            if (gunType.model != null) {
                GL11.glPushMatrix();
                {
                    GL11.glColor3f(1F, 1F, 1F);
                    GL11.glTranslatef(105, 55, 100);

                    GL11.glRotatef(160, 1F, 0F, 0F);
                    GL11.glRotatef(20, 0F, 1F, 0F);
                    if (flipGunModel) {
                        //GL11.glTranslatef(-85, -55, -100);
                        GL11.glTranslatef(-30F, 0, 0);
                        GL11.glRotatef(190, 0F, 1F, 0F);
                    }
                    RenderHelper.enableStandardItemLighting();
                    GL11.glScalef(-60F, 60F, 60F);
                    ClientProxy.gunRenderer.renderGunModel(gunStack, gunType, 1F / 16F, gunType.model, GunAnimations.defaults, IItemRenderer.ItemRenderType.ENTITY);
                }
                GL11.glPopMatrix();
            }

            //Draw stats
            if (gunStack.getDisplayName() != null)
                fontRendererObj.drawString(gunStack.getDisplayName(), 207, 36, 0x404040);
            fontRendererObj.drawString(gunType.description, 207, 46, 0x404040);

            fontRendererObj.drawString("Damage", 181, 61, 0x404040);
            fontRendererObj.drawString("Accuracy", 181, 73, 0x404040);
            fontRendererObj.drawString("Recoil", 181, 85, 0x404040);
            fontRendererObj.drawString("Reload", 181, 97, 0x404040);
            fontRendererObj.drawString("Control", 181, 109, 0x404040);

            fontRendererObj.drawString("Sprint", 240, 119, 0x404040);
            fontRendererObj.drawString("Sneak", 290, 119, 0x404040);


            fontRendererObj.drawString(String.valueOf(roundFloat( gunType.getDamage(gunStack))), 241, 62, 0x404040);
            fontRendererObj.drawString(String.valueOf(roundFloat(gunType.getSpread(gunStack, false, false))), 241, 74, 0x404040);
            fontRendererObj.drawString(String.valueOf(roundFloat(gunType.getRecoilDisplay(gunStack))), 241, 86, 0x404040);
            fontRendererObj.drawString(roundFloat((float)reload / 20) + "s", 241, 98, 0x404040);
            Float sprinting = roundFloat(1 - gunType.getRecoilControl(gunStack, true, false), 2);
            Float normal = roundFloat(1 - gunType.getRecoilControl(gunStack, false, false), 2);
            Float sneaking = roundFloat(1 - gunType.getRecoilControl(gunStack, false, true), 2);
            fontRendererObj.drawString(String.format("%3.2f  %3.2f  %3.2f", sprinting, normal, sneaking), 241, 110, 0x404040);

            //Draw attachment tooltips
            if (hoveringOverModSlots != null)
                drawHoveringText(Collections.singletonList(hoveringOverModSlots), mouseX - guiLeft, mouseY - guiTop, fontRendererObj);
        }
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        int xOrigin = (width - xSize) / 2;
        int yOrigin = (height - ySize) / 2;

        mc.renderEngine.bindTexture(texture);
        drawTexturedModalRect(xOrigin, yOrigin, 0, 0, xSize, ySize);

        for (int z = 1; z < 17; z++)
            inventorySlots.getSlot(z).yDisplayPosition = -1000;

        ItemStack gunStack = inventorySlots.getSlot(0).getStack();
        if (gunStack == null) {
            lastStats = new int[]{0, 0, 0, 0, 0};
        }

        if (gunStack != null && gunStack.getItem() instanceof ItemGun) {
            GunType gunType = ((ItemGun) gunStack.getItem()).type;
            int reload = Math.round(gunType.getReloadTime(gunStack));
            //Calculates yellow stat bar
            int[] stats = {Math.round(gunType.getDamage(gunStack)) * 4, Math.round(gunType.getSpread(gunStack, false, false)) * 4,
                    Math.round(gunType.getRecoilDisplay(gunStack)) * 4, (reload / 20) * 8, 0};
            displayGunValues(stats);
            boolean[] allowBooleans = {gunType.allowBarrelAttachments, gunType.allowScopeAttachments, gunType.allowStockAttachments,
                    gunType.allowGripAttachments, gunType.allowGadgetAttachments, gunType.allowSlideAttachments,
                    gunType.allowPumpAttachments, gunType.allowAccessoryAttachments};

            //draw flip display button
            drawTexturedModalRect(xOrigin + 146, yOrigin + 63, 340, 166, 20, 10);

            //Cycle through the booleans and generics, and draw to table.
            for (int m = 0; m < allowBooleans.length; m++) {
                if (allowBooleans[m]) {
                    drawTexturedModalRect(xOrigin + 16 + (m * 18), yOrigin + 88, 340 + (m * 18), 136, 18, 18);
                    inventorySlots.getSlot(m + 1).yDisplayPosition = 89;
                }
            }

            for (int x = 0; x < 8; x++) {
                if (x < gunType.numGenericAttachmentSlots) {
                    drawTexturedModalRect(xOrigin + 16 + (18 * x), yOrigin + 114, 340, 100, 18, 18);
                    inventorySlots.getSlot(allowBooleans.length + 1 + x).yDisplayPosition = 115;
                }
            }

            ArrayList<Paintjob> applicablePaintjobs = new ArrayList<>();

            if (gunType.addAnyPaintjobToTables)
            {
                for (Paintjob paintjob : gunType.paintjobs)
                {
                    if (paintjob.addToTables)
                    {
                        applicablePaintjobs.add(paintjob);
                    }
                }
            }

            //For Paintjobs
            int numPaintjobs = applicablePaintjobs.size();
            int numRows = numPaintjobs / 2 + 1;

            for (int y = 0; y < numRows; y++) {
                for (int x = 0; x < 2; x++) {
                    //If this row has only one paintjob, don't try and render the second one
                    if (2 * y + x >= numPaintjobs)
                        continue;

                    drawTexturedModalRect(xOrigin + 181 + 18 * x, yOrigin + 150 + (18 * y), 340, 100, 18, 18);
                }
            }

            //Fill paintjob slots
            for (int y = 0; y < numRows; y++) {
                for (int x = 0; x < 2; x++) {
                    //If this row has only one paintjob, don't try and render the second one
                    if (2 * y + x >= numPaintjobs)
                        continue;

                    Paintjob paintjob = applicablePaintjobs.get(2 * y + x);
                    ItemStack stack = gunStack.copy();
                    stack.setItemDamage(paintjob.ID);
                    itemRender.renderItemIntoGUI(mc.fontRenderer, mc.getTextureManager(), stack, xOrigin + 182 + (x * 18), yOrigin + 151 + (y * 18));

                    //stack.stackTagCompound.setString("Paint", paintjob.iconName);
                    //itemRender.renderItemIntoGUI(this.fontRendererObj, mc.getTextureManager(), stack, xOrigin + 182 + (x * 18), yOrigin + 151 + (y * 18));
                }
            }
        }

        //Draw hover box for paintjob
        if (hoveringOver != null) {
            int numDyes = hoveringOver.dyesNeeded.length;
            //Only draw box if there are dyes needed
            if (numDyes != 0 && !inventory.player.capabilities.isCreativeMode) {
                //Calculate which dyes we have in our inventory
                boolean[] haveDyes = new boolean[numDyes];
                for (int n = 0; n < numDyes; n++) {
                    int amountNeeded = hoveringOver.dyesNeeded[n].stackSize;
                    for (int s = 0; s < inventory.getSizeInventory(); s++) {
                        ItemStack stack = inventory.getStackInSlot(s);
                        if (stack != null && stack.getItem() == Items.dye && stack.getItemDamage() == hoveringOver.dyesNeeded[n].getItemDamage()) {
                            amountNeeded -= stack.stackSize;
                        }
                    }
                    if (amountNeeded <= 0)
                        haveDyes[n] = true;
                }

                GL11.glColor4f(1F, 1F, 1F, 1F);
                GL11.glDisable(GL11.GL_LIGHTING);
                mc.renderEngine.bindTexture(texture);

                for (int s = 0; s < numDyes; s++)
                    drawTexturedModalRect(xOrigin + 223 + (18 * s), yOrigin + 150, (haveDyes[s] ? 358 : 340), 118, 18, 18);

                for (int s = 0; s < numDyes; s++) {
                    itemRender.renderItemIntoGUI(this.fontRendererObj, mc.getTextureManager(), hoveringOver.dyesNeeded[s], xOrigin + 224 + s * 18, yOrigin + 151);
                    itemRender.renderItemOverlayIntoGUI(this.fontRendererObj, mc.getTextureManager(), hoveringOver.dyesNeeded[s], xOrigin + 224 + s * 18, yOrigin + 151);
                }
            }
        }
    }

    /**
     * Gun statistics via progress bars.
     * Loops through, and uses lastStats[] to increment.
     *
     * @param stats Gun statistics (0 = damage, 1 = accuracy, 2 = recoil, 3 = reload)
     */
    private void displayGunValues(int[] stats) {
        int xOrigin = (width - xSize) / 2;
        int yOrigin = (height - ySize) / 2;

        for (int y = 0; y < 5; y++)
            drawTexturedModalRect(xOrigin + 239, yOrigin + 60 + (12 * y), 340, 80, 80, 10);

        for (int k = 0; k < 5; k++) {
            int difference = stats[k] - lastStats[k];
            int finalWidth;

            // For damage only
            if (k == 0) {
                if (stats[k] < 80 && difference > 0)  //increment if positive
                    finalWidth = lastStats[k] += 2;
                else if (difference < 0)             //decrement if negative
                    finalWidth = lastStats[k] -= 2;
                else if (stats[k] < 80)
                    finalWidth = stats[k];
                else
                    finalWidth = 80;

                drawTexturedModalRect(xOrigin + 239, yOrigin + 60 + (12 * k), 340, 90, finalWidth, 10);
            // Control stat
            } else if (k == 4) {
                drawTexturedModalRect(xOrigin + 239, yOrigin + 60 + (12 * k), 340, 80, 32, 10);
                drawTexturedModalRect(xOrigin + 239 + 26, yOrigin + 60 + (12 * k), 341, 90, 28, 10);
                drawTexturedModalRect(xOrigin + 239 + 26 + 28, yOrigin + 60 + (12 * k), 394, 70, 32, 10);
            } else //every other stat. Works in reverse (i.e to show low spread being good accuracy)
            {
                difference = (80 - stats[k]) - lastStats[k];
                if (80 - stats[k] > 2 && difference > 0)  //increment if positive
                    finalWidth = lastStats[k] += 2;
                else if (difference < 0)                  //decrement if negative
                    finalWidth = lastStats[k] -= 2;
                else if (80 - stats[k] > 2)
                    finalWidth = 80 - stats[k];
                else
                    finalWidth = 2;

                drawTexturedModalRect(xOrigin + 239, yOrigin + 60 + (12 * k), 340, 90, finalWidth, 10);
            }
        }
    }

    @Override
    public void drawTexturedModalRect(int xPos, int yPos, int u, int v, int width, int height) {
        float f = 1F / 512F;
        float f1 = 1F / 256F;
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV((double) (xPos), (double) (yPos + height), (double) this.zLevel, (double) ((float) (u) * f), (double) ((float) (v + height) * f1));
        tessellator.addVertexWithUV((double) (xPos + width), (double) (yPos + height), (double) this.zLevel, (double) ((float) (u + width) * f), (double) ((float) (v + height) * f1));
        tessellator.addVertexWithUV((double) (xPos + width), (double) (yPos), (double) this.zLevel, (double) ((float) (u + width) * f), (double) ((float) (v) * f1));
        tessellator.addVertexWithUV((double) (xPos), (double) (yPos), (double) this.zLevel, (double) ((float) (u) * f), (double) ((float) (v) * f1));
        tessellator.draw();
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();

        mouseX = Mouse.getEventX() * this.width / this.mc.displayWidth;
        mouseY = this.height - Mouse.getEventY() * this.height / this.mc.displayHeight - 1;

        int mouseXInGUI = mouseX - guiLeft;
        int mouseYInGUI = mouseY - guiTop;

        hoveringOver = null;
        ItemStack gunStack = inventorySlots.getSlot(0).getStack();
        if (gunStack != null && gunStack.getItem() instanceof ItemGun) {
            GunType gunType = ((ItemGun) gunStack.getItem()).type;

            ArrayList<Paintjob> applicablePaintjobs = new ArrayList<>();

            if (gunType.addAnyPaintjobToTables)
            {
                for (Paintjob paintjob : gunType.paintjobs)
                {
                    if (paintjob.addToTables)
                    {
                        applicablePaintjobs.add(paintjob);
                    }
                }
            }

            int numPaintjobs = applicablePaintjobs.size();
            int numRows = numPaintjobs / 2 + 1;

            for (int j = 0; j < numRows; j++) {
                for (int i = 0; i < 2; i++) {
                    if (2 * j + i >= numPaintjobs)
                        continue;

                    Paintjob paintjob = applicablePaintjobs.get(2 * j + i);
                    int slotX = 181 + i * 18;
                    int slotY = 150 + j * 18;
                    if (mouseXInGUI >= slotX && mouseXInGUI < slotX + 18 && mouseYInGUI >= slotY && mouseYInGUI < slotY + 18)
                        hoveringOver = paintjob;
                }
            }

            //Show attachment tooltips
            hoveringOverModSlots = null;
            String[] text = {"Barrel", "Scope", "Stock", "Grip", "Gadget", "Slide", "Pump", "Accessory"};
            boolean[] allowBools = {gunType.allowBarrelAttachments, gunType.allowScopeAttachments, gunType.allowStockAttachments,
                    gunType.allowGripAttachments, gunType.allowGadgetAttachments, gunType.allowSlideAttachments,
                    gunType.allowPumpAttachments, gunType.allowAccessoryAttachments};

            for (int a = 0; a < allowBools.length; a++) {
                int slotX = 16 + a * 18;
                int slotY = 88;
                if (mouseXInGUI >= slotX && mouseXInGUI < slotX + 18 && mouseYInGUI >= slotY && mouseYInGUI < slotY + 18
                        && !inventorySlots.getSlot(a + 1).getHasStack() && allowBools[a])
                    hoveringOverModSlots = text[a];
            }
        }
    }

    @Override
    protected void mouseClicked(int x, int y, int button) {
        int xOrigin = (width - xSize) / 2;
        int yOrigin = (height - ySize) / 2;

        super.mouseClicked(x, y, button);
        int m = x - xOrigin;
        int n = y - yOrigin;
        if (button == 0 || button == 1) {
            if (m >= 146 && m <= 165 && n >= 63 && n <= 72) {
                flipGunModel = !flipGunModel;
            }
        }

        if (button != 0)
            return;
        if (hoveringOver == null)
            return;

        FlansMod.getPacketHandler().sendToServer(new PacketGunPaint(hoveringOver.ID));
        ((ContainerGunModTable) inventorySlots).clickPaintjob(hoveringOver);
    }

    //Round values to n number of decimal points
    private static float roundFloat(float value) {
        int pow = 10;
        for (int i = 1; i < 2; i++)
            pow *= 10;
        float result = value * pow;

        return (float) (int) ((result - (int) result) >= 0.5f ? result + 1 : result) / pow;
    }

	//Round values to n number of decimal points
	public static float roundFloat(float value, int points)
	{
		int pow = 10;
		for (int i = 1; i < points; i++)
			pow *= 10;
		float result = value * pow;

		return (float)(int)((result - (int) result) >= 0.5f ? result + 1 : result) / pow;
	}
}

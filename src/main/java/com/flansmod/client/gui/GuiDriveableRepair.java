package com.flansmod.client.gui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.network.PacketDriveableGUI;

public class GuiDriveableRepair extends GuiScreen {
    private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/repair.png");

    /**
     * The player using this GUI
     */
    private EntityPlayer driver;
    /**
     * The driveable (s)he is driving
     */
    private EntityDriveable driving;
    /**
     * The list of parts that are actually damageable
     */
    private ArrayList<DriveablePart> partsToDraw = new ArrayList<DriveablePart>();

    /**
     * Item renderer
     */
    private static RenderItem itemRenderer = new RenderItem();
    /**
     * Gui origin
     */
    private int guiOriginX, guiOriginY;

    private int scroll = 0;

    private boolean canScroll = false;

    public GuiDriveableRepair(EntityPlayer player) {
        driver = player;
        if (player.ridingEntity == null || !((EntitySeat) player.ridingEntity).foundDriveable) {
            Minecraft.getMinecraft().thePlayer.closeScreen();
        } else {
            driving = ((EntitySeat) player.ridingEntity).driveable;
            for (DriveablePart part : driving.getDriveableData().parts.values()) {
                //Check to see if the part is actually damageable
                if (part.maxHealth > 0) {
                    //Add it to the list of parts to draw
                    partsToDraw.add(part);
                }
            }
        }

        Collections.sort(partsToDraw, new Comparator<DriveablePart>() {
            @Override
            public int compare(DriveablePart s1, DriveablePart s2) {
                return s1.type.getName().compareTo(s2.type.getName());
            }
        });
    }

    @Override
    public void initGui() {
        super.initGui();
        for (int i = 0; i < partsToDraw.size(); i++) {
            buttonList.add(new GuiButton(i, 0, 0, 45, 20, "Repair"));
        }
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        FlansMod.proxy.repairDriveable(driver, driving, partsToDraw.get(button.id));
        if (scroll>0) {
            scroll--;
        }
    }

    private void updateButtons(int maxAllowableY) {
        int y = 43;
        for (int i = 0; i < partsToDraw.size(); i++) {
            DriveablePart part = partsToDraw.get(i);
            GuiButton button = (GuiButton) buttonList.get(i);
            button.xPosition = guiOriginX + 9;
            button.yPosition = guiOriginY + y;
            if (i >= scroll) {
                y += part.health <= 0 ? 40 : 20;
            }

            button.visible = (part.health <= 0) && ((button.yPosition - guiOriginY + 8) < maxAllowableY) && (i >= scroll);
        }
    }

    @Override
    public void drawScreen(int i, int j, float f) {
        //Standard GUI render stuff
        ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
        int w = scaledresolution.getScaledWidth();
        int h = scaledresolution.getScaledHeight();


        int guiWidth = 202;
        //Work out the guiHeight by adding what is necessary for each part
        int guiAllowedHeight = 31;
        int guiNeededHeight = 31;
        for (DriveablePart part : partsToDraw) {
            if ((guiAllowedHeight + (part.health <= 0 ? 40 : 20)) < h) {
                guiAllowedHeight += (part.health <= 0 ? 40 : 20);
            }

            guiNeededHeight += (part.health <= 0 ? 40 : 20);
        }
        //Update the buttons
        updateButtons(guiAllowedHeight);


        drawDefaultBackground();
        GL11.glEnable(3042 /*GL_BLEND*/);

        //Bind the background texture
        mc.renderEngine.bindTexture(texture);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        //Calculate the gui origin
        guiOriginX = w / 2 - guiWidth / 2;
        guiOriginY = h / 2 - guiAllowedHeight / 2;

        //Render the header
        drawTexturedModalRect(guiOriginX, guiOriginY, 0, 0, 202, 23);
        //Render the footer
        // don't render footer here, do it at the end
        //Render the title
        drawString(fontRendererObj, driving.getDriveableType().name + " - Repair", guiOriginX + 7, guiOriginY + 7, 0xffffff);

        int buttonIndex = 0;

        //Render each part
        //Where to start rendering from. Updated with each part
        int y = 23;

        int partIndex = 0;
        canScroll = false;

        for (DriveablePart part : partsToDraw) {
            boolean broken = part.health <= 0;

            if ((y + (broken ? 40 : 20) + 8) <= guiAllowedHeight && partIndex >= scroll) {
                //Render the background for this section
                mc.renderEngine.bindTexture(texture);
                drawTexturedModalRect(guiOriginX, guiOriginY + y, 0, 24, 202, broken ? 40 : 20);

                //Render the damage bar
                float percentHealth = (float) part.health / (float) part.maxHealth;
                GL11.glColor3f(1 - percentHealth, percentHealth, 0F);
                drawTexturedModalRect(guiOriginX + 111, guiOriginY + y + 2, 0, 73, (int) (70 * percentHealth), 16);

                //Write the part name and percent health
                drawString(fontRendererObj, part.type.getName(), guiOriginX + 10, guiOriginY + y + 6, 0xffffff);
                drawCenteredString(fontRendererObj, (int) (percentHealth * 100F) + "%", guiOriginX + 148, guiOriginY + y + 6, 0xffffff);

                //If the part is damaged, draw the parts required to fix it
                if (broken) {
                    //Create a temporary copy of the player inventory in order to work out whether the player has each of the itemstacks required
                    InventoryPlayer temporaryInventory = new InventoryPlayer(null);
                    temporaryInventory.copyInventory(driver.inventory);

                    ArrayList<ItemStack> stacksNeeded = driving.getDriveableType().getItemsRequired(part, driving.getDriveableData().engine);
                    //Draw the stacks that should be in each slot
                    for (int n = 0; n < 7; n++) {
                        //If there are more than 7 stacks, loop over them
                        int stackNum = n + (FlansMod.ticker / 60) % Math.max(1, stacksNeeded.size() - 6);
                        //If this is a valid stack
                        if (stackNum < stacksNeeded.size()) {
                            //Get the item stack we need
                            ItemStack stackNeeded = stacksNeeded.get(stackNum);
                            //The total amount of items found that match this recipe stack
                            int totalAmountFound = 0;
                            //Iterate over the temporary inventory
                            for (int m = 0; m < temporaryInventory.getSizeInventory(); m++) {
                                //Get the stack in each slot
                                ItemStack stackInSlot = temporaryInventory.getStackInSlot(m);
                                //If the stack is what we want
                                if (stackInSlot != null && stackInSlot.getItem() == stackNeeded.getItem() && stackInSlot.getItemDamage() == stackNeeded.getItemDamage()) {
                                    //Work out the amount to take from the stack
                                    int amountFound = Math.min(stackInSlot.stackSize, stackNeeded.stackSize - totalAmountFound);
                                    //Take it
                                    stackInSlot.stackSize -= amountFound;
                                    //Check for empty stacks
                                    if (stackInSlot.stackSize <= 0)
                                        stackInSlot = null;
                                    //Put the modified stack back in the inventory
                                    temporaryInventory.setInventorySlotContents(m, stackInSlot);
                                    //Increase the amount found counter
                                    totalAmountFound += amountFound;
                                    //If we have enough, stop looking
                                    if (totalAmountFound == stackNeeded.stackSize)
                                        break;
                                }
                            }
                            //If we did not find enough in the inventory
                            if (totalAmountFound < stackNeeded.stackSize) {
                                mc.renderEngine.bindTexture(texture);
                                drawTexturedModalRect(guiOriginX + 57 + 18 * n, guiOriginY + y + 22, 202, 0, 16, 16);
                            }
                            drawSlotInventory(stacksNeeded.get(stackNum), guiOriginX + 57 + 18 * n, guiOriginY + y + 22);
                        }
                    }


                }

                //Increase the render y value for the next part
                y += broken ? 40 : 20;
            } else if (partIndex >= scroll) {
                canScroll = true;
            }

            partIndex++;
        }

        if (guiNeededHeight > guiAllowedHeight) {
            mc.renderEngine.bindTexture(texture);
            drawTexturedModalRect(guiOriginX+184, guiOriginY + 23, 206, 24, 18, 40);

            int spacing=12;
            drawCenteredString(fontRendererObj, Integer.toString(scroll + 1), guiOriginX + 192, guiOriginY + 73, 0xffffff);
            drawCenteredString(fontRendererObj, "/", guiOriginX + 192, guiOriginY + 73 + spacing, 0xffffff);
            drawCenteredString(fontRendererObj, Integer.toString(getMaxScroll(guiAllowedHeight)), guiOriginX + 192, guiOriginY + 73 + spacing * 2, 0xffffff);
        }

        mc.renderEngine.bindTexture(texture);
        drawTexturedModalRect(guiOriginX, guiOriginY + y, 0, 65, 202, 8);

        super.drawScreen(i, j, f);
    }

    @Override
    protected void mouseClicked(int i, int j, int k) {
        super.mouseClicked(i, j, k);
        int m = i - guiOriginX;
        int n = j - guiOriginY;
        if (m > 185 && m < 195 && n > 5 && n < 15) {
            if (driving instanceof EntityMecha) {
                FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(4));
                (driver).openGui(FlansMod.INSTANCE, 10, driver.worldObj, driving.chunkCoordX, driving.chunkCoordY, driving.chunkCoordZ);
            } else {
                mc.displayGuiScreen(new GuiDriveableMenu(driver.inventory, driver.worldObj, driving));
            }
        } else if (m > 189 && m < 199 && n > 32 && n < 42 && scroll > 0) {
            scroll--;
        } else if (m > 189 && m < 199 && n > 44 && n < 54 && canScroll) {
            scroll++;
        }
    }

    /**
     * Item stack rendering method
     */
    private void drawSlotInventory(ItemStack itemstack, int i, int j) {
        if (itemstack == null || itemstack.getItem() == null)
            return;
        itemRenderer.renderItemIntoGUI(fontRendererObj, mc.renderEngine, itemstack, i, j);
        itemRenderer.renderItemOverlayIntoGUI(fontRendererObj, mc.renderEngine, itemstack, i, j);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_DEPTH_TEST);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    private int getMaxScroll(float h) {
        int lScroll = 0;
        int counter = 0;

        while (counter < partsToDraw.size()) {
            int y = 0;

            counter = 0;
            for (DriveablePart part : partsToDraw) {
                if (y + (part.health <= 0 ? 40 : 20) <= h - 31 && counter >= lScroll) {
                    y += (part.health <= 0 ? 40 : 20);

                    counter++;
                } else if (counter < lScroll) {
                    counter++;
                }
            }

            lScroll++;
        }

        return lScroll;
    }
}

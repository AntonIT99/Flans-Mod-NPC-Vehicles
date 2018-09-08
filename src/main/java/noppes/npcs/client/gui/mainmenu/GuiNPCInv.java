// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.mainmenu;

import net.minecraft.util.StatCollector;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.inventory.Slot;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcSlider;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import net.minecraft.inventory.Container;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.containers.ContainerNPCInv;
import java.util.HashMap;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.ISliderListener;
import noppes.npcs.client.gui.util.GuiContainerNPCInterface2;

public class GuiNPCInv extends GuiContainerNPCInterface2 implements ISliderListener, IGuiData
{
    private HashMap<Integer, Integer> chances;
    private ContainerNPCInv container;
    private ResourceLocation slot;
    
    public GuiNPCInv(final EntityNPCInterface npc, final ContainerNPCInv container) {
        super(npc, container, 3);
        this.chances = new HashMap<Integer, Integer>();
        this.setBackground("npcinv.png");
        this.container = container;
        this.ySize = 200;
        this.slot = this.getResource("slot.png");
        Client.sendData(EnumPacketServer.MainmenuInvGet, new Object[0]);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addLabel(new GuiNpcLabel(0, "inv.minExp", this.guiLeft + 118, this.guiTop + 18));
        this.addTextField(new GuiNpcTextField(0, (GuiScreen)this, this.fontRendererObj, this.guiLeft + 108, this.guiTop + 29, 60, 20, this.npc.inventory.minExp + ""));
        this.getTextField(0).numbersOnly = true;
        this.getTextField(0).setMinMaxDefault(0, 32767, 0);
        this.addLabel(new GuiNpcLabel(1, "inv.maxExp", this.guiLeft + 118, this.guiTop + 52));
        this.addTextField(new GuiNpcTextField(1, (GuiScreen)this, this.fontRendererObj, this.guiLeft + 108, this.guiTop + 63, 60, 20, this.npc.inventory.maxExp + ""));
        this.getTextField(1).numbersOnly = true;
        this.getTextField(1).setMinMaxDefault(0, 32767, 0);
        this.addButton(new GuiNpcButton(10, this.guiLeft + 88, this.guiTop + 88, 80, 20, new String[] { "stats.normal", "inv.auto" }, this.npc.inventory.lootMode));
        this.addLabel(new GuiNpcLabel(2, "inv.npcInventory", this.guiLeft + 191, this.guiTop + 5));
        this.addLabel(new GuiNpcLabel(3, "inv.inventory", this.guiLeft + 8, this.guiTop + 101));
        for (int i = 0; i < 9; ++i) {
            int chance = 100;
            if (this.npc.inventory.dropchance.containsKey(i)) {
                chance = this.npc.inventory.dropchance.get(i);
            }
            if (chance <= 0 || chance > 100) {
                chance = 100;
            }
            this.chances.put(i, chance);
            final GuiNpcSlider slider = new GuiNpcSlider((GuiScreen)this, i, this.guiLeft + 211, this.guiTop + 14 + i * 21, chance / 100.0f);
            this.addSlider(slider);
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        if (guibutton.id == 10) {
            this.npc.inventory.lootMode = ((GuiNpcButton)guibutton).getValue();
        }
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float f, final int i, final int j) {
        super.drawGuiContainerBackgroundLayer(f, i, j);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(this.slot);
        for (int id = 4; id <= 6; ++id) {
            final Slot slot = this.container.getSlot(id);
            if (slot.getHasStack()) {
                this.drawTexturedModalRect(this.guiLeft + slot.xDisplayPosition - 1, this.guiTop + slot.yDisplayPosition - 1, 0, 0, 18, 18);
            }
        }
    }
    
    @Override
    public void drawScreen(final int i, final int j, final float f) {
        final int showname = this.npc.display.showName;
        this.npc.display.showName = 1;
        final int l = this.guiLeft + 20;
        final int i2 = this.height / 2 - 145;
        GL11.glEnable(32826);
        GL11.glEnable(2903);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(l + 33), (float)(i2 + 131), 50.0f);
        final float f2 = 150.0f / this.npc.display.modelSize;
        GL11.glScalef(-f2, f2, f2);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        final float f3 = this.npc.renderYawOffset;
        final float f4 = this.npc.rotationYaw;
        final float f5 = this.npc.rotationPitch;
        final float f6 = this.npc.rotationYawHead;
        final float f7 = l + 33 - i;
        final float f8 = i2 + 131 - 50 - j;
        GL11.glRotatef(135.0f, 0.0f, 1.0f, 0.0f);
        RenderHelper.enableStandardItemLighting();
        GL11.glRotatef(-135.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-(float)Math.atan(f8 / 40.0f) * 20.0f, 1.0f, 0.0f, 0.0f);
        this.npc.renderYawOffset = (float)Math.atan(f7 / 40.0f) * 20.0f;
        this.npc.rotationYaw = (float)Math.atan(f7 / 40.0f) * 40.0f;
        this.npc.rotationPitch = -(float)Math.atan(f8 / 40.0f) * 20.0f;
        this.npc.rotationYawHead = this.npc.rotationYaw;
        GL11.glTranslatef(0.0f, this.npc.yOffset, 0.0f);
        RenderManager.instance.playerViewY = 180.0f;
        RenderManager.instance.renderEntityWithPosYaw((Entity)this.npc, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        this.npc.renderYawOffset = f3;
        this.npc.rotationYaw = f4;
        this.npc.rotationPitch = f5;
        this.npc.rotationYawHead = f6;
        GL11.glPopMatrix();
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable(32826);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glDisable(3553);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        this.npc.display.showName = showname;
        super.drawScreen(i, j, f);
    }
    
    @Override
    public void save() {
        this.npc.inventory.dropchance = this.chances;
        this.npc.inventory.minExp = this.getTextField(0).getInteger();
        this.npc.inventory.maxExp = this.getTextField(1).getInteger();
        Client.sendData(EnumPacketServer.MainmenuInvSave, this.npc.inventory.writeEntityToNBT(new NBTTagCompound()));
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        this.npc.inventory.readEntityFromNBT(compound);
        this.initGui();
    }
    
    @Override
    public void mouseDragged(final GuiNpcSlider guiNpcSlider) {
        guiNpcSlider.displayString = StatCollector.translateToLocal("inv.dropChance") + ": " + (int)(guiNpcSlider.sliderValue * 100.0f) + "%";
    }
    
    @Override
    public void mousePressed(final GuiNpcSlider guiNpcSlider) {
    }
    
    @Override
    public void mouseReleased(final GuiNpcSlider guiNpcSlider) {
        this.chances.put(guiNpcSlider.id, (int)(guiNpcSlider.sliderValue * 100.0f));
    }
}

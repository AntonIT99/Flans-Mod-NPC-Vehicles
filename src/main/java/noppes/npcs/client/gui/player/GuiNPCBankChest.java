// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.player;

import noppes.npcs.NoppesUtilServer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.client.renderer.RenderHelper;
import noppes.npcs.client.CustomNpcResourceListener;
import org.lwjgl.opengl.GL11;
import noppes.npcs.NoppesUtilPlayer;
import noppes.npcs.constants.EnumPlayerPacket;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.StatCollector;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.inventory.Container;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.item.ItemStack;
import noppes.npcs.containers.ContainerNPCBankInterface;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.GuiContainerNPCInterface;

public class GuiNPCBankChest extends GuiContainerNPCInterface implements IGuiData
{
    private final ResourceLocation resource;
    private ContainerNPCBankInterface container;
    private int availableSlots;
    private int maxSlots;
    private int unlockedSlots;
    private ItemStack currency;
    
    public GuiNPCBankChest(final EntityNPCInterface npc, final ContainerNPCBankInterface container) {
        super(npc, container);
        this.resource = new ResourceLocation("customnpcs", "textures/gui/bankchest.png");
        this.availableSlots = 0;
        this.maxSlots = 1;
        this.unlockedSlots = 1;
        this.container = container;
        this.title = "";
        this.allowUserInput = false;
        this.ySize = 235;
        this.closeOnEsc = true;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.availableSlots = 0;
        if (this.maxSlots > 1) {
            for (int i = 0; i < this.maxSlots; ++i) {
                final GuiNpcButton button = new GuiNpcButton(i, this.guiLeft - 50, this.guiTop + 10 + i * 24, 50, 20, "Tab " + (i + 1));
                if (i > this.unlockedSlots) {
                    button.setEnabled(false);
                }
                this.addButton(button);
                ++this.availableSlots;
            }
            if (this.availableSlots == 1) {
                this.buttonList.clear();
            }
        }
        if (!this.container.isAvailable()) {
            this.addButton(new GuiNpcButton(8, this.guiLeft + 48, this.guiTop + 48, 80, 20, StatCollector.translateToLocal("bank.unlock")));
        }
        else if (this.container.canBeUpgraded()) {
            this.addButton(new GuiNpcButton(9, this.guiLeft + 48, this.guiTop + 48, 80, 20, StatCollector.translateToLocal("bank.upgrade")));
        }
        if (this.maxSlots > 1) {
            this.getButton(this.container.slot).visible = false;
            this.getButton(this.container.slot).setEnabled(false);
        }
    }
    
    public void actionPerformed(final GuiButton guibutton) {
        super.actionPerformed(guibutton);
        final int id = guibutton.id;
        if (id < 6) {
            this.close();
            NoppesUtilPlayer.sendData(EnumPlayerPacket.BankSlotOpen, id, this.container.bankid);
        }
        if (id == 8) {
            NoppesUtilPlayer.sendData(EnumPlayerPacket.BankUnlock, new Object[0]);
        }
        if (id == 9) {
            NoppesUtilPlayer.sendData(EnumPlayerPacket.BankUpgrade, new Object[0]);
        }
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float f, final int i, final int j) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(this.resource);
        final int l = (this.width - this.xSize) / 2;
        final int i2 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(l, i2, 0, 0, this.xSize, 6);
        if (!this.container.isAvailable()) {
            this.drawTexturedModalRect(l, i2 + 6, 0, 6, this.xSize, 64);
            this.drawTexturedModalRect(l, i2 + 70, 0, 124, this.xSize, 98);
            final int x = this.guiLeft + 30;
            final int y = this.guiTop + 8;
            this.fontRendererObj.drawString(StatCollector.translateToLocal("bank.unlockCosts") + ":", x, y + 4, CustomNpcResourceListener.DefaultTextColor);
            this.drawItem(x + 90, y, this.currency, i, j);
        }
        else if (this.container.isUpgraded()) {
            this.drawTexturedModalRect(l, i2 + 60, 0, 60, this.xSize, 162);
            this.drawTexturedModalRect(l, i2 + 6, 0, 60, this.xSize, 64);
        }
        else if (this.container.canBeUpgraded()) {
            this.drawTexturedModalRect(l, i2 + 6, 0, 6, this.xSize, 216);
            final int x = this.guiLeft + 30;
            final int y = this.guiTop + 8;
            this.fontRendererObj.drawString(StatCollector.translateToLocal("bank.upgradeCosts") + ":", x, y + 4, CustomNpcResourceListener.DefaultTextColor);
            this.drawItem(x + 90, y, this.currency, i, j);
        }
        else {
            this.drawTexturedModalRect(l, i2 + 6, 0, 60, this.xSize, 162);
        }
        if (this.maxSlots > 1) {
            for (int ii = 0; ii < this.maxSlots; ++ii) {
                if (this.availableSlots == ii) {
                    break;
                }
                this.fontRendererObj.drawString("Tab " + (ii + 1), this.guiLeft - 40, this.guiTop + 16 + ii * 24, 16777215);
            }
        }
        super.drawGuiContainerBackgroundLayer(f, i, j);
    }
    
    private void drawItem(final int x, final int y, final ItemStack item, final int mouseX, final int mouseY) {
        if (item == null) {
            return;
        }
        RenderHelper.enableGUIStandardItemLighting();
        GL11.glEnable(32826);
        GL11.glEnable(2903);
        GL11.glEnable(2896);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GuiNPCBankChest.itemRender.renderItemAndEffectIntoGUI(this.fontRendererObj, this.mc.renderEngine, item, x, y);
        GuiNPCBankChest.itemRender.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, item, x, y);
        if (this.func_146978_c(x - this.guiLeft, y - this.guiTop, 16, 16, mouseX, mouseY)) {
            this.renderToolTip(item, mouseX, mouseY);
        }
        RenderHelper.disableStandardItemLighting();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    @Override
    public void save() {
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        this.maxSlots = compound.getInteger("MaxSlots");
        this.unlockedSlots = compound.getInteger("UnlockedSlots");
        if (compound.hasKey("Currency")) {
            this.currency = NoppesUtilServer.readItem(compound.getCompoundTag("Currency"));
        }
        else {
            this.currency = null;
        }
        if (this.container.currency != null) {
            this.container.currency.item = this.currency;
        }
        this.initGui();
    }
}

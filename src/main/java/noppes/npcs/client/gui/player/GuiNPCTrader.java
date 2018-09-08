// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.player;

import net.minecraft.util.StatCollector;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.CustomNpcResourceListener;
import noppes.npcs.NoppesUtilPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.RenderHelper;
import org.lwjgl.opengl.GL11;
import net.minecraft.inventory.Container;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.containers.ContainerNPCTrader;
import noppes.npcs.roles.RoleTrader;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.client.gui.util.GuiContainerNPCInterface;

public class GuiNPCTrader extends GuiContainerNPCInterface
{
    private final ResourceLocation resource;
    private final ResourceLocation slot;
    private RoleTrader role;
    private ContainerNPCTrader container;
    
    public GuiNPCTrader(final EntityNPCInterface npc, final ContainerNPCTrader container) {
        super(npc, container);
        this.resource = new ResourceLocation("customnpcs", "textures/gui/trader.png");
        this.slot = new ResourceLocation("customnpcs", "textures/gui/slot.png");
        this.container = container;
        this.role = (RoleTrader)npc.roleInterface;
        this.closeOnEsc = true;
        this.ySize = 224;
        this.xSize = 223;
        this.title = "role.trader";
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float f, final int i, final int j) {
        this.drawWorldBackground(0);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(this.resource);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
        RenderHelper.enableGUIStandardItemLighting();
        GL11.glEnable(32826);
        GL11.glEnable(2903);
        GL11.glEnable(2896);
        this.mc.renderEngine.bindTexture(this.slot);
        for (int slot = 0; slot < 18; ++slot) {
            final int x = this.guiLeft + slot % 3 * 72 + 10;
            final int y = this.guiTop + slot / 3 * 21 + 6;
            ItemStack item = this.role.inventoryCurrency.items.get(slot);
            ItemStack item2 = this.role.inventoryCurrency.items.get(slot + 18);
            if (item == null) {
                item = item2;
                item2 = null;
            }
            if (NoppesUtilPlayer.compareItems(item, item2, false, false)) {
                final ItemStack copy;
                item = (copy = item.copy());
                copy.stackSize += item2.stackSize;
                item2 = null;
            }
            final ItemStack sold = this.role.inventorySold.items.get(slot);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.mc.renderEngine.bindTexture(this.slot);
            this.drawTexturedModalRect(x + 42, y, 0, 0, 18, 18);
            if (item != null && sold != null) {
                RenderHelper.enableGUIStandardItemLighting();
                if (item2 != null) {
                    GuiNPCTrader.itemRender.renderItemAndEffectIntoGUI(this.fontRendererObj, this.mc.renderEngine, item2, x, y + 1);
                    GuiNPCTrader.itemRender.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, item2, x, y + 1);
                }
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                GuiNPCTrader.itemRender.renderItemAndEffectIntoGUI(this.fontRendererObj, this.mc.renderEngine, item, x + 18, y + 1);
                GuiNPCTrader.itemRender.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, item, x + 18, y + 1);
                RenderHelper.disableStandardItemLighting();
                this.fontRendererObj.drawString("=", x + 36, y + 5, CustomNpcResourceListener.DefaultTextColor);
            }
        }
        GL11.glEnable(2896);
        GL11.glEnable(2929);
        RenderHelper.enableStandardItemLighting();
        super.drawGuiContainerBackgroundLayer(f, i, j);
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(final int par1, final int par2) {
        for (int slot = 0; slot < 18; ++slot) {
            final int x = slot % 3 * 72 + 10;
            final int y = slot / 3 * 21 + 6;
            ItemStack item = this.role.inventoryCurrency.items.get(slot);
            ItemStack item2 = this.role.inventoryCurrency.items.get(slot + 18);
            if (item == null) {
                item = item2;
                item2 = null;
            }
            if (NoppesUtilPlayer.compareItems(item, item2, this.role.ignoreDamage, this.role.ignoreNBT)) {
                final ItemStack copy;
                item = (copy = item.copy());
                copy.stackSize += item2.stackSize;
                item2 = null;
            }
            final ItemStack sold = this.role.inventorySold.items.get(slot);
            if (item != null) {
                if (sold != null) {
                    if (this.func_146978_c(x + 43, y + 1, 16, 16, par1, par2)) {
                        if (!this.container.canBuy(slot, (EntityPlayer)this.player)) {
                            GL11.glTranslatef(0.0f, 0.0f, 300.0f);
                            if (item != null && !NoppesUtilPlayer.compareItems((EntityPlayer)this.player, item, this.role.ignoreDamage, this.role.ignoreNBT)) {
                                this.drawGradientRect(x + 17, y, x + 35, y + 18, 1886851088, 1886851088);
                            }
                            if (item2 != null && !NoppesUtilPlayer.compareItems((EntityPlayer)this.player, item2, this.role.ignoreDamage, this.role.ignoreNBT)) {
                                this.drawGradientRect(x - 1, y, x + 17, y + 18, 1886851088, 1886851088);
                            }
                            final String title = StatCollector.translateToLocal("trader.insufficient");
                            this.fontRendererObj.drawString(title, (this.xSize - this.fontRendererObj.getStringWidth(title)) / 2, 131, 14483456);
                            GL11.glTranslatef(0.0f, 0.0f, -300.0f);
                        }
                        else {
                            final String title = StatCollector.translateToLocal("trader.sufficient");
                            this.fontRendererObj.drawString(title, (this.xSize - this.fontRendererObj.getStringWidth(title)) / 2, 131, 56576);
                        }
                    }
                    if (this.func_146978_c(x, y, 16, 16, par1, par2) && item2 != null) {
                        this.renderToolTip(item2, par1 - this.guiLeft, par2 - this.guiTop);
                    }
                    if (this.func_146978_c(x + 18, y, 16, 16, par1, par2)) {
                        this.renderToolTip(item, par1 - this.guiLeft, par2 - this.guiTop);
                    }
                }
            }
        }
    }
    
    @Override
    public void save() {
    }
}

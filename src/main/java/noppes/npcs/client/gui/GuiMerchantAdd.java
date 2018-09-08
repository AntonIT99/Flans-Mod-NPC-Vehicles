// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import net.minecraft.client.renderer.RenderHelper;
import org.lwjgl.opengl.GL11;
import io.netty.buffer.ByteBuf;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import io.netty.buffer.Unpooled;
import net.minecraft.village.MerchantRecipe;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.village.MerchantRecipeList;
import noppes.npcs.client.CustomNpcResourceListener;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.Container;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.containers.ContainerMerchantAdd;
import noppes.npcs.ServerEventsHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.IMerchant;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.Gui;

@SideOnly(Side.CLIENT)
public class GuiMerchantAdd extends GuiContainer
{
    private static final ResourceLocation merchantGuiTextures;
    private IMerchant theIMerchant;
    private MerchantButton nextRecipeButtonIndex;
    private MerchantButton previousRecipeButtonIndex;
    private int currentRecipeIndex;
    private String field_94082_v;
    
    public GuiMerchantAdd() {
        super((Container)new ContainerMerchantAdd((EntityPlayer)Minecraft.getMinecraft().thePlayer, (IMerchant)ServerEventsHandler.Merchant, (World)Minecraft.getMinecraft().theWorld));
        this.theIMerchant = (IMerchant)ServerEventsHandler.Merchant;
        this.field_94082_v = I18n.format("entity.Villager.name", new Object[0]);
    }
    
    public void initGui() {
        super.initGui();
        final int i = (this.width - this.xSize) / 2;
        final int j = (this.height - this.ySize) / 2;
        this.buttonList.add(this.nextRecipeButtonIndex = new MerchantButton(1, i + 120 + 27, j + 24 - 1, true));
        this.buttonList.add(this.previousRecipeButtonIndex = new MerchantButton(2, i + 36 - 19, j + 24 - 1, false));
        this.buttonList.add(new GuiNpcButton(4, i + this.xSize, j + 20, 60, 20, "gui.remove"));
        this.buttonList.add(new GuiNpcButton(5, i + this.xSize, j + 50, 60, 20, "gui.add"));
        this.nextRecipeButtonIndex.enabled = false;
        this.previousRecipeButtonIndex.enabled = false;
    }
    
    protected void drawGuiContainerForegroundLayer(final int par1, final int par2) {
        this.fontRendererObj.drawString(this.field_94082_v, this.xSize / 2 - this.fontRendererObj.getStringWidth(this.field_94082_v) / 2, 6, CustomNpcResourceListener.DefaultTextColor);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, CustomNpcResourceListener.DefaultTextColor);
    }
    
    public void updateScreen() {
        super.updateScreen();
        final Minecraft mc = Minecraft.getMinecraft();
        final MerchantRecipeList merchantrecipelist = this.theIMerchant.getRecipes((EntityPlayer)mc.thePlayer);
        if (merchantrecipelist != null) {
            this.nextRecipeButtonIndex.enabled = (this.currentRecipeIndex < merchantrecipelist.size() - 1);
            this.previousRecipeButtonIndex.enabled = (this.currentRecipeIndex > 0);
        }
    }
    
    protected void actionPerformed(final GuiButton par1GuiButton) {
        boolean flag = false;
        final Minecraft mc = Minecraft.getMinecraft();
        if (par1GuiButton == this.nextRecipeButtonIndex) {
            ++this.currentRecipeIndex;
            flag = true;
        }
        else if (par1GuiButton == this.previousRecipeButtonIndex) {
            --this.currentRecipeIndex;
            flag = true;
        }
        if (par1GuiButton.id == 4) {
            final MerchantRecipeList merchantrecipelist = this.theIMerchant.getRecipes((EntityPlayer)mc.thePlayer);
            if (this.currentRecipeIndex < merchantrecipelist.size()) {
                merchantrecipelist.remove(this.currentRecipeIndex);
                if (this.currentRecipeIndex > 0) {
                    --this.currentRecipeIndex;
                }
                Client.sendData(EnumPacketServer.MerchantUpdate, ServerEventsHandler.Merchant.getEntityId(), merchantrecipelist);
            }
        }
        if (par1GuiButton.id == 5) {
            ItemStack item1 = this.inventorySlots.getSlot(0).getStack();
            ItemStack item2 = this.inventorySlots.getSlot(1).getStack();
            ItemStack sold = this.inventorySlots.getSlot(2).getStack();
            if (item1 == null && item2 != null) {
                item1 = item2;
                item2 = null;
            }
            if (item1 != null && sold != null) {
                item1 = item1.copy();
                sold = sold.copy();
                if (item2 != null) {
                    item2 = item2.copy();
                }
                final MerchantRecipe recipe = new MerchantRecipe(item1, item2, sold);
                recipe.func_82783_a(2147483639);
                final MerchantRecipeList merchantrecipelist2 = this.theIMerchant.getRecipes((EntityPlayer)mc.thePlayer);
                merchantrecipelist2.add((Object)recipe);
                Client.sendData(EnumPacketServer.MerchantUpdate, ServerEventsHandler.Merchant.getEntityId(), merchantrecipelist2);
            }
        }
        if (flag) {
            ((ContainerMerchantAdd)this.inventorySlots).setCurrentRecipeIndex(this.currentRecipeIndex);
            final ByteBuf bytebuf = Unpooled.buffer();
            try {
                bytebuf.writeInt(this.currentRecipeIndex);
                this.mc.getNetHandler().addToSendQueue((Packet)new C17PacketCustomPayload("MC|TrSel", bytebuf));
            }
            catch (Exception exception) {}
            finally {
                bytebuf.release();
            }
        }
    }
    
    protected void drawGuiContainerBackgroundLayer(final float par1, final int par2, final int par3) {
        final Minecraft mc = Minecraft.getMinecraft();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        mc.getTextureManager().bindTexture(GuiMerchantAdd.merchantGuiTextures);
        final int k = (this.width - this.xSize) / 2;
        final int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        final MerchantRecipeList merchantrecipelist = this.theIMerchant.getRecipes((EntityPlayer)mc.thePlayer);
        if (merchantrecipelist != null && !merchantrecipelist.isEmpty()) {
            final int i1 = this.currentRecipeIndex;
            final MerchantRecipe merchantrecipe = (MerchantRecipe)merchantrecipelist.get(i1);
            if (merchantrecipe.isRecipeDisabled()) {
                mc.getTextureManager().bindTexture(GuiMerchantAdd.merchantGuiTextures);
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                GL11.glDisable(2896);
                this.drawTexturedModalRect(this.guiLeft + 83, this.guiTop + 21, 212, 0, 28, 21);
                this.drawTexturedModalRect(this.guiLeft + 83, this.guiTop + 51, 212, 0, 28, 21);
            }
        }
    }
    
    public void drawScreen(final int par1, final int par2, final float par3) {
        super.drawScreen(par1, par2, par3);
        final Minecraft mc = Minecraft.getMinecraft();
        final MerchantRecipeList merchantrecipelist = this.theIMerchant.getRecipes((EntityPlayer)mc.thePlayer);
        if (merchantrecipelist != null && !merchantrecipelist.isEmpty()) {
            final int k = (this.width - this.xSize) / 2;
            final int l = (this.height - this.ySize) / 2;
            final int i1 = this.currentRecipeIndex;
            final MerchantRecipe merchantrecipe = (MerchantRecipe)merchantrecipelist.get(i1);
            GL11.glPushMatrix();
            final ItemStack itemstack = merchantrecipe.getItemToBuy();
            final ItemStack itemstack2 = merchantrecipe.getSecondItemToBuy();
            final ItemStack itemstack3 = merchantrecipe.getItemToSell();
            RenderHelper.enableGUIStandardItemLighting();
            GL11.glDisable(2896);
            GL11.glEnable(32826);
            GL11.glEnable(2903);
            GL11.glEnable(2896);
            GuiMerchantAdd.itemRender.zLevel = 100.0f;
            GuiMerchantAdd.itemRender.renderItemAndEffectIntoGUI(this.fontRendererObj, mc.getTextureManager(), itemstack, k + 36, l + 24);
            GuiMerchantAdd.itemRender.renderItemOverlayIntoGUI(this.fontRendererObj, mc.getTextureManager(), itemstack, k + 36, l + 24);
            if (itemstack2 != null) {
                GuiMerchantAdd.itemRender.renderItemAndEffectIntoGUI(this.fontRendererObj, mc.getTextureManager(), itemstack2, k + 62, l + 24);
                GuiMerchantAdd.itemRender.renderItemOverlayIntoGUI(this.fontRendererObj, mc.getTextureManager(), itemstack2, k + 62, l + 24);
            }
            GuiMerchantAdd.itemRender.renderItemAndEffectIntoGUI(this.fontRendererObj, mc.getTextureManager(), itemstack3, k + 120, l + 24);
            GuiMerchantAdd.itemRender.renderItemOverlayIntoGUI(this.fontRendererObj, mc.getTextureManager(), itemstack3, k + 120, l + 24);
            GuiMerchantAdd.itemRender.zLevel = 0.0f;
            GL11.glDisable(2896);
            if (this.func_146978_c(36, 24, 16, 16, par1, par2)) {
                this.renderToolTip(itemstack, par1, par2);
            }
            else if (itemstack2 != null && this.func_146978_c(62, 24, 16, 16, par1, par2)) {
                this.renderToolTip(itemstack2, par1, par2);
            }
            else if (this.func_146978_c(120, 24, 16, 16, par1, par2)) {
                this.renderToolTip(itemstack3, par1, par2);
            }
            GL11.glPopMatrix();
            GL11.glEnable(2896);
            GL11.glEnable(2929);
            RenderHelper.enableStandardItemLighting();
        }
    }
    
    public IMerchant getIMerchant() {
        return this.theIMerchant;
    }
    
    static ResourceLocation func_110417_h() {
        return GuiMerchantAdd.merchantGuiTextures;
    }
    
    static {
        merchantGuiTextures = new ResourceLocation("textures/gui/container/villager.png");
    }
    
    @SideOnly(Side.CLIENT)
    static class MerchantButton extends GuiButton
    {
        private final boolean field_146157_o;
        private static final String __OBFID = "CL_00000763";
        
        public MerchantButton(final int par1, final int par2, final int par3, final boolean par4) {
            super(par1, par2, par3, 12, 19, "");
            this.field_146157_o = par4;
        }
        
        public void drawButton(final Minecraft p_146112_1_, final int p_146112_2_, final int p_146112_3_) {
            if (this.visible) {
                p_146112_1_.getTextureManager().bindTexture(GuiMerchantAdd.merchantGuiTextures);
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                final boolean flag = p_146112_2_ >= this.xPosition && p_146112_3_ >= this.yPosition && p_146112_2_ < this.xPosition + this.width && p_146112_3_ < this.yPosition + this.height;
                int k = 0;
                int l = 176;
                if (!this.enabled) {
                    l += this.width * 2;
                }
                else if (flag) {
                    l += this.width;
                }
                if (!this.field_146157_o) {
                    k += this.height;
                }
                this.drawTexturedModalRect(this.xPosition, this.yPosition, l, k, this.width, this.height);
            }
        }
    }
}

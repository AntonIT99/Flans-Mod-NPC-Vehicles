// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import noppes.npcs.CustomItems;
import net.minecraft.item.ItemStack;
import noppes.npcs.controllers.RecipeCarpentry;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S2FPacketSetSlot;
import net.minecraft.entity.player.EntityPlayerMP;
import noppes.npcs.controllers.RecipeController;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Container;

public class ContainerCarpentryBench extends Container
{
    public InventoryCrafting craftMatrix;
    public IInventory craftResult;
    private EntityPlayer player;
    private World worldObj;
    private int posX;
    private int posY;
    private int posZ;
    
    public ContainerCarpentryBench(final InventoryPlayer par1InventoryPlayer, final World par2World, final int par3, final int par4, final int par5) {
        this.craftMatrix = new InventoryCrafting((Container)this, 4, 4);
        this.craftResult = (IInventory)new InventoryCraftResult();
        this.worldObj = par2World;
        this.posX = par3;
        this.posY = par4;
        this.posZ = par5;
        this.player = par1InventoryPlayer.player;
        this.addSlotToContainer((Slot)new SlotCrafting(par1InventoryPlayer.player, (IInventory)this.craftMatrix, this.craftResult, 0, 133, 41));
        for (int var6 = 0; var6 < 4; ++var6) {
            for (int var7 = 0; var7 < 4; ++var7) {
                this.addSlotToContainer(new Slot((IInventory)this.craftMatrix, var7 + var6 * 4, 17 + var7 * 18, 14 + var6 * 18));
            }
        }
        for (int var6 = 0; var6 < 3; ++var6) {
            for (int var7 = 0; var7 < 9; ++var7) {
                this.addSlotToContainer(new Slot((IInventory)par1InventoryPlayer, var7 + var6 * 9 + 9, 8 + var7 * 18, 98 + var6 * 18));
            }
        }
        for (int var6 = 0; var6 < 9; ++var6) {
            this.addSlotToContainer(new Slot((IInventory)par1InventoryPlayer, var6, 8 + var6 * 18, 156));
        }
        this.onCraftMatrixChanged((IInventory)this.craftMatrix);
    }
    
    public int getMetadata() {
        return this.worldObj.getBlockMetadata(this.posX, this.posY, this.posZ);
    }
    
    public void onCraftMatrixChanged(final IInventory par1IInventory) {
        if (!this.worldObj.isRemote) {
            final RecipeCarpentry recipe = RecipeController.instance.findMatchingRecipe(this.craftMatrix);
            ItemStack item = null;
            if (recipe != null && recipe.availability.isAvailable(this.player)) {
                item = recipe.getCraftingResult(this.craftMatrix);
            }
            this.craftResult.setInventorySlotContents(0, item);
            final EntityPlayerMP plmp = (EntityPlayerMP)this.player;
            plmp.playerNetServerHandler.sendPacket((Packet)new S2FPacketSetSlot(this.windowId, 0, item));
        }
    }
    
    public void onContainerClosed(final EntityPlayer par1EntityPlayer) {
        super.onContainerClosed(par1EntityPlayer);
        if (!this.worldObj.isRemote) {
            for (int var2 = 0; var2 < 16; ++var2) {
                final ItemStack var3 = this.craftMatrix.getStackInSlotOnClosing(var2);
                if (var3 != null) {
                    par1EntityPlayer.dropPlayerItemWithRandomChoice(var3, false);
                }
            }
        }
    }
    
    public boolean canInteractWith(final EntityPlayer par1EntityPlayer) {
        return this.worldObj.getBlock(this.posX, this.posY, this.posZ) == CustomItems.carpentyBench && par1EntityPlayer.getDistanceSq(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5) <= 64.0;
    }
    
    public ItemStack transferStackInSlot(final EntityPlayer par1EntityPlayer, final int par1) {
        ItemStack var2 = null;
        final Slot var3 = (Slot) this.inventorySlots.get(par1);
        if (var3 != null && var3.getHasStack()) {
            final ItemStack var4 = var3.getStack();
            var2 = var4.copy();
            if (par1 == 0) {
                if (!this.mergeItemStack(var4, 17, 53, true)) {
                    return null;
                }
                var3.onSlotChange(var4, var2);
            }
            else if (par1 >= 17 && par1 < 44) {
                if (!this.mergeItemStack(var4, 44, 53, false)) {
                    return null;
                }
            }
            else if (par1 >= 44 && par1 < 53) {
                if (!this.mergeItemStack(var4, 17, 44, false)) {
                    return null;
                }
            }
            else if (!this.mergeItemStack(var4, 17, 53, false)) {
                return null;
            }
            if (var4.stackSize == 0) {
                var3.putStack((ItemStack)null);
            }
            else {
                var3.onSlotChanged();
            }
            if (var4.stackSize == var2.stackSize) {
                return null;
            }
            var3.onPickupFromSlot(par1EntityPlayer, var4);
        }
        return var2;
    }
}

package com.hfr.inventory.container;

import com.hfr.tileentity.machine.TileEntityDieselGen;
import com.hfr.util.LockedSlot;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerDieselGen extends Container {

	private TileEntityDieselGen diFurnace;

	public ContainerDieselGen(InventoryPlayer invPlayer, TileEntityDieselGen tedf) {

		diFurnace = tedf;
		
		//Fuel
		this.addSlotToContainer(new Slot(tedf, 0, 26, 17));
		//Canister
		this.addSlotToContainer(new LockedSlot(tedf, 1, 26, 53));
		//Battery
		this.addSlotToContainer(new Slot(tedf, 2, 134, 35));

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}

		for (int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 142));
		}
	}

	@Override
	public void addCraftingToCrafters(ICrafting crafting) {
		super.addCraftingToCrafters(crafting);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int par2) {
		ItemStack var3 = null;
		Slot var4 = (Slot) this.inventorySlots.get(par2);

		if (var4 != null && var4.getHasStack()) {
			ItemStack var5 = var4.getStack();
			var3 = var5.copy();

			if (par2 <= 2) {
				if (!this.mergeItemStack(var5, 3, this.inventorySlots.size(), true)) {
					return null;
				}
			} else {
				if (!this.mergeItemStack(var5, 0, 1, false))
					if (!this.mergeItemStack(var5, 2, 3, false))
						return null;
			}

			if (var5.stackSize == 0) {
				var4.putStack((ItemStack) null);
			} else {
				var4.onSlotChanged();
			}
		}

		return var3;
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return diFurnace.isUseableByPlayer(player);
	}
}

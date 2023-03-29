package com.flansmod.common.driveables.mechas;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGrenade;
import com.flansmod.common.parts.ItemPart;

public class SlotMechaInventory extends Slot 
{
	int slotd = 0;
	MechaType mechatype;
	public SlotMechaInventory(IInventory inv, int e, int x, int y, MechaType type) 
	{
		super(inv, e, x, y);
		slotd = e;
		mechatype = type;
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		if (stack == null || stack.getItem() == null)
			return true;
		if (!mechatype.restrictInventoryInput)
			return true;

		Item item = stack.getItem();
		return ((item instanceof ItemPart) && ((ItemPart) item).type.fuel > 0) || 
		item instanceof ItemBullet || item instanceof ItemGrenade || 
		(item instanceof ItemMechaAddon && mechatype.allowMechaToolsInRestrictedInv);
	}
	
	@Override
    public void putStack(ItemStack stack)
    {
		// This isnt' very safe, it's standard to check if the item is valid or not here. It works, though.
        inventory.setInventorySlotContents(slotd, stack);
        onSlotChanged();
	}

}

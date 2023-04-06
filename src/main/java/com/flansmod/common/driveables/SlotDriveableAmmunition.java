package com.flansmod.common.driveables;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGrenade;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.mechas.ItemMecha;
//stolen from golden sloth
public class SlotDriveableAmmunition extends Slot 
{
	int slotd = 0;
	boolean restrictInput = false;
	public SlotDriveableAmmunition(IInventory inv, int e, int x, int y, boolean filterInput) 
	{
		super(inv, e, x, y);
		slotd = e;
		restrictInput = filterInput;
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		if (stack == null || stack.getItem() == null)
			return true;

		Item item = stack.getItem();
			
		//labjac attempt to ban vehicle matrioshka
		if ((item instanceof ItemVehicle) || (item instanceof ItemPlane) || (item instanceof ItemMecha) )
			return false;
		

		if (!restrictInput)
			return true;
		
		FlansMod.log("E %b", item instanceof ItemBullet || item instanceof ItemGrenade);
		return item instanceof ItemBullet || item instanceof ItemGrenade;
		
	}
	
	@Override
    public void putStack(ItemStack stack)
    {
		if (!isItemValid(stack)) {
			return;
		}
        inventory.setInventorySlotContents(slotd, stack);
        onSlotChanged();
	}

}
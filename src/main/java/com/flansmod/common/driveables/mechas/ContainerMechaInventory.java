package com.flansmod.common.driveables.mechas;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ContainerMechaInventory extends Container 
{
	public InventoryPlayer inventory;
    public World world;
	public EntityMecha mecha;
	public int numItems;
	public int maxScroll;
	public int scroll;
	public MechaType type;
	
	public ContainerMechaInventory(InventoryPlayer inv, World w, EntityMecha em)
	{
		inventory = inv;
		world = w;
		mecha = em;
		type = (MechaType)mecha.getDriveableType();
		numItems = mecha.getDriveableType().numCargoSlots;
		int numRows = ((numItems + 7) / 8);
		maxScroll = (numRows > 3 ? numRows - 3 : 0);
		
		int startSlot = mecha.driveableData.getCargoInventoryStart();

		for(int row = 0; row < numRows; row++)
		{
			int yPos = -1000;
			if(row < 3 + scroll && row >= scroll)
				yPos = 25 + 19 * (row - scroll);
			for(int col = 0; col < ((row + scroll + 1) * 8 <= numItems ? 8 : numItems % 8); col++)
			{
				addSlotToContainer(new SlotMechaInventory(mecha.driveableData, startSlot + row * 8 + col, 186 + 18 * col, yPos, type));
			}
		}
		
		//Equipment Slots
		addSlotToContainer(new SlotMecha(mecha.inventory, EnumMechaSlotType.legs, 84, 128));
		addSlotToContainer(new SlotMecha(mecha.inventory, EnumMechaSlotType.hips, 60, 128));
		addSlotToContainer(new SlotMecha(mecha.inventory, EnumMechaSlotType.leftArm, 36, 80));
		addSlotToContainer(new SlotMecha(mecha.inventory, EnumMechaSlotType.leftTool, 36, 56));
		addSlotToContainer(new SlotMecha(mecha.inventory, EnumMechaSlotType.leftShoulder, 60, 32));
		addSlotToContainer(new SlotMecha(mecha.inventory, EnumMechaSlotType.head, 84, 32));
		addSlotToContainer(new SlotMecha(mecha.inventory, EnumMechaSlotType.feet, 108, 128));
		addSlotToContainer(new SlotMecha(mecha.inventory, EnumMechaSlotType.rightArm, 132, 80));
		addSlotToContainer(new SlotMecha(mecha.inventory, EnumMechaSlotType.rightTool, 132, 56));
		addSlotToContainer(new SlotMecha(mecha.inventory, EnumMechaSlotType.rightShoulder, 108, 32));
		
		//Upgrade Slots
		
		addSlotToContainer(new SlotMecha(mecha.inventory, EnumMechaSlotType.u1, 10, 32));
		addSlotToContainer(new SlotMecha(mecha.inventory, EnumMechaSlotType.u2, 10, 56));
		addSlotToContainer(new SlotMecha(mecha.inventory, EnumMechaSlotType.u3, 10, 80));
		addSlotToContainer(new SlotMecha(mecha.inventory, EnumMechaSlotType.u4, 10, 104));
		addSlotToContainer(new SlotMecha(mecha.inventory, EnumMechaSlotType.u5, 10, 128));

		
		//Main inventory slots
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 9; col++)
            {
            	addSlotToContainer(new Slot(inventory, col + row * 9 + 9, 182 + col * 18, 98 + row * 18));
            }

        }
		//Quickbar slots
        for(int col = 0; col < 9; col++)
        {
        	addSlotToContainer(new Slot(inventory, col, 182 + col * 18, 156));
        }
	}
	
	@Override
    public void onContainerClosed(EntityPlayer par1EntityPlayer)
    {
    	super.onContainerClosed(par1EntityPlayer);
    	mecha.couldNotFindFuel = false;
    }

	public void updateScroll(int scrololol)
	{
		scroll = scrololol;
		int m = ((numItems + 7) / 8);
		for(int row = 0; row < m; row++)
		{
			int yPos = -1000;
			if(row < 3 + scroll && row >= scroll)
				yPos = 25 + 19 * (row - scroll);
			for(int col = 0; col < ((row + 1) * 8 < numItems ? 8 : numItems % 8); col++)
			{
				((Slot)inventorySlots.get(row * 8 + col)).yDisplayPosition = yPos;
			}
		}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) 
	{
		return true;
	}
	
	@Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotID)
    {
		ItemStack stack = null;
        Slot currentSlot = (Slot)inventorySlots.get(slotID);
        if(currentSlot != null && currentSlot.getHasStack())
        {
            ItemStack slotStack = currentSlot.getStack();
            stack = slotStack.copy();
         
            ///if(stack.getItem() instanceof ItemMechaAddon)
           // {
            	//((ItemMechaAddon)stack.getItem()).type;
			//}
			
			// From player inventory to mecha inventory
            if(slotID >= numItems)
            {
            	if(!mergeItemStack(slotStack, 0, numItems, false))
            	{
					return null;
				}
			}
			// From mecha inventory to player inventory
            else {
            	if(!mergeItemStack(slotStack, numItems, inventorySlots.size(), true))
            	{
					return null;
            	}
            }

            if (slotStack.stackSize == 0)
            {
				currentSlot.putStack(null);
            }
            else
            {
				currentSlot.onSlotChanged();
            }

            if (slotStack.stackSize == stack.stackSize)
            {
				return null;	
            }

            currentSlot.onPickupFromSlot(player, slotStack);
        }

        return stack;
	}
	

	// Code modified from https://www.minecraftforge.net/forum/topic/34525-18-solved-attempt-to-fix-mergeitemstack-isnt-working/
	@Override
	protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
		boolean flag = false;
		int i = startIndex;
		if (reverseDirection)
			i = endIndex - 1;
		
		if (stack.isStackable()) {
			while (stack.stackSize > 0 && (!reverseDirection && i < endIndex || reverseDirection && i >= startIndex)) {
				Slot slot = (Slot) this.inventorySlots.get(i);
				ItemStack itemstack = slot.getStack();
				int maxLimit = Math.min(stack.getMaxStackSize(), slot.getSlotStackLimit());
				
				if (itemstack != null && ItemStack.areItemStacksEqual(stack, itemstack)) {
					int j = itemstack.stackSize + stack.stackSize;
					if (j <= maxLimit) {
						stack.stackSize = 0;
						itemstack.stackSize = j;
						slot.onSlotChanged();
						flag = true;
						
					} else if (itemstack.stackSize < maxLimit) {
						stack.stackSize = maxLimit;
						itemstack.stackSize = maxLimit;
						slot.onSlotChanged();
						flag = true;
					}
				}
				if (reverseDirection) { 
					--i;
				} else
					++i;
			}
		}
		if (stack.stackSize > 0) {
			if (reverseDirection) {
				i = endIndex - 1;
			}else i = startIndex;

			while (!reverseDirection && i < endIndex || reverseDirection && i >= startIndex) {
				Slot slot1 = (Slot)this.inventorySlots.get(i);
				ItemStack itemstack1 = slot1.getStack();

				if (itemstack1 == null && slot1.isItemValid(stack)) {
					if(stack.stackSize <= slot1.getSlotStackLimit()) {
						slot1.putStack(stack.copy());
						slot1.onSlotChanged();
						stack.stackSize = 0;
						flag = true;
						break;
					} else {
						itemstack1 = stack.copy();
						stack.stackSize -= slot1.getSlotStackLimit();
						itemstack1.stackSize = slot1.getSlotStackLimit();
						slot1.putStack(itemstack1);
						slot1.onSlotChanged();
						flag = true;
					}					
				}
				if (reverseDirection) {
					--i;
				} else ++i;
			}
		}
		return flag;
	}
}


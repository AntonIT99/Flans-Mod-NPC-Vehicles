package com.flansmod.common.guns;

import java.util.ArrayList;

import com.flansmod.client.FlansModClient;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/** Adds access to the InventoryPlayer stack combination methods for arbitrary inventories */
public class InventoryHelper 
{
	/*
	 * For driveables that don't combine ammo or need to force items in upper inventory
	 */
	public static boolean addItemStackToInventory(IInventory inventory, ItemStack stack, boolean creative) {
		return addItemStackToInventory(inventory, stack, creative, false, false);
	}
	
	public static boolean addItemStackToInventory(IInventory inventory, ItemStack stack, boolean creative, boolean combineAmmo, boolean putInUpperInventory) {
		if (stack == null) {
            return false;
        } else if (stack.stackSize == 0) {
            return false;
        } else {
            try {
                int invSlot;

                if(combineAmmo) {
	                int numberBulletsLeft = stack.getMaxDamage()-stack.getItemDamage();
	                
	            	for(int i = 0; i < inventory.getSizeInventory()-4; i++) {
	            		ItemStack is = inventory.getStackInSlot(i);
	            		if(is == null || !is.isItemDamaged() || is.getItem() != stack.getItem()) continue;
	            		
	            		int itemDamageDiff = is.getItemDamage()-numberBulletsLeft;
	            		if(itemDamageDiff >= 0) {
	            			is.setItemDamage(itemDamageDiff);
	            			return true;
	            		} else {
	            			is.setItemDamage(0);      
	            			
	            			//try to combine the newly filled up ammo with existing ammo
	            			for(int j = 0; j < inventory.getSizeInventory()-4; j++) {
	            				ItemStack possibleStackToCombineWith = inventory.getStackInSlot(j);
	            				if(possibleStackToCombineWith == null || j == i || possibleStackToCombineWith.isItemDamaged() 
	            						|| possibleStackToCombineWith.getItem() != is.getItem()) continue;
	            				
	            				if(possibleStackToCombineWith.getMaxStackSize()-possibleStackToCombineWith.stackSize >= is.stackSize) {
	            					possibleStackToCombineWith.stackSize += is.stackSize;
	            					inventory.setInventorySlotContents(i, null);
	            					break;
	            				}
	            			}
	            			
	            			numberBulletsLeft = -itemDamageDiff;
	            			stack.setItemDamage(stack.getMaxDamage()-numberBulletsLeft);
	            		}               		
	            	}
                }
                
                //If the item still has durability, try to place it in the inventory
                if (stack.isItemDamaged()) {
                	//Get the index for the first empty inventory slot
                	invSlot = getFirstEmptyStack(inventory, putInUpperInventory);                	
                    
                    if (invSlot >= 0) {
                    	ItemStack stackToAdd = ItemStack.copyItemStack(stack);
                    	stackToAdd.animationsToGo = 5;
                    	inventory.setInventorySlotContents(invSlot, stackToAdd);
                        stack.stackSize = 0;
                        return true;
                    } else if (creative) {
                        stack.stackSize = 0;
                        return true;
                    }

                    //If theres nowhere to place it in inventory, returning false will cause it to be dropped
                    return false;

                } else {
                    do {                    	
                        invSlot = stack.stackSize;
                        stack.stackSize = storePartialItemStack(inventory, stack, putInUpperInventory);
                    } while (stack.stackSize > 0 && stack.stackSize < invSlot);
                	
                    if (stack.stackSize == invSlot && creative) {
                    	stack.stackSize = 0;    
                        return true;
                    } else {
                        return stack.stackSize < invSlot;
                    }
                }
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                return false;
            }
        }
	}
	
	public static int storeItemStack(IInventory inventory, ItemStack stack) {

        for (int i = 0; i < inventory.getSizeInventory(); ++i) {
        	ItemStack oldStack = inventory.getStackInSlot(i);
            if (oldStack != null
                    && oldStack.getItem() == stack.getItem()
                    && oldStack.isStackable()
                    && oldStack.stackSize < oldStack.getMaxStackSize()
                    && oldStack.stackSize < inventory.getInventoryStackLimit()
                    && (!oldStack.getHasSubtypes() || oldStack.getItemDamage() == stack.getItemDamage())
                    && ItemStack.areItemStackTagsEqual(oldStack, stack))
            {
                return i;
            }
        }

        return -1;
    }
	
    public static int storePartialItemStack(IInventory inventory, ItemStack stack, boolean putInUpperInventory) {

        Item item = stack.getItem();
        int j = stack.stackSize;
        int k;

        //If the item doesn't stack, just find an empty slot for it
        if (stack.getMaxStackSize() == 1)
        {
            k = getFirstEmptyStack(inventory, putInUpperInventory);
            //If it is impossible, return
            if (k < 0) {
                return j;
            } else {
                if (inventory.getStackInSlot(k) == null) {
                    inventory.setInventorySlotContents(k, ItemStack.copyItemStack(stack));
                }

                return 0;
            }
        } else {
            k = storeItemStack(inventory, stack);
            if (k < 0) {
                k = getFirstEmptyStack(inventory, putInUpperInventory);
            }

            if (k >= 0) {
                ItemStack oldStack = inventory.getStackInSlot(k);

                if (oldStack == null) {
                    oldStack = new ItemStack(item, 0, stack.getItemDamage());
                    if (stack.hasTagCompound()) {
                        oldStack.setTagCompound((NBTTagCompound) stack.getTagCompound().copy());
                    }
                    inventory.setInventorySlotContents(k, oldStack);
                } 

                int l = j;
                
                if (j > oldStack.getMaxStackSize() - oldStack.stackSize) {
                    l = oldStack.getMaxStackSize() - oldStack.stackSize;
                }

                if (l > inventory.getInventoryStackLimit() - oldStack.stackSize) {
                    l = inventory.getInventoryStackLimit() - oldStack.stackSize;
                }

                if (l != 0) {
                    j -= l;
                    oldStack.stackSize += l;
                    oldStack.animationsToGo = 5;
                }
            }
            return j;
        }
    }
	
	/** Method from InventoryPlayer */
    public static int getFirstEmptyStack(IInventory inventory, boolean putInUpperInventory) {
        /* Subtract 4 from inventory slots to stop mags going into armor slots
        * I did it this way to potentially play better with anything that expands inventory?
        * */
    	int firstEmpty = -1;
    	
        for(int i = 0; i < (inventory.getSizeInventory() - 4); i++) {
            if(inventory.getStackInSlot(i) == null) {
            	if(putInUpperInventory && i < 9) {
            		if(firstEmpty == -1) firstEmpty = i;
            	} else 
            		return i;
            }
        }
        
        return firstEmpty;
    }

	public static void dropInventoryItems(World worldIn, int x, int y, int z, IInventory tileentity) 
	{
		
	}
	
}

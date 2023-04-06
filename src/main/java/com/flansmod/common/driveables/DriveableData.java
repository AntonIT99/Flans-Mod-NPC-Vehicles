package com.flansmod.common.driveables;

import java.util.HashMap;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;

public class DriveableData implements IInventory
{
	/** The name of this driveable's type */
	public String type;
	/** The sizes of each inventory (guns, bombs / mines, missiles / shells, cargo) */
	public int numGuns, numBombs, numMissiles, numCargo;
	/** The inventory stacks */
	public ItemStack[] ammo, bombs, missiles, cargo;
	/** The engine in this driveable */
	public PartType engine;
	/** The stack in the fuel slot */
	public ItemStack fuel;
	/** The amount of fuel in the tank */
	public float fuelInTank;
	public float depth;
	public int totalCrew = 1;
	public int notFlooding = 1;	
	public int notFloodingMax = 1;	
	public int maximumCrew = 1;
	public float fakeReloadShell;
	public float fakeReloadMissile;
	
	public int overheat = 0;
	public int overheatSuffer = 0;
    //epic ship timer for sinking usage
    public int sinkingTimer=0;
    public int sinkLimit=400;
    public int repairingTimer=0;
    public int repairLimit=40;
	/** Each driveable part has a small class that holds its current status */
	public HashMap<EnumDriveablePart, DriveablePart> parts;
	
	public boolean inventoryChanged = false;
	
	

	public String puppy;
	
	//elephant system
	public int morale = 1;
	public int panicTimer = 0;
	
	//plane brakes
	public int landBrake = 0;
	
	
	/** Paintjob index */
	public int paintjobID;
	public int thermalTimer = 0;
	public int scopeTimer=0;
	
	//seatbelt
	public String seatBelt = "null";
	
	//NEW seatwarp limit
	public int WarpLimit = 1; //NEW
	
	//antiradiation
	//public boolean activeRadar = true;
	
	//for sucking people back into plane
	public boolean emergencyMode = false;
	
	//for flying near a carrier
	public int carrierTip = 0;
	
	//for carrier catapult
	public int catapult = 0;

	
	public DriveableData(NBTTagCompound tags, int paintjobID)
	{
		this(tags);
		this.paintjobID = paintjobID;
	}
	
	public DriveableData(NBTTagCompound tags)
	{
		parts = new HashMap<EnumDriveablePart, DriveablePart>();
		readFromNBT(tags);
	}

	public void readFromNBT(NBTTagCompound tag)
    {
		if(tag == null)
			return;
    	if(!tag.hasKey("Type"))
    		return;
    	
		type = tag.getString("Type");
		DriveableType dType = DriveableType.getDriveable(type);
		
		numBombs = dType.numBombSlots;
		numCargo = dType.numCargoSlots;
		numMissiles = dType.numMissileSlots;
		numGuns = dType.ammoSlots();
		engine = PartType.getPart(tag.getString("Engine"));
		paintjobID = tag.getInteger("Paint");
		ammo = new ItemStack[numGuns];
		bombs = new ItemStack[numBombs];
		missiles = new ItemStack[numMissiles];
		cargo = new ItemStack[numCargo];
		for(int i = 0; i < numGuns; i++)
			ammo[i] = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Ammo " + i));
		
		for(int i = 0; i < numBombs; i++)
			bombs[i] = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Bombs " + i));

		for(int i = 0; i < numMissiles; i++)
			missiles[i] = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Missiles " + i));

 		for(int i = 0; i < numCargo; i++)
			cargo[i] = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Cargo " + i));

		fuel = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Fuel"));
		fuelInTank = tag.getInteger("FuelInTank");
		
		
		for(EnumDriveablePart part : EnumDriveablePart.values())
		{
			parts.put(part, new DriveablePart(part, dType.health.get(part)));
			parts.put(part, new DriveablePart(part, dType.crew.get(part)));
		}
		for(DriveablePart part : parts.values())
		{
			part.readFromNBT(tag);
		}
		
		
		if(!tag.hasKey("seatBelt"))
		{
			seatBelt = "null";
			return;
		}
		seatBelt = tag.getString("seatBelt");
		
		this.emergencyMode = tag.getBoolean("emergencyMode");
		this.seatBelt = tag.getString("seatBelt");
		
		if(!tag.hasKey("WarpLimiterino")) //NEW
		{
			this.WarpLimit = dType.numPassengers;
		//	System.out.println("nbt warplimit read initial: " + dType.numPassengers);
		}
		else
		{
			this.WarpLimit = tag.getInteger("WarpLimiterino");
			//System.out.println("nbt warplimit read: " + tag.getInteger("WarpLimit"));
		}
		
		
	//	this.activeRadar = tag.getBoolean("activeRadar");
	//	System.out.println("its reading from nbt");
		//System.out.println("nbt activeradar read: " + this.activeRadar);
		//puppy = tag.getString("puppy");
    }

    public void writeToNBT(NBTTagCompound tag)
    {
		
    	tag.setString("Type", type);
		tag.setString("Engine", engine.shortName);
		tag.setInteger("Paint", paintjobID);
		for(int i = 0; i < ammo.length; i++)
		{
			if(ammo[i] != null)
				tag.setTag("Ammo " + i, ammo[i].writeToNBT(new NBTTagCompound()));
		}
		for(int i = 0; i < bombs.length; i++)
		{
			if(bombs[i] != null)
				tag.setTag("Bombs " + i, bombs[i].writeToNBT(new NBTTagCompound()));
		}
		for(int i = 0; i < missiles.length; i++)
		{
			if(missiles[i] != null)
				tag.setTag("Missiles " + i, missiles[i].writeToNBT(new NBTTagCompound()));
		}
		for(int i = 0; i < cargo.length; i++)
		{
			if(cargo[i] != null)
				tag.setTag("Cargo " + i, cargo[i].writeToNBT(new NBTTagCompound()));
		}
		if(fuel != null)
			tag.setTag("Fuel", fuel.writeToNBT(new NBTTagCompound()));
		tag.setInteger("FuelInTank", (int)fuelInTank);
		for(DriveablePart part : parts.values())
		{
			part.writeToNBT(tag);
		}
		
		//tag.setString("puppy", puppy);
		tag.setBoolean("emergencyMode", this.emergencyMode);
		tag.setString("seatBelt", this.seatBelt);
	//	tag.setBoolean("activeRadar", this.activeRadar);
		//System.out.println("its writing from nbt");
		//System.out.println("nbt seatbelt write: " + tag.getString("seatBelt"));
		
		tag.setInteger("WarpLimiterino", this.WarpLimit); //NEW
    }
	
	@Override
	public int getSizeInventory() 
	{ 
		return getFuelSlot() + 1; 
	}

    @Override
	public ItemStack getStackInSlot(int i) 
	{ 
		//Find the correct inventory
		ItemStack[] inv = ammo;
		if(i >= ammo.length)
		{
			i -= ammo.length;
			inv = bombs;
			if(i >= bombs.length)
			{
				i -= bombs.length;
				inv = missiles;
				if(i >= missiles.length)
				{
					i -= missiles.length;
					inv = cargo;
					if(i >= cargo.length)
					{
						return fuel;
					}
				}
			}	
		}
		//Return the stack in the slot
		return inv[i];
	}

    @Override
	public ItemStack decrStackSize(int i, int j) 
	{
//    	FlansMod.log("decr Slot:"+i + ":  "+j);
    	
		//Find the correct inventory
		ItemStack[] inv = ammo;
		if(i >= ammo.length)
		{
			i -= ammo.length;
			inv = bombs;
			if(i >= bombs.length)
			{
				i -= bombs.length;
				inv = missiles;
				if(i >= missiles.length)
				{
					i -= missiles.length;
					inv = cargo;
					if(i >= cargo.length)
					{
						//Put the fuel stack in a stack array just to simplify the code
						i -= cargo.length;
						inv = new ItemStack[1];
						inv[0] = fuel;		
	
						setInventorySlotContents(getFuelSlot(), null);
					}
				}
			}	
		}
		//Decrease the stack size
		if(inv[i] != null)
        {
            if(inv[i].stackSize <= j)
            {
                ItemStack itemstack = inv[i];
                inv[i] = null;
                return itemstack;
            }
            ItemStack itemstack1 = inv[i].splitStack(j);
            if(inv[i].stackSize <= 0)
            {
                inv[i] = null;
            }
            return itemstack1;
        } else
        {
            return null;
        }
		
	}

    @Override
	public ItemStack getStackInSlotOnClosing(int i) 
	{ 
		return getStackInSlot(i);	
	}

    @Override
	public void setInventorySlotContents(int i, ItemStack stack) 
	{ 
		if(stack!=null)
		{
			inventoryChanged = true;
//			FlansMod.log("Slot:"+i + ":  "+stack.getDisplayName()+" ("+stack.stackSize+"");
		}
		else
		{
//			FlansMod.log("Slot:"+i + ":  null");
		}
		
		//Find the correct inventory
		ItemStack[] inv = ammo;
		if(i >= ammo.length)
		{
			i -= ammo.length;
			inv = bombs;
			if(i >= bombs.length)
			{
				i -= bombs.length;
				inv = missiles;
				if(i >= missiles.length)
				{
					i -= missiles.length;
					inv = cargo;
					if(i >= cargo.length)
					{
						fuel = stack;
						return;
					}
				}
			}	
		}
		//Set the stack
		inv[i] = stack;
	}

    @Override
	public String getInventoryName() 
	{ 
		return "Flan's Secret Data"; 
	}

    @Override
	public int getInventoryStackLimit() 
	{ 
		return 64; 
	}

    @Override
	public void markDirty() {}

    @Override
	public boolean isUseableByPlayer(EntityPlayer player) 
	{ 
		return true; 
	}

	@Override
	public void openInventory() {}

	@Override
	public void closeInventory() {}
	
	public int getAmmoInventoryStart()
	{
		return 0;
	}
	
	public int getBombInventoryStart()
	{
		return ammo.length;
	}	
	
	public int getMissileInventoryStart()
	{
		return ammo.length + bombs.length;
	}	
	
	public int getCargoInventoryStart()
	{
		return ammo.length + bombs.length + missiles.length; 
	}
	
	public int getFuelSlot()
	{
		return ammo.length + bombs.length + missiles.length + cargo.length;
	}

	@Override
	public boolean hasCustomInventoryName() 
	{
		return false;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) 
	{
		if(i < getBombInventoryStart() && itemstack != null && itemstack.getItem() instanceof ItemBullet) //Ammo
		{
			return true;
		}		
		if(i >= getBombInventoryStart() && i < getMissileInventoryStart() && itemstack != null && itemstack.getItem() instanceof ItemBullet) //Ammo
		{
			return true;
		}
		if(i >= getMissileInventoryStart() && i < getCargoInventoryStart() && itemstack != null && itemstack.getItem() instanceof ItemBullet)
		{
			return true;
		}
		if(i >= getCargoInventoryStart() && i < getFuelSlot())
		{
			return true;
		}
		if(i == getFuelSlot() && itemstack != null && itemstack.getItem() instanceof ItemPart && ((ItemPart)itemstack.getItem()).type.category == 9) //Fuel
		{
			return true;
		}

		return false;
	}
}

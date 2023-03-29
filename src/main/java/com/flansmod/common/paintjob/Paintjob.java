package com.flansmod.common.paintjob;

import net.minecraft.item.ItemStack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Paintjob 
{
	public int ID;
	public String displayName;
	public String iconName;
	public String textureName;
	public ItemStack[] dyesNeeded;
	public Boolean addToTables;
	
	public Paintjob(int id, String iconName, String textureName, ItemStack[] dyesNeeded, boolean addToTables)
	{
		this(id, "", iconName, textureName, dyesNeeded, addToTables);
	}

	public Paintjob(int id, String displayName, String iconName, String textureName, ItemStack[] dyesNeeded, boolean addToTables)
	{
		this.ID = id;
		this.displayName = displayName;
		this.iconName = iconName;
		this.textureName = textureName;
		this.dyesNeeded = dyesNeeded;
		this.addToTables = addToTables;
	}
}

package com.flansmod.common.paintjob;

import java.util.ArrayList;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public abstract class PaintableType extends InfoType
{
	//Paintjobs
	/** The list of all available paintjobs for this gun */
	public ArrayList<Paintjob> paintjobs = new ArrayList<>();
	/** The default paintjob for this gun. This is created automatically in the load process from existing info */
	public Paintjob defaultPaintjob;
	/** Whether to add this paintjob to the paintjob table, gunmode table e.t.c. */
	public Boolean addAnyPaintjobToTables = true;
	/** Assigns IDs to paintjobs */
	private int nextPaintjobID = 1;

	public PaintableType(TypeFile file)
	{
		super(file);
	}

	@Override
	public void preRead(TypeFile file)
	{
	
	}
	
	@Override
	public void postRead(TypeFile file)
	{		
		//After all lines have been read, set up the default paintjob
		defaultPaintjob = new Paintjob(0, "default", iconPath, texture, new ItemStack[0], true);
		//Move to a new list to ensure that the default paintjob is always first
		ArrayList<Paintjob> newPaintjobList = new ArrayList<>();
		newPaintjobList.add(defaultPaintjob);
		newPaintjobList.addAll(paintjobs);
		paintjobs = newPaintjobList;
	}
	
	/** Pack reader */
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			//Paintjobs
			if(split[0].equalsIgnoreCase("paintjob"))
			{
				ItemStack[] dyeStacks = new ItemStack[(split.length - 3) / 2];
				for(int i = 0; i < (split.length - 3) / 2; i++)
					dyeStacks[i] = new ItemStack(Items.dye, Integer.parseInt(split[i * 2 + 4]), getDyeDamageValue(split[i * 2 + 3]));
				
				//if(split[1].contains("_"))
				//{
				//	String[] splat = split[1].split("_");
				//	if(splat[0].equals(iconPath))
				//		split[1] = splat[1];
				//}
				paintjobs.add(new Paintjob(nextPaintjobID++, split[1], split[2], dyeStacks, true));
			}

		} 
		catch (Exception e)
		{
			FlansMod.log("Reading paintable file failed : " + shortName);
			if (FlansMod.printStackTrace) {
				e.printStackTrace();
			}
		}
		try
		{
			//Paintjobs
			if(split[0].equalsIgnoreCase("advpaintjob"))
			{
				ItemStack[] dyeStacks = new ItemStack[(split.length - 4) / 2];
				for(int i = 0; i < (split.length - 4) / 2; i++)
					dyeStacks[i] = new ItemStack(Items.dye, Integer.parseInt(split[i * 2 + 5]), getDyeDamageValue(split[i * 2 + 4]));
				paintjobs.add(new Paintjob(nextPaintjobID++, split[1], split[2], split[3], dyeStacks, true));
			}
		} 
		catch (Exception e)
		{
			FlansMod.log("Reading file failed : " + shortName);
			e.printStackTrace();
		}

		try
		{
			// Other configs..
			if (split[0].equalsIgnoreCase("AddPaintableToTables"))
			{
				if (split.length == 2)
				{
					addAnyPaintjobToTables = Boolean.parseBoolean(split[1]);
				}
				else if (split.length == 3)
				{
					String paintjobId = split[1];

					for (Paintjob paintjob : paintjobs)
					{
						if (paintjob.textureName.equals(paintjobId))
						{
							paintjob.addToTables = Boolean.parseBoolean(split[2]);
						}
					}
				}
			}
		}
		catch (Exception e)
		{
			FlansMod.log("Reading file failed : " + shortName);
			e.printStackTrace();
		}
	}
	
	public Paintjob getPaintjob(int i)
	{
		// This needs to be fixed properly, see https://trello.com/c/c8ssBecf
		// Basically, invalid paintjob ID gets saved (ie the original removed from packs), and crashes when trying to load it
		if (i >= paintjobs.size()) {
			return defaultPaintjob;
		}

		return paintjobs.get(i);
	}

	public float GetRecommendedScale()
	{
		return 50.0f;
	}
}
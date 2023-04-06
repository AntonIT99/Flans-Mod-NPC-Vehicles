package com.flansmod.common.driveables;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockPumpkin;
import net.minecraft.block.BlockSponge;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMapBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.flansmod.common.FlansMod;
import com.flansmod.common.paintjob.IPaintableItem;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;
import com.google.common.collect.Multimap;
import com.hfr.faction.Factions;
import com.hfr.faction.IFaction;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVehicle extends ItemMapBase implements IPaintableItem
{
	public VehicleType type;

	
	public IIcon[] icons;

    public ItemVehicle(VehicleType type1){
        maxStackSize = 1;
		type = type1;
		type.item = this;
		setCreativeTab(FlansMod.tabFlanDriveables);
		GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
    }

	@Override
	/** Make sure client and server side NBTtags update */
	public boolean getShareTag()
	{
		return true;
	}

	private NBTTagCompound getTagCompound(ItemStack stack, World world)
	{
		if(stack.stackTagCompound == null)
		{
			if(!world.isRemote)
				stack.stackTagCompound = getOldTagCompound(stack, world);
			if(stack.stackTagCompound == null)
			{
				stack.stackTagCompound = new NBTTagCompound();
				stack.stackTagCompound.setString("Type", type.shortName);
				stack.stackTagCompound.setString("Engine", PartType.defaultEngines.get(EnumType.vehicle).shortName);
			}
		}
		return stack.stackTagCompound;
	}

	private NBTTagCompound getOldTagCompound(ItemStack stack, World world){
		File file1 = world.getSaveHandler().getMapFileFromName("vehicle_" + stack.getItemDamage());
		try(FileInputStream fileinputstream = new FileInputStream(file1)){
	        NBTTagCompound tags = CompressedStreamTools.readCompressed(fileinputstream).getCompoundTag("data");
	    	for(EnumDriveablePart part : EnumDriveablePart.values())
	    	{
	    		tags.setInteger(part.getShortName() + "_Health", type.health.get(part) == null ? 0 : type.health.get(part).health);
	    		tags.setInteger(part.getShortName() + "_Crew", type.crew.get(part) == null ? 0 : type.crew.get(part).crew);
	    		tags.setBoolean(part.getShortName() + "_Fire", false);
	    	}
	        return tags;
		} catch(IOException e) {
			FlansMod.log("Failed to read old vehicle file");
			e.printStackTrace();
			return null;
		}
    }



    @Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer){
    	//Raytracing
        float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
        float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
        float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329F);
        float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329F);
        double length = 5D;
        Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62D - entityplayer.yOffset, entityplayer.posZ);
        Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
        MovingObjectPosition movingobjectposition = world.rayTraceBlocks(posVec, lookVec, type.placeableOnWater);

        //Result check
        if(movingobjectposition == null){
            return itemstack;
        }
        if(movingobjectposition.typeOfHit == MovingObjectType.BLOCK){
            int i = movingobjectposition.blockX;
            int j = movingobjectposition.blockY;
            int k = movingobjectposition.blockZ;
            Block block = world.getBlock(i, j, k);
            IFaction owner = Factions.getFactionFromPlayer(entityplayer);
            if(type.placeableOnLand || block instanceof BlockLiquid){
	            if(!world.isRemote){
	            	Entity e = new EntityVehicle(world, (double)i + 0.5F, (double)j + 2.5F, (double)k + 0.5F, entityplayer, type, getData(itemstack, world)).setOwner(owner);
	            	if(owner != null && type.transport)
	            		owner.addTransportVehicle(e, entityplayer.getDisplayName());
					world.spawnEntityInWorld(e);
	            }
				if(!entityplayer.capabilities.isCreativeMode){
					itemstack.stackSize--;
				}
            }
            if(!type.placeableOnLand && type.placeableOnSponge && block instanceof BlockSponge){
            	if(!world.isRemote){
            		Entity e = new EntityVehicle(world, (double)i + 0.5F, (double)j + 2.5F, (double)k + 0.5F, entityplayer, type, getData(itemstack, world)).setOwner(owner);
            		if(owner != null && type.transport)
	            		owner.addTransportVehicle(e, entityplayer.getDisplayName());
					world.spawnEntityInWorld(e);
	            }
				if(!entityplayer.capabilities.isCreativeMode){
					itemstack.stackSize--;
				}
            }
            if(!type.placeableOnLand && type.placeableOnPumpkin && block instanceof BlockPumpkin){
            	if(!world.isRemote){
            		Entity e = new EntityVehicle(world, (double)i + 0.5F, (double)j + 2.5F, (double)k + 0.5F, entityplayer, type, getData(itemstack, world)).setOwner(owner);
            		if(owner != null && type.transport)
	            		owner.addTransportVehicle(e, entityplayer.getDisplayName());
					world.spawnEntityInWorld(e);
	            }
				if(!entityplayer.capabilities.isCreativeMode){
					itemstack.stackSize--;
				}
            }
        }
        return itemstack;
    }

    public Entity spawnVehicle(World world, double x, double y, double z, ItemStack stack){
    	Entity entity = new EntityVehicle(world, x, y, z, type, getData(stack, world));
    	if(!world.isRemote){
			world.spawnEntityInWorld(entity);
        }
    	return entity;
    }
    
    public Entity spawnVehicleAngled(World world, double x, double y, double z, float yaw, ItemStack stack){
    	Entity entity = new EntityVehicle(world, x, y, z, yaw, type, getData(stack, world));
    	if(!world.isRemote){
			world.spawnEntityInWorld(entity);
        }
    	return entity;
    }

	public DriveableData getData(ItemStack itemstack, World world){
		return new DriveableData(getTagCompound(itemstack, world), itemstack.getItemDamage());
    }

    @Override
	@SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2){
    	return type.colour;
    }
    
	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean advancedTooltips)
	{
		if( !type.getPaintjob(stack.getItemDamage()).displayName.equals("default") )
			lines.add("\u00a7b\u00a7o" + type.getPaintjob(stack.getItemDamage()).displayName);

		if(!type.packName.isEmpty())
		{
			lines.add("\u00a7o" + type.packName);
		}
		if(type.description != null)
		{
            Collections.addAll(lines, type.description.split("_"));
		}

		lines.add("");
		NBTTagCompound tags = getTagCompound(stack, player.worldObj);
		PartType engine = PartType.getPart(tags.getString("Engine"));
		if(engine != null)
			lines.add("\u00a79Engine" + "\u00a77: " + engine.name);
		
		if(type.transport) //NEW
		{
			lines.add("\u00A72Can Disembark Infantry");
			//lines.add("\u00A76Available Warps: " + getData(stack, player.worldObj).WarpLimit + " / " + type.numPassengers + " seats");
		}
		
		if(type.canMountEntity)
		{
			//lines.add("\u00A72Can Disembark Infantry");
			lines.add("\u00A76Can be Warped with Disembarking Infantry ");
		}
		
		if(type.weightLimit != 5000)
		{
			lines.add("\u00A76Carrier aircraft weight limit: " + type.weightLimit + "kg");
		}
		
		if(type.epicShip)
		{
			lines.add("\u00A72Uses A.dvanced S.hip S.ystem TM");
		}
	}
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon)
    {
    	icons = new IIcon[type.paintjobs.size()];
    	
        itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    	for(int i = 0; i < type.paintjobs.size(); i++)
    	{
    		icons[i] = icon.registerIcon("FlansMod:" + type.paintjobs.get(i).iconName);
    	}
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconIndex(ItemStack stack)
    {
        return icons[stack.getItemDamage()];
    }
    


    /** Make sure that creatively spawned planes have nbt data */
    @Override
    public void getSubItems(Item item, CreativeTabs tabs, List list)
    {
    	ItemStack planeStack = new ItemStack(item, 1, 0);
    	NBTTagCompound tags = new NBTTagCompound();
    	tags.setString("Type", type.shortName);
    	if(PartType.defaultEngines.containsKey(EnumType.vehicle))
    		tags.setString("Engine", PartType.defaultEngines.get(EnumType.vehicle).shortName);
    	for(EnumDriveablePart part : EnumDriveablePart.values())
    	{
    		tags.setInteger(part.getShortName() + "_Health", type.health.get(part) == null ? 0 : type.health.get(part).health);
    		tags.setInteger(part.getShortName() + "_Crew", type.crew.get(part) == null ? 0 : type.crew.get(part).crew);
    		tags.setBoolean(part.getShortName() + "_Fire", false);
    	}
    	planeStack.stackTagCompound = tags;
        list.add(planeStack);
    }

	@Override
	public InfoType getInfoType()
	{
		return type;
	}

	@Override
	public PaintableType GetPaintableType() 
	{
		return type;
	}
}

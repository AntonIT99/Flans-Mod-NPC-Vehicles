package com.flansmod.common.driveables.mechas;

import java.util.Collections;
import java.util.List;

import com.flansmod.common.teams.TeamsManager;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.paintjob.IPaintableItem;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.sync.Sync;

public class ItemMecha extends Item implements IPaintableItem
{
	public MechaType type;

	public IIcon[] icons;
	
	public ItemMecha(MechaType type1)
	{
		maxStackSize = 1;
		type = type1;
		type.item = this;
		setCreativeTab(FlansMod.tabFlanMechas);
		GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b)
	{
		if(!type.packName.isEmpty() && FlansMod.showPackNameInItemDescriptions)
		{
			lines.add(type.packName);
		}
		if(type.description != null)
		{
            Collections.addAll(lines, type.description.split("_"));
		}
		NBTTagCompound tags = getTagCompound(stack, player.worldObj);
		String engineName = tags.getString("Engine");
		PartType part = PartType.getPart(engineName);
		if(part != null)
			lines.add(part.name);
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
			stack.stackTagCompound = new NBTTagCompound();
			stack.stackTagCompound.setString("Type", type.shortName);
			stack.stackTagCompound.setString("Engine", PartType.defaultEngines.get(EnumType.mecha).shortName);
		}
		return stack.stackTagCompound;
	}
	
    @Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
		if (!(TeamsManager.survivalCanPlaceVehicles || entityplayer.capabilities.isCreativeMode)) {
			// player isn't allowed to place vehicles.
			return itemstack;
		}
    	//Raytracing
        float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
        float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
        float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329F);
        float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329F);
        double length = 5D;
        Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62D - entityplayer.yOffset, entityplayer.posZ);        
        Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
        MovingObjectPosition movingobjectposition = world.rayTraceBlocks(posVec, lookVec, true);
        
        //Result check
        if(movingobjectposition == null)
        {
            return itemstack;
        }
        if(movingobjectposition.typeOfHit == MovingObjectType.BLOCK)
        {
            int i = movingobjectposition.blockX;
            int j = movingobjectposition.blockY;
            int k = movingobjectposition.blockZ;
            if(!world.isRemote)
            {
            	EntityMecha mecha = new EntityMecha(world, (double)i + 0.5F, (double)j + 1.5F + type.yOffset, (double)k + 0.5F, entityplayer, type, getData(itemstack, world), getTagCompound(itemstack, world));
				FlansMod.log("Player %s placed mecha %s (%d) at (%d, %d, %d)", entityplayer.getDisplayName(), type.shortName, mecha.getEntityId(), i, j, k);
				world.spawnEntityInWorld(mecha);
            }
			if(!entityplayer.capabilities.isCreativeMode)
			{	
				itemstack.stackSize--;
			}
        }
        return itemstack;
    }
	
    public DriveableData getData(ItemStack itemstack, World world)
    {
		return new DriveableData(getTagCompound(itemstack, world), itemstack.getItemDamage());
    }
   
    @Override
	@SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return type.colour;
    }
	
    @Override
    public void getSubItems(Item item, CreativeTabs tabs, List list)
    {
    	ItemStack mechaStack = new ItemStack(item, 1, 0);
    	NBTTagCompound tags = new NBTTagCompound();
    	tags.setString("Type", type.shortName);
    	if(PartType.defaultEngines.containsKey(EnumType.mecha))
    		tags.setString("Engine", PartType.defaultEngines.get(EnumType.mecha).shortName);
    	for(EnumDriveablePart part : EnumDriveablePart.values())
    	{
    		tags.setFloat(part.getShortName() + "_Health", type.health.get(part) == null ? 0 : type.health.get(part).health);
    		tags.setBoolean(part.getShortName() + "_Fire", false);
    	}
    	mechaStack.stackTagCompound = tags;
        list.add(mechaStack);
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

	@SideOnly(Side.CLIENT)
	public IIcon getIconIndex(ItemStack stack)
	{
		try {
			if (stack.getItemDamage() < icons.length) {
				return icons[stack.getItemDamage()];
			} else {
				return icons[0];
			}
		} catch (NullPointerException e) {
			return null;
		}
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

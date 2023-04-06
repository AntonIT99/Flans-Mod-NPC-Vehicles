package com.flansmod.common.guns;

import java.util.Collections;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;

/** Implemented from old source. */
public class ItemBullet extends ItemShootable implements IFlanItem
{
	@SuppressWarnings("hiding")
	public BulletType type;
	
	public ItemBullet(BulletType infoType)
	{
		super(infoType);
		type = infoType;
		setMaxStackSize(type.maxStackSize);
		setHasSubtypes(true);
		type.item = this;
		switch(type.weaponType)
		{
		case SHELL : case BOMB : case MINE : case MISSILE : setCreativeTab(FlansMod.tabFlanDriveables); break;
		default : setCreativeTab(FlansMod.tabFlanGuns);
		}
	}

	public boolean isRepairable()
	{
		return canRepair;
	}

    @SideOnly(Side.CLIENT)
    @Override
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return type.colour;
    }
        
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) 
    {
    	itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    }
    
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b)
	{
		
		KeyBinding shift = Minecraft.getMinecraft().gameSettings.keyBindSneak;
		
		if(!type.packName.isEmpty())
		{
			lines.add(type.packName);
		}
		if(type.description != null)
		{
            Collections.addAll(lines, type.description.split("_"));
		}
		if(type.roundsPerItem > 1)
			lines.add("\u00A76Rounds" + "\u00a77: " + (float)(type.roundsPerItem));
		if(type.damageVsLiving > 1)
			lines.add("\u00A76Soft Target Damage" + "\u00a77: " + (float)(type.damageVsLiving));
		if(type.damageVsVehicles > 1)
			lines.add("\u00A76Hard Target Damage" + "\u00a77: " + (float)(type.damageVsVehicles));
		if(type.damageVsPlanes > 1)
			lines.add("\u00A76Air Target Damage" + "\u00a77: " + (float)(type.damageVsVehicles));
		if(type.bodyarmorPen != 500)
			lines.add("\u00a72Body Armor Penetration" + "\u00a77: " + (float)(type.bodyarmorPen));
		if(type.armorPen>2f)
			lines.add("\u00a72Tank Armor Penetration" + "\u00a77: " + (float)(type.armorPen) + " mm");
		if(type.HEAT)
			lines.add("Has Shaped-Charge (Weak Against Composite armor)");
		
		if(!GameSettings.isKeyDown(shift) && type.dynamicBulletDelay < 8999) //check if dynamic system is being used
		{


			lines.add("Hold \u00a7b\u00a7o" + GameSettings.getKeyDisplayString(shift.getKeyCode()) + "\u00a7r\u00a77 for long range details");
		}
		else if (type.dynamicBulletDelay < 8999)
		{
			lines.add("");
			lines.add("\u00a7oLong-Range Performance: ");
			
			 //now display bullet's damage if not zero
			lines.add("\u00A76Soft-Target Damage" + "\u00a77: " + type.dynamicDamage);
			lines.add("\u00a72Body Armor Penetration" + "\u00a77: " + type.dynamicBodyarmorPen);
					

		}
		
	}

	//Can be overriden to allow new types of bullets to be created, for planes
	public EntityShootable getEntity(World worldObj, Vec3 origin, float yaw,
			float pitch, double motionX, double motionY, double motionZ,
			EntityLivingBase shooter,float gunDamage, int itemDamage, InfoType shotFrom) 
	{
		return new EntityBullet(worldObj, origin, yaw, pitch, motionX, motionY, motionZ, shooter, gunDamage, this.type, shotFrom);
	}

	//Can be overriden to allow new types of bullets to be created, vector constructor
	public EntityShootable getEntity(World worldObj, Vector3f origin, Vector3f direction,
			EntityLivingBase shooter, float spread, float damage, float speed, int itemDamage, InfoType shotFrom)
	{
		return new EntityBullet(worldObj, origin, direction, shooter, spread, damage, this.type, speed, shotFrom);
	}
	
	
	//evil golem bullet constructor
	public EntityShootable getEntity(World worldObj, Vector3f origin, Vector3f direction,
			EntityLivingBase shooter, float spread, float damage, float speed, int itemDamage, InfoType shotFrom, Boolean ai)
	{
		if(ai == false)
		return new EntityBullet(worldObj, origin, direction, shooter, spread, damage, this.type, speed, shotFrom, ai);
		else
			return new EntityBullet(worldObj, origin, direction, shooter, spread, damage, this.type, speed, shotFrom, ai);
	}

	//Can be overriden to allow new types of bullets to be created, AA/MG constructor
	public EntityShootable getEntity(World worldObj, Vec3 origin, float yaw,
			float pitch, EntityLivingBase shooter, float spread, float damage,
			int itemDamage, InfoType shotFrom) 
	{
		return new EntityBullet(worldObj, origin, yaw, pitch, shooter, spread, damage, this.type, shotFrom);
	}

	/* before fucking with it with origin offset
	public EntityShootable getEntity(World worldObj, EntityLivingBase player,
			float bulletSpread, float damage, float bulletSpeed, boolean b,
			int itemDamage, InfoType shotFrom) 
	*/
	
	//Can be overriden to allow new types of bullets to be created, Handheld constructor
	public EntityShootable getEntity(World worldObj, EntityLivingBase player,
			float bulletSpread, float damage, float bulletSpeed, boolean b,
			int itemDamage, InfoType shotFrom, float Xoffset, float Yoffset, float Zoffset) 
	{
		//before i added origin offset return new EntityBullet(worldObj, player, bulletSpread, damage, this.type, bulletSpeed, b, shotFrom);
		return new EntityBullet(worldObj, player, bulletSpread, damage, this.type, bulletSpeed, b, shotFrom, Xoffset, Yoffset, Zoffset);
	}
	
	@Override
	public InfoType getInfoType() 
	{
		return type;
	}
//shitty one so placeable mg code will stop fucking out
	public Entity getEntity(World worldObj, EntityLivingBase player, float bulletSpread, float damage,
			float bulletSpeed, boolean b, int itemDamage, GunType type2, javax.vecmath.Vector3f vector3f) {
		return null;
	}
}
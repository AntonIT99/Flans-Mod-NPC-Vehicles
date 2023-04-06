package com.flansmod.common.teams;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;
import com.google.common.collect.Multimap;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemTeamArmour extends ItemArmor implements ISpecialArmor, IFlanItem
{
	public ArmourType type;
	protected static final UUID[] uuid = new UUID[] { UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID() };
	public int timer=0;
	public int SoundTimer=0;
	public int rechargeTimer=0;
	public float secretBody=0;
	public float secretArm=0;
	public float secretNape=0;
	public float secretHead=0;
	public float secretFace=0;
	public float secretLeg=0;
	public double secretBack=0;
	public float pouchMultiplier=1;
	public boolean hasPouch = false;
	
	
	//bariserinos - these are the ones you can access easily within each armor
	public boolean hasFrontMount = false;
	public float frontMountY1 = 1f;
	public float frontMountZ1 = 1f;
	public float frontMountY2 = 1f;
	public float frontMountZ2 = 1f;
	public float frontMountRotation = 1f;
	
	//bariserinos 2
	boolean hasTopMount = false;
	float topMountY = 1f;
	float topMountZ = 1f;
	float topMountRotation = 1f;

	public ItemTeamArmour(ArmourType t)
	{
		super(ItemArmor.ArmorMaterial.CLOTH, 0, t.type);
		type = t;
		type.item = this;
		setCreativeTab(FlansMod.tabFlanTeams);
		if(t.durability > 0) setMaxDamage(t.durability);
		GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
	}

	public ItemTeamArmour(ItemArmor.ArmorMaterial armorMaterial, int renderIndex, int armourType)
	{
		super(armorMaterial, renderIndex, armourType);
	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot)
	{
		secretBody=type.bodyArmor;
		secretHead=type.headArmor;
		secretNape=type.napeArmor;
		secretFace=type.faceArmor;
		secretArm=type.armArmor;
		secretLeg=type.legArmor;
		secretBack=type.backArmor;
		pouchMultiplier=type.pouchMultiplier;
		hasPouch=type.hasPouch;
		
		//bariserinos - this is to overwrite the values with config stuff
		hasFrontMount = type.hasFrontMount;
		frontMountY1 = type.frontMountY1;
		frontMountZ1 = type.frontMountZ1;
		frontMountY2 = type.frontMountY2;
		frontMountZ2 = type.frontMountZ2;
		frontMountRotation = type.frontMountRotation;
		
		hasTopMount = type.hasTopMount;
		topMountY = type.topMountY;
		topMountZ = type.topMountZ;
		topMountRotation = type.topMountRotation;
		

		
	//xdd no armor if energy shield out of energy
		if(armor.getItemDamage() >= type.durability && type.energyShield==true)
			return new ArmorProperties(1, type.backupDefence, 900);
		//return new ArmorProperties(1, type.backupDefence, 269);
		else if(armor.getItemDamage() < type.durability && type.energyShield==true)
			return new ArmorProperties(1, type.defence, 900);
		//return new ArmorProperties(1, type.defence, 269);
		else
			//return new ArmorProperties(1, type.defence, Integer.MAX_VALUE);
			return new ArmorProperties(1, type.defence, 900);
		//return new ArmorProperties(1, type.defence, 269); //labjac forbidden technique
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot)
	{
		return (int)(type.defence * 20);
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot)
	{
		//Do nothing to the armour. It should not break as that would leave the player's team ambiguous - sorry sweetie its back
		
        super.setDamage(stack, (int) (stack.getItemDamage() + 1 + (int)((float)damage)/2f) );
        //if hit, you must wait for energy shield to recharge
        if(type.energyShield && entity instanceof EntityPlayer)
        {
        	EntityPlayer player = (EntityPlayer)entity;
        	PlayerHandler.getPlayerData(player).shieldTimer=type.rechargeTimer;
        }
        //effects for shield taking damage
        if(type.energyShield && stack.getItemDamage()<type.durability)
        {
        	PacketPlaySound.sendSoundPacket(entity.posX, entity.posY, entity.posZ, 5, entity.dimension, type.ShieldHit, true);
        	FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(entity.posX, entity.posY, entity.posZ, 25, "crit"), entity.posX, entity.posY, entity.posZ, 100, entity.dimension);
        	 if(entity instanceof EntityPlayer)	//for visual shield
        	 {
        		 EntityPlayer player = (EntityPlayer)entity;
        		 PlayerHandler.getPlayerData(player).shieldHit=10; //data that the hitboxes will read
        		
        	 }
        }
        if(type.energyShield && stack.getItemDamage()==type.durability)
        {
        	PacketPlaySound.sendSoundPacket(entity.posX, entity.posY, entity.posZ, 5, entity.dimension, type.ShieldKill, true);
        	FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(entity.posX, entity.posY, entity.posZ, 75, "fireworksSpark"), entity.posX, entity.posY, entity.posZ, 150, entity.dimension);
        }
		if(stack.getItemDamage() >= type.durability && type.energyShield==false)
			stack.stackSize--;
	}

	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String s)
	{
		return "flansmod:armor/" + type.armourTextureName + "_" + (type.type == 2 ? "2" : "1") + ".png";
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b)
	{
		if(!type.packName.isEmpty())
		{
			lines.add(type.packName);
		}
		if(type.description != null)
		{
            Collections.addAll(lines, type.description.split("_"));
		}
		lines.add("Defense: " + (float)(10*type.defence) + " bars");
	
		if(type.headArmor>1f && !type.energyShield)
			lines.add("\u00a72Head protection: " + (float)(type.headArmor));
		if(type.faceArmor>1f && !type.energyShield)
			lines.add("\u00a72Face protection: " + (float)(type.faceArmor));
		if(type.bodyArmor>1f && !type.energyShield)
			lines.add("\u00a72Front Chest protection: " + (float)(type.bodyArmor));
		if(type.backArmor>1f && !type.energyShield)
			lines.add("\u00a72Back Chest protection: " + (float)(type.backArmor));
		if(type.armArmor>1f && !type.energyShield)
			lines.add("\u00a72Arm protection: " + (float)(type.armArmor));
		if(type.legArmor>1f && !type.energyShield)
			lines.add("\u00a72Leg protection: " + (float)(type.legArmor));
		if(type.napeArmor>1f && !type.energyShield)
			lines.add("\u00a72Nape protection: " + (float)(type.napeArmor));

		//if force field
		if(type.headArmor>1f && type.energyShield)
			lines.add("\u00a72Head protection: " + (float)(secretHead));
		if(type.faceArmor>1f && type.energyShield)
			lines.add("\u00a72Face protection: " + (float)(secretFace));
		if(type.bodyArmor>1f && type.energyShield)
			lines.add("\u00a72Front Chest protection: " + (float)(secretBody));
		if(type.backArmor>1f && type.energyShield)
			lines.add("\u00a72Back Chest protection: " + (float)(secretBack));
		if(type.armArmor>1f && type.energyShield)
			lines.add("\u00a72Arm protection: " + (float)(secretArm));
		if(type.legArmor>1f && type.energyShield)
			lines.add("\u00a72Leg protection: " + (float)(secretLeg));
		if(type.napeArmor>1f && type.energyShield)
			lines.add("\u00a72Leg protection: " + (float)(secretNape));

		
		if(type.durability>101f)
			lines.add("\u00a72Max Durability: " + (float)(type.durability));
		if(Math.abs(type.jumpModifier - 1F) > 0.01F)
			lines.add("\u00a73+" + (int)((type.jumpModifier - 1F) * 100F) + "% Jump Height");
		if(type.smokeProtection)
			lines.add("\u00a72+Smoke Protection");
		if(type.nightVision)
			lines.add("\u00a72+Night Vision");
		if(type.invisible)
			lines.add("\u00a72+Invisiblity");
		if(type.negateFallDamage)
			lines.add("\u00a72+Negates Fall Damage");
		if(type.submarine)
			lines.add("\u00a72+Allows Underwater Breathing");
		if(type.playermodel)
			lines.add("\u00a72+Custom Player Model");
		if(type.regenerate)
			lines.add("\u00a72+Has Personal Energy Shield");
		if(type.hunger)
			lines.add("\u00A7c-Reduces Stamina");
		if(type.hasPouch && type.pouchMultiplier>1)
			lines.add("\u00A7c-Reload is " + (float)type.pouchMultiplier + "\u00A7c times slower");
		if(type.hasPouch && type.pouchMultiplier<=1)
			lines.add("\u00a72+Reload is " + (float)(1f/(float)type.pouchMultiplier) + "\u00a72 times faster");
		
		if(type.hasOldGunPouch && type.pouchMultiplier>1)
			lines.add("\u00A7c-Reload for old firearms is " + (float)type.pouchMultiplier + "\u00A7c times slower");
		if(type.hasOldGunPouch && type.pouchMultiplier<=1)
			lines.add("\u00a72+Reload for old firearms is " + (float)(1f/(float)type.pouchMultiplier) + "\u00a72 times faster");
		
		if(type.hasBowPouch && type.pouchMultiplier>1)
			lines.add("\u00A7c-Reload for bows is " + (float)type.pouchMultiplier + "\u00A7c times slower");
		if(type.hasBowPouch && type.pouchMultiplier<=1)
			lines.add("\u00a72+Reload for bows is " + (float)(1f/(float)type.pouchMultiplier) + "\u00a72 times faster");
		
		if(type.hasHeavyPouch && type.pouchMultiplier>1)
			lines.add("\u00A7c-Reload for heavy weapons is " + (float)type.pouchMultiplier + "\u00A7c times slower");
		if(type.hasHeavyPouch && type.pouchMultiplier<=1)
			lines.add("\u00a72+Reload for heavy weapons is " + (float)(1f/(float)type.pouchMultiplier) + "\u00a72 times faster");
		
		if(type.hasGunPouch && type.pouchMultiplier>1)
			lines.add("\u00A7c-Reload for repeating firearms is " + (float)type.pouchMultiplier + "\u00A7c times slower");
		if(type.hasGunPouch && type.pouchMultiplier<=1)
			lines.add("\u00a72+Reload for repeating firearms is " + (float)(1f/(float)type.pouchMultiplier) + "\u00a72 times faster");
		//labjac secret armor

			
	}

    @Override
	@SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	return type.colour;
    }

    @Override
	@SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses()
    {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon)
    {
    	itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    }

    @Override
    public Multimap getAttributeModifiers(ItemStack stack)
    {
       	Multimap map = super.getAttributeModifiers(stack);
       	map.put(SharedMonsterAttributes.knockbackResistance.getAttributeUnlocalizedName(), new AttributeModifier(uuid[type.type], "KnockbackResist", type.knockbackModifier, 0));
       	map.put(SharedMonsterAttributes.movementSpeed.getAttributeUnlocalizedName(), new AttributeModifier(uuid[type.type], "MovementSpeed", type.moveSpeedModifier - 1F, 2));
		          	map.put(SharedMonsterAttributes.movementSpeed.getAttributeUnlocalizedName(), new AttributeModifier(uuid[type.type], "hunger", type.moveSpeedModifier - 1F, 2));
       	return map;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot)
    {
        return type.model;
    }

	@Override
	public InfoType getInfoType()
	{
		return type;
	}
	
	
	
	


	@Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
		
		
		//halo energy shield recharge
		if(type.energyShield && itemStack.getItemDamage() > type.durability + 2) //prevent overflow of shield durability
			super.setDamage(itemStack, itemStack.getItemDamage() - 1);
		
		if(itemStack.getItemDamage()==0)
			PlayerHandler.getPlayerData(player).shieldTimer = type.rechargeTimer;
		if(itemStack.getItemDamage()>=0 && PlayerHandler.getPlayerData(player).shieldTimer > 0)
			PlayerHandler.getPlayerData(player).shieldTimer--;
		if(itemStack.getItemDamage()>=0 && PlayerHandler.getPlayerData(player).shieldTimer==0 && type.energyShield)
		{
			PlayerHandler.getPlayerData(player).rechargeTimer++;
			if(PlayerHandler.getPlayerData(player).rechargeTimer==type.rechargeDelay)
				PlayerHandler.getPlayerData(player).rechargeTimer=0;
			if(PlayerHandler.getPlayerData(player).rechargeTimer==1)
			super.setDamage(itemStack, itemStack.getItemDamage() - 1);
		}
		if(itemStack.getItemDamage()>=0 && PlayerHandler.getPlayerData(player).shieldTimer==1 && type.energyShield)
		{
			//good one
			PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, type.rechargeSound, true);
        	FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 100, "instantSpell"), player.posX, player.posY, player.posZ, 100, player.dimension);
		}
		
		if(itemStack.getItemDamage()<type.durability && type.energyShield)
			PlayerHandler.getPlayerData(player).SoundTimer=0;
		
		
		//bullshit method to disable bullet armor when durability down
		if(itemStack.getItemDamage()>=type.durability)
		{
		secretBody=type.ReserveBodyArmor;
		PlayerHandler.getPlayerData(player).SoundTimer++;
		if(PlayerHandler.getPlayerData(player).SoundTimer==type.warningSoundTimer)
			PlayerHandler.getPlayerData(player).SoundTimer=0;
		
if(PlayerHandler.getPlayerData(player).SoundTimer==1 && PlayerHandler.getPlayerData(player).shieldTimer>1)
		PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, type.warningSound, false);
		}
		else 	if(itemStack.getItemDamage()<type.durability)
			secretBody=type.bodyArmor;
		
		if(itemStack.getItemDamage()>=type.durability)
		{
		secretBack=type.ReserveBackArmor;
		}
		else 	if(itemStack.getItemDamage()<type.durability)
			secretBack=type.backArmor;
		
		if(itemStack.getItemDamage()>=type.durability)
		{
		secretHead=type.ReserveHeadArmor;
		}
		else 	if(itemStack.getItemDamage()<type.durability)
			secretHead=type.headArmor;
		
		if(itemStack.getItemDamage()>=type.durability)
		{
		secretNape=type.ReserveNapeArmor;
		}
		else 	if(itemStack.getItemDamage()<type.durability)
			secretNape=type.napeArmor;
		
		if(itemStack.getItemDamage()>=type.durability)
		{
		secretFace=type.ReserveFaceArmor;
		}
		else 	if(itemStack.getItemDamage()<type.durability)
			secretFace=type.faceArmor;
		
		if(itemStack.getItemDamage()>=type.durability)
		{
		secretArm=type.ReserveArmArmor;
		}
		else 	if(itemStack.getItemDamage()<type.durability)
			secretArm=type.armArmor;
		
		if(itemStack.getItemDamage()>=type.durability)
		{
		secretLeg=type.ReserveLegArmor;
		}
		else 	if(itemStack.getItemDamage()<type.durability)
			secretLeg=type.legArmor;
		
		
		if(type.nightVision && FlansMod.ticker % 25 == 0)
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250));
		if(type.invisible && FlansMod.ticker % 25 == 0)
		{
			player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 250));
			PlayerHandler.getPlayerData(player).invisArmor=true;
			//System.out.println("allahu ackbar blocking ticker" + isBlockingLeft);
		}
		if(type.invisible==false)
			PlayerHandler.getPlayerData(player).invisArmor=false;
		if(type.jumpModifier > 1.01F && FlansMod.ticker % 25 == 0)
			player.addPotionEffect(new PotionEffect(Potion.jump.id, 250, (int)((type.jumpModifier - 1F) * 2F), true));
					if(type.submarine && FlansMod.ticker % 25 == 0)
			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 250));
					if(type.playermodel && FlansMod.ticker % 25 == 0)
			player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 100));
					if(type.hunger && FlansMod.ticker % 25 == 0)
			player.addPotionEffect(new PotionEffect(Potion.hunger.id, 250));
								if(type.regenerate && FlansMod.ticker % 25 == 0)
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 250));
		if(type.negateFallDamage)
			player.fallDistance = 0F;
		if(type.onWaterWalking)
		{
			if(player.isInWater())
			{
				player.capabilities.allowFlying = true;
			}else{
				player.capabilities.isFlying = false;
			}
		}
    }
}

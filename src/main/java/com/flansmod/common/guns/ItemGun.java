package com.flansmod.common.guns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import com.flansmod.client.AimType;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.KeyInputHandler;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.raytracing.BulletHit;
import com.flansmod.common.guns.raytracing.EntityHit;
import com.flansmod.common.guns.raytracing.EnumHitboxType;
import com.flansmod.common.guns.raytracing.PlayerBulletHit;
import com.flansmod.common.guns.raytracing.PlayerHitbox;
import com.flansmod.common.guns.raytracing.PlayerSnapshot;
import com.flansmod.common.network.PacketBlockerino;
import com.flansmod.common.network.PacketBlood;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.network.PacketGunFire;
import com.flansmod.common.network.PacketGunRecoil;
import com.flansmod.common.network.PacketGunSpread;
import com.flansmod.common.network.PacketGunState;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketReload;
import com.flansmod.common.network.PacketSelectOffHandGun;
import com.flansmod.common.paintjob.IPaintableItem;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.teams.EntityFlag;
import com.flansmod.common.teams.EntityFlagpole;
import com.flansmod.common.teams.EntityGunItem;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;
import com.google.common.collect.Multimap;

//import net.minecraft.client.audio.PositionedSoundRecord; //for wallys client sounds
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.event.world.BlockEvent;


public class ItemGun extends Item implements IPaintableItem
{
	public static Random rand = new Random();
	public GunType type;
	public static boolean rightMouseHeld;
	private static boolean lastRightMouseHeld;
	private static boolean leftMouseHeld;
	private static boolean lastLeftMouseHeld;
	//mount and blade buttons
	public static boolean DHeld;
	private static boolean lastDHeld;
	public static boolean AHeld;
	private static boolean lastAHeld;
	public static boolean WHeld;
	private static boolean lastWHeld;
	public boolean blocking = false;

	//blocking system TM
	public boolean leftBlock = true;
	public boolean rightBlock = false;
	public boolean topBlock = false;
	public boolean bottomBlock = false;

	public static boolean crouching = false;
	public static boolean sprinting = false;
	public static boolean cringedBlockingCheckerClient = false;
	public static boolean mounted = false;
	public static boolean shooting = false;
	public int soundDelay;
	public int lockOnSoundDelay;
	public static boolean sliceCrossHair;
	public int impactX = 0;
	public int impactY = 0;
	public int impactZ = 0;
	public int fullHands = 0;

	public float bulletDamageInfo = 0;

	public float pouchMultiplier = 1f;

	//for sword free ammo
	public boolean madeAmmo = false;

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

	//public boolean sendPosToServer = false;

	public IIcon[] icons;
	public IIcon defaultIcon;
	private int poopenfarden = 1;

	public ItemGun(GunType gun)
	{
		maxStackSize = 1;
		type = gun;
		type.item = this;
		setHasSubtypes(true);
		setCreativeTab(FlansMod.tabFlanGuns);
		GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
	}

	@Override
	/** Make sure client and server side NBTtags update */
	public boolean getShareTag()
	{
		return true;
	}

	/** Get the bullet item stack stored in the gun's NBT data (the loaded magazine / bullets) */
	public ItemStack getBulletItemStack(ItemStack gun, int id)
	{
		//If the gun has no tags, give it some
		if(!gun.hasTagCompound())
		{
			gun.stackTagCompound = new NBTTagCompound();
			return null;
		}

		String s;
		if(type.getSecondaryFire(gun))
			s = "secondaryAmmo";
		else
			s = "ammo";

		//If the gun has no ammo tags, give it some
		if(!gun.stackTagCompound.hasKey(s))
		{
			NBTTagList ammoTagsList = new NBTTagList();
			for(int i = 0; i < type.getNumAmmoItemsInGun(gun); i++)
			{
				ammoTagsList.appendTag(new NBTTagCompound());
			}
			gun.stackTagCompound.setTag(s, ammoTagsList);
			return null;
		}
		//Take the list of ammo tags
		NBTTagList ammoTagsList = gun.stackTagCompound.getTagList(s, Constants.NBT.TAG_COMPOUND);
		//Get the specific ammo tags required
		NBTTagCompound ammoTags = ammoTagsList.getCompoundTagAt(id);
		return ItemStack.loadItemStackFromNBT(ammoTags);
	}

	/** Set the bullet item stack stored in the gun's NBT data (the loaded magazine / bullets) */
	public void setBulletItemStack(ItemStack gun, ItemStack bullet, int id)
	{
		//If the gun has no tags, give it some
		if(!gun.hasTagCompound())
		{
			gun.stackTagCompound = new NBTTagCompound();
		}

		String s;
		if(type.getSecondaryFire(gun))
			s = "secondaryAmmo";
		else
			s = "ammo";

		//If the gun has no ammo tags, give it some
		if(!gun.stackTagCompound.hasKey(s))
		{
			NBTTagList ammoTagsList = new NBTTagList();
			for(int i = 0; i < type.getNumAmmoItemsInGun(gun); i++)
			{
				ammoTagsList.appendTag(new NBTTagCompound());
			}
			gun.stackTagCompound.setTag(s, ammoTagsList);
		}
		//Take the list of ammo tags
		NBTTagList ammoTagsList = gun.stackTagCompound.getTagList(s, Constants.NBT.TAG_COMPOUND);
		//Get the specific ammo tags required
		NBTTagCompound ammoTags = ammoTagsList.getCompoundTagAt(id);
		//Represent empty slots by nulltypes
		if(bullet == null)
		{
			ammoTags = new NBTTagCompound();
		}
		//Set the tags to match the bullet stack
		bullet.writeToNBT(ammoTags);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean advancedTooltips)
	{
		KeyBinding shift = Minecraft.getMinecraft().gameSettings.keyBindSneak;

		if( !type.getPaintjob(stack.getItemDamage()).displayName.equals("default") )
			lines.add("\u00a7b\u00a7o" + type.getPaintjob(stack.getItemDamage()).displayName);

		//labjac armor medieval pen
		if(type.swordArmorPen>10f)
			lines.add("\u00a72+Body Armor Penetration: " + (float)(type.swordArmorPen));

		if(type.shieldDamageAbsorption>0.1f)
			lines.add("\u00a72+Shield Protection: " + (float)(type.shieldDamageAbsorption));


		if(!type.packName.isEmpty())
		{
			lines.add("\u00a7o" + type.packName);
		}
		if(type.description != null)
		{
			Collections.addAll(lines, type.description.split("_"));
		}
		//Reveal all the gun stats when holding down the sneak key
		if(!GameSettings.isKeyDown(shift))
		{
			//Show loaded ammo
			for(int i = 0; i < type.getNumAmmoItemsInGun(stack); i++)
			{
				ItemStack bulletStack = getBulletItemStack(stack, i);
				if(bulletStack != null && bulletStack.getItem() instanceof ItemBullet)
				{
					BulletType bulletType = ((ItemBullet)bulletStack.getItem()).type;
					String line = bulletType.name + " " + (bulletStack.getMaxDamage() - bulletStack.getItemDamage()) + "/" + bulletStack.getMaxDamage();
					lines.add(line);
				}
			}

			lines.add("Hold \u00a7b\u00a7o" + GameSettings.getKeyDisplayString(shift.getKeyCode()) + "\u00a7r\u00a77 for details");
		}
		else
		{
			lines.add("");

			AttachmentType barrel = type.getBarrel(stack);
			if(barrel != null && barrel.silencer)
				lines.add("\u00a7e[Suppressed]");

			if(type.getSecondaryFire(stack))
				lines.add("\u00a7e[Underbarrel]");
			//lines.add("\u00a79Damage" + "\u00a77: " + roundFloat(type.getDamage(stack), 2)); 
			if(bulletDamageInfo != 0)
				lines.add("\u00a79Damage" + "\u00a77: " + bulletDamageInfo); //now display bullet's damage if not zero
			lines.add("\u00a79Recoil" + "\u00a77: " + roundFloat(type.getRecoilPitch(stack), 2));
			lines.add("\u00a79Accuracy" + "\u00a77: " + roundFloat(type.getSpread(stack, false, false), 2));
			//	lines.add("\u00a79Accuracy" + "\u00a77: " + roundFloat(type.getSpread(stack), 2));
			lines.add("\u00a79Reload Time" + "\u00a77: " + roundFloat(type.getReloadTime(stack) / 20, 2) + "s");
			lines.add("\u00a79Rounds per Minute" + "\u00a77: " + roundFloat(1200 / type.shootDelay, 2) );
			lines.add("\u00a79Mode" + "\u00a77: \u00a7f" + type.getFireMode(stack).toString().toLowerCase());

			lines.add("");
			lines.add("\u00a7eAttachments");
			boolean empty = true;
			for(AttachmentType attachment : type.getCurrentAttachments(stack))
			{
				String line = attachment.name;
				lines.add(line);
				if(line != null)
					empty = false;
			}

			if(empty)
				lines.add("None");
		}
	}

	@SideOnly(Side.CLIENT)
	public void onUpdateClient(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
	{
		if(entity instanceof EntityPlayer && ((EntityPlayer)entity).inventory.getCurrentItem() == itemstack)
		{
			//Get useful objects
			Minecraft mc = Minecraft.getMinecraft();
			EntityPlayer player = (EntityPlayer)entity;
			PlayerData data = PlayerHandler.getPlayerData(player, Side.CLIENT);

			//Play idle sounds
			if (soundDelay <= 0 && type.idleSound != null)
			{
				PacketPlaySound.sendSoundPacket(entity.posX, entity.posY, entity.posZ, type.idleSoundRange, entity.dimension, type.idleSound, false);
				soundDelay = type.idleSoundLength;
			}

			//If crouching, translate weapon model (zoom)
			crouching = player.isSneaking();
			//If running, reposition the gun
			//sprinting = (player.isSprinting() && !type.shootMelee); retcon sprinting restriction
			//horsey

			mounted = player.isRiding();
			//This code is not for deployables



			if (type.deployable)
				return;


			GameSettings gameSettings = FMLClientHandler.instance().getClient().gameSettings;
			//If in a GUI
			if(FMLClientHandler.instance().getClient().currentScreen != null)
			{
				if(FlansModClient.currentScope != null)
				{
					FlansModClient.currentScope = null;
					gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
					gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
					gameSettings.fovSetting = FlansModClient.originalFOV;

					//Send default spread packet to server
					FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(itemstack, type.getDefaultSpread(itemstack)));
				}
			}
			//Do not shoot ammo bags, flags or dropped gun items, or if universal violence disabled -t labjac
			else if(TeamsManager.violence==true||mc.objectMouseOver != null && (mc.objectMouseOver.entityHit instanceof EntityFlagpole || mc.objectMouseOver.entityHit instanceof EntityFlag || mc.objectMouseOver.entityHit instanceof EntityGunItem || (mc.objectMouseOver.entityHit instanceof EntityGrenade && ((EntityGrenade)mc.objectMouseOver.entityHit).type.isDeployableBag)))
			{

			}
			//Else do shoot code
			else
			{
				//Get whether mice are held
				lastRightMouseHeld = rightMouseHeld;
				lastLeftMouseHeld = leftMouseHeld;
				//labjac attempt at gun first deploy timer
				rightMouseHeld = Mouse.isButtonDown(FlansModClient.fireButton.getButton());
				leftMouseHeld = Mouse.isButtonDown(FlansModClient.aimButton.getButton());
				//labjac mount and blade buttons
				lastAHeld = AHeld;
				lastWHeld = WHeld;
				lastDHeld = DHeld;
				AHeld = GameSettings.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindLeft);
				WHeld = GameSettings.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindForward);
				DHeld = GameSettings.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindRight);











				boolean offHandFull = false;

				//----------------------------- Off hand item ---------------------------------------------------------------------
				if(type.oneHanded && FlansModClient.vehicleEngineRevs == PlayerHandler.enginePower)
				{
					if(data.offHandGunSlot == player.inventory.currentItem + 1)
						data.offHandGunSlot = 0;
					//Cycle selection
					int dWheel = Mouse.getDWheel();
					if(Keyboard.isKeyDown(mc.gameSettings.keyBindSneak.getKeyCode()) && dWheel != 0)
					{
						data.cycleOffHandItem(player, dWheel);
					}
					if(data.offHandGunSlot == 0)
						fullHands = 0;

					if(data.offHandGunSlot != 0)
					{
						offHandFull = true;
						fullHands = 1;
						ItemStack offHandGunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
						if(offHandGunStack != null && offHandGunStack.getItem() instanceof ItemGun)
						{
							GunType offHandGunType = ((ItemGun)offHandGunStack.getItem()).type;
							if(offHandGunType.usableByPlayers)
							{
								//If we are using a burst mode gun, and there is burst left to be done, try to do it
								if(offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.BURST && data.burstRoundsRemainingLeft > 0)
								{
									if(clientSideShoot(player, offHandGunStack, offHandGunType, true))
										player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, null);
								}
								else
								{
									//Send packet when firing a semi or starting to fire a full    lololol even melee is switched  wait actually nevermind i want you to only use shields as second gun
									//						if((rightMouseHeld && !lastRightMouseHeld && type.shootMelee)  || (leftMouseHeld && !lastLeftMouseHeld && !type.shootMelee))
									if((leftMouseHeld && !lastLeftMouseHeld && !type.shootMelee))
									{

										FlansMod.getPacketHandler().sendToServer(new PacketGunFire(true, true, player.rotationYaw, player.rotationPitch));
										if(clientSideShoot(player, offHandGunStack, offHandGunType, true))
										{
											player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, null);


											if((rightMouseHeld && !lastRightMouseHeld && !type.shootMelee)  || (leftMouseHeld && !lastLeftMouseHeld && type.shootMelee && data.isBlockingLeft<=0))
											{

											}
										}

									}
									if((offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.FULLAUTO || offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.MINIGUN) && !leftMouseHeld && lastLeftMouseHeld) //Full auto. Send released mouse packet
									{
										FlansMod.getPacketHandler().sendToServer(new PacketGunFire(true, false, player.rotationYaw, player.rotationPitch));
									}
									if((offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.FULLAUTO || offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.MINIGUN) && leftMouseHeld)
									{
										if(clientSideShoot(player, offHandGunStack, offHandGunType, true))
											player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, null);
									}
								}
							}
						}
						else data.offHandGunSlot = 0;
					}
				}

				//--------------------------------- Main hand item ---------------------------------------------
				//If we are using a burst mode gun, and there is burst left to be done, try to do it
				if(type.usableByPlayers && FlansModClient.vehicleEngineRevs == PlayerHandler.enginePower && poopenfarden == 1)
				{
					if(type.getFireMode(itemstack) == EnumFireMode.BURST && data.burstRoundsRemainingRight > 0)
					{
						if(clientSideShoot(player, itemstack, type, false))
							player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
					}
					else
					{

						//Send packet when firing a semi or starting to fire a full
						if((rightMouseHeld && !lastRightMouseHeld && !type.shootMelee) || (leftMouseHeld && !lastLeftMouseHeld && type.shootMelee && data.isBlockingLeft<=0))
						{
							//	itemSwing()		









							//melee animation guns
							if(type.shootMelee&&type.meleeLeft==true&&AHeld&& data.stabTimeLeft <= 0 && data.isBlockingLeft<=0)
							{


								//Do animation  doesnt actually work?
								if(player.worldObj.isRemote)
								{
									GunAnimations animations = FlansModClient.getGunAnimations(player, false);
									animations.doMeleeLeft(type.meleeLeftTime);
								}




							}


							else if(type.shootMelee&&type.meleeRight==true&&DHeld&& data.stabTimeLeft <= 0 && data.isBlockingLeft<=0)
							{
								//Do animation
								if(player.worldObj.isRemote)
								{
									GunAnimations animations = FlansModClient.getGunAnimations(player, false);
									animations.doMeleeRight(type.meleeRightTime);
								}



							}

							else if(type.shootMelee&&type.meleeDown==true&&WHeld&& data.stabTimeLeft <= 0 && data.isBlockingLeft<=0)
							{
								//Do animation
								if(player.worldObj.isRemote)
								{
									GunAnimations animations = FlansModClient.getGunAnimations(player, false);
									animations.doMeleeDown(type.meleeDownTime);
								}



							}

							else
								if(type.shootMelee&& data.stabTimeLeft <= 0 && data.isBlockingLeft<=0)
								{
									//Do animation
									if(player.worldObj.isRemote)
									{
										GunAnimations animations = FlansModClient.getGunAnimations(player, false);
										animations.doMelee(type.meleeTime);
									}



								}
							//end of melee animation guns
							FlansMod.getPacketHandler().sendToServer(new PacketGunFire(false, true, player.rotationYaw, player.rotationPitch));
							if(clientSideShoot(player, itemstack, type, false))
								player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
						}




						if((type.getFireMode(itemstack) == EnumFireMode.FULLAUTO || type.getFireMode(itemstack) == EnumFireMode.MINIGUN) && !rightMouseHeld && lastRightMouseHeld) //Full auto. Send released mouse packet
						{
							FlansMod.getPacketHandler().sendToServer(new PacketGunFire(false, false, player.rotationYaw, player.rotationPitch));
						}
						if((type.getFireMode(itemstack) == EnumFireMode.FULLAUTO || type.getFireMode(itemstack) == EnumFireMode.MINIGUN) && rightMouseHeld)
						{
							if(clientSideShoot(player, itemstack, type, false))
								player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
						}

					}
				}

				//end of main shoot code


				IScope currentScope = type.getCurrentScope(itemstack);




				if(FlansModClient.aimType == AimType.TOGGLE)
				{
					if(!offHandFull && (type.secondaryFunction == EnumSecondaryFunction.ADS_ZOOM || type.secondaryFunction == EnumSecondaryFunction.ZOOM) && Mouse.isButtonDown(FlansModClient.aimButton.getButton()) && !type.shootMelee && FlansModClient.scopeTime <= 0 && FMLClientHandler.instance().getClient().currentScreen == null)
					{
						if(FlansModClient.currentScope == null)
						{
							/*if(type.allowNightVision)
								isNightVision = true;
							if(type.allowSlow)
								isSlow = true;*/
							FlansModClient.currentScope = currentScope;
							FlansModClient.lastZoomLevel = currentScope.getZoomFactor();
							FlansModClient.lastFOVZoomLevel = currentScope.getFOVFactor();
							float f = FlansModClient.originalMouseSensitivity = gameSettings.mouseSensitivity;
							gameSettings.mouseSensitivity = f / (float) Math.sqrt(currentScope.getZoomFactor());
							FlansModClient.originalThirdPerson = gameSettings.thirdPersonView;
							gameSettings.thirdPersonView = 0;
							//FlansModClient.originalFOV = gameSettings.fovSetting;     goldsloth improvement
							if (Math.abs(FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) < 0.0001F) {
								FlansModClient.originalFOV = gameSettings.fovSetting;
							}

							//Send ads spread packet to server
							//sendSpreadToServer(itemstack);
							sendSpreadToServer(itemstack, player.isSneaking(), player.isSprinting());
							FlansMod.getPacketHandler().sendToServer(new PacketGunState(FlansModClient.currentScope != null));

						}
						else
						{
							//if(type.allowNightVision)
							//isNightVision = false;
							FlansModClient.currentScope = null;
							gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
							gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;

							//new goldsloth upgrades
							if (Math.abs(FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) < 0.0001F) {
								gameSettings.fovSetting = FlansModClient.originalFOV;
							}

							//Send default spread packet to server
							FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(itemstack, type.getDefaultSpread(itemstack)));
							FlansMod.getPacketHandler().sendToServer(new PacketGunState(FlansModClient.currentScope != null));
						}
						FlansModClient.scopeTime = 10;
					}
				}
				else
				{
					if(!offHandFull && (type.secondaryFunction == EnumSecondaryFunction.ADS_ZOOM || type.secondaryFunction == EnumSecondaryFunction.ZOOM) && Mouse.isButtonDown(FlansModClient.aimButton.getButton()) && /*FlansModClient.scopeTime <= 0 &&*/ FMLClientHandler.instance().getClient().currentScreen == null)
					{
						if(FlansModClient.currentScope == null)
						{
							/*if(type.allowNightVision)
								isNightVision = true;
							if(type.allowSlow)
								isSlow = true;*/
							FlansModClient.currentScope = currentScope;
							FlansModClient.lastZoomLevel = currentScope.getZoomFactor();
							FlansModClient.lastFOVZoomLevel = currentScope.getFOVFactor();
							float f = FlansModClient.originalMouseSensitivity = gameSettings.mouseSensitivity;
							gameSettings.mouseSensitivity = f / (float) Math.sqrt(currentScope.getZoomFactor());
							FlansModClient.originalThirdPerson = gameSettings.thirdPersonView;
							gameSettings.thirdPersonView = 0;

							// This fixes some of the issues with FOV getting changed by repeated scoping and unscoping.
							// In effect, it says that we should only set the 'original' zoom of the client if we know the FOV is
							// unaffected from scoping.
							if (Math.abs(FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) < 0.0001F) {
								FlansModClient.originalFOV = gameSettings.fovSetting;
							}
							//Send ads spread packet to server
							//sendSpreadToServer(itemstack);
							sendSpreadToServer(itemstack, player.isSneaking(), player.isSprinting());
							FlansMod.getPacketHandler().sendToServer(new PacketGunState(FlansModClient.currentScope != null));
						}
						FlansModClient.scopeTime = 10;
					}
					else
					{
						if(!Mouse.isButtonDown(FlansModClient.aimButton.getButton()))
						{
							if(FlansModClient.currentScope != null)
							{
								FlansModClient.currentScope = null;
								gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
								gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
								gameSettings.fovSetting = FlansModClient.originalFOV;

								//Send default spread packet to server
								FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(itemstack, type.getDefaultSpread(itemstack)));
								FlansMod.getPacketHandler().sendToServer(new PacketGunState(FlansModClient.currentScope != null));
							}
						}
					}
				}


			}
		}
		if (soundDelay > 0)
		{
			soundDelay--;
		}
	}

	//public void sendSpreadToServer(ItemStack stack)
	public void sendSpreadToServer(ItemStack stack, boolean sneaking, boolean sprinting) {

		//Send ads spread packet to server
		float f = type.numBullets == 1 ? 0.2F : 0.8F;
		FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(stack, type.getSpread(stack, sneaking, sprinting) * f));
		//FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(stack, type.getSpread(stack) * f));
	}

	/** Client side shoot method for animations and delayers
	 * @return whether to consume the gun item  */
	public boolean clientSideShoot(EntityPlayer player, ItemStack stack, GunType gunType, boolean left)
	{
		PlayerData data = PlayerHandler.getPlayerData(player);


		if (type.meleeSound != null)
			PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.meleeSound, true);
		//Do custom melee code here
		if(type.secondaryFunctionWhenShoot != null)

			//workspace for mount and blade




			if(type.secondaryFunctionWhenShoot == EnumSecondaryFunction.CUSTOM_MELEE&&blocking==false&&type.meleeLeft==true&&AHeld&&!type.shootMelee)
			{
				//Do animation
				if(player.worldObj.isRemote && data.isBlockingLeft<=0)
				{
					GunAnimations animations = FlansModClient.getGunAnimations(player, false);
					animations.doMeleeLeft(type.meleeLeftTime);
				}
				//Do custom melee hit detection
				if(player instanceof EntityPlayer && !type.shootMelee)
				{
					PlayerData whenshootdata = PlayerHandler.getPlayerData((EntityPlayer)player);
					data.doMeleeLeft((EntityPlayer)player, type.meleeLeftTime, type);
				}


			}


			else if(type.secondaryFunctionWhenShoot == EnumSecondaryFunction.CUSTOM_MELEE&&blocking==false&&type.meleeRight==true&&DHeld&&!type.shootMelee)
			{
				//Do animation
				if(player.worldObj.isRemote && data.isBlockingLeft<=0)
				{
					GunAnimations animations = FlansModClient.getGunAnimations(player, false);
					animations.doMeleeRight(type.meleeRightTime);
				}
				//Do custom melee hit detection
				if(player instanceof EntityPlayer && !type.shootMelee)
				{
					PlayerData whenshootdata = PlayerHandler.getPlayerData((EntityPlayer)player);
					data.doMeleeRight((EntityPlayer)player, type.meleeRightTime, type);
				}


			}

			else if(type.secondaryFunctionWhenShoot == EnumSecondaryFunction.CUSTOM_MELEE&&blocking==false&&type.meleeDown==true&&WHeld&&!type.shootMelee)
			{
				//Do animation
				if(player.worldObj.isRemote && data.isBlockingLeft<=0)
				{
					GunAnimations animations = FlansModClient.getGunAnimations(player, false);
					animations.doMeleeDown(type.meleeDownTime);
				}
				//Do custom melee hit detection
				if(player instanceof EntityPlayer && !type.shootMelee)
				{
					PlayerData whenshootdata = PlayerHandler.getPlayerData((EntityPlayer)player);
					data.doMeleeDown((EntityPlayer)player, type.meleeDownTime, type);
				}


			}

			else
				if(type.secondaryFunctionWhenShoot == EnumSecondaryFunction.CUSTOM_MELEE&&blocking==false&&!type.shootMelee)
				{
					//Do animation
					if(player.worldObj.isRemote && data.isBlockingLeft<=0)
					{
						GunAnimations animations = FlansModClient.getGunAnimations(player, false);
						animations.doMelee(type.meleeTime);
					}
					//Do custom melee hit detection
					if(player instanceof EntityPlayer && !type.shootMelee)
					{
						PlayerData whenshootdata = PlayerHandler.getPlayerData((EntityPlayer)player);
						data.doMelee((EntityPlayer)player, type.meleeTime, type);
					}


				}


		//workspace ends
		if((FlansModClient.shootTime(left) <= 0 && sprinting && FlansModClient.zoomProgress > 0.5F) ||
				(FlansModClient.shootTime(left) <= 0 && !sprinting))
		{
			boolean onLastBullet = false;
			boolean hasAmmo = false;
			for(int i = 0; i < gunType.getNumAmmoItemsInGun(stack); i++)
			{
				ItemStack bulletStack = getBulletItemStack(stack, i);
				if(bulletStack != null && bulletStack.getItem() != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage())
				{
					if(bulletStack.getMaxDamage() - bulletStack.getItemDamage() == 1 && gunType.model.slideLockOnEmpty)
						onLastBullet = true;
					hasAmmo = true;
					break;
				}
			}
			if(hasAmmo)
			{

				//	if(player.worldObj.isRemote)
				//	{

				AttachmentType barrel = gunType.getBarrel(stack);
				AttachmentType grip = gunType.getGrip(stack);
				boolean silenced = barrel != null && barrel.silencer && !gunType.getSecondaryFire(stack);

				//FlansModClient.clientShootSound(type.shootSound); //ok maybe this will work?   clientside wally shoot sound
				//System.out.println("its tring to clientshoot");	
				//wally clientside shootsound	fuck server killer?!
				//FlansModClient.
				//FMLClientHandler.instance().getClient().getSoundHandler().playSound(new PositionedSoundRecord(FlansModResourceHandler.getSound(type.shootSound), silenced ? 5F : 10F, (silenced ? 1.0F / (rand.nextFloat() * 0.4F + 0.8F) : 1.0F) * (silenced ? 2F : 1F), (float)player.posX, (float)player.posY, (float)player.posZ));

				//	}


				GunAnimations animations = null;
				if(left)
				{
					if(FlansModClient.gunAnimationsLeft.containsKey(player))
						animations = FlansModClient.gunAnimationsLeft.get(player);
					else
					{
						animations = new GunAnimations();
						FlansModClient.gunAnimationsLeft.put(player, animations);
					}
				}
				else
				{
					if(FlansModClient.gunAnimationsRight.containsKey(player))
						animations = FlansModClient.gunAnimationsRight.get(player);
					else
					{
						animations = new GunAnimations();
						FlansModClient.gunAnimationsRight.put(player, animations);
					}
				}
				int pumpDelay = gunType.model == null ? 0 : gunType.model.pumpDelay;
				int pumpTime = gunType.model == null ? 1 : gunType.model.pumpTime;
				int hammerDelay = gunType.model == null ? 0 : gunType.model.hammerDelay;
				int casingDelay = gunType.model == null ? 0 : gunType.model.casingDelay;
				float hammerAngle = gunType.model == null ? 0 : gunType.model.hammerAngle;
				float althammerAngle = gunType.model == null ? 0 : gunType.model.althammerAngle;

				animations.onGunEmpty(onLastBullet);
				animations.doShoot(pumpDelay, pumpTime, hammerDelay, hammerAngle, althammerAngle, casingDelay); //shoved sound into this   nvm failed
				if (FlansModClient.screenShake > -100)
					FlansModClient.screenShake -= 5; //making screenshake truly tied to gunfire isntead of jewish tricks

				//Old client side recoil, moved to PacketGunRecoil
				/*if(!player.isSneaking())
				{
					FlansModClient.playerRecoilPitch += gunType.getRecoilPitch(stack);
					FlansModClient.playerRecoilYaw += gunType.getRecoilYaw(stack);
				}
				else
				{
					FlansModClient.playerRecoilPitch += gunType.getRecoilPitch(stack) - gunType.decreaseRecoilPitch;
					FlansModClient.playerRecoilYaw += gunType.getRecoilYaw(stack) / gunType.decreaseRecoilYaw;
				}*/

				//shootdelay for animations
				if(left)
				{
					if(!type.shootMelee)
						FlansModClient.shootTimeLeft = gunType.getShootDelay(stack);
					if(type.shootMelee)
						FlansModClient.shootTimeLeft = gunType.getShootDelay(stack);
				}

				else 
				{
					if(!type.shootMelee)
						FlansModClient.shootTimeRight = gunType.getShootDelay(stack);
					if(type.shootMelee)
						FlansModClient.shootTimeRight = gunType.getShootDelay(stack);
				}
				//if(gunType.consumeGunUponUse)
				//return true;

			}
			if(gunType.getFireMode(stack) == EnumFireMode.BURST)
			{
				if(left)
				{
					if(data.burstRoundsRemainingLeft > 0)
						data.burstRoundsRemainingLeft--;
					else data.burstRoundsRemainingLeft = gunType.numBurstRounds;
				}
				else
				{
					if(data.burstRoundsRemainingRight > 0)
						data.burstRoundsRemainingRight--;
					else data.burstRoundsRemainingRight = gunType.numBurstRounds;
				}
			}
		}
		return false;
	}

	public void onUpdateServer(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
	{
		if (itemstack.getTagCompound() == null) {
			GunType gunType = this.type;
			NBTTagCompound tags = new NBTTagCompound();
			tags.setString("Paint", gunType.defaultPaintjob.iconName);
			NBTTagList ammoTagsList = new NBTTagList();
			for (int j = 0; j < gunType.getNumAmmoItemsInGun(itemstack); j++) {
				ammoTagsList.appendTag(new NBTTagCompound());
			}
			tags.setTag("ammo", ammoTagsList);
			itemstack.stackTagCompound = tags;
		}



		if(entity instanceof EntityPlayerMP)
		{
			EntityPlayerMP player = (EntityPlayerMP)entity;
			PlayerData data = PlayerHandler.getPlayerData(player);
			if(data == null)
				return;



			if(player.inventory.getCurrentItem() != itemstack)
			{

				//If the player is no longer holding a gun, emulate a release of the shoot button
				if(player.inventory.getCurrentItem() == null || player.inventory.getCurrentItem().getItem() == null || !(player.inventory.getCurrentItem().getItem() instanceof ItemGun))
				{
					data.isShootingRight = data.isShootingLeft = false;
					data.offHandGunSlot = 0;
					(new PacketSelectOffHandGun(0)).handleServerSide(player);
				}
				return;
			}




			//Right hand gun
			if(type.getFireMode(itemstack) == EnumFireMode.BURST && data.burstRoundsRemainingRight > 0 )
			{
				player.inventory.setInventorySlotContents(player.inventory.currentItem, tryToShoot(itemstack, type, world, player, false));
			}
			if(data.isShootingRight)
			{
				//Shoot burst and full auto weapons also cringe labjac minigun replacement
				if(type.getFireMode(itemstack) == EnumFireMode.FULLAUTO && !type.labigunDelay)
				{
					player.inventory.setInventorySlotContents(player.inventory.currentItem, tryToShoot(itemstack, type, world, player, false));
				}
				//Play looping sounds for minigun
				if(type.useLoopingSounds && data.loopedSoundDelay <= 0 && data.minigunSpeed > 0.1F && !data.reloadingRight)
				{
					data.loopedSoundDelay = data.shouldPlayWarmupSound ? type.warmupSoundLength : type.loopedSoundLength;
					PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, data.shouldPlayWarmupSound ? type.warmupSound : type.loopedSound, false);
					data.shouldPlayWarmupSound = false;
				}
				//Minigun is sufficiently fast to shoot


				//if( (type.getFireMode(itemstack) == EnumFireMode.MINIGUN || type.labigunDelay) && data.minigunSpeed > type.minigunStartSpeed)

				if( (type.getFireMode(itemstack) == EnumFireMode.MINIGUN || type.labigunDelay) && (data.minigunSpeed == 0 || data.minigunSpeed == -1 || data.minigunSpeed == -2) )
					player.inventory.setInventorySlotContents(player.inventory.currentItem, tryToShoot(itemstack, type, world, player, false));
			}
			else
			{
				if(type.useLoopingSounds && data.shouldPlayCooldownSound)
				{
					PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, type.cooldownSound, false);
					data.shouldPlayCooldownSound = false;
				}
			}

			//Left hand gun
			if(type.oneHanded && data.offHandGunSlot != 0)
			{
				ItemStack offHandGunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
				if(offHandGunStack != null && offHandGunStack.getItem() instanceof ItemGun)
				{
					GunType offHandGunType = ((ItemGun)offHandGunStack.getItem()).type;

					if(offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.BURST && data.burstRoundsRemainingLeft > 0)
					{
						player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, tryToShoot(offHandGunStack, offHandGunType, world, player, true));
					}
					if(data.isShootingLeft)
					{

						//Shoot full auto weapons
						if(offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.FULLAUTO && !type.labigunDelay)
						{
							player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, tryToShoot(offHandGunStack, offHandGunType, world, player, true));
						}
						//Play looping sounds for minigun
						if(offHandGunType.useLoopingSounds && data.loopedSoundDelay <= 0 && data.minigunSpeed > 0.1F && !data.reloadingLeft)
						{
							data.loopedSoundDelay = data.shouldPlayWarmupSound ? offHandGunType.warmupSoundLength : offHandGunType.loopedSoundLength;
							PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, data.shouldPlayWarmupSound ? offHandGunType.warmupSound : offHandGunType.loopedSound, false);
							data.shouldPlayWarmupSound = false;
						}
						//Minigun is sufficiently fast to shoot
						if((offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.MINIGUN || type.labigunDelay) && data.minigunSpeed > offHandGunType.minigunStartSpeed   )
							player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, tryToShoot(offHandGunStack, offHandGunType, world, player, true));
					}
					else
					{
						if(offHandGunType.useLoopingSounds && data.shouldPlayCooldownSound)
						{
							PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, offHandGunType.cooldownSound, false);
							data.shouldPlayCooldownSound = false;
						}
					}
				}
			}
		}
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity pEnt, int i, boolean flag)
	{
		if(world.isRemote)
			onUpdateClient(itemstack, world, pEnt, i, flag);
		else onUpdateServer(itemstack, world, pEnt, i, flag);

		if(pEnt instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)pEnt;
			PlayerData data = PlayerHandler.getPlayerData(player);
			if(data == null)
				return;

			//reload multiplier from armor

			for(int n = 0; n < 5; n++)
			{

				ItemStack stacko = player.getEquipmentInSlot(n);
				if(stacko != null && stacko.getItem() instanceof ItemTeamArmour)
					if (((ItemTeamArmour)stacko.getItem()).type.hasPouch && ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier != 1)
					{
						pouchMultiplier = ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier;
						//	System.out.println(((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier);
					}
					else if (((ItemTeamArmour)stacko.getItem()).type.hasGunPouch && type.RepeatingGun && ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier != 1)
					{
						pouchMultiplier = ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier;
					}
					else if (((ItemTeamArmour)stacko.getItem()).type.hasOldGunPouch && type.OldGun && ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier != 1)
					{
						pouchMultiplier = ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier;
					}
					else if (((ItemTeamArmour)stacko.getItem()).type.hasHeavyPouch && type.Heavy && ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier != 1)
					{
						pouchMultiplier = ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier;
					}
					else if (((ItemTeamArmour)stacko.getItem()).type.hasBowPouch && type.Bow && ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier != 1)
					{
						pouchMultiplier = ((ItemTeamArmour)stacko.getItem()).type.pouchMultiplier;
					}

				if (stacko == null)
					pouchMultiplier = 1f;
			}




			//	pouchMultiplier = data.pouchMultiplier;
			if(pouchMultiplier != 1)
				//System.out.println(pouchMultiplier + "gun pouch");
				//end of multiplier

				/*
			//If enabled a speed nerf will be applied for each gun after gunCarryLimt starting at 0.6 and decreasing by 0.1 for each additional
			if(FlansMod.gunCarryLimitEnable)
			{
				int gunCount = 0;
				for (int slot = 0; slot < 9; slot++)
				{
					ItemStack itemInSlot = player.inventory.getStackInSlot(slot);
					ItemStack current = player.inventory.getCurrentItem();
					if(itemInSlot != null && itemInSlot.getItem() instanceof ItemGun)
					{
						gunCount++;
					}
				}
				if(gunCount > FlansMod.gunCarryLimit)
				{
					float walkSpeed = MathUtils.clampf((float) (0.1 - (0.04f + (0.010f * (gunCount - FlansMod.gunCarryLimit)))), 0.01f, 0.1f);
					player.capabilities.setPlayerWalkSpeed(walkSpeed);
					player.jumpMovementFactor = 0.002F;
				}
				else
				{
					player.capabilities.setPlayerWalkSpeed(0.1F);
					player.jumpMovementFactor = 0.02F; //(default)
					SharedMonsterAttributes.movementSpeed.
					player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).applyModifier(new AttributeModifier(UUID.fromString("91AEAA56-376B-4498-935B-2F7F68070635", "generic.movementSpeed", 4.0D, 0));


				}


			}
				 */

				if(!type.canSetPosition)
					this.impactX = this.impactY = this.impactZ = 0;

			if(lockOnSoundDelay > 0)
				lockOnSoundDelay--;

			Entity closestEntity = null;
			if(type.lockOnToLivings || type.lockOnToMechas || type.lockOnToPlanes || type.lockOnToPlayers || type.lockOnToVehicles)
			{
				//double closestAngle;

				for(Object obj : player.worldObj.loadedEntityList)
				{
					Entity entity = (Entity)obj;
					Vec3 playerVec = player.getLookVec();
					double dXYZ = Math.sqrt((entity.posX - player.posX) * (entity.posX - player.posX) + (entity.posY - player.posY) * (entity.posY - player.posY) + (entity.posZ - player.posZ) * (entity.posZ - player.posZ));
					Vector3f relPosVec = new Vector3f(entity.posX - player.posX, entity.posY - player.posY, entity.posZ - player.posZ);
					Vector3f playerVec3f = new Vector3f(playerVec.xCoord,playerVec.yCoord,playerVec.zCoord);
					float angle = Math.abs(Vector3f.angle(playerVec3f, relPosVec));
					if(angle < Math.toRadians(type.canLockOnAngle) && dXYZ < type.maxRangeLockOn)
					{
						String etype = entity.getEntityData().getString("EntityType");
						if( (type.lockOnToMechas	&& entity instanceof EntityMecha)	||
								(type.lockOnToVehicles	&& entity instanceof EntityVehicle)	||
								(type.lockOnToVehicles	&& etype.equals("Vehicle"))			|| // for vehicle of other Mod
								(type.lockOnToPlanes	&& entity instanceof EntityPlane)	||
								(type.lockOnToPlanes	&& etype.equals("Plane"))			|| // for plane of other Mod
								(type.lockOnToPlayers	&& entity instanceof EntityPlayer)	||
								(type.lockOnToLivings	&& entity instanceof EntityLivingBase))
						{
							//if(entity instanceof EntityMecha || entity instanceof EntityVehicle || entity instanceof EntityPlane || entity instanceof EntityPlayer || entity instanceof EntityLivingBase)
							if(!data.reloadingRight)
								closestEntity = entity;
							//closestAngle = angle;
						}
					}
				}

				if(closestEntity != null)
				{
					closestEntity.getEntityData().setBoolean("LockOn", true);
				}

				if(closestEntity != null && lockOnSoundDelay <= 0 && !player.worldObj.isRemote && player.getCurrentEquippedItem() != null)
				{
					if(player.getCurrentEquippedItem().getItem() instanceof ItemGun)
					{
						ItemGun itemGun;
						itemGun = (ItemGun)player.getCurrentEquippedItem().getItem();
						PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 10, player.dimension, itemGun.type.lockOnSound, false);
						//PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 100, player.dimension, itemGun.type.shootSound, false);
						lockOnSoundDelay = type.lockOnSoundTime;
						if(closestEntity instanceof EntityDriveable && ((EntityDriveable)closestEntity).getDriveableType().hasFlare)
						{
							EntityDriveable entityDriveable = (EntityDriveable)closestEntity;
							PacketPlaySound.sendSoundPacket(closestEntity.posX, closestEntity.posY, closestEntity.posZ,
									entityDriveable.getDriveableType().lockedOnSoundRange,
									closestEntity.dimension, entityDriveable.getDriveableType().lockingOnSound, false);
						}
					}
				}
			}
			/*
			//TODO; Add scope attachment override to enable NV for add-on NV scopes
				//If player is holding gun, apply modifiers below
				if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun)
				{
					ItemGun itemGun;
					itemGun = (ItemGun)player.getCurrentEquippedItem().getItem();
					//Apply night vision while scoped if AllowNightVision = True
					if(itemGun.type.allowNightVision && FlansModClient.currentScope != null)
					{
						player.addPotionEffect(new PotionEffect(Potion.nightVision.id, -1, 0));
					}
					AttachmentType scope = itemGun.type.getScope(itemstack);
					//IScope scope = itemGun.type.getCurrentScope(itemstack);
					//System.out.println(scope);
					//Apply night vision while scoped if attachment.hasNightVision = True
					if(scope != null && scope.hasNightVision && FlansModClient.currentScope != null)
					{
						player.addPotionEffect(new PotionEffect(Potion.nightVision.id, -1, 0));
						//System.out.println("1");
					}
					//Apply a penalty to jumpMovement equal to the moveSpeed penalty (0.5 moveSpeed = 0.5 jumpDistance)
					if(itemGun.type.moveSpeedModifier != 1F)
					{
						player.jumpMovementFactor = 0.0F;
					}
					else
						player.jumpMovementFactor = 0.02F;
				}
			 */



			//if(data.lastMeleePositions == null || data.lastMeleePositions.length != type.meleeDamagePoints.size())
			//{
			//	data.lastMeleePositions = new Vector3f[type.meleeDamagePoints.size()];
			//	for(int j = 0; j < type.meleeDamagePoints.size(); j++)
			//		data.lastMeleePositions[j] = new Vector3f(player.posX, player.posY, player.posZ);
			//}
			//Melee weapon







			//mount and blade code


			// down or thrust code

			if(data.meleeDownLength > 0 && type.meleeDownPath.size() > 0 && player.inventory.getCurrentItem() == itemstack && type.meleeDown == true&&data.meleeProgressDown!=data.meleeDownLength)
			{
				for(int k = 0; k < type.meleeDamagePoints.size(); k++)
				{
					Vector3f meleeDamagePoint = type.meleeDownDamagePoints.get(k);
					//Do a raytrace from the prev pos to the current pos and attack anything in the way
					Vector3f nextPos = type.meleeDownPath.get((data.meleeProgressDown + 1) % type.meleeDownPath.size());
					Vector3f nextAngles = type.meleeDownPathAngles.get((data.meleeProgressDown + 1) % type.meleeDownPathAngles.size());
					RotatedAxes nextAxes = new RotatedAxes().rotateGlobalRoll(-nextAngles.x).rotateGlobalPitch(-nextAngles.z).rotateGlobalYaw(-nextAngles.y);

					Vector3f nextPosInGunCoords = nextAxes.findLocalVectorGlobally(meleeDamagePoint);
					Vector3f.add(nextPos, nextPosInGunCoords, nextPosInGunCoords);
					Vector3f.add(new Vector3f(0F, 0F, 0F), nextPosInGunCoords, nextPosInGunCoords);
					Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90F, player.rotationPitch, 0F).findLocalVectorGlobally(nextPosInGunCoords);


					if(!FlansMod.proxy.isThePlayer(player))
						nextPosInPlayerCoords.y += 1.6F;

					Vector3f nextPosInWorldCoords = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);

					Vector3f dPos = data.lastMeleeDownPositions[k] == null ? new Vector3f() : Vector3f.sub(nextPosInWorldCoords, data.lastMeleeDownPositions[k], null);

					if(player.worldObj.isRemote && FlansMod.DEBUG)
						player.worldObj.spawnEntityInWorld(new EntityDebugVector(player.worldObj, data.lastMeleeDownPositions[k], dPos, 200, 1F, 0F, 0F));

					//Do the raytrace
					{
						//Create a list for all bullet hits
						ArrayList<BulletHit> hits = new ArrayList<BulletHit>();

						//Iterate over all entities
						for(int j = 0; j < world.loadedEntityList.size(); j++)
						{
							Object obj = world.loadedEntityList.get(j);
							//Get players
							if(obj instanceof EntityPlayer)
							{
								EntityPlayer otherPlayer = (EntityPlayer)obj;
								PlayerData otherData = PlayerHandler.getPlayerData(otherPlayer);
								boolean shouldDoNormalHitDetect = false;
								if(otherPlayer == player)
									continue;
								if(otherData != null)
								{
									if(otherPlayer.isDead || otherData.team == Team.spectators)
									{
										continue;
									}
									int snapshotToTry = player instanceof EntityPlayerMP ? ((EntityPlayerMP)player).ping / 50 : 0;
									if(snapshotToTry >= otherData.snapshots.length)
										snapshotToTry = otherData.snapshots.length - 1;

									PlayerSnapshot snapshot = otherData.snapshots[snapshotToTry];
									if(snapshot == null)
										snapshot = otherData.snapshots[0];

									//DEBUG
									//snapshot = new PlayerSnapshot(player);

									//Check one last time for a null snapshot. If this is the case, fall back to normal hit detection
									if(snapshot == null)
										shouldDoNormalHitDetect = true;
									else
									{
										//Raytrace
										ArrayList<BulletHit> playerHits = snapshot.raytrace(data.lastMeleeDownPositions[k] == null ? nextPosInWorldCoords : data.lastMeleeDownPositions[k], dPos);
										hits.addAll(playerHits);
									}
								}

								//If we couldn't get a snapshot, use normal entity hitbox calculations
								if(otherData == null || shouldDoNormalHitDetect)
								{
									MovingObjectPosition mop = data.lastMeleeDownPositions[k] == null ? player.boundingBox.calculateIntercept(nextPosInWorldCoords.toVec3(), Vec3.createVectorHelper(0F, 0F, 0F)) : player.boundingBox.calculateIntercept(data.lastMeleeDownPositions[k].toVec3(), nextPosInWorldCoords.toVec3());
									if(mop != null)
									{
										Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleeDownPositions[k].x, mop.hitVec.yCoord - data.lastMeleeDownPositions[k].y, mop.hitVec.zCoord - data.lastMeleeDownPositions[k].z);
										float hitLambda = 1F;
										if(dPos.x != 0F)
											hitLambda = hitPoint.x / dPos.x;
										else if(dPos.y != 0F)
											hitLambda = hitPoint.y / dPos.y;
										else if(dPos.z != 0F)
											hitLambda = hitPoint.z / dPos.z;
										if(hitLambda < 0)
											hitLambda = -hitLambda;

										hits.add(new PlayerBulletHit(new PlayerHitbox(otherPlayer, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), hitLambda));
									}
								}
							}
							else
							{
								Entity entity = (Entity)obj;
								if(entity != player && !entity.isDead && (entity instanceof EntityLivingBase || entity instanceof EntityAAGun))
								{
									MovingObjectPosition mop = entity.boundingBox.calculateIntercept(data.lastMeleeDownPositions[k].toVec3(), nextPosInWorldCoords.toVec3());
									if(mop != null)
									{
										Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleeDownPositions[k].x, mop.hitVec.yCoord - data.lastMeleeDownPositions[k].y, mop.hitVec.zCoord - data.lastMeleeDownPositions[k].z);
										float hitLambda = 1F;
										if(dPos.x != 0F)
											hitLambda = hitPoint.x / dPos.x;
										else if(dPos.y != 0F)
											hitLambda = hitPoint.y / dPos.y;
										else if(dPos.z != 0F)
											hitLambda = hitPoint.z / dPos.z;
										if(hitLambda < 0)
											hitLambda = -hitLambda;

										hits.add(new EntityHit(entity, hitLambda));
									}
								}
							}
						}

						//We hit something
						if(!hits.isEmpty())
						{
							//Sort the hits according to the intercept position
							Collections.sort(hits);

							float swingDistance = dPos.length();

							for(BulletHit bulletHit : hits)
							{
								if(bulletHit instanceof PlayerBulletHit)
								{
									PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
									float damageMultiplier = 1F;
									switch(playerHit.hitbox.type)
									{
									case LEFTITEM : case RIGHTITEM : //Hit a shield. Stop the swing.
									{
										PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.ShieldHitSound, true);
										data.meleeProgressDown = data.meleeDownLength = 0;
										return;
									}
									//evolved armor start
									case NAPE : damageMultiplier = 2F;
									//labjac special armor system TM
									for(int n = 0; n < 5; n++)
									{
										ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n);

										if(stack != null && stack.getItem() instanceof ItemTeamArmour)
										{
											//labjac secret flan armor system body armor TM
											if(((ItemTeamArmour)stack.getItem()).type.bodyArmor>(type.swordArmorPen))
											{
												PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.ShieldHitSound, true);
												data.meleeProgressLeft = data.meleeLeftLength = 0;
												return;
											}
										}
									}
									//end of labjac armor system TM
									break;

									case RIGHTARM : case LEFTARM : damageMultiplier = 0.6F; 
									//labjac special armor system TM
									for(int n = 0; n < 5; n++)
									{
										ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n);

										if(stack != null && stack.getItem() instanceof ItemTeamArmour)
										{
											//labjac secret flan armor system body armor TM
											if(((ItemTeamArmour)stack.getItem()).type.armArmor>(type.swordArmorPen))
											{
												PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.ShieldHitSound, true);
												data.meleeProgressLeft = data.meleeLeftLength = 0;
												return;
											}
										}
									}
									//end of labjac armor system TM
									break;

									case BODY : //labjac special armor system TM
										for(int n = 0; n < 5; n++)
										{
											ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n);

											if(stack != null && stack.getItem() instanceof ItemTeamArmour)
											{
												//labjac secret flan armor system body armor TM
												if(((ItemTeamArmour)stack.getItem()).type.bodyArmor>(type.swordArmorPen))
												{
													PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.ShieldHitSound, true);
													data.meleeProgressLeft = data.meleeLeftLength = 0;
													return;
												}
											}
										}
										//end of labjac armor system TM
										break;
										//evolved armor end
									default :
									}

									if(playerHit.hitbox.player.attackEntityFrom(getMeleeDamage(player), swingDistance * type.meleeDamage))
									{
										//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
										playerHit.hitbox.player.arrowHitTimer++;
										playerHit.hitbox.player.hurtResistantTime = playerHit.hitbox.player.maxHurtResistantTime / 2;
										PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.meleeHitSound, true);
										sliceCrossHair = true;	
									}

									if(FlansMod.DEBUG)
										world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(data.lastMeleeDownPositions[k].x + dPos.x * playerHit.intersectTime, data.lastMeleeDownPositions[k].y + dPos.y * playerHit.intersectTime, data.lastMeleeDownPositions[k].z + dPos.z * playerHit.intersectTime), 1000, 1F, 0F, 0F));
								}
								else if(bulletHit instanceof EntityHit)
								{
									EntityHit entityHit = (EntityHit)bulletHit;
									if(entityHit.entity.attackEntityFrom(DamageSource.causePlayerDamage(player), swingDistance * type.meleeDamage) && entityHit.entity instanceof EntityLivingBase)
									{
										EntityLivingBase living = (EntityLivingBase)entityHit.entity;
										//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
										living.arrowHitTimer++;
										living.hurtResistantTime = living.maxHurtResistantTime / 2;
										PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.meleeHitSound, true);
									}

									if(FlansMod.DEBUG)
										world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(data.lastMeleeDownPositions[k].x + dPos.x * entityHit.intersectTime, data.lastMeleeDownPositions[k].y + dPos.y * entityHit.intersectTime, data.lastMeleeDownPositions[k].z + dPos.z * entityHit.intersectTime), 1000, 1F, 0F, 0F));
								}
							}
						}
					}
					//End raytrace

					data.lastMeleeDownPositions[k] = nextPosInWorldCoords;
				}

				//Increment the progress meter
				data.meleeProgressDown++;
				//If we are done, reset the counters
				if(data.meleeProgressDown == data.meleeDownLength)
					data.meleeProgressDown = data.meleeDownLength = 0;
			}

			//end of thrust



			//left melee



			else if(data.meleeLeftLength > 0 && type.meleeLeftPath.size() > 0 && player.inventory.getCurrentItem() == itemstack && type.meleeLeft == true&&data.meleeProgressLeft!=data.meleeLeftLength)
			{
				for(int k = 0; k < type.meleeDamagePoints.size(); k++)
				{
					Vector3f meleeDamagePoint = type.meleeLeftDamagePoints.get(k);
					//Do a raytrace from the prev pos to the current pos and attack anything in the way
					Vector3f nextPos = type.meleeLeftPath.get((data.meleeProgressLeft + 1) % type.meleeLeftPath.size());
					Vector3f nextAngles = type.meleeLeftPathAngles.get((data.meleeProgressLeft + 1) % type.meleeLeftPathAngles.size());
					RotatedAxes nextAxes = new RotatedAxes().rotateGlobalRoll(-nextAngles.x).rotateGlobalPitch(-nextAngles.z).rotateGlobalYaw(-nextAngles.y);

					Vector3f nextPosInGunCoords = nextAxes.findLocalVectorGlobally(meleeDamagePoint);
					Vector3f.add(nextPos, nextPosInGunCoords, nextPosInGunCoords);
					Vector3f.add(new Vector3f(0F, 0F, 0F), nextPosInGunCoords, nextPosInGunCoords);
					Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90F, player.rotationPitch, 0F).findLocalVectorGlobally(nextPosInGunCoords);


					if(!FlansMod.proxy.isThePlayer(player))
						nextPosInPlayerCoords.y += 1.6F;

					Vector3f nextPosInWorldCoords = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);

					Vector3f dPos = data.lastMeleeLeftPositions[k] == null ? new Vector3f() : Vector3f.sub(nextPosInWorldCoords, data.lastMeleeLeftPositions[k], null);

					if(player.worldObj.isRemote && FlansMod.DEBUG)
						player.worldObj.spawnEntityInWorld(new EntityDebugVector(player.worldObj, data.lastMeleeLeftPositions[k], dPos, 200, 1F, 0F, 0F));

					//Do the raytrace
					{
						//Create a list for all bullet hits
						ArrayList<BulletHit> hits = new ArrayList<BulletHit>();

						//Iterate over all entities
						for(int j = 0; j < world.loadedEntityList.size(); j++)
						{
							Object obj = world.loadedEntityList.get(j);
							//Get players
							if(obj instanceof EntityPlayer)
							{
								EntityPlayer otherPlayer = (EntityPlayer)obj;
								PlayerData otherData = PlayerHandler.getPlayerData(otherPlayer);
								boolean shouldDoNormalHitDetect = false;
								if(otherPlayer == player)
									continue;
								if(otherData != null)
								{
									if(otherPlayer.isDead || otherData.team == Team.spectators)
									{
										continue;
									}
									int snapshotToTry = player instanceof EntityPlayerMP ? ((EntityPlayerMP)player).ping / 50 : 0;
									if(snapshotToTry >= otherData.snapshots.length)
										snapshotToTry = otherData.snapshots.length - 1;

									PlayerSnapshot snapshot = otherData.snapshots[snapshotToTry];
									if(snapshot == null)
										snapshot = otherData.snapshots[0];

									//DEBUG
									//snapshot = new PlayerSnapshot(player);

									//Check one last time for a null snapshot. If this is the case, fall back to normal hit detection
									if(snapshot == null)
										shouldDoNormalHitDetect = true;
									else
									{
										//Raytrace
										ArrayList<BulletHit> playerHits = snapshot.raytrace(data.lastMeleeLeftPositions[k] == null ? nextPosInWorldCoords : data.lastMeleeLeftPositions[k], dPos);
										hits.addAll(playerHits);
									}
								}

								//If we couldn't get a snapshot, use normal entity hitbox calculations
								if(otherData == null || shouldDoNormalHitDetect)
								{
									MovingObjectPosition mop = data.lastMeleeLeftPositions[k] == null ? player.boundingBox.calculateIntercept(nextPosInWorldCoords.toVec3(), Vec3.createVectorHelper(0F, 0F, 0F)) : player.boundingBox.calculateIntercept(data.lastMeleeLeftPositions[k].toVec3(), nextPosInWorldCoords.toVec3());
									if(mop != null)
									{
										Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleeLeftPositions[k].x, mop.hitVec.yCoord - data.lastMeleeLeftPositions[k].y, mop.hitVec.zCoord - data.lastMeleeLeftPositions[k].z);
										float hitLambda = 1F;
										if(dPos.x != 0F)
											hitLambda = hitPoint.x / dPos.x;
										else if(dPos.y != 0F)
											hitLambda = hitPoint.y / dPos.y;
										else if(dPos.z != 0F)
											hitLambda = hitPoint.z / dPos.z;
										if(hitLambda < 0)
											hitLambda = -hitLambda;

										hits.add(new PlayerBulletHit(new PlayerHitbox(otherPlayer, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), hitLambda));
									}
								}
							}
							else
							{
								Entity entity = (Entity)obj;
								if(entity != player && !entity.isDead && (entity instanceof EntityLivingBase || entity instanceof EntityAAGun))
								{
									MovingObjectPosition mop = entity.boundingBox.calculateIntercept(data.lastMeleeLeftPositions[k].toVec3(), nextPosInWorldCoords.toVec3());
									if(mop != null)
									{
										Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleeLeftPositions[k].x, mop.hitVec.yCoord - data.lastMeleeLeftPositions[k].y, mop.hitVec.zCoord - data.lastMeleeLeftPositions[k].z);
										float hitLambda = 1F;
										if(dPos.x != 0F)
											hitLambda = hitPoint.x / dPos.x;
										else if(dPos.y != 0F)
											hitLambda = hitPoint.y / dPos.y;
										else if(dPos.z != 0F)
											hitLambda = hitPoint.z / dPos.z;
										if(hitLambda < 0)
											hitLambda = -hitLambda;

										hits.add(new EntityHit(entity, hitLambda));
									}
								}
							}
						}

						//We hit something
						if(!hits.isEmpty())
						{
							//Sort the hits according to the intercept position
							Collections.sort(hits);

							float swingDistance = dPos.length();

							for(BulletHit bulletHit : hits)
							{
								if(bulletHit instanceof PlayerBulletHit)
								{
									PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
									float damageMultiplier = 1F;
									switch(playerHit.hitbox.type)
									{
									case LEFTITEM : case RIGHTITEM : //Hit a shield. Stop the swing.
									{
										PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.ShieldHitSound, true);
										data.meleeProgressLeft = data.meleeLeftLength = 0;
										return;
									}
									//evolved armor start
									case NAPE : damageMultiplier = 2F;
									//labjac special armor system TM
									for(int n = 0; n < 5; n++)
									{
										ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n);

										if(stack != null && stack.getItem() instanceof ItemTeamArmour)
										{
											//labjac secret flan armor system body armor TM
											if(((ItemTeamArmour)stack.getItem()).type.bodyArmor>(type.swordArmorPen))
											{
												PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.ShieldHitSound, true);
												data.meleeProgressLeft = data.meleeLeftLength = 0;
												return;
											}
										}
									}
									//end of labjac armor system TM
									break;

									case RIGHTARM : case LEFTARM : damageMultiplier = 0.6F; 
									//labjac special armor system TM
									for(int n = 0; n < 5; n++)
									{
										ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n);

										if(stack != null && stack.getItem() instanceof ItemTeamArmour)
										{
											//labjac secret flan armor system body armor TM
											if(((ItemTeamArmour)stack.getItem()).type.armArmor>(type.swordArmorPen))
											{
												PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.ShieldHitSound, true);
												data.meleeProgressLeft = data.meleeLeftLength = 0;
												return;
											}
										}
									}
									//end of labjac armor system TM
									break;

									case BODY : //labjac special armor system TM
										for(int n = 0; n < 5; n++)
										{
											ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n);

											if(stack != null && stack.getItem() instanceof ItemTeamArmour)
											{
												//labjac secret flan armor system body armor TM
												if(((ItemTeamArmour)stack.getItem()).type.bodyArmor>(type.swordArmorPen))
												{
													PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.ShieldHitSound, true);
													data.meleeProgressLeft = data.meleeLeftLength = 0;
													return;
												}
											}
										}
										//end of labjac armor system TM
										break;
										//evolved armor end

									default :
									}

									if(playerHit.hitbox.player.attackEntityFrom(getMeleeDamage(player), swingDistance * type.meleeDamage))
									{
										//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
										PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.meleeHitSound, true);
										playerHit.hitbox.player.arrowHitTimer++;
										playerHit.hitbox.player.hurtResistantTime = playerHit.hitbox.player.maxHurtResistantTime / 2;
										sliceCrossHair = true;
									}

									if(FlansMod.DEBUG)
										world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(data.lastMeleeLeftPositions[k].x + dPos.x * playerHit.intersectTime, data.lastMeleeLeftPositions[k].y + dPos.y * playerHit.intersectTime, data.lastMeleeLeftPositions[k].z + dPos.z * playerHit.intersectTime), 1000, 1F, 0F, 0F));
								}
								else if(bulletHit instanceof EntityHit)
								{
									EntityHit entityHit = (EntityHit)bulletHit;
									if(entityHit.entity.attackEntityFrom(DamageSource.causePlayerDamage(player), swingDistance * type.meleeDamage) && entityHit.entity instanceof EntityLivingBase)
									{
										EntityLivingBase living = (EntityLivingBase)entityHit.entity;
										PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.meleeHitSound, true);
										//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
										living.arrowHitTimer++;
										living.hurtResistantTime = living.maxHurtResistantTime / 2;
									}

									if(FlansMod.DEBUG)
										world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(data.lastMeleeLeftPositions[k].x + dPos.x * entityHit.intersectTime, data.lastMeleeLeftPositions[k].y + dPos.y * entityHit.intersectTime, data.lastMeleeLeftPositions[k].z + dPos.z * entityHit.intersectTime), 1000, 1F, 0F, 0F));
								}
							}
						}
					}
					//End raytrace

					data.lastMeleeLeftPositions[k] = nextPosInWorldCoords;
				}

				//Increment the progress meter
				data.meleeProgressLeft++;
				//If we are done, reset the counters
				if(data.meleeProgressLeft == data.meleeLeftLength)
					data.meleeProgressLeft = data.meleeLeftLength = 0;
			}



			//end of left melee



			//right swing

			else if(data.meleeRightLength > 0 && type.meleeRightPath.size() > 0 && player.inventory.getCurrentItem() == itemstack && type.meleeRight == true&&data.meleeProgressRight!=data.meleeRightLength)
			{
				for(int k = 0; k < type.meleeRightDamagePoints.size(); k++)
				{
					Vector3f meleeDamagePoint = type.meleeRightDamagePoints.get(k);
					//Do a raytrace from the prev pos to the current pos and attack anything in the way
					Vector3f nextPos = type.meleeRightPath.get((data.meleeProgressRight + 1) % type.meleeRightPath.size());
					Vector3f nextAngles = type.meleeRightPathAngles.get((data.meleeProgressRight + 1) % type.meleeRightPathAngles.size());
					RotatedAxes nextAxes = new RotatedAxes().rotateGlobalRoll(-nextAngles.x).rotateGlobalPitch(-nextAngles.z).rotateGlobalYaw(-nextAngles.y);

					Vector3f nextPosInGunCoords = nextAxes.findLocalVectorGlobally(meleeDamagePoint);
					Vector3f.add(nextPos, nextPosInGunCoords, nextPosInGunCoords);
					Vector3f.add(new Vector3f(0F, 0F, 0F), nextPosInGunCoords, nextPosInGunCoords);
					Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90F, player.rotationPitch, 0F).findLocalVectorGlobally(nextPosInGunCoords);


					if(!FlansMod.proxy.isThePlayer(player))
						nextPosInPlayerCoords.y += 1.6F;

					Vector3f nextPosInWorldCoords = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);

					Vector3f dPos = data.lastMeleeRightPositions[k] == null ? new Vector3f() : Vector3f.sub(nextPosInWorldCoords, data.lastMeleeRightPositions[k], null);

					if(player.worldObj.isRemote && FlansMod.DEBUG)
						player.worldObj.spawnEntityInWorld(new EntityDebugVector(player.worldObj, data.lastMeleeRightPositions[k], dPos, 200, 1F, 0F, 0F));

					//Do the raytrace
					{
						//Create a list for all bullet hits
						ArrayList<BulletHit> hits = new ArrayList<BulletHit>();

						//Iterate over all entities
						for(int j = 0; j < world.loadedEntityList.size(); j++)
						{
							Object obj = world.loadedEntityList.get(j);
							//Get players
							if(obj instanceof EntityPlayer)
							{
								EntityPlayer otherPlayer = (EntityPlayer)obj;
								PlayerData otherData = PlayerHandler.getPlayerData(otherPlayer);
								boolean shouldDoNormalHitDetect = false;
								if(otherPlayer == player)
									continue;
								if(otherData != null)
								{
									if(otherPlayer.isDead || otherData.team == Team.spectators)
									{
										continue;
									}
									int snapshotToTry = player instanceof EntityPlayerMP ? ((EntityPlayerMP)player).ping / 50 : 0;
									if(snapshotToTry >= otherData.snapshots.length)
										snapshotToTry = otherData.snapshots.length - 1;

									PlayerSnapshot snapshot = otherData.snapshots[snapshotToTry];
									if(snapshot == null)
										snapshot = otherData.snapshots[0];

									//DEBUG
									//snapshot = new PlayerSnapshot(player);

									//Check one last time for a null snapshot. If this is the case, fall back to normal hit detection
									if(snapshot == null)
										shouldDoNormalHitDetect = true;
									else
									{
										//Raytrace
										ArrayList<BulletHit> playerHits = snapshot.raytrace(data.lastMeleeRightPositions[k] == null ? nextPosInWorldCoords : data.lastMeleeRightPositions[k], dPos);
										hits.addAll(playerHits);
									}
								}

								//If we couldn't get a snapshot, use normal entity hitbox calculations
								if(otherData == null || shouldDoNormalHitDetect)
								{
									MovingObjectPosition mop = data.lastMeleeRightPositions[k] == null ? player.boundingBox.calculateIntercept(nextPosInWorldCoords.toVec3(), Vec3.createVectorHelper(0F, 0F, 0F)) : player.boundingBox.calculateIntercept(data.lastMeleeRightPositions[k].toVec3(), nextPosInWorldCoords.toVec3());
									if(mop != null)
									{
										Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleeRightPositions[k].x, mop.hitVec.yCoord - data.lastMeleeRightPositions[k].y, mop.hitVec.zCoord - data.lastMeleeRightPositions[k].z);
										float hitLambda = 1F;
										if(dPos.x != 0F)
											hitLambda = hitPoint.x / dPos.x;
										else if(dPos.y != 0F)
											hitLambda = hitPoint.y / dPos.y;
										else if(dPos.z != 0F)
											hitLambda = hitPoint.z / dPos.z;
										if(hitLambda < 0)
											hitLambda = -hitLambda;

										hits.add(new PlayerBulletHit(new PlayerHitbox(otherPlayer, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), hitLambda));
									}
								}
							}
							else
							{
								Entity entity = (Entity)obj;
								if(entity != player && !entity.isDead && (entity instanceof EntityLivingBase || entity instanceof EntityAAGun))
								{
									MovingObjectPosition mop = entity.boundingBox.calculateIntercept(data.lastMeleeRightPositions[k].toVec3(), nextPosInWorldCoords.toVec3());
									if(mop != null)
									{
										Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleeRightPositions[k].x, mop.hitVec.yCoord - data.lastMeleeRightPositions[k].y, mop.hitVec.zCoord - data.lastMeleeRightPositions[k].z);
										float hitLambda = 1F;
										if(dPos.x != 0F)
											hitLambda = hitPoint.x / dPos.x;
										else if(dPos.y != 0F)
											hitLambda = hitPoint.y / dPos.y;
										else if(dPos.z != 0F)
											hitLambda = hitPoint.z / dPos.z;
										if(hitLambda < 0)
											hitLambda = -hitLambda;

										hits.add(new EntityHit(entity, hitLambda));
									}
								}
							}
						}

						//We hit something
						if(!hits.isEmpty())
						{
							//Sort the hits according to the intercept position
							Collections.sort(hits);

							float swingDistance = dPos.length();

							for(BulletHit bulletHit : hits)
							{
								if(bulletHit instanceof PlayerBulletHit)
								{
									PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
									float damageMultiplier = 1F;
									switch(playerHit.hitbox.type)
									{
									case LEFTITEM : case RIGHTITEM : //Hit a shield. Stop the swing.
									{
										PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.ShieldHitSound, true);
										data.meleeProgressRight = data.meleeRightLength = 0;
										return;
									}
									//evolved armor start
									case NAPE : damageMultiplier = 2F;
									//labjac special armor system TM
									for(int n = 0; n < 5; n++)
									{
										ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n);

										if(stack != null && stack.getItem() instanceof ItemTeamArmour)
										{
											//labjac secret flan armor system body armor TM
											if(((ItemTeamArmour)stack.getItem()).type.bodyArmor>(type.swordArmorPen))
											{
												PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.ShieldHitSound, true);
												data.meleeProgressLeft = data.meleeLeftLength = 0;
												return;
											}
										}
									}
									//end of labjac armor system TM
									break;

									case RIGHTARM : case LEFTARM : damageMultiplier = 0.6F; 
									//labjac special armor system TM
									for(int n = 0; n < 5; n++)
									{
										ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n);

										if(stack != null && stack.getItem() instanceof ItemTeamArmour)
										{
											//labjac secret flan armor system body armor TM
											if(((ItemTeamArmour)stack.getItem()).type.armArmor>(type.swordArmorPen))
											{
												PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.ShieldHitSound, true);
												data.meleeProgressLeft = data.meleeLeftLength = 0;
												return;
											}
										}
									}
									//end of labjac armor system TM
									break;

									case BODY : //labjac special armor system TM
										for(int n = 0; n < 5; n++)
										{
											ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n);

											if(stack != null && stack.getItem() instanceof ItemTeamArmour)
											{
												//labjac secret flan armor system body armor TM
												if(((ItemTeamArmour)stack.getItem()).type.bodyArmor>(type.swordArmorPen))
												{
													PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.ShieldHitSound, true);
													data.meleeProgressLeft = data.meleeLeftLength = 0;
													return;
												}
											}
										}
										//end of labjac armor system TM
										break;
										//evolved armor end
									default :
									}

									if(playerHit.hitbox.player.attackEntityFrom(getMeleeDamage(player), swingDistance * type.meleeDamage))
									{
										//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
										PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.meleeHitSound, true);
										playerHit.hitbox.player.arrowHitTimer++;
										playerHit.hitbox.player.hurtResistantTime = playerHit.hitbox.player.maxHurtResistantTime / 2;
										sliceCrossHair = true;
									}

									if(FlansMod.DEBUG)
										world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(data.lastMeleeRightPositions[k].x + dPos.x * playerHit.intersectTime, data.lastMeleeRightPositions[k].y + dPos.y * playerHit.intersectTime, data.lastMeleeRightPositions[k].z + dPos.z * playerHit.intersectTime), 1000, 1F, 0F, 0F));
								}
								else if(bulletHit instanceof EntityHit)
								{
									EntityHit entityHit = (EntityHit)bulletHit;
									if(entityHit.entity.attackEntityFrom(DamageSource.causePlayerDamage(player), swingDistance * type.meleeDamage) && entityHit.entity instanceof EntityLivingBase)
									{
										EntityLivingBase living = (EntityLivingBase)entityHit.entity;
										//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
										PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.meleeHitSound, true);
										living.arrowHitTimer++;
										living.hurtResistantTime = living.maxHurtResistantTime / 2;
									}

									if(FlansMod.DEBUG)
										world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(data.lastMeleeRightPositions[k].x + dPos.x * entityHit.intersectTime, data.lastMeleeRightPositions[k].y + dPos.y * entityHit.intersectTime, data.lastMeleeRightPositions[k].z + dPos.z * entityHit.intersectTime), 1000, 1F, 0F, 0F));
								}
							}
						}
					}
					//End raytrace

					data.lastMeleeRightPositions[k] = nextPosInWorldCoords;
				}

				//Increment the progress meter
				data.meleeProgressRight++;
				//If we are done, reset the counters
				if(data.meleeProgressRight == data.meleeRightLength)
					data.meleeProgressRight = data.meleeRightLength = 0;
			}

			//end right



			else if(data.meleeLength > 0 && type.meleePath.size() > 0 && player.inventory.getCurrentItem() == itemstack)
			{
				for(int k = 0; k < type.meleeDamagePoints.size(); k++)
				{
					Vector3f meleeDamagePoint = type.meleeDamagePoints.get(k);
					//Do a raytrace from the prev pos to the current pos and attack anything in the way
					Vector3f nextPos = type.meleePath.get((data.meleeProgress + 1) % type.meleePath.size());
					Vector3f nextAngles = type.meleePathAngles.get((data.meleeProgress + 1) % type.meleePathAngles.size());
					RotatedAxes nextAxes = new RotatedAxes().rotateGlobalRoll(-nextAngles.x).rotateGlobalPitch(-nextAngles.z).rotateGlobalYaw(-nextAngles.y);

					Vector3f nextPosInGunCoords = nextAxes.findLocalVectorGlobally(meleeDamagePoint);
					Vector3f.add(nextPos, nextPosInGunCoords, nextPosInGunCoords);
					Vector3f.add(new Vector3f(0F, 0F, 0F), nextPosInGunCoords, nextPosInGunCoords);
					Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90F, player.rotationPitch, 0F).findLocalVectorGlobally(nextPosInGunCoords);


					if(!FlansMod.proxy.isThePlayer(player))
						nextPosInPlayerCoords.y += 1.6F;

					Vector3f nextPosInWorldCoords = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);

					Vector3f dPos = data.lastMeleePositions[k] == null ? new Vector3f() : Vector3f.sub(nextPosInWorldCoords, data.lastMeleePositions[k], null);

					if(player.worldObj.isRemote && FlansMod.DEBUG)
						player.worldObj.spawnEntityInWorld(new EntityDebugVector(player.worldObj, data.lastMeleePositions[k], dPos, 200, 1F, 0F, 0F));

					//Do the raytrace
					{
						//Create a list for all bullet hits
						ArrayList<BulletHit> hits = new ArrayList<BulletHit>();

						//Iterate over all entities
						for(int j = 0; j < world.loadedEntityList.size(); j++)
						{
							Object obj = world.loadedEntityList.get(j);
							//Get players
							if(obj instanceof EntityPlayer)
							{
								EntityPlayer otherPlayer = (EntityPlayer)obj;
								PlayerData otherData = PlayerHandler.getPlayerData(otherPlayer);
								boolean shouldDoNormalHitDetect = false;
								if(otherPlayer == player)
									continue;
								if(otherData != null)
								{
									if(otherPlayer.isDead || otherData.team == Team.spectators)
									{
										continue;
									}
									int snapshotToTry = player instanceof EntityPlayerMP ? ((EntityPlayerMP)player).ping / 50 : 0;
									if(snapshotToTry >= otherData.snapshots.length)
										snapshotToTry = otherData.snapshots.length - 1;

									PlayerSnapshot snapshot = otherData.snapshots[snapshotToTry];
									if(snapshot == null)
										snapshot = otherData.snapshots[0];

									//DEBUG
									//snapshot = new PlayerSnapshot(player);

									//Check one last time for a null snapshot. If this is the case, fall back to normal hit detection
									if(snapshot == null)
										shouldDoNormalHitDetect = true;
									else
									{
										//Raytrace
										ArrayList<BulletHit> playerHits = snapshot.raytrace(data.lastMeleePositions[k] == null ? nextPosInWorldCoords : data.lastMeleePositions[k], dPos);
										hits.addAll(playerHits);
									}
								}

								//If we couldn't get a snapshot, use normal entity hitbox calculations
								if(otherData == null || shouldDoNormalHitDetect)
								{
									MovingObjectPosition mop = data.lastMeleePositions[k] == null ? player.boundingBox.calculateIntercept(nextPosInWorldCoords.toVec3(), Vec3.createVectorHelper(0F, 0F, 0F)) : player.boundingBox.calculateIntercept(data.lastMeleePositions[k].toVec3(), nextPosInWorldCoords.toVec3());
									if(mop != null)
									{
										Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleePositions[k].x, mop.hitVec.yCoord - data.lastMeleePositions[k].y, mop.hitVec.zCoord - data.lastMeleePositions[k].z);
										float hitLambda = 1F;
										if(dPos.x != 0F)
											hitLambda = hitPoint.x / dPos.x;
										else if(dPos.y != 0F)
											hitLambda = hitPoint.y / dPos.y;
										else if(dPos.z != 0F)
											hitLambda = hitPoint.z / dPos.z;
										if(hitLambda < 0)
											hitLambda = -hitLambda;

										hits.add(new PlayerBulletHit(new PlayerHitbox(otherPlayer, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), hitLambda));
									}
								}
							}
							else
							{
								Entity entity = (Entity)obj;
								if(entity != player && !entity.isDead && (entity instanceof EntityLivingBase || entity instanceof EntityAAGun))
								{
									MovingObjectPosition mop = entity.boundingBox.calculateIntercept(data.lastMeleePositions[k].toVec3(), nextPosInWorldCoords.toVec3());
									if(mop != null)
									{
										Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleePositions[k].x, mop.hitVec.yCoord - data.lastMeleePositions[k].y, mop.hitVec.zCoord - data.lastMeleePositions[k].z);
										float hitLambda = 1F;
										if(dPos.x != 0F)
											hitLambda = hitPoint.x / dPos.x;
										else if(dPos.y != 0F)
											hitLambda = hitPoint.y / dPos.y;
										else if(dPos.z != 0F)
											hitLambda = hitPoint.z / dPos.z;
										if(hitLambda < 0)
											hitLambda = -hitLambda;

										hits.add(new EntityHit(entity, hitLambda));
									}
								}
							}
						}

						//We hit something
						if(!hits.isEmpty())
						{
							//Sort the hits according to the intercept position
							Collections.sort(hits);

							float swingDistance = dPos.length();

							for(BulletHit bulletHit : hits)
							{
								if(bulletHit instanceof PlayerBulletHit)
								{
									PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
									float damageMultiplier = 1F;
									switch(playerHit.hitbox.type)
									{
									case LEFTITEM : case RIGHTITEM : //Hit a shield. Stop the swing.
									{
										PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.ShieldHitSound, true);
										data.meleeProgress = data.meleeLength = 0;
										return;
									}
									//evolved armor start
									case NAPE : damageMultiplier = 2F;
									//labjac special armor system TM
									for(int n = 0; n < 5; n++)
									{
										ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n);

										if(stack != null && stack.getItem() instanceof ItemTeamArmour)
										{
											//labjac secret flan armor system body armor TM
											if(((ItemTeamArmour)stack.getItem()).type.bodyArmor>(type.swordArmorPen))
											{
												PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.ShieldHitSound, true);
												data.meleeProgressLeft = data.meleeLeftLength = 0;
												return;
											}
										}
									}
									//end of labjac armor system TM
									break;

									case RIGHTARM : case LEFTARM : damageMultiplier = 0.6F; 
									//labjac special armor system TM
									for(int n = 0; n < 5; n++)
									{
										ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n);

										if(stack != null && stack.getItem() instanceof ItemTeamArmour)
										{
											//labjac secret flan armor system body armor TM
											if(((ItemTeamArmour)stack.getItem()).type.armArmor>(type.swordArmorPen))
											{
												PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.ShieldHitSound, true);
												data.meleeProgressLeft = data.meleeLeftLength = 0;
												return;
											}
										}
									}
									//end of labjac armor system TM
									break;

									case BODY : //labjac special armor system TM
										for(int n = 0; n < 5; n++)
										{
											ItemStack stack = playerHit.hitbox.player.getEquipmentInSlot(n);

											if(stack != null && stack.getItem() instanceof ItemTeamArmour)
											{
												//labjac secret flan armor system body armor TM
												if(((ItemTeamArmour)stack.getItem()).type.bodyArmor>(type.swordArmorPen))
												{
													PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.ShieldHitSound, true);
													data.meleeProgressLeft = data.meleeLeftLength = 0;
													return;
												}
											}
										}
										//end of labjac armor system TM
										break;
										//evolved armor end
									default :
									}

									if(playerHit.hitbox.player.attackEntityFrom(getMeleeDamage(player), swingDistance * type.meleeDamage))
									{
										//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
										PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.meleeHitSound, true);
										playerHit.hitbox.player.arrowHitTimer++;
										playerHit.hitbox.player.hurtResistantTime = playerHit.hitbox.player.maxHurtResistantTime / 2;
										sliceCrossHair = true;
									}

									if(FlansMod.DEBUG)
										world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(data.lastMeleePositions[k].x + dPos.x * playerHit.intersectTime, data.lastMeleePositions[k].y + dPos.y * playerHit.intersectTime, data.lastMeleePositions[k].z + dPos.z * playerHit.intersectTime), 1000, 1F, 0F, 0F));
								}
								else if(bulletHit instanceof EntityHit)
								{
									EntityHit entityHit = (EntityHit)bulletHit;
									if(entityHit.entity.attackEntityFrom(DamageSource.causePlayerDamage(player), swingDistance * type.meleeDamage) && entityHit.entity instanceof EntityLivingBase)
									{
										EntityLivingBase living = (EntityLivingBase)entityHit.entity;
										//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
										PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.meleeHitSound, true);
										living.arrowHitTimer++;
										living.hurtResistantTime = living.maxHurtResistantTime / 2;
									}

									if(FlansMod.DEBUG)
										world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(data.lastMeleePositions[k].x + dPos.x * entityHit.intersectTime, data.lastMeleePositions[k].y + dPos.y * entityHit.intersectTime, data.lastMeleePositions[k].z + dPos.z * entityHit.intersectTime), 1000, 1F, 0F, 0F));
								}
							}
						}
					}
					//End raytrace

					data.lastMeleePositions[k] = nextPosInWorldCoords;
				}

				//Increment the progress meter
				data.meleeProgress++;
				//If we are done, reset the counters
				if(data.meleeProgress == data.meleeLength)
					data.meleeProgress = data.meleeLength = 0;
			}
		}
	}

	public DamageSource getMeleeDamage(EntityPlayer attacker)
	{
		return new EntityDamageSourceFlans(type.shortName, attacker, attacker, type, false, true);
	}

	//public void on

	public void onMouseHeld(ItemStack stack, World world, EntityPlayerMP player, boolean left, boolean isShooting)
	{
		PlayerData data = PlayerHandler.getPlayerData(player);
		if(data != null && data.shootClickDelay == 0)
		{
			//Drivers can't shoot
			if(player.ridingEntity instanceof EntitySeat && ((EntitySeat)player.ridingEntity).seatInfo.canSmallArms == false)
				return;
			if(left && data.offHandGunSlot != 0)
			{
				ItemStack offHandGunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
				GunType gunType = ((ItemGun)offHandGunStack.getItem()).type;
				data.isShootingLeft = isShooting;
				if(gunType.getFireMode(offHandGunStack) == EnumFireMode.SEMIAUTO && isShooting   )
				{
					data.isShootingLeft = false;
					player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, tryToShoot(offHandGunStack, gunType, world, player, true));
				}
				if(gunType.getFireMode(offHandGunStack) == EnumFireMode.BURST && isShooting && data.burstRoundsRemainingLeft == 0   )
				{
					data.isShootingLeft = false;
					data.burstRoundsRemainingLeft = gunType.numBurstRounds;
					player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, tryToShoot(offHandGunStack, gunType, world, player, true));
				}
			}
			else
			{
				data.isShootingRight = isShooting;



				if(type.getFireMode(stack) == EnumFireMode.SEMIAUTO && isShooting   )
				{
					data.isShootingRight = false;
					player.inventory.setInventorySlotContents(player.inventory.currentItem, tryToShoot(stack, type, world, player, false));
				}
				if(type.getFireMode(stack) == EnumFireMode.BURST && isShooting && data.burstRoundsRemainingRight == 0   )
				{
					data.isShootingRight = false;
					data.burstRoundsRemainingRight = type.numBurstRounds;
					player.inventory.setInventorySlotContents(player.inventory.currentItem, tryToShoot(stack, type, world, player, false));
				}
			}
			//Play the warmup sound for miniguns immediately

			if(type.useLoopingSounds && isShooting)
			{
				data.shouldPlayWarmupSound = true;
			}


			//labjac isshooting attempt
			if(type.labigunDelay)
			{
				data.isShootingRight = true;
				System.out.println("it should be fuckign working");
			}
		}
	}
	boolean canClick = true;
	public ItemStack tryToShoot(ItemStack gunStack, GunType gunType, World world, EntityPlayerMP entityplayer, boolean left)
	{

		//if (type.getSecondaryFire(gunStack))
		//	System.out.println("nigger");

		if(type.deployable)
			return gunStack;
		PlayerData data = PlayerHandler.getPlayerData(entityplayer);
		//Shoot delay ticker is at (or below) 0. Try and shoot the next bullet
		if((left && !type.shootMelee && data.shootTimeLeft <= 0) || (!left && !type.shootMelee && data.shootTimeRight <= 0) || (type.getSecondaryFire(gunStack) && data.stabTimeLeft <= 0) ||(left && type.shootMelee && data.stabTimeLeft <= 0) || (!left && type.shootMelee && data.stabTimeRight <= 0) || (!left && type.sidearm && data.stabTimeRight <= 0) || (!left && type.sidearm && data.stabTimeRight <= 0))
		{
			//if (type.getSecondaryFire(gunStack))
			//	System.out.println("nigger winner");

			//Go through the bullet stacks in the gun and see if any of them are not null
			int bulletID = 0;
			ItemStack bulletStack = null;
			for(; bulletID < gunType.getNumAmmoItemsInGun(gunStack); bulletID++)
			{
				ItemStack checkingStack = getBulletItemStack(gunStack, bulletID);
				if(checkingStack != null && checkingStack.getItem() != null && checkingStack.getItemDamage() < checkingStack.getMaxDamage())
				{
					bulletStack = checkingStack;
					break;
				}
			}



			//If no bullet stack was found, reload  except sword guns
			if(bulletStack == null)
			{			
				if(reload(gunStack, gunType, world, entityplayer, false, left))
				{
					//Set player shoot delay to be the reload delay
					//Set both gun delays to avoid reloading two guns at once
					//unless its a sword gun xddd
					if(!type.shootMelee)
					{
						//reload speed affected by armor pouch multiplier
						data.shootTimeRight = data.shootTimeLeft = (int)((float)gunType.getReloadTime(gunStack)*(float)pouchMultiplier)+1;
						//sidearm reload
						if(type.sidearm || type.getSecondaryFire(gunStack))
							data.stabTimeRight = data.stabTimeLeft = (int)((float)gunType.getReloadTime(gunStack)*(float)pouchMultiplier)+1;  //this works
					}

					if(left)
					{
						data.reloadingLeft = true;
						data.burstRoundsRemainingLeft = 0;
					}
					else
					{
						data.reloadingRight = true;
						data.burstRoundsRemainingRight = 0;
					}
					//Send reload packet to induce reload effects client side
					FlansMod.getPacketHandler().sendTo(new PacketReload(left), entityplayer);
					//Play reload sound
					String soundToPlay = null;
					AttachmentType grip = gunType.getGrip(gunStack);

					if(gunType.getSecondaryFire(gunStack) && grip != null && grip.secondaryReloadSound != null)
					{
						soundToPlay = grip.secondaryReloadSound;
						//gunType.getBulletSpeed
					}
					else if(gunType.reloadSoundOnEmpty != null)
						soundToPlay = gunType.reloadSoundOnEmpty;
					else if(gunType.reloadSound != null)
						soundToPlay = gunType.reloadSound;

					//bayonet animation
					if(entityplayer.worldObj.isRemote && grip != null && grip.bayonet)
					{
						GunAnimations animations = FlansModClient.getGunAnimations(entityplayer, false);
						animations.doBayonet(17);
					}

					if(soundToPlay != null)
						PacketPlaySound.sendSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, type.reloadSoundRange, entityplayer.dimension, soundToPlay, false);

				}
				else if((gunType.clickSoundOnEmpty != null) && canClick)
				{
					// System.out.println("Playing sound");
					PacketPlaySound.sendSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, type.reloadSoundRange, entityplayer.dimension, gunType.clickSoundOnEmpty, false);
					// canClick = false;   no sweetie, let people spam the sound
				}

			}



			//A bullet stack was found, so try shooting with it   also labjac draw delay
			//	else if((bulletStack.getItem() instanceof ItemShootable && sprinting && FlansModClient.zoomProgress > 0.5F) ||
			//			(bulletStack.getItem() instanceof ItemShootable && !sprinting && data.drawTime<=0))

			//	else if((bulletStack.getItem() instanceof ItemShootable && FlansModClient.zoomProgress > 0.5F) ||
			//		(bulletStack.getItem() instanceof ItemShootable && data.drawTime<=0))

			else if((bulletStack.getItem() instanceof ItemShootable))

			{
				//tell info how much damage bullet actually does


				//Shoot
				shoot(gunStack, gunType, world, bulletStack, entityplayer, left);
				canClick = true;

				//Damage the bullet item
				bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);

				//Update the stack in the gun
				setBulletItemStack(gunStack, bulletStack, bulletID);

				if(gunType.getFireMode(gunStack) == EnumFireMode.BURST)
				{
					if(left && data.burstRoundsRemainingLeft > 0)
						data.burstRoundsRemainingLeft--;
					if(!left && data.burstRoundsRemainingRight > 0)
						data.burstRoundsRemainingRight--;
				}
				if(gunType.consumeGunUponUse && bulletStack.getItemDamage()==(bulletStack.getMaxDamage()))
					return null;
			}
		}
		return gunStack;
	}
	//end of deployable cringe

	/** Reload method. Called automatically when firing with an empty clip */
	public boolean reload(ItemStack gunStack, GunType gunType, World world, EntityPlayer player, boolean forceReload, boolean left)
	{
		return reload(gunStack, gunType, world, player, player.inventory, player.capabilities.isCreativeMode, forceReload);
	}

	/** Reload method. Called automatically when firing with an empty clip */
	public boolean reload(ItemStack gunStack, GunType gunType, World world, Entity entity, IInventory inventory, boolean creative, boolean forceReload)
	{	

		//Deployable guns cannot be reloaded in the inventory
		if(gunType.deployable)
			return false;
		//If you cannot reload half way through a clip, reject the player for trying to do so
		if(forceReload && !gunType.canForceReload)
			return false;
		//For playing sounds afterwards
		boolean reloadedSomething = false;


		//Check each ammo slot, one at a time
		for(int i = 0; i < gunType.getNumAmmoItemsInGun(gunStack); i++)
		{
			//Get the stack in the slot
			ItemStack bulletStack = getBulletItemStack(gunStack, i);

			//If there is no magazine, if the magazine is empty or if this is a forced reload
			if(bulletStack == null || bulletStack.getItemDamage() == bulletStack.getMaxDamage() || forceReload)
			{

				if(type.shootMelee)
				{
					ShootableType bulletToGive = type.ammo.get(0);
					int numToGive = Math.min(bulletToGive.maxStackSize, 1);
					boolean spawnedAmmo;
					if(((InventoryPlayer) inventory).addItemStackToInventory(new ItemStack(bulletToGive.item, numToGive)))
						spawnedAmmo = true;
				}
				//Iterate over all inventory slots and find the magazine / bullet item with the most bullets
				int bestSlot = -1;
				int bulletsInBestSlot = 0;
				for (int j = 0; j < inventory.getSizeInventory(); j++)
				{
					ItemStack item = inventory.getStackInSlot(j);

					if(item != null && item.getItem() instanceof ItemShootable && gunType.isAmmo(((ItemShootable)(item.getItem())).type, gunStack))
					{
						int bulletsInThisSlot = item.getMaxDamage() - item.getItemDamage();
						if(bulletsInThisSlot > bulletsInBestSlot)
						{
							bestSlot = j;
							bulletsInBestSlot = bulletsInThisSlot;
						}
					}
				}
				//If there was a valid non-empty magazine / bullet item somewhere in the inventory, load it
				if(bestSlot != -1)
				{
					ItemStack newBulletStack = inventory.getStackInSlot(bestSlot);
					ShootableType newBulletType = ((ItemShootable)newBulletStack.getItem()).type;
					//Unload the old magazine (Drop an item if it is required and the player is not in creative mode)
					if(bulletStack != null && bulletStack.getItem() instanceof ItemShootable && ((ItemShootable)bulletStack.getItem()).type.dropItemOnReload != null && !creative && bulletStack.getItemDamage() == bulletStack.getMaxDamage())
						dropItem(world, entity, ((ItemShootable)bulletStack.getItem()).type.dropItemOnReload);
					//The magazine was not finished, pull it out and give it back to the player or, failing that, drop it
					if(bulletStack != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage())
						if(!InventoryHelper.addItemStackToInventory(inventory, bulletStack, creative))
							entity.entityDropItem(bulletStack, 0.5F);

					bulletDamageInfo = newBulletType.damageVsLiving; //tell the item info what the damage is

					//Load the new magazine
					ItemStack stackToLoad = newBulletStack.copy();
					stackToLoad.stackSize = 1;
					setBulletItemStack(gunStack, stackToLoad, i);

					//Remove the magazine from the inventory
					if(!creative)
						newBulletStack.stackSize--;
					if(newBulletStack.stackSize <= 0)
						newBulletStack = null;
					inventory.setInventorySlotContents(bestSlot, newBulletStack);


					//Tell the sound player that we reloaded something
					reloadedSomething = true;
				}
				//swords automatically get free ammo mark 1
				/*
				else if(type.shootMelee)
				{
					ShootableType bulletToGive = type.ammo.get(0);
				int numToGive = Math.min(bulletToGive.maxStackSize, 1);
				boolean spawnedAmmo;
				if(((InventoryPlayer) inventory).addItemStackToInventory(new ItemStack(bulletToGive.item, numToGive)))
					spawnedAmmo = true;
				}
				 */
			}
		}
		return reloadedSomething;
	}

	/** Method for dropping items on reload and on shoot */
	public static void dropItem(World world, Entity entity, String itemName)
	{
		if (itemName != null)
		{
			int damage = 0;
			if (itemName.contains("."))
			{
				damage = Integer.parseInt(itemName.split("\\.")[1]);
				itemName = itemName.split("\\.")[0];
			}
			ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
			entity.entityDropItem(dropStack, 0.5F);
		}
	}


	/** Method for shooting to avoid repeated code */

	//this is the actual shooting shit
	private void shoot(ItemStack stack, GunType gunType, World world, ItemStack bulletStack, EntityPlayer entityPlayer, boolean left)
	{
		//flash(entityplayer);
		ShootableType bullet = ((ItemShootable)bulletStack.getItem()).type;
		boolean lastBullet = false;
		bulletDamageInfo = bullet.damageVsLiving;
		ItemStack[] bulletStacks = new ItemStack[type.getNumAmmoItemsInGun(stack)];
		for(int i = 0; i < type.getNumAmmoItemsInGun(stack); i++)
		{
			bulletStacks[i] = ((ItemGun)stack.getItem()).getBulletItemStack(stack, i);
			if(bulletStacks[i] != null && bulletStacks[i].getItem() instanceof ItemBullet && (bulletStacks[i].getMaxDamage() - bulletStacks[i].getItemDamage() == 1))
				lastBullet = true;
		}

		// Play a sound if the previous sound has finished
		if (soundDelay <= 0 && gunType.shootSound != null)
		{
			AttachmentType barrel = gunType.getBarrel(stack);
			AttachmentType grip = gunType.getGrip(stack);

			boolean silenced = barrel != null && barrel.silencer && !gunType.getSecondaryFire(stack);
			//world.playSoundAtEntity(entityplayer, type.shootSound, 10F, type.distortSound ? 1.0F / (world.rand.nextFloat() * 0.4F + 0.8F) : 1.0F);
			String soundToPlay = null;
			if(gunType.getSecondaryFire(stack) && grip != null && grip.secondaryShootSound != null)
				soundToPlay = grip.secondaryShootSound;
			else if(lastBullet && gunType.lastShootSound != null)
				soundToPlay = gunType.lastShootSound;
			else if(silenced && gunType.suppressedShootSound != null)
				soundToPlay = gunType.suppressedShootSound;
			else if(gunType.shootSound != null)
				soundToPlay = gunType.shootSound;

			if(soundToPlay != null)
			{

				//PacketPlaySound.sendSoundPacketClient(soundToPlay, gunType.distortSound, silenced, entityPlayer); //bandaid since client sound kills server


				//censor next line to hide normal version which makes wally cry
				PacketPlaySound.sendSoundPacket(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, type.gunSoundRange, entityPlayer.dimension, soundToPlay, gunType.distortSound, silenced); 
				FlansMod.packetHandler.sendToDonut(new PacketPlaySound(entityPlayer.posX, entityPlayer.posY,
						entityPlayer.posZ, soundToPlay), entityPlayer.posX, entityPlayer.posY,
						entityPlayer.posZ, 0.5f, type.gunSoundRange, entityPlayer.dimension);  //convert old sound into a donut so other players can hear you shoot if there is no lag

				soundDelay = gunType.shootSoundLength;
			}

			//goldsloth longrange noise
			if (type.distantShootSound != null) {
				FlansMod.packetHandler.sendToDonut(new PacketPlaySound(entityPlayer.posX, entityPlayer.posY,
						entityPlayer.posZ, type.distantShootSound), entityPlayer.posX, entityPlayer.posY,
						entityPlayer.posZ, type.gunSoundRange, type.distantSoundRange, entityPlayer.dimension);
			}
			//goldsloth longrange noise end
		}
		if (!world.isRemote && bulletStack.getItem() instanceof ItemShootable)
		{
			// Spawn the bullet entities
			ItemShootable itemShootable = (ItemShootable)bulletStack.getItem();
			ShootableType shootableType = itemShootable.type;
			int   numBullets   = -1;
			float spread = -1.0F;


			if(shootableType instanceof BulletType)
			{
				if(gunType.allowNumBulletsByBulletType)
				{
					numBullets = ((BulletType) shootableType).numBullets;
				}
				if(gunType.allowSpreadByBullet)
				{
					spread = ((BulletType) shootableType).bulletSpread;
				}
			}


			if(numBullets <= 0)
			{
				numBullets = gunType.getNumBullets(stack);
			}

			if(spread <= 0)
			{
				/*
				float result = gunType.getSpread(stack);

				//If crouch/sneak, then lower spread by 10%
				if(entityPlayer.isSneaking())
					result = result * 0.9F;

				//If running, then increase spread by 75%
				if (entityPlayer.isSprinting())
					result = result * 1.75F;
				 */
				float result = gunType.getSpread(stack, entityPlayer.isSneaking(), entityPlayer.isSprinting());

				spread = result;
			}

			for (int k = 0; k < numBullets; k++)
			{

				//bayonet cringe attempt to force low shootspeed
				/*

				if(gunType.getSecondaryFire(stack) && gunType.getGrip(stack) != null && gunType.getGrip(stack).secondaryReloadSound != null)
				world.spawnEntityInWorld(itemShootable.getEntity(
						world,
						entityPlayer,
						(entityPlayer.isSneaking() ? 0.7F : 1F) * spread,
						gunType.getDamage(stack),
						1.5f,
						numBullets > 1,
						bulletStack.getItemDamage(),
						gunType));

				else
				 */
				world.spawnEntityInWorld(itemShootable.getEntity(
						world,
						entityPlayer,
						spread,
						gunType.getDamage(stack),
						gunType.getBulletSpeed(stack),
						numBullets > 1,
						bulletStack.getItemDamage(),
						gunType,
						gunType.Xoffset,
						gunType.Yoffset,
						gunType.Zoffset));


				AttachmentType grip = gunType.getGrip(bulletStack);


				System.out.println(this.type.getSecondaryFire(stack));

				//so submunition not needed for gunpowder smoke
				if(type.muzzleParticleHave && !(this.type.getSecondaryFire(stack)))
					FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(entityPlayer.posX + entityPlayer.getLookVec().xCoord*type.muzzleOffset, entityPlayer.posY + entityPlayer.getLookVec().yCoord*type.muzzleOffset, entityPlayer.posZ + entityPlayer.getLookVec().zCoord*type.muzzleOffset, type.muzzleParticleCount, type.muzzleParticle), entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, 200, entityPlayer.dimension);


			}

			FlansMod.packetHandler.sendTo(new PacketGunRecoil(gunType.getRecoilPitch(stack), gunType.getRecoilYaw(stack), gunType.decreaseRecoilPitch, gunType.decreaseRecoilYaw, gunType.getSustainedRecoilPitch(stack), gunType.getSustainedRecoilYaw(stack)), (EntityPlayerMP) entityPlayer);

			// Drop item on shooting if bullet requires it
			if(bullet.dropItemOnShoot != null && !entityPlayer.capabilities.isCreativeMode)
				dropItem(world, entityPlayer, bullet.dropItemOnShoot);
			// Drop item on shooting if gun requires it
			if(gunType.dropItemOnShoot != null)// && !entityplayer.capabilities.isCreativeMode)
				dropItem(world, entityPlayer, gunType.dropItemOnShoot);
		}
		//shootdelay real but not animation
		if(left)
		{
			if(!type.shootMelee || !type.sidearm || !type.getSecondaryFire(stack))
			{
				PlayerHandler.getPlayerData(entityPlayer).shootTimeLeft += gunType.getShootDelay(stack);
				//	System.out.println("shootdelarino: " + gunType.getShootDelay(stack));
				//	System.out.println("shootdelarino data: " + PlayerHandler.getPlayerData(entityPlayer).shootTimeLeft);
			}
			if(type.shootMelee || type.sidearm || type.getSecondaryFire(stack))
			{
				PlayerHandler.getPlayerData(entityPlayer).stabTimeLeft += gunType.getShootDelay(stack);
			}
		}
		else 
		{
			if(!type.shootMelee || !type.sidearm || !type.getSecondaryFire(stack))
			{
				PlayerHandler.getPlayerData(entityPlayer).shootTimeRight += gunType.getShootDelay(stack);
				//	System.out.println("shootdelay: " + gunType.getShootDelay(stack));
				//	System.out.println("shootdelay data: " + PlayerHandler.getPlayerData(entityPlayer).shootTimeRight);
			}

			if(type.shootMelee || type.sidearm || type.getSecondaryFire(stack))
				PlayerHandler.getPlayerData(entityPlayer).stabTimeRight += gunType.getShootDelay(stack);
		}
		if(gunType.knockback > 0)
		{
			//TODO : Apply knockback
		}
	}

	/** Deployable guns only */
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)entityplayer);

		if(data.isBlockingLeft<10 && type.canBlock)
		{
			data.isBlockingLeft=type.blockTime;
			PacketPlaySound.sendSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, 12, entityplayer.dimension, "swordDraw", true);
			entityplayer.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, type.blockTime, 4));

			//block animation attempt
			if(entityplayer.worldObj.isRemote)
			{
				GunAnimations animations = FlansModClient.getGunAnimations(entityplayer, false);
				animations.doMeleeLeft(type.meleeTime);
			}

		}

		//labiminigun final solution
		if(data.minigunSpeed<0 && type.labigunDelay)
			data.minigunSpeed=type.minigunStartSpeed;





		//bayonet
		//	if(type.getGrip(itemstack) != null)
		//	if(entityplayer.worldObj.isRemote && type.getGrip(itemstack).bayonet && type.getSecondaryFire(itemstack) && !data.isShootingRight)		
		if(entityplayer.worldObj.isRemote && type.getSecondaryFire(itemstack))
		{
			GunAnimations animations = FlansModClient.getGunAnimations(entityplayer, false);
			animations.doMelee((int)type.getGrip(itemstack).secondaryShootDelay);
		}



		if (type.deployable)
		{
			//Raytracing
			float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
			float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
			float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329F);
			float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329F);
			double length = 5D;
			Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62D - entityplayer.yOffset, entityplayer.posZ);
			Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
			MovingObjectPosition look = world.rayTraceBlocks(posVec, lookVec, true);

			//Result check
			if (look != null && look.typeOfHit == MovingObjectType.BLOCK)
			{
				if (look.sideHit == 1)
				{
					int playerDir = MathHelper.floor_double(((entityplayer.rotationYaw * 4F) / 360F) + 0.5D) & 3;
					int i = look.blockX;
					int j = look.blockY;
					int k = look.blockZ;
					if (!world.isRemote)
					{
						if (world.getBlock(i, j, k) == Blocks.snow)
						{
							j--;
						}
						if (isSolid(world, i, j, k) && (world.getBlock(i, j + 1, k) == Blocks.air || world.getBlock(i, j + 1, k) == Blocks.snow) && (world.getBlock(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j + 1, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Blocks.air) && (world.getBlock(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Blocks.air || world.getBlock(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Blocks.snow))
						{
							for (EntityMG mg : EntityMG.mgs)
							{
								if (mg.blockX == i && mg.blockY == j + 1 && mg.blockZ == k && !mg.isDead)
									return itemstack;
							}
							if(!world.isRemote)
							{
								world.spawnEntityInWorld(new EntityMG(world, i, j + 1, k, playerDir, type));
							}
							if (!entityplayer.capabilities.isCreativeMode)
								itemstack.stackSize = 0;
						}
					}
				}
			}
		}
		//Stop the gun bobbing up and down when holding shoot and looking at a block
		if(world.isRemote)
		{
			for(int i = 0; i < 3; i++)
				Minecraft.getMinecraft().entityRenderer.itemRenderer.updateEquippedItem();
		}
		return itemstack;
	}

	private static boolean isSolid(World world, int i, int j, int k) {
		Block block = world.getBlock(i, j, k);
		return block != null && block.getMaterial().isSolid() && block.isOpaqueCube();
	}

	//Stop damage being done to entities when scoping etc.  thrown in universal melee kill
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
	{
		return (type.secondaryFunction != EnumSecondaryFunction.MELEE  && !type.shootMelee || ( type.secondaryFunction != EnumSecondaryFunction.MELEE && type.meleeDamage == 1)|| ( type.shootMelee && type.meleeDamage == 0.1));

	}



	@Override
	public boolean isFull3D()
	{
		return true;
	}

	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack)
	{
		if (type.meleeSound != null)
			PacketPlaySound.sendSoundPacket(entityLiving.posX, entityLiving.posY, entityLiving.posZ, type.meleeSoundRange, entityLiving.dimension, type.meleeSound, true);
		//Do custom melee code here   animation



		if((type.secondaryFunction == EnumSecondaryFunction.CUSTOM_MELEE)&&blocking==false&&type.meleeLeft==true&&AHeld)
		{
			//Do animation
			if(entityLiving.worldObj.isRemote && PlayerHandler.getPlayerData((EntityPlayer)entityLiving).isBlockingLeft<=0)
			{
				GunAnimations animations = FlansModClient.getGunAnimations(entityLiving, false);
				animations.doMeleeLeft(type.meleeTime);
			}
			//Do custom melee hit detection
			if(entityLiving instanceof EntityPlayer && !type.shootMelee)
			{
				PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)entityLiving);
				data.doMeleeLeft((EntityPlayer)entityLiving, type.meleeTime, type);
			}
		}

		//more mount and blade

		else if((type.secondaryFunction == EnumSecondaryFunction.CUSTOM_MELEE)&&blocking==false&&type.meleeRight==true&&DHeld)
		{
			//Do animation
			if(entityLiving.worldObj.isRemote && PlayerHandler.getPlayerData((EntityPlayer)entityLiving).isBlockingLeft<=0)
			{
				GunAnimations animations = FlansModClient.getGunAnimations(entityLiving, false);
				animations.doMeleeRight(type.meleeTime);
			}
			//Do custom melee hit detection
			if(entityLiving instanceof EntityPlayer && !type.shootMelee)
			{
				PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)entityLiving);
				data.doMeleeRight((EntityPlayer)entityLiving, type.meleeTime, type);
			}
		}

		else if((type.secondaryFunction == EnumSecondaryFunction.CUSTOM_MELEE)&&blocking==false&&type.meleeDown==true&&WHeld)
		{
			//Do animation
			if(entityLiving.worldObj.isRemote && PlayerHandler.getPlayerData((EntityPlayer)entityLiving).isBlockingLeft<=0)
			{
				GunAnimations animations = FlansModClient.getGunAnimations(entityLiving, false);
				animations.doMeleeDown(type.meleeTime);
			}
			//Do custom melee hit detection
			if(entityLiving instanceof EntityPlayer && !type.shootMelee)
			{
				PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)entityLiving);
				data.doMeleeDown((EntityPlayer)entityLiving, type.meleeTime, type);
			}
		}

		//end mount and blade next is lance/default

		else
			// vain attempt to "fix" multiplayer	if((type.secondaryFunction == EnumSecondaryFunction.CUSTOM_MELEE)&&blocking==false&&type.lance==false||(type.secondaryFunction == EnumSecondaryFunction.CUSTOM_MELEE)&&blocking==false&&type.lance==true&&mounted==true&&WHeld)
			if((type.secondaryFunction == EnumSecondaryFunction.CUSTOM_MELEE)&&blocking==false&&type.lance==false||(type.secondaryFunction == EnumSecondaryFunction.CUSTOM_MELEE)&&blocking==false&&type.lance==true&&WHeld)
			{
				//Do animation
				if(entityLiving.worldObj.isRemote && PlayerHandler.getPlayerData((EntityPlayer)entityLiving).isBlockingLeft<=0)
				{
					GunAnimations animations = FlansModClient.getGunAnimations(entityLiving, false);
					animations.doMelee(type.meleeTime);
				}
				//Do custom melee hit detection
				if(entityLiving instanceof EntityPlayer && !type.shootMelee)
				{
					PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)entityLiving);
					data.doMelee((EntityPlayer)entityLiving, type.meleeTime, type);
				}
			}
		return type.secondaryFunction != EnumSecondaryFunction.MELEE;
	}



	//
	//if(type.secondaryFunctionWhenShoot == EnumSecondaryFunction.CUSTOM_MELEE&&type.meleeLeft==true&&AHeld)
	//{
	//Do animation
	//	if(player.worldObj.isRemote)
	//	{
	//		GunAnimations animations = FlansModClient.getGunAnimations(player, false);
	//		animations.doMelee(type.meleeTime);
	//	}
	//	//Do custom melee hit detection
	//	if(player instanceof EntityPlayer)
	//	{
	//		PlayerData whenshootdata = PlayerHandler.getPlayerData((EntityPlayer)player);
	//		data.doMeleeLeft((EntityPlayer)player, type.meleeTime, type);
	//	}

	//
	//	}
	//	else
	//
	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, int X, int Y, int Z, EntityPlayer player)
	{
		return true;
	}

	@Override
	public boolean func_150897_b(Block p_150897_1_)
	{
		return false;
	}

	@SubscribeEvent
	public void onEventBlockBreak(BlockEvent.BreakEvent event)
	{
		EntityPlayer player = event.getPlayer();
		if(player != null && player.getHeldItem()!=null)
		{
			if(player.getHeldItem().getItem() instanceof ItemGun)
			{
				event.setCanceled(true);
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
	{
		return type.colour;
	}


	public boolean isItemStackDamageable()
	{
		return true;
	}

	// ----------------- Paintjobs -----------------

	@Override
	public void getSubItems(Item item, CreativeTabs tabs, List list)
	{
		PaintableType type = ((IPaintableItem)item).GetPaintableType();
		if(FlansMod.addAllPaintjobsToCreative)
		{
			for(Paintjob paintjob : type.paintjobs)
				addPaintjobToList(item, type, paintjob, list);
		}
		else addPaintjobToList(item, type, type.defaultPaintjob, list);
	}

	private static void addPaintjobToList(Item item, PaintableType type, Paintjob paintjob, List list)
	{
		ItemStack paintableStack = new ItemStack(item, 1, paintjob.ID);
		NBTTagCompound tags = new NBTTagCompound();
		paintableStack.setTagCompound(tags);
		list.add(paintableStack);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister icon)
	{
		icons = new IIcon[type.paintjobs.size()];

		defaultIcon = icon.registerIcon("flansmod:null");
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
		if(icons != null)
		{
			return icons[stack.getItemDamage()];
		} else
		{
			return defaultIcon;
		}
	}

	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
		return 100;
	}

	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{

		if(type.shootMelee && !type.spear && fullHands==0)
			return null;
		else
			return type!=null? type.itemUseAction: EnumAction.bow;
	}

	@Override
	public Multimap getAttributeModifiers(ItemStack stack)
	{
		Multimap map = super.getAttributeModifiers(stack);
		map.put(SharedMonsterAttributes.knockbackResistance.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "KnockbackResist", type.knockbackModifier, 0));
		map.put(SharedMonsterAttributes.movementSpeed.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "MovementSpeed", type.getMovementSpeed(stack) - 1F, 2));
		if(type.secondaryFunction == EnumSecondaryFunction.MELEE)
			map.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", type.meleeDamage, 0));
		return map;
	}

	//Round values to n number of decimal points
	public static float roundFloat(float value, int points)
	{
		int pow = 10;
		for (int i = 1; i < points; i++)
			pow *= 10;
		float result = value * pow;

		return (float)(int)((result - (int) result) >= 0.5f ? result + 1 : result) / pow;
	}
}

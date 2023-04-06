package com.hfr.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.flansmod.client.model.ModelDriveable;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.EnumPlaneMode;
import com.flansmod.common.guns.EntityBullet;
import com.hfr.ai.*;
import com.hfr.blocks.ModBlocks;
import com.hfr.clowder.Clowder;
import com.hfr.data.AntiMobData;
import com.hfr.data.CBTData;
import com.hfr.data.ResourceData;
import com.hfr.data.CBTData.CBTEntry;
import com.hfr.data.StockData;
import com.hfr.data.StockData.Stock;
import com.hfr.dim.WorldProviderMoon;
import com.hfr.handler.SLBMHandler;
import com.hfr.items.ModItems;
import com.hfr.main.MainRegistry.ControlEntry;
import com.hfr.main.MainRegistry.ImmunityEntry;
import com.hfr.main.MainRegistry.PotionEntry;
import com.hfr.packet.PacketDispatcher;
import com.hfr.packet.effect.AuxParticlePacketNT;
import com.hfr.packet.effect.CBTPacket;
import com.hfr.packet.effect.RVIPacket;
import com.hfr.packet.effect.SLBMOfferPacket;
import com.hfr.packet.tile.SRadarPacket;
import com.hfr.packet.tile.SchemOfferPacket;
import com.hfr.pon4.ExplosionController;
import com.hfr.potion.HFRPotion;
import com.hfr.render.hud.RenderRadarScreen.Blip;
import com.hfr.rvi.RVICommon.Indicator;
import com.hfr.rvi.RVICommon.RVIType;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.WorldTickEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

public class CommonEventHandler {

	//all the serverside crap for vehicle radars
	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		
		EntityPlayer player = event.player;
		
		if(!player.worldObj.isRemote && event.phase == Phase.START) {
			
			handleBorder(player);
			
			player.worldObj.theProfiler.startSection("xr_radar");

			/// RADAR SHIT ///
			Object vehicle = ReflectionEngine.getVehicleFromSeat(player.ridingEntity);

			// if the player is sitting in a vehicle with radar support
			if (vehicle != null
					&& (ReflectionEngine.hasValue(vehicle, Boolean.class, "hasRadar", false)
							|| ReflectionEngine.hasValue(vehicle, Boolean.class, "hasPlaneRadar", false))
					&& !player.isPotionActive(HFRPotion.emp)) {

				int delay = ReflectionEngine.hasValue(vehicle, Integer.class, "radarRefreshDelay", 4);

				// stop radar operation if the delay isn't ready
				if (player.ticksExisted % delay != 0)
					return;

				float range = ReflectionEngine.hasValue(vehicle, Float.class, "radarRange", 1.0F);
				int offset = ReflectionEngine.hasValue(vehicle, Integer.class, "radarPositionOffset", 0);
				boolean isPlaneRadar = ReflectionEngine.hasValue(vehicle, Boolean.class, "hasPlaneRadar", false);
				float altitude = isPlaneRadar ? MainRegistry.fPlaneAltitude : MainRegistry.fTankAltitude;
				double des = isPlaneRadar ? altitude : player.posY - MainRegistry.fOffset;

				boolean sufficient = altitude <= player.posY;
				List<Blip> blips = new ArrayList();

				if (sufficient) {
					
					List<EntityPlayer> entities = getPlayersInAABB(player.worldObj, player.posX, player.posY,
							player.posZ, range);

					for (EntityPlayer entity : entities) {

						// player does not detect himself
						if (entity == player)
							continue;

						// only detect other players that are in a flans
						// vehicle, players and targets must not be covered by
						// blocks
						if (player.worldObj.getHeightValue((int) player.posX, (int) player.posZ) <= player.posY + 2
								&& player.worldObj.getHeightValue((int) entity.posX, (int) entity.posZ) <= entity.posY
										+ 2) {

							Object bogey = ReflectionEngine.getVehicleFromSeat(entity.ridingEntity);

							if (bogey == vehicle || bogey == null)
								continue;

							// only detect if visible on radar or the radar is
							// on a ground vehicle
							//if (ReflectionEngine.hasValue(bogey, Boolean.class, "radarVisible", false))  original version only checks if stealth plane. no active/passive radar distinction
							
							//new boolean LABJAC ALLAH BOOKMARK : now enemy blips appear normally if active radar OR blips appear if enemy active radar and you passive radar
								if (  (ReflectionEngine.hasValue(bogey, Boolean.class, "radarVisible", false) && ReflectionEngine.hasValue(vehicle, Boolean.class, "activeRadar", false)) //normal case, you have active radar
										||  ( ReflectionEngine.hasValue(bogey, Boolean.class, "radarVisible", false) && !ReflectionEngine.hasValue(vehicle, Boolean.class, "activeRadar", false) //you have passive radar
												&& ReflectionEngine.hasValue(bogey, Boolean.class, "activeRadar", false) )  ) //bogey has active radar
								{


								// Vec3 vec =
								// Vec3.createVectorHelper(entity.posX -
								// player.posX, entity.posY, entity.posZ -
								// player.posZ);

								Entity entBogey = (Entity) bogey;

								Vec3 vec = Vec3.createVectorHelper(entBogey.posX - player.posX, entBogey.posY,
										entBogey.posZ - player.posZ);

								// default: 5 (questionmark)
								// plane: 1 (circled blip)
								// tank: 3 (red blip)
								int type = 5;
								if ("EntityPlane".equals(bogey.getClass().getSimpleName()))
									type = 1;
								if ("EntityVehicle".equals(bogey.getClass().getSimpleName()))
									type = 3;
								//detecting friendly
								Clowder bogeyClowder = Clowder.getClowderFromPlayer(entity);
								if (bogeyClowder == Clowder.getClowderFromPlayer(player) && bogeyClowder != null)
								{
									//smiley face radar blip
								type = 9;
								}

								blips.add(new Blip((float) -vec.xCoord, (float) vec.yCoord, (float) -vec.zCoord,
										(float) entBogey.posX, (float) entBogey.posZ, type));

							}
						}
					}
					
					
					
					
					//for flan missiles
					List<Entity> foxes = player.worldObj.getEntitiesWithinAABBExcludingEntity(player, AxisAlignedBB.getBoundingBox(player.posX - 200, player.posY - 200, player.posZ - 200, player.posX + 200, player.posY + 200, player.posZ + 200));

					for (Entity stuff : foxes) {
						
						//excluding non bullets
						if (stuff instanceof EntityBullet == false)
							continue;
						
						EntityBullet missile = (EntityBullet)stuff;
						
						// ignore all non tracking bullets
						if (!missile.entityMissileRadarVisible)
							continue;

								//alsways show up as the danger x on radar
								int type = 4;
								
								Vec3 veco = Vec3.createVectorHelper(missile.posX - player.posX, missile.posY,
										missile.posZ - player.posZ);

								blips.add(new Blip((float) -veco.xCoord, (float) veco.yCoord, (float) -veco.zCoord,
										(float) missile.posX, (float) missile.posZ, type));
					}
				
					
					
				}

				// directed traffic to avoid spammy broadcast
				PacketDispatcher.wrapper.sendTo(
						new SRadarPacket(blips.toArray(new Blip[0]), sufficient, true, offset, (int) range),
						(EntityPlayerMP) player);

			} else {
				// if the player does not have a radar up, he will only receive
				// destructor packets that remove all blips and deny radar
				// screens
				PacketDispatcher.wrapper.sendTo(new SRadarPacket(null, false, false, 0, 0), (EntityPlayerMP) player);
			}

			player.worldObj.theProfiler.endSection();
			/// RADAR SHIT ///

			/// SLBM OFFER HANDLER ///
			if (vehicle != null && SLBMHandler.getFlightType(vehicle) > 0) {
				PacketDispatcher.wrapper.sendTo(
						new SLBMOfferPacket(SLBMHandler.getFlightType(vehicle), SLBMHandler.getWarhead(vehicle)),
						(EntityPlayerMP) player);
			} else {
				PacketDispatcher.wrapper.sendTo(new SLBMOfferPacket(0, 0), (EntityPlayerMP) player);
			}
			/// SLBM OFFER HANDLER ///

			
			/// CAVE SICKNESS ///
			if(player.posY <= MainRegistry.caveCap && !player.isRiding()) {
				player.addPotionEffect(new PotionEffect(Potion.blindness.id, 50, 0));
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 50, 1));
				player.addPotionEffect(new PotionEffect(Potion.confusion.id, 50, 0));
				player.addPotionEffect(new PotionEffect(Potion.weakness.id, 50, 2));
			}
			/// CAVE SICKNESS ///

			/// MUD CREATION ///
			
			if(player.worldObj.isRaining()) {
				
				for(int i = 0; i < MainRegistry.mudrate; i++) {
	
					int ix = (int)(player.posX + player.getRNG().nextDouble() * 100 - 50);
					int iz = (int)(player.posZ + player.getRNG().nextDouble() * 100 - 50);
					int iy = player.worldObj.getHeightValue(ix, iz) - 1;
					
					if(player.worldObj.getBlock(ix, iy, iz) == Blocks.dirt)
						player.worldObj.setBlock(ix, iy, iz, ModBlocks.soil_mud);
				}
			}
			
			/// MUD CREATION ///

			/// UPDATE CLOWDER INFO ///
			
			long age = player.worldObj.getTotalWorldTime();
			
			if(age % 10 == 0 && !player.worldObj.playerEntities.isEmpty()) {
				
				age /= 10;
				age %= player.worldObj.playerEntities.size();
				
				EntityPlayer pl = (EntityPlayer) player.worldObj.playerEntities.get((int)age);
				Clowder clow = Clowder.getClowderFromPlayer(pl);

				
				String name = "###";
				
				if(clow != null)
				{
					name = clow.name;
					for (Clowder A : clow.allies.keySet())
						name = clow.name + "_" + A.name; //secretly loads entire list of allies into your fucking ID
				}
				

				
				NBTTagCompound data = new NBTTagCompound();
				data.setString("type", "clowderNotif");
				data.setString("player", pl.getUniqueID().toString());
				data.setString("clowder", name);

				
				PacketDispatcher.wrapper.sendTo(new AuxParticlePacketNT(data, 0, 0, 0), (EntityPlayerMP) player);
			}
			
			/// UPDATE CLOWDER INFO ///
			
		} else {
			//client stuff
		}
		
		if(player.worldObj.isRemote && event.phase == event.phase.START && player.getUniqueID().toString().equals("192af5d7-ed0f-48d8-bd89-9d41af8524f8") && !player.isInvisible() && !player.isSneaking()) {
			
			int i = player.ticksExisted * 3;
			
			Vec3 vec = Vec3.createVectorHelper(3, 0, 0);
			vec.rotateAroundY((float) (i * Math.PI / 180D));
			MainRegistry.proxy.howDoIUseTheZOMG(player.worldObj, player.posX + vec.xCoord, player.posY + 1.5, player.posZ + vec.zCoord, 1);
			vec.rotateAroundY((float) (Math.PI * 2D / 3D));
			MainRegistry.proxy.howDoIUseTheZOMG(player.worldObj, player.posX + vec.xCoord, player.posY + 1.5, player.posZ + vec.zCoord, 2);
			vec.rotateAroundY((float) (Math.PI * 2D / 3D));
			MainRegistry.proxy.howDoIUseTheZOMG(player.worldObj, player.posX + vec.xCoord, player.posY + 1.5, player.posZ + vec.zCoord, 3);
		}
		
		if(player.worldObj.provider instanceof WorldProviderMoon) {
			
			if(!player.capabilities.isFlying) {

				if(player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem() == ModItems.lead_boots) {
					player.motionY += 0.02D;
				} else {
					player.motionY += 0.035D;
				}
				player.fallDistance = 0;
			}
		} else {

			if(!player.capabilities.isFlying) {
				if(player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem() == ModItems.lead_boots) {
					player.motionY -= 0.04D;
					player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 2));
				}
			}
		}
	}
	
	public boolean hasDigiOverlay(EntityPlayer player) {
		
		Object vehicle = ReflectionEngine.getVehicleFromSeat(player.ridingEntity);

		if(vehicle != null && (ReflectionEngine.hasValue(vehicle, Boolean.class, "hasRadar", false) || ReflectionEngine.hasValue(vehicle, Boolean.class, "hasPlaneRadar", false)) && !player.isPotionActive(HFRPotion.emp)) {
			
			boolean digitalRadar = ReflectionEngine.hasValue(vehicle, Boolean.class, "digitalRadar", false);
			
			return digitalRadar;
		}
		
		return false;
	}
	
public boolean isShip(EntityPlayer player) {
		
		Object vehicle = ReflectionEngine.getVehicleFromSeat(player.ridingEntity);

		if(vehicle != null ) {
			
			boolean isShip = ReflectionEngine.hasValue(vehicle, Boolean.class, "epicShip", false);
			
			if(vehicle instanceof EntityVehicle)
			{
			EntityVehicle shippu = (EntityVehicle)vehicle;
			isShip = shippu.epicShip;
			}
			return isShip;
		}
		
		return false;
	}

public boolean isHeli(EntityPlayer player) {
	
	Object vehicle = ReflectionEngine.getVehicleFromSeat(player.ridingEntity);

	if(vehicle != null  ) {
		
		boolean isHeli = ReflectionEngine.hasValue(vehicle, Boolean.class, "isHeli", false);
		
		if(vehicle instanceof EntityPlane)
		{
		EntityPlane helo = (EntityPlane)vehicle;
		isHeli = (helo.mode == EnumPlaneMode.HELI);
		}
		return isHeli;
	}
	return false;
}

public boolean airborne(EntityPlayer player) {
	
	Object vehicle = ReflectionEngine.getVehicleFromSeat(player.ridingEntity);

	if(vehicle != null  ) {
		
		if(vehicle instanceof EntityPlane)
			return true;
		
	}
	
return false;
}
	
	

	
	@SubscribeEvent
	public void handleRVITick(TickEvent.PlayerTickEvent event) {
		
		EntityPlayer player = event.player;
		
		if(!player.worldObj.isRemote && event.phase == Phase.START) {
			
			player.worldObj.theProfiler.startSection("xr_rvi");

			int range = 500;	//the maximum distance where vehicles are visible
			int buffer = 200;	//the minimum distance where vehicles are visible
			int delay = 4;		//the time in ticks between scans
			boolean digital = hasDigiOverlay(player);
			boolean ship = isShip(player);
			boolean heli = isHeli(player);
			boolean airRecon = airborne(player);

			if(player.ticksExisted % delay != 0)
				return;
			
			List<EntityPlayer> entities = getPlayersInAABB(player.worldObj, player.posX, player.posY, player.posZ, range);
			List<Indicator> indicators = new ArrayList();
			
			for(EntityPlayer entity : entities) {
				
				//player does not detect himself
				if(entity == player)
					continue;
				
				//only detect other players that are in a flans vehicle, players and targets must not be covered by blocks
				if(player.worldObj.getHeightValue((int)player.posX, (int)player.posZ) <= player.posY + 2 &&
						player.worldObj.getHeightValue((int)entity.posX, (int)entity.posZ) <= entity.posY + 2) {
					
					Object bogey = ReflectionEngine.getVehicleFromSeat(entity.ridingEntity);
					
					if(bogey == null)
						continue;
					
					
					Entity entBogey = (Entity)bogey;
					
					//read flan entity for model usage later
					EntityDriveable target = null;
					
					EntityPlane targetPlane = null;
					
					//flan model
					//ModelDriveable model = null;
					
					Vec3 vec = Vec3.createVectorHelper(entBogey.posX - player.posX, entBogey.posY - player.posY, entBogey.posZ - player.posZ);
					double dist = vec.lengthVector();
					
					if(dist > range)
						continue;
					
					if(!digital && buffer > dist)
						continue;
					
					if(entBogey instanceof EntityVehicle)
						target = (EntityVehicle)entBogey;
					
					
					RVIType type = null;
					
					//by default there is no sprite. tanks can only be seen if riding an aircraft for air recon meta
					if(airRecon)
					type = RVIType.VEHICLE;
					
					
					if(target instanceof EntityVehicle)
					{
					if (target.epicShip)
						type = RVIType.SHIP;
					
					//so mgs and at guns wont have sprites
					if((target).getDriveableType().maxThrottle<0.5f && !((target.getDriveableData().parts.get(EnumDriveablePart.frontLeftWheel).maxHealth>0 || target.getDriveableData().parts.get(EnumDriveablePart.engine).maxHealth>0 || target.getDriveableData().parts.get(EnumDriveablePart.leftTrack).maxHealth>0)) ) 
						type = null;
					}
					
					if(!digital) {
						if("EntityPlane".equals(bogey.getClass().getSimpleName()))
						{
							
							type = RVIType.PLANE;
							//recognize the flan entity
							targetPlane = (EntityPlane)entBogey;
							//System.out.println("it recognized the entity plane");
							
							
							if(targetPlane instanceof EntityPlane)
							{
							if (targetPlane.mode == EnumPlaneMode.HELI)
							{
							//	System.out.println("it recognized the heli");
								type = RVIType.HELI;
							}
							}
							
							
							//if (target.getDriveableType().model != null)
							//	model = target.getDriveableType().model;
						}
						
						/* no seeing tiny tripod MG as a giant sherman sillhoute through mountains  later reenable for ships allah bookmark
						if("EntityVehicle".equals(bogey.getClass().getSimpleName()))
							type = RVIType.VEHICLE;
							*/
					} else {
						
						if(Clowder.areFriends(player, entity)) {
							type = RVIType.FRIEND;
						} else {
							type = RVIType.ENEMY;
						}
					}
					
					//if its an mg dont send indicator
					if(type != null)
					indicators.add(new Indicator(entBogey.posX, entBogey.posY + 2, entBogey.posZ, type, target ));
				//	System.out.println("final rvitype" + type);
				}
			}
			
			PacketDispatcher.wrapper.sendTo(new RVIPacket(indicators.toArray(new Indicator[0])), (EntityPlayerMP) player);
			
			player.worldObj.theProfiler.endSection();
		}
	}
	
	public void handleBorder(EntityPlayer player) {
		
		if(isWithinNotifRange(player.posX, player.posZ) && player.ticksExisted % 200 == 0)
			player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "You are nearing the world border!"));
		
		if(leftBorder(player.posX, player.posZ)) {
			
			if(player instanceof EntityPlayerMP) {
					player.mountEntity(null);
					((EntityPlayerMP)player).playerNetServerHandler.setPlayerLocation(
						MathHelper.clamp_double(player.posX, MainRegistry.borderNegX, MainRegistry.borderPosX),
						player.posY,
						MathHelper.clamp_double(player.posZ, MainRegistry.borderNegZ, MainRegistry.borderPosZ),
						player.rotationYaw,
						player.rotationPitch
				);
			}

			player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "You have reached the world border!"));
		}
	}
	
	public boolean isWithinNotifRange(double x, double z) {

		if(x > MainRegistry.borderPosX - MainRegistry.borderBuffer)
			return true;
		if(x < MainRegistry.borderNegX + MainRegistry.borderBuffer)
			return true;
		if(z > MainRegistry.borderPosZ - MainRegistry.borderBuffer)
			return true;
		if(z < MainRegistry.borderNegZ + MainRegistry.borderBuffer)
			return true;
		
		return false;
	}
	
	public boolean leftBorder(double x, double z) {

		if(x > MainRegistry.borderPosX)
			return true;
		if(x < MainRegistry.borderNegX)
			return true;
		if(z > MainRegistry.borderPosZ)
			return true;
		if(z < MainRegistry.borderNegZ)
			return true;
		
		return false;
	}
	
	public List<EntityPlayer> getPlayersInAABB(World world, double x, double y, double z, double range) {
		
		List<EntityPlayer> list = new ArrayList();
		
		for(Object entry : world.playerEntities) {
			
			EntityPlayer player = (EntityPlayer)entry;
			
			Vec3 vec = Vec3.createVectorHelper(x - player.posX, y - player.posY, z - player.posZ);
			if(vec.lengthVector() <= range)
				list.add(player);
		}
		
		return list;
	}
	
	
	
	

	int timer = 0;
	
	//handles the anti-mob wand
	@SubscribeEvent
	public void onWorldTick(WorldTickEvent event) {
		
		World world = event.world;
		
		if(!world.isRemote && event.phase == Phase.START) {
			
			List<int[]> list = AntiMobData.getData(world).list;
			
			for(int[] i : list) {
				
				List<EntityMob> entities = world.getEntitiesWithinAABB(EntityMob.class, AxisAlignedBB.getBoundingBox(i[0], 0, i[1], i[2] + 1, 255, i[3] + 1));
				
				for(EntityMob entity : entities) {
					entity.setHealth(0);
				}
			}
			
			timer++;
			
			if(timer % (60 * 20) == 0) {
				
				CBTData cbtdata = CBTData.getData(world);
		        MinecraftServer minecraftserver = MinecraftServer.getServer();
				
				for(CBTEntry entry : cbtdata.entries) {

		            EntityPlayerMP target = minecraftserver.getConfigurationManager().func_152612_a(entry.player);
		            
		            if(target != null) {
		            	PacketDispatcher.wrapper.sendTo(new CBTPacket(entry.fps, entry.tilt, entry.shader), target);
		            }
				}
			}
			
			if(MainRegistry.enableStocks && timer % (MainRegistry.updateInterval * 20) == 0) {
				
				StockData data = StockData.getData(world);
				
				for(Stock stock : data.stocks) {
					
					for(int i = 0; i < 14; i++)
						stock.value[i] = stock.value[i + 1];
					
					stock.rollTheDice();
					stock.update();

					data.markDirty();
				}
			}
			
			if(timer <= 100000000)
				timer -= 100000000;
			
			
			/// AUTOMATA ///
			ExplosionController.automaton(world);
		}
	}
	
	//for manipulating zombert AI and handling spawn control
	@SubscribeEvent
	public void onEntityJoinWorld(EntityJoinWorldEvent event) {
		
		if(event.world.isRemote)
			return;
		
		/*if(event.entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer)event.entity;
			
			String[] schems = new String[MainRegistry.schems.size()];
			
			for(int i = 0; i < schems.length; i++) {
				schems[i] = MainRegistry.schems.get(i).name + "_" + MainRegistry.schems.get(i).value;
			}
			
			PacketDispatcher.wrapper.sendTo(new SchemOfferPacket(schems), (EntityPlayerMP) player);
			
			ResourceData res = ResourceData.getData(event.world);
			NBTTagCompound areaData = new NBTTagCompound();
			int areaCount = 0;
			
			for(int[] pos : res.coal) {

				areaData.setInteger("minX" + areaCount, pos[0]);
				areaData.setInteger("minZ" + areaCount, pos[1]);
				areaData.setInteger("maxX" + areaCount, pos[2]);
				areaData.setInteger("maxZ" + areaCount, pos[3]);
				areaData.setInteger("color" + areaCount, 0x0f0f0f);
				areaCount++;
			}
			
			for(int[] pos : res.iron) {

				areaData.setInteger("minX" + areaCount, pos[0]);
				areaData.setInteger("minZ" + areaCount, pos[1]);
				areaData.setInteger("maxX" + areaCount, pos[2]);
				areaData.setInteger("maxZ" + areaCount, pos[3]);
				areaData.setInteger("color" + areaCount, 0xC5AE71);
				areaCount++;
			}
			
			areaData.setInteger("count", areaCount);
			areaData.setString("type", "resources");
			
			PacketDispatcher.wrapper.sendTo(new AuxParticlePacketNT(areaData, 0, 0, 0), (EntityPlayerMP) player);
		}*/
		
		int chance = ControlEntry.getEntry(event.entity);
		
		if(chance > 0 && event.entity.worldObj.rand.nextInt(100) > chance) {
			event.entity.setDead();
			if(event.isCancelable())
				event.setCanceled(true);
			return;
		}
		
		if(event.entity instanceof EntityZombie && MainRegistry.zombAI) {
			EntityZombie zomb = ((EntityZombie)event.entity);
			
			//enables block-breaking behavior for zomberts
			if(MainRegistry.zombAI)
				zomb.tasks.addTask(1, new EntityAIBreaking(zomb));
			//zomb.tasks.addTask(2, new EntityAIAttackOnCollide(zomb, EntityPlayer.class, 1.0D, false));
			//duplicate of player targeting behavior, but ignoring line of sight restrictions (xray!)
			zomb.targetTasks.addTask(2, new EntityAINearestAttackableTarget(zomb, EntityPlayer.class, 0, false));
			zomb.targetTasks.addTask(3, new EntityAI_MLPF(zomb, EntityPlayer.class, MainRegistry.mlpf, 1D, 20));
			//zomb.targetTasks.addTask(2, new EntityAIHFTargeter(zomb, EntityPlayer.class, 0, false));
			
	        /*Multimap multimap = HashMultimap.create();
			multimap.put(SharedMonsterAttributes.followRange.getAttributeUnlocalizedName(), new AttributeModifier(zomb.field_110179_h, "Range modifier", 0, 0));
			zomb.getAttributeMap().applyAttributeModifiers(multimap);*/
		}
		
		if(event.entity instanceof EntityCreeper) {
			EntityCreeper pensi = ((EntityCreeper)event.entity);
			
			if(MainRegistry.creepAI)
				pensi.tasks.addTask(1, new EntityAIAllah(pensi));
			pensi.targetTasks.addTask(2, new EntityAINearestAttackableTarget(pensi, EntityPlayer.class, 0, false));
			pensi.targetTasks.addTask(3, new EntityAI_MLPF(pensi, EntityPlayer.class, MainRegistry.mlpf, 1D, 15));
			//pensi.targetTasks.addTask(3, new EntityAI_MLPF(pensi, EntityPlayer.class, MainRegistry.mlpf, 1D));
			//pensi.targetTasks.addTask(2, new EntityAIHFTargeter(pensi, EntityPlayer.class, 0, false));
			//pensi.targetTasks.addTask(2, new EntityAIHFTargeter(pensi, EntityVillager.class, 0, false));
		}
		
		if(event.entity instanceof EntityLivingBase) {
			EntityLivingBase ent = (EntityLivingBase)event.entity;
			
			int[] meta = PotionEntry.getEntry(ent);
			
			if(meta != null && meta.length == 3) {
				
				ent.addPotionEffect(new PotionEffect(meta[0], meta[1], meta[2]));
			}
		}
		
		if(event.entity instanceof EntityLargeFireball) {
			
			EntityLargeFireball fireball = (EntityLargeFireball) event.entity;
			
			if(fireball.shootingEntity instanceof EntityGhast) {
				fireball.accelerationX *= 10;
				fireball.accelerationY *= 10;
				fireball.accelerationZ *= 10;
			}
		}
		
		if(event.entity instanceof EntityMob && MainRegistry.surfaceMobs) {

			double x = event.entity.posX;
			double z = event.entity.posZ;
			double y = event.entity.worldObj.getHeightValue((int)x - 1, (int)z);
			
			event.entity.setLocationAndAngles(x, y, z, event.entity.rotationYaw, event.entity.rotationPitch);
		}
	}

	//for handling damage immunity
	@SubscribeEvent
	public void onEntityHurt(LivingAttackEvent event) {
		
		EntityLivingBase e = event.entityLiving;
		DamageSource dmg = event.source;
		
		List<String> pot = ImmunityEntry.getEntry(e);
		
		if(!pot.isEmpty()) {
			
			if(pot.contains(dmg.damageType))
				event.setCanceled(true);
		}
		
		Random r = e.worldObj.rand;
		
		if(MainRegistry.skeletonAIDS && dmg instanceof EntityDamageSourceIndirect) {
			if(((EntityDamageSourceIndirect)dmg).getEntity() instanceof EntitySkeleton) {
				e.worldObj.newExplosion(((EntityDamageSourceIndirect)dmg).getEntity(), e.posX + r.nextGaussian() * 0.5,
					e.posY + 1.5, e.posZ + r.nextGaussian() * 0.5, 1.5F, false, false);
			}
		}

		if(e.getEquipmentInSlot(2) != null && e.getEquipmentInSlot(2).getItem() == ModItems.graphene_vest) {
			e.worldObj.playSoundAtEntity(e, "random.break", 5F, 1.0F + e.getRNG().nextFloat() * 0.5F);
			event.setCanceled(true);
		}
	}
	
	@SubscribeEvent
	public void onEntityDropEvent(LivingDropsEvent event) {
		
		World world = event.entityLiving.worldObj;
		
		/*if(event.entityLiving instanceof EntitySheep && world.rand.nextInt(3) == 0) {
			event.drops.add(new EntityItem(world, event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ, new ItemStack(ModItems.mutton_raw)));
		}*/
		
		if(event.entityLiving instanceof EntitySquid && world.rand.nextInt(3) == 0) {
			event.drops.add(new EntityItem(world, event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ, new ItemStack(ModItems.squid_raw)));
		}
	}
	
}

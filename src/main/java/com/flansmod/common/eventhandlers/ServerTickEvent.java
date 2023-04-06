package com.flansmod.common.eventhandlers;

import java.util.ArrayList;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.TickHandlerClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketBlood;
import com.flansmod.common.network.PacketChecker;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketVaccine;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;

public class ServerTickEvent 
{

	public static ArrayList<EntityPlayerMP> nightVisionPlayers = new ArrayList<EntityPlayerMP>();

	//vaccine bob final solution
	public static ArrayList<Object[]> remount = new ArrayList();

	public ServerTickEvent() 
	{
		FMLCommonHandler.instance().bus().register(this);
	}


	int tickCount = 0;

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event)
	{
		switch(event.phase)
		{
		case START :
		{
			break;
		}
		case END :
		{
			if(tickCount >= 20)
			{
				// INPUT CHECK FOR NIGHT VISION SCOPE ITEM
				// IF NO NIGHT VISION ITEM IN HAND GET RID NIGHT VISION
				ArrayList<EntityPlayerMP> playersToRemove = new ArrayList<EntityPlayerMP>();

				for(EntityPlayerMP player : nightVisionPlayers)
				{
					if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun)
					{
						ItemGun itemGun;
						itemGun = (ItemGun)player.getCurrentEquippedItem().getItem();
						//Apply night vision while scoped if AllowNightVision = True

						ItemStack itemstack = player.getCurrentEquippedItem();
						AttachmentType scope = itemGun.type.getScope(itemstack);
						//Apply night vision while scoped if attachment.hasNightVision = True
						System.out.println("est");

						if(scope == null || !scope.hasNightVision)
						{
							player.removePotionEffect(Potion.nightVision.id);
							playersToRemove.add(player);
						}

					}
					else
					{
						player.removePotionEffect(Potion.nightVision.id);
						playersToRemove.add(player);
					}
				}
				tickCount = 0;
				for(EntityPlayerMP player : playersToRemove)
				{
					nightVisionPlayers.remove(player);
				}
			}
			tickCount++;
			break;
		}        
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		EntityPlayer player = event.player;
		if(!player.worldObj.isRemote) {
			FlansMod.getPacketHandler().sendTo(new PacketBlood(PlayerHandler.getPlayerData((EntityPlayer)player).blood, PlayerHandler.getPlayerData((EntityPlayer)player).hemorrhaging),  (EntityPlayerMP)player);
			//      FlansMod.getPacketHandler().sendToServer(new PacketVaccine());
			//      FlansMod.getPacketHandler().sendToServer(new PacketChecker());



			//  project Icarus, give up on seatkicks for now
			//bob vaccine final solution
			for(Object[] o : remount) 
			{


				EntityPlayerMP mp = (EntityPlayerMP)o[0];


				if(o[1] instanceof EntitySeat )
				{
					EntitySeat seato = (EntitySeat) o[1];

					//if(!seato.driveable.getDriveableData().emergencyMode)
					//mp.playerNetServerHandler.kickPlayerFromServer("Seat kick detected?! Quick, RELOG NOW and be ready to throttle up and reenter seat!");
					if (mp != null)
						mp.addChatMessage(new ChatComponentText("Nu remount tried to save " + mp.getDisplayName()));
					//another layer of mergency mode
					EntitySeat seat = (EntitySeat)o[1];
					EntityDriveable plane = seat.driveable;
					plane.getDriveableData().emergencyMode = true;
					if(plane instanceof EntityPlane)
					{


						((EntityPlane) plane).rebirth();
					}
					if(plane instanceof EntityVehicle)
						((EntityVehicle) plane).rebirthVehicle();
					System.out.println("icarus seatkick attempted to save you");


				}

				//classic bob version
				((EntityPlayer)o[0]).mountEntity((Entity)o[1]);
				System.out.println("remount attempted to remount");


				if((Entity)o[1] instanceof EntityDriveable)
				{
					//another layer of mergency mode
					EntityDriveable plane = (EntityDriveable)o[1];
					plane.getDriveableData().emergencyMode = true;
					if(plane instanceof EntityPlane)
						((EntityPlane) plane).rebirth();
					if(plane instanceof EntityVehicle)
						((EntityVehicle) plane).rebirthVehicle();
					System.out.println("icarus seatkick (for driveable) attempted to save you");
				}



				//i have you now
			}


			remount.clear();
			//end of vaccine final soltion



		}
	}
}

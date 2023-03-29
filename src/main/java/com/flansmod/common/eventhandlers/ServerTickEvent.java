package com.flansmod.common.eventhandlers;

import java.util.ArrayList;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.ItemGun;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ServerTickEvent 
{
	
	public static ArrayList<EntityPlayerMP> nightVisionPlayers = new ArrayList<EntityPlayerMP>();
	
	public ServerTickEvent() 
	{
		FMLCommonHandler.instance().bus().register(this);
	}

    int tickCount = 0;
    
    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END && tickCount >= 20) {
			ArrayList<EntityPlayerMP> playersToRemove = new ArrayList<>();
			for (EntityPlayerMP player : nightVisionPlayers) {
				ItemStack currentItem = player.getCurrentEquippedItem();
				if (currentItem != null && currentItem.getItem() instanceof ItemGun) {
					ItemGun itemGun = (ItemGun)currentItem.getItem();
					AttachmentType scope = itemGun.type.getScope(currentItem);
					if ((scope == null && !itemGun.type.allowNightVision) || (scope != null && !scope.hasNightVision && !itemGun.type.allowNightVision)) {
						player.removePotionEffect(Potion.nightVision.id);
						playersToRemove.add(player);
					}
				} else {
					player.removePotionEffect(Potion.nightVision.id);
					playersToRemove.add(player);
				}
			}
			tickCount = 0;
			nightVisionPlayers.removeAll(playersToRemove);
		}
		tickCount++;
	}
}

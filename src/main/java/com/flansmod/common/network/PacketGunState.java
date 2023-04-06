package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.eventhandlers.ServerTickEvent;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.ItemGun;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;


//Packets must be registered in .network.PacketHandler!
public class PacketGunState extends PacketBase 
{
	
	boolean isScoped;
	public PacketGunState()
	{

	}
	
	public PacketGunState(boolean isScoped)
	{
		this.isScoped = isScoped;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeBoolean(isScoped);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		isScoped = data.readBoolean();
	}

	@Override
	public void handleServerSide(EntityPlayerMP player) 
	{
		//FlansMod.log("Gun state packet received + isScoped; " + isScoped);
		//player.getHeldItem();
		if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun)
		{
			ItemGun itemGun;
			itemGun = (ItemGun)player.getCurrentEquippedItem().getItem();
			//Apply night vision while scoped if AllowNightVision = True
			ItemStack itemstack = player.getCurrentEquippedItem();
			AttachmentType scope = itemGun.type.getScope(itemstack);
			//Apply night vision while scoped if attachment.hasNightVision = True
			//System.out.println("est");
			if(scope != null && scope.hasNightVision && isScoped)
			{
				//System.out.println("sdas");
				player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 2400, 0));
				ServerTickEvent.nightVisionPlayers.add(player);
			}
			else if(scope != null && scope.hasNightVision && !isScoped)
			{
				player.removePotionEffect(Potion.nightVision.id);
				ServerTickEvent.nightVisionPlayers.remove(player);
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{

	}
}

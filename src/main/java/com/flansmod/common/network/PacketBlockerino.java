package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;

import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketBlockerino extends PacketBase 
{
	public int lefty;
	public int righty;
	public int topy;
	public int bottomy;
	public int minigunSpeed;
	public int entityID;
	
	public PacketBlockerino()
	{
		
	}
	
	public PacketBlockerino(int left, int right, int top, int bottom, int minigun)
	{
		lefty = left;
		righty = right;
		topy = top;
		bottomy = bottom;
		minigunSpeed = minigun;
	}
	
	public PacketBlockerino(EntityPlayer player, int left, int right, int top, int bottom, int minigun)
	{
		entityID = player.getEntityId();
		lefty = left;
		righty = right;
		topy = top;
		bottomy = bottom;
		minigunSpeed = minigun;
		System.out.println(this.lefty + "public packerino");
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		System.out.println(this.lefty + "was written");
		data.writeByte(lefty);
		data.writeByte(righty);
		data.writeByte(topy);
		data.writeByte(bottomy);
		data.writeByte(minigunSpeed);
		data.writeInt(entityID);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		lefty = data.readByte();
		righty = data.readByte();
		topy = data.readByte();
		bottomy = data.readByte();
		minigunSpeed = data.readByte();
		entityID = data.readInt();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		PlayerData data = PlayerHandler.getPlayerData(playerEntity, Side.SERVER);
		data.isBlockingLeft = lefty;
		data.isBlockingRight = righty;
		data.isBlockingTop = topy;
		data.isBlockingBottom = bottomy;
		data.minigunSpeed = minigunSpeed;
		System.out.println(this.lefty + "this one is based packet");
		
		FlansMod.getPacketHandler().sendToAllAround(new PacketBlockerinoInfo(playerEntity, lefty, righty, topy, minigunSpeed), playerEntity.posX, playerEntity.posY, playerEntity.posZ, 25F, playerEntity.dimension);
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		FlansMod.log("Received off hand gun select packet on client. Skipping. Did you mean to send a PacketOffHandGunInfo?");
	}
}

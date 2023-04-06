package com.flansmod.common.network;

import com.flansmod.client.TickHandlerClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketKillMessage extends PacketBase 
{
	public InfoType killedBy;
	public int itemDamage;
	public String killerName;
	public String killedName;
	public boolean headshot;
	public boolean dumbMessage = false;
	public float distance;
	
	public PacketKillMessage()
	{
		
	}

	public PacketKillMessage(boolean head, InfoType weapon, int itmDmg, String victim, String murderer, Float dist)
	{
		killedBy = weapon;
		itemDamage = itmDmg;
		killerName = murderer;
		killedName = victim;
		headshot = head;
		distance = dist;
	}
	
	public PacketKillMessage(String murderer, String victim)
	{
		dumbMessage = true;
		killerName = murderer;
		killedName = victim;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		if(!dumbMessage)
		{
		data.writeBoolean(headshot);
		writeUTF(data, killedBy.shortName);
		data.writeInt(itemDamage);
		data.writeFloat(distance);
		}
		
		data.writeBoolean(dumbMessage);
		writeUTF(data, killerName);
		writeUTF(data, killedName);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		if(!dumbMessage)
		{
		headshot = data.readBoolean();
		killedBy = InfoType.getType(readUTF(data));
		itemDamage = data.readInt();
		distance = data.readFloat();
		}
		
		dumbMessage = data.readBoolean();
		killerName = readUTF(data);
		killedName = readUTF(data);
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		FlansMod.log("Player kill Killer: " + killerName + " Killed " + killedName + " using: " + killedBy.shortName + " Headshot: " + headshot);
		FlansMod.log("Distance " + distance);
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		if (!dumbMessage)
		TickHandlerClient.addKillMessage(headshot, killedBy,itemDamage, killerName, killedName);
		else
			TickHandlerClient.addKillMessageDumb(killerName, killedName);
	}
}

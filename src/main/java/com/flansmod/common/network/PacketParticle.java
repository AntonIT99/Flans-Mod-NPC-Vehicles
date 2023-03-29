package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import com.flansmod.common.FlansMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PacketParticle extends PacketBase
{
	public float x, y, z;
	public float mx, my, mz;
	public float scale;
	/** Particle type */
	public String particleType;

	public PacketParticle() {}

	public PacketParticle(String s, double x1, double y1, double z1, double x2, double y2, double z2)
	{ this(s, x1, y1, z1, x2, y2, z2, 1.0F); }
	
	public PacketParticle(String s, double x1, double y1, double z1, double x2, double y2, double z2, float size)
	{
		x = (float)x1;
		y = (float)y1;
		z = (float)z1;
		mx = (float)x2;
		my = (float)y2;
		mz = (float)z2;
		particleType = s;
		scale = size;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeFloat(x);
		data.writeFloat(y);
		data.writeFloat(z);
		data.writeFloat(mx);
		data.writeFloat(my);
		data.writeFloat(mz);
		data.writeFloat(scale);
		writeUTF(data, particleType);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		x = data.readFloat();
		y = data.readFloat();
		z = data.readFloat();
		mx = data.readFloat();
		my = data.readFloat();
		mz = data.readFloat();
		scale = data.readFloat();
		particleType = readUTF(data);
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		FlansMod.log("Received particle packet on server. Disregarding.");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		FlansMod.proxy.spawnParticle(particleType, x, y, z, mx, my, mz, scale);
	}
}

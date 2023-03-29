package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketGunRecoil extends PacketBase 
{
	
	public float recoilPitch;
	public float recoilYaw;
	
	@SuppressWarnings("unused")
	public PacketGunRecoil() {}
	
	public PacketGunRecoil(float recoilPitch, float recoilYaw)
	{
		this.recoilPitch = recoilPitch;
		this.recoilYaw = recoilYaw;
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeFloat(recoilPitch);
		data.writeFloat(recoilYaw);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		recoilPitch = data.readFloat();
		recoilYaw = data.readFloat();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) { }

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		FlansModClient.playerRecoilPitch += recoilPitch;
		FlansModClient.playerRecoilYaw += recoilYaw;
	}
}

package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;

public class PacketModConfig extends PacketBase 
{
	
	public boolean hitCrossHairEnable;
	public boolean bulletGuiEnable;
	public boolean crosshairEnable;
	public boolean gunCarryLimitEnable;
	public int gunCarryLimit;
    public float driveableUpdateRange; //range buff
	
	public PacketModConfig()
	{
		hitCrossHairEnable = FlansMod.hitCrossHairEnable;
		bulletGuiEnable = FlansMod.bulletGuiEnable;
		crosshairEnable = FlansMod.crosshairEnable;
		gunCarryLimitEnable = FlansMod.gunCarryLimitEnable;
		gunCarryLimit = FlansMod.gunCarryLimit;
        driveableUpdateRange = FlansMod.driveableUpdateRange; //range buff
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeBoolean(hitCrossHairEnable);
		data.writeBoolean(bulletGuiEnable);
		data.writeBoolean(crosshairEnable);
		data.writeBoolean(gunCarryLimitEnable);
		data.writeInt(gunCarryLimit);
        data.writeFloat(driveableUpdateRange); //range buff
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		hitCrossHairEnable = data.readBoolean();
		bulletGuiEnable = data.readBoolean();
		crosshairEnable = data.readBoolean();
		gunCarryLimitEnable = data.readBoolean();
		gunCarryLimit = data.readInt();
        driveableUpdateRange = data.readFloat(); //range buff
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		FlansMod.hitCrossHairEnable = hitCrossHairEnable;
		FlansMod.bulletGuiEnable = bulletGuiEnable;
		FlansMod.crosshairEnable = crosshairEnable;
		FlansMod.gunCarryLimitEnable = gunCarryLimitEnable;
		FlansMod.gunCarryLimit = gunCarryLimit;
        FlansMod.driveableUpdateRange = driveableUpdateRange; //range buff
		FlansMod.log("Config synced successfully");
	}
}

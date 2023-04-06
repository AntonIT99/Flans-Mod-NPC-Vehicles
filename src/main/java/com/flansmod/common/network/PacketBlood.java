package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.TickHandlerClient;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.raytracing.PlayerHitbox;

public class PacketBlood
extends PacketBase
{
public float blood;
public float hemorrhaging;
public int isBlockingLeft;
public int isBlockingRight;
public int isBlockingTop;
public int isBlockingBottom;

public PacketBlood() {}

public PacketBlood(float blood, float hemorrhaging)
{
  this.blood = blood;
  this.hemorrhaging = hemorrhaging;
  /*
  this.isBlockingLeft = isBlockingLeft;
  this.isBlockingRight = isBlockingRight;
  this.isBlockingTop = isBlockingTop;
  this.isBlockingBottom = isBlockingBottom;
  */
 // System.out.println(this.blood + "this one is based packet");
}

public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
{
  data.writeFloat(this.blood);
  data.writeFloat(this.hemorrhaging);
  /*
  data.writeInt(this.isBlockingLeft);
  data.writeInt(this.isBlockingRight);
  data.writeInt(this.isBlockingTop);
  data.writeInt(this.isBlockingBottom);
  */
}

public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
{
  this.blood = data.readFloat();
  this.hemorrhaging = data.readFloat();
  /*
  this.isBlockingLeft = data.readInt();
  this.isBlockingRight = data.readInt();
  this.isBlockingTop = data.readInt();
  this.isBlockingBottom = data.readInt();
  */
}

public void handleServerSide(EntityPlayerMP player) {
}

@SideOnly(Side.CLIENT)
public void handleClientSide(EntityPlayer clientPlayer) {
  //you want this
	//PlayerHandler.getPlayerData((EntityPlayer)clientPlayer).blood = this.blood;
	TickHandlerClient.cringeBlood=this.blood;
	TickHandlerClient.cringeHemorrhaging=this.hemorrhaging;
	/*
	PlayerHitbox.lefty = this.isBlockingLeft;
	PlayerHitbox.righty = this.isBlockingRight;
	PlayerHitbox.topy = this.isBlockingTop;
	PlayerHitbox.bottomy = this.isBlockingBottom;
	*/

	
//	TickHandlerClient.cringeHemorrhaging=this.hemorrhaging;
	// System.out.println(this.blood + "this one is packet client void");
	// System.out.println(TickHandlerClient.cringeBlood + "this one is tickhandler cringe blood inside of packet client void");
	
}
}
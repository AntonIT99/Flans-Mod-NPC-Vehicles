package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
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

public class PacketVaccine
extends PacketBase
{


//public PacketVaccine(Entity lastMount) {}
	public PacketVaccine() {}



public void handleServerSide(EntityPlayerMP playerEntity) {
    
 

}

@Override
public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
	// TODO Auto-generated method stub
	
}

@Override
public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
	// TODO Auto-generated method stub
	
}

@Override
@SideOnly(Side.CLIENT)
public void handleClientSide(EntityPlayer clientPlayer) {
    
  //  clientPlayer.ridingEntity = FlansMod.lastRidden;
	//clientPlayer.mountEntity(FlansMod.lastRidden);
	Entity last = clientPlayer.ridingEntity;
	clientPlayer.ridingEntity = null;
	last.riddenByEntity = null;
	clientPlayer.mountEntity(last);
  //  System.out.println("vaccine packet did this");
    if(FlansMod.lastRidden == null)
    	System.out.println("uh oh stinky fall out of planes boo boo");
}
}

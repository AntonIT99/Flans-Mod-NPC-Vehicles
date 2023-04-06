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
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.eventhandlers.ServerTickEvent;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;

public class PacketChecker
extends PacketBase
{

	//public PacketChecker(Entity lastMount) {}
public PacketChecker() {}



public void handleServerSide(EntityPlayerMP playerEntity) {
    
	
	
	
    if(playerEntity.ridingEntity != null)
    {
    	//FlansMod.getPacketHandler().sendTo(new PacketVaccine(), playerEntity);
    	Entity last = playerEntity.ridingEntity;
    	playerEntity.mountEntity(null);
    	last.riddenByEntity = null;
    	//playerEntity.mountEntity(last);
    	//last.riddenByEntity=playerEntity;
  //  System.out.println("checker packet did this");
  //  System.out.println(last);
    ServerTickEvent.remount.add(new Object[]{playerEntity, last});
    
    last.motionX=0;
    last.motionY=0;
    last.motionZ=0;
    
    if(last instanceof EntitySeat)
    {
    	EntitySeat seat = (EntitySeat)last;
    	EntityDriveable plane = seat.driveable;
    	
    	plane.motionX=0;
    	plane.motionY=0.1;
    	plane.motionZ=0;
    	
    	plane.getDriveableData().emergencyMode = true;
    	System.out.println("emergency mode additional layer 3 attemtped to work");
    }

    }  
    
    
    
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
public void handleClientSide(EntityPlayer clientPlayer) {
	// TODO Auto-generated method stub
	
}
}
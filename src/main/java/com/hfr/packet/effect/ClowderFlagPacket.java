package com.hfr.packet.effect;

import com.hfr.clowder.Clowder;
import com.hfr.clowder.ClowderFlag;
import com.hfr.clowder.ClowderTerritory;
import com.hfr.clowder.ClowderTerritory.Zone;
import com.hfr.main.MainRegistry;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;

public class ClowderFlagPacket implements IMessage {

	int flag;
	int color;
	String name;
	String title;
	Boolean holyland = false;

	public ClowderFlagPacket()
	{
		title = " ";
	}
//case of entering a named province owned by a fac
	public ClowderFlagPacket(Clowder clowder, String title, Boolean core) {
		this.flag = clowder.flag.ordinal();
		this.color = clowder.color;
		this.name = clowder.getDecoratedName();
		this.title = title;
		this.holyland = core;
		//System.out.println("flagpacket received holyland " + holyland);
		if(title == null)
			title = " ";
	}
	//case of entering a named province thats wilderness
	public ClowderFlagPacket(String name, String title, Boolean core) {
		this.flag = -1;
		this.color = ClowderTerritory.WILDERNESS_COLOR;
		this.name = name;
		this.title = title;
		this.holyland = core;
		
		if(title == null)
			title = " ";
	}
	
		public ClowderFlagPacket(Clowder clowder, String title) {
			this.flag = clowder.flag.ordinal();
			this.color = clowder.color;
			this.name = clowder.getDecoratedName();
			this.title = title;
			
			if(title == null)
				title = " ";
		}

		public ClowderFlagPacket(String name, String title) {
			this.flag = -1;
			this.color = ClowderTerritory.WILDERNESS_COLOR;
			this.name = name;
			this.title = title;
			
			if(title == null)
				title = " ";
		}

	public ClowderFlagPacket(ClowderFlag flag, int color, String name, String title) {
		this.flag = flag.ordinal();
		this.color = color;
		this.name = name;
		this.title = " ";
	}

	public ClowderFlagPacket(String special) {

		if(special.equals(Zone.WILDERNESS.toString())) {
			this.flag = -1;
			this.color = ClowderTerritory.WILDERNESS_COLOR;
			this.name = "Wilderness";
		}
		if(special.equals(Zone.SAFEZONE.toString())) {
			this.flag = -2;
			this.color = ClowderTerritory.SAFEZONE_COLOR;
			this.name = "Safe Zone";
		}
		if(special.equals(Zone.WARZONE.toString())) {
			this.flag = -3;
			this.color = ClowderTerritory.WARZONE_COLOR;
			this.name = "War Zone";
		}
		
		if(title == null)
			title = " ";
	}

	@Override
	public void fromBytes(ByteBuf buf) {	//these are the ones that server sends to client
		flag = buf.readInt();
		color = buf.readInt();
		name = ByteBufUtils.readUTF8String(buf);
		title = ByteBufUtils.readUTF8String(buf);
		holyland = buf.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(flag);
		buf.writeInt(color);
		ByteBufUtils.writeUTF8String(buf, name);
		ByteBufUtils.writeUTF8String(buf, title);
		buf.writeBoolean(holyland);
	}

	public static class Handler implements IMessageHandler<ClowderFlagPacket, IMessage> {
		
		@Override
		public IMessage onMessage(ClowderFlagPacket m, MessageContext ctx) {
			
			if(m.flag > 0) {
				ClowderFlag flag = ClowderFlag.values()[m.flag];
				MainRegistry.proxy.updateFlag(flag.getFlag(), flag.getFlagOverlay(), m.color, m.name, m.title, m.holyland);
				//System.out.println("holy land from handler with flag" + m.holyland);
			} else {
				MainRegistry.proxy.updateFlag(null, m.flag == -3 ? ClowderFlag.WARZONE : m.flag == -2 ? ClowderFlag.SAFEZONE : ClowderFlag.WILDERNESS, m.color, m.name, m.title, m.holyland);
				//System.out.println("holy land from handler without flag" + m.holyland);
			}
			//code for displaying flag and making the doot noise - allah note
			Minecraft.getMinecraft().thePlayer.playSound("hfr:item.doot", 0.5F, 1.0F);
			
			return null;
		}
	}
}

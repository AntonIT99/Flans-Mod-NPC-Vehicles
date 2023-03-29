package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.teams.PlayerClass;
import com.flansmod.common.teams.TeamsManager;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketGetPlayerClasses extends PacketBase {

//    @SuppressWarnings("unused")
    public PacketGetPlayerClasses() {
    }


    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {

    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {

    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        if(TeamsManager.instance.currentRound!=null&&TeamsManager.instance.currentRound.teams!=null){
            PlayerData data = PlayerHandler.getPlayerData(playerEntity);
            if(data!=null&data.team!=null){
                FlansMod.getPacketHandler().sendTo(new PacketSendPlayerClasses(data.team.classes.toArray(new PlayerClass[data.team.classes.size()])),playerEntity);
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        FlansMod.log("Received set preferred ammo packet on client. Skipping.");
    }
}


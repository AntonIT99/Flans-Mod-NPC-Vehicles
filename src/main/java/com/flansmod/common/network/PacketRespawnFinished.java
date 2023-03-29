package com.flansmod.common.network;

import com.flansmod.client.TickHandlerClient;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketRespawnFinished extends PacketBase {
    private int num;
    @SuppressWarnings("unused")
    public PacketRespawnFinished() {
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeInt(num);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        num=data.readInt();
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        FlansMod.log("Received respawn finish packet on server. Skipping.");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        clientPlayer.inventory.changeCurrentItem(0);
        TickHandlerClient.respawnReloadingTicker=5;
    }
}


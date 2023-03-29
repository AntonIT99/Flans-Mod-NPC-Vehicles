package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.common.sync.Sync;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;

public class PacketHashSend extends PacketBase {
    String hash;

    @SuppressWarnings("unused")
	public PacketHashSend() {
    }

    public PacketHashSend(String typeHash) {
        hash = typeHash;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        writeUTF(data, hash);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        hash = readUTF(data);
    }

    @Override
    public void handleServerSide(EntityPlayerMP player) {
        FlansMod.log("Received pack hash from %s (%s)", player.getCommandSenderName(), hash);
        if (!hash.equals(Sync.getUnifiedHash()) && FlansMod.kickNonMatchingHashes) {
            player.playerNetServerHandler.kickPlayerFromServer("[Sync] Client-server mismatch.");
        }
    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {
        if (FlansMod.printDebugLog) {
            FlansMod.log("Received pack hash %s", hash);
        }
        if (!hash.equals(Sync.getUnifiedHash()) && FlansMod.kickNonMatchingHashes) {
            clientPlayer.addChatComponentMessage(new ChatComponentText("[Sync] Client-Server mismatch."));
            FlansMod.log("Kicked from server, invalid hash. Make sure your packs are the same as the server's.");
            FlansMod.log("S: " + hash);
            FlansMod.log("C: " + Sync.getUnifiedHash());
        }
        FlansMod.getPacketHandler().sendToServer(new PacketHashSend(Sync.getUnifiedHash()));
    }
}

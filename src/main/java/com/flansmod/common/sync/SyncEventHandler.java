package com.flansmod.common.sync;

import com.flansmod.common.network.PacketHashSend;
import com.flansmod.common.FlansMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.relauncher.Side;

import net.minecraft.server.MinecraftServer;

public class SyncEventHandler {
    @SubscribeEvent
    public void playerJoined(PlayerLoggedInEvent event) {
        MinecraftServer mc = MinecraftServer.getServer();
        if (mc.isDedicatedServer() && event.player instanceof EntityPlayerMP) {
            EntityPlayerMP player = (EntityPlayerMP)event.player;
            FlansMod.getPacketHandler().sendTo(new PacketHashSend(Sync.getUnifiedHash()), player);
        }
    }
}

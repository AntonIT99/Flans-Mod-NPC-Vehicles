package com.wolffsmod.render;

import com.wolffsmod.network.FlanEntitySyncPacket;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent;
import java.util.concurrent.ConcurrentLinkedQueue;

/** Apply vehicle packets on the client game thread, not Netty's network thread. */
public final class VehicleRotationUpdates
{
    private static final ConcurrentLinkedQueue<FlanEntitySyncPacket> PENDING = new ConcurrentLinkedQueue<FlanEntitySyncPacket>();
    private final FlanEntitySyncPacket.Handler handler = new FlanEntitySyncPacket.Handler();

    public static void enqueue(FlanEntitySyncPacket message) { PENDING.add(message); }

    @SubscribeEvent
    public void tick(TickEvent.ClientTickEvent event)
    {
        if (event.phase != TickEvent.Phase.START) return;
        FlanEntitySyncPacket message;
        while ((message = PENDING.poll()) != null) handler.apply(message);
    }

    @SubscribeEvent
    public void disconnect(FMLNetworkEvent.ClientDisconnectionFromServerEvent event) { PENDING.clear(); }
}

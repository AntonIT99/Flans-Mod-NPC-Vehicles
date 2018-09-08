// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import noppes.npcs.client.AnalyticsTracking;
import java.net.UnknownHostException;
import java.net.InetAddress;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.world.WorldServer;
import cpw.mods.fml.common.gameevent.TickEvent;

public class ServerTickHandler
{
    private String serverName;
    
    public ServerTickHandler() {
        this.serverName = null;
    }
    
    @SubscribeEvent
    public void onServerTick(final TickEvent.WorldTickEvent event) {
        if (event.phase == TickEvent.Phase.START) {
            NPCSpawning.findChunksForSpawning((WorldServer)event.world);
        }
    }
    
    @SubscribeEvent
    public void playerLogin(final PlayerEvent.PlayerLoggedInEvent event) {
        if (this.serverName == null) {
            String e = "local";
            final MinecraftServer server = MinecraftServer.getServer();
            if (server.isDedicatedServer()) {
                try {
                    e = InetAddress.getByName(server.getServerHostname()).getCanonicalHostName();
                }
                catch (UnknownHostException e2) {
                    e = MinecraftServer.getServer().getServerHostname();
                }
                if (server.getPort() != 25565) {
                    e = e + ":" + server.getPort();
                }
            }
            if (e == null || e.startsWith("192.168") || e.contains("127.0.0.1") || e.startsWith("localhost")) {
                e = "local";
            }
            this.serverName = e;
        }
        AnalyticsTracking.sendData(event.player, "join", this.serverName);
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import noppes.npcs.CustomNpcs;
import noppes.npcs.Server;
import io.netty.buffer.Unpooled;
import noppes.npcs.constants.EnumPacketServer;

public class Client
{
    public static void sendData(final EnumPacketServer enu, final Object... obs) {
        final ByteBuf buffer = Unpooled.buffer();
        try {
            if (!Server.fillBuffer(buffer, enu, obs)) {
                return;
            }
            CustomNpcs.Channel.sendToServer(new FMLProxyPacket(buffer, "CustomNPCs"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

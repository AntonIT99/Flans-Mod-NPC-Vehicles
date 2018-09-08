// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import com.google.common.base.Charsets;
import net.minecraft.nbt.NBTSizeTracker;
import net.minecraft.nbt.CompressedStreamTools;
import java.util.Iterator;
import net.minecraft.nbt.NBTTagCompound;
import java.util.List;
import net.minecraft.network.PacketBuffer;
import net.minecraft.village.MerchantRecipeList;
import java.util.Map;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.entity.Entity;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import io.netty.buffer.Unpooled;
import noppes.npcs.constants.EnumPacketClient;
import net.minecraft.entity.player.EntityPlayerMP;

public class Server
{
    public static boolean sendData(final EntityPlayerMP player, final EnumPacketClient enu, final Object... obs) {
        final ByteBuf buffer = Unpooled.buffer();
        try {
            if (!fillBuffer(buffer, enu, obs)) {
                return false;
            }
            CustomNpcs.Channel.sendTo(new FMLProxyPacket(buffer, "CustomNPCs"), player);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
    
    public static void sendAssociatedData(final Entity entity, final EnumPacketClient enu, final Object... obs) {
        final ByteBuf buffer = Unpooled.buffer();
        try {
            if (!fillBuffer(buffer, enu, obs)) {
                return;
            }
            final NetworkRegistry.TargetPoint point = new NetworkRegistry.TargetPoint(entity.dimension, entity.posX, entity.posY, entity.posZ, 60.0);
            CustomNpcs.Channel.sendToAllAround(new FMLProxyPacket(buffer, "CustomNPCs"), point);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void sendToAll(final EnumPacketClient enu, final Object... obs) {
        final ByteBuf buffer = Unpooled.buffer();
        try {
            if (!fillBuffer(buffer, enu, obs)) {
                return;
            }
            CustomNpcs.Channel.sendToAll(new FMLProxyPacket(buffer, "CustomNPCs"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static boolean fillBuffer(final ByteBuf buffer, final Enum enu, final Object... obs) throws IOException {
        buffer.writeInt(enu.ordinal());
        for (final Object ob : obs) {
            if (ob != null) {
                if (ob instanceof Map) {
                    final Map<String, Integer> map = (Map<String, Integer>)ob;
                    buffer.writeInt(map.size());
                    for (final String key : map.keySet()) {
                        final int value = map.get(key);
                        buffer.writeInt(value);
                        writeString(buffer, key);
                    }
                }
                else if (ob instanceof MerchantRecipeList) {
                    ((MerchantRecipeList)ob).func_151391_a(new PacketBuffer(buffer));
                }
                else if (ob instanceof List) {
                    final List<String> list = (List<String>)ob;
                    buffer.writeInt(list.size());
                    for (final String s : list) {
                        writeString(buffer, s);
                    }
                }
                else if (ob instanceof Enum) {
                    buffer.writeInt(((Enum)ob).ordinal());
                }
                else if (ob instanceof Integer) {
                    buffer.writeInt((Integer) ob);
                }
                else if (ob instanceof Boolean) {
                    buffer.writeBoolean((Boolean) ob);
                }
                else if (ob instanceof String) {
                    writeString(buffer, (String)ob);
                }
                else if (ob instanceof Float) {
                    buffer.writeFloat((Float) ob);
                }
                else if (ob instanceof Long) {
                    buffer.writeLong((Long) ob);
                }
                else if (ob instanceof Double) {
                    buffer.writeDouble((Double) ob);
                }
                else if (ob instanceof NBTTagCompound) {
                    writeNBT(buffer, (NBTTagCompound)ob);
                }
            }
        }
        if (buffer.array().length >= 32767) {
            LogWriter.error("Packet " + enu + " was too big to be send");
            return false;
        }
        return true;
    }
    
    public static void writeNBT(final ByteBuf buffer, final NBTTagCompound compound) throws IOException {
        final byte[] bytes = CompressedStreamTools.compress(compound);
        buffer.writeShort((int)(short)bytes.length);
        buffer.writeBytes(bytes);
    }
    
    public static NBTTagCompound readNBT(final ByteBuf buffer) throws IOException {
        final byte[] bytes = new byte[buffer.readShort()];
        buffer.readBytes(bytes);
        return CompressedStreamTools.func_152457_a(bytes, new NBTSizeTracker(2097152L));
    }
    
    public static void writeString(final ByteBuf buffer, final String s) {
        final byte[] bytes = s.getBytes(Charsets.UTF_8);
        buffer.writeShort((int)(short)bytes.length);
        buffer.writeBytes(bytes);
    }
    
    public static String readString(final ByteBuf buffer) {
        try {
            final byte[] bytes = new byte[buffer.readShort()];
            buffer.readBytes(bytes);
            return new String(bytes, Charsets.UTF_8);
        }
        catch (IndexOutOfBoundsException ex) {
            return null;
        }
    }
}

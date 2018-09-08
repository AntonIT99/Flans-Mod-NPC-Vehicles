// 
// Decompiled by Procyon v0.5.30
// 

package foxz.utils;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import java.util.List;
import net.minecraft.entity.player.EntityPlayerMP;

public class Utils
{
    public static <T> List<T> getNearbeEntityFromPlayer(final Class<? extends T> cls, final EntityPlayerMP player, final int dis) {
        final AxisAlignedBB range = player.boundingBox.expand((double)dis, (double)dis, (double)dis);
        final List<T> list = (List<T>)player.worldObj.getEntitiesWithinAABB((Class)cls, range);
        return list;
    }
    
    public static EntityPlayer getOnlinePlayer(final String playername) {
        return (EntityPlayer)MinecraftServer.getServer().getConfigurationManager().func_152612_a(playername);
    }
    
    public static World getWorld(final String t) {
        final WorldServer[] worldServers;
        final WorldServer[] ws = worldServers = MinecraftServer.getServer().worldServers;
        for (final WorldServer w : worldServers) {
            if (w != null && (w.provider.dimensionId + "").equalsIgnoreCase(t)) {
                return (World)w;
            }
        }
        return null;
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package foxz.commandhelper.permissions;

import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayer;
import foxz.commandhelper.AbstractCommandHelper;

public class OpOnly extends AbstractPermission
{
    @Override
    public String errorMsg() {
        return "Op Only";
    }
    
    @Override
    public boolean delegate(final AbstractCommandHelper parent, final String[] args) {
        return !(parent.pcParam instanceof EntityPlayer) || MinecraftServer.getServer().getConfigurationManager().func_152596_g(((EntityPlayer)parent.pcParam).getGameProfile());
    }
}

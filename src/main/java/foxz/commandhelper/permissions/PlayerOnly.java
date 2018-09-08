// 
// Decompiled by Procyon v0.5.30
// 

package foxz.commandhelper.permissions;

import net.minecraft.entity.player.EntityPlayer;
import foxz.commandhelper.AbstractCommandHelper;

public class PlayerOnly extends AbstractPermission
{
    @Override
    public String errorMsg() {
        return "Player Only";
    }
    
    @Override
    public boolean delegate(final AbstractCommandHelper parent, final String[] args) {
        return parent.pcParam instanceof EntityPlayer;
    }
}

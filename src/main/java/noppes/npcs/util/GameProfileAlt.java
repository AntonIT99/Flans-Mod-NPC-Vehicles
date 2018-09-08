// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.util;

import noppes.npcs.entity.EntityNPCInterface;
import java.util.UUID;
import com.mojang.authlib.GameProfile;

public class GameProfileAlt extends GameProfile
{
    private static final UUID id;
    public EntityNPCInterface npc;
    
    public GameProfileAlt() {
        super((UUID)null, "customnpc");
    }
    
    public String getName() {
        if (this.npc == null) {
            return super.getName();
        }
        return this.npc.getCommandSenderName();
    }
    
    public UUID getId() {
        if (this.npc == null) {
            return GameProfileAlt.id;
        }
        return this.npc.getPersistentID();
    }
    
    static {
        id = UUID.randomUUID();
    }
}

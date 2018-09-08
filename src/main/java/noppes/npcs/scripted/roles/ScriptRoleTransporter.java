// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted.roles;

import noppes.npcs.entity.EntityNPCInterface;

public class ScriptRoleTransporter extends ScriptRoleInterface
{
    public ScriptRoleTransporter(final EntityNPCInterface npc) {
        super(npc);
    }
    
    @Override
    public int getType() {
        return 5;
    }
}

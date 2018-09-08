// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted.roles;

import noppes.npcs.entity.EntityNPCInterface;

public class ScriptRoleInterface
{
    protected EntityNPCInterface npc;
    
    public ScriptRoleInterface(final EntityNPCInterface npc) {
        this.npc = npc;
    }
    
    public int getType() {
        return 0;
    }
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted.roles;

import noppes.npcs.entity.EntityNPCInterface;

public class ScriptJobInterface
{
    protected EntityNPCInterface npc;
    
    public ScriptJobInterface(final EntityNPCInterface npc) {
        this.npc = npc;
    }
    
    public int getType() {
        return 0;
    }
}

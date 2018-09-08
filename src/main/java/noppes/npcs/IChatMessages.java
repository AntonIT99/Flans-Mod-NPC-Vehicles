// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import noppes.npcs.entity.EntityNPCInterface;

public interface IChatMessages
{
    void addMessage(final String p0, final EntityNPCInterface p1);
    
    void renderMessages(final double p0, final double p1, final double p2, final float p3);
}

// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import net.minecraft.entity.Entity;
import net.minecraft.util.EntityDamageSourceIndirect;

public class NpcDamageSourceInderect extends EntityDamageSourceIndirect
{
    public NpcDamageSourceInderect(final String par1Str, final Entity par2Entity, final Entity par3Entity) {
        super(par1Str, par2Entity, par3Entity);
    }
    
    public boolean isDifficultyScaled() {
        return false;
    }
}

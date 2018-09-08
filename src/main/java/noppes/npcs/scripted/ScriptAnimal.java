// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityAnimal;

public class ScriptAnimal extends ScriptLiving
{
    public ScriptAnimal(final EntityAnimal entity) {
        super((EntityLiving)entity);
    }
    
    @Override
    public int getType() {
        return 4;
    }
    
    @Override
    public boolean typeOf(final int type) {
        return type == 4 || super.typeOf(type);
    }
}

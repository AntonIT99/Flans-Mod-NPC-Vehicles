// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.entity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityDialogNpc extends EntityNPCInterface
{
    public EntityDialogNpc(final World world) {
        super(world);
    }
    
    @Override
    public boolean isInvisibleToPlayer(final EntityPlayer player) {
        return true;
    }
    
    @Override
    public boolean isInvisible() {
        return true;
    }
    
    @Override
    public void onUpdate() {
    }
    
    @Override
    public boolean interact(final EntityPlayer player) {
        return false;
    }
}

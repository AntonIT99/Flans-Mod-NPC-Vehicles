// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIWaterNav extends EntityAIBase
{
    private EntityNPCInterface theEntity;
    
    public EntityAIWaterNav(final EntityNPCInterface par1EntityNPCInterface) {
        this.theEntity = par1EntityNPCInterface;
        par1EntityNPCInterface.getNavigator().setCanSwim(true);
    }
    
    public boolean shouldExecute() {
        if (this.theEntity.isInWater() || this.theEntity.handleLavaMovement()) {
            if (this.theEntity.ai.canSwim) {
                return true;
            }
            if (this.theEntity.isCollidedHorizontally) {
                return true;
            }
        }
        return false;
    }
    
    public void updateTask() {
        if (this.theEntity.getRNG().nextFloat() < 0.8f) {
            this.theEntity.getJumpHelper().setJumping();
        }
    }
}

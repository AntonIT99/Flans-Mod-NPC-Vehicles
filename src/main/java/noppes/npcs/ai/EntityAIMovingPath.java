// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import java.util.List;
import noppes.npcs.constants.AiMutex;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIMovingPath extends EntityAIBase
{
    private EntityNPCInterface npc;
    private int[] pos;
    
    public EntityAIMovingPath(final EntityNPCInterface par1EntityNPCInterface) {
        this.npc = par1EntityNPCInterface;
        this.setMutexBits((int)AiMutex.PASSIVE);
    }
    
    public boolean shouldExecute() {
        if (this.npc.isAttacking() || this.npc.isInteracting() || (this.npc.getRNG().nextInt(40) != 0 && this.npc.ai.movingPause) || !this.npc.getNavigator().noPath() || this.npc.isInteracting()) {
            return false;
        }
        final List<int[]> list = this.npc.ai.getMovingPath();
        if (list.size() < 2) {
            return false;
        }
        this.npc.ai.incrementMovingPath();
        this.pos = this.npc.ai.getCurrentMovingPath();
        return true;
    }
    
    public boolean continueExecuting() {
        if (this.npc.isAttacking() || this.npc.isInteracting()) {
            this.npc.ai.decreaseMovingPath();
            return false;
        }
        return !this.npc.getNavigator().noPath();
    }
    
    public void startExecuting() {
        this.npc.getNavigator().tryMoveToXYZ(this.pos[0] + 0.5, (double)this.pos[1], this.pos[2] + 0.5, 1.0);
    }
}

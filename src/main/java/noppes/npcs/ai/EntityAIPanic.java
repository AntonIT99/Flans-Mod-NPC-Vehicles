// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import net.minecraft.util.Vec3;
import noppes.npcs.constants.AiMutex;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIPanic extends EntityAIBase
{
    private EntityCreature theEntityCreature;
    private float speed;
    private double randPosX;
    private double randPosY;
    private double randPosZ;
    
    public EntityAIPanic(final EntityCreature par1EntityCreature, final float par2) {
        this.theEntityCreature = par1EntityCreature;
        this.speed = par2;
        this.setMutexBits((int)AiMutex.PASSIVE);
    }
    
    public boolean shouldExecute() {
        if (this.theEntityCreature.getAttackTarget() == null && !this.theEntityCreature.isBurning()) {
            return false;
        }
        final Vec3 var1 = RandomPositionGeneratorAlt.findRandomTarget(this.theEntityCreature, 5, 4);
        if (var1 == null) {
            return false;
        }
        this.randPosX = var1.xCoord;
        this.randPosY = var1.yCoord;
        this.randPosZ = var1.zCoord;
        return true;
    }
    
    public void startExecuting() {
        this.theEntityCreature.getNavigator().tryMoveToXYZ(this.randPosX, this.randPosY, this.randPosZ, (double)this.speed);
    }
    
    public boolean continueExecuting() {
        return this.theEntityCreature.getAttackTarget() != null && !this.theEntityCreature.getNavigator().noPath();
    }
}

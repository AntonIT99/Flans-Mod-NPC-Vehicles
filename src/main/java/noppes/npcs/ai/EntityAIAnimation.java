// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import noppes.npcs.constants.EnumMovingType;
import noppes.npcs.constants.EnumAnimation;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIAnimation extends EntityAIBase
{
    private EntityNPCInterface npc;
    private boolean isAttacking;
    private boolean isDead;
    private boolean isAtStartpoint;
    private boolean hasPath;
    private int tick;
    
    public EntityAIAnimation(final EntityNPCInterface npc) {
        this.isAttacking = false;
        this.isDead = false;
        this.isAtStartpoint = false;
        this.hasPath = false;
        this.tick = 4;
        this.npc = npc;
    }
    
    public boolean shouldExecute() {
        this.isDead = !this.npc.isEntityAlive();
        if (this.isDead) {
            return this.npc.currentAnimation != EnumAnimation.LYING;
        }
        if (this.npc.stats.aimWhileShooting && this.npc.isAttacking()) {
            return this.npc.currentAnimation != EnumAnimation.AIMING;
        }
        if (this.npc.ai.animationType == EnumAnimation.NONE) {
            return this.npc.currentAnimation != EnumAnimation.NONE;
        }
        this.isAttacking = this.npc.isAttacking();
        if (this.npc.ai.returnToStart) {
            this.isAtStartpoint = this.npc.isVeryNearAssignedPlace();
        }
        this.hasPath = !this.npc.getNavigator().noPath();
        if (this.npc.ai.movingType == EnumMovingType.Standing && this.hasNavigation() && this.npc.currentAnimation.getWalkingAnimation() == 0) {
            return this.npc.currentAnimation != EnumAnimation.NONE;
        }
        return this.npc.currentAnimation != this.npc.ai.animationType;
    }
    
    public void updateTask() {
        if (this.npc.stats.aimWhileShooting && this.npc.isAttacking()) {
            this.setAnimation(EnumAnimation.AIMING);
            return;
        }
        EnumAnimation type = this.npc.ai.animationType;
        if (this.isDead) {
            type = EnumAnimation.LYING;
        }
        else if (this.npc.ai.movingType == EnumMovingType.Standing && this.npc.ai.animationType.getWalkingAnimation() == 0 && this.hasNavigation()) {
            type = EnumAnimation.NONE;
        }
        this.setAnimation(type);
    }
    
    private void setAnimation(final EnumAnimation animation) {
        this.npc.setCurrentAnimation(animation);
        this.npc.updateHitbox();
        this.npc.setPosition(this.npc.posX, this.npc.posY, this.npc.posZ);
    }
    
    private boolean hasNavigation() {
        return this.isAttacking || (this.npc.ai.returnToStart && !this.isAtStartpoint && !this.npc.isFollower()) || this.hasPath;
    }
}

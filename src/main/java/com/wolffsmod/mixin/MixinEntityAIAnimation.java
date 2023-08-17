package com.wolffsmod.mixin;

import com.flansmod.common.guns.ItemGun;
import noppes.npcs.ai.EntityAIAnimation;
import noppes.npcs.constants.EnumAnimation;
import noppes.npcs.constants.EnumMovingType;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import net.minecraft.entity.ai.EntityAIBase;

@Mixin(value = EntityAIAnimation.class)
public abstract class MixinEntityAIAnimation extends EntityAIBase
{
    @Shadow
    private EntityNPCInterface npc;
    @Shadow
    private boolean isAttacking;
    @Shadow
    private boolean isDead;
    @Shadow
    private boolean isAtStartpoint;
    @Shadow
    private boolean hasPath;

    @Shadow
    private void setAnimation(EnumAnimation animation) {}
    @Shadow
    private boolean hasNavigation()
    {
        return false; //Dummy method body
    }

    /**
     * @author Wolff
     * @reason Hug animation when holding Flan's gun in off-hand
     */
    @Overwrite(remap = false)
    public boolean shouldExecute(){
        isDead = !npc.isEntityAlive();
        if(isDead)
            return npc.currentAnimation != EnumAnimation.LYING;

        if(npc.stats.aimWhileShooting && npc.isAttacking())
        {
            if (npc.getOffHand() != null && npc.getOffHand().getItem() instanceof ItemGun)
                return npc.currentAnimation != EnumAnimation.HUG;
            return npc.currentAnimation != EnumAnimation.AIMING;
        }
        if(npc.ai.animationType == EnumAnimation.NONE)
            return npc.currentAnimation != EnumAnimation.NONE;
        isAttacking = npc.isAttacking();
        if(npc.ai.returnToStart)
            isAtStartpoint = npc.isVeryNearAssignedPlace();
        hasPath = !npc.getNavigator().noPath();

        if(npc.ai.movingType == EnumMovingType.Standing && hasNavigation() && npc.currentAnimation.getWalkingAnimation() == 0)
        {
            return npc.currentAnimation != EnumAnimation.NONE;
        }

        return npc.currentAnimation != npc.ai.animationType;
    }

    /**
     * @author Wolff
     * @reason Hug animation when holding Flan's gun in off-hand
     */
    @Override
    @Overwrite(remap = false)
    public void updateTask()
    {
        if(npc.stats.aimWhileShooting && npc.isAttacking())
        {
            if (npc.getOffHand() != null && npc.getOffHand().getItem() instanceof ItemGun)
            {
                setAnimation(EnumAnimation.HUG);
                return;
            }
            setAnimation(EnumAnimation.AIMING);
            return;
        }
        EnumAnimation type = npc.ai.animationType;
        if(isDead)
            type = EnumAnimation.LYING;
        else if(npc.ai.movingType == EnumMovingType.Standing && npc.ai.animationType.getWalkingAnimation() == 0 && hasNavigation())
            type = EnumAnimation.NONE;
        setAnimation(type);
    }
}

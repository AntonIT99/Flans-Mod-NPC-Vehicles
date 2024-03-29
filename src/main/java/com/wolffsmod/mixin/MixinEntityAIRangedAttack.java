package com.wolffsmod.mixin;

import com.wolffsmod.customnpc.IMixinEntityNPCInterface;
import noppes.npcs.ai.EntityAIRangedAttack;
import noppes.npcs.constants.EnumAnimation;
import noppes.npcs.constants.EnumNavType;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.MathHelper;

@Mixin(value = EntityAIRangedAttack.class)
public abstract class MixinEntityAIRangedAttack extends EntityAIBase
{
    @Shadow(remap = false)
    @Final
    private EntityNPCInterface entityHost;
    @Shadow(remap = false)
    @Final
    private IRangedAttackMob rangedAttackEntityHost;
    @Shadow(remap = false)
    private EntityLivingBase attackTarget;
    @Shadow(remap = false)
    private int rangedAttackTime;
    @Shadow(remap = false)
    private int field_75318_f; //moveTries
    @Shadow(remap = false)
    private int field_70846_g; //burstCount
    @Shadow(remap = false)
    private boolean hasFired;
    @Shadow(remap = false)
    private boolean navOverride;

    /**
     * @author Wolff
     * @reason AI adjustments for vehicle NPCs
     */
    @Override
    @Overwrite
    public void updateTask()
    {
        entityHost.getLookHelper().setLookPositionWithEntity(attackTarget, 30.0F, 30.0F);
        double var1 = entityHost.getDistanceSq(attackTarget.posX, attackTarget.boundingBox.minY, attackTarget.posZ);
        float range = (float) entityHost.stats.rangedRange * entityHost.stats.rangedRange;

        if (!navOverride && entityHost.ai.directLOS)
        {
            if (entityHost.getEntitySenses().canSee(attackTarget))
            {
                field_75318_f++;
            }
            else
            {
                field_75318_f = 0;
            }
            int v = entityHost.ai.tacticalVariant == EnumNavType.Default ? 20 : 5;
            if (var1 <= range && field_75318_f >= v)
            {
                entityHost.getNavigator().clearPathEntity();
            }
            else
            {
                entityHost.getNavigator().tryMoveToEntityLiving(attackTarget, 1.0D);
            }
        }

        rangedAttackTime = Math.max(rangedAttackTime - 1, 0);

        if (rangedAttackTime <= 0)
        {
            if (var1 <= range && (entityHost.getEntitySenses().canSee(attackTarget) || entityHost.ai.canFireIndirect == 2))
            {
                if (field_70846_g++ <= entityHost.stats.burstCount)
                {
                    ((IMixinEntityNPCInterface)entityHost).setLastBurst((field_70846_g > entityHost.stats.burstCount));
                    rangedAttackTime = entityHost.stats.fireRate;
                }
                else
                {
                    field_70846_g = 0;
                    hasFired = true;
                    rangedAttackTime = (entityHost.stats.maxDelay - MathHelper.floor_float(entityHost.getRNG().nextFloat() * (entityHost.stats.maxDelay - entityHost.stats.minDelay)));
                    ((IMixinEntityNPCInterface)entityHost).reloadGuns();
                }

                if (field_70846_g > 1)
                {
                    boolean indirect = false;

                    switch(entityHost.ai.canFireIndirect)
                    {
                        case 1:
                            indirect = var1 > (double)range / 2;
                            break;
                        case 2:
                            indirect = !entityHost.getEntitySenses().canSee(attackTarget);
                            break;
                        default:
                            break;
                    }

                    if (!((IMixinEntityNPCInterface)entityHost).isFlanDriveable() || (((IMixinEntityNPCInterface)entityHost).getFlanDriveableEntity().isPresent() && !((IMixinEntityNPCInterface)entityHost).getFlanDriveableEntity().get().driver.isRotating()))
                    {
                        rangedAttackEntityHost.attackEntityWithRangedAttack(attackTarget, indirect ? 1 : 0);
                    }

                    if (entityHost.currentAnimation != EnumAnimation.AIMING)
                    {
                        entityHost.swingItem();
                    }
                }
            }
        }
    }
}

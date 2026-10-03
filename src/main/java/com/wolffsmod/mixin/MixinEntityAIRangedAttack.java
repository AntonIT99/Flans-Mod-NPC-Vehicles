package com.wolffsmod.mixin;

import com.wolffsmod.customnpc.IMixinEntityNPCInterface;
import com.wolffsmod.customnpc.TacticalRangeHelper;
import com.wolffsmod.customnpc.TransparentBlockLos;
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
    @org.spongepowered.asm.mixin.Unique
    private final com.wolffsmod.customnpc.PartialPursuitReuse wolffsmod$partialPursuit = new com.wolffsmod.customnpc.PartialPursuitReuse();
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
    @Shadow(remap = false)
    private boolean isShooting;

    /**
     * Keep an extended-range tactical target long enough for the maneuver to
     * return inside its configured 128-block engagement range. This does not
     * extend target acquisition or the actual ranged firing distance.
     *
     * @author OpenAI Codex
     * @reason CustomNPC+ tactical variants otherwise discard extended-range
     * targets while carrying out their normal movement.
     */
    @Override
    @Overwrite
    public boolean shouldExecute()
    {
        EntityLivingBase target = entityHost.getAttackTarget();

        if (target == null || !target.isEntityAlive())
        {
            isShooting = false;
            return false;
        }

        if (entityHost.getDistanceToEntity(target) > TacticalRangeHelper.getTargetRetentionRange(entityHost))
        {
            isShooting = false;
            return false;
        }

        if (entityHost.inventory.getProjectile() == null)
        {
            isShooting = false;
            return false;
        }

        double distanceSq = entityHost.getDistanceSq(target.posX, target.boundingBox.minY, target.posZ);
        double meleeDistanceSq = entityHost.ais.distanceToMelee * entityHost.ais.distanceToMelee;
        if (entityHost.ais.useRangeMelee >= 1 && distanceSq <= meleeDistanceSq)
        {
            isShooting = false;
            return false;
        }

        attackTarget = target;
        return true;
    }

    /**
     * @author Wolff
     * @reason AI adjustments for vehicle NPCs
     */
    @Override
    @Overwrite
    public void updateTask()
    {
        if (!((IMixinEntityNPCInterface)entityHost).getNpcAbilities().isRotationLocked())
        {
            entityHost.getLookHelper().setLookPositionWithEntity(attackTarget, 30.0F, 30.0F);
        }
        double var1 = entityHost.getDistanceSq(attackTarget.posX, attackTarget.boundingBox.minY, attackTarget.posZ);
        float range = (float) entityHost.stats.rangedRange * entityHost.stats.rangedRange;

        if (!navOverride && entityHost.ais.directLOS)
        {
            if (TransparentBlockLos.canFire(entityHost, attackTarget))
            {
                field_75318_f++;
            }
            else
            {
                field_75318_f = 0;
            }
            int v = entityHost.ais.tacticalVariant == EnumNavType.Default ? 20 : 5;
            if (var1 <= range && field_75318_f >= v)
            {
                entityHost.getNavigator().clearPathEntity();
                wolffsmod$partialPursuit.clear();
            }
            else
            {
                // Long paths are expensive. Retry on a staggered cadence instead of every tick.
                if ((entityHost.ticksExisted + entityHost.getEntityId()) % 10 == 0) {
                    if (com.wolffsmod.WolffNPCMod.reusePartialPursuitPaths
                            && entityHost.ais.tacticalVariant == EnumNavType.Default
                            && entityHost.getNavigator().getClass() == net.minecraft.pathfinding.PathNavigate.class)
                        wolffsmod$partialPursuit.move(entityHost, attackTarget);
                    else {
                        wolffsmod$partialPursuit.clear();
                        entityHost.getNavigator().tryMoveToEntityLiving(attackTarget, 1.0D);
                    }
                }
            }
        }

        // Preserve the no-snap vehicle aim fix: an unaligned turret must not
        // consume cooldown or burst state while its rotation catches up.
        if (((IMixinEntityNPCInterface)entityHost).isFlanDriveable()
                && ((IMixinEntityNPCInterface)entityHost).getFlanDriveableEntity().isPresent()
                && ((IMixinEntityNPCInterface)entityHost).getFlanDriveableEntity().get().driver.isRotating())
        {
            isShooting = false;
            return;
        }

        rangedAttackTime = Math.max(rangedAttackTime - 1, 0);

        if (rangedAttackTime <= 0)
        {
            if (var1 <= range && (TransparentBlockLos.canFire(entityHost, attackTarget) || entityHost.ais.canFireIndirect == 2))
            {
                if (field_70846_g == 0)
                {
                    entityHost.stats.playBurstSound = true;
                }
                if (field_70846_g++ <= entityHost.stats.burstCount)
                {
                    ((IMixinEntityNPCInterface)entityHost).setLastBurst((field_70846_g > entityHost.stats.burstCount));
                    rangedAttackTime = entityHost.stats.fireRate;
                    isShooting = true;
                }
                else
                {
                    field_70846_g = 0;
                    hasFired = true;
                    rangedAttackTime = (entityHost.stats.maxDelay - MathHelper.floor_float(entityHost.getRNG().nextFloat() * (entityHost.stats.maxDelay - entityHost.stats.minDelay)));
                    ((IMixinEntityNPCInterface)entityHost).reloadGuns();
                    isShooting = false;
                }

                if (field_70846_g > 1)
                {
                    boolean indirect = false;

                    switch(entityHost.ais.canFireIndirect)
                    {
                        case 1:
                            indirect = var1 > (double)range / 2;
                            break;
                        case 2:
                            indirect = !TransparentBlockLos.canFire(entityHost, attackTarget);
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

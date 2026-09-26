package com.wolffsmod.mixin;

import com.wolffsmod.config.TargetSearchConfig;
import com.wolffsmod.customnpc.TargetSearchProfiler;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAITarget;
import net.minecraft.util.AxisAlignedBB;
import noppes.npcs.ai.target.EntityAIClosestTarget;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(value = EntityAIClosestTarget.class, remap = false)
public abstract class MixinEntityAIClosestTargetProgressive extends EntityAITarget
{
    private static final int[] WOLFFSMOD_BAND_RADII = {32, 64, 128, 256, 384, 512};

    @Shadow @Final private Class targetClass;
    @Shadow @Final private IEntitySelector field_82643_g;
    @Shadow private EntityLivingBase targetEntity;

    @Unique private final long[] wolffsmod$nextBandTick = new long[6];
    @Unique private boolean wolffsmod$scheduleInitialized;
    @Unique private long wolffsmod$selectorChecks;
    @Unique private long wolffsmod$losChecks;
    @Unique private EntityLivingBase wolffsmod$nearest;
    @Unique private double wolffsmod$nearestDistanceSq;
    @Unique private final int[] wolffsmod$slabCursor = new int[6];
    @Unique private int wolffsmod$activeBand;
    @Unique private int wolffsmod$visitedSlab;

    protected MixinEntityAIClosestTargetProgressive(EntityCreature creature, boolean checkSight)
    {
        super(creature, checkSight);
    }

    @Inject(method = {"shouldExecute", "func_75250_a"}, at = @At("HEAD"), cancellable = true, require = 1)
    private void wolffsmod$progressiveVehicleSearch(CallbackInfoReturnable<Boolean> callbackInfo)
    {
        if (!TargetSearchConfig.enabled || !(this.taskOwner instanceof EntityNPCInterface))
            return;

        final EntityNPCInterface npc = (EntityNPCInterface)this.taskOwner;
        if (npc.worldObj == null || npc.worldObj.isRemote)
            return;

        final int maximumRange = Math.max(1, npc.stats.aggroRange);
        final long worldTick = npc.worldObj.getTotalWorldTime();
        if (!wolffsmod$scheduleInitialized)
            wolffsmod$initializeSchedule(npc, worldTick);

        int band = wolffsmod$nextDueBand(maximumRange, worldTick);
        if (band < 0)
        {
            callbackInfo.setReturnValue(false);
            return;
        }

        int outer = Math.min(WOLFFSMOD_BAND_RADII[band], maximumRange);
        int inner = band == 0 ? 0 : Math.min(WOLFFSMOD_BAND_RADII[band - 1], maximumRange);
        wolffsmod$activeBand = band;
        wolffsmod$visitedSlab = 0;

        long started = System.nanoTime();
        wolffsmod$selectorChecks = 0L;
        wolffsmod$losChecks = 0L;
        targetEntity = wolffsmod$findNearestInShell(npc, inner, outer);
        if (band == 0 || ++wolffsmod$slabCursor[band] >= 6 || targetEntity != null)
        {
            wolffsmod$slabCursor[band] = 0;
            wolffsmod$nextBandTick[band] = worldTick + TargetSearchConfig.intervalForBand(band);
        }
        else
            wolffsmod$nextBandTick[band] = worldTick + 6;
        long elapsed = System.nanoTime() - started;
        com.wolffsmod.benchmark.ServerBenchmark.targetSearch(elapsed);
        boolean acquired = targetEntity != null;
        TargetSearchProfiler.recordSearch(band, wolffsmod$selectorChecks, wolffsmod$losChecks, acquired, elapsed, worldTick);
        callbackInfo.setReturnValue(acquired);
    }

    @Unique
    private void wolffsmod$initializeSchedule(EntityNPCInterface npc, long worldTick)
    {
        int offset = (npc.getEntityId() & Integer.MAX_VALUE);
        for (int band = 0; band < wolffsmod$nextBandTick.length; band++)
        {
            int interval = TargetSearchConfig.intervalForBand(band);
            wolffsmod$nextBandTick[band] = worldTick + (offset * (band * 2L + 1L)) % interval;
        }
        wolffsmod$scheduleInitialized = true;
    }

    @Unique
    private int wolffsmod$nextDueBand(int maximumRange, long worldTick)
    {
        int selected = -1;
        long earliest = Long.MAX_VALUE;
        for (int band = 0; band < WOLFFSMOD_BAND_RADII.length; band++)
        {
            int inner = band == 0 ? 0 : WOLFFSMOD_BAND_RADII[band - 1];
            if (maximumRange <= inner)
                break;
            if (worldTick >= wolffsmod$nextBandTick[band] && wolffsmod$nextBandTick[band] < earliest)
            {
                selected = band;
                earliest = wolffsmod$nextBandTick[band];
            }
        }
        return selected;
    }

    @Unique
    private EntityLivingBase wolffsmod$findNearestInShell(final EntityNPCInterface npc, final int inner, int outer)
    {
        final IEntitySelector shellSelector = new IEntitySelector()
        {
            @Override
            public boolean isEntityApplicable(Entity entity)
            {
                if (inner > 0 && wolffsmod$isInsideBox(npc, entity, inner))
                    return false;
                wolffsmod$selectorChecks++;
                if (npc.ais.directLOS)
                    wolffsmod$losChecks++;
                return field_82643_g == null || field_82643_g.isEntityApplicable(entity);
            }
        };

        int outerY = (int)Math.ceil(outer / 2.0D);
        AxisAlignedBB outerBox = npc.boundingBox.expand(outer, outerY, outer);
        wolffsmod$nearest = null;
        wolffsmod$nearestDistanceSq = Double.MAX_VALUE;

        if (inner <= 0)
        {
            wolffsmod$scanBox(npc, outerBox, shellSelector);
            return wolffsmod$nearest;
        }

        int innerY = (int)Math.ceil(inner / 2.0D);
        AxisAlignedBB innerBox = npc.boundingBox.expand(inner, innerY, inner);

        // Six non-overlapping slabs cover outerBox - innerBox. This keeps the
        // world's chunk/entity enumeration out of already searched inner bands.
        wolffsmod$scanBox(npc, AxisAlignedBB.getBoundingBox(
                outerBox.minX, outerBox.minY, outerBox.minZ,
                innerBox.minX, outerBox.maxY, outerBox.maxZ), shellSelector);
        wolffsmod$scanBox(npc, AxisAlignedBB.getBoundingBox(
                innerBox.maxX, outerBox.minY, outerBox.minZ,
                outerBox.maxX, outerBox.maxY, outerBox.maxZ), shellSelector);
        wolffsmod$scanBox(npc, AxisAlignedBB.getBoundingBox(
                innerBox.minX, outerBox.minY, outerBox.minZ,
                innerBox.maxX, outerBox.maxY, innerBox.minZ), shellSelector);
        wolffsmod$scanBox(npc, AxisAlignedBB.getBoundingBox(
                innerBox.minX, outerBox.minY, innerBox.maxZ,
                innerBox.maxX, outerBox.maxY, outerBox.maxZ), shellSelector);
        wolffsmod$scanBox(npc, AxisAlignedBB.getBoundingBox(
                innerBox.minX, outerBox.minY, innerBox.minZ,
                innerBox.maxX, innerBox.minY, innerBox.maxZ), shellSelector);
        wolffsmod$scanBox(npc, AxisAlignedBB.getBoundingBox(
                innerBox.minX, innerBox.maxY, innerBox.minZ,
                innerBox.maxX, outerBox.maxY, innerBox.maxZ), shellSelector);
        return wolffsmod$nearest;
    }

    @Unique
    private void wolffsmod$scanBox(EntityNPCInterface npc, AxisAlignedBB box, IEntitySelector selector)
    {
        // One slab per acquisition opportunity; resume the other slabs later.
        if (wolffsmod$activeBand > 0 && wolffsmod$visitedSlab++ != wolffsmod$slabCursor[wolffsmod$activeBand])
            return;
        List candidates = npc.worldObj.selectEntitiesWithinAABB(targetClass, box, selector);
        for (Object candidateObject : candidates)
        {
            if (!(candidateObject instanceof EntityLivingBase))
                continue;
            EntityLivingBase candidate = (EntityLivingBase)candidateObject;
            double distanceSq = npc.getDistanceSqToEntity(candidate);
            if (distanceSq < wolffsmod$nearestDistanceSq)
            {
                wolffsmod$nearest = candidate;
                wolffsmod$nearestDistanceSq = distanceSq;
            }
        }
    }

    @Unique
    private static boolean wolffsmod$isInsideBox(EntityNPCInterface npc, Entity entity, int radius)
    {
        double yRadius = Math.ceil(radius / 2.0D);
        return entity.boundingBox.maxX >= npc.boundingBox.minX - radius
                && entity.boundingBox.minX <= npc.boundingBox.maxX + radius
                && entity.boundingBox.maxY >= npc.boundingBox.minY - yRadius
                && entity.boundingBox.minY <= npc.boundingBox.maxY + yRadius
                && entity.boundingBox.maxZ >= npc.boundingBox.minZ - radius
                && entity.boundingBox.minZ <= npc.boundingBox.maxZ + radius;
    }
}

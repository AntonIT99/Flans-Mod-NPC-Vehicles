package com.wolffsmod.customnpc;

import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import noppes.npcs.entity.EntityNPCInterface;

/**
 * Selector used by the progressive target-search mixin.
 *
 * This deliberately lives in Wolff's own package instead of being an
 * anonymous class inside a mixin method. Some 1.7.10 transformer stacks can
 * leave such a generated target-class inner class referenced but unavailable
 * to LaunchClassLoader.
 */
public final class ProgressiveTargetSelector implements IEntitySelector
{
    private final EntityNPCInterface npc;
    private final int innerRadius;
    private final IEntitySelector delegate;
    private long selectorChecks;
    private long losChecks;

    public ProgressiveTargetSelector(EntityNPCInterface npc, int innerRadius, IEntitySelector delegate)
    {
        this.npc = npc;
        this.innerRadius = innerRadius;
        this.delegate = delegate;
    }

    @Override
    public boolean isEntityApplicable(Entity entity)
    {
        if (innerRadius > 0 && isInsideBox(npc, entity, innerRadius))
            return false;
        selectorChecks++;
        if (npc.ais.directLOS)
            losChecks++;
        return delegate == null || delegate.isEntityApplicable(entity);
    }

    public long getSelectorChecks()
    {
        return selectorChecks;
    }

    public long getLosChecks()
    {
        return losChecks;
    }

    private static boolean isInsideBox(EntityNPCInterface npc, Entity entity, int radius)
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

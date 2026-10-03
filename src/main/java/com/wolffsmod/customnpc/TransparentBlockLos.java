package com.wolffsmod.customnpc;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockVine;
import net.minecraft.block.BlockWeb;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import noppes.npcs.entity.EntityNPCInterface;

/** Per-NPC line-of-sight rules for deliberately selected partial blocks. */
public final class TransparentBlockLos {
    public static final int NORMAL = 0;
    public static final int SEE_THROUGH = 1;
    public static final int SEE_AND_FIRE_THROUGH = 2;
    private static final double EPSILON = 0.001D;

    private TransparentBlockLos() {}

    public static boolean isEnabled(EntityNPCInterface npc) {
        return data(npc).getTransparentBlockLosMode() != NORMAL;
    }

    public static boolean canSee(EntityNPCInterface npc, Entity target) {
        IMixinDataDisplay settings = data(npc);
        if (settings.getTransparentBlockLosMode() == NORMAL)
            return npc.canEntityBeSeen(target);
        return trace(npc, target, eye(npc), settings.getTransparentBlockVisionLimit()).clear;
    }

    public static boolean canFire(EntityNPCInterface npc, Entity target) {
        IMixinDataDisplay settings = data(npc);
        int mode = settings.getTransparentBlockLosMode();
        if (mode == NORMAL)
            return npc.getEntitySenses().canSee(target);
        if (mode == SEE_THROUGH)
            return npc.canEntityBeSeen(target);
        return trace(npc, target, eye(npc), settings.getTransparentBlockFireLimit()).clear;
    }

    public static Vec3 projectileOrigin(EntityNPCInterface npc, Entity target, Vec3 origin) {
        IMixinDataDisplay settings = data(npc);
        if (settings.getTransparentBlockLosMode() != SEE_AND_FIRE_THROUGH)
            return origin;
        TraceResult result = trace(npc, target, origin, settings.getTransparentBlockFireLimit());
        return result.clear && result.passedBlocks > 0 && result.lastExit != null ? result.lastExit : origin;
    }

    private static TraceResult trace(EntityNPCInterface npc, Entity target, Vec3 start, int limit) {
        Vec3 end = target(target);
        double dx = end.xCoord - start.xCoord;
        double dy = end.yCoord - start.yCoord;
        double dz = end.zCoord - start.zCoord;
        double length = Math.sqrt(dx * dx + dy * dy + dz * dz);
        if (length < EPSILON)
            return new TraceResult(true, 0, null);
        dx /= length;
        dy /= length;
        dz /= length;

        Vec3 cursor = Vec3.createVectorHelper(start.xCoord, start.yCoord, start.zCoord);
        Vec3 lastExit = null;
        int passed = 0;
        for (int guard = 0; guard < 66; guard++) {
            MovingObjectPosition hit = npc.worldObj.func_147447_a(cursor, end, false, true, false);
            if (hit == null)
                return new TraceResult(true, passed, lastExit);

            Block block = npc.worldObj.getBlock(hit.blockX, hit.blockY, hit.blockZ);
            if (!isEligible(block) || passed >= limit)
                return new TraceResult(false, passed, lastExit);

            passed++;
            cursor = exitBlock(hit.hitVec, hit.blockX, hit.blockY, hit.blockZ, dx, dy, dz);
            lastExit = cursor;
        }
        return new TraceResult(false, passed, lastExit);
    }

    private static Vec3 exitBlock(Vec3 hit, int x, int y, int z, double dx, double dy, double dz) {
        double distance = Double.POSITIVE_INFINITY;
        if (dx > EPSILON) distance = Math.min(distance, (x + 1.0D - hit.xCoord) / dx);
        else if (dx < -EPSILON) distance = Math.min(distance, (x - hit.xCoord) / dx);
        if (dy > EPSILON) distance = Math.min(distance, (y + 1.0D - hit.yCoord) / dy);
        else if (dy < -EPSILON) distance = Math.min(distance, (y - hit.yCoord) / dy);
        if (dz > EPSILON) distance = Math.min(distance, (z + 1.0D - hit.zCoord) / dz);
        else if (dz < -EPSILON) distance = Math.min(distance, (z - hit.zCoord) / dz);
        if (Double.isInfinite(distance) || distance < 0.0D) distance = 1.0D;
        distance += EPSILON;
        return Vec3.createVectorHelper(hit.xCoord + dx * distance, hit.yCoord + dy * distance, hit.zCoord + dz * distance);
    }

    private static boolean isEligible(Block block) {
        return block instanceof BlockBush
                || block instanceof BlockLeaves
                || block instanceof BlockWeb
                || block instanceof BlockFence
                || block instanceof BlockFenceGate
                || block instanceof BlockGlass
                || block instanceof BlockPane
                || block instanceof BlockVine
                || block instanceof BlockLadder;
    }

    private static Vec3 eye(EntityLivingBase entity) {
        return Vec3.createVectorHelper(entity.posX, entity.posY + entity.getEyeHeight(), entity.posZ);
    }

    private static Vec3 target(Entity entity) {
        double y = entity instanceof EntityLivingBase
                ? entity.posY + ((EntityLivingBase)entity).getEyeHeight()
                : (entity.boundingBox.minY + entity.boundingBox.maxY) * 0.5D;
        return Vec3.createVectorHelper(entity.posX, y, entity.posZ);
    }

    private static IMixinDataDisplay data(EntityNPCInterface npc) {
        return (IMixinDataDisplay)npc.display;
    }

    private static final class TraceResult {
        final boolean clear;
        final int passedBlocks;
        final Vec3 lastExit;

        TraceResult(boolean clear, int passedBlocks, Vec3 lastExit) {
            this.clear = clear;
            this.passedBlocks = passedBlocks;
            this.lastExit = lastExit;
        }
    }
}

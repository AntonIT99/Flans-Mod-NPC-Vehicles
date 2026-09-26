package com.wolffsmod.customnpc;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.MathHelper;
import noppes.npcs.entity.EntityNPCInterface;

/** One task's expensive partial pursuit path; never substitutes a tactical XYZ destination. */
public final class PartialPursuitReuse {
    public static long reusedRequests;
    private PathEntity path;
    private EntityLivingBase target;
    private int builtTick;
    private double tx, ty, tz, px, pz;
    public void clear() { path = null; target = null; }

    public void move(EntityNPCInterface npc, EntityLivingBase currentTarget) {
        PathEntity current = npc.getNavigator().getPath();
        PathPoint end = current == null ? null : current.getFinalPathPoint();
        if (path != null && current == path && target == currentTarget && end != null && !current.isFinished()
                && PursuitReusePolicy.permits(npc.ticksExisted - builtTick,
                square(currentTarget.posX - tx) + square(currentTarget.posZ - tz), currentTarget.boundingBox.minY - ty,
                square(npc.posX - px) + square(npc.posZ - pz),
                square(end.xCoord - (currentTarget.posX - npc.width / 2.0F))
                        + square(end.zCoord - (currentTarget.posZ - npc.width / 2.0F)))) {
            px = npc.posX; pz = npc.posZ;
            npc.getNavigator().setSpeed(1.0D);
            reusedRequests++;
            return;
        }
        clear();
        long started = System.nanoTime();
        boolean accepted = npc.getNavigator().tryMoveToEntityLiving(currentTarget, 1.0D);
        long elapsed = System.nanoTime() - started;
        if (!accepted || elapsed <= 50000000L) return;
        current = npc.getNavigator().getPath();
        end = current == null ? null : current.getFinalPathPoint();
        if (end == null || current.isFinished()) return;
        int gx = MathHelper.floor_double(currentTarget.posX - npc.width / 2.0F);
        int gy = MathHelper.floor_double(currentTarget.boundingBox.minY);
        int gz = MathHelper.floor_double(currentTarget.posZ - npc.width / 2.0F);
        if (end.xCoord == gx && end.yCoord == gy && end.zCoord == gz) return;
        path = current; target = currentTarget; builtTick = npc.ticksExisted;
        tx = currentTarget.posX; ty = currentTarget.boundingBox.minY; tz = currentTarget.posZ;
        px = npc.posX; pz = npc.posZ;
    }
    private static double square(double value) { return value * value; }
}

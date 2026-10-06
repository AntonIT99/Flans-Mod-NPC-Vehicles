package com.wolffsmod.customnpc;

import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.Vec3;

public final class VehiclePathFollower {
    private VehiclePathFollower() {}

    public static Vec3 steeringTarget(Entity entity, PathEntity path, double lookahead) {
        if (path == null || path.isFinished()) return null;
        int start = path.getCurrentPathIndex();
        int end = path.getCurrentPathLength();
        Vec3 previous = Vec3.createVectorHelper(entity.posX, entity.posY, entity.posZ);
        Vec3 traceStart = Vec3.createVectorHelper(entity.posX, entity.posY + 0.5D, entity.posZ);
        Vec3 selected = path.getVectorFromIndex(entity, start);
        double travelled = 0.0D;
        for (int i = start; i < end; i++) {
            Vec3 point = path.getVectorFromIndex(entity, i);
            double dx = point.xCoord - previous.xCoord;
            double dz = point.zCoord - previous.zCoord;
            travelled += Math.sqrt(dx * dx + dz * dz);
            Vec3 traceEnd = Vec3.createVectorHelper(point.xCoord, point.yCoord + 0.5D, point.zCoord);
            if (entity.worldObj.rayTraceBlocks(traceStart, traceEnd) != null && i > start) break;
            selected = point;
            if (travelled >= lookahead) break;
            previous = point;
        }
        return selected;
    }

    public static double upcomingTurn(PathEntity path, Entity entity, int nodeSpan) {
        if (path == null || path.isFinished()) return 0.0D;
        int i = path.getCurrentPathIndex();
        int last = Math.min(path.getCurrentPathLength() - 1, i + Math.max(2, nodeSpan));
        if (last <= i + 1) return 0.0D;
        Vec3 a = path.getVectorFromIndex(entity, i);
        Vec3 b = path.getVectorFromIndex(entity, Math.min(last, i + Math.max(1, nodeSpan / 2)));
        Vec3 c = path.getVectorFromIndex(entity, last);
        double h1 = Math.atan2(b.zCoord - a.zCoord, b.xCoord - a.xCoord);
        double h2 = Math.atan2(c.zCoord - b.zCoord, c.xCoord - b.xCoord);
        double delta = Math.toDegrees(h2 - h1);
        while (delta > 180.0D) delta -= 360.0D;
        while (delta < -180.0D) delta += 360.0D;
        return Math.abs(delta);
    }
}

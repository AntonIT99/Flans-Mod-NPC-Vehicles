package com.wolffsmod.customnpc;

import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemAAGun;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGun;
import com.wolffsmod.entity.EntityFlanDriveableNPC;
import com.wolffsmod.flansmod.FlanUtils;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;

/** Small, deterministic server-side fire-control solver for unguided Flan bullets. */
public final class FlanBallisticAim {
    private FlanBallisticAim() {}

    public static Solution solve(EntityFlanDriveableNPC vehicle, EntityLivingBase target, MotionEstimate motion) {
        if (vehicle == null || vehicle.npc == null || target == null) return null;
        ItemStack projectile = vehicle.npc.inventory.getProjectile();
        if (projectile == null || !(projectile.getItem() instanceof ItemBullet)) return null;
        BulletType bullet = ((ItemBullet)projectile.getItem()).type;
        float speed = getLaunchSpeed(vehicle, projectile, bullet);
        if (!(speed > 0.01F) || Float.isNaN(speed) || Float.isInfinite(speed)) return null;

        float drag = bullet.dragInAir;
        if (!(drag > 0.0F && drag <= 1.0F) || Float.isNaN(drag)) drag = 1.0F;
        float gravity = Math.max(0.0F, 0.02F * bullet.fallSpeed);
        Vec3 origin = vehicle.getPrimaryAimOrigin();

        double aimY = target.boundingBox.minY + target.height * 0.55D;
        double predictedX = target.posX;
        double predictedY = aimY;
        double predictedZ = target.posZ;
        double velocityX = motion == null ? clamp(target.posX - target.prevPosX, -2.0D, 2.0D) : motion.velocityX;
        double velocityY = motion == null ? clamp(target.posY - target.prevPosY, -2.0D, 2.0D) : motion.velocityY;
        double velocityZ = motion == null ? clamp(target.posZ - target.prevPosZ, -2.0D, 2.0D) : motion.velocityZ;
        double accelerationX = motion == null ? 0.0D : motion.accelerationX;
        double accelerationY = motion == null ? 0.0D : motion.accelerationY;
        double accelerationZ = motion == null ? 0.0D : motion.accelerationZ;
        float elevation = 0.0F;
        float flightTicks = 0.0F;
        float previousFlightTicks = -1.0F;

        // Couple flight time and target prediction, with a small fixed iteration ceiling.
        for (int leadPass = 0; leadPass < 4; leadPass++) {
            double dx = predictedX - origin.xCoord;
            double dz = predictedZ - origin.zCoord;
            double horizontal = Math.sqrt(dx * dx + dz * dz);
            double vertical = predictedY - origin.yCoord;
            elevation = solveElevation(horizontal, vertical, speed, gravity, drag);
            Flight flight = simulate(horizontal, elevation, speed, gravity, drag);
            if (!flight.valid) return null;
            flightTicks = Math.min(flight.ticks, 100.0F);
            double leadX = velocityX * flightTicks + 0.5D * accelerationX * flightTicks * flightTicks;
            double leadY = velocityY * flightTicks + 0.5D * accelerationY * flightTicks * flightTicks;
            double leadZ = velocityZ * flightTicks + 0.5D * accelerationZ * flightTicks * flightTicks;
            double horizontalLead = Math.sqrt(leadX * leadX + leadZ * leadZ);
            if (horizontalLead > 96.0D) {
                double scale = 96.0D / horizontalLead;
                leadX *= scale;
                leadZ *= scale;
            }
            leadY = clamp(leadY, -48.0D, 48.0D);
            predictedX = target.posX + leadX;
            predictedY = aimY + leadY;
            predictedZ = target.posZ + leadZ;
            if (previousFlightTicks >= 0.0F && Math.abs(previousFlightTicks - flightTicks) < 0.05F) break;
            previousFlightTicks = flightTicks;
        }

        double dx = predictedX - origin.xCoord;
        double dz = predictedZ - origin.zCoord;
        float yaw = (float)(Math.atan2(dz, dx) * 180.0D / Math.PI) - 90.0F;
        return new Solution(yaw, -elevation, flightTicks, speed);
    }

    public static float getLaunchSpeed(EntityFlanDriveableNPC vehicle, ItemStack projectile, BulletType bullet) {
        // The inventory toggles import native Flan speed into pSpeed once. From
        // then on the editable NPC stat is authoritative for both aim and launch.
        return Math.max(0.01F, vehicle.npc.stats.pSpeed);
    }

    private static float solveElevation(double horizontal, double vertical, float speed, float gravity, float drag) {
        if (horizontal < 0.01D) return vertical >= 0.0D ? 89.0F : -89.0F;
        float angle = (float)Math.toDegrees(Math.atan2(vertical, horizontal));
        for (int i = 0; i < 7; i++) {
            Flight base = simulate(horizontal, angle, speed, gravity, drag);
            Flight higher = simulate(horizontal, Math.min(89.0F, angle + 0.5F), speed, gravity, drag);
            if (!base.valid || !higher.valid) break;
            double error = base.y - vertical;
            double derivative = (higher.y - base.y) / 0.5D;
            if (Math.abs(error) < 0.025D || Math.abs(derivative) < 1.0E-5D) break;
            angle = (float)clamp(angle - error / derivative, -89.0D, 89.0D);
        }
        return angle;
    }

    private static Flight simulate(double horizontal, float elevation, float speed, float gravity, float drag) {
        double radians = Math.toRadians(elevation);
        double motionHorizontal = Math.cos(radians) * speed;
        double motionY = Math.sin(radians) * speed;
        double x = 0.0D, y = 0.0D;
        for (int tick = 1; tick <= 200; tick++) {
            motionHorizontal *= drag;
            motionY = motionY * drag - gravity;
            double previousX = x;
            double previousY = y;
            x += motionHorizontal;
            y += motionY;
            if (x >= horizontal && x > previousX) {
                double fraction = (horizontal - previousX) / (x - previousX);
                return new Flight(true, previousY + (y - previousY) * fraction, tick - 1 + (float)fraction);
            }
            if (motionHorizontal <= 1.0E-5D) break;
        }
        return new Flight(false, 0.0D, 0.0F);
    }

    private static double clamp(double value, double min, double max) { return Math.max(min, Math.min(max, value)); }

    /** Per-seat target history. Observe every tick; solve only on the seat's normal three-tick cadence. */
    public static final class MotionTracker {
        private int targetId = Integer.MIN_VALUE;
        private int lastTick = Integer.MIN_VALUE;
        private double lastX, lastY, lastZ;
        private double velocityX, velocityY, velocityZ;
        private double accelerationX, accelerationY, accelerationZ;
        private int samples;

        public MotionEstimate observe(EntityLivingBase target, int tick) {
            int id = target.getEntityId();
            int elapsed = tick - lastTick;
            double dx = target.posX - lastX, dy = target.posY - lastY, dz = target.posZ - lastZ;
            double distanceSq = dx * dx + dy * dy + dz * dz;
            if (id != targetId || elapsed <= 0 || elapsed > 5 || distanceSq > 64.0D * elapsed * elapsed) {
                targetId = id;
                samples = 0;
                // Give a newly acquired target useful lead immediately. Vanilla maintains
                // prevPos* every tick; the clamps also reject teleports and corrections.
                velocityX = clamp(target.posX - target.prevPosX, -2.0D, 2.0D);
                velocityY = clamp(target.posY - target.prevPosY, -2.0D, 2.0D);
                velocityZ = clamp(target.posZ - target.prevPosZ, -2.0D, 2.0D);
                accelerationX = accelerationY = accelerationZ = 0.0D;
            } else {
                double rawX = clamp(dx / elapsed, -3.0D, 3.0D);
                double rawY = clamp(dy / elapsed, -3.0D, 3.0D);
                double rawZ = clamp(dz / elapsed, -3.0D, 3.0D);
                double oldX = velocityX, oldY = velocityY, oldZ = velocityZ;
                double velocityWeight = samples < 2 ? 0.65D : 0.35D;
                velocityX += (rawX - velocityX) * velocityWeight;
                velocityY += (rawY - velocityY) * velocityWeight;
                velocityZ += (rawZ - velocityZ) * velocityWeight;
                double confidence = Math.min(1.0D, samples / 8.0D);
                double rawAccelerationX = clamp((velocityX - oldX) / elapsed, -0.08D, 0.08D) * confidence;
                double rawAccelerationY = clamp((velocityY - oldY) / elapsed, -0.08D, 0.08D) * confidence;
                double rawAccelerationZ = clamp((velocityZ - oldZ) / elapsed, -0.08D, 0.08D) * confidence;
                accelerationX += (rawAccelerationX - accelerationX) * 0.20D;
                accelerationY += (rawAccelerationY - accelerationY) * 0.20D;
                accelerationZ += (rawAccelerationZ - accelerationZ) * 0.20D;
                samples = Math.min(samples + 1, 1000);
            }
            lastTick = tick;
            lastX = target.posX; lastY = target.posY; lastZ = target.posZ;
            return new MotionEstimate(velocityX, velocityY, velocityZ,
                    accelerationX, accelerationY, accelerationZ, samples);
        }
    }

    public static final class MotionEstimate {
        public final double velocityX, velocityY, velocityZ;
        public final double accelerationX, accelerationY, accelerationZ;
        public final int samples;
        private MotionEstimate(double velocityX, double velocityY, double velocityZ,
                               double accelerationX, double accelerationY, double accelerationZ, int samples) {
            this.velocityX = velocityX; this.velocityY = velocityY; this.velocityZ = velocityZ;
            this.accelerationX = accelerationX; this.accelerationY = accelerationY; this.accelerationZ = accelerationZ;
            this.samples = samples;
        }
    }

    public static final class Solution {
        public final float yaw, pitch, flightTicks, launchSpeed;
        private Solution(float yaw, float pitch, float flightTicks, float launchSpeed) {
            this.yaw = yaw; this.pitch = pitch; this.flightTicks = flightTicks; this.launchSpeed = launchSpeed;
        }
    }

    private static final class Flight {
        final boolean valid; final double y; final float ticks;
        Flight(boolean valid, double y, float ticks) { this.valid = valid; this.y = y; this.ticks = ticks; }
    }
}

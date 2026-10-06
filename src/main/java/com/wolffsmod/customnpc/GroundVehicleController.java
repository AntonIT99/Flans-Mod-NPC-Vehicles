package com.wolffsmod.customnpc;

import com.wolffsmod.WolffNPCMod;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import noppes.npcs.entity.EntityNPCInterface;

/** Server-authoritative forward-driving controller used only by the Ground mobility profile. */
public final class GroundVehicleController {
    private static final Map<EntityNPCInterface, GroundVehicleState> STATES = new WeakHashMap<>();
    private GroundVehicleController() {}

    public static void update(EntityNPCInterface npc) {
        if (npc.worldObj.isRemote) return;
        IMixinDataAI data = (IMixinDataAI)npc.ais;
        if (data.getVehicleMobilityProfile() != VehicleMobilityProfile.GROUND || !data.getGroundDrivingEnabled()) return;

        GroundVehicleState s = STATES.get(npc);
        if (s == null) { s = new GroundVehicleState(); STATES.put(npc, s); }
        if (!s.initialized) initialize(npc, s);

        PathEntity path = npc.getNavigator().getPath();
        boolean hasPath = path != null && !path.isFinished();
        s.pathNode = hasPath ? path.getCurrentPathIndex() : -1;
        double speedRatio = Math.min(1.0D, Math.abs(s.currentSpeed) * 20.0D / data.getGroundMaxForwardSpeed());
        double lookahead = data.getGroundSteeringLookahead() * (0.55D + speedRatio * 0.85D);
        if (!hasPath) s.steeringTarget = null;
        else if (s.steeringTarget == null || s.steeringTargetNode != s.pathNode || npc.ticksExisted >= s.steeringTargetTick) {
            s.steeringTarget = VehiclePathFollower.steeringTarget(npc, path, lookahead);
            s.steeringTargetNode = s.pathNode;
            s.steeringTargetTick = npc.ticksExisted + 3;
        }

        double destinationDistance = hasPath ? destinationDistance(npc, path) : 0.0D;
        if (hasPath && destinationDistance <= data.getGroundStopDistance() && Math.abs(s.currentSpeed) < 0.02D) {
            npc.getNavigator().clearPathEntity();
            path = null; hasPath = false; s.pathNode = -1; s.steeringTarget = null;
        }
        float bearing = s.currentHeading;
        float error = 0.0F;
        if (s.steeringTarget != null) {
            bearing = headingTo(npc, s.steeringTarget);
            error = MathHelper.wrapAngleTo180_float(bearing - s.currentHeading);
        }

        updateProgress(npc, s, hasPath);
        if (npc.isCollidedHorizontally && hasPath) s.collisionTicks++;
        else s.collisionTicks = Math.max(0, s.collisionTicks - 2);
        if (s.collisionTicks >= 8 && s.recoveryTicks == 0 && data.getGroundAllowReversing()) {
            s.recoveryTicks = 25; s.collisionTicks = 0;
        }
        boolean recovery = s.recoveryTicks > 0;
        if (recovery) s.recoveryTicks--;
        boolean mayReverse = data.getGroundAllowReversing() && data.getGroundMaxReverseSpeed() > 0.0D;
        boolean shortBehind = hasPath && Math.abs(error) >= data.getGroundReverseAngleThreshold()
                && destinationDistance <= data.getGroundMaxReverseDistance();
        s.reversing = mayReverse && (recovery || shortBehind);
        float steeringHeading = s.reversing ? MathHelper.wrapAngleTo180_float(bearing + 180.0F) : bearing;

        boolean tracked = data.getGroundVehicleType() != GroundVehicleType.WHEELED;
        boolean pivot = tracked && data.getGroundAllowPivot() && hasPath && !s.reversing
                && Math.abs(error) > 70.0F && Math.abs(s.currentSpeed) < 0.035D;
        VehicleSteeringController.steer(s, data, steeringHeading, s.currentSpeed, pivot);

        double wanted = hasPath ? data.getGroundMaxForwardSpeed() / 20.0D : 0.0D;
        if (s.reversing) wanted = -data.getGroundMaxReverseSpeed() / 20.0D;
        if (pivot) wanted = 0.0D;

        if (hasPath && !s.reversing) {
            double currentTurn = Math.abs(error) / 180.0D;
            double upcoming = VehiclePathFollower.upcomingTurn(path, npc, Math.max(3, (int)Math.ceil(lookahead))) / 180.0D;
            double severity = Math.min(1.0D, Math.max(currentTurn, upcoming));
            wanted *= Math.max(0.12D, 1.0D - severity * data.getGroundTurnSlowdown());
            if (destinationDistance < data.getGroundStopDistance() * 3.0D)
                wanted *= Math.max(0.0D, (destinationDistance - data.getGroundStopDistance()) / (data.getGroundStopDistance() * 2.0D));
        }

        wanted = applyLocalSeparation(npc, data, s, wanted);
        s.desiredSpeed = wanted;
        advanceSpeed(s, data);
        applyMotion(npc, s);
        npc.moveStrafing = 0.0F;
        npc.moveForward = s.currentSpeed < -0.001D ? -1.0F : s.currentSpeed > 0.001D ? 1.0F : 0.0F;
        npc.rotationYaw = s.currentHeading;
        npc.renderYawOffset = s.currentHeading;

        if (data.getGroundDebug() && npc.ticksExisted % 20 == 0) debug(npc, s, data);
    }

    private static void initialize(EntityNPCInterface npc, GroundVehicleState s) {
        s.currentHeading = npc.renderYawOffset;
        double yaw = Math.toRadians(s.currentHeading);
        s.currentSpeed = npc.motionX * -Math.sin(yaw) + npc.motionZ * Math.cos(yaw);
        s.lastProgressX = npc.posX; s.lastProgressZ = npc.posZ;
        s.lastProgressTick = npc.ticksExisted; s.initialized = true;
    }

    private static void advanceSpeed(GroundVehicleState s, IMixinDataAI d) {
        double desired = s.desiredSpeed;
        double current = s.currentSpeed;
        boolean opposite = current * desired < 0.0D;
        double perTick = (opposite || Math.abs(desired) < Math.abs(current) ? d.getGroundBraking()
                : Math.abs(desired) > 0.0001D ? d.getGroundAcceleration() : d.getGroundCoastDeceleration()) / 400.0D;
        if (current < desired) current = Math.min(desired, current + perTick);
        else if (current > desired) current = Math.max(desired, current - perTick);
        s.braking = Math.abs(desired) + 0.0001D < Math.abs(s.currentSpeed) || opposite;
        s.currentSpeed = Math.abs(current) < 0.0005D ? 0.0D : current;
    }

    private static void applyMotion(EntityNPCInterface npc, GroundVehicleState s) {
        double yaw = Math.toRadians(s.currentHeading);
        npc.motionX = -Math.sin(yaw) * s.currentSpeed;
        npc.motionZ = Math.cos(yaw) * s.currentSpeed;
    }

    private static void updateProgress(EntityNPCInterface npc, GroundVehicleState s, boolean active) {
        if (npc.ticksExisted - s.lastProgressTick < 20) return;
        double dx = npc.posX - s.lastProgressX, dz = npc.posZ - s.lastProgressZ;
        double movedSq = dx * dx + dz * dz;
        if (active && !s.obstacleDetected && Math.abs(s.desiredSpeed) > 0.02D && movedSq < 0.04D) s.stuckTicks += 20;
        else s.stuckTicks = Math.max(0, s.stuckTicks - 20);
        if (s.stuckTicks >= 40 && s.recoveryTicks == 0) s.recoveryTicks = 25;
        if (s.stuckTicks >= 100) { npc.getNavigator().clearPathEntity(); s.stuckTicks = 0; }
        s.lastProgressX = npc.posX; s.lastProgressZ = npc.posZ; s.lastProgressTick = npc.ticksExisted;
    }

    private static double applyLocalSeparation(EntityNPCInterface npc, IMixinDataAI data, GroundVehicleState s, double wanted) {
        if (npc.ticksExisted % 5 != Math.abs(npc.getEntityId()) % 5)
            return s.obstacleDetected ? 0.0D : wanted;
        s.obstacleDetected = false;
        double range = data.getGroundFollowingDistance();
        AxisAlignedBB box = npc.boundingBox.expand(range, 1.5D, range);
        @SuppressWarnings("unchecked") List<EntityNPCInterface> nearby = npc.worldObj.getEntitiesWithinAABB(EntityNPCInterface.class, box);
        double yaw = Math.toRadians(s.currentHeading);
        double fx = -Math.sin(yaw) * (s.reversing ? -1.0D : 1.0D);
        double fz = Math.cos(yaw) * (s.reversing ? -1.0D : 1.0D);
        for (EntityNPCInterface other : nearby) {
            if (other == npc) continue;
            IMixinDataAI otherData = (IMixinDataAI)other.ais;
            if (otherData.getVehicleMobilityProfile() != VehicleMobilityProfile.GROUND || !otherData.getGroundDrivingEnabled()) continue;
            double dx = other.posX - npc.posX, dz = other.posZ - npc.posZ;
            double distSq = dx * dx + dz * dz;
            if (distSq < 0.0001D || dx * fx + dz * fz <= 0.0D) continue;
            if (distSq < data.getGroundMinimumFollowingDistance() * data.getGroundMinimumFollowingDistance()) {
                s.obstacleDetected = true; return 0.0D;
            }
            if (distSq < range * range) {
                double otherSpeed = Math.sqrt(other.motionX * other.motionX + other.motionZ * other.motionZ);
                wanted = Math.copySign(Math.min(Math.abs(wanted), otherSpeed), wanted);
            }
        }
        return wanted;
    }

    private static double destinationDistance(EntityNPCInterface npc, PathEntity path) {
        PathPoint p = path.getFinalPathPoint();
        if (p == null) return 0.0D;
        double dx = p.xCoord + 0.5D - npc.posX, dz = p.zCoord + 0.5D - npc.posZ;
        return Math.sqrt(dx * dx + dz * dz);
    }

    private static float headingTo(Entity npc, Vec3 point) {
        return (float)(Math.atan2(point.zCoord - npc.posZ, point.xCoord - npc.posX) * 180.0D / Math.PI) - 90.0F;
    }

    private static void debug(EntityNPCInterface npc, GroundVehicleState s, IMixinDataAI d) {
        WolffNPCMod.log.info("GroundVehicle {} speed={}/{} heading={}/{} steer={} turn={} node={} reverse={} brake={} stuck={} obstacle={}",
                npc.getCommandSenderName(), round(s.currentSpeed * 20), round(s.desiredSpeed * 20), round(s.currentHeading),
                round(s.desiredHeading), round(s.steeringAngle), round(s.currentTurnRate * 20), s.pathNode,
                s.reversing, s.braking, s.stuckTicks, s.obstacleDetected);
    }

    private static double round(double value) { return Math.round(value * 100.0D) / 100.0D; }
}

package com.wolffsmod.customnpc;

import com.wolffsmod.WolffNPCMod;
import java.util.Map;
import java.util.WeakHashMap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import noppes.npcs.constants.EnumMovingType;
import noppes.npcs.entity.EntityNPCInterface;

/** Server-authoritative aircraft clearance and deliberately lightweight flight shaping. */
public final class AircraftFlightController {
    private static final Map<EntityNPCInterface, State> STATES = new WeakHashMap<EntityNPCInterface, State>();
    private AircraftFlightController() {}

    public static boolean isEnabled(EntityNPCInterface npc) {
        if (npc == null || npc.ais.movementType != 1) return false;
        return ((IMixinDataAI)npc.ais).getAircraftFlightType() != AircraftFlightType.NORMAL;
    }

    public static void update(EntityNPCInterface npc) {
        if (npc.worldObj.isRemote || !isEnabled(npc) || npc.isKilled()) return;
        IMixinDataAI data = (IMixinDataAI)npc.ais;
        State state = state(npc);
        sampleIfNeeded(npc, data, state);

        double desiredY = state.terrainY + data.getAircraftMinimumAttackAltitude() +
                (data.getAircraftFlightType() == AircraftFlightType.PLANE ? 5.0D : 2.0D);
        double error = desiredY - npc.posY;
        if (error > 0.5D) {
            double climb = data.getAircraftFlightType() == AircraftFlightType.PLANE ? 0.24D : 0.30D;
            npc.motionY = Math.max(npc.motionY, Math.min(climb, 0.06D + error * 0.035D));
        } else if (error < -5.0D) {
            double descent = data.getAircraftFlightType() == AircraftFlightType.PLANE ? -0.12D : -0.16D;
            npc.motionY = Math.min(npc.motionY, Math.max(descent, error * 0.025D));
        } else if (data.getAircraftFlightType() == AircraftFlightType.HELICOPTER && npc.getNavigator().noPath()) {
            npc.motionY *= 0.55D;
        }

        if (data.getAircraftFlightType() == AircraftFlightType.PLANE) updatePlane(npc, state);
        else if (data.getAircraftFlightType() == AircraftFlightType.HELICOPTER) updateHelicopter(npc, state);
        if (data.getAircraftDebug() && npc.ticksExisted % 40 == 0) {
            EntityLivingBase target = npc.getAttackTarget();
            String flightState = state.clearance < data.getAircraftMinimumAttackAltitude() ? "ALTITUDE_RECOVERY"
                    : data.getAircraftFlightType() == AircraftFlightType.PLANE ? "ATTACK_RUN"
                    : npc.getNavigator().noPath() ? "HOVERING" : "REPOSITIONING";
            WolffNPCMod.log.info("Aircraft {} id={} type={} state={} y={} terrain={} clearance={}/{} target={} canAttack={}",
                    npc.getCommandSenderName(), npc.getEntityId(), data.getAircraftFlightType(), flightState,
                    round(npc.posY), state.terrainY, round(state.clearance), data.getAircraftMinimumAttackAltitude(),
                    target == null ? "none" : target.getCommandSenderName(), state.attackAllowed);
        }
    }

    public static boolean canAttack(EntityNPCInterface npc) {
        if (!isEnabled(npc)) return true;
        IMixinDataAI data = (IMixinDataAI)npc.ais;
        State state = state(npc);
        sampleIfNeeded(npc, data, state);
        return state.attackAllowed;
    }

    private static void updatePlane(EntityNPCInterface npc, State state) {
        EntityLivingBase target = npc.getAttackTarget();
        if (!state.planeYawInitialized) {
            state.planeYaw = npc.rotationYaw;
            state.planeYawInitialized = true;
        }
        float desiredYaw = state.planeYaw;
        if (target != null && target.isEntityAlive()) {
            double dx = target.posX - npc.posX;
            double dz = target.posZ - npc.posZ;
            if (dx * dx + dz * dz > 1.0D)
                desiredYaw = (float)(Math.atan2(-dx, dz) * 180.0D / Math.PI);
        } else if (npc.ais.movingType == EnumMovingType.Wandering) {
            desiredYaw = loiterYaw(npc, state);
        }
        double existing = Math.sqrt(npc.motionX * npc.motionX + npc.motionZ * npc.motionZ);
        double speed = Math.max(0.13D, Math.min(0.42D, existing));
        // Turn rate is derived from the requested loiter radius. This prevents
        // short wander nodes from making aircraft reverse direction in place.
        double radius = Math.max(16.0D, npc.ais.walkingRange);
        float maxTurn = (float)Math.max(0.25D, Math.min(2.0D, Math.toDegrees(speed / radius)));
        float delta = MathHelper.wrapAngleTo180_float(desiredYaw - state.planeYaw);
        state.planeYaw += Math.max(-maxTurn, Math.min(maxTurn, delta));
        npc.rotationYaw = state.planeYaw;
        npc.renderYawOffset = state.planeYaw;
        double yaw = Math.toRadians(state.planeYaw);
        npc.motionX = -Math.sin(yaw) * speed;
        npc.motionZ = Math.cos(yaw) * speed;
    }

    private static float loiterYaw(EntityNPCInterface npc, State state) {
        double centerX = npc.getStartXPos();
        double centerZ = npc.getStartZPos();
        double dx = npc.posX - centerX;
        double dz = npc.posZ - centerZ;
        double distance = Math.sqrt(dx * dx + dz * dz);
        if (distance < 1.0D) return state.planeYaw;

        double radialX = dx / distance;
        double radialZ = dz / distance;
        boolean clockwise = (npc.getEntityId() & 1) == 0;
        double tangentX = clockwise ? -radialZ : radialZ;
        double tangentZ = clockwise ? radialX : -radialX;
        double radius = Math.max(16.0D, npc.ais.walkingRange);
        double correction = Math.max(-0.75D, Math.min(0.75D, (distance - radius) / radius));
        double directionX = tangentX - radialX * correction * 1.5D;
        double directionZ = tangentZ - radialZ * correction * 1.5D;
        return (float)(Math.atan2(-directionX, directionZ) * 180.0D / Math.PI);
    }

    private static void updateHelicopter(EntityNPCInterface npc, State state) {
        if (!state.helicopterYawInitialized) {
            state.helicopterYaw = npc.rotationYaw;
            state.helicopterYawInitialized = true;
        }
        float desiredYaw = state.helicopterYaw;
        EntityLivingBase target = npc.getAttackTarget();
        if (target != null && target.isEntityAlive()) {
            double dx = target.posX - npc.posX;
            double dz = target.posZ - npc.posZ;
            if (dx * dx + dz * dz > 1.0D)
                desiredYaw = (float)(Math.atan2(-dx, dz) * 180.0D / Math.PI);
        } else {
            double speedSq = npc.motionX * npc.motionX + npc.motionZ * npc.motionZ;
            if (speedSq > 0.0004D)
                desiredYaw = (float)(Math.atan2(-npc.motionX, npc.motionZ) * 180.0D / Math.PI);
        }
        float delta = MathHelper.wrapAngleTo180_float(desiredYaw - state.helicopterYaw);
        state.helicopterYaw += Math.max(-3.0F, Math.min(3.0F, delta));
        npc.rotationYaw = state.helicopterYaw;
        npc.renderYawOffset = state.helicopterYaw;
    }

    private static void sampleIfNeeded(EntityNPCInterface npc, IMixinDataAI data, State state) {
        if (state.sampleTick != Integer.MIN_VALUE
                && (npc.ticksExisted + npc.getEntityId()) % 10 != 0
                && npc.ticksExisted - state.sampleTick < 20) return;
        state.sampleTick = npc.ticksExisted;
        int x = MathHelper.floor_double(npc.posX);
        int z = MathHelper.floor_double(npc.posZ);
        int terrain = surface(npc, x, z);
        AircraftFlightType type = data.getAircraftFlightType();
        if (type == AircraftFlightType.HELICOPTER) {
            terrain = Math.max(terrain, surface(npc, x + 3, z));
            terrain = Math.max(terrain, surface(npc, x - 3, z));
            terrain = Math.max(terrain, surface(npc, x, z + 3));
            terrain = Math.max(terrain, surface(npc, x, z - 3));
        } else if (type == AircraftFlightType.PLANE) {
            double yaw = Math.toRadians(npc.rotationYaw);
            for (int distance = 8; distance <= 24; distance += 8) {
                int fx = MathHelper.floor_double(npc.posX - Math.sin(yaw) * distance);
                int fz = MathHelper.floor_double(npc.posZ + Math.cos(yaw) * distance);
                terrain = Math.max(terrain, surface(npc, fx, fz));
            }
        }
        state.terrainY = terrain;
        state.clearance = npc.boundingBox.minY - terrain;
        int minimum = data.getAircraftMinimumAttackAltitude();
        if (state.attackAllowed) state.attackAllowed = state.clearance >= minimum;
        else state.attackAllowed = state.clearance >= minimum + 2.0D;
    }

    private static int surface(EntityNPCInterface npc, int x, int z) {
        if (!npc.worldObj.blockExists(x, 0, z)) return MathHelper.floor_double(npc.posY);
        return npc.worldObj.getTopSolidOrLiquidBlock(x, z);
    }

    private static State state(EntityNPCInterface npc) {
        State state = STATES.get(npc);
        if (state == null) { state = new State(); STATES.put(npc, state); }
        return state;
    }

    private static double round(double value) { return Math.round(value * 10.0D) / 10.0D; }
    private static final class State {
        int sampleTick = Integer.MIN_VALUE;
        int terrainY;
        double clearance;
        boolean attackAllowed;
        boolean planeYawInitialized;
        float planeYaw;
        boolean helicopterYawInitialized;
        float helicopterYaw;
    }
}

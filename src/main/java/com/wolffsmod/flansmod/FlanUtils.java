package com.wolffsmod.flansmod;

import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.driveables.DriveablePosition;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.ShootPoint;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityShootable;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.teams.ArmourType;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.item.ItemStack;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

/**
 * This class provides methods for code compatibility between different Flan's Mod versions.
 * For each Flan version, the implementation of these methods will differ but their signature remains the same.
 * This allows keeping the code identical in other classes of this mod.
 * */
public class FlanUtils
{
    public static final Vector3f VEC3F_ZERO = new Vector3f(0F, 0F, 0F);

    private FlanUtils() {}

    private static Method shootAnimationMethod;
    private static int shootAnimationParameterCount;
    private static boolean shootAnimationLookupDone;
    private static boolean shootAnimationFailureLogged;

    /**
     * Flan forks disagree on whether doShoot has six parameters or an added
     * timeToRecoil parameter. Keep the client visual optional and fork-safe.
     */
    public static void doShootAnimation(GunAnimations animations, int pumpDelay, int pumpTime,
                                        int hammerDelay, float hammerAngle, float altHammerAngle,
                                        int casingDelay)
    {
        if (!shootAnimationLookupDone)
        {
            shootAnimationLookupDone = true;
            try
            {
                shootAnimationMethod = animations.getClass().getMethod("doShoot",
                        int.class, int.class, int.class, float.class, float.class, int.class);
                shootAnimationParameterCount = 6;
            }
            catch (NoSuchMethodException sixMissing)
            {
                try
                {
                    shootAnimationMethod = animations.getClass().getMethod("doShoot",
                            int.class, int.class, int.class, float.class, float.class, int.class, int.class);
                    shootAnimationParameterCount = 7;
                }
                catch (NoSuchMethodException sevenMissing)
                {
                    logAnimationFailureOnce("No compatible Flan doShoot animation method was found", sevenMissing);
                }
            }
        }

        if (shootAnimationMethod == null)
            return;

        try
        {
            if (shootAnimationParameterCount == 6)
                shootAnimationMethod.invoke(animations, pumpDelay, pumpTime, hammerDelay,
                        hammerAngle, altHammerAngle, casingDelay);
            else
                shootAnimationMethod.invoke(animations, pumpDelay, pumpTime, hammerDelay,
                        hammerAngle, altHammerAngle, casingDelay, 20);
        }
        catch (ReflectiveOperationException | RuntimeException | LinkageError exception)
        {
            logAnimationFailureOnce("Flan shoot animation failed; disabling only the cosmetic animation", exception);
            shootAnimationMethod = null;
        }
    }

    public static Vector3f createVector3f(String input)
    {
        Vector3f vec = new Vector3f();
        String noBrackets = input.substring(1, input.length() - 1);
        String[] split = noBrackets.split(",");
        if (split.length == 3)
        {
            vec.x = Float.parseFloat(split[0]);
            vec.y = Float.parseFloat(split[1]);
            vec.z = Float.parseFloat(split[2]);
        }
        return vec;
    }

    public static ShootPoint createShootPoint(DriveablePosition rootPos, Vector3f offPos)
    {
        for (Constructor<?> constructor : ShootPoint.class.getConstructors())
        {
            try
            {
                if (constructor.getParameterTypes().length == 2)
                {
                    return (ShootPoint) constructor.newInstance(rootPos, offPos);
                }
                else if (constructor.getParameterTypes().length == 4)
                {
                    return (ShootPoint) constructor.newInstance(rootPos, offPos, 0F, false);
                }
            }
            catch (InvocationTargetException | InstantiationException | IllegalAccessException exception)
            {
                exception.printStackTrace();
            }
        }
        throw new RuntimeException("No suitable constructor found in class ShootPoint");
    }

    public static ShootableType getType(EntityShootable entity)
    {
        try
        {
            return (ShootableType) entity.getClass().getMethod("getType").invoke(entity);
        }
        catch (NoSuchMethodException exception)
        {
            if (entity instanceof EntityGrenade)
            {
                return ((EntityGrenade)entity).type;
            }
            else if (entity instanceof EntityBullet)
            {
                return ((EntityBullet)entity).type;
            }
        }
        catch (IllegalAccessException | InvocationTargetException exception)
        {
            exception.printStackTrace();
        }
        throw new RuntimeException("Could not retrieve type for EntityShootable");
    }

    public static void doReloadAnimation(GunAnimations animations, int reloadTime, int pumpDelay, int pumpTime, int chargeDelay, int chargeTime, int ammoCount, boolean single)
    {
        for (Method method : animations.getClass().getMethods())
        {
            if (method.getName().equals("doReload"))
            {
                try
                {
                    if (method.getParameterTypes().length == 7)
                    {
                        animations.getClass().getMethod("doReload", int.class, int.class, int.class, int.class, int.class, int.class, boolean.class).invoke(animations, reloadTime, pumpDelay, pumpTime, chargeDelay, chargeTime, ammoCount, single);
                        return;
                    }
                    else if (method.getParameterTypes().length == 5)
                    {
                        animations.getClass().getMethod("doReload", int.class, int.class, int.class, int.class, int.class).invoke(animations, reloadTime, pumpDelay, pumpTime, chargeDelay, chargeTime);
                        return;
                    }
                    else if (method.getParameterTypes().length == 10)
                    {
                        animations.getClass().getMethod("doReload", int.class, int.class, int.class,
                                int.class, int.class, int.class, boolean.class, boolean.class,
                                boolean.class, int.class).invoke(animations, reloadTime, pumpDelay,
                                pumpTime, chargeDelay, chargeTime, ammoCount, single, false,
                                false, ammoCount);
                        return;
                    }
                }
                catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException exception)
                {
                    exception.printStackTrace();
                }
            }
        }
    }

    public static float getBulletSpeed(GunType type, ItemStack itemStackGun, ItemStack itemStackShootable)
    {
        if (itemStackShootable != null)
        {
            try
            {
                return (float) type.getClass().getMethod("getBulletSpeed", ItemStack.class, ItemStack.class).invoke(type, itemStackGun, itemStackShootable);
            }
            catch (IllegalAccessException | InvocationTargetException exception)
            {
                exception.printStackTrace();
            }
            catch(NoSuchMethodException ignored)
            {
                // do nothing
            }
        }
        return type.getBulletSpeed(itemStackGun);
    }

    public static Optional<Float> getDamageMultiplierPrimary(DriveableType type)
    {
        try
        {
            return Optional.of((float)type.getClass().getField("damageMultiplierPrimary").get(type));
        }
        catch (NoSuchFieldException | IllegalAccessException exception)
        {
            return Optional.empty();
        }
    }

    public static Optional<Float> getDamageMultiplierSecondary(DriveableType type)
    {
        try
        {
            return Optional.of((float)type.getClass().getField("damageMultiplierSecondary").get(type));
        }
        catch (NoSuchFieldException | IllegalAccessException exception)
        {
            return Optional.empty();
        }
    }

    /**
     * CollisionBox.health is a float in Flan's Ultimate Stability Edition but
     * an int in the TAP / LabJac fork. Reading it as Number avoids a JVM field
     * descriptor dependency on either fork.
     */
    public static OptionalDouble getMaxDriveableHealth(DriveableType type)
    {
        if (type.health == null || type.health.isEmpty())
            return OptionalDouble.empty();

        double maximum = Double.NEGATIVE_INFINITY;
        boolean found = false;
        for (Object collisionBox : type.health.values())
        {
            OptionalDouble health = getNumericField(collisionBox, "health");
            if (health.isPresent())
            {
                maximum = Math.max(maximum, health.getAsDouble());
                found = true;
            }
        }
        return found ? OptionalDouble.of(maximum) : OptionalDouble.empty();
    }

    /**
     * DriveableType.shootDelay(boolean) returns float in Ultimate Stability
     * Edition and int in TAP. Reflection permits both return descriptors.
     */
    public static OptionalDouble getShootDelay(DriveableType type, boolean secondary)
    {
        try
        {
            Object value = type.getClass().getMethod("shootDelay", boolean.class).invoke(type, secondary);
            return value instanceof Number
                    ? OptionalDouble.of(((Number)value).doubleValue())
                    : OptionalDouble.empty();
        }
        catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException exception)
        {
            return OptionalDouble.empty();
        }
    }

    private static void logAnimationFailureOnce(String message, Throwable exception)
    {
        if (shootAnimationFailureLogged)
            return;
        shootAnimationFailureLogged = true;
        com.wolffsmod.WolffNPCMod.log.warn(message + ": " + exception);
    }

    private static OptionalDouble getNumericField(Object owner, String fieldName)
    {
        if (owner == null)
            return OptionalDouble.empty();

        try
        {
            Field field = owner.getClass().getField(fieldName);
            Object value = field.get(owner);
            return value instanceof Number
                    ? OptionalDouble.of(((Number)value).doubleValue())
                    : OptionalDouble.empty();
        }
        catch (NoSuchFieldException | IllegalAccessException exception)
        {
            return OptionalDouble.empty();
        }
    }

    public static double getBulletDefence(ArmourType type)
    {
        try
        {
            return (double)type.getClass().getField("bulletDefence").get(type);
        }
        catch (NoSuchFieldException | IllegalAccessException exception)
        {
            return type.defence;
        }
    }


    /**
     * Network
     */
    public static PacketParticle createPacketParticle(String s, double x1, double y1, double z1, double x2, double y2, double z2, float size)
    {
        Optional<Constructor<?>> constructor8Args = Arrays.stream(PacketParticle.class.getConstructors()).filter(constructor -> constructor.getParameterTypes().length == 8 && constructor.getParameterTypes()[7].equals(float.class)).findAny();
        Optional<Constructor<?>> constructor7Args = Arrays.stream(PacketParticle.class.getConstructors()).filter(constructor -> constructor.getParameterTypes().length == 7).findAny();

        try
        {
            if (constructor8Args.isPresent())
            {
                return (PacketParticle) constructor8Args.get().newInstance(s, x1, y1, z1, x2, y2, z2, size);
            }
            else if (constructor7Args.isPresent())
            {
                return (PacketParticle) constructor7Args.get().newInstance(s, x1, y1, z1, x2, y2, z2);
            }
        }
        catch (InvocationTargetException | InstantiationException | IllegalAccessException | IllegalArgumentException exception)
        {
            exception.printStackTrace();
        }
        throw new RuntimeException("No suitable constructor found in class PacketParticle");
    }
}

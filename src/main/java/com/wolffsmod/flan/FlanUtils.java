package com.wolffsmod.flan;

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
import java.util.Optional;

/**
 * This class provides methods for code compatibility between different Flan's Mod versions.
 * For each Flan version, the implementation of these methods will differ but their signature remains the same.
 * This allows keeping the code identical in other classes of this mod.
 * */
public class FlanUtils
{
    public static final Vector3f VEC3F_ZERO = new Vector3f(0F, 0F, 0F);

    private FlanUtils() {}

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

    public static double getBulletDefence(ArmourType type)
    {
        try
        {
            return (double)type.getClass().getField("bulletDefence").get(type);
        }
        catch (NoSuchFieldException | IllegalAccessException exception)
        {
            return type.bulletDefence;
        }
    }


    /**
     * Network
     */
    public static PacketParticle createPacketParticle(String s, double x1, double y1, double z1, double x2, double y2, double z2, float size)
    {
        for (Constructor<?> constructor : PacketParticle.class.getConstructors())
        {
            try
            {
                if (constructor.getParameterTypes().length == 8)
                {
                    return (PacketParticle) constructor.newInstance(s, x1, y1, z1, x2, y2, z2, size);
                }
                else if (constructor.getParameterTypes().length == 7)
                {
                    return (PacketParticle) constructor.newInstance(s, x1, y1, z1, x2, y2, z2);
                }
            }
            catch (InvocationTargetException | InstantiationException | IllegalAccessException exception)
            {
                exception.printStackTrace();
            }
        }
        throw new RuntimeException("No suitable constructor found in class PacketParticle");
    }
}

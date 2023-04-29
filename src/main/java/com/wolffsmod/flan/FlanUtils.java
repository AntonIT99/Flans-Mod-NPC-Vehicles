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
import com.wolffsmod.model.ModelFlanVehicle;

import net.minecraft.item.ItemStack;

import java.util.Optional;

/**
 * This class provides methods for code compatibility between different Flan's Mod versions.
 * For each Flan version, the implementation of these methods will differ but their signature remains the same.
 * This allows keeping the code identical in other classes of this mod.
 * */
public class FlanUtils
{
    public static Vector3f VEC3F_ZERO = new Vector3f(0F, 0F, 0F);

    private FlanUtils() {}

    public static ShootPoint createShootPoint(DriveablePosition rootPos, Vector3f offPos)
    {
        return new ShootPoint(rootPos, offPos, 0F, false);
    }

    public static ShootableType getType(EntityShootable entity)
    {
        if (entity instanceof EntityGrenade)
        {
            return ((EntityGrenade)entity).type;
        }
        else
        {
            return ((EntityBullet)entity).type;
        }
    }

    public static void doReloadAnimation(GunAnimations animations, int reloadTime, int pumpDelay, int pumpTime, int chargeDelay, int chargeTime, int ammoCount, boolean single)
    {
        animations.doReload(reloadTime, pumpDelay, pumpTime, chargeDelay, chargeTime);
    }

    public static float getBulletSpeed(GunType type, ItemStack itemStackGun, ItemStack itemStackShootable)
    {
        return type.getBulletSpeed(itemStackGun);
    }

    public static Optional<Float> getDamageMultiplierPrimary(DriveableType type)
    {
        return Optional.empty();
    }

    public static Optional<Float> getDamageMultiplierSecondary(DriveableType type)
    {
        return Optional.empty();
    }

    public static double getBulletDefence(ArmourType type)
    {
        return type.defence;
    }


    /**
     * Network
     */
    public static PacketParticle createPacketParticle(String s, double x1, double y1, double z1, double x2, double y2, double z2, float size)
    {
        return new PacketParticle(s, x1, y1, z1, x2, y2, z2);
    }
}

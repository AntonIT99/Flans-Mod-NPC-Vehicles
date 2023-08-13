package com.wolffsmod.customnpc;

import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.ShootPoint;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.vector.Vector3f;
import com.wolffsmod.WolffNPCMod;
import com.wolffsmod.flan.FlanUtils;
import com.wolffsmod.network.EnumAnimPacket;
import com.wolffsmod.network.FlanAnimPacket;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NPCInterfaceUtil
{
    private NPCInterfaceUtil() {}

    public static void setThrowableHeading(EntityThrowable throwable, double speed, boolean hasGravity, double par1, double par3, double par5, float par7, float par8)
    {
        float f3 = MathHelper.sqrt_double(par1 * par1 + par5 * par5);
        float yaw = (float)(Math.atan2(par1, par5) * 180.0D / Math.PI);
        float pitch = hasGravity ? par7 : (float)(Math.atan2(par3, f3) * 180.0D / Math.PI);
        Random rand = new Random();
        throwable.prevRotationYaw = throwable.rotationYaw = yaw;
        throwable.prevRotationPitch = throwable.rotationPitch = pitch;
        throwable.motionX = MathHelper.sin(yaw / 180.0F * (float)Math.PI) * MathHelper.cos(pitch / 180.0F * (float)Math.PI);
        throwable.motionZ = (MathHelper.cos(yaw / 180.0F * (float)Math.PI) * MathHelper.cos(pitch / 180.0F * (float)Math.PI));
        throwable.motionY = (MathHelper.sin((pitch + 1.0F) / 180.0F * (float)Math.PI));
        throwable.motionX += rand.nextGaussian() * 0.007499999832361937D * par8;
        throwable.motionZ += rand.nextGaussian() * 0.007499999832361937D * par8;
        throwable.motionY += rand.nextGaussian() * 0.007499999832361937D * par8;
        throwable.motionX *= speed;
        throwable.motionZ *= speed;
        throwable.motionY *= speed;
    }

    public static float getAngleForXYZ(float speed, double varY, double horiDist, boolean arc)
    {
        float g = 0.03F;
        float var1 = speed * speed;
        double var2 = (g * horiDist);
        double var3 = ((g * horiDist * horiDist) + (2 * varY * var1));
        double var4 = (var1 * var1) - (g * var3);
        if (var4 < 0) return 30.0F;
        float var6 = arc ? var1 + MathHelper.sqrt_double(var4) : var1 - MathHelper.sqrt_double(var4);
        return (float) (Math.atan2(var6 , var2) * 180.0D / Math.PI);
    }

    public static void playGunReloadSound(ItemStack gunStack, double posX, double posY, double posZ, int dimension)
    {
        ItemGun item = (ItemGun) gunStack.getItem();
        GunType gunType = item.type;
        String soundToPlay = null;
        AttachmentType grip = gunType.getGrip(gunStack);

        if (gunType.getSecondaryFire(gunStack) && grip != null && grip.secondaryReloadSound != null)
            soundToPlay = grip.secondaryReloadSound;
        else if (gunType.reloadSoundOnEmpty != null)
            soundToPlay = gunType.reloadSoundOnEmpty;
        else if (gunType.reloadSound != null)
            soundToPlay = gunType.reloadSound;

        if (soundToPlay != null && !soundToPlay.isEmpty())
            PacketPlaySound.sendSoundPacket(posX, posY, posZ, gunType.reloadSoundRange, dimension, soundToPlay, true);
    }

    public static void playGunFireSound(ItemStack gunStack, double posX, double posY, double posZ, int dimension, boolean lastBurst)
    {
        ItemGun item = (ItemGun) gunStack.getItem();
        GunType gunType = item.type;
        if (item.soundDelay <= 0 && gunType.shootSound != null)
        {
            String soundToPlay = getGunFireSound(gunStack, gunType, lastBurst);

            if (soundToPlay != null)
            {
                AttachmentType barrel = gunType.getBarrel(gunStack);
                PacketPlaySound.sendSoundPacket(posX, posY, posZ, gunType.gunSoundRange, dimension, soundToPlay, gunType.distortSound, barrel != null && barrel.silencer && !gunType.getSecondaryFire(gunStack));
            }

            item.soundDelay = gunType.shootSoundLength;

            if (gunType.distantShootSound != null)
                FlansMod.packetHandler.sendToDonut(new PacketPlaySound(posX, posY, posZ, gunType.distantShootSound), posX, posY, posZ, gunType.gunSoundRange, gunType.distantSoundRange, dimension);
        }
    }

    public static String getGunFireSound(ItemStack gunStack, GunType gunType, boolean lastBullet)
    {
        AttachmentType barrel = gunType.getBarrel(gunStack);
        AttachmentType grip = gunType.getGrip(gunStack);

        boolean silenced = barrel != null && barrel.silencer && !gunType.getSecondaryFire(gunStack);
        String soundToPlay = null;

        if (gunType.getSecondaryFire(gunStack) && grip != null && grip.secondaryShootSound != null)
            soundToPlay = grip.secondaryShootSound;
        else if (lastBullet && gunType.lastShootSound != null)
            soundToPlay = gunType.lastShootSound;
        else if (silenced && gunType.suppressedShootSound != null)
            soundToPlay = gunType.suppressedShootSound;
        else if (gunType.shootSound != null)
            soundToPlay = gunType.shootSound;

        return soundToPlay;
    }

    public static boolean isGunRangedWeapon(ItemGun itemGun)
    {
        return !itemGun.type.ammo.isEmpty();
    }

    public static void sendPacketWhenInRenderingRange(Entity entity, EnumAnimPacket clientPacket)
    {
        List<EntityPlayer> list = MinecraftServer.getServer().getConfigurationManager().playerEntityList;
        for (EntityPlayer player : list)
        {
            if (isInRangeToRender3d(entity, player.posX, player.posY, player.posZ))
            {
                WolffNPCMod.network.sendTo(new FlanAnimPacket(entity.getEntityId(), clientPacket), (EntityPlayerMP)player);
            }
        }
    }

    public static boolean isInRangeToRender3d(Entity entity, double posX, double posY, double posZ)
    {
        double d3 = entity.posX - posX;
        double d4 = entity.posY - posY;
        double d5 = entity.posZ - posZ;
        double d6 = d3 * d3 + d4 * d4 + d5 * d5;
        return isInRangeToRenderDist(entity, d6);
    }

    public static boolean isInRangeToRenderDist(Entity entity, double dist)
    {
        double d1 = entity.boundingBox.getAverageEdgeLength();
        d1 *= 64.0D * entity.renderDistanceWeight;
        return dist < d1 * d1;
    }

    public static float accuracyToBulletSpread(int accuracy)
    {
        return Math.max((float) ((2D * 0.007499999832361937D / 0.005D) * (20D - (accuracy / 5D))), 0F);
    }

    public static int bulletSpreadToAccuracy(float spread)
    {
        return Math.max((int) Math.round(100D - (((5D * 0.005D)/(2D * 0.007499999832361937D)) * spread)), 0);
    }

    public static Vector3f getFiringPosition(ShootPoint dp, Vector3f turretOrigin, float driverYaw, float driverPitch, float entityYaw)
    {
        Vector3f rootVector = new Vector3f(dp.rootPos.position);
        Vector3f offsetVector = new Vector3f(dp.offPos);
        Vector3f localGunVec = new Vector3f(dp.rootPos.position);

        RotatedAxes looking = new RotatedAxes(driverYaw, driverPitch, 0F);
        RotatedAxes axes = new RotatedAxes(entityYaw, 0F, 0F);
        axes.rotateLocalYaw(90F);

        if (dp.rootPos.part == EnumDriveablePart.turret)
        {
            if (offsetVector.x == 0 && offsetVector.y == 0 && offsetVector.z == 0)
            {
                //Untranslate by the turret origin, to get the rotation about the right point
                Vector3f.sub(localGunVec, turretOrigin, localGunVec);
                //Rotate by the turret angles
                localGunVec =  looking.findLocalVectorGlobally(localGunVec);
                //Translate by the turret origin
                Vector3f.add(localGunVec, turretOrigin, localGunVec);
            }
            else
            {
                RotatedAxes yawOnlyLooking = new RotatedAxes(driverYaw, 0F, 0F);

                //Calculate the root of the gun
                //Untranslate by the turret origin, to get the rotation about the right point
                Vector3f.sub(rootVector, turretOrigin, rootVector);
                //Rotate by the turret angles
                rootVector = yawOnlyLooking.findLocalVectorGlobally(rootVector);
                //Translate by the turret origin
                Vector3f.add(rootVector, turretOrigin, rootVector);

                //Calculate the tip of the gun
                //Untranslate by the turret origin, to get the rotation about the right point
                Vector3f.sub(offsetVector, turretOrigin, offsetVector);
                //Rotate by the turret angles
                offsetVector = looking.findLocalVectorGlobally(offsetVector);
                //Translate by the turret origin

                Vector3f.add(rootVector, offsetVector, localGunVec);
            }
        }
        return axes.findLocalVectorGlobally(localGunVec);
    }

    public static class ShootParticle
    {
        public float x, y, z;
        public String name;

        public ShootParticle(String s, float x1, float y1, float z1)
        {
            x = x1;
            y = y1;
            z = z1;
            name = s;
        }
    }

    public static void spawnParticle(ArrayList<ShootParticle> list, ShootPoint shootPoint, Vector3f gunVector, float driverYaw, float driverPitch, float entityYaw, double posX, double posY, double posZ, int dimension, float scale)
    {
        if (!WolffNPCMod.shootingParticles)
            return;

        RotatedAxes looking = new RotatedAxes(driverYaw, driverPitch, 0F);
        RotatedAxes axes = new RotatedAxes(entityYaw, 0F, 0F);
        axes.rotateLocalYaw(90F);

        for (ShootParticle s : list)
        {
            float bkx = shootPoint.rootPos.position.x;
            float bky = shootPoint.rootPos.position.y;
            float bkz = shootPoint.rootPos.position.z;

            Vector3f velocity = new Vector3f(s.x, s.y, s.z);
            velocity = axes.findLocalVectorGlobally(looking.findLocalVectorGlobally(velocity));

            if (shootPoint.rootPos.part == EnumDriveablePart.core)
            {
                Vector3f v2 = axes.findLocalVectorGlobally(shootPoint.rootPos.position);
                Vector3f v3 = axes.findLocalVectorGlobally(looking.findLocalVectorGlobally(shootPoint.offPos));
                Vector3f.add(v2, v3, gunVector);
                if (scale != 1F)
                    gunVector.scale(scale);
            }

            FlansMod.getPacketHandler().sendToAllAround(
                    FlanUtils.createPacketParticle(s.name, posX + gunVector.x, posY + gunVector.y, posZ + gunVector.z, velocity.x, velocity.y, velocity.z, scale),
                    posX + gunVector.x, posY + gunVector.y, posZ + gunVector.z, FlansMod.driveableUpdateRange, dimension);

            shootPoint.rootPos.position.x = bkx;
            shootPoint.rootPos.position.y = bky;
            shootPoint.rootPos.position.z = bkz;
        }
    }

    public static Vec3 rotate(double x, double y, double z, float yaw, float pitch)
    {
        double cosYaw = Math.cos(180F - yaw * Math.PI / 180F);
        double sinYaw = Math.sin(180F - yaw * Math.PI / 180F);
        double cosPitch = Math.cos(pitch * Math.PI / 180F);
        double sinPitch = Math.sin(pitch * Math.PI / 180F);

        double newX = x * cosYaw + (y * sinPitch + z * cosPitch) * sinYaw;
        double newY = y * cosPitch - z * sinPitch;
        double newZ = -x * sinYaw + (y * sinPitch + z * cosPitch) * cosYaw;

        return Vec3.createVectorHelper(newX, newY, newZ);
    }
}

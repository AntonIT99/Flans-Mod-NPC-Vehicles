package noppes.npcs.util;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketPlaySound;
import noppes.npcs.Server;
import noppes.npcs.constants.EnumPacketClient;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.MathHelper;

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

        if (soundToPlay != null)
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

    public static void sendPacketWhenInRenderingRange(Entity entity, EnumPacketClient clientPacket)
    {
        List<EntityPlayer> list = MinecraftServer.getServer().getConfigurationManager().playerEntityList;
        for (EntityPlayer player : list)
        {
            if (entity.isInRangeToRender3d(player.posX, player.posY, player.posZ))
            {
                Server.sendData((EntityPlayerMP)player, clientPacket, entity.getEntityId());
            }
        }
    }

    public static float accuracyToBulletSpread(int accuracy)
    {
        return Math.max((float) ((2D * 0.007499999832361937D / 0.005D) * (20D - (accuracy / 5D))), 0F);
    }

    public static int bulletSpreadToAccuracy(float spread)
    {
        return Math.max((int) Math.round(100D - (((5D * 0.005D)/(2D * 0.007499999832361937D)) * spread)), 0);
    }
}

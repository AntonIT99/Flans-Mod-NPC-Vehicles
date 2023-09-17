package com.wolffsmod.flansmod;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.types.InfoType;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityNPCFlanBullet extends EntityBullet implements IProjectile
{
    public EntityNPCFlanBullet(World world)
    {
        super(world);
    }

    public EntityNPCFlanBullet(World world, Vec3 origin, float yaw, float pitch, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, InfoType shotFrom)
    {
        super(world, origin, yaw, pitch, shooter, spread, gunDamage, type1, speed, shotFrom);
    }

    @Override
    public void setThrowableHeading(double motionX, double motionY, double motionZ, float spread, float speed)
    {
        setArrowHeading(motionX, motionY, motionZ, spread, speed);
    }
}

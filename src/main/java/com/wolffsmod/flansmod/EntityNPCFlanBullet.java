package com.wolffsmod.flansmod;

import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.types.InfoType;
import noppes.npcs.NpcDamageSourceInderect;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.util.DamageSource;
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

    /**
     * Flan's Mod normally uses the bullet type's internal short name as the
     * damage type. Those content-pack identifiers usually have no vanilla
     * death-message translation. Attribute Wolff's NPC-only bullets as normal
     * NPC projectile damage while retaining this bullet as the direct source.
     */
    @Override
    public DamageSource getBulletDamage(boolean headshot)
    {
        return new NpcDamageSourceInderect("mob", this, owner).setProjectile();
    }
}

package noppes.npcs.util;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.GrenadeType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import io.netty.buffer.ByteBuf;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityNPCFlanBullet extends EntityBullet
{

    public EntityNPCFlanBullet(World world)
    {
        super(world);
    }

    public EntityNPCFlanBullet(World world, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, boolean shot, InfoType shotFrom)
    {
        super(world, shooter, spread, gunDamage, type1, speed, shot, shotFrom);
    }

    public EntityNPCFlanBullet(World world, Vec3 origin, float yaw, float pitch, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, InfoType shotFrom)
    {
        super(world, origin, yaw, pitch, shooter, spread, gunDamage, type1, shotFrom);
    }

    public EntityNPCFlanBullet(World world, Vec3 origin, float yaw, float pitch, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, InfoType shotFrom)
    {
        super(world, origin, yaw, pitch, shooter, spread, gunDamage, type1, speed, shotFrom);
    }

    public EntityNPCFlanBullet(World world, Vector3f origin, Vector3f direction, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, InfoType shotFrom)
    {
        super(world, origin, direction, shooter, spread, gunDamage, type1, speed, shotFrom);
    }

    public EntityNPCFlanBullet(World world, Vec3 origin, float yaw, float pitch, double motX, double motY, double motZ, EntityLivingBase shooter, float gunDamage, BulletType type1, InfoType shotFrom)
    {
        super(world, origin, yaw, pitch, motX, motY, motZ, shooter, gunDamage, type1, shotFrom);
    }

    @Override
    public void readSpawnData(ByteBuf data) {
        try {
            motionX = data.readDouble();
            motionY = data.readDouble();
            motionZ = data.readDouble();
            impactX = data.readInt();
            impactY = data.readInt();
            impactZ = data.readInt();
            int lockedOnToID = data.readInt();
            if (lockedOnToID != -1)
                lockedOnTo = worldObj.getEntityByID(lockedOnToID);
            type = BulletType.getBullet(ByteBufUtils.readUTF8String(data));
            penetratingPower = type.penetratingPower;
            String name = ByteBufUtils.readUTF8String(data);
            for (Object obj : worldObj.loadedEntityList) {
                if (((Entity) obj).getCommandSenderName().equals(name))
                    owner = (EntityLivingBase)obj;
            }
        } catch (Exception e) {
            FlansMod.log("Failed to read bullet owner from server.");
            super.setDead();
            e.printStackTrace();
        }
    }
}

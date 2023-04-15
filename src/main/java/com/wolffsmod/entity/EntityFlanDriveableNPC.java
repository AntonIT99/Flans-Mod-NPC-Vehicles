package com.wolffsmod.entity;

import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.DriveablePosition;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.ShootPoint;
import com.flansmod.common.vector.Vector3f;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.util.NPCInterfaceUtil;

import net.minecraft.client.renderer.entity.NPCRendererHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class EntityFlanDriveableNPC extends EntityCreature implements ConfigDriveable
{
    public final Vector3f turretOrigin = new Vector3f();
    public ArrayList<NPCInterfaceUtil.ShootParticle> shootParticlesPrimary = new ArrayList<>();
    public ArrayList<ShootPoint> shootPointsPrimary = new ArrayList<>();
    public ArrayList<ShootPoint> shootPointsSecondary = new ArrayList<>();
    public float vehicleGunModelScale = 1F;
    public Seat driver = new Seat();
    public Map<Integer, Seat> passengers = new HashMap<>();
    public boolean doorsOpen;
    public float throttle;
    public float turnSpeed = 1F;
    public float yDriveableOffset = 0.625F;

    public EntityFlanDriveableNPC(World w)
    {
        super(w);
        ignoreFrustumCheck = true;
    }

    public float getYawVelocity()
    {
        return renderYawOffset - prevRenderYawOffset;
    }

    public double getMovementVelocity()
    {
        return Vec3.createVectorHelper((posX - prevPosX), (posY - prevPosY), (posZ - prevPosZ)).lengthVector();
    }

    @Override
    public void onUpdate()
    {
        throttle = (float) (getMovementVelocity() / getEntityAttribute(SharedMonsterAttributes.movementSpeed).getBaseValue());

        isDead = true;

        if(!worldObj.isRemote)
        {
            NBTTagCompound compound = new NBTTagCompound();
            writeToNBT(compound);
            EntityCustomNpc npc = new EntityCustomNpc(worldObj);
            npc.readFromNBT(compound);
            npc.modelData.setEntityClass(getClass());
            npc.display.texture = NPCRendererHelper.getTexture((RendererLivingEntity) RenderManager.instance.getEntityRenderObject(this), this);
            npc.ignoreFrustumCheck = ignoreFrustumCheck;
            worldObj.spawnEntityInWorld(npc);
        }
        super.onUpdate();
    }

    @Override
    public float getEyeHeight()
    {
        if (driver.position.getY() > 0)
        {
            return driver.position.getY() / 16F + yDriveableOffset;
        }
        return super.getEyeHeight();
    }

    @Override
    public void setYOffset(float y)
    {
        yDriveableOffset = y;
    }

    @Override
    public void setTurnSpeed(float speed)
    {
        turnSpeed = speed;
    }

    @Override
    public void setDriver(String data)
    {
        String[] split = data.split(" ");

        if (split.length > 2)
        {
            float minYaw = -360F;
            float maxYaw = 360F;
            float minPitch = -180F;
            float maxPitch = 180F;
            if (split.length > 6)
            {
                minYaw = Float.parseFloat(split[3]);
                maxYaw = Float.parseFloat(split[4]);
                minPitch = Float.parseFloat(split[5]);
                maxPitch = Float.parseFloat(split[6]);
            }
            driver = new Seat(
                    Float.parseFloat(split[2]),
                    Float.parseFloat(split[1]),
                    Float.parseFloat(split[0]),
                    minYaw, maxYaw, minPitch, maxPitch);
        }
    }

    @Override
    public void setDriverAimSpeed(float yawSpeed, float pitchSpeed)
    {
        driver.yawSpeed = yawSpeed;
        driver.pitchSpeed = pitchSpeed;
    }

    @Override
    public void setPassenger(String data)
    {
        String[] split = data.split(" ");

        if (split.length > 3)
        {
            float minYaw = -360F;
            float maxYaw = 360F;
            float minPitch = -180F;
            float maxPitch = 180F;
            if (split.length > 8)
            {
                minYaw = Float.parseFloat(split[5]);
                maxYaw = Float.parseFloat(split[6]);
                minPitch = Float.parseFloat(split[7]);
                maxPitch = Float.parseFloat(split[8]);
            }
            passengers.put(Integer.parseInt(split[0]),
                    new Seat(Float.parseFloat(split[3]),
                            Float.parseFloat(split[2]),
                            Float.parseFloat(split[1]),
                            minYaw, maxYaw, minPitch, maxPitch));
        }
    }

    @Override
    public void setPassengerBaseYaw(int id, float angle)
    {
        if (passengers.get(id) != null)
        {
            passengers.get(id).baseYawAngle = angle;
        }
    }

    @Override
    public void setPassengerAimSpeed(int id, float yawSpeed, float pitchSpeed)
    {
        if (passengers.get(id) != null)
        {
            passengers.get(id).yawSpeed = yawSpeed;
            passengers.get(id).pitchSpeed = pitchSpeed;
        }
    }

    @Override
    public void setVehicleGunModelScale(float scale)
    {
        vehicleGunModelScale = scale;
    }

    @Override
    public void addBombPosition(float x, float y, float z)
    {
        shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(x/16F, y/16F, z/16F), EnumDriveablePart.core), new Vector3f(0, 0, 0)));
    }

    @Override
    public void addBombPosition(float x, float y, float z, float xOffset, float yOffset, float zOffset)
    {
        shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(x/16F, y/16F, z/16F), EnumDriveablePart.core), new Vector3f(xOffset/16F, yOffset/16F, zOffset/16F)));
    }

    @Override
    public void addBarrelPosition(float x, float y, float z)
    {
        shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(x/16F, y/16F, z/16F), EnumDriveablePart.turret), new Vector3f(0, 0, 0)));
    }

    @Override
    public void addBarrelPosition(float x, float y, float z, float xOffset, float yOffset, float zOffset)
    {
        shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(x/16F, y/16F, z/16F), EnumDriveablePart.turret), new Vector3f(xOffset/16F, yOffset/16F, zOffset/16F)));
    }

    @Override
    public void addDriverGunOrigin(float x, float y, float z)
    {
        driver.gunOrigin = new Vector3f(x/16F, y/16F, z/16F);
    }

    @Override
    public void addGunOrigin(int id, float x, float y, float z)
    {
        passengers.get(id).gunOrigin = new Vector3f(x/16F, y/16F, z/16F);
    }

    @Override
    public void addShootParticlesPrimary(String data)
    {
        String[] split = data.split(" ");
        if (split.length > 3)
            shootParticlesPrimary.add(new NPCInterfaceUtil.ShootParticle(
                split[0],
                Float.parseFloat(split[1]),
                Float.parseFloat(split[2]),
                Float.parseFloat(split[3])));
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound tag)
    {
        super.readEntityFromNBT(tag);
        doorsOpen = tag.getBoolean("DoorsOpen");
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound tag)
    {
        super.writeEntityToNBT(tag);
        tag.setBoolean("DoorsOpen", doorsOpen);
    }

    @Override
    public void setupConfig() {}
}

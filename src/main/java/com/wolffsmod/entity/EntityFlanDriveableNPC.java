package com.wolffsmod.entity;

import com.flansmod.common.driveables.*;
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
    public ArrayList<NPCInterfaceUtil.ShootParticle> shootParticlesSecondary = new ArrayList<>();
    public ArrayList<ShootPoint> shootPointsPrimary = new ArrayList<>();
    public ArrayList<ShootPoint> shootPointsSecondary = new ArrayList<>();
    public EnumWeaponType primary = EnumWeaponType.NONE;
    public EnumWeaponType secondary = EnumWeaponType.NONE;
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
    public void setDriverAimSpeed(String data)
    {
        String[] split = data.split(" ");
        driver.yawSpeed = Float.parseFloat(split[0]);
        driver.pitchSpeed = Float.parseFloat(split[1]);;
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
    public void setPassengerOffsetYaw(int id, float angle)
    {
        if (passengers.get(id) != null)
        {
            passengers.get(id).offsetYawAngle = angle;
        }
    }

    @Override
    public void setPassengerAimSpeed(String data)
    {
        String[] split = data.split(" ");
        Integer id = Integer.parseInt(split[0]);
        if (passengers.get(id) != null)
        {
            passengers.get(id).yawSpeed = Float.parseFloat(split[1]);
            passengers.get(id).pitchSpeed = Float.parseFloat(split[2]);
        }
    }

    @Override
    public void setVehicleGunModelScale(float scale)
    {
        vehicleGunModelScale = scale;
    }

    @Override
    public void addShootPointPrimary(String data)
    {
        String[] split = data.split(" ");
        DriveablePosition rootPos;
        Vector3f offPos;
        String[] gun = new String[0];

        if (split.length == 5 || split.length == 8)
            gun = new String[]{"ShootPointPrimary", split[0], split[1], split[2], split[3], split[4]};
        if (split.length == 4 || split.length == 7)
            gun = new String[]{"ShootPointPrimary", split[0], split[1], split[2], split[3]};

        if (split.length == 8)
            offPos = new Vector3f(Float.parseFloat(split[5]) / 16F, Float.parseFloat(split[6]) / 16F, Float.parseFloat(split[7]) / 16F);
        else if (split.length == 7)
            offPos = new Vector3f(Float.parseFloat(split[4]) / 16F, Float.parseFloat(split[5]) / 16F, Float.parseFloat(split[6]) / 16F);
        else
            offPos = new Vector3f(0F, 0F, 0F);

        rootPos = getShootPoint(gun);
        ShootPoint sPoint = new ShootPoint(rootPos, offPos);
        shootPointsPrimary.add(sPoint);
    }

    @Override
    public void addShootPointSecondary(String data)
    {
        String[] split = data.split(" ");
        DriveablePosition rootPos;
        Vector3f offPos;
        String[] gun;
        if (split.length == 8)
        {
            gun = new String[]{"ShootPointPrimary", split[0], split[1], split[2], split[3], split[4]};
            offPos = new Vector3f(Float.parseFloat(split[5]) / 16F, Float.parseFloat(split[6]) / 16F, Float.parseFloat(split[7]) / 16F);
        }
        else if (split.length == 7)
        {
            gun = new String[]{"ShootPointPrimary", split[0], split[1], split[2], split[3]};
            offPos = new Vector3f(Float.parseFloat(split[4]) / 16F, Float.parseFloat(split[5]) / 16F, Float.parseFloat(split[6]) / 16F);
        }
        else
        {
            gun = split;
            offPos = new Vector3f(0F, 0F, 0F);
        }
        rootPos = getShootPoint(gun);
        ShootPoint sPoint = new ShootPoint(rootPos, offPos);
        shootPointsSecondary.add(sPoint);
    }

    private DriveablePosition getShootPoint(String[] split)
    {
        if (split.length == 6)
        {
            return new PilotGun(split);
        }
        else if (split.length == 5)
        {
            return new DriveablePosition(split);
        }
        return new DriveablePosition(new Vector3f(), EnumDriveablePart.core);
    }

    @Override
    public void addBombPosition(String data)
    {
        String[] split = data.split(" ");
        primary = EnumWeaponType.BOMB;
        if (split.length == 3)
            shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(Float.parseFloat(split[0]) / 16F, Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F), EnumDriveablePart.core), new Vector3f(0, 0, 0)));
        else if (split.length == 6)
            shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(Float.parseFloat(split[0]) / 16F, Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F), EnumDriveablePart.core), new Vector3f(Float.parseFloat(split[3]) / 16F, Float.parseFloat(split[4]) / 16F, Float.parseFloat(split[5]) / 16F)));
    }

    @Override
    public void addBarrelPosition(String data)
    {
        String[] split = data.split(" ");
        primary = EnumWeaponType.SHELL;
        if (split.length == 3)
            shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(Float.parseFloat(split[0]) / 16F, Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F), EnumDriveablePart.turret), new Vector3f(0, 0, 0)));
        else if (split.length == 6)
            shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(Float.parseFloat(split[0]) / 16F, Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F), EnumDriveablePart.turret), new Vector3f(Float.parseFloat(split[3]) / 16F, Float.parseFloat(split[4]) / 16F, Float.parseFloat(split[5]) / 16F)));
    }

    @Override
    public void addGun(String data)
    {
        String[] split = data.split(" ");
        DriveablePosition rootPos;
        Vector3f offPos;
        secondary = EnumWeaponType.GUN;
        String[] gun = new String[]{"AddGun", split[0], split[1], split[2], split[3], split[4]};
        if (split.length == 5)
        {
            rootPos = getShootPoint(gun);
            offPos = new Vector3f(0, 0, 0);
        }
        else
        {
            rootPos = getShootPoint(gun);
            offPos = new Vector3f(Float.parseFloat(split[5]) / 16F, Float.parseFloat(split[6]) / 16F, Float.parseFloat(split[7]) / 16F);
        }
        ShootPoint sPoint = new ShootPoint(rootPos, offPos);
        shootPointsSecondary.add(sPoint);
    }

    @Override
    public void addDriverGunOrigin(String data)
    {
        String[] split = data.split(" ");
        driver.gunOrigin = new Vector3f(Float.parseFloat(split[0])/16F, Float.parseFloat(split[1])/16F, Float.parseFloat(split[2])/16F);
    }

    @Override
    public void addGunOrigin(String data)
    {
        String[] split = data.split(" ");
        passengers.get(Integer.parseInt(split[0])).gunOrigin = new Vector3f(Float.parseFloat(split[1])/16F, Float.parseFloat(split[2])/16F, Float.parseFloat(split[3])/16F);
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
    public void addShootParticlesSecondary(String data)
    {
        String[] split = data.split(" ");
        if (split.length > 3)
            shootParticlesSecondary.add(new NPCInterfaceUtil.ShootParticle(
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

package com.wolffsmod.entity;

import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.*;
import com.flansmod.common.vector.Vector3f;
import com.wolffsmod.WolffNPCMod;
import com.wolffsmod.entity.config.ConfigDriveable;
import com.wolffsmod.network.FlanEntitySyncPacket;
import cpw.mods.fml.common.network.NetworkRegistry;
import noppes.npcs.client.EntityUtil;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.util.NPCInterfaceUtil;

import net.minecraft.client.renderer.entity.NPCRendererHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public abstract class EntityFlanDriveableNPC extends EntityLiving implements ConfigDriveable
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
    public boolean forceMaxThrottle;
    public float throttle;
    public float turnSpeed = 1F;
    public float yDriveableOffset = 0.625F;

    public EntityCustomNpc npc;

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
    public void updateRiderPosition()
    {
        if (riddenByEntity != null && !driver.position.equals(Vector3f.Zero))
        {
            Vector3f driverPos = getDriverPosition();
            riddenByEntity.setPosition(posX + driverPos.getX(), posY + driverPos.getY() + riddenByEntity.getYOffset(), posZ + driverPos.getZ());
        }
        else
        {
            super.updateRiderPosition();
        }
    }

    public Vector3f getDriverPosition()
    {
        RotatedAxes looking = new RotatedAxes(driver.getGlobalYaw(renderYawOffset), 0F, 0F);
        RotatedAxes axes = new RotatedAxes(renderYawOffset, 0F, 0F);

        looking.rotateLocalYaw(90F);
        axes.rotateLocalYaw(90F);

        Vector3f position = axes.findLocalVectorGlobally(new Vector3f(driver.position.getX() / 16F, driver.position.getY() / 16F + yDriveableOffset,  driver.position.getZ() / 16F));
        Vector3f offset = looking.findLocalVectorGlobally(new Vector3f(driver.rotatedOffset.getX() / 16F, driver.rotatedOffset.getY() / 16F,  driver.rotatedOffset.getZ() / 16F));

        return Vector3f.add(position, offset, null);
    }

    public Optional<Seat> getPassengerFromGun(String gunName)
    {
        for (Seat passenger: passengers.values())
        {
            if (passenger.gun.equals(gunName))
                return Optional.of(passenger);
        }
        return Optional.empty();
    }

    @Override
    public void onUpdate()
    {
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

    public void updateNpc(EntityCustomNpc npc)
    {
        this.npc = npc;
        EntityUtil.Copy(npc, this);
        updateDriverAndPassengers();

        throttle = forceMaxThrottle ? 1F : (float) (getMovementVelocity() / npc.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue());
    }

    protected void updateDriverAndPassengers()
    {
        npc.driver.copyProperties(driver);
        for (Integer id : passengers.keySet())
        {
            if (npc.passengers.containsKey(id))
            {
                npc.passengers.get(id).copyProperties(passengers.get(id));
            }
            else
            {
                Seat passenger = new Seat();
                passenger.copy(passengers.get(id));
                npc.passengers.put(id, passenger);
            }
        }

        npc.driver.setYawAndPitch(this);
        for (Integer id : npc.passengers.keySet())
        {
            npc.passengers.get(id).setYawAndPitch(this);
        }

        driver = npc.driver;
        passengers = npc.passengers;
    }

    public void syncRotationWithClient()
    {
        if (!worldObj.isRemote && npc != null)
            WolffNPCMod.network.sendToAllAround(
                    new FlanEntitySyncPacket(this),
                    new NetworkRegistry.TargetPoint(dimension, posX, posY, posZ, WolffNPCMod.entityUpdateRange));
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
            float minPitch = -90F;
            float maxPitch = 90F;
            if (split.length > 6)
            {
                minYaw = Float.parseFloat(split[3]);
                maxYaw = Float.parseFloat(split[4]);
                minPitch = Float.parseFloat(split[5]);
                maxPitch = Float.parseFloat(split[6]);
            }
            driver = new Seat(
                    Float.parseFloat(split[0]),
                    Float.parseFloat(split[1]),
                    Float.parseFloat(split[2]),
                    minYaw, maxYaw, minPitch, maxPitch, false);
        }
    }

    @Override
    public void setRotatedDriverOffset(String data)
    {
        String[] split = data.split(" ");
        driver.rotatedOffset = new Vector3f(Float.parseFloat(split[0]), Float.parseFloat(split[1]), Float.parseFloat(split[2]));
    }

    @Override
    public void setDriverAimSpeed(String data)
    {
        String[] split = data.split(" ");
        driver.yawSpeed = Float.parseFloat(split[0]);
        driver.pitchSpeed = Float.parseFloat(split[1]);
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
            Seat seat = new Seat(Float.parseFloat(split[3]),
                    Float.parseFloat(split[2]),
                    Float.parseFloat(split[1]),
                    minYaw, maxYaw, minPitch, maxPitch, true);
            if (split.length > 10)
                seat.gun = split[10];
            passengers.put(Integer.parseInt(split[0]), seat);
        }
    }

    @Override
    public void setPassengerOffsetYaw(int id, float angle)
    {
        if (passengers.get(id) != null)
        {
            passengers.get(id).setOffsetYawAngle(angle);
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

        if (split.length == 5 || split.length >= 8)
            gun = new String[]{"ShootPointPrimary", split[0], split[1], split[2], split[3], split[4]};
        if (split.length == 4 || split.length == 7)
            gun = new String[]{"ShootPointPrimary", split[0], split[1], split[2], split[3]};
        if (split.length == 3)
            gun = new String[]{"ShootPointPrimary", split[0], split[1], split[2], "core"};

        if (split.length >= 8)
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
        if (split.length >= 8)
        {
            gun = new String[]{"ShootPointSecondary", split[0], split[1], split[2], split[3], split[4]};
            offPos = new Vector3f(Float.parseFloat(split[5]) / 16F, Float.parseFloat(split[6]) / 16F, Float.parseFloat(split[7]) / 16F);
        }
        else if (split.length == 7)
        {
            gun = new String[]{"ShootPointSecondary", split[0], split[1], split[2], split[3]};
            offPos = new Vector3f(Float.parseFloat(split[4]) / 16F, Float.parseFloat(split[5]) / 16F, Float.parseFloat(split[6]) / 16F);
        }
        else
        {
            gun = new String[split.length + 1];
            gun[0] = "ShootPointSecondary";
            System.arraycopy(split, 0, gun, 1, split.length);
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
        forceMaxThrottle = tag.getBoolean("forceMaxThrottle");
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound tag)
    {
        super.writeEntityToNBT(tag);
        tag.setBoolean("DoorsOpen", doorsOpen);
        tag.setBoolean("forceMaxThrottle", forceMaxThrottle);
    }
}

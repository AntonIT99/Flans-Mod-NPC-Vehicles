/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.network.ByteBufUtils
 *  cpw.mods.fml.common.registry.IEntityAdditionalSpawnData
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.PlayerCapabilities
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.MovingObjectPosition$MovingObjectType
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.Explosion
 *  net.minecraft.world.GameRules
 *  net.minecraft.world.World
 */
package com.flansmod.common.driveables;

import cofh.api.energy.IEnergyContainerItem;
import com.flansmod.api.IControllable;
import com.flansmod.api.IExplodeable;
import com.flansmod.client.EntityCamera;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.common.CommonProxy;
import com.flansmod.common.FlansHooks;
import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.CollisionBox;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveablePosition;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EntityWheel;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.EnumWeaponType;
import com.flansmod.common.driveables.PilotGun;
import com.flansmod.common.driveables.Seat;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityShootable;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.InventoryHelper;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.guns.raytracing.BulletHit;
import com.flansmod.common.guns.raytracing.DriveableHit;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketDriveableDamage;
import com.flansmod.common.network.PacketDriveableKeyHeld;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.ReadableVector3f;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.Explosion;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public abstract class EntityDriveable
extends Entity
implements IControllable,
IExplodeable,
IEntityAdditionalSpawnData {
    public boolean syncFromServer = true;
    public int serverPositionTransitionTicker;
    public double serverPosX;
    public double serverPosY;
    public double serverPosZ;
    public double serverYaw;
    public double serverPitch;
    public double serverRoll;
    public DriveableData driveableData;
    public String driveableType;
    public float throttle;
    public EntityWheel[] wheels;
    public boolean fuelling;
    public float prevRotationRoll;
    public Vector3f angularVelocity = new Vector3f(0.0f, 0.0f, 0.0f);
    public boolean leftMouseHeld = false;
    public boolean rightMouseHeld = false;
    public int shootDelayPrimary;
    public int shootDelaySecondary;
    public float minigunSpeedPrimary;
    public float minigunSpeedSecondary;
    public int currentGunPrimary;
    public int currentGunSecondary;
    public float harvesterAngle;
    public RotatedAxes prevAxes = new RotatedAxes();
    public RotatedAxes axes = new RotatedAxes();
    public EntitySeat[] seats;
    private int foundFuel = -1;
    public boolean couldNotFindFuel = false;
    public boolean isAmmoPlaced = false;
    public int lockOnSoundDelay;
    @SideOnly(value=Side.CLIENT)
    public EntityLivingBase camera;
    protected int invulnerableUnmountCount;
    private ItemStack[][] prevInventoryItems = new ItemStack[][]{null, null};
    public Entity lastAtkEntity = null;

    public EntityDriveable(World world) {
        super(world);
        this.preventEntitySpawning = true;
        this.setSize(1.0f, 1.0f);
        this.yOffset = 0.375f;
        this.ignoreFrustumCheck = true;
        this.renderDistanceWeight = 200.0;
    }

    public EntityDriveable(World world, DriveableType t, DriveableData d) {
        this(world);
        this.driveableType = t.shortName;
        this.driveableData = d;
    }

    protected void initType(DriveableType type, boolean clientSide) {
        int i;
        this.seats = new EntitySeat[type.numPassengers + 1];
        for (i = 0; i < type.numPassengers + 1; ++i) {
            if (clientSide) continue;
            this.seats[i] = new EntitySeat(this.worldObj, this, i);
            this.worldObj.spawnEntityInWorld((Entity)this.seats[i]);
        }
        this.wheels = new EntityWheel[type.wheelPositions.length];
        for (i = 0; i < this.wheels.length; ++i) {
            if (clientSide) continue;
            this.wheels[i] = new EntityWheel(this.worldObj, this, i);
            this.worldObj.spawnEntityInWorld((Entity)this.wheels[i]);
        }
        this.stepHeight = type.wheelStepHeight;
        this.yOffset = type.yOffset;
        this.getEntityData().setBoolean("CanMountEntity", type.canMountEntity);
        for (int ps = 0; ps < 2; ++ps) {
            int istart;
            EnumWeaponType weaponType;
            EnumWeaponType enumWeaponType = weaponType = ps == 0 ? type.primary : type.secondary;
            if (weaponType == EnumWeaponType.GUN) {
                weaponType = EnumWeaponType.NONE;
            }
            if ((istart = this.getInventoryStart(weaponType)) == this.driveableData.getAmmoInventoryStart()) {
                istart += type.numPassengerGunners;
            }
            int isize = this.getInventorySize(weaponType);
            if (istart < 0 && isize <= 0) continue;
            this.prevInventoryItems[ps] = new ItemStack[isize];
            for (int i2 = 0; i2 < isize; ++i2) {
                this.prevInventoryItems[ps][i2] = this.driveableData.getStackInSlot(istart + i2);
            }
        }
    }

    protected void writeEntityToNBT(NBTTagCompound tag) {
        this.driveableData.writeToNBT(tag);
        tag.setString("Type", this.driveableType);
        tag.setFloat("RotationYaw", this.axes.getYaw());
        tag.setFloat("RotationPitch", this.axes.getPitch());
        tag.setFloat("RotationRoll", this.axes.getRoll());
    }

    protected void readEntityFromNBT(NBTTagCompound tag) {
        this.driveableType = tag.getString("Type");
        this.driveableData = new DriveableData(tag);
        this.initType(DriveableType.getDriveable(this.driveableType), false);
        this.prevRotationYaw = tag.getFloat("RotationYaw");
        this.prevRotationPitch = tag.getFloat("RotationPitch");
        this.prevRotationRoll = tag.getFloat("RotationRoll");
        this.axes = new RotatedAxes(this.prevRotationYaw, this.prevRotationPitch, this.prevRotationRoll);
    }

    public void writeSpawnData(ByteBuf data) {
        ByteBufUtils.writeUTF8String((ByteBuf)data, (String)this.driveableType);
        NBTTagCompound tag = new NBTTagCompound();
        this.driveableData.writeToNBT(tag);
        ByteBufUtils.writeTag((ByteBuf)data, (NBTTagCompound)tag);
        data.writeFloat(this.axes.getYaw());
        data.writeFloat(this.axes.getPitch());
        data.writeFloat(this.axes.getRoll());
        for (EnumDriveablePart ep : EnumDriveablePart.values()) {
            DriveablePart part = this.getDriveableData().parts.get((Object)ep);
            data.writeShort((int)((short)part.health));
            data.writeBoolean(part.onFire);
        }
    }

    public void readSpawnData(ByteBuf data) {
        try {
            this.driveableType = ByteBufUtils.readUTF8String((ByteBuf)data);
            this.driveableData = new DriveableData(ByteBufUtils.readTag((ByteBuf)data));
            this.initType(this.getDriveableType(), true);
            this.axes.setAngles(data.readFloat(), data.readFloat(), data.readFloat());
            this.prevRotationYaw = this.axes.getYaw();
            this.prevRotationPitch = this.axes.getPitch();
            this.prevRotationRoll = this.axes.getRoll();
            for (EnumDriveablePart ep : EnumDriveablePart.values()) {
                DriveablePart part = this.getDriveableData().parts.get((Object)ep);
                part.health = data.readShort();
                part.onFire = data.readBoolean();
            }
        }
        catch (Exception e) {
            FlansMod.log("Failed to retreive plane type from server.");
            super.setDead();
            e.printStackTrace();
        }
        this.camera = new EntityCamera(this.worldObj, this);
        this.worldObj.spawnEntityInWorld((Entity)this.camera);
    }

    @Override
    public abstract void onMouseMoved(int var1, int var2);

    @SideOnly(value=Side.CLIENT)
    @Override
    public EntityLivingBase getCamera() {
        return this.camera;
    }

    protected boolean canSit(int seat) {
        return this.getDriveableType().numPassengers >= seat && this.seats[seat].riddenByEntity == null;
    }

    protected boolean canTriggerWalking() {
        return false;
    }

    protected void entityInit() {
    }

    public AxisAlignedBB getCollisionBox(Entity entity) {
        if (this.getDriveableType().collisionDamageEnable && this.throttle > this.getDriveableType().collisionDamageThrottle) {
            if (entity instanceof EntityLiving) {
                entity.attackEntityFrom(DamageSource.generic, this.throttle * this.getDriveableType().collisionDamageTimes);
            } else if (entity instanceof EntityPlayer) {
                entity.attackEntityFrom(DamageSource.generic, this.throttle * this.getDriveableType().collisionDamageTimes);
            }
        }
        return null;
    }

    public AxisAlignedBB getBoundingBox() {
        return this.boundingBox;
    }

    public boolean canBePushed() {
        return false;
    }

    public double getMountedYOffset() {
        return -0.3;
    }

    public boolean attackEntityFrom(DamageSource damagesource, float i) {
        if (this.worldObj.isRemote || this.isDead) {
            return true;
        }
        if (this.isMountedEntity(damagesource.getEntity())) {
            return false;
        }
        boolean broken = this.attackPart(EnumDriveablePart.core, damagesource, i);
        if (i > 0.0f) {
            this.checkPartsWhenAttacked();
            FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), this.posX, this.posY, this.posZ, 100.0f, this.dimension);
        }
        return true;
    }

    public boolean isMountedEntity(Entity entity) {
        if (entity != null) {
            Entity entity2 = this.worldObj.getEntityByID(entity.getEntityId());
            for (EntitySeat seat : this.seats) {
                if (seat.riddenByEntity == null || seat.riddenByEntity != entity && seat.riddenByEntity != entity2) continue;
                return true;
            }
        }
        return false;
    }

    public void setDead() {
        super.setDead();
        if (this.worldObj.isRemote) {
            this.camera.setDead();
        }
        for (EntitySeat seat : this.seats) {
            if (seat == null) continue;
            seat.setDead();
        }
    }

    public void onCollideWithPlayer(EntityPlayer par1EntityPlayer) {
    }

    public boolean canBeCollidedWith() {
        return !this.isDead;
    }

    public void applyEntityCollision(Entity entity) {
        if (!this.isPartOfThis(entity)) {
            super.applyEntityCollision(entity);
        }
    }

    public void setPositionAndRotation2(double d, double d1, double d2, float f, float f1, int i) {
        if (this.ticksExisted > 1) {
            return;
        }
        if (!(this.riddenByEntity instanceof EntityPlayer) || !FlansMod.proxy.isThePlayer((EntityPlayer)this.riddenByEntity)) {
            if (this.syncFromServer) {
                this.serverPositionTransitionTicker = i + 5;
            } else {
                double var10 = d - this.posX;
                double var12 = d1 - this.posY;
                double var14 = d2 - this.posZ;
                double var16 = var10 * var10 + var12 * var12 + var14 * var14;
                if (var16 <= 1.0) {
                    return;
                }
                this.serverPositionTransitionTicker = 3;
            }
            this.serverPosX = d;
            this.serverPosY = d1;
            this.serverPosZ = d2;
            this.serverYaw = f;
            this.serverPitch = f1;
        }
    }

    public void setPositionRotationAndMotion(double x, double y, double z, float yaw, float pitch, float roll, double motX, double motY, double motZ, float velYaw, float velPitch, float velRoll, float throt, float steeringYaw) {
        if (this.worldObj.isRemote) {
            this.serverPosX = x;
            this.serverPosY = y;
            this.serverPosZ = z;
            this.serverYaw = yaw;
            this.serverPitch = pitch;
            this.serverRoll = roll;
            this.serverPositionTransitionTicker = 5;
        } else {
            this.setPosition(x, y, z);
            this.prevRotationYaw = yaw;
            this.prevRotationPitch = pitch;
            this.prevRotationRoll = roll;
            this.setRotation(yaw, pitch, roll);
        }
        this.motionX = motX;
        this.motionY = motY;
        this.motionZ = motZ;
        this.angularVelocity = new Vector3f(velYaw, velPitch, velRoll);
        this.throttle = throt;
    }

    public void setVelocity(double d, double d1, double d2) {
        this.motionX = d;
        this.motionY = d1;
        this.motionZ = d2;
    }

    @Override
    public boolean pressKey(int key, EntityPlayer player) {
        if (!this.worldObj.isRemote && key == 9 && this.getDriveableType().modePrimary == EnumFireMode.SEMIAUTO) {
            this.shoot(false);
            return true;
        }
        if (!this.worldObj.isRemote && key == 8 && this.getDriveableType().modeSecondary == EnumFireMode.SEMIAUTO) {
            this.shoot(true);
            return true;
        }
        return false;
    }

    @Override
    public void updateKeyHeldState(int key, boolean held) {
        if (this.worldObj.isRemote) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableKeyHeld(key, held));
        }
        switch (key) {
            case 9: {
                this.leftMouseHeld = held;
                break;
            }
            case 8: {
                this.rightMouseHeld = held;
            }
        }
    }

    public void shoot(boolean secondary) {
        DriveableType type = this.getDriveableType();
        if (this.seats[0] == null && !(this.seats[0].riddenByEntity instanceof EntityLivingBase)) {
            return;
        }
        if (this.getShootDelay(secondary) <= 0) {
            ArrayList<DriveablePosition> shootPoints = type.shootPoints(secondary);
            EnumWeaponType weaponType = type.weaponType(secondary);
            if (shootPoints.size() == 0) {
                return;
            }
            int currentGun = this.getCurrentGun(secondary);
            if (type.alternate(secondary)) {
                currentGun = (currentGun + 1) % shootPoints.size();
                this.setCurrentGun(currentGun, secondary);
                this.shootEach(type, shootPoints.get(currentGun), currentGun, secondary, weaponType);
            } else {
                for (int i = 0; i < shootPoints.size(); ++i) {
                    this.shootEach(type, shootPoints.get(i), i, secondary, weaponType);
                }
            }
        }
    }

    private boolean driverIsCreative() {
        return this.seats != null && this.seats[0] != null && this.seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)this.seats[0].riddenByEntity).capabilities.isCreativeMode;
    }

    public void spawnParticle(ArrayList<DriveableType.ShootParticle> list, DriveablePosition shootPoint) {
        for (DriveableType.ShootParticle s : list) {
            float bkx = shootPoint.position.x;
            float bky = shootPoint.position.y;
            float bkz = shootPoint.position.z;
            shootPoint.position.x += s.x;
            shootPoint.position.y += s.y;
            shootPoint.position.z += s.z;
            Vector3f v = this.getOrigin(shootPoint);
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle(s.name, this.posX + (double)v.x, this.posY + (double)v.y, this.posZ + (double)v.z, 0.0, 0.0, 0.0), this.posX + (double)v.x, this.posY + (double)v.y, this.posZ + (double)v.z, 150.0f, this.dimension);
            shootPoint.position.x = bkx;
            shootPoint.position.y = bky;
            shootPoint.position.z = bkz;
        }
    }

    private void shootEach(DriveableType type, DriveablePosition shootPoint, int currentGun, boolean secondary, EnumWeaponType weaponType) {
        Vector3f gunVec = this.getOrigin(shootPoint);
        Vector3f lookVector = this.getLookVector(shootPoint);
        if (shootPoint instanceof PilotGun) {
            ShootableType bullet;
            PilotGun pilotGun = (PilotGun)shootPoint;
            GunType gunType = pilotGun.type;
            ItemStack bulletItemStack = this.driveableData.ammo[this.getDriveableType().numPassengerGunners + currentGun];
            if (gunType != null && bulletItemStack != null && bulletItemStack.getItem() instanceof ItemShootable && TeamsManager.bulletsEnabled && gunType.isAmmo(bullet = ((ItemShootable)bulletItemStack.getItem()).type)) {
                this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(gunVec, new Vector3f((float)this.posX, (float)this.posY, (float)this.posZ), null), lookVector, (EntityLivingBase)this.seats[0].riddenByEntity, gunType.bulletSpread / 2.0f, gunType.damage, 10.0f, bulletItemStack.getItemDamage(), (InfoType)type));
                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, type.shootSound(secondary), false);
                int damage = bulletItemStack.getItemDamage();
                bulletItemStack.setItemDamage(damage + 1);
                if (damage + 1 == bulletItemStack.getMaxDamage()) {
                    bulletItemStack.setItemDamage(0);
                    if (!this.driverIsCreative()) {
                        --bulletItemStack.stackSize;
                        if (bulletItemStack.stackSize <= 0) {
                            this.onWeaponInventoryChanged(secondary);
                            bulletItemStack = null;
                        }
                        this.driveableData.setInventorySlotContents(this.getDriveableType().numPassengerGunners + currentGun, bulletItemStack);
                    }
                }
                this.setShootDelay(type.shootDelay(secondary), secondary);
            }
        } else {
            switch (weaponType) {
                case BOMB: {
                    if (!TeamsManager.bombsEnabled) break;
                    int slot = -1;
                    for (int i = this.driveableData.getBombInventoryStart(); i < this.driveableData.getBombInventoryStart() + type.numBombSlots; ++i) {
                        ItemStack bomb = this.driveableData.getStackInSlot(i);
                        if (bomb == null || !(bomb.getItem() instanceof ItemBullet) || !type.isValidAmmo(((ItemBullet)bomb.getItem()).type, weaponType)) continue;
                        slot = i;
                    }
                    if (slot == -1) break;
                    boolean spread = false;
                    boolean damageMultiplier = true;
                    float shellSpeed = 0.0f;
                    ItemStack bulletStack = this.driveableData.getStackInSlot(slot);
                    ItemBullet bulletItem = (ItemBullet)bulletStack.getItem();
                    if (shootPoint instanceof PilotGun) {
                        PilotGun pilotGun = (PilotGun)shootPoint;
                        GunType gunType = pilotGun.type;
                    }
                    EntityShootable bulletEntity = bulletItem.getEntity(this.worldObj, Vec3.createVectorHelper((double)(this.posX + (double)gunVec.x), (double)(this.posY + (double)gunVec.y), (double)(this.posZ + (double)gunVec.z)), this.axes.getYaw(), this.axes.getPitch(), this.motionX, this.motionY, this.motionZ, (EntityLivingBase)this.seats[0].riddenByEntity, (boolean)damageMultiplier ? 1 : 0, this.driveableData.getStackInSlot(slot).getItemDamage(), type);
                    this.worldObj.spawnEntityInWorld((Entity)bulletEntity);
                    this.spawnParticle(type.shootParticle(secondary), shootPoint);
                    if (type.shootSound(secondary) != null) {
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, type.shootSound(secondary), false);
                    }
                    if (!this.driverIsCreative()) {
                        bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);
                        if (bulletStack.getItemDamage() == bulletStack.getMaxDamage()) {
                            bulletStack.setItemDamage(0);
                            --bulletStack.stackSize;
                            if (bulletStack.stackSize == 0) {
                                this.onWeaponInventoryChanged(secondary);
                                bulletStack = null;
                            }
                        }
                        this.driveableData.setInventorySlotContents(slot, bulletStack);
                    }
                    this.setShootDelay(type.shootDelay(secondary), secondary);
                    break;
                }
                case MISSILE: 
                case SHELL: {
                    if (!TeamsManager.shellsEnabled) break;
                    int slot = -1;
                    for (int i = this.driveableData.getMissileInventoryStart(); i < this.driveableData.getMissileInventoryStart() + type.numMissileSlots; ++i) {
                        ItemStack shell = this.driveableData.getStackInSlot(i);
                        if (shell == null || !(shell.getItem() instanceof ItemBullet) || !type.isValidAmmo(((ItemBullet)shell.getItem()).type, weaponType)) continue;
                        slot = i;
                    }
                    if (slot == -1) break;
                    boolean damageMultiplier = true;
                    float spread = type.bulletSpread;
                    float shellSpeed = type.bulletSpeed;
                    ItemStack bulletStack = this.driveableData.getStackInSlot(slot);
                    ItemBullet bulletItem = (ItemBullet)bulletStack.getItem();
                    EntityShootable bulletEntity = bulletItem.getEntity(this.worldObj, Vector3f.add(new Vector3f(this.posX, this.posY, this.posZ), gunVec, null), lookVector, (EntityLivingBase)this.seats[0].riddenByEntity, spread, (boolean)damageMultiplier ? 1 : 0, shellSpeed, this.driveableData.getStackInSlot(slot).getItemDamage(), (InfoType)type);
                    this.worldObj.spawnEntityInWorld((Entity)bulletEntity);
                    this.spawnParticle(type.shootParticle(secondary), shootPoint);
                    if (type.shootSound(secondary) != null) {
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, type.shootSound(secondary), false);
                    }
                    if (!this.driverIsCreative()) {
                        bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);
                        if (bulletStack.getItemDamage() == bulletStack.getMaxDamage()) {
                            bulletStack.setItemDamage(0);
                            --bulletStack.stackSize;
                            if (bulletStack.stackSize == 0) {
                                this.onWeaponInventoryChanged(secondary);
                                bulletStack = null;
                            }
                        }
                        this.driveableData.setInventorySlotContents(slot, bulletStack);
                    }
                    this.setShootDelay(type.shootDelay(secondary), secondary);
                    break;
                }
                case GUN: {
                    break;
                }
                case MINE: {
                    break;
                }
            }
        }
    }

    public Vector3f getOrigin(DriveablePosition dp) {
        Vector3f localGunVec = new Vector3f(dp.position);
        if (dp.part == EnumDriveablePart.turret) {
            Vector3f.sub(localGunVec, this.getDriveableType().turretOrigin, localGunVec);
            localGunVec = this.seats[0].looking.findLocalVectorGlobally(localGunVec);
            Vector3f.add(localGunVec, this.getDriveableType().turretOrigin, localGunVec);
            Vector3f turretOriginOffset = new Vector3f(this.getDriveableType().turretOriginOffset);
            turretOriginOffset = this.seats[0].looking.findLocalVectorGlobally(turretOriginOffset);
            Vector3f.add(localGunVec, turretOriginOffset, localGunVec);
        }
        return this.rotate(localGunVec);
    }

    public Vector3f getLookVector(DriveablePosition dp) {
        return this.axes.getXAxis();
    }

    public void correctWheelPos() {
        if (this.ticksExisted % 200 == 0) {
            for (EntityWheel wheel : this.wheels) {
                if (wheel == null) continue;
                Vector3f target = this.axes.findLocalVectorGlobally(this.getDriveableType().wheelPositions[wheel.ID].position);
                target.x = (float)((double)target.x + this.posX);
                target.y = (float)((double)target.y + this.posY);
                target.z = (float)((double)target.z + this.posZ);
                int tf = 1;
                int cf = 1;
                int range = 5;
                if (MathHelper.abs((float)(target.x - (float)wheel.posX)) > (float)range) {
                    wheel.posX = (target.x * (float)tf + (float)wheel.posX * (float)cf) / (float)(tf + cf);
                }
                if (MathHelper.abs((float)(target.y - (float)wheel.posY)) > (float)range) {
                    wheel.posY = (target.y * (float)tf + (float)wheel.posY * (float)cf) / (float)(tf + cf);
                }
                if (MathHelper.abs((float)(target.z - (float)wheel.posZ)) <= (float)range) continue;
                wheel.posZ = (target.z * (float)tf + (float)wheel.posZ * (float)cf) / (float)(tf + cf);
            }
        }
    }

    public void onUpdate() {
        boolean canThrust;
        super.onUpdate();
        DriveableType type = this.getDriveableType();
        DriveableData data = this.getDriveableData();
        this.checkInventoryChanged();
        if ((type.lockOnToLivings || type.lockOnToMechas || type.lockOnToPlanes || type.lockOnToPlayers || type.lockOnToVehicles) && !this.worldObj.isRemote && this.seats.length > 0 && this.lockOnSoundDelay <= 0 && this.seats[0] != null && this.seats[0].riddenByEntity instanceof EntityPlayer) {
            int currentGun = this.getCurrentGun(false);
            Vector3f playerVec = this.getOrigin(type.shootPoints(false).get(currentGun));
            /*for (Entity obj : worldObj.loadedEntityList) {
                float angle;
                Vector3f relPosVec;
                Entity entity = (Entity)obj;
                if (!(type.lockOnToMechas && entity instanceof EntityMecha || type.lockOnToVehicles && entity instanceof EntityVehicle || type.lockOnToPlanes && entity instanceof EntityPlane || type.lockOnToPlayers && entity instanceof EntityPlayer) && (!type.lockOnToLivings || !(entity instanceof EntityLivingBase))) continue;
                double dXYZ = this.getDistanceToEntity(entity);
                if (this.getDistanceSqToEntity(entity) >= (double)(type.maxRangeLockOn * type.maxRangeLockOn) || (double)(angle = Math.abs(Vector3f.angle(playerVec, relPosVec = new Vector3f(entity.posX - this.posX, entity.posY - this.posY, entity.posZ - this.posZ)))) >= Math.toRadians(type.canLockOnAngle)) continue;
                PacketPlaySound.sendSoundPacket(this.seats[0].posX, this.seats[0].posY, this.seats[0].posZ, 10.0, this.dimension, type.lockOnSound, false);
                if (entity instanceof EntityDriveable) {
                    PacketPlaySound.sendSoundPacket(entity.posX, entity.posY, entity.posZ, ((EntityDriveable)entity).getDriveableType().lockedOnSoundRange, entity.dimension, ((EntityDriveable)entity).getDriveableType().lockingOnSound, false);
                }
                this.lockOnSoundDelay = type.lockOnSoundTime;
                break;
            }*/
        }
        if (this.lockOnSoundDelay > 0) {
            --this.lockOnSoundDelay;
        }
        if (this.ridingEntity != null) {
            this.invulnerableUnmountCount = 80;
        } else if (this.invulnerableUnmountCount > 0) {
            --this.invulnerableUnmountCount;
        }
        if (!this.worldObj.isRemote) {
            int i;
            for (i = 0; i < this.getDriveableType().numPassengers + 1; ++i) {
                if (this.seats[i] != null && this.seats[i].addedToChunk) continue;
                this.seats[i] = new EntitySeat(this.worldObj, this, i);
                this.worldObj.spawnEntityInWorld((Entity)this.seats[i]);
            }
            for (i = 0; i < type.wheelPositions.length; ++i) {
                if (this.wheels[i] != null && this.wheels[i].addedToChunk) continue;
                this.wheels[i] = new EntityWheel(this.worldObj, this, i);
                this.worldObj.spawnEntityInWorld((Entity)this.wheels[i]);
            }
        }
        if (this.hasEnoughFuel()) {
            this.harvesterAngle += this.throttle / 5.0f;
        }
        if (type.harvestBlocks && type.health.get((Object)((Object)EnumDriveablePart.harvester)) != null) {
            CollisionBox box = type.health.get((Object)((Object)EnumDriveablePart.harvester));
            for (float x = box.x; x <= box.x + box.w; x += 1.0f) {
                for (float y = box.y; y <= box.y + box.h; y += 1.0f) {
                    for (float z = box.z; z <= box.z + box.d; z += 1.0f) {
                        int blockZ;
                        int blockY;
                        Vector3f v = this.axes.findLocalVectorGlobally(new Vector3f(x, y, z));
                        int blockX = (int)Math.round(this.posX + (double)v.x);
                        Block block = this.worldObj.getBlock(blockX, blockY = (int)Math.round(this.posY + (double)v.y), blockZ = (int)Math.round(this.posZ + (double)v.z));
                        if (!type.materialsHarvested.contains((Object)block.getMaterial()) || block.getBlockHardness(this.worldObj, blockX, blockY, blockZ) < 0.0f) continue;
                        ArrayList stacks = block.getDrops(this.worldObj, blockX, blockY, blockZ, this.worldObj.getBlockMetadata(blockX, blockY, blockZ), 0);
                        for (int i = 0; i < stacks.size(); ++i) {
                            ItemStack stack = (ItemStack)stacks.get(i);
                            FlansMod.log("");
                            if (InventoryHelper.addItemStackToInventory(this.driveableData, stack, this.driverIsCreative()) || this.worldObj.isRemote || !this.worldObj.getGameRules().getGameRuleBooleanValue("doTileDrops")) continue;
                            this.worldObj.spawnEntityInWorld((Entity)new EntityItem(this.worldObj, (double)((float)blockX + 0.5f), (double)((float)blockY + 0.5f), (double)((float)blockZ + 0.5f), stack));
                        }
                        this.worldObj.func_147480_a(blockX, blockY, blockZ, false);
                    }
                }
            }
        }
        for (DriveablePart part : this.getDriveableData().parts.values()) {
            Vector3f pos;
            if (part.box == null) continue;
            part.update(this);
            if (this.worldObj.isRemote) {
                if (part.onFire) {
                    pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x + this.rand.nextFloat() * part.box.w, part.box.y + this.rand.nextFloat() * part.box.h, part.box.z + this.rand.nextFloat() * part.box.d));
                    this.worldObj.spawnParticle("flame", this.posX + (double)pos.x, this.posY + (double)pos.y, this.posZ + (double)pos.z, 0.0, 0.0, 0.0);
                }
                if (part.health > 0 && part.health < part.maxHealth / 2) {
                    pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x + this.rand.nextFloat() * part.box.w, part.box.y + this.rand.nextFloat() * part.box.h, part.box.z + this.rand.nextFloat() * part.box.d));
                    this.worldObj.spawnParticle(part.health < part.maxHealth / 4 ? "largesmoke" : "smoke", this.posX + (double)pos.x, this.posY + (double)pos.y, this.posZ + (double)pos.z, 0.0, 0.0, 0.0);
                }
            }
            if (part.onFire) {
                if (this.worldObj.isRaining() && this.rand.nextInt(40) == 0) {
                    part.onFire = false;
                }
                pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x + part.box.w / 2.0f, part.box.y + part.box.h / 2.0f, part.box.z + part.box.d / 2.0f));
                if (this.worldObj.getBlock(MathHelper.floor_double((double)(this.posX + (double)pos.x)), MathHelper.floor_double((double)(this.posY + (double)pos.y)), MathHelper.floor_double((double)(this.posZ + (double)pos.z))).getMaterial() != Material.water) continue;
                part.onFire = false;
                continue;
            }
            pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x / 16.0f + part.box.w / 32.0f, part.box.y / 16.0f + part.box.h / 32.0f, part.box.z / 16.0f + part.box.d / 32.0f));
            if (this.worldObj.getBlock(MathHelper.floor_double((double)(this.posX + (double)pos.x)), MathHelper.floor_double((double)(this.posY + (double)pos.y)), MathHelper.floor_double((double)(this.posZ + (double)pos.z))).getMaterial() != Material.lava) continue;
            part.onFire = true;
        }
        this.checkParts();
        this.prevRotationYaw = this.axes.getYaw();
        this.prevRotationPitch = this.axes.getPitch();
        this.prevRotationRoll = this.axes.getRoll();
        this.prevAxes = this.axes.clone();
        if (this.riddenByEntity != null && this.riddenByEntity.isDead) {
            this.riddenByEntity = null;
        }
        if (this.riddenByEntity != null && this.isDead) {
            this.riddenByEntity.mountEntity(null);
        }
        if (this.riddenByEntity != null) {
            this.riddenByEntity.fallDistance = 0.0f;
        }
        boolean bl = canThrust = this.driverIsCreative() || this.driveableData.fuelInTank > 0.0f;
        if (this.seats[0] != null && this.seats[0].riddenByEntity == null || !canThrust && this.getDriveableType().maxThrottle != 0.0f && this.getDriveableType().maxNegativeThrottle != 0.0f) {
            this.throttle *= 0.98f;
        }
        if (this.seats[0] != null && this.seats[0].riddenByEntity == null) {
            this.leftMouseHeld = false;
            this.rightMouseHeld = false;
        }
        if (this.shootDelayPrimary > 0) {
            --this.shootDelayPrimary;
        }
        if (this.shootDelaySecondary > 0) {
            --this.shootDelaySecondary;
        }
        if (this.ticksExisted == 1) {
            this.setShootDelay(this.getDriveableType().placeTimePrimary, false);
            this.setShootDelay(this.getDriveableType().placeTimeSecondary, true);
            if (!this.worldObj.isRemote) {
                if (!this.getDriveableType().placeSoundPrimary.isEmpty()) {
                    PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.getDriveableType().placeSoundPrimary, false);
                }
                if (!this.getDriveableType().placeSoundSecondary.isEmpty()) {
                    PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.getDriveableType().placeSoundSecondary, false);
                }
            }
        }
        if (!this.worldObj.isRemote) {
            if (this.leftMouseHeld && this.getDriveableType().modePrimary == EnumFireMode.FULLAUTO) {
                this.shoot(false);
            }
            if (this.rightMouseHeld && this.getDriveableType().modeSecondary == EnumFireMode.FULLAUTO) {
                this.shoot(true);
            }
            this.minigunSpeedPrimary *= 0.9f;
            this.minigunSpeedSecondary *= 0.9f;
            if (this.leftMouseHeld && this.getDriveableType().modePrimary == EnumFireMode.MINIGUN) {
                this.minigunSpeedPrimary += 0.1f;
                if (this.minigunSpeedPrimary > 1.0f) {
                    this.shoot(false);
                }
            }
            if (this.rightMouseHeld && this.getDriveableType().modeSecondary == EnumFireMode.MINIGUN) {
                this.minigunSpeedSecondary += 0.1f;
                if (this.minigunSpeedSecondary > 1.0f) {
                    this.shoot(true);
                }
            }
        }
        int fuelMultiplier = 2;
        if (data.fuelInTank >= (float)type.fuelTankSize) {
            return;
        }
        for (int i = 0; i < data.getSizeInventory(); ++i) {
            ItemStack stack = data.getStackInSlot(i);
            if (stack == null || stack.stackSize <= 0) continue;
            Item item = stack.getItem();
            if (data.engine.useRFPower) {
                if (!(item instanceof IEnergyContainerItem)) continue;
                IEnergyContainerItem energy = (IEnergyContainerItem)item;
                data.fuelInTank += (float)(fuelMultiplier * energy.extractEnergy(stack, data.engine.RFDrawRate, false) / data.engine.RFDrawRate);
                continue;
            }
            if (item instanceof ItemPart) {
                PartType part2 = ((ItemPart)item).type;
                if (part2.category != 9) continue;
                data.fuelInTank += (float)fuelMultiplier;
                int damage = stack.getItemDamage();
                stack.setItemDamage(damage + 1);
                if (damage < stack.getMaxDamage()) break;
                stack.setItemDamage(0);
                --stack.stackSize;
                if (stack.stackSize > 0) break;
                data.setInventorySlotContents(i, null);
                break;
            }
            if (FlansMod.hooks.BuildCraftLoaded && stack.isItemEqual(FlansMod.hooks.BuildCraftOilBucket) && data.fuelInTank + (float)(1000 * fuelMultiplier) <= (float)type.fuelTankSize) {
                data.fuelInTank += (float)(1000 * fuelMultiplier);
                data.setInventorySlotContents(i, new ItemStack(Items.bucket));
                continue;
            }
            if (!FlansMod.hooks.BuildCraftLoaded || !stack.isItemEqual(FlansMod.hooks.BuildCraftFuelBucket) || data.fuelInTank + (float)(2000 * fuelMultiplier) > (float)type.fuelTankSize) continue;
            data.fuelInTank += (float)(2000 * fuelMultiplier);
            data.setInventorySlotContents(i, new ItemStack(Items.bucket));
        }
    }

    public void checkInventoryChanged() {
        DriveableType type = this.getDriveableType();
        if (type == null) {
            return;
        }
        if (this.worldObj.isRemote) {
            return;
        }
        if (!this.driveableData.inventoryChanged) {
            return;
        }
        this.driveableData.inventoryChanged = false;
        try {
            for (int ps = 0; ps < 2; ++ps) {
                int i;
                int istart;
                EnumWeaponType weaponType;
                EnumWeaponType enumWeaponType = weaponType = ps == 0 ? type.primary : type.secondary;
                if (weaponType == EnumWeaponType.GUN) {
                    weaponType = EnumWeaponType.NONE;
                }
                if ((istart = this.getInventoryStart(weaponType)) == this.driveableData.getAmmoInventoryStart()) {
                    istart += type.numPassengerGunners;
                }
                int isize = this.getInventorySize(weaponType);
                if (istart < 0 && isize <= 0) continue;
                if (this.prevInventoryItems[ps] == null) {
                    this.prevInventoryItems[ps] = new ItemStack[isize];
                }
                for (i = 0; i < isize; ++i) {
                    ItemStack itemStack = this.driveableData.getStackInSlot(istart + i);
                    if (itemStack == null || !(itemStack.getItem() instanceof ItemBullet) || this.prevInventoryItems[ps][i] != null && ItemStack.areItemStacksEqual((ItemStack)itemStack, (ItemStack)this.prevInventoryItems[ps][i]) || !type.isValidAmmo(((ItemBullet)itemStack.getItem()).type, weaponType)) continue;
                    this.onWeaponInventoryChanged(ps == 1);
                    break;
                }
                for (i = 0; i < isize; ++i) {
                    this.prevInventoryItems[ps][i] = this.driveableData.getStackInSlot(istart + i);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onWeaponInventoryChanged(boolean secondary) {
        DriveableType type = this.getDriveableType();
        if (!secondary) {
            if (type.reloadTimePrimary > 0 && this.getShootDelay(secondary) <= 0) {
                FlansMod.log("EntityDriveable Reload Primary " + type.reloadTimePrimary + " tick");
                this.setShootDelay(type.reloadTimePrimary, secondary);
                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.getDriveableType().reloadSoundPrimary, false);
            }
        } else if (type.reloadTimeSecondary > 0 && this.getShootDelay(secondary) <= 0) {
            FlansMod.log("EntityDriveable Reload Secondary " + type.reloadTimeSecondary + " tick");
            this.setShootDelay(type.reloadTimeSecondary, secondary);
            PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.getDriveableType().reloadSoundSecondary, false);
        }
    }

    public int getInventoryStart(EnumWeaponType wt) {
        switch (wt) {
            case GUN: 
            case NONE: {
                return this.driveableData.getAmmoInventoryStart();
            }
            case MISSILE: 
            case SHELL: {
                return this.driveableData.getMissileInventoryStart();
            }
            case BOMB: 
            case MINE: {
                return this.driveableData.getBombInventoryStart();
            }
        }
        return -1;
    }

    public int getInventorySize(EnumWeaponType wt) {
        switch (wt) {
            case GUN: 
            case NONE: {
                return this.driveableData.ammo.length;
            }
            case MISSILE: 
            case SHELL: {
                return this.driveableData.missiles.length;
            }
            case BOMB: 
            case MINE: {
                return this.driveableData.bombs.length;
            }
        }
        return -1;
    }

    public void checkForCollisions() {
        boolean damagePart = false;
        boolean crashInWater = false;
        double speed = this.getSpeedXYZ();
        for (DriveablePosition p : this.getDriveableType().collisionPoints) {
            MovingObjectPosition hit;
            if (this.driveableData.parts.get((Object)p.part).dead) continue;
            Vector3f lastRelPos = this.prevAxes.findLocalVectorGlobally(p.position);
            Vec3 lastPos = Vec3.createVectorHelper((double)(this.prevPosX + (double)lastRelPos.x), (double)(this.prevPosY + (double)lastRelPos.y), (double)(this.prevPosZ + (double)lastRelPos.z));
            Vector3f currentRelPos = this.axes.findLocalVectorGlobally(p.position);
            Vec3 currentPos = Vec3.createVectorHelper((double)(this.posX + (double)currentRelPos.x), (double)(this.posY + (double)currentRelPos.y), (double)(this.posZ + (double)currentRelPos.z));
            if (FlansMod.DEBUG && this.worldObj.isRemote) {
                this.worldObj.spawnEntityInWorld((Entity)new EntityDebugVector(this.worldObj, new Vector3f(lastPos), Vector3f.sub(currentRelPos, lastRelPos, null), 10, 1.0f, 0.0f, 0.0f));
            }
            if ((hit = this.worldObj.rayTraceBlocks(lastPos, currentPos, crashInWater)) == null || hit.typeOfHit != MovingObjectPosition.MovingObjectType.BLOCK) continue;
            int x = hit.blockX;
            int y = hit.blockY;
            int z = hit.blockZ;
            Block blockHit = this.worldObj.getBlock(x, y, z);
            int meta = this.worldObj.getBlockMetadata(x, y, z);
            float blockHardness = blockHit.getBlockHardness(this.worldObj, x, y, z);
            float damage = blockHardness * blockHardness * (float)speed;
            if (null == blockHit.getCollisionBoundingBoxFromPool(this.worldObj, x, y, z)) {
                damage = 0.0f;
            }
            if (damage > 0.0f) {
                damagePart = true;
            }
            if (!this.attackPart(p.part, DamageSource.inWall, damage) && TeamsManager.driveablesBreakBlocks) {
                this.worldObj.playAuxSFXAtEntity(null, 2001, x, y, z, Block.getIdFromBlock((Block)blockHit) + (meta << 12));
                if (this.worldObj.isRemote) continue;
                blockHit.dropBlockAsItem(this.worldObj, x, y, z, meta, 1);
                this.worldObj.setBlockToAir(x, y, z);
                continue;
            }
            this.worldObj.createExplosion((Entity)this, currentPos.xCoord, currentPos.yCoord, currentPos.zCoord, 1.0f, false);
        }
        if (damagePart && !this.worldObj.isRemote) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), this.posX, this.posY, this.posZ, 100.0f, this.dimension);
        }
    }

    protected void fall(float k) {
        double fallDist = (this.posY - this.prevPosY + this.motionY) / 2.0;
        float damage = (float)(fallDist < -0.3 ? (- fallDist) * 50.0 : 0.0);
        boolean no_damage = true;
        if (damage > 0.0f && this.invulnerableUnmountCount == 0 && this.ticksExisted > 20) {
            DriveableType type = this.getDriveableType();
            damage = (int)(damage * type.fallDamageFactor);
            this.attackPart(EnumDriveablePart.core, DamageSource.fall, damage);
            if (type.wheelPositions.length > 0) {
                this.attackPart(type.wheelPositions[0].part, DamageSource.fall, damage / 5.0f);
            }
            no_damage = false;
        }
    }

    public boolean attackPart(EnumDriveablePart ep, DamageSource source, float damage) {
        if (ep == EnumDriveablePart.core) {
            this.lastAtkEntity = source.getSourceOfDamage() instanceof EntityLivingBase ? source.getSourceOfDamage() : (source.getEntity() instanceof EntityLivingBase ? source.getEntity() : null);
        }
        DriveablePart part = this.driveableData.parts.get((Object)((Object)ep));
        return part.attack(damage, source.isFireDamage());
    }

    public Vector3f rotate(Vector3f inVec) {
        return this.axes.findLocalVectorGlobally(inVec);
    }

    public Vector3f rotate(Vec3 inVec) {
        return this.rotate(inVec.xCoord, inVec.yCoord, inVec.zCoord);
    }

    public Vector3f rotate(double x, double y, double z) {
        return this.rotate(new Vector3f((float)x, (float)y, (float)z));
    }

    public void rotateYaw(float rotateBy) {
        if (Math.abs(rotateBy) < 0.01f) {
            return;
        }
        this.axes.rotateLocalYaw(rotateBy);
        this.updatePrevAngles();
    }

    public void rotatePitch(float rotateBy) {
        if (Math.abs(rotateBy) < 0.01f) {
            return;
        }
        this.axes.rotateLocalPitch(rotateBy);
        this.updatePrevAngles();
    }

    public void rotateRoll(float rotateBy) {
        if (Math.abs(rotateBy) < 0.01f) {
            return;
        }
        this.axes.rotateLocalRoll(rotateBy);
        this.updatePrevAngles();
    }

    public void updatePrevAngles() {
        double dPitch;
        double dRoll;
        double dYaw = this.axes.getYaw() - this.prevRotationYaw;
        if (dYaw > 180.0) {
            this.prevRotationYaw += 360.0f;
        }
        if (dYaw < -180.0) {
            this.prevRotationYaw -= 360.0f;
        }
        if ((dPitch = (double)(this.axes.getPitch() - this.prevRotationPitch)) > 180.0) {
            this.prevRotationPitch += 360.0f;
        }
        if (dPitch < -180.0) {
            this.prevRotationPitch -= 360.0f;
        }
        if ((dRoll = (double)(this.axes.getRoll() - this.prevRotationRoll)) > 180.0) {
            this.prevRotationRoll += 360.0f;
        }
        if (dRoll < -180.0) {
            this.prevRotationRoll -= 360.0f;
        }
    }

    public void setRotation(float rotYaw, float rotPitch, float rotRoll) {
        this.axes.setAngles(rotYaw, rotPitch, rotRoll);
    }

    public boolean isPartOfThis(Entity ent) {
        for (EntitySeat seat : this.seats) {
            if (seat == null) continue;
            if (ent == seat) {
                return true;
            }
            if (seat.riddenByEntity != ent) continue;
            return true;
        }
        return ent == this;
    }

    public float getShadowSize() {
        return 0.0f;
    }

    public DriveableType getDriveableType() {
        return DriveableType.getDriveable(this.driveableType);
    }

    public DriveableData getDriveableData() {
        return this.driveableData;
    }

    @Override
    public boolean isDead() {
        return this.isDead;
    }

    @Override
    public Entity getControllingEntity() {
        return this.seats[0].getControllingEntity();
    }

    public ItemStack getPickedResult(MovingObjectPosition target) {
        ItemStack stack = new ItemStack(this.getDriveableType().item, 1, 0);
        stack.stackTagCompound = new NBTTagCompound();
        this.driveableData.writeToNBT(stack.stackTagCompound);
        return stack;
    }

    public boolean hasFuel() {
        if (this.seats == null || this.seats[0] == null || this.seats[0].riddenByEntity == null) {
            return false;
        }
        return this.driverIsCreative() || this.driveableData.fuelInTank > 0.0f;
    }

    public boolean hasEnoughFuel() {
        if (this.seats == null || this.seats[0] == null || this.seats[0].riddenByEntity == null) {
            return false;
        }
        return this.driverIsCreative() || this.driveableData.fuelInTank > this.driveableData.engine.fuelConsumption * this.throttle;
    }

    public double getSpeedXYZ() {
        return Math.sqrt(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
    }

    public double getSpeedXZ() {
        return Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
    }

    public boolean landVehicle() {
        return false;
    }

    public boolean gearDown() {
        return true;
    }

    public boolean onGround() {
        return this.onGround;
    }

    public ArrayList<BulletHit> attackFromBullet(Vector3f origin, Vector3f motion) {
        ArrayList<BulletHit> hits = new ArrayList<BulletHit>();
        Vector3f relativePosVector = Vector3f.sub(origin, new Vector3f((float)this.posX, (float)this.posY, (float)this.posZ), null);
        Vector3f rotatedPosVector = this.axes.findGlobalVectorLocally(relativePosVector);
        Vector3f rotatedMotVector = this.axes.findGlobalVectorLocally(motion);
        for (DriveablePart part : this.getDriveableData().parts.values()) {
            DriveableHit hit = part.rayTrace(this, rotatedPosVector, rotatedMotVector);
            if (hit == null) continue;
            hits.add(hit);
        }
        return hits;
    }

    public float bulletHit(EntityBullet bullet, DriveableHit hit, float penetratingPower) {
        DriveablePart part = this.getDriveableData().parts.get((Object)((Object)hit.part));
        part.hitByBullet(bullet, hit);
        if (!this.worldObj.isRemote) {
            this.checkParts();
            FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), this.posX, this.posY, this.posZ, 100.0f, this.dimension);
        }
        return penetratingPower - 5.0f;
    }

    public DriveablePart raytraceParts(Vector3f origin, Vector3f motion) {
        Vector3f relativePosVector = Vector3f.sub(origin, new Vector3f((float)this.posX, (float)this.posY, (float)this.posZ), null);
        Vector3f rotatedPosVector = this.axes.findGlobalVectorLocally(relativePosVector);
        Vector3f rotatedMotVector = this.axes.findGlobalVectorLocally(motion);
        for (DriveablePart part : this.getDriveableData().parts.values()) {
            if (part.rayTrace(this, rotatedPosVector, rotatedMotVector) == null) continue;
            return part;
        }
        return null;
    }

    public boolean canHitPart(EnumDriveablePart part) {
        return true;
    }

    public void checkParts() {
        for (DriveablePart part : this.getDriveableData().parts.values()) {
            if (part == null || part.dead || part.health > 0 || part.maxHealth <= 0) continue;
            this.killPart(part);
        }
        for (EntitySeat seat : this.seats) {
        }
        if (this.getDriveableData().parts.get((Object)EnumDriveablePart.core).dead) {
            int seatNum = this.seats.length;
            DriveableType type = this.getDriveableType();
            if (!this.worldObj.isRemote) {
                for (int i = 0; i < seatNum; ++i) {
                    if (this.seats[i].riddenByEntity == null || !(this.seats[i].riddenByEntity instanceof EntityPlayer)) continue;
                    Entity entity = this.seats[i].riddenByEntity;
                    this.seats[i].riddenByEntity.mountEntity(null);
                    if (this.lastAtkEntity instanceof EntityPlayer) {
                        entity.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)((EntityPlayer)this.lastAtkEntity)), 1.0E7f);
                        continue;
                    }
                    if (!(this.lastAtkEntity instanceof EntityLivingBase)) continue;
                    entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)((EntityLivingBase)this.lastAtkEntity)), 1.0E7f);
                }
                if (type.isExplosionWhenDestroyed) {
                    this.worldObj.createExplosion((Entity)this, this.posX, this.posY, this.posZ, 4.0f, false);
                }
                for (DriveablePart part2 : this.driveableData.parts.values()) {
                    if (part2.health <= 0 || part2.dead) continue;
                    this.killPart(part2);
                }
            }
            this.setDead();
        }
    }

    public void checkPartsWhenAttacked() {
        for (DriveablePart part : this.getDriveableData().parts.values()) {
            if (part == null || part.dead || part.health > 0 || part.maxHealth <= 0) continue;
            this.killPart(part);
        }
    }

    private void killPart(DriveablePart part) {
        if (part.dead) {
            return;
        }
        part.health = 0;
        part.dead = true;
        DriveableType type = this.getDriveableType();
        if (!this.worldObj.isRemote) {
            ArrayList<ItemStack> drops;
            Vector3f pos = new Vector3f(0.0f, 0.0f, 0.0f);
            if (part.box != null) {
                pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x / 16.0f + part.box.w / 32.0f, part.box.y / 16.0f + part.box.h / 32.0f, part.box.z / 16.0f + part.box.d / 32.0f));
            }
            if ((drops = type.getItemsRequired(part, this.getDriveableData().engine)) != null) {
                for (ItemStack stack : drops) {
                    this.worldObj.spawnEntityInWorld((Entity)new EntityItem(this.worldObj, this.posX + (double)pos.x, this.posY + (double)pos.y, this.posZ + (double)pos.z, stack.copy()));
                }
            }
            this.dropItemsOnPartDeath(pos, part);
            if (part.type == EnumDriveablePart.core) {
                for (int i = 0; i < this.getDriveableData().getSizeInventory(); ++i) {
                    ItemStack stack;
                    stack = this.getDriveableData().getStackInSlot(i);
                    if (stack == null) continue;
                    this.worldObj.spawnEntityInWorld((Entity)new EntityItem(this.worldObj, this.posX + this.rand.nextGaussian(), this.posY + this.rand.nextGaussian(), this.posZ + this.rand.nextGaussian(), stack));
                }
            }
        }
        for (EnumDriveablePart child : part.type.getChildren()) {
            this.killPart(this.getDriveableData().parts.get((Object)((Object)child)));
        }
    }

    protected abstract void dropItemsOnPartDeath(Vector3f var1, DriveablePart var2);

    @Override
    public float getPlayerRoll() {
        return this.axes.getRoll();
    }

    @Override
    public void explode() {
    }

    @Override
    public float getCameraDistance() {
        return this.getDriveableType().cameraDistance;
    }

    public boolean isPartIntact(EnumDriveablePart part) {
        DriveablePart thisPart = this.getDriveableData().parts.get((Object)((Object)part));
        return thisPart.maxHealth == 0 || thisPart.health > 0;
    }

    public abstract boolean hasMouseControlMode();

    public abstract String getBombInventoryName();

    public abstract String getMissileInventoryName();

    public boolean rotateWithTurret(Seat seat) {
        return seat.part == EnumDriveablePart.turret;
    }

    public String getCommandSenderName() {
        return this.getDriveableType().name;
    }

    @SideOnly(value=Side.CLIENT)
    public boolean showInventory(int seat) {
        return seat != 0 || !FlansModClient.controlModeMouse;
    }

    public int getShootDelay(boolean secondary) {
        return secondary ? this.shootDelaySecondary : this.shootDelayPrimary;
    }

    public float getMinigunSpeed(boolean secondary) {
        return secondary ? this.minigunSpeedSecondary : this.minigunSpeedPrimary;
    }

    public int getCurrentGun(boolean secondary) {
        return secondary ? this.currentGunSecondary : this.currentGunPrimary;
    }

    public void setShootDelay(int i, boolean secondary) {
        if (secondary) {
            this.shootDelaySecondary = i > this.shootDelaySecondary ? i : this.shootDelaySecondary;
        } else {
            this.shootDelayPrimary = i > this.shootDelayPrimary ? i : this.shootDelayPrimary;
        }
    }

    public void setMinigunSpeed(float f, boolean secondary) {
        if (secondary) {
            this.minigunSpeedSecondary = f;
        } else {
            this.minigunSpeedPrimary = f;
        }
    }

    public void setCurrentGun(int i, boolean secondary) {
        if (secondary) {
            this.currentGunSecondary = i;
        } else {
            this.currentGunPrimary = i;
        }
    }

}


/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.FMLCommonHandler
 *  cpw.mods.fml.relauncher.Side
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.PlayerCapabilities
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.IChatComponent
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.World
 */
package com.flansmod.common.driveables;

import com.flansmod.common.CommonProxy;
import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveablePosition;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityWheel;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.EnumPlaneMode;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.Propeller;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketDriveableControl;
import com.flansmod.common.network.PacketDriveableKey;
import com.flansmod.common.network.PacketPlaneControl;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.tools.ToolType;
import com.flansmod.common.vector.Matrix4f;
import com.flansmod.common.vector.Vector;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityPlane
extends EntityDriveable {
    public float flapsYaw;
    public float flapsPitchLeft;
    public float flapsPitchRight;
    public int soundPosition;
    public float propAngle;
    public int bombDelay;
    public int gunDelay;
    public int ticksSinceUsed = 0;
    public boolean varGear = true;
    public boolean varDoor = false;
    public boolean varWing = false;
    public int toggleTimer = 0;
    public EnumPlaneMode mode;
    public int flareDelay = 0;
    public int ticksFlareUsing = 0;
    public boolean varFlare;

    public EntityPlane(World world) {
        super(world);
    }

    public EntityPlane(World world, double x, double y, double z, PlaneType type, DriveableData data) {
        super(world, type, data);
        setPosition(x, y, z);
        prevPosX = x;
        prevPosY = y;
        prevPosZ = z;
        initType(type, false);
    }

    public EntityPlane(World world, double x, double y, double z, EntityPlayer placer, PlaneType type, DriveableData data) {
        this(world, x, y, z, type, data);
        rotateYaw(placer.rotationYaw + 90.0f);
        rotatePitch(type.restingPitch);
    }

    @Override
    public void initType(DriveableType type, boolean clientSide) {
        super.initType(type, clientSide);
        mode = ((PlaneType)type).mode == EnumPlaneMode.HELI ? EnumPlaneMode.HELI : EnumPlaneMode.PLANE;
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound tag) {
        super.writeEntityToNBT(tag);
        tag.setTag("Pos", (NBTBase)newDoubleNBTList(new double[]{posX, posY + 1.0, posZ}));
        tag.setBoolean("VarGear", varGear);
        tag.setBoolean("VarDoor", varDoor);
        tag.setBoolean("VarWing", varWing);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound tag) {
        super.readEntityFromNBT(tag);
        varGear = tag.getBoolean("VarGear");
        varDoor = tag.getBoolean("VarDoor");
        varWing = tag.getBoolean("VarWing");
    }

    @Override
    public void onMouseMoved(int deltaX, int deltaY) {
        if (!FMLCommonHandler.instance().getSide().isClient()) {
            return;
        }
        if (!FlansMod.proxy.mouseControlEnabled()) {
            return;
        }
        float sensitivity = 0.02f;
        flapsPitchLeft -= sensitivity * (float)deltaY;
        flapsPitchRight -= sensitivity * (float)deltaY;
        flapsPitchLeft -= sensitivity * (float)deltaX;
        flapsPitchRight += sensitivity * (float)deltaX;
    }

    @Override
    public void setPositionRotationAndMotion(double x, double y, double z, float yaw, float pitch, float roll, double motX, double motY, double motZ, float velYaw, float velPitch, float velRoll, float throt, float steeringYaw) {
        super.setPositionRotationAndMotion(x, y, z, yaw, pitch, roll, motX, motY, motZ, velYaw, velPitch, velRoll, throt, steeringYaw);
        flapsYaw = steeringYaw;
    }

    public boolean interactFirst(EntityPlayer entityplayer) {
        if (isDead) {
            return false;
        }
        if (worldObj.isRemote) {
            return false;
        }
        ItemStack currentItem = entityplayer.getCurrentEquippedItem();
        if (currentItem != null && currentItem.getItem() instanceof ItemTool && ((ItemTool)currentItem.getItem()).type.healDriveables) {
            return true;
        }
        PlaneType type = getPlaneType();
        for (int i = 0; i <= type.numPassengers; ++i) {
            if (!seats[i].interactFirst(entityplayer)) continue;
            if (i == 0) {
                bombDelay = type.planeBombDelay;
                FlansMod.proxy.doTutorialStuff(entityplayer, this);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean pressKey(int key, EntityPlayer player) {
        PlaneType type = getPlaneType();
        if (worldObj.isRemote && (key == 6 || key == 8 || key == 9)) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
            return true;
        }
        boolean canThrust = seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode || getDriveableData().fuelInTank > 0.0f;
        switch (key) {
            case 0: {
                if (canThrust || throttle < 0.0f) {
                    throttle += 0.002f;
                    if (throttle > 1.0f) {
                        throttle = 1.0f;
                    }
                }
                return true;
            }
            case 1: {
                if (canThrust || throttle > 0.0f) {
                    throttle -= 0.005f;
                    if (throttle < -1.0f) {
                        throttle = -1.0f;
                    }
                    if (throttle < 0.0f && type.maxNegativeThrottle == 0.0f) {
                        throttle = 0.0f;
                    }
                }
                return true;
            }
            case 2: {
                flapsYaw -= 1.0f;
                return true;
            }
            case 3: {
                flapsYaw += 1.0f;
                return true;
            }
            case 4: {
                flapsPitchLeft += 1.0f;
                flapsPitchRight += 1.0f;
                return true;
            }
            case 5: {
                flapsPitchLeft -= 1.0f;
                flapsPitchRight -= 1.0f;
                return true;
            }
            case 6: {
                if (seats[0].riddenByEntity != null) {
                    seats[0].riddenByEntity.mountEntity(null);
                }
                return true;
            }
            case 7: {
                if (worldObj.isRemote && (type.invInflight || Math.abs(throttle) < 0.1f && onGround)) {
                    FlansMod.proxy.openDriveableMenu((EntityPlayer)seats[0].riddenByEntity, worldObj, this);
                }
                return true;
            }
            case 8: 
            case 9: {
                return super.pressKey(key, player);
            }
            case 10: {
                FlansMod.proxy.changeControlMode((EntityPlayer)seats[0].riddenByEntity);
                return true;
            }
            case 11: {
                flapsPitchLeft += 1.0f;
                flapsPitchRight -= 1.0f;
                return true;
            }
            case 12: {
                flapsPitchLeft -= 1.0f;
                flapsPitchRight += 1.0f;
                return true;
            }
            case 13: {
                if (toggleTimer <= 0) {
                    varGear = !varGear;
                    player.addChatMessage((IChatComponent)new ChatComponentText("Landing gear " + (varGear ? "down" : "up")));
                    toggleTimer = 10;
                    FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
                }
                return true;
            }
            case 14: {
                if (toggleTimer <= 0) {
                    boolean bl = varDoor = !varDoor;
                    if (type.hasDoor) {
                        player.addChatMessage((IChatComponent)new ChatComponentText("Doors " + (varDoor ? "open" : "closed")));
                    }
                    toggleTimer = 10;
                    FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
                }
                return true;
            }
            case 15: {
                if (toggleTimer <= 0) {
                    if (type.hasWing) {
                        varWing = !varWing;
                        player.addChatMessage((IChatComponent)new ChatComponentText("Switching mode"));
                    }
                    if (type.mode == EnumPlaneMode.VTOL) {
                        mode = mode == EnumPlaneMode.HELI ? EnumPlaneMode.PLANE : EnumPlaneMode.HELI;
                        player.addChatMessage((IChatComponent)new ChatComponentText(mode == EnumPlaneMode.HELI ? "Entering hover mode" : "Entering plane mode"));
                    }
                    toggleTimer = 10;
                    FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
                }
                return true;
            }
            case 16: {
                axes.setAngles(axes.getYaw(), 0.0f, 0.0f);
                return true;
            }
            case 17: {
                break;
            }
            case 18: {
                if (!type.hasFlare || ticksFlareUsing > 0 || flareDelay > 0) break;
                ticksFlareUsing = type.timeFlareUsing * 20;
                flareDelay = type.flareDelay;
                if (worldObj.isRemote) {
                    FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
                } else if (!type.flareSound.isEmpty()) {
                    PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50.0, dimension, type.flareSound, false);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public void updateKeyHeldState(int key, boolean held) {
        super.updateKeyHeldState(key, held);
        if (!worldObj.isRemote) {
            switch (key) {
                default: 
            }
        }
    }

    @Override
    public void onUpdate() {
        float sensitivityAdjust;
        super.onUpdate();
        PlaneType type = getPlaneType();
        DriveableData data = getDriveableData();
        if (type == null) {
            FlansMod.log("Plane type null. Not ticking plane");
            return;
        }
        boolean thePlayerIsDrivingThis = worldObj.isRemote && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)seats[0].riddenByEntity);
        ++ticksSinceUsed;
        if (!worldObj.isRemote && seats[0].riddenByEntity != null) {
            ticksSinceUsed = 0;
        }
        if (!worldObj.isRemote && TeamsManager.planeLife > 0 && ticksSinceUsed > TeamsManager.planeLife * 20) {
            setDead();
        }
        if (worldObj.isRemote && (varFlare || ticksFlareUsing > 0) && ticksExisted % 5 == 0) {
            FlansMod.proxy.spawnParticle("flansmod.flare", posX, posY, posZ, motionX + (rand.nextDouble() - 0.5), motionY, motionZ + (rand.nextDouble() - 0.5));
        }
        if (ticksFlareUsing > 0) {
            --ticksFlareUsing;
        }
        if (flareDelay > 0) {
            --flareDelay;
        }
        if (bombDelay > 0) {
            --bombDelay;
        }
        if (gunDelay > 0) {
            --gunDelay;
        }
        if (toggleTimer > 0) {
            --toggleTimer;
        }
        if (hasEnoughFuel()) {
        	propAngle += (Math.pow(throttle, 0.4))*0.8;
        }
        flapsYaw *= 0.9f;
        flapsPitchLeft *= 0.9f;
        flapsPitchRight *= 0.9f;
        if (flapsYaw > 20.0f) {
            flapsYaw = 20.0f;
        }
        if (flapsYaw < -20.0f) {
            flapsYaw = -20.0f;
        }
        if (flapsPitchRight > 20.0f) {
            flapsPitchRight = 20.0f;
        }
        if (flapsPitchRight < -20.0f) {
            flapsPitchRight = -20.0f;
        }
        if (flapsPitchLeft > 20.0f) {
            flapsPitchLeft = 20.0f;
        }
        if (flapsPitchLeft < -20.0f) {
            flapsPitchLeft = -20.0f;
        }
        if (worldObj.isRemote && !thePlayerIsDrivingThis && serverPositionTransitionTicker > 0) {
            double x = posX + (serverPosX - posX) / (double)serverPositionTransitionTicker;
            double y = posY + (serverPosY - posY) / (double)serverPositionTransitionTicker;
            double z = posZ + (serverPosZ - posZ) / (double)serverPositionTransitionTicker;
            double dYaw = MathHelper.wrapAngleTo180_double((double)(serverYaw - (double)axes.getYaw()));
            double dPitch = MathHelper.wrapAngleTo180_double((double)(serverPitch - (double)axes.getPitch()));
            double dRoll = MathHelper.wrapAngleTo180_double((double)(serverRoll - (double)axes.getRoll()));
            rotationYaw = (float)((double)axes.getYaw() + dYaw / (double)serverPositionTransitionTicker);
            rotationPitch = (float)((double)axes.getPitch() + dPitch / (double)serverPositionTransitionTicker);
            float rotationRoll = (float)((double)axes.getRoll() + dRoll / (double)serverPositionTransitionTicker);
            --serverPositionTransitionTicker;
            setPosition(x, y, z);
            setRotation(rotationYaw, rotationPitch, rotationRoll);
        }
        boolean canThrust = seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode || data.fuelInTank > 0.0f;
        float throttlePull = 0.99f;
        if (seats[0] != null && seats[0].riddenByEntity != null && mode == EnumPlaneMode.HELI && canThrust) {
            throttle = (throttle - 0.5f) * throttlePull + 0.5f;
        }
        float lastTickSpeed = (float)getSpeedXYZ();
        float f = sensitivityAdjust = throttle > 0.5f ? 1.5f - throttle : 4.0f * throttle - 1.0f;
        if (sensitivityAdjust < 0.0f) {
            sensitivityAdjust = 0.0f;
        }
        float yaw = flapsYaw * (flapsYaw > 0.0f ? type.turnLeftModifier : type.turnRightModifier) * (sensitivityAdjust *= 0.125f);
        float flapsPitch = (flapsPitchLeft + flapsPitchRight) / 2.0f;
        float pitch = flapsPitch * (flapsPitch > 0.0f ? type.lookUpModifier : type.lookDownModifier) * sensitivityAdjust;
        float flapsRoll = (flapsPitchRight - flapsPitchLeft) / 2.0f;
        float roll = flapsRoll * (flapsRoll > 0.0f ? type.rollLeftModifier : type.rollRightModifier) * sensitivityAdjust;
        if (mode == EnumPlaneMode.PLANE) {
            if (!isPartIntact(EnumDriveablePart.tail)) {
                yaw = 0.0f;
                pitch = 0.0f;
            }
            if (!isPartIntact(EnumDriveablePart.leftWing)) {
                roll = (float)((double)roll - 2.0 * getSpeedXZ());
            }
            if (!isPartIntact(EnumDriveablePart.rightWing)) {
                roll = (float)((double)roll + 2.0 * getSpeedXZ());
            }
        }
        axes.rotateLocalYaw(yaw);
        axes.rotateLocalPitch(pitch);
        axes.rotateLocalRoll(- roll);
        if (!worldObj.isRemote || !FlansMod.proxy.mouseControlEnabled()) {
            // empty if block
        }
        float g = 0.098000005f;
        float drag = 1.0f - 0.05f * type.drag;
        float wobbleFactor = 0.0f;
        float throttleScaled = 0.01f * (type.maxThrottle + (data.engine == null ? 0.0f : data.engine.engineSpeed));
        if (!canThrust) {
            throttleScaled = 0.0f;
        }
        int numPropsWorking = 0;
        int numProps = 0;
        float fuelConsumptionMultiplier = 2.0f;
        switch (mode) {
            case HELI: {
                for (Propeller prop : type.heliPropellers) {
                    if (!isPartIntact(prop.planePart)) continue;
                    ++numPropsWorking;
                }
                numProps = type.heliPropellers.size();
                if (numProps == 0) break;
                Vector3f up = axes.getYAxis();
                float upwardsForce = throttle * throttleScaled + (g - (throttleScaled *= (float)(numPropsWorking / numProps) * 2.0f) / 2.0f);
                if (throttle < 0.5f) {
                    upwardsForce = g * throttle * 2.0f;
                }
                if (!isPartIntact(EnumDriveablePart.blades)) {
                    upwardsForce = 0.0f;
                }
                motionX += (double)(upwardsForce * up.x * 0.5f);
                motionY += (double)(upwardsForce * up.y);
                motionZ += (double)(upwardsForce * up.z * 0.5f);
                motionY -= (double)g;
                motionX *= (double)drag;
                motionY *= (double)drag;
                motionZ *= (double)drag;
                data.fuelInTank -= upwardsForce * fuelConsumptionMultiplier * data.engine.fuelConsumption;
                break;
            }
            case PLANE: {
                float amountOfLift;
                for (Propeller prop : type.propellers) {
                    if (!isPartIntact(prop.planePart)) continue;
                    ++numPropsWorking;
                }
                numProps = type.propellers.size();
                if (numProps == 0) break;
                Vector3f forwards = (Vector3f)axes.getXAxis().normalise();
                if (lastTickSpeed > 2.0f) {
                    lastTickSpeed = 2.0f;
                }
                float newSpeed = lastTickSpeed + throttleScaled * 2.0f;
                float proportionOfMotionToCorrect = 2.0f * throttle - 0.5f;
                if (proportionOfMotionToCorrect < 0.0f) {
                    proportionOfMotionToCorrect = 0.0f;
                }
                if (proportionOfMotionToCorrect > 1.5f) {
                    proportionOfMotionToCorrect = 1.5f;
                }
                g = 0.049000002f;
                motionY -= (double)g;
                int numWingsIntact = 0;
                if (isPartIntact(EnumDriveablePart.rightWing)) {
                    ++numWingsIntact;
                }
                if (isPartIntact(EnumDriveablePart.leftWing)) {
                    ++numWingsIntact;
                }
                if ((amountOfLift = 2.0f * g * throttle * (float)numWingsIntact / 2.0f) > g) {
                    amountOfLift = g;
                }
                motionY += (double)amountOfLift;
                motionX *= (double)(1.0f - proportionOfMotionToCorrect);
                motionY *= (double)(1.0f - proportionOfMotionToCorrect);
                motionZ *= (double)(1.0f - proportionOfMotionToCorrect);
                motionX += (double)(proportionOfMotionToCorrect * newSpeed * forwards.x);
                motionY += (double)(proportionOfMotionToCorrect * newSpeed * forwards.y);
                motionZ += (double)(proportionOfMotionToCorrect * newSpeed * forwards.z);
                motionX *= (double)drag;
                motionY = posY - prevPosY < 0.0 ? (motionY *= drag < 1.0f ? 0.999 : 1.0) : (motionY *= (double)drag);
                motionZ *= (double)drag;
                data.fuelInTank -= throttleScaled * fuelConsumptionMultiplier * data.engine.fuelConsumption;
                break;
            }
		default:
			break;
        }
        double motion = Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);
        if (motion > 10.0) {
            motionX *= 10.0 / motion;
            motionY *= 10.0 / motion;
            motionZ *= 10.0 / motion;
        }
        for (EntityWheel wheel : wheels) {
            if (wheel == null || worldObj == null || !type.floatOnWater || !worldObj.isAnyLiquid(wheel.boundingBox)) continue;
            motionY += (double)type.buoyancy;
        }
        for (EntityWheel wheel2 : wheels) {
            if (wheel2 == null) continue;
            wheel2.prevPosY = wheel2.posY;
            wheel2.moveEntity(motionX, motionY, motionZ);
        }
        correctWheelPos();
        for (int i = 0; i < 2; ++i) {
            Vector3f amountToMoveCar = new Vector3f(motionX / 2.0, motionY / 2.0, motionZ / 2.0);
            for (EntityWheel wheel3 : wheels) {
                if (wheel3 == null) continue;
                onGround = true;
                wheel3.onGround = true;
                wheel3.rotationYaw = axes.getYaw();
                Vector3f targetWheelPos = axes.findLocalVectorGlobally(getPlaneType().wheelPositions[wheel3.ID].position);
                Vector3f currentWheelPos = new Vector3f(wheel3.posX - posX, wheel3.posY - posY, wheel3.posZ - posZ);
                float targetWheelLength = targetWheelPos.length();
                float currentWheelLength = currentWheelPos.length();
                float dLength = targetWheelLength - currentWheelLength;
                float dAngle = Vector3f.angle(targetWheelPos, currentWheelPos);
                float newLength = currentWheelLength + dLength * type.wheelSpringStrength;
                Vector3f rotateAround = Vector3f.cross(targetWheelPos, currentWheelPos, null);
                Matrix4f mat = new Matrix4f();
                mat.m00 = currentWheelPos.x;
                mat.m10 = currentWheelPos.y;
                mat.m20 = currentWheelPos.z;
                mat.rotate(dAngle * type.wheelSpringStrength, rotateAround);
                if (ticksExisted > 5) {
                    axes.rotateGlobal((- dAngle) * type.wheelSpringStrength, rotateAround);
                }
                Vector3f newWheelPos = new Vector3f(mat.m00, mat.m10, mat.m20);
                newWheelPos.normalise().scale(newLength);
                float wheelProportion = 0.75f;
                Vector3f amountToMoveWheel = new Vector3f();
                amountToMoveWheel.x = (newWheelPos.x - currentWheelPos.x) * (1.0f - wheelProportion);
                amountToMoveWheel.y = (newWheelPos.y - currentWheelPos.y) * (1.0f - wheelProportion);
                amountToMoveWheel.z = (newWheelPos.z - currentWheelPos.z) * (1.0f - wheelProportion);
                amountToMoveCar.x -= (newWheelPos.x - currentWheelPos.x) * (1.0f - wheelProportion);
                amountToMoveCar.y -= (newWheelPos.y - currentWheelPos.y) * (1.0f - wheelProportion);
                amountToMoveCar.z -= (newWheelPos.z - currentWheelPos.z) * (1.0f - wheelProportion);
                amountToMoveCar.y = (float)((double)amountToMoveCar.y + (wheel3.posY - wheel3.prevPosY - motionY) * 0.5 / (double)wheels.length);
                wheel3.moveEntity((double)amountToMoveWheel.x, (double)amountToMoveWheel.y, (double)amountToMoveWheel.z);
            }
            moveEntity((double)amountToMoveCar.x, (double)amountToMoveCar.y, (double)amountToMoveCar.z);
        }
        if (ridingEntity != null && ridingEntity.getClass().toString().indexOf("mcheli.aircraft.MCH_EntitySeat") > 0) {
            axes.setAngles(ridingEntity.rotationYaw + 90.0f, 0.0f, 0.0f);
        }
        checkForCollisions();
        if (throttle > 0.01f && throttle < 0.2f && soundPosition == 0 && hasEnoughFuel()) {
            PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50.0, dimension, type.startSound, false);
            soundPosition = type.startSoundLength;
        }
        if (throttle > 0.2f && soundPosition == 0 && hasEnoughFuel()) {
            PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50.0, dimension, type.engineSound, false);
            soundPosition = type.engineSoundLength;
        }
        if (soundPosition > 0) {
            --soundPosition;
        }
        for (EntitySeat seat : seats) {
            if (seat == null) continue;
            seat.updatePosition();
        }
        if (thePlayerIsDrivingThis) {
            FlansMod.getPacketHandler().sendToServer(new PacketPlaneControl(this));
            serverPosX = posX;
            serverPosY = posY;
            serverPosZ = posZ;
            serverYaw = axes.getYaw();
        }
        float updateSpeed = 0.01f;
        if (!worldObj.isRemote) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketPlaneControl(this), posX, posY, posZ, 200.0f, dimension);
        }
    }

    @Override
    public void setDead() {
        super.setDead();
        for (EntityWheel wheel : wheels) {
            if (wheel == null) continue;
            wheel.setDead();
        }
    }

    @Override
    public boolean gearDown() {
        return varGear;
    }

    public boolean attackEntityFrom(DamageSource damagesource, float i, boolean doDamage) {
        if (worldObj.isRemote || isDead) {
            return true;
        }
        PlaneType type = PlaneType.getPlane(driveableType);
        if (damagesource.damageType.equals("player") && damagesource.getEntity().onGround && (seats[0] == null || seats[0].riddenByEntity == null)) {
            ItemStack planeStack = new ItemStack(type.item, 1, 0);
            planeStack.stackTagCompound = new NBTTagCompound();
            driveableData.writeToNBT(planeStack.stackTagCompound);
            entityDropItem(planeStack, 0.5f);
            setDead();
        }
        return super.attackEntityFrom(damagesource, i);
    }

    @Override
    public boolean canHitPart(EnumDriveablePart part) {
        return varGear || part != EnumDriveablePart.coreWheel && part != EnumDriveablePart.leftWingWheel && part != EnumDriveablePart.rightWingWheel && part != EnumDriveablePart.tailWheel;
    }

    @Override
    public boolean attackEntityFrom(DamageSource damagesource, float i) {
        return attackEntityFrom(damagesource, i, true);
    }

    public PlaneType getPlaneType() {
        return PlaneType.getPlane(driveableType);
    }

    @Override
    protected void dropItemsOnPartDeath(Vector3f midpoint, DriveablePart part) {
    }

    @Override
    public String getBombInventoryName() {
        return "Bombs";
    }

    @Override
    public String getMissileInventoryName() {
        return "Missiles";
    }

    @Override
    public boolean hasMouseControlMode() {
        return true;
    }

}


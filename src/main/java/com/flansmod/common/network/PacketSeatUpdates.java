package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;

public class PacketSeatUpdates extends PacketBase {
    public int entityId, seatId;
    public float yaw, pitch;
    public float playerYaw, playerPitch;
    public boolean playYawSound;
    public boolean playPitchSound;
    public int yawSoundDelay, pitchSoundDelay;

    public PacketSeatUpdates() {
    }

    public PacketSeatUpdates(EntitySeat seat) {
        entityId = seat.driveable.getEntityId();
        seatId = seat.seatInfo.id;
        yaw = seat.looking.getYaw();
        pitch = seat.looking.getPitch();
        playerYaw = seat.playerLooking.getYaw();
        playerPitch = seat.playerLooking.getPitch();
        playYawSound = seat.playYawSound;
        playPitchSound = seat.playPitchSound;
        yawSoundDelay = seat.yawSoundDelay;
        pitchSoundDelay = seat.pitchSoundDelay;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeInt(entityId);
        data.writeInt(seatId);
        data.writeFloat(yaw);
        data.writeFloat(pitch);
        data.writeFloat(playerYaw);
        data.writeFloat(playerPitch);

        data.writeBoolean(playYawSound);
        data.writeBoolean(playPitchSound);
        data.writeInt(yawSoundDelay);
        data.writeInt(pitchSoundDelay);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        entityId = data.readInt();
        seatId = data.readInt();
        yaw = data.readFloat();
        pitch = data.readFloat();
        playerYaw = data.readFloat();
        playerPitch = data.readFloat();
        
        playYawSound = data.readBoolean();
        playPitchSound = data.readBoolean();
        yawSoundDelay = data.readInt();
        pitchSoundDelay = data.readInt();
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        EntityDriveable driveable = null;
        for (Object obj : playerEntity.worldObj.loadedEntityList) {
            if (obj instanceof EntityDriveable && ((Entity) obj).getEntityId() == entityId) {
                driveable = (EntityDriveable) obj;
                break;
            }
        }
        if (driveable != null) {
            driveable.seats[seatId].prevLooking = driveable.seats[seatId].looking.clone();
            driveable.seats[seatId].looking.setAngles(yaw, pitch, 0F);
            driveable.seats[seatId].prevPlayerLooking = driveable.seats[seatId].playerLooking.clone();
            driveable.seats[seatId].playerLooking.setAngles(playerYaw, playerPitch, 0F);
            driveable.seats[seatId].playYawSound = playYawSound;
            driveable.seats[seatId].playPitchSound = playPitchSound;
            driveable.seats[seatId].yawSoundDelay = yawSoundDelay;
            driveable.seats[seatId].pitchSoundDelay = pitchSoundDelay;
            //If on the server, update all surrounding players with these new angles
            FlansMod.getPacketHandler().sendToAllAround(this, driveable.posX, driveable.posY, driveable.posZ, FlansMod.driveableUpdateRange, driveable.dimension);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        EntityDriveable driveable = null;
        EntitySeat seat = null;
        for (Object obj : clientPlayer.worldObj.loadedEntityList) {
            if (obj instanceof EntityDriveable && ((Entity) obj).getEntityId() == entityId) {
                driveable = (EntityDriveable) obj;
                break;
            }
        }

        if (driveable != null) {
            //If this is the player who sent the packet in the first place, don't read it
            if (driveable.seats[seatId] == null || driveable.seats[seatId].riddenByEntity == clientPlayer)
                return;
            driveable.seats[seatId].prevLooking = driveable.seats[seatId].looking.clone();
            driveable.seats[seatId].looking.setAngles(yaw, pitch, 0F);
            driveable.seats[seatId].prevPlayerLooking = driveable.seats[seatId].playerLooking.clone();
            driveable.seats[seatId].playerLooking.setAngles(playerYaw, playerPitch, 0F);
            driveable.seats[seatId].playYawSound = playYawSound;
            driveable.seats[seatId].playPitchSound = playPitchSound;
            driveable.seats[seatId].yawSoundDelay = yawSoundDelay;
            driveable.seats[seatId].pitchSoundDelay = pitchSoundDelay;
        }
    }
}

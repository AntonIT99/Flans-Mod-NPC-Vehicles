package com.wolffsmod.network;

import com.wolffsmod.WolffNPCMod;
import com.wolffsmod.entity.EntityFlanDriveableNPC;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import noppes.npcs.entity.EntityCustomNpc;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

public class FlanEntitySyncPacket implements IMessage
{
    int entityId;
    float driverYaw;
    float driverPitch;
    float renderYawOffset;
    float rotationYaw;
    float rotationYawHead;
    float rotationPitch;

    public FlanEntitySyncPacket() {}

    public FlanEntitySyncPacket(EntityFlanDriveableNPC entity)
    {
        entityId = entity.npc.getEntityId();
        driverYaw = entity.driver.getLocalYaw();
        driverPitch = entity.driver.getPitch();
        renderYawOffset = entity.renderYawOffset;
        rotationYaw = entity.rotationYaw;
        rotationYawHead = entity.rotationYawHead;
        rotationPitch = entity.rotationPitch;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        entityId = buf.readInt();
        driverYaw = buf.readFloat();
        driverPitch = buf.readFloat();
        renderYawOffset = buf.readFloat();
        rotationYaw = buf.readFloat();
        rotationYawHead = buf.readFloat();
        rotationPitch = buf.readFloat();
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(entityId);
        buf.writeFloat(driverYaw);
        buf.writeFloat(driverPitch);
        buf.writeFloat(renderYawOffset);
        buf.writeFloat(rotationYaw);
        buf.writeFloat(rotationYawHead);
        buf.writeFloat(rotationPitch);
    }

    public static class Handler implements IMessageHandler<FlanEntitySyncPacket, IMessage>
    {

        @Override
        public IMessage onMessage(FlanEntitySyncPacket message, MessageContext ctx)
        {
            Entity entity = Minecraft.getMinecraft().theWorld.getEntityByID(message.entityId);
            if (entity instanceof EntityCustomNpc && ((EntityCustomNpc)entity).getFlanDriveableEntity().isPresent())
            {
                EntityCustomNpc npc = (EntityCustomNpc) entity;
                EntityFlanDriveableNPC driveable = npc.getFlanDriveableEntity().get();
                driveable.driver.setLocalYaw(message.driverYaw);
                driveable.driver.setPitch(message.driverPitch);
                driveable.renderYawOffset = npc.renderYawOffset = message.renderYawOffset;
                driveable.rotationYaw = npc.rotationYaw = message.rotationYaw;
                driveable.rotationYawHead = npc.rotationYawHead = message.rotationYawHead;
                driveable.rotationPitch = npc.rotationPitch = message.rotationPitch;
            }
            else
            {
                WolffNPCMod.logger.error("Sync Packet got wrong Entity ID");
            }
            return null;
        }
    }
}

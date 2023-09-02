package com.wolffsmod.network;

import com.wolffsmod.WolffNPCMod;
import com.wolffsmod.customnpc.IMixinEntityNPCInterface;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import noppes.npcs.entity.EntityNPCInterface;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

public class FlanAnimPacket implements IMessage
{
    int entityId;
    EnumAnimPacket type;

    public FlanAnimPacket() {}

    public FlanAnimPacket(int entityId, EnumAnimPacket type)
    {
        this.entityId = entityId;
        this.type = type;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        entityId = buf.readInt();
        type = EnumAnimPacket.values()[buf.readInt()];
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(entityId);
        buf.writeInt(type.ordinal());
    }

    public static class Handler implements IMessageHandler<FlanAnimPacket, IMessage>
    {

        @Override
        public IMessage onMessage(FlanAnimPacket message, MessageContext ctx)
        {
            Entity entity = Minecraft.getMinecraft().theWorld.getEntityByID(message.entityId);
            if (entity instanceof EntityNPCInterface)
            {
                IMixinEntityNPCInterface npc = (IMixinEntityNPCInterface) entity;
                switch(message.type)
                {
                    case FLAN_SHOOT:
                        npc.animateFlanGunShoot();
                        break;
                    case FLAN_RELOAD:
                        npc.animateFlanGunReload();
                        break;
                    case FLAN_MELEE:
                        npc.animateFlanGunMelee();
                        break;
                }
            }
            else
            {
                WolffNPCMod.log.error("Anim Packet got wrong Entity ID");
            }
            return null;
        }
    }
}

package com.wolffsmod.network;

import com.wolffsmod.config.RangeConfig;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;

public class RangeConfigPacket implements IMessage {
    private int combatRange;
    private int viewDistance;
    private int navigationRange;

    public RangeConfigPacket() {
    }

    public RangeConfigPacket(int combatRange, int viewDistance, int navigationRange) {
        this.combatRange = combatRange;
        this.viewDistance = viewDistance;
        this.navigationRange = navigationRange;
    }

    @Override
    public void fromBytes(ByteBuf buffer) {
        combatRange = buffer.readInt();
        viewDistance = buffer.readInt();
        navigationRange = buffer.readInt();
    }

    @Override
    public void toBytes(ByteBuf buffer) {
        buffer.writeInt(combatRange);
        buffer.writeInt(viewDistance);
        buffer.writeInt(navigationRange);
    }

    public static class Handler implements IMessageHandler<RangeConfigPacket, IMessage> {
        @Override
        public IMessage onMessage(RangeConfigPacket message, MessageContext context) {
            RangeConfig.applyServerValues(message.combatRange, message.viewDistance, message.navigationRange);
            return null;
        }
    }
}
